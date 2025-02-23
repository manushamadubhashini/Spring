package lk.ijse._13_spring_boot.dto;

import lombok.Data;

import java.util.Date;

public class OrderDTO {
    private int oid;
    private int cid;
    private Date date;

    public OrderDTO() {
    }

    public OrderDTO(int oid, int cid, Date date) {
        this.oid = oid;
        this.cid = cid;
        this.date = date;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "oid=" + oid +
                ", cid=" + cid +
                ", date=" + date +
                '}';
    }
}
