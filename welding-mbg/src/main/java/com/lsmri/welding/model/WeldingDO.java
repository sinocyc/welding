package com.lsmri.welding.model;

import java.io.Serializable;

public class WeldingDO implements Serializable {
    private Long id;

    private String baseMetal;

    private String weldMaterial;

    private Long thickness;

    private String position;

    private String type;

    private Double width;

    private Double gap;

    private Integer angle;

    private Integer layer;

    private Integer path;

    private Double wireFeedSpeed;

    private Double voltage;

    private Double current;

    private Double speed;

    private Integer frequency;

    private Integer amplitude;

    private Double waitl;

    private Double waita;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaseMetal() {
        return baseMetal;
    }

    public void setBaseMetal(String baseMetal) {
        this.baseMetal = baseMetal;
    }

    public String getWeldMaterial() {
        return weldMaterial;
    }

    public void setWeldMaterial(String weldMaterial) {
        this.weldMaterial = weldMaterial;
    }

    public Long getThickness() {
        return thickness;
    }

    public void setThickness(Long thickness) {
        this.thickness = thickness;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getGap() {
        return gap;
    }

    public void setGap(Double gap) {
        this.gap = gap;
    }

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getPath() {
        return path;
    }

    public void setPath(Integer path) {
        this.path = path;
    }

    public Double getWireFeedSpeed() {
        return wireFeedSpeed;
    }

    public void setWireFeedSpeed(Double wireFeedSpeed) {
        this.wireFeedSpeed = wireFeedSpeed;
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
    }

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(Integer amplitude) {
        this.amplitude = amplitude;
    }

    public Double getWaitl() {
        return waitl;
    }

    public void setWaitl(Double waitl) {
        this.waitl = waitl;
    }

    public Double getWaita() {
        return waita;
    }

    public void setWaita(Double waita) {
        this.waita = waita;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", baseMetal=").append(baseMetal);
        sb.append(", weldMaterial=").append(weldMaterial);
        sb.append(", thickness=").append(thickness);
        sb.append(", position=").append(position);
        sb.append(", type=").append(type);
        sb.append(", width=").append(width);
        sb.append(", gap=").append(gap);
        sb.append(", angle=").append(angle);
        sb.append(", layer=").append(layer);
        sb.append(", path=").append(path);
        sb.append(", wireFeedSpeed=").append(wireFeedSpeed);
        sb.append(", voltage=").append(voltage);
        sb.append(", current=").append(current);
        sb.append(", speed=").append(speed);
        sb.append(", frequency=").append(frequency);
        sb.append(", amplitude=").append(amplitude);
        sb.append(", waitl=").append(waitl);
        sb.append(", waita=").append(waita);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}