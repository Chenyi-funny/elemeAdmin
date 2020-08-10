import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Manager");
        Connection conn = DriverManager.getConnection("", "", "");
        String sql = "update account set balance= 20000 where id = 3";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
        stmt.close();
        conn.close();
    }
}
