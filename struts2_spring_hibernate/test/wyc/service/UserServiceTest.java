package wyc.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wyc.service.UserService;

public class UserServiceTest {
	@Test
	public void testList() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(ac);
//		UserService us = (UserService) ac.getBean("userService");
//		System.out.println(us.getList().size());
	}
}
