package org.daming.person.pojo.doman;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.daming.person.enums.Gender;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

    private static final long serialVersionUID = 2721776666926171120L;

    private String id;

    private String name;

    private Gender gender;

    private String surname;

    private Date birthDay;

    private String tellPhone;

    private String verificationCode;

    private String province;

    private String city;

    private String area;

    private String address;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Person setId(String id) {
        this.id = id;
        return this;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public Person setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public String getTellPhone() {
        return tellPhone;
    }

    public Person setTellPhone(String tellPhone) {
        this.tellPhone = tellPhone;
        return this;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public Person setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public Person setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Person setCity(String city) {
        this.city = city;
        return this;
    }

    public String getArea() {
        return area;
    }

    public Person setArea(String area) {
        this.area = area;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("gender", gender)
                .append("surname", surname)
                .append("birthDay", birthDay)
                .append("tellPhone", tellPhone)
                .append("verificationCode", verificationCode)
                .append("province", province)
                .append("city", city)
                .append("area", area)
                .append("address", address)
                .toString();
    }
}
