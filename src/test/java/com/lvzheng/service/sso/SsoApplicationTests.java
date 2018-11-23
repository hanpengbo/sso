package com.lvzheng.service.sso;

import com.lvzheng.service.sso.wapper.RedisWapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsoApplicationTests {

	@Test
	public void contextLoads() {
	}
    @Autowired
	private RedisWapper redisWapper;
	@Test
	public void redisTest(){
                                //test
		redisWapper.addCache("test-001","3333");
	}
	@Test
	public void redisGetValueTest(){
		String cache = redisWapper.getCache("test-001");
		System.out.println(cache);
	}
	@Test
	public void redisCountTest(){
		redisWapper.addCache("test-002","1");
		Long increment = redisWapper.increment("test-002");
		System.out.println(increment);
		System.out.println("===========================");
		Long increment1 = redisWapper.increment("test-002");
		System.out.println(increment1);
	}

	@Test
	public  void redisLimitTest(){
		Long a1 = redisWapper.increment("test-003", 30l);
		System.out.println(a1);
		Long a2 = redisWapper.increment("test-003", 30l);
		System.out.println(a2);
		Long a3 = redisWapper.increment("test-003", 30l);
		System.out.println(a3);
	}
}
