package com.shop.user.modal;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/***
 * 搭把手用户表
 */
public class User implements Serializable {
    private Integer id;

    /***
     * 手机号
     */
    private String phone;

    /***
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /***
     * 真实姓名
     */
    private String realname;

    private String contact;

    private Integer iid;

    private String headportrait;

    private Integer headstate;

    private String houseaddress;

    private String education;

    private Integer sid;

    private Integer lid;

    private Integer lids;

    private String politicsstatus;

    private Integer marry;

    private Integer personintegral;

    private Integer personcurrency;

    private Integer personstar;

    private String personaddress;

    private Integer memberstate;

    private Integer oid;

    private Integer personranking;

    private Integer userstate;

    private String credit;

    private Double personmoney;

    private String identitys;

    private Date registrationdate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getHeadportrait() {
        return headportrait;
    }

    public void setHeadportrait(String headportrait) {
        this.headportrait = headportrait;
    }

    public Integer getHeadstate() {
        return headstate;
    }

    public void setHeadstate(Integer headstate) {
        this.headstate = headstate;
    }

    public String getHouseaddress() {
        return houseaddress;
    }

    public void setHouseaddress(String houseaddress) {
        this.houseaddress = houseaddress;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getLids() {
        return lids;
    }

    public void setLids(Integer lids) {
        this.lids = lids;
    }

    public String getPoliticsstatus() {
        return politicsstatus;
    }

    public void setPoliticsstatus(String politicsstatus) {
        this.politicsstatus = politicsstatus;
    }

    public Integer getMarry() {
        return marry;
    }

    public void setMarry(Integer marry) {
        this.marry = marry;
    }

    public Integer getPersonintegral() {
        return personintegral;
    }

    public void setPersonintegral(Integer personintegral) {
        this.personintegral = personintegral;
    }

    public Integer getPersoncurrency() {
        return personcurrency;
    }

    public void setPersoncurrency(Integer personcurrency) {
        this.personcurrency = personcurrency;
    }

    public Integer getPersonstar() {
        return personstar;
    }

    public void setPersonstar(Integer personstar) {
        this.personstar = personstar;
    }

    public String getPersonaddress() {
        return personaddress;
    }

    public void setPersonaddress(String personaddress) {
        this.personaddress = personaddress;
    }

    public Integer getMemberstate() {
        return memberstate;
    }

    public void setMemberstate(Integer memberstate) {
        this.memberstate = memberstate;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getPersonranking() {
        return personranking;
    }

    public void setPersonranking(Integer personranking) {
        this.personranking = personranking;
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public Double getPersonmoney() {
        return personmoney;
    }

    public void setPersonmoney(Double personmoney) {
        this.personmoney = personmoney;
    }

    public String getIdentitys() {
        return identitys;
    }

    public void setIdentitys(String identitys) {
        this.identitys = identitys;
    }

    public Date getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", realname=").append(realname);
        sb.append(", contact=").append(contact);
        sb.append(", iid=").append(iid);
        sb.append(", headportrait=").append(headportrait);
        sb.append(", headstate=").append(headstate);
        sb.append(", houseaddress=").append(houseaddress);
        sb.append(", education=").append(education);
        sb.append(", sid=").append(sid);
        sb.append(", lid=").append(lid);
        sb.append(", lids=").append(lids);
        sb.append(", politicsstatus=").append(politicsstatus);
        sb.append(", marry=").append(marry);
        sb.append(", personintegral=").append(personintegral);
        sb.append(", personcurrency=").append(personcurrency);
        sb.append(", personstar=").append(personstar);
        sb.append(", personaddress=").append(personaddress);
        sb.append(", memberstate=").append(memberstate);
        sb.append(", oid=").append(oid);
        sb.append(", personranking=").append(personranking);
        sb.append(", userstate=").append(userstate);
        sb.append(", credit=").append(credit);
        sb.append(", personmoney=").append(personmoney);
        sb.append(", identitys=").append(identitys);
        sb.append(", registrationdate=").append(registrationdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}