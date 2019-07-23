package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStmtExample {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String JDBC_DB_URL = "jdbc:oracle:thin:@192.168.3.27:1521:orcl";

    static final String JDBC_USER = "spring";
    static final String JDBC_PASS = "1234";

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            Connection connObj = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
            PreparedStatement prepStatement = connObj.prepareStatement("select ename from emp where empno = ?");
            prepStatement.setString(1, "7369");

            ResultSet resObj = prepStatement.executeQuery();
            while (resObj.next()) {
                System.out.println("이름" + resObj.getString("ename"));
            }
        } catch (Exception sqlException) {
            sqlException.printStackTrace();
        }
    }
}
