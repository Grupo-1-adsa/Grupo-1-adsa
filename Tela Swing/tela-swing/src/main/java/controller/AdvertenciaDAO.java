package controller;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdvertenciaDAO {
    ConnectionAzure config = new ConnectionAzure();
    JdbcTemplate con = new JdbcTemplate(config.getDataSource());

    public void enviarLeitura(Integer fkFuncionario, String Advertencia) {
        String sql = "insert into [dbo].[Advertencia] (Advertencia,dataAdv,fkFuncionario) values (?,getDate(),?);";

        if (Advertencia == "grave") {
            con.update(sql, "grave", fkFuncionario);
        } else if (Advertencia == "medio") {
            con.update(sql, "medio", fkFuncionario);
        }

    }
}
