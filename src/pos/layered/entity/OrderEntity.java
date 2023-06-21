/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.entity;

import java.util.Date;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class OrderEntity {
    private int orderID;
    private Date orderDate;
    private double total;
    private int CustomerID;

    public OrderEntity() {
    }

    public OrderEntity(int orderID, Date orderDate, double total, int CustomerID) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.total = total;
        this.CustomerID = CustomerID;
    }

    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the CustomerID
     */
    public int getCustomerID() {
        return CustomerID;
    }

    /**
     * @param CustomerID the CustomerID to set
     */
    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    @Override
    public String toString() {
        return "OrderEntity{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", total=" + total + ", CustomerID=" + CustomerID + '}';
    }
    
    
}
