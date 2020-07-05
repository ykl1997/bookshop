package com.bookshop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBooidIsNull() {
            addCriterion("booId is null");
            return (Criteria) this;
        }

        public Criteria andBooidIsNotNull() {
            addCriterion("booId is not null");
            return (Criteria) this;
        }

        public Criteria andBooidEqualTo(Integer value) {
            addCriterion("booId =", value, "booid");
            return (Criteria) this;
        }

        public Criteria andBooidNotEqualTo(Integer value) {
            addCriterion("booId <>", value, "booid");
            return (Criteria) this;
        }

        public Criteria andBooidGreaterThan(Integer value) {
            addCriterion("booId >", value, "booid");
            return (Criteria) this;
        }

        public Criteria andBooidGreaterThanOrEqualTo(Integer value) {
            addCriterion("booId >=", value, "booid");
            return (Criteria) this;
        }

        public Criteria andBooidLessThan(Integer value) {
            addCriterion("booId <", value, "booid");
            return (Criteria) this;
        }

        public Criteria andBooidLessThanOrEqualTo(Integer value) {
            addCriterion("booId <=", value, "booid");
            return (Criteria) this;
        }

        public Criteria andBooidIn(List<Integer> values) {
            addCriterion("booId in", values, "booid");
            return (Criteria) this;
        }

        public Criteria andBooidNotIn(List<Integer> values) {
            addCriterion("booId not in", values, "booid");
            return (Criteria) this;
        }

        public Criteria andBooidBetween(Integer value1, Integer value2) {
            addCriterion("booId between", value1, value2, "booid");
            return (Criteria) this;
        }

        public Criteria andBooidNotBetween(Integer value1, Integer value2) {
            addCriterion("booId not between", value1, value2, "booid");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressIsNull() {
            addCriterion("receivingAddress is null");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressIsNotNull() {
            addCriterion("receivingAddress is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressEqualTo(String value) {
            addCriterion("receivingAddress =", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotEqualTo(String value) {
            addCriterion("receivingAddress <>", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressGreaterThan(String value) {
            addCriterion("receivingAddress >", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressGreaterThanOrEqualTo(String value) {
            addCriterion("receivingAddress >=", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressLessThan(String value) {
            addCriterion("receivingAddress <", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressLessThanOrEqualTo(String value) {
            addCriterion("receivingAddress <=", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressLike(String value) {
            addCriterion("receivingAddress like", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotLike(String value) {
            addCriterion("receivingAddress not like", value, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressIn(List<String> values) {
            addCriterion("receivingAddress in", values, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotIn(List<String> values) {
            addCriterion("receivingAddress not in", values, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressBetween(String value1, String value2) {
            addCriterion("receivingAddress between", value1, value2, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andReceivingaddressNotBetween(String value1, String value2) {
            addCriterion("receivingAddress not between", value1, value2, "receivingaddress");
            return (Criteria) this;
        }

        public Criteria andBooknumIsNull() {
            addCriterion("bookNum is null");
            return (Criteria) this;
        }

        public Criteria andBooknumIsNotNull() {
            addCriterion("bookNum is not null");
            return (Criteria) this;
        }

        public Criteria andBooknumEqualTo(Integer value) {
            addCriterion("bookNum =", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumNotEqualTo(Integer value) {
            addCriterion("bookNum <>", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumGreaterThan(Integer value) {
            addCriterion("bookNum >", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookNum >=", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumLessThan(Integer value) {
            addCriterion("bookNum <", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumLessThanOrEqualTo(Integer value) {
            addCriterion("bookNum <=", value, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumIn(List<Integer> values) {
            addCriterion("bookNum in", values, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumNotIn(List<Integer> values) {
            addCriterion("bookNum not in", values, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumBetween(Integer value1, Integer value2) {
            addCriterion("bookNum between", value1, value2, "booknum");
            return (Criteria) this;
        }

        public Criteria andBooknumNotBetween(Integer value1, Integer value2) {
            addCriterion("bookNum not between", value1, value2, "booknum");
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

        public Criteria andTotalprinceIsNull() {
            addCriterion("totalprince is null");
            return (Criteria) this;
        }

        public Criteria andTotalprinceIsNotNull() {
            addCriterion("totalprince is not null");
            return (Criteria) this;
        }

        public Criteria andTotalprinceEqualTo(BigDecimal value) {
            addCriterion("totalprince =", value, "totalprince");
            return (Criteria) this;
        }

        public Criteria andTotalprinceNotEqualTo(BigDecimal value) {
            addCriterion("totalprince <>", value, "totalprince");
            return (Criteria) this;
        }

        public Criteria andTotalprinceGreaterThan(BigDecimal value) {
            addCriterion("totalprince >", value, "totalprince");
            return (Criteria) this;
        }

        public Criteria andTotalprinceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalprince >=", value, "totalprince");
            return (Criteria) this;
        }

        public Criteria andTotalprinceLessThan(BigDecimal value) {
            addCriterion("totalprince <", value, "totalprince");
            return (Criteria) this;
        }

        public Criteria andTotalprinceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalprince <=", value, "totalprince");
            return (Criteria) this;
        }

        public Criteria andTotalprinceIn(List<BigDecimal> values) {
            addCriterion("totalprince in", values, "totalprince");
            return (Criteria) this;
        }

        public Criteria andTotalprinceNotIn(List<BigDecimal> values) {
            addCriterion("totalprince not in", values, "totalprince");
            return (Criteria) this;
        }

        public Criteria andTotalprinceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalprince between", value1, value2, "totalprince");
            return (Criteria) this;
        }

        public Criteria andTotalprinceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalprince not between", value1, value2, "totalprince");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNull() {
            addCriterion("bookname is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("bookname is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("bookname =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("bookname <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("bookname >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("bookname >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("bookname <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("bookname <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("bookname like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("bookname not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("bookname in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("bookname not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("bookname between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("bookname not between", value1, value2, "bookname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order
     *
     * @mbggenerated do_not_delete_during_merge Sun Jul 05 08:51:36 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order
     *
     * @mbggenerated Sun Jul 05 08:51:36 CST 2020
     */
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