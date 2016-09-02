package com.example.app4_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Spinner spr;
	
	private List<Map<String, String>> datas;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		spr = (Spinner)findViewById(R.id.xiala);
		
		datas = new ArrayList<Map<String,String>>();
		
	 Map<String, String> map = new HashMap<String, String>();
		map.put("name", "张三");
		map.put("age", "22");
		map.put("tel", "1234567");
		datas.add(map);
		
		 map = new HashMap<String, String>();
		map.put("name", "李四");
		map.put("age", "23");
		map.put("tel", "454345435");
		datas.add(map);
		 map = new HashMap<String, String>();
		map.put("name", "王五");
		map.put("age", "12");
		map.put("tel", "58768");
		datas.add(map);
		
		
		SimpleAdapter adapter = new SimpleAdapter(this, datas, R.layout.sp_item, new String[]{"name","age","tel"}, new int[]{R.id.tvname,R.id.tvage,R.id.tvnumber});
		spr.setAdapter(adapter);
		
		spr.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				Map<String,String> map=datas.get(position);
				String str = "姓名："+map.get("name")+",年龄："+map.get("age")+",电话："+map.get("tel");
				Log.i("MainActivity", "姓名："+map.get("name")+",年龄："+map.get("age")+",电话："+map.get("tel"));
				Toast.makeText(MainActivity.this,str, Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
