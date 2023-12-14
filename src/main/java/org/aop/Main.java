package org.aop;

import org.aop.util.config.BeanConfiguration;
import org.aop.util.web.domain.Library;
import org.aop.util.web.domain.SchoolLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Library uniLibrary = context.getBean("uniLibraryBean", Library.class);
        uniLibrary.addBook();

        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
        schoolLibrary.addBook();

        System.out.println(schoolLibrary.getSchoolName());

        context.close();
    }
}
