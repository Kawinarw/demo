package com.example.demo.model;

import com.example.demo.entity.UsersEntity;
import jakarta.persistence.Entity;

public class UserModel {
    private int user_id;
    private String name;
    private String username;
    private String password;
    private String email;
    private AddressModel address;
    private String phone;
    private String website;
    private CompanyModel company;

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

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
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

    public CompanyModel getCompany() {
        return company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }

    public UsersEntity toEntity(UserModel userModel) {
        CompanyModel companyModel;
        if (userModel.company != null) {
            companyModel = new CompanyModel(userModel.company.getName(),userModel.company.getCatchPhrase(),userModel.company.getBs());
        } else {
            companyModel = new CompanyModel(null,null,null);
        }
        return new UsersEntity(
                userModel.user_id,
                userModel.name,
                userModel.username,
                userModel.password,
                userModel.email,
                userModel.address.getStreet(),
                userModel.address.getSuite(),
                userModel.address.getCity(),
                userModel.address.getZipcode(),
                userModel.address.getGeo().getLat(),
                userModel.address.getGeo().getLng(),
                userModel.phone,
                userModel.website,
                companyModel.getName(),
                companyModel.getCatchPhrase(),
                companyModel.getBs()
        );
    }

}




