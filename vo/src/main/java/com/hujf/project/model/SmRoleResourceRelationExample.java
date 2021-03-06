package com.hujf.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmRoleResourceRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmRoleResourceRelationExample() {
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

        public Criteria andRoleResourcePkIsNull() {
            addCriterion("role_resource_pk is null");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkIsNotNull() {
            addCriterion("role_resource_pk is not null");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkEqualTo(String value) {
            addCriterion("role_resource_pk =", value, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkNotEqualTo(String value) {
            addCriterion("role_resource_pk <>", value, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkGreaterThan(String value) {
            addCriterion("role_resource_pk >", value, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkGreaterThanOrEqualTo(String value) {
            addCriterion("role_resource_pk >=", value, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkLessThan(String value) {
            addCriterion("role_resource_pk <", value, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkLessThanOrEqualTo(String value) {
            addCriterion("role_resource_pk <=", value, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkLike(String value) {
            addCriterion("role_resource_pk like", value, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkNotLike(String value) {
            addCriterion("role_resource_pk not like", value, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkIn(List<String> values) {
            addCriterion("role_resource_pk in", values, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkNotIn(List<String> values) {
            addCriterion("role_resource_pk not in", values, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkBetween(String value1, String value2) {
            addCriterion("role_resource_pk between", value1, value2, "roleResourcePk");
            return (Criteria) this;
        }

        public Criteria andRoleResourcePkNotBetween(String value1, String value2) {
            addCriterion("role_resource_pk not between", value1, value2, "roleResourcePk");
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

        public Criteria andResourcePkIsNull() {
            addCriterion("resource_pk is null");
            return (Criteria) this;
        }

        public Criteria andResourcePkIsNotNull() {
            addCriterion("resource_pk is not null");
            return (Criteria) this;
        }

        public Criteria andResourcePkEqualTo(String value) {
            addCriterion("resource_pk =", value, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkNotEqualTo(String value) {
            addCriterion("resource_pk <>", value, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkGreaterThan(String value) {
            addCriterion("resource_pk >", value, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkGreaterThanOrEqualTo(String value) {
            addCriterion("resource_pk >=", value, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkLessThan(String value) {
            addCriterion("resource_pk <", value, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkLessThanOrEqualTo(String value) {
            addCriterion("resource_pk <=", value, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkLike(String value) {
            addCriterion("resource_pk like", value, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkNotLike(String value) {
            addCriterion("resource_pk not like", value, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkIn(List<String> values) {
            addCriterion("resource_pk in", values, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkNotIn(List<String> values) {
            addCriterion("resource_pk not in", values, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkBetween(String value1, String value2) {
            addCriterion("resource_pk between", value1, value2, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andResourcePkNotBetween(String value1, String value2) {
            addCriterion("resource_pk not between", value1, value2, "resourcePk");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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