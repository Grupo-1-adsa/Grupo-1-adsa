
package controller;



import model.Funcionario;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;


public class FuncionarioDAO {
    ConnectionBD config = new ConnectionBD();
    JdbcTemplate con = new JdbcTemplate(config.getDataSource());
    private Boolean verificarAcesso; 
    private Integer fkFuncionario; 
    

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
            verificarAcesso = true; 
            System.out.println("deu certo");
            System.out.println(insertStatement.getNomeFuncionario());
            fkFuncionario = insertStatement.getIdFuncionario();

        }else {
                verificarAcesso = false; 
            System.out.println("deu erro");
        }

    }
    
    public Boolean verificaLogin(){
        return this.verificarAcesso; 
    }
    
    public Integer getFkFuncionario(){
        return this.fkFuncionario; 
    }


}