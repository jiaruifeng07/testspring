/*
 * 文 件 名:  TestApplicationContext.java
 * 版    权:  xxxx Technologies Co., Ltd. Copyright 2010-9999,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  Administrator
 * 修改时间:  2016年8月9日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.my.test.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.my.configuration.AppConfig;
import com.my.service.MyService;

/**
 * <一句话功能简述>
 *
 * @author 贾瑞丰
 * @date [2016年8月9日]
 */
public class TestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);
		MyService myService = ctx.getBean(MyService.class);
		myService.test();
	}
}
