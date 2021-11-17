
package logging;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Log {
    public  void insercaoLog() throws IOException{
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataHora = data.format(formatarData);
        DateTimeFormatter formatarData1 = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
        String dataHora1 = data.format(formatarData1);
        FileWriter log = new FileWriter("C:\\Users\\erroinsercao" + String.valueOf(dataHora1) + ".txt");
        PrintWriter gravarLog = new PrintWriter(log);
            
        gravarLog.printf("%s\n", dataHora);
        gravarLog.printf("Não foi possível fazer a inserção no SQLserver");
        log.close();
        System.out.println("Arquivo gravado com sucesso!");
    }
    
    public void loginLog() throws IOException{
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataHora = data.format(formatarData);
        DateTimeFormatter formatarData1 = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
        String dataHora1 = data.format(formatarData1);
        FileWriter log = new FileWriter("C:\\Users\\errologin" + String.valueOf(dataHora1) + ".txt");
        PrintWriter gravarLog = new PrintWriter(log);
        
        gravarLog.printf("%s\n", dataHora);
        gravarLog.printf("Não foi possível conectar ao SQLserver");
        log.close();
        System.out.println("Arquivo gravado com sucesso!");
    }
    
    public void slackLog() throws IOException{
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataHora = data.format(formatarData);
        DateTimeFormatter formatarData1 = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
        String dataHora1 = data.format(formatarData1);
        FileWriter log = new FileWriter("C:\\Users\\erroslack" + String.valueOf(dataHora1) + ".txt");
        PrintWriter gravarLog = new PrintWriter(log);
        
        gravarLog.printf("%s\n", dataHora);
        gravarLog.printf("Não foi possível enviar mensagem via slack");
        log.close();
        System.out.println("Arquivo gravado com sucesso!");
    }
    
    public void entrarLogin() throws IOException{
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataHora = data.format(formatarData);
        DateTimeFormatter formatarData1 = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
        String dataHora1 = data.format(formatarData1);
        FileWriter log = new FileWriter("C:\\Users\\HorarioLoginEntrada" + String.valueOf(dataHora1) + ".txt");
        PrintWriter gravarLog = new PrintWriter(log);
        
        gravarLog.printf("Horario de Entrada na Aplicação: %s\n", dataHora);
        log.close();
        System.out.println("Arquivo de Entrada na Aplicação gravado com sucesso!");
    }
    
    public void sairLogin() throws IOException{
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataHora = data.format(formatarData);
        DateTimeFormatter formatarData1 = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
        String dataHora1 = data.format(formatarData1);
        FileWriter log = new FileWriter("C:\\Users\\HorarioLoginSaida" + String.valueOf(dataHora1) + ".txt");
        PrintWriter gravarLog = new PrintWriter(log);
        
        gravarLog.printf("Horario Saída da Aplicação: %s\n", dataHora);
        log.close();
        System.out.println("Arquivo de Saída da Aplicação gravado com sucesso!");
    
    }
}
