package lk.ijse._13_spring_boot.dto;

import java.util.ArrayList;
import java.util.List;

public class PlaceOrderDTO {
    private int oid;
    private int customerId;
    private List<ItemDTO> itemDTOList=new ArrayList<>();
    private double Total;
    private double discount;
    private double subTotal;
    private double cash;
    private double balance;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(int oid, int customerId, List<ItemDTO> itemDTOList, double total, double discount, double subTotal, double cash, double balance) {
        this.oid = oid;
        this.customerId = customerId;
        this.itemDTOList = itemDTOList;
        Total = total;
        this.discount = discount;
        this.subTotal = subTotal;
        this.cash = cash;
        this.balance = balance;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<ItemDTO> getItemDTOList() {
        return itemDTOList;
    }

    public void setItemDTOList(List<ItemDTO> itemDTOList) {
        this.itemDTOList = itemDTOList;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
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

    @Override
    public String toString() {
        return "PlaceOrderDTO{" +
                "oid=" + oid +
                ", customerId=" + customerId +
                ", itemDTOList=" + itemDTOList +
                ", Total=" + Total +
                ", discount=" + discount +
                ", subTotal=" + subTotal +
                ", cash=" + cash +
                ", balance=" + balance +
                '}';
    }
}
