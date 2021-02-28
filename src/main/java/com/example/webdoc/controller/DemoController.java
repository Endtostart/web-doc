package com.example.webdoc.controller;

import com.example.webdoc.controller.vo.ActivityVO;
import com.example.webdoc.controller.vo.Result;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("activity")
@Api("活动相关接口")
public class DemoController {

    @GetMapping("detail/{id}")
    @ApiOperation(value="活动详情")
    @ApiImplicitParam(name = "id", value = "活动Id",  paramType = "path", required = true, dataType =  "Integer")
    public Result<ActivityVO> detail(@PathVariable("id") Integer id) {
        // mock activity info
        return new Result<>(ActivityVO.mock());
    }

    @PostMapping("save")
    @ApiOperation(value="活动新增")
    public Result<Integer> save(@RequestBody ActivityVO activity) {
        return new Result<>(1);
    }

}
