package com.example.app4_2;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
	private Spinner spp;
	private Spinner spc;

	private String[] provs = { "辽宁省", "黑龙江省", "吉林省" };
	private String[][] citys = { { "大连市", "沈阳市", "铁岭市" }, { "哈尔滨", "漠河", "齐齐哈尔" }, { "吉林市", "长春市", "通化市" } };

	private ArrayAdapter<String> provad;
	private ArrayAdapter<String> cityad;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		spp = (Spinner) findViewById(R.id.spp);

		spc = (Spinner) findViewById(R.id.spc);

		provad = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,provs );
		cityad = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);

		
		spp.setAdapter(provad);
		spc.setAdapter(cityad);
		
		spp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				String[] ccs=citys[position];
						cityad.clear();
//						cityad.add("");
				cityad.addAll(ccs);
						spc.setSelection(0);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
