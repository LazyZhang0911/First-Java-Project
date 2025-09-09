package dao;

import com.codefromLazyz.dao.PlayerDao;
import com.codefromLazyz.model.Player;

import java.util.List;

public class PlayerDaoTest {
    public static void main(String[] args){
        PlayerDao playerDao = new PlayerDao();

        // 测试按 ID 查询玩家
        int testId = 45; // 替换为实际存在的玩家 ID
        Player playerById = playerDao.getPlayerById(testId);
        if (playerById != null) {
            System.out.println("找到玩家: " + playerById.toString());
        } else {
            System.out.println("未找到 ID 为 " + testId + " 的玩家。");
        }

        // 测试查询所有玩家
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
