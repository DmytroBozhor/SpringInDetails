package org.aop.util.web.domain;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary implements Library {
    @Override
    public void addBook() {
        System.out.println("Class: SchoolLibrary. Method: addBook()");
    }
}
