package xyz.renhono.homework913_1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

public class Splash extends Activity {

	private final int DISPLAY_TIME = 2000;
	private SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_t);

//		sp = getSharedPreferences("fpp", Context.MODE_PRIVATE);
//		Editor editor = sp.edit();
//		editor.putInt("enter", 1);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int in = sp.getInt("enter", 0);
				if (in == 1) {

					Intent mainintent = new Intent(Splash.this, MainActivity.class);
					Splash.this.startActivity(mainintent);
					Splash.this.finish();
				} else {

					Intent mainintent = new Intent(Splash.this, Guide.class);
					Splash.this.startActivity(mainintent);
					Splash.this.finish();
		
				}
			}
		}, DISPLAY_TIME);

	}

}
