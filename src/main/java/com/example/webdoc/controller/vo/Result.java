package com.example.webdoc.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class Result<T> {
    @ApiModelProperty(name = "状态码 0：成功")
    private String code = "0";
    @ApiModelProperty(name = "错误信息")
    private String message;
    @ApiModelProperty(name = "业务数据")
    private T data;

    public Result(T data) {
        this.data = data;
    }
}
