package xyz.renhono.homework908_2;



import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lvinfo;

	private String url;
	private  EditText etx;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lvinfo=(ListView) findViewById(R.id.lvinfo);
etx=(EditText) findViewById(R.id.etx);
	}

	public void down(View view) {

		url = "http://api.k780.com:88/?app=ip.get&ip="+etx.getText().toString()+"&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json";
		new GetAT(this, lvinfo).execute(url);
	}

}
