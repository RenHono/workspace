package com.qianfeng.day10_2.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

/**
 * 网络工具类
 * @author Administrator
 *
 */
public class HttpUtils {
	/**
	 * 获取网络的JSON字符串
	 * @param 网络地址
	 * @return　整个JSON字符串
	 */
	public static String getJsonStr(String urlStr){
		HttpURLConnection conn=null;
		try {
			URL url=new URL(urlStr);
			conn=(HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(1000);
			conn.connect();
			if(conn.getResponseCode()==200){
				InputStream is=conn.getInputStream();
				int len=0;
				byte[] buff=new byte[1024];
				ByteArrayOutputStream baos=new ByteArrayOutputStream();
				
				while((len=is.read(buff))!=-1){
					baos.write(buff, 0, len);
					baos.flush();
				}
				
				String data=baos.toString();
				baos.close();
				return data;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (null!=conn) {
				conn.disconnect();
			}
		}
		return null;
	}
	
	/**
	 * 获取网络图片
	 * @param 网址
	 * @return　位图对象
	 */
	public static Bitmap getBitmap(String urlStr){
		HttpURLConnection conn=null;
		try {
			URL url=new URL(urlStr);
			conn=(HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(1000);
			conn.connect();
			if(conn.getResponseCode()==200){
				return BitmapFactory.decodeStream(conn.getInputStream());
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (null!=conn) {
				conn.disconnect();
			}
		}
		return null;
	}
}
