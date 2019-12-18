package com.shop.user.modal;

import java.io.Serializable;

/**
 *商家表
 */

public class Merchant implements Serializable {
    private Integer id;                 //自增ID
    private String phone;               //手机号
    private String password;            //密码
    private String enterpriseName;      //企业名称
    private String nickName;            //呢称
    private Integer position;           //在企业职位（单表或者数字状态都可以）
    private String name;                //真实姓名
    private String contact;             //真实联系方式，生成虚拟号或后期进行转接
    private Integer iid;//关联身份表
    private Integer head;               //头像（头像是否是本人头像）1.是2.否
    private Integer headState;          //头像审核状态（0,1,2）
    private String location;            //公司位置
    private Integer personIntegral;     //关联积分表  无表！
    private Integer personCurrency;     //关联虚拟币表  无表！
    private Integer starLevel;          //企业星级
    private String area;                //企业派单区域
    private String nature;              //企业性质
    private String particular;          //企业用工详细需求类型
    private Integer member;             //会员状态(1.正常2.异常)
    private Integer oid;//关联其他认证方式表
    private Integer ranking;            //企业排名
    private Integer status;             //企业状态（是否违规操作，违规操作该企业纳入企业黑名单1.是2.否）
    private String credit;              //征信记录（通过富文本方式记录,不对外人进行展示)
    private Double balance;             //企业余额
    private String identitys;       //默认商家
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

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getHeadState() {
        return headState;
    }

    public void setHeadState(Integer headState) {
        this.headState = headState;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPersonIntegral() {
        return personIntegral;
    }

    public void setPersonIntegral(Integer personIntegral) {
        this.personIntegral = personIntegral;
    }

    public Integer getPersonCurrency() {
        return personCurrency;
    }

    public void setPersonCurrency(Integer personCurrency) {
        this.personCurrency = personCurrency;
    }

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getParticular() {
        return particular;
    }

    public void setParticular(String particular) {
        this.particular = particular;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getIdentitys() {
        return identitys;
    }

    public void setIdentitys(String identitys) {
        this.identitys = identitys;
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
        sb.append(", enterpriseName=").append(enterpriseName);
        sb.append(", nickName=").append(nickName);
        sb.append(", position=").append(position);
        sb.append(", name=").append(name);
        sb.append(", contact=").append(contact);
        sb.append(", iid=").append(iid);
        sb.append(", head=").append(head);
        sb.append(", headState=").append(headState);
        sb.append(", location=").append(location);
        sb.append(", personIntegral=").append(personIntegral);
        sb.append(", personCurrency=").append(personCurrency);
        sb.append(", starLevel=").append(starLevel);
        sb.append(", area=").append(area);
        sb.append(", nature=").append(nature);
        sb.append(", particular=").append(particular);
        sb.append(", member=").append(member);
        sb.append(", oid=").append(oid);
        sb.append(", ranking=").append(ranking);
        sb.append(", status=").append(status);
        sb.append(", credit=").append(credit);
        sb.append(", balance=").append(balance);
        sb.append(", identitys=").append(identitys);
        sb.append("]");
        return sb.toString();
    }
}
