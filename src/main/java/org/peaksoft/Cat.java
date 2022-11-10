package org.peaksoft;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@AllArgsConstructor
@Component
@ToString
public class Cat implements Animal{
    @Value("${cat.name}")
    private String name;
    @Value("${cat.color}")
    private String color;





    @Override
    public void AnimalPlus() {
        System.out.println("Myshei lovit");
    }

    @Override
    public void AnimalMinus() {
        System.out.println("mypkaet");
    }
}
