package io.recruitment.assessment.api;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.recruitment.assessment.api.controllers.HelloController;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private HelloController controller;

    @Test
    void contextLoads() throws Exception {
    	assertThat(controller).isNotNull();
    }

}
