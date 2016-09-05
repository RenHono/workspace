package xyz.renhono.homework905_2;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private TextView name;

	private ImageView iv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		iv = (ImageView) findViewById(R.id.iv);

		name = (TextView) findViewById(R.id.name);

	}

	public void xunze(View view) {

		Intent intent = new Intent(this, XunActivity.class);

		startActivityForResult(intent, 73);

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		if (requestCode == 73 && resultCode == 99) {
			String str = data.getStringExtra("fpp");
			name.setText(str);
			Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

}
