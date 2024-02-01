/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author tanji
 */
public class Order {
    
    private int orderId;
    private String dateCreated;
    private String dateDelivery;
    private String CustomerName;
    private int customerId;
    private double subtotal;
    private String status;
    
    public Order(int orderId, String dateCreated, String dateDelivery, String CustomerName, int customerId, double subtotal, String status)
    {
        this.orderId = orderId;
        this.dateCreated= dateCreated;
        this.dateDelivery = dateDelivery;
        this.CustomerName = CustomerName;
        this.customerId = customerId;
        this.subtotal = subtotal;
        this.status = status;
    }
    
    public Order(){}

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(String dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
        
}
