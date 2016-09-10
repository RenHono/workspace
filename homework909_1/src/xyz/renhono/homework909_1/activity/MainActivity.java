package xyz.renhono.homework909_1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import xyz.renhono.homewok909_1.R;
import xyz.renhono.homework909_1.asynctask.DownAT;

public class MainActivity extends Activity {

	private ListView lvx;
	private String url = "http://sns.maimaicha.com/api?apikey=b4f4ee31a8b9acc866ef2afb754c33e6&format=json&method=news.getSlideshow";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lvx = (ListView) findViewById(R.id.lvinfo);

		new DownAT(this, lvx).execute(url);
		
	}

}
