package com.jiaoyu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UpstartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpstartExample() {
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

        public Criteria andUpidIsNull() {
            addCriterion("upid is null");
            return (Criteria) this;
        }

        public Criteria andUpidIsNotNull() {
            addCriterion("upid is not null");
            return (Criteria) this;
        }

        public Criteria andUpidEqualTo(Integer value) {
            addCriterion("upid =", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotEqualTo(Integer value) {
            addCriterion("upid <>", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThan(Integer value) {
            addCriterion("upid >", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("upid >=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThan(Integer value) {
            addCriterion("upid <", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThanOrEqualTo(Integer value) {
            addCriterion("upid <=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidIn(List<Integer> values) {
            addCriterion("upid in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotIn(List<Integer> values) {
            addCriterion("upid not in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidBetween(Integer value1, Integer value2) {
            addCriterion("upid between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotBetween(Integer value1, Integer value2) {
            addCriterion("upid not between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andUsenameIsNull() {
            addCriterion("usename is null");
            return (Criteria) this;
        }

        public Criteria andUsenameIsNotNull() {
            addCriterion("usename is not null");
            return (Criteria) this;
        }

        public Criteria andUsenameEqualTo(String value) {
            addCriterion("usename =", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotEqualTo(String value) {
            addCriterion("usename <>", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameGreaterThan(String value) {
            addCriterion("usename >", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameGreaterThanOrEqualTo(String value) {
            addCriterion("usename >=", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLessThan(String value) {
            addCriterion("usename <", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLessThanOrEqualTo(String value) {
            addCriterion("usename <=", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLike(String value) {
            addCriterion("usename like", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotLike(String value) {
            addCriterion("usename not like", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameIn(List<String> values) {
            addCriterion("usename in", values, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotIn(List<String> values) {
            addCriterion("usename not in", values, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameBetween(String value1, String value2) {
            addCriterion("usename between", value1, value2, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotBetween(String value1, String value2) {
            addCriterion("usename not between", value1, value2, "usename");
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

        public Criteria andAnswernameIsNull() {
            addCriterion("answername is null");
            return (Criteria) this;
        }

        public Criteria andAnswernameIsNotNull() {
            addCriterion("answername is not null");
            return (Criteria) this;
        }

        public Criteria andAnswernameEqualTo(String value) {
            addCriterion("answername =", value, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameNotEqualTo(String value) {
            addCriterion("answername <>", value, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameGreaterThan(String value) {
            addCriterion("answername >", value, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameGreaterThanOrEqualTo(String value) {
            addCriterion("answername >=", value, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameLessThan(String value) {
            addCriterion("answername <", value, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameLessThanOrEqualTo(String value) {
            addCriterion("answername <=", value, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameLike(String value) {
            addCriterion("answername like", value, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameNotLike(String value) {
            addCriterion("answername not like", value, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameIn(List<String> values) {
            addCriterion("answername in", values, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameNotIn(List<String> values) {
            addCriterion("answername not in", values, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameBetween(String value1, String value2) {
            addCriterion("answername between", value1, value2, "answername");
            return (Criteria) this;
        }

        public Criteria andAnswernameNotBetween(String value1, String value2) {
            addCriterion("answername not between", value1, value2, "answername");
            return (Criteria) this;
        }

        public Criteria andUppdateIsNull() {
            addCriterion("uppdate is null");
            return (Criteria) this;
        }

        public Criteria andUppdateIsNotNull() {
            addCriterion("uppdate is not null");
            return (Criteria) this;
        }

        public Criteria andUppdateEqualTo(Date value) {
            addCriterion("uppdate =", value, "uppdate");
            return (Criteria) this;
        }

        public Criteria andUppdateNotEqualTo(Date value) {
            addCriterion("uppdate <>", value, "uppdate");
            return (Criteria) this;
        }

        public Criteria andUppdateGreaterThan(Date value) {
            addCriterion("uppdate >", value, "uppdate");
            return (Criteria) this;
        }

        public Criteria andUppdateGreaterThanOrEqualTo(Date value) {
            addCriterion("uppdate >=", value, "uppdate");
            return (Criteria) this;
        }

        public Criteria andUppdateLessThan(Date value) {
            addCriterion("uppdate <", value, "uppdate");
            return (Criteria) this;
        }

        public Criteria andUppdateLessThanOrEqualTo(Date value) {
            addCriterion("uppdate <=", value, "uppdate");
            return (Criteria) this;
        }

        public Criteria andUppdateIn(List<Date> values) {
            addCriterion("uppdate in", values, "uppdate");
            return (Criteria) this;
        }

        public Criteria andUppdateNotIn(List<Date> values) {
            addCriterion("uppdate not in", values, "uppdate");
            return (Criteria) this;
        }

        public Criteria andUppdateBetween(Date value1, Date value2) {
            addCriterion("uppdate between", value1, value2, "uppdate");
            return (Criteria) this;
        }

        public Criteria andUppdateNotBetween(Date value1, Date value2) {
            addCriterion("uppdate not between", value1, value2, "uppdate");
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