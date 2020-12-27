package com.digitalplanet.evaluation.alptekintalan;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

@SpringBootTest
class alptekintalanApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test1() {
		System.out.println("Dene");
	}

	@Test
	void lamda() {

		IntStream.range(1,5);
		System.out.println("Dene");
	}

}
