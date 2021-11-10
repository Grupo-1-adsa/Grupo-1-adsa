
package model;

/**
 *
 *
 */
public class Funcionario {
    private Integer idFuncionario;
    private String nomeFuncionario;
    private String telefone;
    private String email;
    private String loginFuncionario;
    private String senhaFuncionario;
    private Integer fkResponsavel;

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginFuncionario() {
        return this.loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
    }

    public String getSenhaFuncionario() {
        return this.senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public Integer getFkResponsavel() {
        return this.fkResponsavel;
    }

    public void setFkResponsavel(int fkResponsavel) {
        this.fkResponsavel = fkResponsavel;
    }
}