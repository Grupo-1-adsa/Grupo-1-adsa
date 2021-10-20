
package model;

/**
 *
 * @author ellen.m.almeida
 */
public class Equipamento {
      private Integer idEquipamento;
    private String numeroSerie;
    private String CPU;
    private Integer RAM;
    private Integer HD;
    private String fkFuncionario;
    private String SO;

    public Integer getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Integer idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getHD() {
        return HD;
    }

    public void setHD(Integer HD) {
        this.HD = HD;
    }

    public String getFkFuncionario() {
        return fkFuncionario;
    }

    public void setFkFuncionario(String fkFuncionario) {
        this.fkFuncionario = fkFuncionario;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
}
