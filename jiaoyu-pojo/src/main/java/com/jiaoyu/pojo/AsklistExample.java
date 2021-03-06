package com.jiaoyu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AsklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AsklistExample() {
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

        public Criteria andAskidIsNull() {
            addCriterion("askid is null");
            return (Criteria) this;
        }

        public Criteria andAskidIsNotNull() {
            addCriterion("askid is not null");
            return (Criteria) this;
        }

        public Criteria andAskidEqualTo(Integer value) {
            addCriterion("askid =", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidNotEqualTo(Integer value) {
            addCriterion("askid <>", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidGreaterThan(Integer value) {
            addCriterion("askid >", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("askid >=", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidLessThan(Integer value) {
            addCriterion("askid <", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidLessThanOrEqualTo(Integer value) {
            addCriterion("askid <=", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidIn(List<Integer> values) {
            addCriterion("askid in", values, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidNotIn(List<Integer> values) {
            addCriterion("askid not in", values, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidBetween(Integer value1, Integer value2) {
            addCriterion("askid between", value1, value2, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidNotBetween(Integer value1, Integer value2) {
            addCriterion("askid not between", value1, value2, "askid");
            return (Criteria) this;
        }

        public Criteria andKeIdIsNull() {
            addCriterion("ke_id is null");
            return (Criteria) this;
        }

        public Criteria andKeIdIsNotNull() {
            addCriterion("ke_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeIdEqualTo(Integer value) {
            addCriterion("ke_id =", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotEqualTo(Integer value) {
            addCriterion("ke_id <>", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdGreaterThan(Integer value) {
            addCriterion("ke_id >", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ke_id >=", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdLessThan(Integer value) {
            addCriterion("ke_id <", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ke_id <=", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdIn(List<Integer> values) {
            addCriterion("ke_id in", values, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotIn(List<Integer> values) {
            addCriterion("ke_id not in", values, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdBetween(Integer value1, Integer value2) {
            addCriterion("ke_id between", value1, value2, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ke_id not between", value1, value2, "keId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAskContainerIsNull() {
            addCriterion("ask_container is null");
            return (Criteria) this;
        }

        public Criteria andAskContainerIsNotNull() {
            addCriterion("ask_container is not null");
            return (Criteria) this;
        }

        public Criteria andAskContainerEqualTo(String value) {
            addCriterion("ask_container =", value, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerNotEqualTo(String value) {
            addCriterion("ask_container <>", value, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerGreaterThan(String value) {
            addCriterion("ask_container >", value, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerGreaterThanOrEqualTo(String value) {
            addCriterion("ask_container >=", value, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerLessThan(String value) {
            addCriterion("ask_container <", value, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerLessThanOrEqualTo(String value) {
            addCriterion("ask_container <=", value, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerLike(String value) {
            addCriterion("ask_container like", value, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerNotLike(String value) {
            addCriterion("ask_container not like", value, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerIn(List<String> values) {
            addCriterion("ask_container in", values, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerNotIn(List<String> values) {
            addCriterion("ask_container not in", values, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerBetween(String value1, String value2) {
            addCriterion("ask_container between", value1, value2, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskContainerNotBetween(String value1, String value2) {
            addCriterion("ask_container not between", value1, value2, "askContainer");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeIsNull() {
            addCriterion("ask_datetime is null");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeIsNotNull() {
            addCriterion("ask_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeEqualTo(Date value) {
            addCriterion("ask_datetime =", value, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeNotEqualTo(Date value) {
            addCriterion("ask_datetime <>", value, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeGreaterThan(Date value) {
            addCriterion("ask_datetime >", value, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ask_datetime >=", value, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeLessThan(Date value) {
            addCriterion("ask_datetime <", value, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ask_datetime <=", value, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeIn(List<Date> values) {
            addCriterion("ask_datetime in", values, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeNotIn(List<Date> values) {
            addCriterion("ask_datetime not in", values, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeBetween(Date value1, Date value2) {
            addCriterion("ask_datetime between", value1, value2, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ask_datetime not between", value1, value2, "askDatetime");
            return (Criteria) this;
        }

        public Criteria andAskTitleIsNull() {
            addCriterion("ask_title is null");
            return (Criteria) this;
        }

        public Criteria andAskTitleIsNotNull() {
            addCriterion("ask_title is not null");
            return (Criteria) this;
        }

        public Criteria andAskTitleEqualTo(String value) {
            addCriterion("ask_title =", value, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleNotEqualTo(String value) {
            addCriterion("ask_title <>", value, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleGreaterThan(String value) {
            addCriterion("ask_title >", value, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ask_title >=", value, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleLessThan(String value) {
            addCriterion("ask_title <", value, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleLessThanOrEqualTo(String value) {
            addCriterion("ask_title <=", value, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleLike(String value) {
            addCriterion("ask_title like", value, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleNotLike(String value) {
            addCriterion("ask_title not like", value, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleIn(List<String> values) {
            addCriterion("ask_title in", values, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleNotIn(List<String> values) {
            addCriterion("ask_title not in", values, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleBetween(String value1, String value2) {
            addCriterion("ask_title between", value1, value2, "askTitle");
            return (Criteria) this;
        }

        public Criteria andAskTitleNotBetween(String value1, String value2) {
            addCriterion("ask_title not between", value1, value2, "askTitle");
            return (Criteria) this;
        }

        public Criteria andViewIsNull() {
            addCriterion("view is null");
            return (Criteria) this;
        }

        public Criteria andViewIsNotNull() {
            addCriterion("view is not null");
            return (Criteria) this;
        }

        public Criteria andViewEqualTo(Integer value) {
            addCriterion("view =", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotEqualTo(Integer value) {
            addCriterion("view <>", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThan(Integer value) {
            addCriterion("view >", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("view >=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThan(Integer value) {
            addCriterion("view <", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThanOrEqualTo(Integer value) {
            addCriterion("view <=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewIn(List<Integer> values) {
            addCriterion("view in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotIn(List<Integer> values) {
            addCriterion("view not in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewBetween(Integer value1, Integer value2) {
            addCriterion("view between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotBetween(Integer value1, Integer value2) {
            addCriterion("view not between", value1, value2, "view");
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

        public Criteria andAskurlIsNull() {
            addCriterion("askurl is null");
            return (Criteria) this;
        }

        public Criteria andAskurlIsNotNull() {
            addCriterion("askurl is not null");
            return (Criteria) this;
        }

        public Criteria andAskurlEqualTo(String value) {
            addCriterion("askurl =", value, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlNotEqualTo(String value) {
            addCriterion("askurl <>", value, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlGreaterThan(String value) {
            addCriterion("askurl >", value, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlGreaterThanOrEqualTo(String value) {
            addCriterion("askurl >=", value, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlLessThan(String value) {
            addCriterion("askurl <", value, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlLessThanOrEqualTo(String value) {
            addCriterion("askurl <=", value, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlLike(String value) {
            addCriterion("askurl like", value, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlNotLike(String value) {
            addCriterion("askurl not like", value, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlIn(List<String> values) {
            addCriterion("askurl in", values, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlNotIn(List<String> values) {
            addCriterion("askurl not in", values, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlBetween(String value1, String value2) {
            addCriterion("askurl between", value1, value2, "askurl");
            return (Criteria) this;
        }

        public Criteria andAskurlNotBetween(String value1, String value2) {
            addCriterion("askurl not between", value1, value2, "askurl");
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