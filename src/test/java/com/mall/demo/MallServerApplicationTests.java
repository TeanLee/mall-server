package com.mall.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@SpringBootTest
class MallServerApplicationTests {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	void contextLoads() {
		Long aLong = jdbcTemplate.queryForObject("SELECT count(*) FROM mall.category;", Long.class);
		log.info("记录总数：{}",aLong);
	}

}
