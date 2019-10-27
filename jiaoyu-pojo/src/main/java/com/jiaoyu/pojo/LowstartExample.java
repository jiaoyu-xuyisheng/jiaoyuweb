package com.jiaoyu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LowstartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LowstartExample() {
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

        public Criteria andLowidIsNull() {
            addCriterion("lowid is null");
            return (Criteria) this;
        }

        public Criteria andLowidIsNotNull() {
            addCriterion("lowid is not null");
            return (Criteria) this;
        }

        public Criteria andLowidEqualTo(Integer value) {
            addCriterion("lowid =", value, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowidNotEqualTo(Integer value) {
            addCriterion("lowid <>", value, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowidGreaterThan(Integer value) {
            addCriterion("lowid >", value, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lowid >=", value, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowidLessThan(Integer value) {
            addCriterion("lowid <", value, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowidLessThanOrEqualTo(Integer value) {
            addCriterion("lowid <=", value, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowidIn(List<Integer> values) {
            addCriterion("lowid in", values, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowidNotIn(List<Integer> values) {
            addCriterion("lowid not in", values, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowidBetween(Integer value1, Integer value2) {
            addCriterion("lowid between", value1, value2, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowidNotBetween(Integer value1, Integer value2) {
            addCriterion("lowid not between", value1, value2, "lowid");
            return (Criteria) this;
        }

        public Criteria andLowusernameIsNull() {
            addCriterion("lowusername is null");
            return (Criteria) this;
        }

        public Criteria andLowusernameIsNotNull() {
            addCriterion("lowusername is not null");
            return (Criteria) this;
        }

        public Criteria andLowusernameEqualTo(String value) {
            addCriterion("lowusername =", value, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameNotEqualTo(String value) {
            addCriterion("lowusername <>", value, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameGreaterThan(String value) {
            addCriterion("lowusername >", value, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameGreaterThanOrEqualTo(String value) {
            addCriterion("lowusername >=", value, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameLessThan(String value) {
            addCriterion("lowusername <", value, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameLessThanOrEqualTo(String value) {
            addCriterion("lowusername <=", value, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameLike(String value) {
            addCriterion("lowusername like", value, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameNotLike(String value) {
            addCriterion("lowusername not like", value, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameIn(List<String> values) {
            addCriterion("lowusername in", values, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameNotIn(List<String> values) {
            addCriterion("lowusername not in", values, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameBetween(String value1, String value2) {
            addCriterion("lowusername between", value1, value2, "lowusername");
            return (Criteria) this;
        }

        public Criteria andLowusernameNotBetween(String value1, String value2) {
            addCriterion("lowusername not between", value1, value2, "lowusername");
            return (Criteria) this;
        }

        public Criteria andAnsweridIsNull() {
            addCriterion("answerid is null");
            return (Criteria) this;
        }

        public Criteria andAnsweridIsNotNull() {
            addCriterion("answerid is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweridEqualTo(Integer value) {
            addCriterion("answerid =", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotEqualTo(Integer value) {
            addCriterion("answerid <>", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThan(Integer value) {
            addCriterion("answerid >", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("answerid >=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThan(Integer value) {
            addCriterion("answerid <", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThanOrEqualTo(Integer value) {
            addCriterion("answerid <=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridIn(List<Integer> values) {
            addCriterion("answerid in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotIn(List<Integer> values) {
            addCriterion("answerid not in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridBetween(Integer value1, Integer value2) {
            addCriterion("answerid between", value1, value2, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotBetween(Integer value1, Integer value2) {
            addCriterion("answerid not between", value1, value2, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnusernameIsNull() {
            addCriterion("anusername is null");
            return (Criteria) this;
        }

        public Criteria andAnusernameIsNotNull() {
            addCriterion("anusername is not null");
            return (Criteria) this;
        }

        public Criteria andAnusernameEqualTo(String value) {
            addCriterion("anusername =", value, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameNotEqualTo(String value) {
            addCriterion("anusername <>", value, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameGreaterThan(String value) {
            addCriterion("anusername >", value, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameGreaterThanOrEqualTo(String value) {
            addCriterion("anusername >=", value, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameLessThan(String value) {
            addCriterion("anusername <", value, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameLessThanOrEqualTo(String value) {
            addCriterion("anusername <=", value, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameLike(String value) {
            addCriterion("anusername like", value, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameNotLike(String value) {
            addCriterion("anusername not like", value, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameIn(List<String> values) {
            addCriterion("anusername in", values, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameNotIn(List<String> values) {
            addCriterion("anusername not in", values, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameBetween(String value1, String value2) {
            addCriterion("anusername between", value1, value2, "anusername");
            return (Criteria) this;
        }

        public Criteria andAnusernameNotBetween(String value1, String value2) {
            addCriterion("anusername not between", value1, value2, "anusername");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateIsNull() {
            addCriterion("lowcreatedate is null");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateIsNotNull() {
            addCriterion("lowcreatedate is not null");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateEqualTo(Date value) {
            addCriterion("lowcreatedate =", value, "lowcreatedate");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateNotEqualTo(Date value) {
            addCriterion("lowcreatedate <>", value, "lowcreatedate");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateGreaterThan(Date value) {
            addCriterion("lowcreatedate >", value, "lowcreatedate");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("lowcreatedate >=", value, "lowcreatedate");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateLessThan(Date value) {
            addCriterion("lowcreatedate <", value, "lowcreatedate");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateLessThanOrEqualTo(Date value) {
            addCriterion("lowcreatedate <=", value, "lowcreatedate");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateIn(List<Date> values) {
            addCriterion("lowcreatedate in", values, "lowcreatedate");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateNotIn(List<Date> values) {
            addCriterion("lowcreatedate not in", values, "lowcreatedate");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateBetween(Date value1, Date value2) {
            addCriterion("lowcreatedate between", value1, value2, "lowcreatedate");
            return (Criteria) this;
        }

        public Criteria andLowcreatedateNotBetween(Date value1, Date value2) {
            addCriterion("lowcreatedate not between", value1, value2, "lowcreatedate");
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