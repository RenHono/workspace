package com.qianfeng.day10_2.adapter;

import java.util.List;
import java.util.Map;

import com.qianfeng.day10_2.R;
import com.qianfeng.day10_2.asynctask.ImAs;
import com.qianfeng.day10_2.domain.News;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdapter extends BaseAdapter {

	private List<News> listNews;
	private Context context;
	
	public NewsAdapter(List<News> listNews, Context context) {
		super();
		this.listNews=listNews;
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listNews.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listNews.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if(convertView==null){
			holder = new ViewHolder();
			convertView = LayoutInflater.from(context).inflate(R.layout.news_layout, null);
			holder.ivcover=(ImageView) convertView.findViewById(R.id.ivcover);
			holder.tvsubject=(TextView) convertView.findViewById(R.id.tvsubject);
			holder.tvchanged=(TextView) convertView.findViewById(R.id.tvchanged);
			holder.tvsummary=(TextView) convertView.findViewById(R.id.tvsummary);
			convertView.setTag(holder);
		}else{
			holder=  (ViewHolder) convertView.getTag();
		}
		News news = listNews.get(position);
		holder.tvchanged.setText(news.getChanged());
		holder.tvsubject.setText(news.getSubject());
		holder.tvsummary.setText(news.getSumarry());
		String imurl = news.getConver();
		new ImAs(holder.ivcover).execute(imurl);
		return convertView;
	}
	class ViewHolder{
		TextView tvsubject;
		TextView tvchanged;
		TextView tvsummary;
		ImageView ivcover;
	}

}
