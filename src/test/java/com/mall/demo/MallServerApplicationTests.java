package com.mall.demo;

import com.mall.demo.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

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


	@Test
	void testRedis(){
		//连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		//设置 redis 字符串数据
		jedis.set("runoobkey", "www.runoob.com");
		// 获取存储的数据并输出
		System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
	}

	@Test
	void testRedis2(){
		Jedis jedis = RedisUtil.getConnecttion();
		jedis.set("province", "val");
		Map<String, String> map = new HashMap<>();
		map.put("key", "val");
		map.put("key1", "val1");
		map.put("key2", "val2");
		jedis.hset("testHash", map);
		jedis.close();
	}

}
