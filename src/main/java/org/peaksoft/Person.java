package org.peaksoft;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@NoArgsConstructor
@Component
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.name2}")
    private String name2;
    @Value("${person.age}")
    private Integer age;

    private Animal animal1;
    private Animal animal2;

    @Autowired
    public Person(@Qualifier("dog") Animal animal1,
                  @Qualifier("cat") Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;

    }

    public void aboutAnimal1() {
        animal1.AnimalMinus();
        animal1.AnimalPlus();
    }

    public void aboutAnimal2() {
        animal2.AnimalMinus();
        animal2.AnimalPlus();
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age+" " + animal1+"   name="+name2+" "+animal2;
    }

}
