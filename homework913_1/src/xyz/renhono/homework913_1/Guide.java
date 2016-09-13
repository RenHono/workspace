package xyz.renhono.homework913_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Guide extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide);
	}

	public void tomain(View view) {

		Intent intent = new Intent(Guide.this, MainActivity.class);
		startActivity(intent);
	}
}
