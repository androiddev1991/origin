package com.example.android.funnyapp.Model;

/**
 * Created by noavaran on 11/16/2016.
 */
public class CLinicModel {
    String firstname,id,lastname,address,nezamNumber,clinicid,imageurl,lat,longt,experties,subspetiality;

    public CLinicModel() {
    }

    public CLinicModel(String firstname, String id, String lastname, String address, String nezamNumber, String clinicid, String imageurl, String lat, String longt, String experties, String subspetiality) {
        this.firstname = firstname;
        this.id = id;
        this.lastname = lastname;
        this.address = address;
        this.nezamNumber = nezamNumber;
        this.clinicid = clinicid;
        this.imageurl = imageurl;
        this.lat=lat;
        this.longt=longt;
        this.subspetiality=subspetiality;
        this.experties=experties;
    }

    public String getExperties() {
        return experties;
    }

    public void setExperties(String experties) {
        this.experties = experties;
    }

    public String getSubspetiality() {
        return subspetiality;
    }

    public void setSubspetiality(String subspetiality) {
        this.subspetiality = subspetiality;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongt() {
        return longt;
    }

    public void setLongt(String longt) {
        this.longt = longt;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNezamNumber() {
        return nezamNumber;
    }

    public void setNezamNumber(String nezamNumber) {
        this.nezamNumber = nezamNumber;
    }

    public String getClinicid() {
        return clinicid;
    }

    public void setClinicid(String clinicid) {
        this.clinicid = clinicid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
