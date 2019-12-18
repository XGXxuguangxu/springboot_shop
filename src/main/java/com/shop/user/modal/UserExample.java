package com.shop.user.modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andHeadportraitIsNull() {
            addCriterion("headportrait is null");
            return (Criteria) this;
        }

        public Criteria andHeadportraitIsNotNull() {
            addCriterion("headportrait is not null");
            return (Criteria) this;
        }

        public Criteria andHeadportraitEqualTo(String value) {
            addCriterion("headportrait =", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotEqualTo(String value) {
            addCriterion("headportrait <>", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitGreaterThan(String value) {
            addCriterion("headportrait >", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitGreaterThanOrEqualTo(String value) {
            addCriterion("headportrait >=", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitLessThan(String value) {
            addCriterion("headportrait <", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitLessThanOrEqualTo(String value) {
            addCriterion("headportrait <=", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitLike(String value) {
            addCriterion("headportrait like", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotLike(String value) {
            addCriterion("headportrait not like", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitIn(List<String> values) {
            addCriterion("headportrait in", values, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotIn(List<String> values) {
            addCriterion("headportrait not in", values, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitBetween(String value1, String value2) {
            addCriterion("headportrait between", value1, value2, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotBetween(String value1, String value2) {
            addCriterion("headportrait not between", value1, value2, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadstateIsNull() {
            addCriterion("headstate is null");
            return (Criteria) this;
        }

        public Criteria andHeadstateIsNotNull() {
            addCriterion("headstate is not null");
            return (Criteria) this;
        }

        public Criteria andHeadstateEqualTo(Integer value) {
            addCriterion("headstate =", value, "headstate");
            return (Criteria) this;
        }

        public Criteria andHeadstateNotEqualTo(Integer value) {
            addCriterion("headstate <>", value, "headstate");
            return (Criteria) this;
        }

        public Criteria andHeadstateGreaterThan(Integer value) {
            addCriterion("headstate >", value, "headstate");
            return (Criteria) this;
        }

        public Criteria andHeadstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("headstate >=", value, "headstate");
            return (Criteria) this;
        }

        public Criteria andHeadstateLessThan(Integer value) {
            addCriterion("headstate <", value, "headstate");
            return (Criteria) this;
        }

        public Criteria andHeadstateLessThanOrEqualTo(Integer value) {
            addCriterion("headstate <=", value, "headstate");
            return (Criteria) this;
        }

        public Criteria andHeadstateIn(List<Integer> values) {
            addCriterion("headstate in", values, "headstate");
            return (Criteria) this;
        }

        public Criteria andHeadstateNotIn(List<Integer> values) {
            addCriterion("headstate not in", values, "headstate");
            return (Criteria) this;
        }

        public Criteria andHeadstateBetween(Integer value1, Integer value2) {
            addCriterion("headstate between", value1, value2, "headstate");
            return (Criteria) this;
        }

        public Criteria andHeadstateNotBetween(Integer value1, Integer value2) {
            addCriterion("headstate not between", value1, value2, "headstate");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIsNull() {
            addCriterion("houseaddress is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIsNotNull() {
            addCriterion("houseaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressEqualTo(String value) {
            addCriterion("houseaddress =", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotEqualTo(String value) {
            addCriterion("houseaddress <>", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressGreaterThan(String value) {
            addCriterion("houseaddress >", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressGreaterThanOrEqualTo(String value) {
            addCriterion("houseaddress >=", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLessThan(String value) {
            addCriterion("houseaddress <", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLessThanOrEqualTo(String value) {
            addCriterion("houseaddress <=", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLike(String value) {
            addCriterion("houseaddress like", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotLike(String value) {
            addCriterion("houseaddress not like", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIn(List<String> values) {
            addCriterion("houseaddress in", values, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotIn(List<String> values) {
            addCriterion("houseaddress not in", values, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressBetween(String value1, String value2) {
            addCriterion("houseaddress between", value1, value2, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotBetween(String value1, String value2) {
            addCriterion("houseaddress not between", value1, value2, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("lid not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidsIsNull() {
            addCriterion("lids is null");
            return (Criteria) this;
        }

        public Criteria andLidsIsNotNull() {
            addCriterion("lids is not null");
            return (Criteria) this;
        }

        public Criteria andLidsEqualTo(Integer value) {
            addCriterion("lids =", value, "lids");
            return (Criteria) this;
        }

        public Criteria andLidsNotEqualTo(Integer value) {
            addCriterion("lids <>", value, "lids");
            return (Criteria) this;
        }

        public Criteria andLidsGreaterThan(Integer value) {
            addCriterion("lids >", value, "lids");
            return (Criteria) this;
        }

        public Criteria andLidsGreaterThanOrEqualTo(Integer value) {
            addCriterion("lids >=", value, "lids");
            return (Criteria) this;
        }

        public Criteria andLidsLessThan(Integer value) {
            addCriterion("lids <", value, "lids");
            return (Criteria) this;
        }

        public Criteria andLidsLessThanOrEqualTo(Integer value) {
            addCriterion("lids <=", value, "lids");
            return (Criteria) this;
        }

        public Criteria andLidsIn(List<Integer> values) {
            addCriterion("lids in", values, "lids");
            return (Criteria) this;
        }

        public Criteria andLidsNotIn(List<Integer> values) {
            addCriterion("lids not in", values, "lids");
            return (Criteria) this;
        }

        public Criteria andLidsBetween(Integer value1, Integer value2) {
            addCriterion("lids between", value1, value2, "lids");
            return (Criteria) this;
        }

        public Criteria andLidsNotBetween(Integer value1, Integer value2) {
            addCriterion("lids not between", value1, value2, "lids");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusIsNull() {
            addCriterion("politicsStatus is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusIsNotNull() {
            addCriterion("politicsStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusEqualTo(String value) {
            addCriterion("politicsStatus =", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotEqualTo(String value) {
            addCriterion("politicsStatus <>", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusGreaterThan(String value) {
            addCriterion("politicsStatus >", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusGreaterThanOrEqualTo(String value) {
            addCriterion("politicsStatus >=", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusLessThan(String value) {
            addCriterion("politicsStatus <", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusLessThanOrEqualTo(String value) {
            addCriterion("politicsStatus <=", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusLike(String value) {
            addCriterion("politicsStatus like", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotLike(String value) {
            addCriterion("politicsStatus not like", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusIn(List<String> values) {
            addCriterion("politicsStatus in", values, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotIn(List<String> values) {
            addCriterion("politicsStatus not in", values, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusBetween(String value1, String value2) {
            addCriterion("politicsStatus between", value1, value2, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotBetween(String value1, String value2) {
            addCriterion("politicsStatus not between", value1, value2, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andMarryIsNull() {
            addCriterion("marry is null");
            return (Criteria) this;
        }

        public Criteria andMarryIsNotNull() {
            addCriterion("marry is not null");
            return (Criteria) this;
        }

        public Criteria andMarryEqualTo(Integer value) {
            addCriterion("marry =", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotEqualTo(Integer value) {
            addCriterion("marry <>", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThan(Integer value) {
            addCriterion("marry >", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThanOrEqualTo(Integer value) {
            addCriterion("marry >=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThan(Integer value) {
            addCriterion("marry <", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThanOrEqualTo(Integer value) {
            addCriterion("marry <=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryIn(List<Integer> values) {
            addCriterion("marry in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotIn(List<Integer> values) {
            addCriterion("marry not in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryBetween(Integer value1, Integer value2) {
            addCriterion("marry between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotBetween(Integer value1, Integer value2) {
            addCriterion("marry not between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andPersonintegralIsNull() {
            addCriterion("personIntegral is null");
            return (Criteria) this;
        }

        public Criteria andPersonintegralIsNotNull() {
            addCriterion("personIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andPersonintegralEqualTo(Integer value) {
            addCriterion("personIntegral =", value, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersonintegralNotEqualTo(Integer value) {
            addCriterion("personIntegral <>", value, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersonintegralGreaterThan(Integer value) {
            addCriterion("personIntegral >", value, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersonintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("personIntegral >=", value, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersonintegralLessThan(Integer value) {
            addCriterion("personIntegral <", value, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersonintegralLessThanOrEqualTo(Integer value) {
            addCriterion("personIntegral <=", value, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersonintegralIn(List<Integer> values) {
            addCriterion("personIntegral in", values, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersonintegralNotIn(List<Integer> values) {
            addCriterion("personIntegral not in", values, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersonintegralBetween(Integer value1, Integer value2) {
            addCriterion("personIntegral between", value1, value2, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersonintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("personIntegral not between", value1, value2, "personintegral");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyIsNull() {
            addCriterion("personCurrency is null");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyIsNotNull() {
            addCriterion("personCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyEqualTo(Integer value) {
            addCriterion("personCurrency =", value, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyNotEqualTo(Integer value) {
            addCriterion("personCurrency <>", value, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyGreaterThan(Integer value) {
            addCriterion("personCurrency >", value, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("personCurrency >=", value, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyLessThan(Integer value) {
            addCriterion("personCurrency <", value, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyLessThanOrEqualTo(Integer value) {
            addCriterion("personCurrency <=", value, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyIn(List<Integer> values) {
            addCriterion("personCurrency in", values, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyNotIn(List<Integer> values) {
            addCriterion("personCurrency not in", values, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyBetween(Integer value1, Integer value2) {
            addCriterion("personCurrency between", value1, value2, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersoncurrencyNotBetween(Integer value1, Integer value2) {
            addCriterion("personCurrency not between", value1, value2, "personcurrency");
            return (Criteria) this;
        }

        public Criteria andPersonstarIsNull() {
            addCriterion("personStar is null");
            return (Criteria) this;
        }

        public Criteria andPersonstarIsNotNull() {
            addCriterion("personStar is not null");
            return (Criteria) this;
        }

        public Criteria andPersonstarEqualTo(Integer value) {
            addCriterion("personStar =", value, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonstarNotEqualTo(Integer value) {
            addCriterion("personStar <>", value, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonstarGreaterThan(Integer value) {
            addCriterion("personStar >", value, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonstarGreaterThanOrEqualTo(Integer value) {
            addCriterion("personStar >=", value, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonstarLessThan(Integer value) {
            addCriterion("personStar <", value, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonstarLessThanOrEqualTo(Integer value) {
            addCriterion("personStar <=", value, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonstarIn(List<Integer> values) {
            addCriterion("personStar in", values, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonstarNotIn(List<Integer> values) {
            addCriterion("personStar not in", values, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonstarBetween(Integer value1, Integer value2) {
            addCriterion("personStar between", value1, value2, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonstarNotBetween(Integer value1, Integer value2) {
            addCriterion("personStar not between", value1, value2, "personstar");
            return (Criteria) this;
        }

        public Criteria andPersonaddressIsNull() {
            addCriterion("personAddress is null");
            return (Criteria) this;
        }

        public Criteria andPersonaddressIsNotNull() {
            addCriterion("personAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPersonaddressEqualTo(String value) {
            addCriterion("personAddress =", value, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressNotEqualTo(String value) {
            addCriterion("personAddress <>", value, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressGreaterThan(String value) {
            addCriterion("personAddress >", value, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressGreaterThanOrEqualTo(String value) {
            addCriterion("personAddress >=", value, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressLessThan(String value) {
            addCriterion("personAddress <", value, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressLessThanOrEqualTo(String value) {
            addCriterion("personAddress <=", value, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressLike(String value) {
            addCriterion("personAddress like", value, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressNotLike(String value) {
            addCriterion("personAddress not like", value, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressIn(List<String> values) {
            addCriterion("personAddress in", values, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressNotIn(List<String> values) {
            addCriterion("personAddress not in", values, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressBetween(String value1, String value2) {
            addCriterion("personAddress between", value1, value2, "personaddress");
            return (Criteria) this;
        }

        public Criteria andPersonaddressNotBetween(String value1, String value2) {
            addCriterion("personAddress not between", value1, value2, "personaddress");
            return (Criteria) this;
        }

        public Criteria andMemberstateIsNull() {
            addCriterion("memberState is null");
            return (Criteria) this;
        }

        public Criteria andMemberstateIsNotNull() {
            addCriterion("memberState is not null");
            return (Criteria) this;
        }

        public Criteria andMemberstateEqualTo(Integer value) {
            addCriterion("memberState =", value, "memberstate");
            return (Criteria) this;
        }

        public Criteria andMemberstateNotEqualTo(Integer value) {
            addCriterion("memberState <>", value, "memberstate");
            return (Criteria) this;
        }

        public Criteria andMemberstateGreaterThan(Integer value) {
            addCriterion("memberState >", value, "memberstate");
            return (Criteria) this;
        }

        public Criteria andMemberstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberState >=", value, "memberstate");
            return (Criteria) this;
        }

        public Criteria andMemberstateLessThan(Integer value) {
            addCriterion("memberState <", value, "memberstate");
            return (Criteria) this;
        }

        public Criteria andMemberstateLessThanOrEqualTo(Integer value) {
            addCriterion("memberState <=", value, "memberstate");
            return (Criteria) this;
        }

        public Criteria andMemberstateIn(List<Integer> values) {
            addCriterion("memberState in", values, "memberstate");
            return (Criteria) this;
        }

        public Criteria andMemberstateNotIn(List<Integer> values) {
            addCriterion("memberState not in", values, "memberstate");
            return (Criteria) this;
        }

        public Criteria andMemberstateBetween(Integer value1, Integer value2) {
            addCriterion("memberState between", value1, value2, "memberstate");
            return (Criteria) this;
        }

        public Criteria andMemberstateNotBetween(Integer value1, Integer value2) {
            addCriterion("memberState not between", value1, value2, "memberstate");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andPersonrankingIsNull() {
            addCriterion("personRanking is null");
            return (Criteria) this;
        }

        public Criteria andPersonrankingIsNotNull() {
            addCriterion("personRanking is not null");
            return (Criteria) this;
        }

        public Criteria andPersonrankingEqualTo(Integer value) {
            addCriterion("personRanking =", value, "personranking");
            return (Criteria) this;
        }

        public Criteria andPersonrankingNotEqualTo(Integer value) {
            addCriterion("personRanking <>", value, "personranking");
            return (Criteria) this;
        }

        public Criteria andPersonrankingGreaterThan(Integer value) {
            addCriterion("personRanking >", value, "personranking");
            return (Criteria) this;
        }

        public Criteria andPersonrankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("personRanking >=", value, "personranking");
            return (Criteria) this;
        }

        public Criteria andPersonrankingLessThan(Integer value) {
            addCriterion("personRanking <", value, "personranking");
            return (Criteria) this;
        }

        public Criteria andPersonrankingLessThanOrEqualTo(Integer value) {
            addCriterion("personRanking <=", value, "personranking");
            return (Criteria) this;
        }

        public Criteria andPersonrankingIn(List<Integer> values) {
            addCriterion("personRanking in", values, "personranking");
            return (Criteria) this;
        }

        public Criteria andPersonrankingNotIn(List<Integer> values) {
            addCriterion("personRanking not in", values, "personranking");
            return (Criteria) this;
        }

        public Criteria andPersonrankingBetween(Integer value1, Integer value2) {
            addCriterion("personRanking between", value1, value2, "personranking");
            return (Criteria) this;
        }

        public Criteria andPersonrankingNotBetween(Integer value1, Integer value2) {
            addCriterion("personRanking not between", value1, value2, "personranking");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(Integer value) {
            addCriterion("userState =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(Integer value) {
            addCriterion("userState <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(Integer value) {
            addCriterion("userState >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("userState >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(Integer value) {
            addCriterion("userState <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(Integer value) {
            addCriterion("userState <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<Integer> values) {
            addCriterion("userState in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<Integer> values) {
            addCriterion("userState not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(Integer value1, Integer value2) {
            addCriterion("userState between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(Integer value1, Integer value2) {
            addCriterion("userState not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(String value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(String value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(String value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(String value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(String value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(String value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLike(String value) {
            addCriterion("credit like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotLike(String value) {
            addCriterion("credit not like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<String> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<String> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(String value1, String value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(String value1, String value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyIsNull() {
            addCriterion("personMoney is null");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyIsNotNull() {
            addCriterion("personMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyEqualTo(Double value) {
            addCriterion("personMoney =", value, "personmoney");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyNotEqualTo(Double value) {
            addCriterion("personMoney <>", value, "personmoney");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyGreaterThan(Double value) {
            addCriterion("personMoney >", value, "personmoney");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("personMoney >=", value, "personmoney");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyLessThan(Double value) {
            addCriterion("personMoney <", value, "personmoney");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyLessThanOrEqualTo(Double value) {
            addCriterion("personMoney <=", value, "personmoney");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyIn(List<Double> values) {
            addCriterion("personMoney in", values, "personmoney");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyNotIn(List<Double> values) {
            addCriterion("personMoney not in", values, "personmoney");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyBetween(Double value1, Double value2) {
            addCriterion("personMoney between", value1, value2, "personmoney");
            return (Criteria) this;
        }

        public Criteria andPersonmoneyNotBetween(Double value1, Double value2) {
            addCriterion("personMoney not between", value1, value2, "personmoney");
            return (Criteria) this;
        }

        public Criteria andIdentitysIsNull() {
            addCriterion("identitys is null");
            return (Criteria) this;
        }

        public Criteria andIdentitysIsNotNull() {
            addCriterion("identitys is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitysEqualTo(String value) {
            addCriterion("identitys =", value, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysNotEqualTo(String value) {
            addCriterion("identitys <>", value, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysGreaterThan(String value) {
            addCriterion("identitys >", value, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysGreaterThanOrEqualTo(String value) {
            addCriterion("identitys >=", value, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysLessThan(String value) {
            addCriterion("identitys <", value, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysLessThanOrEqualTo(String value) {
            addCriterion("identitys <=", value, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysLike(String value) {
            addCriterion("identitys like", value, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysNotLike(String value) {
            addCriterion("identitys not like", value, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysIn(List<String> values) {
            addCriterion("identitys in", values, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysNotIn(List<String> values) {
            addCriterion("identitys not in", values, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysBetween(String value1, String value2) {
            addCriterion("identitys between", value1, value2, "identitys");
            return (Criteria) this;
        }

        public Criteria andIdentitysNotBetween(String value1, String value2) {
            addCriterion("identitys not between", value1, value2, "identitys");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNull() {
            addCriterion("registrationDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNotNull() {
            addCriterion("registrationDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateEqualTo(Date value) {
            addCriterion("registrationDate =", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotEqualTo(Date value) {
            addCriterion("registrationDate <>", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThan(Date value) {
            addCriterion("registrationDate >", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("registrationDate >=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThan(Date value) {
            addCriterion("registrationDate <", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThanOrEqualTo(Date value) {
            addCriterion("registrationDate <=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIn(List<Date> values) {
            addCriterion("registrationDate in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotIn(List<Date> values) {
            addCriterion("registrationDate not in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateBetween(Date value1, Date value2) {
            addCriterion("registrationDate between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotBetween(Date value1, Date value2) {
            addCriterion("registrationDate not between", value1, value2, "registrationdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}