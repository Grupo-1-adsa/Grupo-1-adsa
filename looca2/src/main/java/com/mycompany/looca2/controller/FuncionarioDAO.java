
package com.mycompany.looca2.controller;
import com.mycompany.looca2.model.Funcionario;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;


public class FuncionarioDAO {
    Connection config = new Connection();
    JdbcTemplate con = new JdbcTemplate(config.getDataSource());

    public Funcionario query(String inLogin, String inSenha){

        String sql = "select * from [dbo].[Funcionario] where loginFuncionario = ? and senhaFuncionario = ?;";
        try {
            return  con.queryForObject(sql,new Object[]{inLogin, inSenha},new FuncionarioMaper());
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }
    public void loginBanco(String inLogin, String inSenha){
        Funcionario insertStatement = query(inLogin, inSenha);

        if (insertStatement != null){
            System.out.println("deu certo");
            System.out.println(insertStatement.getNomeFuncionario());

        }else {
            System.out.println("deu erro");
        }

    }


}
