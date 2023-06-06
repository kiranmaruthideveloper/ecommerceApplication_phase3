package ecom.model;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name="checkout")
public class Checkout {
    @Id
    private String orderId;
    private String userId;
    private String productIds;
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
    @UpdateTimestamp
    private Date dateOfOrder;

    public Checkout() {

    }

    @Override
    public String toString() {
        return "Checkout{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", productIds='" + productIds + '\'' +
                ", billerFirstName='" + billerFirstName + '\'' +
                ", billerLastName='" + billerLastName + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", totalBill=" + totalBill +
                ", dateOfOrder=" + dateOfOrder +
                '}';
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

    public String getProductIds() {
        return productIds;
    }

    public void setProductIds(String productIds) {
        this.productIds = productIds;
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

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
}
