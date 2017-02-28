package com.ndc.quarz;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Lazy(value=false)
public class MyQuartzs {

	@Scheduled(cron = "*/5 * * * * ?")
	public void test() throws Exception {
		// TODO Auto-generated method stub
       System.err.println("测试定时任务的执行");
	}

}
