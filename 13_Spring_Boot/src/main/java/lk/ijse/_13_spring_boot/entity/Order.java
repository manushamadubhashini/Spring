package lk.ijse._13_spring_boot.entity;

import jakarta.persistence.*;
import lk.ijse._13_spring_boot.dto.CustomerDTO;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    private int oid;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    private Date date;

    public Order() {
    }

    public Order(int oid, Customer customer, Date date) {
        this.oid = oid;
        this.customer = customer;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", customer=" + customer +
                ", date=" + date +
                '}';
    }
}
