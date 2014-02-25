package com.xetius;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommandLineApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CommandLineConfiguration.class);
        CommandLineService commandLineService = context.getBean(CommandLineService.class);
        System.out.println(commandLineService.run());
    }
}
