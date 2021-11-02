package com.mycompany.looca2.controller;

import com.mycompany.looca2.model.Equipamento;
import com.mycompany.looca2.model.Leitura;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class LeituraMaper implements RowMapper<Leitura> {

    @Override
    public Leitura mapRow(ResultSet rs, int rowNum) throws SQLException {

        Leitura leitura = new Leitura();

        leitura.setIdLeitura(rs.getInt("idLeitura"));
        leitura.setDataHora(rs.getString("dataHora"));
        leitura.setRAM(rs.getInt("RAM"));
        leitura.setFkEquipamento(rs.getInt("fkEquipamento"));
        leitura.setTemperatura(rs.getInt("Temperatura"));
        leitura.setCpuPorcentagem(rs.getInt("cpuPorcentagem"));
        leitura.setCpuFrequencia(rs.getInt("cpuFrequencia"));
        leitura.setTempoAtividade(rs.getString("tempoAtividade"));

        return leitura;
    }
}

