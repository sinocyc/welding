package com.lsmri.welding.portal.dto;

import lombok.Data;

/**
 * @author Cui Yicheng
 * @date 2020-10-18
 */
@Data
public class ListWeldingQuery {

    private String position;

    private Double thickness;

    private Double width;

    private Double gap;

    private Integer angle;

}
