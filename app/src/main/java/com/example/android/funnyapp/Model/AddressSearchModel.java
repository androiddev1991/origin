package com.example.android.funnyapp.Model;

/**
 * Created by noavaran on 9/22/2016.
 */
public class AddressSearchModel {
    String  name,Regions,Address,Telephone,WorkingHours;

    public AddressSearchModel() {
    }

    public AddressSearchModel(String name, String regions, String address, String telephone, String workingHours) {
        this.name = name;
        Regions = regions;
        Address = address;
        Telephone = telephone;
        WorkingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(String workingHours) {
        WorkingHours = workingHours;
    }
}
