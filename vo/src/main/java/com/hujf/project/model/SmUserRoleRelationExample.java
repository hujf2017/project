package com.hujf.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmUserRoleRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmUserRoleRelationExample() {
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

        public Criteria andUserRolePkIsNull() {
            addCriterion("user_role_pk is null");
            return (Criteria) this;
        }

        public Criteria andUserRolePkIsNotNull() {
            addCriterion("user_role_pk is not null");
            return (Criteria) this;
        }

        public Criteria andUserRolePkEqualTo(String value) {
            addCriterion("user_role_pk =", value, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkNotEqualTo(String value) {
            addCriterion("user_role_pk <>", value, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkGreaterThan(String value) {
            addCriterion("user_role_pk >", value, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkGreaterThanOrEqualTo(String value) {
            addCriterion("user_role_pk >=", value, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkLessThan(String value) {
            addCriterion("user_role_pk <", value, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkLessThanOrEqualTo(String value) {
            addCriterion("user_role_pk <=", value, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkLike(String value) {
            addCriterion("user_role_pk like", value, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkNotLike(String value) {
            addCriterion("user_role_pk not like", value, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkIn(List<String> values) {
            addCriterion("user_role_pk in", values, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkNotIn(List<String> values) {
            addCriterion("user_role_pk not in", values, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkBetween(String value1, String value2) {
            addCriterion("user_role_pk between", value1, value2, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andUserRolePkNotBetween(String value1, String value2) {
            addCriterion("user_role_pk not between", value1, value2, "userRolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkIsNull() {
            addCriterion("role_pk is null");
            return (Criteria) this;
        }

        public Criteria andRolePkIsNotNull() {
            addCriterion("role_pk is not null");
            return (Criteria) this;
        }

        public Criteria andRolePkEqualTo(String value) {
            addCriterion("role_pk =", value, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkNotEqualTo(String value) {
            addCriterion("role_pk <>", value, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkGreaterThan(String value) {
            addCriterion("role_pk >", value, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkGreaterThanOrEqualTo(String value) {
            addCriterion("role_pk >=", value, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkLessThan(String value) {
            addCriterion("role_pk <", value, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkLessThanOrEqualTo(String value) {
            addCriterion("role_pk <=", value, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkLike(String value) {
            addCriterion("role_pk like", value, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkNotLike(String value) {
            addCriterion("role_pk not like", value, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkIn(List<String> values) {
            addCriterion("role_pk in", values, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkNotIn(List<String> values) {
            addCriterion("role_pk not in", values, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkBetween(String value1, String value2) {
            addCriterion("role_pk between", value1, value2, "rolePk");
            return (Criteria) this;
        }

        public Criteria andRolePkNotBetween(String value1, String value2) {
            addCriterion("role_pk not between", value1, value2, "rolePk");
            return (Criteria) this;
        }

        public Criteria andUserPkIsNull() {
            addCriterion("user_pk is null");
            return (Criteria) this;
        }

        public Criteria andUserPkIsNotNull() {
            addCriterion("user_pk is not null");
            return (Criteria) this;
        }

        public Criteria andUserPkEqualTo(String value) {
            addCriterion("user_pk =", value, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkNotEqualTo(String value) {
            addCriterion("user_pk <>", value, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkGreaterThan(String value) {
            addCriterion("user_pk >", value, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkGreaterThanOrEqualTo(String value) {
            addCriterion("user_pk >=", value, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkLessThan(String value) {
            addCriterion("user_pk <", value, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkLessThanOrEqualTo(String value) {
            addCriterion("user_pk <=", value, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkLike(String value) {
            addCriterion("user_pk like", value, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkNotLike(String value) {
            addCriterion("user_pk not like", value, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkIn(List<String> values) {
            addCriterion("user_pk in", values, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkNotIn(List<String> values) {
            addCriterion("user_pk not in", values, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkBetween(String value1, String value2) {
            addCriterion("user_pk between", value1, value2, "userPk");
            return (Criteria) this;
        }

        public Criteria andUserPkNotBetween(String value1, String value2) {
            addCriterion("user_pk not between", value1, value2, "userPk");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
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