package learn.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class C3P0Test {
    public static void main(String[] args) throws Exception{
        ComboPooledDataSource ds=new ComboPooledDataSource();
        ds.setDriverClass("com.mysql.cj.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/javalearn?serverTimezone=UTC");
        ds.setUser("root");
        ds.setPassword("247266");
        ds.setMaxPoolSize(40);
        ds.setMinPoolSize(2);
        ds.setInitialPoolSize(10);
        ds.setMaxStatements(180);

        Connection conn=ds.getConnection();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select * from img_table");
        while (rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getInt(2));
        }
    }
}
