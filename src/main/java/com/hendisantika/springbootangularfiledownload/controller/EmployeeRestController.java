package com.hendisantika.springbootangularfiledownload.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hendisantika.springbootangularfiledownload.service.EmployeeService;
import com.hendisantika.springbootangularfiledownload.vo.EmployeeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
@RequestMapping(value = "/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeVo> getEmployeeList() {
        return employeeService.getEmployeeList();
    }

    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadFile() throws Exception {
        List<EmployeeVo> employees = employeeService.getEmployeeList();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(employees);
        byte[] isr = json.getBytes();
        String fileName = "employees.json";
        HttpHeaders respHeaders = new HttpHeaders();
        respHeaders.setContentLength(isr.length);
        respHeaders.setContentType(new MediaType("text", "json"));
        respHeaders.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        respHeaders.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
        return new ResponseEntity<byte[]>(isr, respHeaders, HttpStatus.OK);
    }
}
