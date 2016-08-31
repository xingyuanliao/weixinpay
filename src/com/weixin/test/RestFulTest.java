package com.weixin.test;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestFulTest {
	
	public static String doRest(String restUrl){
		try {
			//需要请求的restful地址
			URL url = new URL(restUrl);
			          
			//打开restful链接
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			// 提交模式
			conn.setRequestMethod("GET");//POST GET PUT DELETE
			          
			//设置访问提交模式，表单提交
			conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			conn.setConnectTimeout(10000);//连接超时 单位毫秒
			conn.setReadTimeout(2000);//读取超时 单位毫秒
			conn.setDoOutput(true);// 是否输入参数
			byte[] bypes = new byte[1024*1024];
			//读取请求返回值
			InputStream inStream=conn.getInputStream();
			inStream.read(bypes, 0, inStream.available());
			return new String(bypes, "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	
	
	public static void main(String[] args) {
		try {
			//需要请求的restful地址
			URL url = new URL("http://localhost:8080/schedules?EQS_doctorId=ff808081569302d10156964e92bd0010&BETWEENS_day=2016-08-18~2016-08-25");
			          
			//打开restful链接
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			// 提交模式
			conn.setRequestMethod("GET");//POST GET PUT DELETE
			          
			//设置访问提交模式，表单提交
			conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			          
			conn.setConnectTimeout(10000);//连接超时 单位毫秒
			conn.setReadTimeout(2000);//读取超时 单位毫秒
			          
			conn.setDoOutput(true);// 是否输入参数

//			StringBuffer params = new StringBuffer();
//			// 表单参数与get形式一样
//			params.append("EQS_doctorId").append("=").append("ff808081569302d10156964e92bd0010");
//			params.append("BETWEENS_day").append("=").append("2016-08-18~2016-08-25");
//			byte[] bypes = params.toString().getBytes();
//			conn.getOutputStream().write(bypes);// 输入参数
			

			byte[] bypes = new byte[1024*1024];
			//读取请求返回值
			InputStream inStream=conn.getInputStream();
			inStream.read(bypes, 0, inStream.available());
			System.out.println(new String(bypes, "utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
