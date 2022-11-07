package org.peaksoft;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@ToString
@Setter
@Getter
@Component
public class Dog implements Animal{
    @Value("${dog.breed}")
    private String breed;
    @Value("${dog.color}")
    private String color;


    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;

    }

    @Override
    public void AnimalPlus() {
        System.out.println("Бишоны умные сообразительные и веселые собаки.");
    }

    @Override
    public void AnimalMinus() {
        System.out.println("Очень шумный.");
    }
}
