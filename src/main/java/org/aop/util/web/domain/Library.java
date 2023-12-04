package org.aop.util.web.domain;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void addBook() {
        System.out.println("Add book method has been invoked");
    }
}
