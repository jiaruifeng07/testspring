/*
* 文 件 名:  MyService.java
* 版    权:  xxxx Technologies Co., Ltd. Copyright 2010-9999,  All rights reserved
* 描    述:  <描述>
* 修 改 人:  Administrator
* 修改时间:  2016年8月9日
* 跟踪单号:  <跟踪单号>
* 修改单号:  <修改单号>
* 修改内容:  <修改内容>
*/
package com.my.service;

import com.my.dao.MyDao;
import com.my.dao.MyNewDao;

/**
 * <一句话功能简述>
 *
 * @author  贾瑞丰
 *@date  [2016年8月9日]
 */
public class MyService {
	private MyDao myDao;
	private MyNewDao myNewDao;
	/**
	 * @return 返回 myDao
	 */
	public MyDao getMyDao() {
		return myDao;
	}
	/**
	 * @param 对myDao进行赋值
	 */
	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}
	/**
	 * @return 返回 myNewDao
	 */
	public MyNewDao getMyNewDao() {
		return myNewDao;
	}
	/**
	 * @param 对myNewDao进行赋值
	 */
	public void setMyNewDao(MyNewDao myNewDao) {
		this.myNewDao = myNewDao;
	}
	public void test(){
		this.myDao.test();
		this.myNewDao.test();
	}
}
