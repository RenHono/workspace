package xyz.renhono.homework909_1.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class HttpUtil {

	public String getJsonStr(String urlx) {

		HttpURLConnection conn = null;
		try {
			URL url = new URL(urlx);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(1000);
			conn.connect();
			if (conn.getResponseCode() == 200) {
				InputStream is = conn.getInputStream();
				byte[] buff = new byte[1024];
				int len = 0;
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				while ((len = is.read(buff)) != -1) {
					baos.write(buff, 0, len);
					baos.flush();
				}
				String string = baos.toString();

				return string;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return null;
	}

	public Bitmap getJsonBitmap(String urlx) {

		HttpURLConnection conn = null;
		try {
			URL url = new URL(urlx);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(1000);
			conn.connect();
			if (conn.getResponseCode() == 200) {
				InputStream is = conn.getInputStream();
				byte[] buff = new byte[1024];
				int len = 0;
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				while ((len = is.read(buff)) != -1) {
					baos.write(buff, 0, len);
					baos.flush();
				}
				byte[] datas = baos.toByteArray();
				Bitmap bitmap = BitmapFactory.decodeByteArray(datas, 0, datas.length);

				return bitmap;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}

		return null;

	}

}
