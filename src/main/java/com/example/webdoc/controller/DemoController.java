package com.example.webdoc.controller;

import com.example.webdoc.controller.vo.Result;
import com.example.webdoc.controller.vo.UserVO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * 用户相关接口
 */
@RestController
@RequestMapping("user")
@Api("用户相关接口")
public class DemoController {

    @PostMapping("create")
    @ApiOperation(value = "用户创建")
    public Result<Integer> create(@RequestBody UserVO userVO) {
        return new Result<>(1);
    }

    @PutMapping("update")
    @ApiOperation(value = "用户更新")
    public Result<Integer> update(@RequestBody UserVO userVO) {
        return new Result<>(1);
    }

    @GetMapping("detail/{id}")
    @ApiOperation(value = "用户详情")
    @ApiImplicitParam(name = "id", value = "用户Id", paramType = "path", required = true, dataType = "Integer")
    public Result<UserVO> detail(@PathVariable("id") Integer id) {
        return new Result<>(UserVO.getMockUser());
    }

    @DeleteMapping("delete/{id}")
    @ApiOperation(value = "用户删除")
    @ApiImplicitParam(name = "id", value = "用户Id", paramType = "path", required = true, dataType = "Integer")
    public Result<Integer> delete(@PathVariable("id") Integer id) {
        return new Result<>(1);
    }
}
