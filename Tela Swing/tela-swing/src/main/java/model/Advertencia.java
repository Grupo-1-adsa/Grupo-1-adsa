package model;

public class Advertencia {
    private Integer idAdvertencia;
    private String Advertencia;
    private String StatusAdv;
    private String AtividadeAdv;
    private String dataADV;
    private Integer fkFuncionario;

    public Integer getIdAdvertencia() {
        return idAdvertencia;
    }

    public void setIdAdvertencia(Integer idAdvertencia) {
        this.idAdvertencia = idAdvertencia;
    }

    public String getAdvertencia() {
        return Advertencia;
    }

    public void setAdvertencia(String advertencia) {
        Advertencia = advertencia;
    }

    public String getStatusAdv() {
        return StatusAdv;
    }

    public void setStatusAdv(String statusAdv) {
        StatusAdv = statusAdv;
    }

    public String getAtividadeAdv() {
        return AtividadeAdv;
    }

    public void setAtividadeAdv(String atividadeAdv) {
        AtividadeAdv = atividadeAdv;
    }

    public String getDataADV() {
        return dataADV;
    }

    public void setDataADV(String dataADV) {
        this.dataADV = dataADV;
    }

    public Integer getFkFuncionario() {
        return fkFuncionario;
    }

    public void setFkFuncionario(Integer fkFuncionario) {
        this.fkFuncionario = fkFuncionario;
    }
}
