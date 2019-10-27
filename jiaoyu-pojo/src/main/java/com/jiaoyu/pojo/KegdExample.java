package com.jiaoyu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KegdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KegdExample() {
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

        public Criteria andGdidIsNull() {
            addCriterion("gdid is null");
            return (Criteria) this;
        }

        public Criteria andGdidIsNotNull() {
            addCriterion("gdid is not null");
            return (Criteria) this;
        }

        public Criteria andGdidEqualTo(Integer value) {
            addCriterion("gdid =", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotEqualTo(Integer value) {
            addCriterion("gdid <>", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidGreaterThan(Integer value) {
            addCriterion("gdid >", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdid >=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidLessThan(Integer value) {
            addCriterion("gdid <", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidLessThanOrEqualTo(Integer value) {
            addCriterion("gdid <=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidIn(List<Integer> values) {
            addCriterion("gdid in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotIn(List<Integer> values) {
            addCriterion("gdid not in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidBetween(Integer value1, Integer value2) {
            addCriterion("gdid between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotBetween(Integer value1, Integer value2) {
            addCriterion("gdid not between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdimgIsNull() {
            addCriterion("gdimg is null");
            return (Criteria) this;
        }

        public Criteria andGdimgIsNotNull() {
            addCriterion("gdimg is not null");
            return (Criteria) this;
        }

        public Criteria andGdimgEqualTo(String value) {
            addCriterion("gdimg =", value, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgNotEqualTo(String value) {
            addCriterion("gdimg <>", value, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgGreaterThan(String value) {
            addCriterion("gdimg >", value, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgGreaterThanOrEqualTo(String value) {
            addCriterion("gdimg >=", value, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgLessThan(String value) {
            addCriterion("gdimg <", value, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgLessThanOrEqualTo(String value) {
            addCriterion("gdimg <=", value, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgLike(String value) {
            addCriterion("gdimg like", value, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgNotLike(String value) {
            addCriterion("gdimg not like", value, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgIn(List<String> values) {
            addCriterion("gdimg in", values, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgNotIn(List<String> values) {
            addCriterion("gdimg not in", values, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgBetween(String value1, String value2) {
            addCriterion("gdimg between", value1, value2, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdimgNotBetween(String value1, String value2) {
            addCriterion("gdimg not between", value1, value2, "gdimg");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundIsNull() {
            addCriterion("gdbackground is null");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundIsNotNull() {
            addCriterion("gdbackground is not null");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundEqualTo(String value) {
            addCriterion("gdbackground =", value, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundNotEqualTo(String value) {
            addCriterion("gdbackground <>", value, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundGreaterThan(String value) {
            addCriterion("gdbackground >", value, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("gdbackground >=", value, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundLessThan(String value) {
            addCriterion("gdbackground <", value, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundLessThanOrEqualTo(String value) {
            addCriterion("gdbackground <=", value, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundLike(String value) {
            addCriterion("gdbackground like", value, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundNotLike(String value) {
            addCriterion("gdbackground not like", value, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundIn(List<String> values) {
            addCriterion("gdbackground in", values, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundNotIn(List<String> values) {
            addCriterion("gdbackground not in", values, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundBetween(String value1, String value2) {
            addCriterion("gdbackground between", value1, value2, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdbackgroundNotBetween(String value1, String value2) {
            addCriterion("gdbackground not between", value1, value2, "gdbackground");
            return (Criteria) this;
        }

        public Criteria andGdurlIsNull() {
            addCriterion("gdurl is null");
            return (Criteria) this;
        }

        public Criteria andGdurlIsNotNull() {
            addCriterion("gdurl is not null");
            return (Criteria) this;
        }

        public Criteria andGdurlEqualTo(String value) {
            addCriterion("gdurl =", value, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlNotEqualTo(String value) {
            addCriterion("gdurl <>", value, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlGreaterThan(String value) {
            addCriterion("gdurl >", value, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlGreaterThanOrEqualTo(String value) {
            addCriterion("gdurl >=", value, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlLessThan(String value) {
            addCriterion("gdurl <", value, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlLessThanOrEqualTo(String value) {
            addCriterion("gdurl <=", value, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlLike(String value) {
            addCriterion("gdurl like", value, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlNotLike(String value) {
            addCriterion("gdurl not like", value, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlIn(List<String> values) {
            addCriterion("gdurl in", values, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlNotIn(List<String> values) {
            addCriterion("gdurl not in", values, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlBetween(String value1, String value2) {
            addCriterion("gdurl between", value1, value2, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdurlNotBetween(String value1, String value2) {
            addCriterion("gdurl not between", value1, value2, "gdurl");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeIsNull() {
            addCriterion("gdcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeIsNotNull() {
            addCriterion("gdcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeEqualTo(Date value) {
            addCriterion("gdcreatetime =", value, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeNotEqualTo(Date value) {
            addCriterion("gdcreatetime <>", value, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeGreaterThan(Date value) {
            addCriterion("gdcreatetime >", value, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gdcreatetime >=", value, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeLessThan(Date value) {
            addCriterion("gdcreatetime <", value, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("gdcreatetime <=", value, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeIn(List<Date> values) {
            addCriterion("gdcreatetime in", values, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeNotIn(List<Date> values) {
            addCriterion("gdcreatetime not in", values, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeBetween(Date value1, Date value2) {
            addCriterion("gdcreatetime between", value1, value2, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("gdcreatetime not between", value1, value2, "gdcreatetime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeIsNull() {
            addCriterion("gdendtime is null");
            return (Criteria) this;
        }

        public Criteria andGdendtimeIsNotNull() {
            addCriterion("gdendtime is not null");
            return (Criteria) this;
        }

        public Criteria andGdendtimeEqualTo(Date value) {
            addCriterion("gdendtime =", value, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeNotEqualTo(Date value) {
            addCriterion("gdendtime <>", value, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeGreaterThan(Date value) {
            addCriterion("gdendtime >", value, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gdendtime >=", value, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeLessThan(Date value) {
            addCriterion("gdendtime <", value, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeLessThanOrEqualTo(Date value) {
            addCriterion("gdendtime <=", value, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeIn(List<Date> values) {
            addCriterion("gdendtime in", values, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeNotIn(List<Date> values) {
            addCriterion("gdendtime not in", values, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeBetween(Date value1, Date value2) {
            addCriterion("gdendtime between", value1, value2, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andGdendtimeNotBetween(Date value1, Date value2) {
            addCriterion("gdendtime not between", value1, value2, "gdendtime");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andGduseridIsNull() {
            addCriterion("gduserid is null");
            return (Criteria) this;
        }

        public Criteria andGduseridIsNotNull() {
            addCriterion("gduserid is not null");
            return (Criteria) this;
        }

        public Criteria andGduseridEqualTo(Integer value) {
            addCriterion("gduserid =", value, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGduseridNotEqualTo(Integer value) {
            addCriterion("gduserid <>", value, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGduseridGreaterThan(Integer value) {
            addCriterion("gduserid >", value, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("gduserid >=", value, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGduseridLessThan(Integer value) {
            addCriterion("gduserid <", value, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGduseridLessThanOrEqualTo(Integer value) {
            addCriterion("gduserid <=", value, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGduseridIn(List<Integer> values) {
            addCriterion("gduserid in", values, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGduseridNotIn(List<Integer> values) {
            addCriterion("gduserid not in", values, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGduseridBetween(Integer value1, Integer value2) {
            addCriterion("gduserid between", value1, value2, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("gduserid not between", value1, value2, "gduserid");
            return (Criteria) this;
        }

        public Criteria andGdusernameIsNull() {
            addCriterion("gdusername is null");
            return (Criteria) this;
        }

        public Criteria andGdusernameIsNotNull() {
            addCriterion("gdusername is not null");
            return (Criteria) this;
        }

        public Criteria andGdusernameEqualTo(String value) {
            addCriterion("gdusername =", value, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameNotEqualTo(String value) {
            addCriterion("gdusername <>", value, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameGreaterThan(String value) {
            addCriterion("gdusername >", value, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameGreaterThanOrEqualTo(String value) {
            addCriterion("gdusername >=", value, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameLessThan(String value) {
            addCriterion("gdusername <", value, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameLessThanOrEqualTo(String value) {
            addCriterion("gdusername <=", value, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameLike(String value) {
            addCriterion("gdusername like", value, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameNotLike(String value) {
            addCriterion("gdusername not like", value, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameIn(List<String> values) {
            addCriterion("gdusername in", values, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameNotIn(List<String> values) {
            addCriterion("gdusername not in", values, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameBetween(String value1, String value2) {
            addCriterion("gdusername between", value1, value2, "gdusername");
            return (Criteria) this;
        }

        public Criteria andGdusernameNotBetween(String value1, String value2) {
            addCriterion("gdusername not between", value1, value2, "gdusername");
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