package org.aop.util.web.domain;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary implements Library {
    @Override
    public void addBook() {
        System.out.println("Class: UniLibrary. Method: addBook()");
    }
}
