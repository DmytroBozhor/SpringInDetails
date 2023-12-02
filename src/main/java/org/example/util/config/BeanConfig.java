package org.example.util.config;

import org.example.entity.Cat;
import org.example.entity.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:beans.properties")
public class BeanConfig {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;

    @Bean("canBean")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Cat cat() {
        return new Cat();
    }

    @Bean("personBean")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person person() {
        return new Person(cat(), name, age);
    }

}
