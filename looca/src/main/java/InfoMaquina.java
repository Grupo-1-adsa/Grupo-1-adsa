import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;

import java.util.ArrayList;
import java.util.List;

public class InfoMaquina {
    Looca looca = new Looca();

    private String sisInfo = looca.getSistema().getSistemaOperacional();
    private Integer memInfo = Math.toIntExact(looca.getMemoria().getTotal() / 1000000000);
    private List<Disco> discInfo = looca.getGrupoDeDiscos().getDiscos();
    private String procInfo = looca.getProcessador().getNome();
    private String discSerial;
    private Integer discTamanho;


    private List<String> serial = new ArrayList();

    public String getSisInfo() {
        return sisInfo;
    }

    public Integer getMemInfo() {
        return memInfo;
    }

    public String getProcInfo() {
        return procInfo;
    }

    public String getDiscSerial() {
        return discSerial;
    }

    public Integer getDiscTamanho() {
        return discTamanho;
    }

    public void Maquina() {
        for (Disco disco : discInfo) {

            discSerial = (disco.getSerial());
            discTamanho = Math.toIntExact(disco.getTamanho() / 1000000000);
        }

        System.out.println(discTamanho);
        System.out.println(discSerial);
        System.out.println(sisInfo);
        System.out.println(procInfo);
        System.out.println(memInfo);
    }


/*Double usoCpu = looca.getProcessador().getUso();
                Long freqCpu = looca.getProcessador().getFrequencia()/1000000;

                Long memTotal = looca.getMemoria().getTotal()/1000000000;
                Long memUso = looca.getMemoria().getEmUso()/1000000000;



                System.out.println(String.format("%.0f",usoCpu));
                System.out.println(freqCpu);

                System.out.println(memTotal);
                System.out.println(memUso); */
}
