/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.entity;

/**
 *
 * @author navindudulanjaya <your.name at your.org>
 */
public class OrderDetailEntity {
    private int id;
    private double unitPrice;
    private int quantity;
    private int orderID;
    private int itemID;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(int id, double unitPrice, int quantity, int orderID, int itemID) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.orderID = orderID;
        this.itemID = itemID;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" + "id=" + id + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", orderID=" + orderID + ", itemID=" + itemID + '}';
    }
    

    
}
