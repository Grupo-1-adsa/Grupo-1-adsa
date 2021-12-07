package controller;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.Volume;
import model.Leitura;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LeituraDAO {

        ConnectionAzure configAzure = new ConnectionAzure();


        JdbcTemplate con = new JdbcTemplate(configAzure.getDataSource());



        public void enviarLeitura(Integer fkEquipamento) {
            Looca looca = new Looca();

            JdbcTemplate conn = new JdbcTemplate(configAzure.getDataSource());
            Integer ramUso = Math.toIntExact(looca.getMemoria().getEmUso() /  1000000000);
            Double cpuUso = looca.getProcessador().getUso();
            Integer cpuFrequencia = Math.toIntExact(looca.getProcessador().getFrequencia()/1000000);
            Long tempAtividade = looca.getSistema().getTempoDeAtividade();

            Integer usoHd = 0;
            List<Volume> discInfo = looca.getGrupoDeDiscos().getVolumes();

            for (Volume disco : discInfo) {
                usoHd = Math.toIntExact(disco.getDisponivel() / 1000000000);
            }


            String sqlServer = "insert into [dbo].[Leitura](dataHora,RAM,fkEquipamento,cpuFrequencia,tempoAtividade,cpuUso,usoHd) values (getDate(),?,?,?,?,?,?);";


            conn.update(sqlServer, ramUso, fkEquipamento, cpuFrequencia, tempAtividade, cpuUso, usoHd);

        }

        public Leitura query(Integer fkEquipamento) {

            String sql = "SELECT TOP 1 * FROM  [dbo].[Leitura] where fkEquipamento = ? order by idLeitura desc;";

            try {
                return con.queryForObject(sql, new Object[]{fkEquipamento}, new LeituraMaper());
            } catch (EmptyResultDataAccessException e) {
                return null;
            }

        }

        public void selectEquipamento(Integer fkLeitura) {
            Leitura selectStatement = query(fkLeitura);
            if (selectStatement != null) {
                System.out.println("deu certo");

            } else {
                System.out.println("deu errado");
            }

        }


    }