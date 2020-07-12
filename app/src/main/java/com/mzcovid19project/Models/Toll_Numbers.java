package com.mzcovid19project.Models;

public class Toll_Numbers {

    String district, name, dest, mobile_number, land_line_number, phone_number;

    public Toll_Numbers() {
    }

    public Toll_Numbers(String district, String name, String dest, String mobile_number, String land_line_number, String phone_number) {
        this.district = district;
        this.name = name;
        this.dest = dest;
        this.mobile_number = mobile_number;
        this.land_line_number = land_line_number;
        this.phone_number = phone_number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getLand_line_number() {
        return land_line_number;
    }

    public void setLand_line_number(String land_line_number) {
        this.land_line_number = land_line_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
