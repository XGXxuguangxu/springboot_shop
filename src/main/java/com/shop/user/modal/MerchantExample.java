package com.shop.user.modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xuguangxu
 * @date 2019/12/17 11:52
 */
public class MerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<MerchantExample.Criteria> oredCriteria;

    public MerchantExample() {
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

    public List<MerchantExample.Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(MerchantExample.Criteria criteria) {
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

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterpriseName is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterpriseName is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterpriseName =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterpriseName <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterpriseName >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterpriseName >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterpriseName <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterpriseName <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterpriseName like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterpriseName not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterpriseName in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterpriseName not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterpriseName between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterpriseName not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nickName =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nickName <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nickName like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nickName not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nickName in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(Integer value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(Integer value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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
            addCriterion("iid  is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid  =", value, "iid ");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid  <>", value, "iid ");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid  >", value, "iid ");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid  >=", value, "iid ");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid  <", value, "iid ");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid  <=", value, "iid ");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid  in", values, "iid ");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid  not in", values, "iid ");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid  between", value1, value2, "iid ");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid  not between", value1, value2, "iid ");
            return (Criteria) this;
        }

        public Criteria andHeadIsNull() {
            addCriterion("head is null");
            return (Criteria) this;
        }

        public Criteria andHeadIsNotNull() {
            addCriterion("head is not null");
            return (Criteria) this;
        }

        public Criteria andHeadEqualTo(String value) {
            addCriterion("head =", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotEqualTo(String value) {
            addCriterion("head <>", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThan(String value) {
            addCriterion("head >", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThanOrEqualTo(String value) {
            addCriterion("head >=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThan(String value) {
            addCriterion("head <", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThanOrEqualTo(String value) {
            addCriterion("head <=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLike(String value) {
            addCriterion("head like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotLike(String value) {
            addCriterion("head not like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIn(List<String> values) {
            addCriterion("head in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotIn(List<String> values) {
            addCriterion("head not in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadBetween(String value1, String value2) {
            addCriterion("head between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotBetween(String value1, String value2) {
            addCriterion("head not between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadStateIsNull() {
            addCriterion("headState is null");
            return (Criteria) this;
        }

        public Criteria andHeadStateIsNotNull() {
            addCriterion("headState is not null");
            return (Criteria) this;
        }

        public Criteria andHeadStateEqualTo(Integer value) {
            addCriterion("headState =", value, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateNotEqualTo(Integer value) {
            addCriterion("headState <>", value, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateGreaterThan(Integer value) {
            addCriterion("headState >", value, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("headState >=", value, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateLessThan(Integer value) {
            addCriterion("headState <", value, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateLessThanOrEqualTo(Integer value) {
            addCriterion("headState <=", value, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateLike(Integer value) {
            addCriterion("headState like", value, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateNotLike(Integer value) {
            addCriterion("headState not like", value, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateIn(List<Integer> values) {
            addCriterion("headState in", values, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateNotIn(List<Integer> values) {
            addCriterion("headState not in", values, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateBetween(Integer value1, Integer value2) {
            addCriterion("headState between", value1, value2, "headState");
            return (Criteria) this;
        }

        public Criteria andHeadStateNotBetween(Integer value1, Integer value2) {
            addCriterion("headState not between", value1, value2, "headState");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralIsNull() {
            addCriterion("personIntegral is null");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralIsNotNull() {
            addCriterion("personIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralEqualTo(Integer value) {
            addCriterion("personIntegral =", value, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralNotEqualTo(Integer value) {
            addCriterion("personIntegral <>", value, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralGreaterThan(Integer value) {
            addCriterion("personIntegral >", value, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("personIntegral >=", value, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralLessThan(Integer value) {
            addCriterion("personIntegral <", value, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("personIntegral <=", value, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralIn(List<Integer> values) {
            addCriterion("personIntegral in", values, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralNotIn(List<Integer> values) {
            addCriterion("personIntegral not in", values, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralBetween(Integer value1, Integer value2) {
            addCriterion("personIntegral between", value1, value2, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("personIntegral not between", value1, value2, "personIntegral");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyIsNull() {
            addCriterion("personCurrency is null");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyIsNotNull() {
            addCriterion("personCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyEqualTo(Integer value) {
            addCriterion("personCurrency =", value, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyNotEqualTo(Integer value) {
            addCriterion("personCurrency <>", value, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyGreaterThan(Integer value) {
            addCriterion("personCurrency >", value, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("personCurrency >=", value, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyLessThan(Integer value) {
            addCriterion("personCurrency <", value, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyLessThanOrEqualTo(Integer value) {
            addCriterion("personCurrency <=", value, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyIn(List<Integer> values) {
            addCriterion("personCurrency in", values, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyNotIn(List<Integer> values) {
            addCriterion("personCurrency not in", values, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyBetween(Integer value1, Integer value2) {
            addCriterion("personCurrency between", value1, value2, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andPersonCurrencyNotBetween(Integer value1, Integer value2) {
            addCriterion("personCurrency not between", value1, value2, "personCurrency");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNull() {
            addCriterion("starLevel is null");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNotNull() {
            addCriterion("starLevel is not null");
            return (Criteria) this;
        }

        public Criteria andStarLevelEqualTo(Integer value) {
            addCriterion("starLevel =", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotEqualTo(Integer value) {
            addCriterion("starLevel <>", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThan(Integer value) {
            addCriterion("starLevel >", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("starLevel >=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThan(Integer value) {
            addCriterion("starLevel <", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThanOrEqualTo(Integer value) {
            addCriterion("starLevel <=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLike(Integer value) {
            addCriterion("starLevel like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotLike(Integer value) {
            addCriterion("starLevel not like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelIn(List<Integer> values) {
            addCriterion("starLevel in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotIn(List<Integer> values) {
            addCriterion("starLevel not in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelBetween(Integer value1, Integer value2) {
            addCriterion("starLevel between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("starLevel not between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andParticularIsNull() {
            addCriterion("particular is null");
            return (Criteria) this;
        }

        public Criteria andParticularIsNotNull() {
            addCriterion("particular is not null");
            return (Criteria) this;
        }

        public Criteria andParticularEqualTo(String value) {
            addCriterion("particular =", value, "particular");
            return (Criteria) this;
        }

        public Criteria andParticularNotEqualTo(String value) {
            addCriterion("particular <>", value, "particular");
            return (Criteria) this;
        }

        public Criteria andParticularGreaterThan(String value) {
            addCriterion("particular >", value, "particular");
            return (Criteria) this;
        }

        public Criteria andParticularGreaterThanOrEqualTo(String value) {
            addCriterion("particular >=", value, "particular");
            return (Criteria) this;
        }

        public Criteria andParticularLessThan(String value) {
            addCriterion("particular <", value, "particular");
            return (Criteria) this;
        }

        public Criteria andParticularLessThanOrEqualTo(String value) {
            addCriterion("particular <=", value, "particular");
            return (Criteria) this;
        }

        public Criteria andParticularIn(List<String> values) {
            addCriterion("particular in", values, "particular");
            return (Criteria) this;
        }

        public Criteria andParticularNotIn(List<String> values) {
            addCriterion("particular not in", values, "particular");
            return (Criteria) this;
        }

        public Criteria andParticularBetween(String value1, String value2) {
            addCriterion("particular between", value1, value2, "particular");
            return (Criteria) this;
        }

        public Criteria andParticularNotBetween(String value1, String value2) {
            addCriterion("particular not between", value1, value2, "particular");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(Integer value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(Integer value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(Integer value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(Integer value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(Integer value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<Integer> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<Integer> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(Integer value1, Integer value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("member not between", value1, value2, "member");
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

        public Criteria andOidLike(Integer value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(Integer value) {
            addCriterion("oid not like", value, "oid");
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

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
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
