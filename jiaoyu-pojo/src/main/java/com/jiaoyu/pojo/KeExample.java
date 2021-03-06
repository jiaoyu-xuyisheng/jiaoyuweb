package com.jiaoyu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeExample() {
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

        public Criteria andPublisherIdIsNull() {
            addCriterion("publisher_id is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIsNotNull() {
            addCriterion("publisher_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherIdEqualTo(String value) {
            addCriterion("publisher_id =", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotEqualTo(String value) {
            addCriterion("publisher_id <>", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThan(String value) {
            addCriterion("publisher_id >", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_id >=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThan(String value) {
            addCriterion("publisher_id <", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLessThanOrEqualTo(String value) {
            addCriterion("publisher_id <=", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdLike(String value) {
            addCriterion("publisher_id like", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotLike(String value) {
            addCriterion("publisher_id not like", value, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdIn(List<String> values) {
            addCriterion("publisher_id in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotIn(List<String> values) {
            addCriterion("publisher_id not in", values, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdBetween(String value1, String value2) {
            addCriterion("publisher_id between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andPublisherIdNotBetween(String value1, String value2) {
            addCriterion("publisher_id not between", value1, value2, "publisherId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
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

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(String value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(String value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(String value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(String value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(String value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(String value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLike(String value) {
            addCriterion("charge like", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotLike(String value) {
            addCriterion("charge not like", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<String> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<String> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(String value1, String value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(String value1, String value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andPageViewIsNull() {
            addCriterion("page_view is null");
            return (Criteria) this;
        }

        public Criteria andPageViewIsNotNull() {
            addCriterion("page_view is not null");
            return (Criteria) this;
        }

        public Criteria andPageViewEqualTo(Integer value) {
            addCriterion("page_view =", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotEqualTo(Integer value) {
            addCriterion("page_view <>", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewGreaterThan(Integer value) {
            addCriterion("page_view >", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_view >=", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewLessThan(Integer value) {
            addCriterion("page_view <", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewLessThanOrEqualTo(Integer value) {
            addCriterion("page_view <=", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewIn(List<Integer> values) {
            addCriterion("page_view in", values, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotIn(List<Integer> values) {
            addCriterion("page_view not in", values, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewBetween(Integer value1, Integer value2) {
            addCriterion("page_view between", value1, value2, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotBetween(Integer value1, Integer value2) {
            addCriterion("page_view not between", value1, value2, "pageView");
            return (Criteria) this;
        }

        public Criteria andSmIdIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSmIdIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmIdEqualTo(Integer value) {
            addCriterion("sm_id =", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotEqualTo(Integer value) {
            addCriterion("sm_id <>", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThan(Integer value) {
            addCriterion("sm_id >", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_id >=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThan(Integer value) {
            addCriterion("sm_id <", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThanOrEqualTo(Integer value) {
            addCriterion("sm_id <=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdIn(List<Integer> values) {
            addCriterion("sm_id in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotIn(List<Integer> values) {
            addCriterion("sm_id not in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdBetween(Integer value1, Integer value2) {
            addCriterion("sm_id between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_id not between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andPopularIsNull() {
            addCriterion("popular is null");
            return (Criteria) this;
        }

        public Criteria andPopularIsNotNull() {
            addCriterion("popular is not null");
            return (Criteria) this;
        }

        public Criteria andPopularEqualTo(Integer value) {
            addCriterion("popular =", value, "popular");
            return (Criteria) this;
        }

        public Criteria andPopularNotEqualTo(Integer value) {
            addCriterion("popular <>", value, "popular");
            return (Criteria) this;
        }

        public Criteria andPopularGreaterThan(Integer value) {
            addCriterion("popular >", value, "popular");
            return (Criteria) this;
        }

        public Criteria andPopularGreaterThanOrEqualTo(Integer value) {
            addCriterion("popular >=", value, "popular");
            return (Criteria) this;
        }

        public Criteria andPopularLessThan(Integer value) {
            addCriterion("popular <", value, "popular");
            return (Criteria) this;
        }

        public Criteria andPopularLessThanOrEqualTo(Integer value) {
            addCriterion("popular <=", value, "popular");
            return (Criteria) this;
        }

        public Criteria andPopularIn(List<Integer> values) {
            addCriterion("popular in", values, "popular");
            return (Criteria) this;
        }

        public Criteria andPopularNotIn(List<Integer> values) {
            addCriterion("popular not in", values, "popular");
            return (Criteria) this;
        }

        public Criteria andPopularBetween(Integer value1, Integer value2) {
            addCriterion("popular between", value1, value2, "popular");
            return (Criteria) this;
        }

        public Criteria andPopularNotBetween(Integer value1, Integer value2) {
            addCriterion("popular not between", value1, value2, "popular");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNull() {
            addCriterion("details is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("details is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("details =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("details <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("details >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("details >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("details <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("details <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("details like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("details not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("details in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("details not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("details between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("details not between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsOkIsNull() {
            addCriterion("is_ok is null");
            return (Criteria) this;
        }

        public Criteria andIsOkIsNotNull() {
            addCriterion("is_ok is not null");
            return (Criteria) this;
        }

        public Criteria andIsOkEqualTo(Integer value) {
            addCriterion("is_ok =", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkNotEqualTo(Integer value) {
            addCriterion("is_ok <>", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkGreaterThan(Integer value) {
            addCriterion("is_ok >", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_ok >=", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkLessThan(Integer value) {
            addCriterion("is_ok <", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkLessThanOrEqualTo(Integer value) {
            addCriterion("is_ok <=", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkIn(List<Integer> values) {
            addCriterion("is_ok in", values, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkNotIn(List<Integer> values) {
            addCriterion("is_ok not in", values, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkBetween(Integer value1, Integer value2) {
            addCriterion("is_ok between", value1, value2, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkNotBetween(Integer value1, Integer value2) {
            addCriterion("is_ok not between", value1, value2, "isOk");
            return (Criteria) this;
        }

        public Criteria andFirstIdIsNull() {
            addCriterion("first_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstIdIsNotNull() {
            addCriterion("first_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstIdEqualTo(Integer value) {
            addCriterion("first_id =", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdNotEqualTo(Integer value) {
            addCriterion("first_id <>", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdGreaterThan(Integer value) {
            addCriterion("first_id >", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_id >=", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdLessThan(Integer value) {
            addCriterion("first_id <", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_id <=", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdIn(List<Integer> values) {
            addCriterion("first_id in", values, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdNotIn(List<Integer> values) {
            addCriterion("first_id not in", values, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdBetween(Integer value1, Integer value2) {
            addCriterion("first_id between", value1, value2, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_id not between", value1, value2, "firstId");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeIsNull() {
            addCriterion("kecreatetime is null");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeIsNotNull() {
            addCriterion("kecreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeEqualTo(Date value) {
            addCriterion("kecreatetime =", value, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeNotEqualTo(Date value) {
            addCriterion("kecreatetime <>", value, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeGreaterThan(Date value) {
            addCriterion("kecreatetime >", value, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("kecreatetime >=", value, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeLessThan(Date value) {
            addCriterion("kecreatetime <", value, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("kecreatetime <=", value, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeIn(List<Date> values) {
            addCriterion("kecreatetime in", values, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeNotIn(List<Date> values) {
            addCriterion("kecreatetime not in", values, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeBetween(Date value1, Date value2) {
            addCriterion("kecreatetime between", value1, value2, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andKecreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("kecreatetime not between", value1, value2, "kecreatetime");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andIntendedIsNull() {
            addCriterion("intended is null");
            return (Criteria) this;
        }

        public Criteria andIntendedIsNotNull() {
            addCriterion("intended is not null");
            return (Criteria) this;
        }

        public Criteria andIntendedEqualTo(String value) {
            addCriterion("intended =", value, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedNotEqualTo(String value) {
            addCriterion("intended <>", value, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedGreaterThan(String value) {
            addCriterion("intended >", value, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedGreaterThanOrEqualTo(String value) {
            addCriterion("intended >=", value, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedLessThan(String value) {
            addCriterion("intended <", value, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedLessThanOrEqualTo(String value) {
            addCriterion("intended <=", value, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedLike(String value) {
            addCriterion("intended like", value, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedNotLike(String value) {
            addCriterion("intended not like", value, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedIn(List<String> values) {
            addCriterion("intended in", values, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedNotIn(List<String> values) {
            addCriterion("intended not in", values, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedBetween(String value1, String value2) {
            addCriterion("intended between", value1, value2, "intended");
            return (Criteria) this;
        }

        public Criteria andIntendedNotBetween(String value1, String value2) {
            addCriterion("intended not between", value1, value2, "intended");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("courseType is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("courseType is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("courseType =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("courseType <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("courseType >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("courseType >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("courseType <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("courseType <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("courseType like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("courseType not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("courseType in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("courseType not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("courseType between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("courseType not between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointIsNull() {
            addCriterion("konwledgePoint is null");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointIsNotNull() {
            addCriterion("konwledgePoint is not null");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointEqualTo(String value) {
            addCriterion("konwledgePoint =", value, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointNotEqualTo(String value) {
            addCriterion("konwledgePoint <>", value, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointGreaterThan(String value) {
            addCriterion("konwledgePoint >", value, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointGreaterThanOrEqualTo(String value) {
            addCriterion("konwledgePoint >=", value, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointLessThan(String value) {
            addCriterion("konwledgePoint <", value, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointLessThanOrEqualTo(String value) {
            addCriterion("konwledgePoint <=", value, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointLike(String value) {
            addCriterion("konwledgePoint like", value, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointNotLike(String value) {
            addCriterion("konwledgePoint not like", value, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointIn(List<String> values) {
            addCriterion("konwledgePoint in", values, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointNotIn(List<String> values) {
            addCriterion("konwledgePoint not in", values, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointBetween(String value1, String value2) {
            addCriterion("konwledgePoint between", value1, value2, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andKonwledgepointNotBetween(String value1, String value2) {
            addCriterion("konwledgePoint not between", value1, value2, "konwledgepoint");
            return (Criteria) this;
        }

        public Criteria andSemIsNull() {
            addCriterion("sem is null");
            return (Criteria) this;
        }

        public Criteria andSemIsNotNull() {
            addCriterion("sem is not null");
            return (Criteria) this;
        }

        public Criteria andSemEqualTo(String value) {
            addCriterion("sem =", value, "sem");
            return (Criteria) this;
        }

        public Criteria andSemNotEqualTo(String value) {
            addCriterion("sem <>", value, "sem");
            return (Criteria) this;
        }

        public Criteria andSemGreaterThan(String value) {
            addCriterion("sem >", value, "sem");
            return (Criteria) this;
        }

        public Criteria andSemGreaterThanOrEqualTo(String value) {
            addCriterion("sem >=", value, "sem");
            return (Criteria) this;
        }

        public Criteria andSemLessThan(String value) {
            addCriterion("sem <", value, "sem");
            return (Criteria) this;
        }

        public Criteria andSemLessThanOrEqualTo(String value) {
            addCriterion("sem <=", value, "sem");
            return (Criteria) this;
        }

        public Criteria andSemLike(String value) {
            addCriterion("sem like", value, "sem");
            return (Criteria) this;
        }

        public Criteria andSemNotLike(String value) {
            addCriterion("sem not like", value, "sem");
            return (Criteria) this;
        }

        public Criteria andSemIn(List<String> values) {
            addCriterion("sem in", values, "sem");
            return (Criteria) this;
        }

        public Criteria andSemNotIn(List<String> values) {
            addCriterion("sem not in", values, "sem");
            return (Criteria) this;
        }

        public Criteria andSemBetween(String value1, String value2) {
            addCriterion("sem between", value1, value2, "sem");
            return (Criteria) this;
        }

        public Criteria andSemNotBetween(String value1, String value2) {
            addCriterion("sem not between", value1, value2, "sem");
            return (Criteria) this;
        }

        public Criteria andSecondnameIsNull() {
            addCriterion("secondname is null");
            return (Criteria) this;
        }

        public Criteria andSecondnameIsNotNull() {
            addCriterion("secondname is not null");
            return (Criteria) this;
        }

        public Criteria andSecondnameEqualTo(String value) {
            addCriterion("secondname =", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotEqualTo(String value) {
            addCriterion("secondname <>", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameGreaterThan(String value) {
            addCriterion("secondname >", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameGreaterThanOrEqualTo(String value) {
            addCriterion("secondname >=", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLessThan(String value) {
            addCriterion("secondname <", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLessThanOrEqualTo(String value) {
            addCriterion("secondname <=", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameLike(String value) {
            addCriterion("secondname like", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotLike(String value) {
            addCriterion("secondname not like", value, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameIn(List<String> values) {
            addCriterion("secondname in", values, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotIn(List<String> values) {
            addCriterion("secondname not in", values, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameBetween(String value1, String value2) {
            addCriterion("secondname between", value1, value2, "secondname");
            return (Criteria) this;
        }

        public Criteria andSecondnameNotBetween(String value1, String value2) {
            addCriterion("secondname not between", value1, value2, "secondname");
            return (Criteria) this;
        }

        public Criteria andFistnameIsNull() {
            addCriterion("fistname is null");
            return (Criteria) this;
        }

        public Criteria andFistnameIsNotNull() {
            addCriterion("fistname is not null");
            return (Criteria) this;
        }

        public Criteria andFistnameEqualTo(String value) {
            addCriterion("fistname =", value, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameNotEqualTo(String value) {
            addCriterion("fistname <>", value, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameGreaterThan(String value) {
            addCriterion("fistname >", value, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameGreaterThanOrEqualTo(String value) {
            addCriterion("fistname >=", value, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameLessThan(String value) {
            addCriterion("fistname <", value, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameLessThanOrEqualTo(String value) {
            addCriterion("fistname <=", value, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameLike(String value) {
            addCriterion("fistname like", value, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameNotLike(String value) {
            addCriterion("fistname not like", value, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameIn(List<String> values) {
            addCriterion("fistname in", values, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameNotIn(List<String> values) {
            addCriterion("fistname not in", values, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameBetween(String value1, String value2) {
            addCriterion("fistname between", value1, value2, "fistname");
            return (Criteria) this;
        }

        public Criteria andFistnameNotBetween(String value1, String value2) {
            addCriterion("fistname not between", value1, value2, "fistname");
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