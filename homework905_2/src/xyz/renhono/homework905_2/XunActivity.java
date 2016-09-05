package xyz.renhono.homework905_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class XunActivity extends ListActivity {
	private Spinner spn;
	private Map<String, Object> sss;
	private String str;
	private Object img;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_xun);

		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.list, new String[] { "img", "title" },
				new int[] { R.id.img, R.id.title });
		setListAdapter(adapter);
		Intent intent = getIntent();
		spn = (Spinner) findViewById(R.id.spn);
		spn.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub

				sss = getData().get(position);
				str= (String) sss.get("title");
				img=sss.get("img");
				Toast.makeText(XunActivity.this,"选择了  "+ str, Toast.LENGTH_LONG).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});

		// Intent rsIntent = new Intent(this,MainActivity.class);
		// rsIntent.putExtra("fpp", str);
		//
		// setResult(99, rsIntent);

	}

	private List<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("img", R.drawable.x1);
		map.put("title", "皮卡丘");
		list.add(map);
		map.put("img", R.drawable.x2);
		map.put("title", "野原新之助");
		list.add(map);
		map.put("img", R.drawable.x3);
		map.put("title", "熊猫");
		list.add(map);

		return list;
	}

	public void fanhui(View view) {

		Intent rsIntent = new Intent(this, MainActivity.class);
		rsIntent.putExtra("fpp", str);

		setResult(99, rsIntent);

		finish();
	}
}
