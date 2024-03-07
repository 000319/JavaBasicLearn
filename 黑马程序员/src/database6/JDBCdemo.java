package database6;

import java.sql.*;

public class JDBCdemo {
    public static void main(String[] args) {
        Connection con;
        Statement st;
        ResultSet rs;
        String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=school";
        String userName = "sa";
        String userPwd = "LRH20010319";
        String sql = "select * from student";
        try {
            con = DriverManager.getConnection(URL, userName, userPwd);
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String sno = rs.getString(1);
                String sname = rs.getString(2);
                String sage = rs.getString(3);
                String ssex = rs.getString(4);
                String sdept = rs.getString(5);
                System.out.println("\t"+"学号：" + sno + "\t姓名：" + sname + "\t年龄：" + sage
                        + "\t性别：" + ssex + "\t院系：" + sdept);
                System.out.println();
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败！！！");
        }

    }
   /*连接测试
   private static Connection dbConn = null;

    public static void main(String[] args) {
        String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=school";

        try {
            //1.加载驱动
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("加载驱动成功！");
            //2.连接
            dbConn = DriverManager.getConnection(dbURL, "sa", "LRH20010319");
            System.out.println("连接数据库成功！");
            String sql="select * from student";
            PreparedStatement statement=null;
            statement=dbConn.prepareStatement(sql);
            ResultSet res=null;
            res=statement.executeQuery();
            while(res.next()){
                String title=res.getString("name");
                System.out.println(title);
            }
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("连接数据库失败！");
        }

    }*/
}
