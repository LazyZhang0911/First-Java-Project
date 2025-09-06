package dao;

import com.codefromLazyz.dao.PlayerDao;
import com.codefromLazyz.model.Player;

import java.util.List;

public class PlayerDaoTest {
    public static void main(String[] args){
        PlayerDao playerDao = new PlayerDao();

        List<Player> allPlayers = playerDao.getAllPlayers();
        if (allPlayers.isEmpty()) {
            System.out.println("没有找到任何玩家。");
            return;
        }else{
            for (Player player : allPlayers) {
                System.out.println(player.toString());
            }
        }

    }
}
