package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchStatementsExample {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String JDBC_DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";

    static final String JDBC_USER = "HR";
    static final String JDBC_PASS = "hr";

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            Connection connObj = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
            connObj.setAutoCommit(false);

            Statement stmObj = connObj.createStatement();
            stmObj.addBatch("INSERT INTO EMP (EMPNO, ENAME, JOB)  VALUES(1122, 'JOHNNY', 'SECURITY')");
            stmObj.addBatch("INSERT INTO EMP (EMPNO, ENAME, JOB) VALUES (1123, 'KIM', 'SECURITY')");

            int[] recordsAffected = stmObj.executeBatch();
            connObj.commit();
        } catch (Exception sqlException) {
            sqlException.printStackTrace();
        }
    }
}
