import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class Demo2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Manager");
        Connection conn = DriverManager.getConnection("", "", "");
        String sql = "insect into account values (null, '王五'，500)";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        if (count > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
        stmt.close();
        conn.close();
    }

}
