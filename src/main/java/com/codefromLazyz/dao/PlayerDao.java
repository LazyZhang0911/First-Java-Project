package com.codefromLazyz.dao;

import com.codefromLazyz.db.DBUtil;
import com.codefromLazyz.model.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao {

    // 1. 添加玩家
    public boolean addPlayer(Player player) {
        return false; // 待写
    }

    // 2. 删除玩家
    public boolean deletePlayerById(int id) {
        return false; // 待写
    }

    // 3. 修改玩家
    public boolean updatePlayer(Player player) {
        return false; // 待写
    }

    // 4. 按 ID 查询玩家
    public Player getPlayerById(int id) {
        String sql = "SELECT * FROM players WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Player(rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("role"),
                            rs.getDouble("balance"),
                            rs.getDouble("rating")); // 找到就返回
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null; // 没找到就返回 null
    }


    // 5. 查询所有玩家
    public List<Player> getAllPlayers() {
        List<Player> players = new ArrayList<>(); // 创建返回列表
        String sql = "SELECT * FROM players";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Player player = new Player(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("role"),
                        rs.getDouble("balance"),
                        rs.getDouble("rating"));
                players.add(player); // 添加到列表
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return players; // 返回结果
    }

}

