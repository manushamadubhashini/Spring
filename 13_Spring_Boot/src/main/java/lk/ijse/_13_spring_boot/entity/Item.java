package lk.ijse._13_spring_boot.entity;

import jakarta.persistence.*;
import org.hibernate.cfg.CacheSettings;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {
    @Id
    @Column(name = "item_id")
    private int id;
    @Column(name= "item_name")
    private String name;
    @Column(name = "item_desc")
    private String description;
    @Column(name = "item_qty")
    private int qty;
    @Column(name = "item_price")
    private double price;

    @OneToMany(mappedBy = "item",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<OrderDetails> orderDetailsList=new ArrayList<>();

    public Item() {
    }

    public Item(int id, String name, String description, int qty, double price, List<OrderDetails> orderDetailsList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.qty = qty;
        this.price = price;
        this.orderDetailsList = orderDetailsList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", orderDetailsList=" + orderDetailsList +
                '}';
    }
}
