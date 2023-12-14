package org.aop.util.web.domain;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary {

    private static final String schoolName = "High School Chouma";

    public void addBook() {
        System.out.println("Class: SchoolLibrary. Method: addBook()");
    }

    public String getSchoolName() {
        return schoolName;
    }
}
