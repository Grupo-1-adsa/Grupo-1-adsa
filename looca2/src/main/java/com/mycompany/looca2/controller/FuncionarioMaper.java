package com.mycompany.looca2.controller;

import com.mycompany.looca2.model.Funcionario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class FuncionarioMaper implements RowMapper<Funcionario>{

    @Override
    public Funcionario mapRow(ResultSet rs, int rowNum) throws SQLException {
        Funcionario funcionario = new Funcionario();

        funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
        funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
        funcionario.setTelefone(rs.getString("telefone"));
        funcionario.setEmail(rs.getString("email"));
        funcionario.setLoginFuncionario(rs.getString("loginFuncionario"));
        funcionario.setSenhaFuncionario(rs.getString("senhaFuncionario"));
        funcionario.setFkResponsavel(rs.getInt("fkResponsavel"));

        return funcionario;
    }
}
