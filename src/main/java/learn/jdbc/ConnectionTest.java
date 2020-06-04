package learn.jdbc;

import java.sql.*;

public class ConnectionTest {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection conn= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/javalearn?serverTimezone=UTC",
                    "root",
                    "247266");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from img_table");
            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getInt(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
