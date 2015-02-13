package br.com.forum;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;
public class TestData {

	
	
	@Test
	public void testBeans() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-data.xml");
		assertNotNull(context);
	}

}
