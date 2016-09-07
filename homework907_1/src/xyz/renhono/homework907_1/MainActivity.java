package xyz.renhono.homework907_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tvx;
	private String url = "http://litchiapi.jstv.com/api/GetFeeds?column=0&PageSize=1&pageIndex=1";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvx=(TextView) findViewById(R.id.tvx);

	}

	public void show(View view) {
		new DownJsonAT(tvx).execute(url);
	}
}
