package xyz.renhono.homework908_3;



import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lvinfo;

	private String url = "http://api.k780.com:88/?app=phone.get&phone=13800138000&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lvinfo=(ListView) findViewById(R.id.lvinfo);

	}

	public void down(View view) {

		new GetAT(this, lvinfo).execute(url);
	}

}
