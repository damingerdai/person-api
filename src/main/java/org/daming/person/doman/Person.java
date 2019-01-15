package org.daming.person.doman;

import org.daming.person.enums.Gender;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

    private static final long serialVersionUID = 2721776666926171120L;


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
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", birthDay=").append(birthDay);
        sb.append(", tellPhone='").append(tellPhone).append('\'');
        sb.append(", verificationCode='").append(verificationCode).append('\'');
        sb.append(", province='").append(province).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", area='").append(area).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
