package controller;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import java.util.List;
import logging.Log;
import model.Equipamento;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author ellen.m.almeida
 */
public class EquipamentoDAO {

    ConnectionAzure config = new ConnectionAzure();
    JdbcTemplate con = new JdbcTemplate(config.getDataSource());
    Looca looca = new Looca();

    private Integer fkLeitura;

    public void enviarEquipamento(Integer fkFuncionario) {
        String sisInfo = looca.getSistema().getSistemaOperacional();
        Integer memInfo = Math.toIntExact(looca.getMemoria().getTotal() / 1_000_000_000);
        List<Disco> discInfo = looca.getGrupoDeDiscos().getDiscos();
        String procInfo = looca.getProcessador().getNome();
        String discSerial = "";
        Integer discTamanho = 0;
        JdbcTemplate conn = new JdbcTemplate(config.getDataSource());

        for (Disco disco : discInfo) {
            discSerial = (disco.getSerial());
            discTamanho = Math.toIntExact(disco.getTamanho() / 1000000000);
        }

        String sql = "insert into Equipamento(numeroSerie,CPU,RAM,HD,fkFuncionario,SO,statusEquip,data) values (?,?,?,?,?,?,'ativo',getdate());";

        conn.update(sql, discSerial, procInfo, memInfo, discTamanho, fkFuncionario, sisInfo);

    }

    public Equipamento query(Integer fkFuncionario) {

        String sql = "SELECT TOP 1 * FROM  [dbo].[Equipamento] where fkFuncionario = ? order by idEquipamento desc;";

        try {
            return con.queryForObject(sql, new Object[]{fkFuncionario}, new EquipamentoMaper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }

    public void selectEquipamento(Integer fkFuncionario) {
        Equipamento selectStatement = query(fkFuncionario);

       if (selectStatement != null) {

           Log log = new Log();
           if (selectStatement != null) {

               System.out.println("deu certo, maquina cadastrada");

               fkLeitura = selectStatement.getIdEquipamento();
           } else {
               System.out.println("deu errado");
           }
       }
    }
    public void atualizaStatus(Integer idEquipamento){
        JdbcTemplate connn = new JdbcTemplate(config.getDataSource());

        String sql = "update [dbo].[Equipamento] set statusEquip = 'desativado' where idEquipamento = ?";

        connn.update(sql,idEquipamento);
    }
    public Integer getFkLeitura() {
        return fkLeitura;
    }
}

