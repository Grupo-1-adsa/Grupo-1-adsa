package com.mycompany.looca2.controller;

import com.mycompany.looca2.model.Equipamento;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EquipamentoMaper implements RowMapper<Equipamento> {

    @Override
    public Equipamento mapRow(ResultSet rs, int rowNum) throws SQLException {
        Equipamento equipamento = new Equipamento();

        equipamento.setIdEquipamento(rs.getInt("idEquipamento"));
        equipamento.setNumeroSerie(rs.getString("numeroSerie"));
        equipamento.setCPU(rs.getString("CPU"));
        equipamento.setRAM(rs.getInt("RAM"));
        equipamento.setHD(rs.getInt("HD"));
        equipamento.setFkFuncionario(rs.getString("fkFuncionario"));
        equipamento.setSO(rs.getString("SO"));

        return equipamento;
    }
}
