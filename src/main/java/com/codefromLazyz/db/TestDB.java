package com.codefromLazyz.db;

import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        try (Connection conn = DBUtil.getConnection()) {
            if (conn != null) {
                System.out.println("✅ 成功连接到 SQLite 数据库！");
            } else {
                System.out.println("❌ 连接失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
