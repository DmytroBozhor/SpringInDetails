package org.aop;

import org.aop.util.config.BeanConfiguration;
import org.aop.util.web.domain.Library;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Library library = context.getBean("libraryBean", Library.class);
        library.addBook();

        context.close();
    }
}
