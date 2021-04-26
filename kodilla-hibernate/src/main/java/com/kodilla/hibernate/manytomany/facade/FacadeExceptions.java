package com.kodilla.hibernate.manytomany.facade;

public class FacadeExceptions extends Exception {
    public static String ERR_EMPLOYEE_NAME_NOT_FOUND = "Employee Not found.";
    public static String ERR_COMPANY_NAME_NOT_FOUND = "Company Not found.";

    public FacadeExceptions(String message) {
        super(message);
    }
}