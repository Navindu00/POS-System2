/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class OrderDto {
    private int orderID;
    private int CustomerID;
    private Date orderDate;
    private double total;
    
    private List<OrderDetailDto> detailDtos;

    public OrderDto() {
    }

    public OrderDto(int orderID, int CustomerID, Date orderDate, double total, List<OrderDetailDto> detailDtos) {
        this.orderID = orderID;
        this.CustomerID = CustomerID;
        this.orderDate = orderDate;
        this.total = total;
        this.detailDtos = detailDtos;
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
     * @return the detailDtos
     */
    public List<OrderDetailDto> getDetailDtos() {
        return detailDtos;
    }

    /**
     * @param detailDtos the detailDtos to set
     */
    public void setDetailDtos(List<OrderDetailDto> detailDtos) {
        this.detailDtos = detailDtos;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderID=" + orderID + ", CustomerID=" + CustomerID + ", orderDate=" + orderDate + ", total=" + total + ", detailDtos=" + detailDtos + '}';
    }
    
    
}
