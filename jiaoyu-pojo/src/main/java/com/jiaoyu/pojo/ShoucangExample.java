package com.jiaoyu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShoucangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoucangExample() {
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

        public Criteria andScidIsNull() {
            addCriterion("scid is null");
            return (Criteria) this;
        }

        public Criteria andScidIsNotNull() {
            addCriterion("scid is not null");
            return (Criteria) this;
        }

        public Criteria andScidEqualTo(Integer value) {
            addCriterion("scid =", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotEqualTo(Integer value) {
            addCriterion("scid <>", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThan(Integer value) {
            addCriterion("scid >", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scid >=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThan(Integer value) {
            addCriterion("scid <", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThanOrEqualTo(Integer value) {
            addCriterion("scid <=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidIn(List<Integer> values) {
            addCriterion("scid in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotIn(List<Integer> values) {
            addCriterion("scid not in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidBetween(Integer value1, Integer value2) {
            addCriterion("scid between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotBetween(Integer value1, Integer value2) {
            addCriterion("scid not between", value1, value2, "scid");
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

        public Criteria andKeurlIsNull() {
            addCriterion("keurl is null");
            return (Criteria) this;
        }

        public Criteria andKeurlIsNotNull() {
            addCriterion("keurl is not null");
            return (Criteria) this;
        }

        public Criteria andKeurlEqualTo(String value) {
            addCriterion("keurl =", value, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlNotEqualTo(String value) {
            addCriterion("keurl <>", value, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlGreaterThan(String value) {
            addCriterion("keurl >", value, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlGreaterThanOrEqualTo(String value) {
            addCriterion("keurl >=", value, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlLessThan(String value) {
            addCriterion("keurl <", value, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlLessThanOrEqualTo(String value) {
            addCriterion("keurl <=", value, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlLike(String value) {
            addCriterion("keurl like", value, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlNotLike(String value) {
            addCriterion("keurl not like", value, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlIn(List<String> values) {
            addCriterion("keurl in", values, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlNotIn(List<String> values) {
            addCriterion("keurl not in", values, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlBetween(String value1, String value2) {
            addCriterion("keurl between", value1, value2, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeurlNotBetween(String value1, String value2) {
            addCriterion("keurl not between", value1, value2, "keurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlIsNull() {
            addCriterion("keimgurl is null");
            return (Criteria) this;
        }

        public Criteria andKeimgurlIsNotNull() {
            addCriterion("keimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andKeimgurlEqualTo(String value) {
            addCriterion("keimgurl =", value, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlNotEqualTo(String value) {
            addCriterion("keimgurl <>", value, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlGreaterThan(String value) {
            addCriterion("keimgurl >", value, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("keimgurl >=", value, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlLessThan(String value) {
            addCriterion("keimgurl <", value, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlLessThanOrEqualTo(String value) {
            addCriterion("keimgurl <=", value, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlLike(String value) {
            addCriterion("keimgurl like", value, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlNotLike(String value) {
            addCriterion("keimgurl not like", value, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlIn(List<String> values) {
            addCriterion("keimgurl in", values, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlNotIn(List<String> values) {
            addCriterion("keimgurl not in", values, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlBetween(String value1, String value2) {
            addCriterion("keimgurl between", value1, value2, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeimgurlNotBetween(String value1, String value2) {
            addCriterion("keimgurl not between", value1, value2, "keimgurl");
            return (Criteria) this;
        }

        public Criteria andKeviewIsNull() {
            addCriterion("keview is null");
            return (Criteria) this;
        }

        public Criteria andKeviewIsNotNull() {
            addCriterion("keview is not null");
            return (Criteria) this;
        }

        public Criteria andKeviewEqualTo(Integer value) {
            addCriterion("keview =", value, "keview");
            return (Criteria) this;
        }

        public Criteria andKeviewNotEqualTo(Integer value) {
            addCriterion("keview <>", value, "keview");
            return (Criteria) this;
        }

        public Criteria andKeviewGreaterThan(Integer value) {
            addCriterion("keview >", value, "keview");
            return (Criteria) this;
        }

        public Criteria andKeviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("keview >=", value, "keview");
            return (Criteria) this;
        }

        public Criteria andKeviewLessThan(Integer value) {
            addCriterion("keview <", value, "keview");
            return (Criteria) this;
        }

        public Criteria andKeviewLessThanOrEqualTo(Integer value) {
            addCriterion("keview <=", value, "keview");
            return (Criteria) this;
        }

        public Criteria andKeviewIn(List<Integer> values) {
            addCriterion("keview in", values, "keview");
            return (Criteria) this;
        }

        public Criteria andKeviewNotIn(List<Integer> values) {
            addCriterion("keview not in", values, "keview");
            return (Criteria) this;
        }

        public Criteria andKeviewBetween(Integer value1, Integer value2) {
            addCriterion("keview between", value1, value2, "keview");
            return (Criteria) this;
        }

        public Criteria andKeviewNotBetween(Integer value1, Integer value2) {
            addCriterion("keview not between", value1, value2, "keview");
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