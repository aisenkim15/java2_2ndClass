//package JDBC;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.Reader;
//
//public class SqlMapClient {
//    private static SqlSession _session=null;
//
//    static{
//        try {
//            String resource = "JDBC/config/myBatisConfig.xml";
//            Reader reader = Resources.getResourceAsReader(resource);
//            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
//            _session = sqlMapper.openSession();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static SqlSession getSqlSession() {
//        return _session;
//    }
//}
