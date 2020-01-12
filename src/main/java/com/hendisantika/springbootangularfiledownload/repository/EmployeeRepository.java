package com.hendisantika.springbootangularfiledownload.repository;

import com.hendisantika.springbootangularfiledownload.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-angular-file-download
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/01/20
 * Time: 03.25
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}