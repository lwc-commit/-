package com.lwc.graduation;

import com.lwc.graduation.mapper.UserMapper;
import com.lwc.graduation.pojo.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.lwc.graduation.mapper")
class GraduationApplicationTests {


	@Test
	void contextLoads() {
	}
	@Test
	public void test11(){
		System.out.println("sadasd");

	}

}
