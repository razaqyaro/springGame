package com.razzyspring.udemyspringcourse;


import com.razzyspring.udemyspringcourse.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpring
{
    public static void main(String[] args) {

       try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class))
       {
            context.getBean(GamingConsole.class).up();
       }

    }
}
