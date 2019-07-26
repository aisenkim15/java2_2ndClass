package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AutoCompileExample {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String JDBC_DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";

    static final String JDBC_USER = "HR";
    static final String JDBC_PASS = "hr";

    public static void main(String[] args) {
        Connection connObj = null;

        try{
            Class.forName(JDBC_DRIVER);
            connObj = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);

            connObj.setAutoCommit(false);
            Statement stmtObj = connObj.createStatement();

            String correctQUery = "INSERT INTO EMP (EMPNO, ENAME, JOB ) VALUES (9898, 'JAMES', 'BOSS')";
            stmtObj.executeUpdate(correctQUery);
            connObj.commit();
        }catch(Exception sqlException){
            try {
                connObj.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            sqlException.printStackTrace();
        }
    }
}
