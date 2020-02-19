package com.zicheng.friday.controller;

import com.zicheng.friday.base.result.PageTableRequest;
import com.zicheng.friday.base.result.Results;
import com.zicheng.friday.model.SysRole;
import com.zicheng.friday.model.SysUser;
import com.zicheng.friday.service.RoleService;
import com.zicheng.friday.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("role")
@Slf4j
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/all")
    @ResponseBody
    public Results<SysRole> getAll() {
        log.info("RoleController.getAll()");
        return roleService.getAllRoles();
    }
}
