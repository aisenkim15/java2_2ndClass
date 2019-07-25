package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStmtExample {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String JDBC_DB_URL = "jdbc:oracle:thin:@LOCALHOST:1521:ORCL";

    static final String JDBC_USER = "HR";
    static final String JDBC_PASS = "hr";

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            Connection connObj = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
            PreparedStatement prepStatement = connObj.prepareStatement("select ename, job from emp where empno = ?");
            prepStatement.setString(1, "1122");

            ResultSet resObj = prepStatement.executeQuery();
            while (resObj.next()) {
                System.out.println("이름: " + resObj.getString("ename"));
                System.out.println("직업: " + resObj.getString("job"));
            }
        } catch (Exception sqlException) {
            sqlException.printStackTrace();
        }
    }
}
