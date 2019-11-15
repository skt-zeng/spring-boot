package com.zeng.helloquick;

import com.zeng.helloquick.bean.Persion;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class HelloQuickApplicationTests {

	@Autowired
    Persion persion;

	@Autowired
	ApplicationContext ioc;

	@Test
	void contextLoads() {
		boolean b= ioc.containsBean("personService");
	    System.out.print(b);
	}



}
