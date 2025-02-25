package lk.ijse._13_spring_boot.entity;

import jakarta.persistence.*;
import lk.ijse._13_spring_boot.embedded.OrderDetailPK;

@Entity(name = "order_detail")
public class OrderDetails {
    @EmbeddedId
    private OrderDetailPK orderDetailPK;
    @Column(name = "order_qty",nullable = false)
    private int qty;
    @ManyToOne
    @JoinColumn(name = "order_id",insertable = false, updatable = false)
    private Order order;
    @ManyToOne
    @JoinColumn(name = "item_id",insertable = false,updatable = false)
    private Item item;

    public OrderDetails() {
    }

    public OrderDetails(OrderDetailPK orderDetailPK, int qty, Order order, Item item) {
        this.orderDetailPK = orderDetailPK;
        this.qty = qty;
        this.order = order;
        this.item = item;
    }

    public OrderDetailPK getOrderDetailPK() {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderDetailPK=" + orderDetailPK +
                ", qty=" + qty +
                ", order=" + order +
                ", item=" + item +
                '}';
    }
}
