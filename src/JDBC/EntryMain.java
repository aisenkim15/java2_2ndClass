package JDBC;

import com.sun.media.jfxmedia.events.PlayerEvent;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EntryMain {
    public static void main(String[] args) {
        SqlSession session = SqlMapClient.getSqlSession();
        String player = session.selectOne("test.getFirstPlayer", 7369);
        System.out.println("Player Name: " + player);

        List<Object> playerList;
        playerList = session.selectList("test.getFirstPlayer2");

    }
}
