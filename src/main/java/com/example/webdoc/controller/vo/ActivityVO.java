package com.example.webdoc.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ActivityVO {
    @ApiModelProperty(value = "活动id")
    private Integer id;
    @ApiModelProperty(value = "活动名称")
    private String name;
    @ApiModelProperty(value = "活动描述")
    private String desc;

    public static ActivityVO mock() {
        return ActivityVO.builder()
                .id(1)
                .name("demo")
                .desc("demo activity")
                .build();
    }
}
