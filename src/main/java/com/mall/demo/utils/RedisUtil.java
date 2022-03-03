package com.mall.demo.utils;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtil {
    private static JedisPool pool = null;

    static {
        //1. 配置连接池
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();

        /*
            除了 properties来读取配置文件往外
            在Java.util包 resourceBundle就是用来解析properties
        */

        // 读取配置文件
//        ResourceBundle rb = ResourceBundle.getBundle("redis");
//        int minIdle = Integer.parseInt(rb.getString("redis.minIdle"));
//        int maxIdle = Integer.parseInt(rb.getString("redis.maxIdle"));
//        int maxTotal = Integer.parseInt(rb.getString("redis.maxTotal"));
//        int maxWaitMillis = Integer.parseInt(rb.getString("redis.maxWaitMillis"));
//        String host = rb.getString("redis.host");
//        int port = Integer.parseInt(rb.getString("redis.port"));
//
//        poolConfig.setMinIdle(minIdle);
//        poolConfig.setMaxIdle(maxIdle);
//        poolConfig.setMaxWaitMillis(maxWaitMillis);
//        poolConfig.setMaxTotal(maxTotal);

        pool = new JedisPool(poolConfig, "localhost", 6379);

		/*
		Properties properties = new Properties();
        try {
            properties.load(RedisUtil.class.getClassLoader().getResourceAsStream("redis.properties"));
            int minIdle = Integer.parseInt(properties.getProperty("redis.minIdle"));
            int maxIdle = Integer.parseInt(properties.getProperty("redis.maxIdle"));
            int maxTotal = Integer.parseInt(properties.getProperty("redis.maxTotal"));
            int maxWaitMillis = Integer.parseInt(properties.getProperty("redis.maxWaitMillis"));
            String host = properties.getProperty("redis.host");
            int port = Integer.parseInt(properties.getProperty("redis.port"));

            poolConfig.setMinIdle(minIdle);
            poolConfig.setMaxIdle(maxIdle);
            poolConfig.setMaxWaitMillis(maxWaitMillis);
            poolConfig.setMaxTotal(maxTotal);

            pool = new JedisPool(poolConfig, host, port);

        } catch (Exception e){
        }
		*/

    }

    public static Jedis getConnecttion() {

        // 从连接池中获取
        Jedis connection = pool.getResource();

        return connection;

    }

    public static void closePool() {
        pool.close();
    }
}
