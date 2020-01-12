package com.hendisantika.springbootangularfiledownload.service;

import com.hendisantika.springbootangularfiledownload.entity.Employee;
import com.hendisantika.springbootangularfiledownload.repository.EmployeeRepository;
import com.hendisantika.springbootangularfiledownload.vo.EmployeeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-angular-file-download
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/01/20
 * Time: 03.25
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeVo> getEmployeeList() {
        List<Employee> list = employeeRepository.findAll();
        return list.stream().map(emp -> {
            EmployeeVo vo = new EmployeeVo();
            vo.setId(emp.getId());
            vo.setName(emp.getName());
            vo.setEmail(emp.getEmail());
            return vo;
        }).collect(Collectors.toList());
    }

}