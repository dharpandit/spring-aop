package com.pandit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Application  implements CommandLineRunner{
    @Autowired
    Math math;

    public static void main( String[] args ){
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }

    public void run (String... args) throws Exception{
        System.out.println( math.multiply( 4, 3 ) );



    }
}
