/*
 * 文 件 名:  HelloWorldAspect.java
 * 版    权:  xxxx Technologies Co., Ltd. Copyright 2010-9999,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  Administrator
 * 修改时间:  2016年8月10日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.my;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * <一句话功能简述>
 *
 * @author 贾瑞丰
 * @date [2016年8月10日]
 */
public class HelloWorldAspect {
	// 前置通知
	public void beforeAdvice() {
		System.out.println("===========before advice");
	}

	// 后置最终通知
	public void afterFinallyAdvice() {
		System.out.println("===========after finally advice");
	}
	
	public void around(ProceedingJoinPoint proceedingJoinPoint){
		long start=System.currentTimeMillis();
		System.out.println("===========around pre advice");
		try {
			proceedingJoinPoint.proceed();
			Thread.sleep(100);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println("===========around end advice");
	}
}