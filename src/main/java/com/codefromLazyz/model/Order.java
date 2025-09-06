package com.codefromLazyz.model;

public class Order {

    private int id;
    private int playerId;
    private int companionId;
    private String game;
    private double hour;
    private double price;
    private String status;

    public Order() {
    }

    public Order(int id, int playerId, int companionId, String game, double hour, double price, String status) {
        this.id = id;
        this.playerId = playerId;
        this.companionId = companionId;
        this.game = game;
        this.hour = hour;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getCompanionId() {
        return companionId;
    }

    public void setCompanionId(int companionId) {
        this.companionId = companionId;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", playerId=" + playerId +
                ", companionId=" + companionId +
                ", game='" + game + '\'' +
                ", hour=" + hour +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id;
    }
}
