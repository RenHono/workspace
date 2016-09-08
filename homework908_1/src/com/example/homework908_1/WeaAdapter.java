package com.example.homework908_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class WeaAdapter extends BaseAdapter {

	private ListView lvx;
	private Context context;
	private List<Map<String, String>> list;

	
	
	public WeaAdapter(Context context, List<Map<String, String>> list) {
		super();
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
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
		if (convertView == null) {
			holder = new ViewHolder();

			convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);

			holder.tv1 = (TextView) convertView.findViewById(R.id.tv1);
			holder.tv2 = (TextView) convertView.findViewById(R.id.tv2);
			holder.tv3 = (TextView) convertView.findViewById(R.id.tv3);
			holder.tv4 = (TextView) convertView.findViewById(R.id.tv4);
			holder.tv5 = (TextView) convertView.findViewById(R.id.tv5);

			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();

		}
		
		Map<String, String> map =list.get(position);
		
		holder.tv1.setText(map.get("date"));
		holder.tv2.setText(map.get("city"));
		holder.tv3.setText(map.get("low"));
		holder.tv4.setText(map.get("high"));
		holder.tv5.setText(map.get("type"));

		return convertView;
	}

	class ViewHolder {
		TextView tv1;
		TextView tv2;
		TextView tv3;
		TextView tv4;
		TextView tv5;

	}
}
