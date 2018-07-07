package com.lvzheng.service.sso.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.net.UnknownHostException;


public class LoginUtil {
	public static final String loginId = "ssoid";
	/**
	 * 封装Cookie
	 * @param empid
	 * @param phonenum
	 * @return
	 */
	public static Cookie getLoginCookie(long empid, String phonenum, HttpServletRequest request){
		String ip = getIpAddr(request);
		String ua = request.getHeader("User-Agent");
		Cookie loginCookie = new Cookie(loginId,getCookieStr(empid, phonenum,ip,ua));
		System.out.println("empId:"+empid);
		System.out.println("phonenum:"+phonenum);
		System.out.print("ip:"+ip);
		System.out.print("ua:"+ua);
		loginCookie.setMaxAge(-1);
		loginCookie.setHttpOnly(true);
		loginCookie.setDomain("lvzheng.com");
		loginCookie.setPath("/");
		return loginCookie;
	}
	/**
	 * 根据用户信息，生成cookie的value。
	 * @param empId
	 * @param empphone
	 * @return
	 */
	public static String getCookieStr(long empId,String empphone,String ip,String ua){
		String ssoid = DesUtil.encode(empId+"@"+empphone+"@"+ip+"@"+ua);
		try {
			ssoid = ssoid.replace("\\r\\n", "");
			ssoid = ssoid.replace("\\n", "");
			ssoid= URLEncoder.encode(ssoid, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ssoid;
	}
	/**
	 * 获取当前网络ip
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request){
		String ipAddress = request.getHeader("x-forwarded-for");
		if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("Proxy-Client-IP");
		}
		if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("WL-Proxy-Client-IP");
		}
		if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getRemoteAddr();
		}
		/*if(ipAddress.equals("127.0.0.1")){
			ipAddress = request.getHeader("X-Real-IP");
		}*/
		if(ipAddress.equals("0:0:0:0:0:0:0:1") || ipAddress.equals("127.0.0.1")){
			//根据网卡取本机配置的IP
			InetAddress inet=null;
			try {
				inet = InetAddress.getLocalHost();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
			ipAddress= inet.getHostAddress();
		}
		//对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
		if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15
			if(ipAddress.indexOf(",")>0){
				ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));
			}
		}
		return ipAddress;
	}
}