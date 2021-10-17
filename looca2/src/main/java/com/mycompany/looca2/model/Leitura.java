package com.mycompany.looca2.model;

public class Leitura {
    private Integer idLeitura;
    private String dataHora;
    private Integer RAM;
    private Integer fkEquipamento;
    private Integer Temperatura;
    private Integer cpuPorcentagem;
    private Integer cpuFrequencia;

    public Integer getIdLeitura() {
        return idLeitura;
    }

    public void setIdLeitura(Integer idLeitura) {
        this.idLeitura = idLeitura;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getFkEquipamento() {
        return fkEquipamento;
    }

    public void setFkEquipamento(Integer fkEquipamento) {
        this.fkEquipamento = fkEquipamento;
    }

    public Integer getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        Temperatura = temperatura;
    }

    public Integer getCpuPorcentagem() {
        return cpuPorcentagem;
    }

    public void setCpuPorcentagem(Integer cpuPorcentagem) {
        this.cpuPorcentagem = cpuPorcentagem;
    }

    public Integer getCpuFrequencia() {
        return cpuFrequencia;
    }

    public void setCpuFrequencia(Integer cpuFrequencia) {
        this.cpuFrequencia = cpuFrequencia;
    }
}
