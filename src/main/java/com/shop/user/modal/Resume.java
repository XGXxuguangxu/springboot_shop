package com.shop.user.modal;

import java.io.Serializable;

/**
 *  简历表
 */
public class Resume implements Serializable {
    private Integer id;      //自增ID
    private String name;     //姓名
    private String head;     //头像地址
    private String sex;      //性别
    private Integer age;     //年龄
    private String ethnic;   //民族
    private String phone;    //联系方式
    private String nativePlace;//籍贯
    private String marry;    //婚否
    private String college;  //毕业学院
    private String idNumber; //身份证号
    private String major;    //专业
    private String culture;  //文化程度
    private String skillName;//技术职称
    private String language; //语言能力
    private String strong;   //特长（500字内）
    private String ageLimit; //工作年限
    private String introduce;//个人介绍
    private String address;  //地址
    private String masterSkill;//掌握技能
    private Integer ranking; //简历排名
    private Integer state;   //简历状态(1.正常2.异常)

    public Resume(Integer id, String name, String head, String sex, Integer age, String ethnic, String phone, String nativePlace, String marry, String college, String idNumber, String major, String culture, String skillName, String language, String strong, String ageLimit, String introduce, String address, String masterSkill, Integer ranking, Integer state) {
        this.id = id;
        this.name = name;
        this.head = head;
        this.sex = sex;
        this.age = age;
        this.ethnic = ethnic;
        this.phone = phone;
        this.nativePlace = nativePlace;
        this.marry = marry;
        this.college = college;
        this.idNumber = idNumber;
        this.major = major;
        this.culture = culture;
        this.skillName = skillName;
        this.language = language;
        this.strong = strong;
        this.ageLimit = ageLimit;
        this.introduce = introduce;
        this.address = address;
        this.masterSkill = masterSkill;
        this.ranking = ranking;
        this.state = state;
    }

    public Resume() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStrong() {
        return strong;
    }

    public void setStrong(String strong) {
        this.strong = strong;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMasterSkill() {
        return masterSkill;
    }

    public void setMasterSkill(String masterSkill) {
        this.masterSkill = masterSkill;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
