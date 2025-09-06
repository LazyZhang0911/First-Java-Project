package com.codefromLazyz.model;

public class Player {
    private int id;
    private String name;
    private String role;
    private double balance;
    private double rating;

    public Player() {
    }

    public Player(int id, String name, String role, double balance, double rating) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.balance = balance;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("Player{id=%d, name='%s', role='%s', balance=%.2f, rating=%.2f}", id, name, role, balance, rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                       // 自己和自己肯定相等
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return this.id == player.id;                      // 只用唯一标识 id 判断
    }
}
