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

    public UsersEntity toEntity(UserModel userModel) {
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
                userModel.address.getGeo().getGeoLat(),
                userModel.address.getGeo().getGeoLng(),
                userModel.phone,
                userModel.website,
                userModel.company.getName(),
                userModel.company.getCatchPhrase(),
                userModel.company.getBs()
        );
    }
}




