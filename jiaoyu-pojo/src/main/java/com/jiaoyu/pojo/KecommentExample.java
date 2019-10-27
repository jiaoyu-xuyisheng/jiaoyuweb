package com.jiaoyu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KecommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KecommentExample() {
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

        public Criteria andKeidIsNull() {
            addCriterion("keid is null");
            return (Criteria) this;
        }

        public Criteria andKeidIsNotNull() {
            addCriterion("keid is not null");
            return (Criteria) this;
        }

        public Criteria andKeidEqualTo(Integer value) {
            addCriterion("keid =", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidNotEqualTo(Integer value) {
            addCriterion("keid <>", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidGreaterThan(Integer value) {
            addCriterion("keid >", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("keid >=", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidLessThan(Integer value) {
            addCriterion("keid <", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidLessThanOrEqualTo(Integer value) {
            addCriterion("keid <=", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidIn(List<Integer> values) {
            addCriterion("keid in", values, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidNotIn(List<Integer> values) {
            addCriterion("keid not in", values, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidBetween(Integer value1, Integer value2) {
            addCriterion("keid between", value1, value2, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidNotBetween(Integer value1, Integer value2) {
            addCriterion("keid not between", value1, value2, "keid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCommentdateIsNull() {
            addCriterion("commentDate is null");
            return (Criteria) this;
        }

        public Criteria andCommentdateIsNotNull() {
            addCriterion("commentDate is not null");
            return (Criteria) this;
        }

        public Criteria andCommentdateEqualTo(Date value) {
            addCriterion("commentDate =", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotEqualTo(Date value) {
            addCriterion("commentDate <>", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateGreaterThan(Date value) {
            addCriterion("commentDate >", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("commentDate >=", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateLessThan(Date value) {
            addCriterion("commentDate <", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateLessThanOrEqualTo(Date value) {
            addCriterion("commentDate <=", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateIn(List<Date> values) {
            addCriterion("commentDate in", values, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotIn(List<Date> values) {
            addCriterion("commentDate not in", values, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateBetween(Date value1, Date value2) {
            addCriterion("commentDate between", value1, value2, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotBetween(Date value1, Date value2) {
            addCriterion("commentDate not between", value1, value2, "commentdate");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(String value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(String value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(String value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(String value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(String value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(String value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLike(String value) {
            addCriterion("start like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotLike(String value) {
            addCriterion("start not like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<String> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<String> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(String value1, String value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(String value1, String value2) {
            addCriterion("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andUserimgurlIsNull() {
            addCriterion("userimgurl is null");
            return (Criteria) this;
        }

        public Criteria andUserimgurlIsNotNull() {
            addCriterion("userimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andUserimgurlEqualTo(String value) {
            addCriterion("userimgurl =", value, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlNotEqualTo(String value) {
            addCriterion("userimgurl <>", value, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlGreaterThan(String value) {
            addCriterion("userimgurl >", value, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("userimgurl >=", value, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlLessThan(String value) {
            addCriterion("userimgurl <", value, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlLessThanOrEqualTo(String value) {
            addCriterion("userimgurl <=", value, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlLike(String value) {
            addCriterion("userimgurl like", value, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlNotLike(String value) {
            addCriterion("userimgurl not like", value, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlIn(List<String> values) {
            addCriterion("userimgurl in", values, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlNotIn(List<String> values) {
            addCriterion("userimgurl not in", values, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlBetween(String value1, String value2) {
            addCriterion("userimgurl between", value1, value2, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andUserimgurlNotBetween(String value1, String value2) {
            addCriterion("userimgurl not between", value1, value2, "userimgurl");
            return (Criteria) this;
        }

        public Criteria andComcontentIsNull() {
            addCriterion("comcontent is null");
            return (Criteria) this;
        }

        public Criteria andComcontentIsNotNull() {
            addCriterion("comcontent is not null");
            return (Criteria) this;
        }

        public Criteria andComcontentEqualTo(String value) {
            addCriterion("comcontent =", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentNotEqualTo(String value) {
            addCriterion("comcontent <>", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentGreaterThan(String value) {
            addCriterion("comcontent >", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentGreaterThanOrEqualTo(String value) {
            addCriterion("comcontent >=", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentLessThan(String value) {
            addCriterion("comcontent <", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentLessThanOrEqualTo(String value) {
            addCriterion("comcontent <=", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentLike(String value) {
            addCriterion("comcontent like", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentNotLike(String value) {
            addCriterion("comcontent not like", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentIn(List<String> values) {
            addCriterion("comcontent in", values, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentNotIn(List<String> values) {
            addCriterion("comcontent not in", values, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentBetween(String value1, String value2) {
            addCriterion("comcontent between", value1, value2, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentNotBetween(String value1, String value2) {
            addCriterion("comcontent not between", value1, value2, "comcontent");
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