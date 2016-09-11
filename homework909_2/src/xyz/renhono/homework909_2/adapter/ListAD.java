package xyz.renhono.homework909_2.adapter;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import xyz.renhono.homewok909_2.R;
import xyz.renhono.homework909_2.asynctask.ImgAT;
import xyz.renhono.homework909_2.domain.Data;

public class ListAD extends BaseAdapter {

	private List<Data> list;
	private Context context;

	public ListAD(List<Data> list, Context context) {
		super();
		this.list = list;
		this.context = context;
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

			holder.tvname = (TextView) convertView.findViewById(R.id.tvname);
			holder.tvcon = (TextView) convertView.findViewById(R.id.tvcon);
			holder.iv = (ImageView) convertView.findViewById(R.id.iv);

			convertView.setTag(holder);

		} else {

			holder = (ViewHolder) convertView.getTag();

		}
		Data data = list.get(position);

		holder.tvname.setText(data.getTitle());
		holder.tvcon.setText(data.getSource());

		Log.i("xxx", data.getWap_thumb().toString());
		String url7=data.getWap_thumb();
		
		new ImgAT(holder.iv).execute(url7);

		return convertView;
	}

	class ViewHolder {

		ImageView iv;
		TextView tvname;
		TextView tvcon;

	}

}
