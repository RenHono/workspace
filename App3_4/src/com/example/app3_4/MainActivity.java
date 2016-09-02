package com.example.app3_4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;


public class MainActivity extends Activity implements OnCheckedChangeListener{
private CheckBox ckgame;
private CheckBox ckmusic;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ckgame = (CheckBox)findViewById(R.id.ckgame);
		ckmusic = (CheckBox)findViewById(R.id.ckmusic);
		
		
		
		ckgame.setOnCheckedChangeListener(this);
		ckmusic.setOnCheckedChangeListener(this);
		
	}
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

		if(isChecked){
			Toast.makeText(this, "选定了："+buttonView.getText()	, Toast.LENGTH_LONG).show();
		}
	}


}
