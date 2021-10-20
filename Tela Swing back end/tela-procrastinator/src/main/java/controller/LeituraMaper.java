
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

       leitura.setIdLeitura(rs.getInt("idLeitura"));
       leitura.setDataHora(rs.getString("dataHora"));
       leitura.setRAM(rs.getInt("RAM"));
       leitura.setFkEquipamento(rs.getInt("fkEquipamento"));
       leitura.setCpuPorcentagem(rs.getInt("cpuUso"));
       leitura.setCpuFrequencia(rs.getInt("cpuFrequencia"));
       leitura.setTempoAtividade(rs.getString("tempoAtividade"));

        return leitura;
    }
}