import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class TesteBancoDados {
    InfoMaquina infoMaquina = new InfoMaquina();

    private String numeroSerie = infoMaquina.getDiscSerial();
    private String CPU = infoMaquina.getProcInfo();
    private String so = infoMaquina.getSisInfo();
    private Float ram = Float.valueOf(infoMaquina.getMemInfo());
    private Integer hd = infoMaquina.getDiscTamanho();

    public void enviaMaquina() {
        TratamentoDeDados config = new TratamentoDeDados();

        JdbcTemplate con = new JdbcTemplate(config.getDataSource());
/*
        con.execute("Drop table if exists pokemon");

        StringBuilder createStatement = new StringBuilder();

        createStatement.append("CREATE TABLE pokemon (");
        createStatement.append("ID INT PRIMARY KEY AUTO_INCREMENT,");
        createStatement.append("Nome VARCHAR(45),");
        createStatement.append("Tipo VARCHAR(45)");
        createStatement.append(");");

        con.execute(createStatement.toString());
*/
        StringBuilder insertStatement = new StringBuilder();

        insertStatement.append("insert into Equipamento (numeroSerie, CPU, RAM, HD, SO , fkFuncionario) ");
        insertStatement.append("values");
        insertStatement.append("('"+numeroSerie+"','"+CPU+"',"+ram+","+hd+",'"+so+"',1);");

        con.execute(insertStatement.toString());

        System.out.println(con.queryForList("select * from Equipamento"));
    }
}
