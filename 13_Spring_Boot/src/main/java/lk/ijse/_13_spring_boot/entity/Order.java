package lk.ijse._13_spring_boot.entity;

import jakarta.persistence.*;
import lk.ijse._13_spring_boot.dto.CustomerDTO;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "`order`")
public class Order {
    @Id
    @Column(name = "order_id")
    private int oid;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @CreationTimestamp
    @Column(name = "order_date_time")
    private Timestamp orderDateTime;
    @Column(name = "order_total",nullable = false)
    private double total;
    @Column(name = "order_discount",nullable = false)
    private double discount;
    @Column(name = "order_subTotal",nullable = false)
    private double subTotal;
    @Column(name = "order_cash",nullable = false)
    private double cash;
    @Column(name = "order_balance",nullable = false)
    private double balance;
    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<OrderDetails> orderDetailsList=new ArrayList<>();

    public Order() {
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Timestamp getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(Timestamp orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Order(int oid, Customer customer, Timestamp orderDateTime, double total, double discount, double subTotal, double cash, double balance, List<OrderDetails> orderDetailsList) {
        this.oid = oid;
        this.customer = customer;
        this.orderDateTime = orderDateTime;
        this.total = total;
        this.discount = discount;
        this.subTotal = subTotal;
        this.cash = cash;
        this.balance = balance;
        this.orderDetailsList = orderDetailsList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", customer=" + customer +
                ", orderDateTime=" + orderDateTime +
                ", total=" + total +
                ", discount=" + discount +
                ", subTotal=" + subTotal +
                ", cash=" + cash +
                ", balance=" + balance +
                ", orderDetailsList=" + orderDetailsList +
                '}';
    }
}
