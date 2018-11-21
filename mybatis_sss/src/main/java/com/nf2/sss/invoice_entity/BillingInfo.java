package com.nf2.sss.invoice_entity;
/*账单*/
public class BillingInfo {
    private int billingInfoId;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    public int getBillingInfoId() {
        return billingInfoId;
    }

    public void setBillingInfoId(int billingInfoId) {
        this.billingInfoId = billingInfoId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "BillingInfo{" +
                "billingInfoId=" + billingInfoId +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
