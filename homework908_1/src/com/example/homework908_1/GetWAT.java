package com.example.homework908_1;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

public class GetWAT extends AsyncTask<String, Void, List<Map<String, String>>> {

	private List<Map<String, String>> list =new ArrayList<Map<String,String>>();
	private Context context;
	private ListView lvx;


	public GetWAT(Context context, ListView lvx) {
		super();
		this.context = context;
		this.lvx = lvx;
	}

	@Override
	protected List<Map<String, String>> doInBackground(String... params) {
		// TODO Auto-generated method stub
		
		HttpURLConnection conn =null;
		try {
			URL url =new URL(params[0]);
			conn=(HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(1000);
			conn.connect();
			
			if (conn.getResponseCode()==200) {
				InputStream is = conn.getInputStream();
				byte[] buff=new byte[1024];
				int len =0;
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				while ((len=is.read(buff))!=-1) {
					baos.write(buff,0,len);
					baos.flush();
				}
				
				String jstr = baos.toString();
				baos.close();
				
				
				JSONObject jobj = new JSONObject(jstr);
				JSONObject jdata=jobj.optJSONObject("data");

				JSONArray jarr =jdata.optJSONArray("forecast");
				
				Map<String, String> map=new HashMap<String, String>();
				
				JSONObject jyes =jdata.optJSONObject("yesterday");
			
				map.put("date", jyes.optString("date"));
				map.put("city", jdata.optString("city"));
				map.put("low", jyes.optString("low"));
				map.put("high", jyes.optString("high"));
				map.put("type", jyes.optString("type"));
				list.add(map);
				
				for (int i = 0; i < jarr.length(); i++) {
					JSONObject jfors =jarr.optJSONObject(i);
					
			 map=new HashMap<String, String>();
					

				
					map.put("date", jfors.optString("date"));
					map.put("city", jdata.optString("city"));
					map.put("low", jfors.optString("low"));
					map.put("high", jfors.optString("high"));
					map.put("type", jfors.optString("type"));
					list.add(map);
					
				}
				
				
				
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (null!=conn) {
				conn.disconnect();
			}
		}
		
		
		
		return list;
	}

	@Override
	protected void onPostExecute(List<Map<String, String>> result) {
		// TODO Auto-generated method stub
		
		WeaAdapter adapter =new WeaAdapter(context, list);
		lvx.setAdapter(adapter);
		
		super.onPostExecute(result);
	}

}
