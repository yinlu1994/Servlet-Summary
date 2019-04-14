package com.servlet.c_life;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeServlet implements Servlet {
	
	/**
	 * 初始化方法
	 * 执行者：服务器
	 * 执行次数:一次
	 * 执行时机：默认第一次访问的时候（多次刷新也不会再次执行）
	 */
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("555555");
	}

	/**
	 * 服务方法
	 * 执行者:服务器
	 * 执行次数：请求一次执行一次（刷新一次执行一次）
	 * 执行时机：请求来的时候
	 */
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("666666");

	}
	/**
	 * 销毁方法
	 * 执行者:服务器
	 * 执行次数：只执行一次
	 * 执行时机：当servlet被移除的时候，或者服务器正常关闭的时候（右键Servers选项卡中tomcat->红色停止键）
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
