package com.lsmri.welding.portal.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Cui Yicheng
 * @date 2020-10-18
 */
@Data
public class AddWeldingQuery {

    @NotBlank
    private String baseMetal;

    @NotBlank
    private String weldMaterial;

    @NotNull
    private Double thickness;

    @NotBlank
    private String position;

    @NotBlank
    private String type;

    @NotNull
    private Double width;

    @NotNull
    private Double gap;

    @NotNull
    private Integer angle;

    private Integer layer;

    private Integer path;

    @NotNull
    private Double wireFeedSpeed;

    @NotNull
    private Double voltage;

    @NotNull
    private Double current;

    @NotNull
    private Double speed;

    private Integer frequency;

    private Double amplitude;

    private Double waitl;

    private Double waita;

}
