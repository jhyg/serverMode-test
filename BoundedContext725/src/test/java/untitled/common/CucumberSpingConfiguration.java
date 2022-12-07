package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext725Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext725Application.class })
public class CucumberSpingConfiguration {}
