package xyz.renhono.homework908_2;

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

public class NeAdapter extends BaseAdapter {

	private ListView lvx;
	private Context context;
	private List<Map<String, String>> list;

	public NeAdapter(Context context, List<Map<String, String>> list) {
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
			holder.tv6 = (TextView) convertView.findViewById(R.id.tv6);
			holder.tv7 = (TextView) convertView.findViewById(R.id.tv7);
			holder.tv8 = (TextView) convertView.findViewById(R.id.tv8);
			holder.tv9 = (TextView) convertView.findViewById(R.id.tv9);
			holder.tv10 = (TextView) convertView.findViewById(R.id.tv10);
			holder.tv11 = (TextView) convertView.findViewById(R.id.tv11);

			convertView.setTag(holder);

		} else {
			holder = (ViewHolder) convertView.getTag();

		}

		Map<String, String> map = list.get(position);

		holder.tv1.setText(map.get("status"));
		holder.tv2.setText(map.get("ip"));
		holder.tv3.setText(map.get("ip_str"));
		holder.tv4.setText(map.get("ip_end"));
		holder.tv5.setText(map.get("inet_str"));
		holder.tv6.setText(map.get("inet_end"));
		holder.tv7.setText(map.get("operators"));
		holder.tv8.setText(map.get("att"));
		holder.tv9.setText(map.get("detailed"));
		holder.tv10.setText(map.get("area_style_simcall"));
		holder.tv11.setText(map.get("area_style_areanm"));

		return convertView;
	}

	class ViewHolder {
		TextView tv1;
		TextView tv2;
		TextView tv3;
		TextView tv4;
		TextView tv5;
		TextView tv6;
		TextView tv7;
		TextView tv8;
		TextView tv9;
		TextView tv10;
		TextView tv11;

	}
}
