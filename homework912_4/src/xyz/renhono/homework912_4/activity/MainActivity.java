package xyz.renhono.homework912_4.activity;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Spinner;
import xyz.renhono.homework912_4.R;
import xyz.renhono.homework912_4.asynctask.SpinnerAT;
import xyz.renhono.homework912_4.domain.City;
import xyz.renhono.homework912_4.domain.Weather;
import xyz.renhono.homework912_4.interfaces.CityRB;

public class MainActivity extends Activity implements CityRB {

	private String cityurl = "http://api.k780.com:88/?app=weather.city&&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json";
	private String weaurl = "http://api.k780.com:88/?app=weather.future&weaid=36&&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json";
	private Spinner spn;
	private ListView lvx;
	private List<City> citylist;
	private List<Weather> wealist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		spn = (Spinner) findViewById(R.id.spn);
		lvx = (ListView) findViewById(R.id.lvx);
		new SpinnerAT(this).execute(cityurl);

	}

	@Override
	public void cityRB(List<City> clist) {
		// TODO Auto-generated method stub

	}

}
