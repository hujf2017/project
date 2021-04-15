package com.hujf.project.es.doMain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author Hujf
 * @title: PmsProduct
 * @date 2021/3/2414:08
 * @description: TODO
 * */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class PmsProduct {
    private Long id;

    private Long brandId;

    private Long productCategoryId;

    private Long productAttributeCategoryId;

    private String name;

    private String pic;

    private Integer deleteStatus;

    private Integer publishStatus;

    private Integer sale;

    private BigDecimal price;

    private BigDecimal originalPrice;

    private Integer stock;

    private String unit;

    private BigDecimal weight;

    private String description;
}
