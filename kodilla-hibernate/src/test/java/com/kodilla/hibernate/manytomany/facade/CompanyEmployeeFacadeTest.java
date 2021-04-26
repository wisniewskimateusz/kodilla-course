package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Transactional
@SpringBootTest
public class CompanyEmployeeFacadeTest {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyFacade companyFacade;

    @Test
    void testFindCompany() throws FacadeExceptions {
        //Given
        Company google = new Company("Google");
        Company microsoft = new Company("Microsoft");

        //When
        companyDao.save(google);
        companyDao.save(microsoft);

        List<Company> companyList = companyFacade.findCompanyByPartOfName("mic");

        //Then
        assertEquals(1, companyList.size());
    }

    @Test
    void testFindEmployee() throws FacadeExceptions {
        //Given
        Employee john = new Employee("John", "Smith");
        Employee pablo = new Employee("Pablo", "Escobar");

        //When
        employeeDao.save(john);
        employeeDao.save(pablo);
        List<Employee> employeeList = companyFacade.findEmployeeByPartOfName("pab");

        //Then
        assertEquals(1, employeeList.size());
    }
}