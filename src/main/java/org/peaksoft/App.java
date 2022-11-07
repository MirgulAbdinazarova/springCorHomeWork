package org.peaksoft;
import org.peaksoft.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Person person = context.getBean("person",Person.class);
        System.out.println(person);
        person.aboutAnimal();

        context.close();
    }
}
