package org.daming.person.pojo.doman;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.daming.person.enums.Gender;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value="Person",description="个人信息")
public class Person implements Serializable {

    private static final long serialVersionUID = 2721776666926171120L;

    @ApiModelProperty(name = "id",value = "ID",example = "1")
    private String id;

    @ApiModelProperty(name = "name",value = "名字",example = "daming")
    private String name;

    @ApiModelProperty(name = "gender",value = "性别",example = "F")
    private Gender gender;

    @ApiModelProperty(name = "surname",value = "姓氏",example = "明")
    private String surname;

    @ApiModelProperty(name = "birthDay",value = "生日")
    private Date birthDay;

    @ApiModelProperty(name = "tellPhone",value = "手机号码")
    private String tellPhone;

    @ApiModelProperty(name = "province",value = "省份")
    private String province;

    @ApiModelProperty(name = "city",value = "城市")
    private String city;

    @ApiModelProperty(name = "area",value = "区县")
    private String area;

    @ApiModelProperty(name = "address",value = "地址")
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
                .append("province", province)
                .append("city", city)
                .append("area", area)
                .append("address", address)
                .toString();
    }
}
