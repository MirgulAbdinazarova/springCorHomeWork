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
    @Value("${person.age}")
    private Integer age;
    @Autowired
    @Qualifier("dog")
    private Animal animal;


    public Person(Animal animal) {
        this.animal = animal;

    }

    public void aboutAnimal() {
        animal.AnimalMinus();
        animal.AnimalPlus();
    }


    @Override
    public String toString() {
        return "Person  " +
                "name='" + name + '\'' +
                ", age=" + age+" " + animal;
    }

}
