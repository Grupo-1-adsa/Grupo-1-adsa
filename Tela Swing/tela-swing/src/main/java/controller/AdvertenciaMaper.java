package controller;

import model.Advertencia;
import model.Equipamento;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdvertenciaMaper implements RowMapper<Advertencia> {

    @Override
    public Advertencia mapRow(ResultSet rs, int rowNum) throws SQLException {
        Advertencia advertencia = new Advertencia();
        advertencia.setIdAdvertencia(rs.getInt("idAdvertencia"));
        advertencia.setAdvertencia(rs.getString("Advertencia"));
        advertencia.setStatusAdv(rs.getString("StatusAdv"));
        advertencia.setAtividadeAdv(rs.getString("AtividadeAdv"));
        advertencia.setDataADV(rs.getString("dataADV"));
        advertencia.setFkFuncionario(rs.getInt("fkAdvertencia"));

        return advertencia;
    }
}
