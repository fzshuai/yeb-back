package com.fzshuai.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fzshuai.server.pojo.Employee;
import com.fzshuai.server.pojo.RespBean;
import com.fzshuai.server.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 软件二班傅同学
 * @since 2021-02-22
 */
public interface IEmployeeService extends IService<Employee> {

    /**
     * 获取所有员工(分页)
     *
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 获取工号
     *
     * @return
     */
    RespBean maxWorkID();

    /**
     * 添加员工
     *
     * @param employee
     * @return
     */
    RespBean addEmp(Employee employee);

    /**
     * 查询员工
     *
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);

    /**
     * 获取所有员工账套
     *
     * @param currentPage
     * @param size
     * @return
     */
    RespPageBean getEmployeeWithSalary(Integer currentPage, Integer size);
}
