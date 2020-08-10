import java.sql.*;

public class Demo4 {
    public static void main(String[] args)  {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
//连接
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
//            String sql = "insert  into account values (null , '赵六', 1000)";
//            String sql = "Update account from balance = 200 where id = 3";
//            String sql = "delete from account where id = 4";
            String sql = "select *from account";
            stmt = conn.createStatement();//stmt对象
            rs = stmt.executeQuery(sql);//结果集对象 ，封装查询的结果
            rs.next();
            int id = rs.getInt(1);
            String name =  rs.getString(2);
            int balance = rs.getInt(3);
            System.out.println("id"+id+"name"+name+"balabce"+balance);
        }catch ( ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            // 释放资源

            if (stmt != null){
                try {
                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (rs != null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }







    }
}

