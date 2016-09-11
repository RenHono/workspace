package com.qianfeng.day10_2.asynctask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.qianfeng.day10_2.domain.News;
import com.qianfeng.day10_2.interfaces.ResultCallBack;
import com.qianfeng.day10_2.utils.HttpUtils;

import android.os.AsyncTask;

public class NewsAsyncTask extends AsyncTask<String, Void, List<News>> {

	private ResultCallBack resultCallBack;
	public NewsAsyncTask(ResultCallBack resultCallBack) {
		super();
		this.resultCallBack = resultCallBack;
	}

	@Override
	protected List<News> doInBackground(String... params) {
		List<News> listNews=new ArrayList<News>();
		String jsonStr=HttpUtils.getJsonStr(params[0]);
		try {
			
			//JSON解析
			JSONObject jo = new JSONObject(jsonStr);
			JSONObject joo = jo.optJSONObject("paramz");
			JSONArray ja = joo.optJSONArray("feeds");
			for (int i = 0; i < ja.length(); i++) {

				JSONObject jj = ja.optJSONObject(i);
				JSONObject jdata = jj.optJSONObject("data");
				News news = new News();
				news.setSubject(jdata.optString("subject"));
				news.setSumarry(jdata.optString("summary"));
				news.setChanged(jdata.optString("changed"));
				news.setConver("http://litchiapi.jstv.com" + jdata.optString("cover"));
				listNews.add(news);
				
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listNews;
	}

	@Override
	protected void onPostExecute(List<News> result) {
		resultCallBack.callBack(result);
		super.onPostExecute(result);
	}

}
