package util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//操作数据库
public class JbdcUtil {
    private static String driverName;
    private static String url;
    private static String username;
    private static String password;

    //注册驱动
    static {
        //初始化连接信息
        Properties properties = new Properties();
        //try catch语句检测错误
        //读取配置文件
        url = "jdbc:mysql://123.57.141.212:3306/Java";
        username = "root";
        password = "root";

        //1.注册驱动
    }

    //开始连接，根据config进行连接，目前有驱动了
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public Connection getConnection() {
        //与远程数据库进行连接需要进行配置
        try {
            //数据在开始的时候进行了读取
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("连接成功");
            return connection;
        } catch (SQLException e) {
            //SQL的错误对象
            e.printStackTrace();
            return null;
        }
    }
}
