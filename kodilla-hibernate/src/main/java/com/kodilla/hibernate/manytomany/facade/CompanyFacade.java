package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);
    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    @Autowired
    public CompanyFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> findEmployeeByPartOfName(String part) throws FacadeExceptions {
        boolean wasError = false;
        List<Employee> employees = employeeDao.findByPartOfName(part);
        LOGGER.info("Searching employee...");
        if (employees.size() <= 0) {
            LOGGER.error(FacadeExceptions.ERR_EMPLOYEE_NAME_NOT_FOUND);
            wasError = true;
            if (wasError) {
                LOGGER.info("Error");
                throw new FacadeExceptions(FacadeExceptions.ERR_EMPLOYEE_NAME_NOT_FOUND);
            }
        }
        return employees;
    }

    public List<Company> findCompanyByPartOfName(String part) throws FacadeExceptions {
        boolean wasError = false;
        List<Company> companies = companyDao.findByPartOfName(part);
        LOGGER.info("Searching company...");
        if (companies.size() <= 0) {
            LOGGER.error(FacadeExceptions.ERR_COMPANY_NAME_NOT_FOUND);
            wasError = true;
            if (wasError) {
                LOGGER.info("Error");
                throw new FacadeExceptions(FacadeExceptions.ERR_COMPANY_NAME_NOT_FOUND);
            }
        }
        return companies;
    }
}