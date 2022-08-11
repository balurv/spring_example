package com.main;

import com.example1.beans.Vehicle;
import com.example1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exampl1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle2",Vehicle.class);
        System.out.println(veh.getName());
    }
}
