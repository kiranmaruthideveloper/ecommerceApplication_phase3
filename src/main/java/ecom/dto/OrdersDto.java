package ecom.dto;

import ecom.model.Checkout;
import ecom.model.Product;

import java.util.List;

public class OrdersDto {
    private String orderId;
    private String userId;
    private List<Product> products;
    private String billerFirstName;
    private String billerLastName;
    private String address1;
    private String address2;
    private String pincode;
    private String city;
    private String phone;
    private String emailAddress;
    private String additionalInformation;
    private double totalBill;
    private String userFullName;


    public OrdersDto(Checkout checkout , List<Product> products, String userFullName) {
        this.orderId = checkout.getOrderId();
        this.userId = checkout.getUserId();
        this.billerFirstName = checkout.getBillerFirstName();
        this.billerLastName = checkout.getBillerLastName();
        this.address1 = checkout.getAddress1();
        this.address2 = checkout.getAddress2();
        this.pincode = checkout.getPincode();
        this.city = checkout.getCity();
        this.phone = checkout.getPhone();
        this.emailAddress = checkout.getEmailAddress();
        this.additionalInformation = checkout.getAdditionalInformation();
        this.totalBill = checkout.getTotalBill();
        this.products = products;
        this.userFullName = userFullName;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getBillerFirstName() {
        return billerFirstName;
    }

    public void setBillerFirstName(String billerFirstName) {
        this.billerFirstName = billerFirstName;
    }

    public String getBillerLastName() {
        return billerLastName;
    }

    public void setBillerLastName(String billerLastName) {
        this.billerLastName = billerLastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}
