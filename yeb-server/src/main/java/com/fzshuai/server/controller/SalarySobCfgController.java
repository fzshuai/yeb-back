package com.fzshuai.server.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.fzshuai.server.pojo.Employee;
import com.fzshuai.server.pojo.RespBean;
import com.fzshuai.server.pojo.RespPageBean;
import com.fzshuai.server.pojo.Salary;
import com.fzshuai.server.service.IEmployeeService;
import com.fzshuai.server.service.ISalaryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 软件二班傅同学
 * @description 员工账套
 * @date 2021-03-21 16:50
 */
@RestController
@RequestMapping("/salary/sobcfg")
public class SalarySobCfgController {

    @Autowired
    private ISalaryService salaryService;
    @Autowired
    private IEmployeeService employeeService;

    @ApiOperation(value = "获取所有工资账套")
    @GetMapping("/salaries")
    public List<Salary> getAllSalaries() {
        return salaryService.list();
    }

    @ApiOperation(value = "获取所有员工账套")
    @GetMapping("/")
    public RespPageBean getEmployeeWithSalary(@RequestParam(defaultValue = "1") Integer currentPage,
                                                   @RequestParam(defaultValue = "10") Integer size) {
        return employeeService.getEmployeeWithSalary(currentPage, size);
    }

    @ApiOperation(value = "更新员工账套")
    @PutMapping("/")
    public RespBean updateEmployeeSalary(Integer eid, Integer sid) {
        if (employeeService.update(new UpdateWrapper<Employee>().set("salaryId", sid).eq("id", eid))) {
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
