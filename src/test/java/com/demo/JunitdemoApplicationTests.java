package com.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitdemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	private Calculator c=new Calculator();
	
	@Test
	void testSum() {
		int exRes=12;
		int acRes=c.doSum(4,1,7);
		assertThat(acRes).isEqualTo(exRes);
	}
	
	@Test
	void testprod() {
		int exRes=10;
		int acRes=c.doproduct(5,2);
		assertThat(acRes).isEqualTo(exRes);
		
	}

	@Test
	void testequal() {
		Boolean acRes= c.campTonum(5,5);
		assertThat(acRes).isTrue();
		
	}
}
