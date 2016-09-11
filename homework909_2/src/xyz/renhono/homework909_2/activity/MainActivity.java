package xyz.renhono.homework909_2.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import xyz.renhono.homewok909_2.R;
import xyz.renhono.homework909_2.adapter.ListAD;
import xyz.renhono.homework909_2.asynctask.DownAT;
import xyz.renhono.homework909_2.domain.Data;
import xyz.renhono.homework909_2.interfaces.ResultCB;

public class MainActivity extends Activity implements ResultCB {

	private ListView lvx;
	private String url = "http://sns.maimaicha.com/api?apikey=b4f4ee31a8b9acc866ef2afb754c33e6&format=json&method=news.getHeadlines&rows=15&page=1";
	private List<Data> listx;
	private ListAD listAD;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lvx = (ListView) findViewById(R.id.lvinfo);

		listx = new ArrayList<Data>();

		//lvx.addHeaderView(LayoutInflater.from(this).inflate(R.layout.listview_header, null));

		new DownAT(this).execute(url);
		listAD = new ListAD(listx, this);

		lvx.setAdapter(listAD);

//
//		lvx.setOnItemClickListener(new OnItemClickListener() {
//
//			@Override
//			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//				// TODO Auto-generated method stub
////
////				Intent intent = new Intent();
////
////				intent.setAction(Intent.ACTION_VIEW);
////				intent.setData(Uri.parse(listx.get(position-1).getLink()));
//
////				startActivity(intent);
//			}
//
//		});
	}

	@Override
	public void CallBack(List<Data> list) {
		// TODO Auto-generated method stub

		listx.addAll(list);
		listAD.notifyDataSetChanged();
	}

}
