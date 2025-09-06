package model;

import com.codefromLazyz.model.Order;
import com.codefromLazyz.model.Player;
import com.codefromLazyz.model.Transaction;

public class ModelTest {
    public static void main(String[] args) {
        // Test Player class
        Player player = new Player(1, "Alice", "Warrior", 100.0, 4.5);
        Player anotherPlayer = new Player(2, "Bob", "Mage", 150.0, 4.8);
        System.out.println("Are players equal? " + player.equals(anotherPlayer));
        System.out.println("Player ID: " + player.getId());
        System.out.println("Player Name: " + player.getName());
        System.out.println("Player Role: " + player.getRole());
        System.out.println("Player Balance: " + player.getBalance());
        System.out.println("Player Rating: " + player.getRating());
        System.out.println("Player: " + player.toString());
        System.out.println("Another Player: " + anotherPlayer.toString());
        System.out.println("\n");

        // Test Order class
        Order order = new Order(1, 1, 2, "GameA", 2.0, 50.0, "Pending");
        Order anotherOrder = new Order(1, 1, 2, "GameA", 2.0, 50.0, "Pending");
        System.out.println("Are orders equal? " + order.equals(anotherOrder));
        System.out.println("Order ID: " + order.getId());
        System.out.println("Order Player ID: " + order.getPlayerId());
        System.out.println("Order Companion ID: " + order.getCompanionId());
        System.out.println("Order Game: " + order.getGame());
        System.out.println("Order Hour: " + order.getHour());
        System.out.println("Order Price: " + order.getPrice());
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Order: " + order.toString());
        System.out.println("Another Order: " + anotherOrder.toString());
        System.out.println("\n");

        // Test Transaction class
        Transaction transaction = new Transaction(1, 1, 100.0, "Deposit", "2024-06-01 10:00:00");
        Transaction anotherTransaction = new Transaction(2, 1, 50.0, "Withdrawal", "2024-06-02 11:00:00");
        System.out.println("Are transactions equal? " + transaction.equals(anotherTransaction));
        System.out.println("Transaction ID: " + transaction.getId());
        System.out.println("Transaction Player ID: " + transaction.getPlayerId());
        System.out.println("Transaction Amount: " + transaction.getAmount());
        System.out.println("Transaction Type: " + transaction.getType());
        System.out.println("Transaction Timestamp: " + transaction.getTimestamp());
        System.out.println("Transaction: " + transaction.toString());
        System.out.println("Another Transaction: " + anotherTransaction.toString());
    }
}
