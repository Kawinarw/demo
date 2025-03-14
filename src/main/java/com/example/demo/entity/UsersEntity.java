package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UsersEntity {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int user_id;
    private String name;
    private String username;
    private String password;
    private String email;
    @Column(name = "street")
    private String addressStreet;
    @Column(name = "suite")
    private String addressSuite;
    @Column(name = "city")
    private String addressCity;
    @Column(name = "zipcode")
    private String addressZipcode;
    private String geoLat;
    private String geoLng;
    private String phone;
    private String website;
    private String companyName;
    private String companyCatchPhrase;
    private String companyBs;

    public UsersEntity(int user_id, String name, String username, String password, String email, String addressStreet, String addressSuite, String addressCity, String addressZipcode, String geoLat, String geoLng, String phone, String website, String companyName, String companyCatchPhrase, String companyBs) {
        this.user_id = user_id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.addressStreet = addressStreet;
        this.addressSuite = addressSuite;
        this.addressCity = addressCity;
        this.addressZipcode = addressZipcode;
        this.geoLat = geoLat;
        this.geoLng = geoLng;
        this.phone = phone;
        this.website = website;
        this.companyName = companyName;
        this.companyCatchPhrase = companyCatchPhrase;
        this.companyBs = companyBs;
    }

    public UsersEntity() {

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressSuite() {
        return addressSuite;
    }

    public void setAddressSuite(String addressSuite) {
        this.addressSuite = addressSuite;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressZipcode() {
        return addressZipcode;
    }

    public void setAddressZipcode(String addressZipcode) {
        this.addressZipcode = addressZipcode;
    }

    public String getGeoLat() {
        return geoLat;
    }

    public void setGeoLat(String geoLat) {
        this.geoLat = geoLat;
    }

    public String getGeoLng() {
        return geoLng;
    }

    public void setGeoLng(String geoLng) {
        this.geoLng = geoLng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCatchPhrase() {
        return companyCatchPhrase;
    }

    public void setCompanyCatchPhrase(String companyCatchPhrase) {
        this.companyCatchPhrase = companyCatchPhrase;
    }

    public String getCompanyBs() {
        return companyBs;
    }

    public void setCompanyBs(String companyBs) {
        this.companyBs = companyBs;
    }
}
