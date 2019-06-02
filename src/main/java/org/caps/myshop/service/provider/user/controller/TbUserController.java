package org.caps.myshop.service.provider.user.controller;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.caps.myshop.commons.domain.TbUser;
import org.caps.myshop.commons.service.TbUserService;
import org.caps.myshop.commons.web.AbstractBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
public class TbUserController extends AbstractBaseController<TbUser> {
    @Autowired
    private TbUserService tbUserService;

    @ApiOperation(value = "用户分页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "笔数", required = true, paramType = "path", dataType = "int")
    })
    @PostMapping(value = "/page/{num}/{size}")
    public PageInfo<TbUser> page(
            @ApiParam(name = "用户信息", required = false) @RequestBody TbUser tbUser,
            @PathVariable int num,
            @PathVariable int size
    ) {
        PageInfo<TbUser> page = tbUserService.page(tbUser, num, size);
        return page;
    }
}