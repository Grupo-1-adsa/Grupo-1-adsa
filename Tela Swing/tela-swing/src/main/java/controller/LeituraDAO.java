package controller;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import model.Leitura;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LeituraDAO {

        ConnectionAzure config = new ConnectionAzure();
        JdbcTemplate con = new JdbcTemplate(config.getDataSource());


        public void enviarLeitura(Integer fkEquipamento) {
            Looca looca = new Looca();

            JdbcTemplate conn = new JdbcTemplate(config.getDataSource());
            Integer ramUso = Math.toIntExact(looca.getMemoria().getEmUso() /  1000000000);
            Double cpuUso = looca.getProcessador().getUso()/100000;
            Integer cpuFrequencia = Math.toIntExact(looca.getProcessador().getFrequencia()/1000000);
            Long tempAtividade = looca.getSistema().getTempoDeAtividade();

            Integer usoHd = 0;
            List<Disco> discInfo = looca.getGrupoDeDiscos().getDiscos();

            for (Disco disco : discInfo) {
                //usoHd = Math.toIntExact(disco. / 1000000000);
            }


            String sql = "insert into [dbo].[Leitura](dataHora,RAM,fkEquipamento,cpuFrequencia,tempoAtividade,cpuUso) values (getDate(),?,?,?,?,?)";

            conn.update(sql, ramUso, fkEquipamento, cpuFrequencia, tempAtividade, cpuUso);

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