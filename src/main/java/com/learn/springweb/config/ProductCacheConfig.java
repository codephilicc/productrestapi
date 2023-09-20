//package com.learn.springweb.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.hazelcast.config.Config;
//import com.hazelcast.config.MapConfig;
//
//@Configuration
//public class ProductCacheConfig {
//
//	private Config config2;
//
//	@Bean
//	public Config cacheConfig() {
//		Config config = new Config();
//		config2 = config.setInstanceName("hazel-instance").addMapConfig(new MapConfig()).setInstanceName("product_cache");
//		return  config2;
//
//	}
//
//}
