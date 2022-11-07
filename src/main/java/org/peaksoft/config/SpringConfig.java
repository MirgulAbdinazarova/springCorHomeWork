package org.peaksoft.config;

import org.peaksoft.Dog;
import org.peaksoft.Person;
import org.springframework.context.annotation.*;
@Configuration
@ComponentScan("org.peaksoft")
@PropertySource("classpath:application.properties")

public class SpringConfig {

}
