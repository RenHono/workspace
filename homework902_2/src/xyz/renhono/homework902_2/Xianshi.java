package xyz.renhono.homework902_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Xianshi extends Activity {

	private TextView tvv1;
	private TextView tvv2;
	private TextView tvv3;
	private TextView tvv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xianshi);

		tvv1 = (TextView) findViewById(R.id.tvv1);
		tvv2 = (TextView) findViewById(R.id.tvv2);
		tvv3 = (TextView) findViewById(R.id.tvv3);
		tvv4 = (TextView) findViewById(R.id.tvv4);

		Intent intent = getIntent();

		String str1 = intent.getStringExtra("name");
		String str2 = intent.getStringExtra("pass");
		String str3 = intent.getStringExtra("xingbie");
		String str4 = intent.getStringExtra("aihao");

		tvv1.setText("你的姓名是："+str1);

		tvv2.setText("你的密码是："+str2);

		tvv3.setText("你的性别是："+str3);

		tvv4.setText("你的爱好是："+str4);
	}

}
