package com.pcanabarro.spring.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;
import com.pcanabarro.spring.project.entities.Product;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectApplicationTests {
    @Test
    public void testSaveStudent() {
        RestTemplate restTemplate = new RestTemplate();
        Product p = restTemplate.getForObject("http://localhost/products/1", Product.class);
        Assertions.assertEquals("Arroz", p.getName());
    }
}
