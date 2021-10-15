import org.apache.commons.dbcp2.BasicDataSource;

public class TratamentoDeDados {

    private BasicDataSource dataSource;

    public TratamentoDeDados(){
        dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://procrastinator.database.windows.net:1433;database=procrastinator;user=procrastinator@procrastinator;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        dataSource.setUsername("procrastinator");
        dataSource.setPassword("#Gfgrupo1");

    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }


}
