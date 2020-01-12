package com.hendisantika.springbootangularfiledownload.controller;

import com.hendisantika.springbootangularfiledownload.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-angular-file-download
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/01/20
 * Time: 03.26
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;
}
