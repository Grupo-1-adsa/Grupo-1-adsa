package controller;

import com.github.britooo.looca.api.core.Looca;
import org.springframework.jdbc.core.JdbcTemplate;

public class AdvertenciaDAO {
    ConnectionBD config = new ConnectionBD();
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
