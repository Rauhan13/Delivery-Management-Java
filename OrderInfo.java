/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2;

/**
 *
 * @author rauha
 */
class OrderInfo extends CustomerDetails {
    private String orderID;
    private String item;
    private String quantity;
    private Double amount;
    private String paymentMethod;
    private String cash;
    private String expiryDate;
    private String orderTime;
    private String orderDeliveredTime;
    private String orderStatus;
    private String deliveryStaff;
    private String orderFeedback;

    public OrderInfo(String x, String orderID, String Name, String contact, String Address, String item, String quantity, Double amount, String paymentMethod, String cardType, String cardNumber, String cvv, String expiryDate, String orderTime, String orderDeliveredTime, String orderStatus, String deliveryStaff, String orderFeedback) {
        super(Name, contact, Address, x);
        this.orderID = orderID;
        this.item = item;
        this.quantity = quantity;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.cash = cash;
        this.expiryDate = expiryDate;
        this.orderTime = orderTime;
        this.orderDeliveredTime = orderDeliveredTime;
        this.orderStatus = orderStatus;
        this.deliveryStaff = deliveryStaff;
        this.orderFeedback = orderFeedback;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCardNumber() {
        return cash;
    }

    public void setCardNumber(String cardNumber) {
        this.cash = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderDeliveredTime() {
        return orderDeliveredTime;
    }

    public void setOrderDeliveredTime(String orderDeliveredTime) {
        this.orderDeliveredTime = orderDeliveredTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDeliveryStaff() {
        return deliveryStaff;
    }

    public void setDeliveryStaff(String deliveryStaff) {
        this.deliveryStaff = deliveryStaff;
    }

    public String getOrderFeedback() {
        return orderFeedback;
    }

    public void setOrderFeedback(String orderFeedback) {
        this.orderFeedback = orderFeedback;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
    
}
