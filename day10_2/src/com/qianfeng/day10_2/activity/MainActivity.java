package com.qianfeng.day10_2.activity;

import java.util.ArrayList;
import java.util.List;

import com.qianfeng.day10_2.R;
import com.qianfeng.day10_2.R.id;
import com.qianfeng.day10_2.R.layout;
import com.qianfeng.day10_2.R.menu;
import com.qianfeng.day10_2.adapter.NewsAdapter;
import com.qianfeng.day10_2.asynctask.NewsAsyncTask;
import com.qianfeng.day10_2.domain.News;
import com.qianfeng.day10_2.interfaces.ResultCallBack;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends Activity implements ResultCallBack {

	private ListView lvnews;
	private LinearLayout llmore;
	private NewsAdapter adapter;
	private List<News> listNews;
	private String url="http://litchiapi.jstv.com/api/GetFeeds?column=0&PageSize=10&pageIndex=1";
	//是否到了底部
	private boolean isBottom=false;
	//当前页码
	private int currentPage=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lvnews=(ListView) findViewById(R.id.lvnews);
		llmore=(LinearLayout) findViewById(R.id.llmore);
		
		listNews=new ArrayList<News>();
		adapter=new NewsAdapter(listNews, this);
		lvnews.setAdapter(adapter);
		
		//监听滑动事件
		lvnews.setOnScrollListener(new OnScrollListener() {
			
			@Override
			public void onScrollStateChanged(AbsListView view, int scrollState) {
				if (isBottom&&scrollState==SCROLL_STATE_IDLE) {
					llmore.setVisibility(View.VISIBLE);
				}
				
			}
			
			@Override
			public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
				if ((firstVisibleItem+visibleItemCount)==totalItemCount) {
					isBottom=true;
				}else{
					isBottom=false;
				}
				
			}
		});
		
		//监听更多的单击事件
		llmore.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				currentPage++;
				String url="http://litchiapi.jstv.com/api/GetFeeds?column=0&PageSize=10&pageIndex="+currentPage;
				new NewsAsyncTask(MainActivity.this).execute(url);
				llmore.setVisibility(View.GONE);
			}
		});
		//启动异步任务
		new NewsAsyncTask(this).execute(url);
	}
	@Override
	public void callBack(List<News> datas) {
		listNews.addAll(datas);
		//通知有数据变化
		adapter.notifyDataSetChanged();
		
	}

	
}
