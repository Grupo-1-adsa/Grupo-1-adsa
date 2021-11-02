
package controller;

/**
 *
 * @author ellen.m.almeida
 */

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Leitura;


public class LeituraMaper implements RowMapper<Leitura> {

    @Override
    public Leitura mapRow(ResultSet rs, int rowNum) throws SQLException {

        Leitura leitura = new Leitura();

<<<<<<< HEAD:looca2/src/main/java/com/mycompany/looca2/controller/LeituraMaper.java
        leitura.setIdLeitura(rs.getInt("idLeitura"));
        leitura.setDataHora(rs.getString("dataHora"));
        leitura.setRAM(rs.getInt("RAM"));
        leitura.setFkEquipamento(rs.getInt("fkEquipamento"));
        leitura.setTemperatura(rs.getInt("Temperatura"));
        leitura.setCpuPorcentagem(rs.getInt("cpuPorcentagem"));
        leitura.setCpuFrequencia(rs.getInt("cpuFrequencia"));
        leitura.setTempoAtividade(rs.getString("tempoAtividade"));
=======
       leitura.setIdLeitura(rs.getInt("idLeitura"));
       leitura.setDataHora(rs.getString("dataHora"));
       leitura.setRAM(rs.getInt("RAM"));
       leitura.setFkEquipamento(rs.getInt("fkEquipamento"));
       leitura.setCpuPorcentagem(rs.getInt("cpuUso"));
       leitura.setCpuFrequencia(rs.getInt("cpuFrequencia"));
       leitura.setTempoAtividade(rs.getString("tempoAtividade"));
>>>>>>> 6201e24905b174e112dafbf99753f0754a248e43:Tela Swing back end/tela-procrastinator/src/main/java/controller/LeituraMaper.java

        return leitura;
    }
}