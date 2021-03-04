package com.example.webdoc.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Ning.wang
 */
@Data
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVO {
    @ApiModelProperty(value = "姓名", required = true)
    private String name;
    @ApiModelProperty(value = "性别 0:未知 1:男 2:女 ", allowableValues = "0,1,2")
    private Integer gender;
    @ApiModelProperty(value = "年龄")
    private Integer age;

    public static UserVO getMockUser() {
        return UserVO.builder()
                .name("demo")
                .gender(1)
                .age(20)
                .build();
    }
}
