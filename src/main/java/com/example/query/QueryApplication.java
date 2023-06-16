package com.example.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableCaching
//@EnableRedisRepositories
public class QueryApplication {
	public static void main(String[] args) {
		SpringApplication.run(QueryApplication.class, args);
	}
//	@Bean
//	public CacheManager cacheManager() {
//		return new ConcurrentMapCacheManager("product");
//	}
//	@Bean
//	public JedisConnectionFactory connectionFactory() {
//		RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
//		configuration.setHostName("localhost");
//		configuration.setPort(6379);
//		return new JedisConnectionFactory(configuration);
//}

}
