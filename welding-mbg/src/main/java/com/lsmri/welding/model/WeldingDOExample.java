package com.lsmri.welding.model;

import java.util.ArrayList;
import java.util.List;

public class WeldingDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeldingDOExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBaseMetalIsNull() {
            addCriterion("base_metal is null");
            return (Criteria) this;
        }

        public Criteria andBaseMetalIsNotNull() {
            addCriterion("base_metal is not null");
            return (Criteria) this;
        }

        public Criteria andBaseMetalEqualTo(String value) {
            addCriterion("base_metal =", value, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalNotEqualTo(String value) {
            addCriterion("base_metal <>", value, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalGreaterThan(String value) {
            addCriterion("base_metal >", value, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalGreaterThanOrEqualTo(String value) {
            addCriterion("base_metal >=", value, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalLessThan(String value) {
            addCriterion("base_metal <", value, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalLessThanOrEqualTo(String value) {
            addCriterion("base_metal <=", value, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalLike(String value) {
            addCriterion("base_metal like", value, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalNotLike(String value) {
            addCriterion("base_metal not like", value, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalIn(List<String> values) {
            addCriterion("base_metal in", values, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalNotIn(List<String> values) {
            addCriterion("base_metal not in", values, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalBetween(String value1, String value2) {
            addCriterion("base_metal between", value1, value2, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andBaseMetalNotBetween(String value1, String value2) {
            addCriterion("base_metal not between", value1, value2, "baseMetal");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialIsNull() {
            addCriterion("weld_material is null");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialIsNotNull() {
            addCriterion("weld_material is not null");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialEqualTo(String value) {
            addCriterion("weld_material =", value, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialNotEqualTo(String value) {
            addCriterion("weld_material <>", value, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialGreaterThan(String value) {
            addCriterion("weld_material >", value, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("weld_material >=", value, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialLessThan(String value) {
            addCriterion("weld_material <", value, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialLessThanOrEqualTo(String value) {
            addCriterion("weld_material <=", value, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialLike(String value) {
            addCriterion("weld_material like", value, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialNotLike(String value) {
            addCriterion("weld_material not like", value, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialIn(List<String> values) {
            addCriterion("weld_material in", values, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialNotIn(List<String> values) {
            addCriterion("weld_material not in", values, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialBetween(String value1, String value2) {
            addCriterion("weld_material between", value1, value2, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andWeldMaterialNotBetween(String value1, String value2) {
            addCriterion("weld_material not between", value1, value2, "weldMaterial");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNull() {
            addCriterion("thickness is null");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNotNull() {
            addCriterion("thickness is not null");
            return (Criteria) this;
        }

        public Criteria andThicknessEqualTo(Double value) {
            addCriterion("thickness =", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotEqualTo(Double value) {
            addCriterion("thickness <>", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThan(Double value) {
            addCriterion("thickness >", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThanOrEqualTo(Double value) {
            addCriterion("thickness >=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThan(Double value) {
            addCriterion("thickness <", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThanOrEqualTo(Double value) {
            addCriterion("thickness <=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessIn(List<Double> values) {
            addCriterion("thickness in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotIn(List<Double> values) {
            addCriterion("thickness not in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessBetween(Double value1, Double value2) {
            addCriterion("thickness between", value1, value2, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotBetween(Double value1, Double value2) {
            addCriterion("thickness not between", value1, value2, "thickness");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Double value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Double value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Double value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Double value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Double value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Double> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Double> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Double value1, Double value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Double value1, Double value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andGapIsNull() {
            addCriterion("gap is null");
            return (Criteria) this;
        }

        public Criteria andGapIsNotNull() {
            addCriterion("gap is not null");
            return (Criteria) this;
        }

        public Criteria andGapEqualTo(Double value) {
            addCriterion("gap =", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapNotEqualTo(Double value) {
            addCriterion("gap <>", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapGreaterThan(Double value) {
            addCriterion("gap >", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapGreaterThanOrEqualTo(Double value) {
            addCriterion("gap >=", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapLessThan(Double value) {
            addCriterion("gap <", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapLessThanOrEqualTo(Double value) {
            addCriterion("gap <=", value, "gap");
            return (Criteria) this;
        }

        public Criteria andGapIn(List<Double> values) {
            addCriterion("gap in", values, "gap");
            return (Criteria) this;
        }

        public Criteria andGapNotIn(List<Double> values) {
            addCriterion("gap not in", values, "gap");
            return (Criteria) this;
        }

        public Criteria andGapBetween(Double value1, Double value2) {
            addCriterion("gap between", value1, value2, "gap");
            return (Criteria) this;
        }

        public Criteria andGapNotBetween(Double value1, Double value2) {
            addCriterion("gap not between", value1, value2, "gap");
            return (Criteria) this;
        }

        public Criteria andAngleIsNull() {
            addCriterion("angle is null");
            return (Criteria) this;
        }

        public Criteria andAngleIsNotNull() {
            addCriterion("angle is not null");
            return (Criteria) this;
        }

        public Criteria andAngleEqualTo(Integer value) {
            addCriterion("angle =", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleNotEqualTo(Integer value) {
            addCriterion("angle <>", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleGreaterThan(Integer value) {
            addCriterion("angle >", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleGreaterThanOrEqualTo(Integer value) {
            addCriterion("angle >=", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleLessThan(Integer value) {
            addCriterion("angle <", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleLessThanOrEqualTo(Integer value) {
            addCriterion("angle <=", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleIn(List<Integer> values) {
            addCriterion("angle in", values, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleNotIn(List<Integer> values) {
            addCriterion("angle not in", values, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleBetween(Integer value1, Integer value2) {
            addCriterion("angle between", value1, value2, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleNotBetween(Integer value1, Integer value2) {
            addCriterion("angle not between", value1, value2, "angle");
            return (Criteria) this;
        }

        public Criteria andLayerIsNull() {
            addCriterion("layer is null");
            return (Criteria) this;
        }

        public Criteria andLayerIsNotNull() {
            addCriterion("layer is not null");
            return (Criteria) this;
        }

        public Criteria andLayerEqualTo(Integer value) {
            addCriterion("layer =", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotEqualTo(Integer value) {
            addCriterion("layer <>", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThan(Integer value) {
            addCriterion("layer >", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("layer >=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThan(Integer value) {
            addCriterion("layer <", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThanOrEqualTo(Integer value) {
            addCriterion("layer <=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerIn(List<Integer> values) {
            addCriterion("layer in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotIn(List<Integer> values) {
            addCriterion("layer not in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerBetween(Integer value1, Integer value2) {
            addCriterion("layer between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("layer not between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(Integer value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(Integer value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(Integer value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(Integer value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(Integer value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(Integer value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<Integer> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<Integer> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(Integer value1, Integer value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(Integer value1, Integer value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedIsNull() {
            addCriterion("wire_feed_speed is null");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedIsNotNull() {
            addCriterion("wire_feed_speed is not null");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedEqualTo(Double value) {
            addCriterion("wire_feed_speed =", value, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedNotEqualTo(Double value) {
            addCriterion("wire_feed_speed <>", value, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedGreaterThan(Double value) {
            addCriterion("wire_feed_speed >", value, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("wire_feed_speed >=", value, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedLessThan(Double value) {
            addCriterion("wire_feed_speed <", value, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedLessThanOrEqualTo(Double value) {
            addCriterion("wire_feed_speed <=", value, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedIn(List<Double> values) {
            addCriterion("wire_feed_speed in", values, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedNotIn(List<Double> values) {
            addCriterion("wire_feed_speed not in", values, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedBetween(Double value1, Double value2) {
            addCriterion("wire_feed_speed between", value1, value2, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andWireFeedSpeedNotBetween(Double value1, Double value2) {
            addCriterion("wire_feed_speed not between", value1, value2, "wireFeedSpeed");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNull() {
            addCriterion("voltage is null");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNotNull() {
            addCriterion("voltage is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageEqualTo(Double value) {
            addCriterion("voltage =", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotEqualTo(Double value) {
            addCriterion("voltage <>", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThan(Double value) {
            addCriterion("voltage >", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThanOrEqualTo(Double value) {
            addCriterion("voltage >=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThan(Double value) {
            addCriterion("voltage <", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThanOrEqualTo(Double value) {
            addCriterion("voltage <=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageIn(List<Double> values) {
            addCriterion("voltage in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotIn(List<Double> values) {
            addCriterion("voltage not in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageBetween(Double value1, Double value2) {
            addCriterion("voltage between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotBetween(Double value1, Double value2) {
            addCriterion("voltage not between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNull() {
            addCriterion("current is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNotNull() {
            addCriterion("current is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEqualTo(Double value) {
            addCriterion("current =", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotEqualTo(Double value) {
            addCriterion("current <>", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThan(Double value) {
            addCriterion("current >", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThanOrEqualTo(Double value) {
            addCriterion("current >=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThan(Double value) {
            addCriterion("current <", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThanOrEqualTo(Double value) {
            addCriterion("current <=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentIn(List<Double> values) {
            addCriterion("current in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotIn(List<Double> values) {
            addCriterion("current not in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentBetween(Double value1, Double value2) {
            addCriterion("current between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotBetween(Double value1, Double value2) {
            addCriterion("current not between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("speed is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("speed is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(Double value) {
            addCriterion("speed =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(Double value) {
            addCriterion("speed <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(Double value) {
            addCriterion("speed >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("speed >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(Double value) {
            addCriterion("speed <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(Double value) {
            addCriterion("speed <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<Double> values) {
            addCriterion("speed in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<Double> values) {
            addCriterion("speed not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(Double value1, Double value2) {
            addCriterion("speed between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(Double value1, Double value2) {
            addCriterion("speed not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(Integer value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(Integer value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(Integer value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(Integer value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<Integer> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<Integer> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIsNull() {
            addCriterion("amplitude is null");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIsNotNull() {
            addCriterion("amplitude is not null");
            return (Criteria) this;
        }

        public Criteria andAmplitudeEqualTo(Double value) {
            addCriterion("amplitude =", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotEqualTo(Double value) {
            addCriterion("amplitude <>", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeGreaterThan(Double value) {
            addCriterion("amplitude >", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("amplitude >=", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLessThan(Double value) {
            addCriterion("amplitude <", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLessThanOrEqualTo(Double value) {
            addCriterion("amplitude <=", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIn(List<Double> values) {
            addCriterion("amplitude in", values, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotIn(List<Double> values) {
            addCriterion("amplitude not in", values, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeBetween(Double value1, Double value2) {
            addCriterion("amplitude between", value1, value2, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotBetween(Double value1, Double value2) {
            addCriterion("amplitude not between", value1, value2, "amplitude");
            return (Criteria) this;
        }

        public Criteria andWaitlIsNull() {
            addCriterion("waitl is null");
            return (Criteria) this;
        }

        public Criteria andWaitlIsNotNull() {
            addCriterion("waitl is not null");
            return (Criteria) this;
        }

        public Criteria andWaitlEqualTo(Double value) {
            addCriterion("waitl =", value, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitlNotEqualTo(Double value) {
            addCriterion("waitl <>", value, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitlGreaterThan(Double value) {
            addCriterion("waitl >", value, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitlGreaterThanOrEqualTo(Double value) {
            addCriterion("waitl >=", value, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitlLessThan(Double value) {
            addCriterion("waitl <", value, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitlLessThanOrEqualTo(Double value) {
            addCriterion("waitl <=", value, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitlIn(List<Double> values) {
            addCriterion("waitl in", values, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitlNotIn(List<Double> values) {
            addCriterion("waitl not in", values, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitlBetween(Double value1, Double value2) {
            addCriterion("waitl between", value1, value2, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitlNotBetween(Double value1, Double value2) {
            addCriterion("waitl not between", value1, value2, "waitl");
            return (Criteria) this;
        }

        public Criteria andWaitaIsNull() {
            addCriterion("waita is null");
            return (Criteria) this;
        }

        public Criteria andWaitaIsNotNull() {
            addCriterion("waita is not null");
            return (Criteria) this;
        }

        public Criteria andWaitaEqualTo(Double value) {
            addCriterion("waita =", value, "waita");
            return (Criteria) this;
        }

        public Criteria andWaitaNotEqualTo(Double value) {
            addCriterion("waita <>", value, "waita");
            return (Criteria) this;
        }

        public Criteria andWaitaGreaterThan(Double value) {
            addCriterion("waita >", value, "waita");
            return (Criteria) this;
        }

        public Criteria andWaitaGreaterThanOrEqualTo(Double value) {
            addCriterion("waita >=", value, "waita");
            return (Criteria) this;
        }

        public Criteria andWaitaLessThan(Double value) {
            addCriterion("waita <", value, "waita");
            return (Criteria) this;
        }

        public Criteria andWaitaLessThanOrEqualTo(Double value) {
            addCriterion("waita <=", value, "waita");
            return (Criteria) this;
        }

        public Criteria andWaitaIn(List<Double> values) {
            addCriterion("waita in", values, "waita");
            return (Criteria) this;
        }

        public Criteria andWaitaNotIn(List<Double> values) {
            addCriterion("waita not in", values, "waita");
            return (Criteria) this;
        }

        public Criteria andWaitaBetween(Double value1, Double value2) {
            addCriterion("waita between", value1, value2, "waita");
            return (Criteria) this;
        }

        public Criteria andWaitaNotBetween(Double value1, Double value2) {
            addCriterion("waita not between", value1, value2, "waita");
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