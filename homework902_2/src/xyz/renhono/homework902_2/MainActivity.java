package xyz.renhono.homework902_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity implements android.widget.CompoundButton.OnCheckedChangeListener {
	private StringBuffer sb = new StringBuffer();
	private EditText et1;
	private EditText et2;
	private RadioGroup rg;
	private RadioButton rb1;
	private RadioButton rb2;
	private CheckBox cb1;
	private CheckBox cb2;
	private Button btn;

	private String str1 = null;
	private String str2 = null;
	private String str3 = null;
	private String str4 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		et1 = (EditText) findViewById(R.id.et1);
		et2 = (EditText) findViewById(R.id.et2);
		rg = (RadioGroup) findViewById(R.id.rg);
		rb1 = (RadioButton) findViewById(R.id.rb1);
		rb2 = (RadioButton) findViewById(R.id.rb2);
		btn = (Button) findViewById(R.id.btn);
		cb1 = (CheckBox) findViewById(R.id.cb1);
		cb2 = (CheckBox) findViewById(R.id.cb2);

		cb1.setOnCheckedChangeListener(this);
		cb2.setOnCheckedChangeListener(this);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				RadioButton rbx = (RadioButton) findViewById(checkedId);
				str3 = (String) rbx.getText();
			}
		});

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str1 = et1.getText().toString();
				str2 = et2.getText().toString();
				Intent intent = new Intent(MainActivity.this, Xianshi.class);
				intent.putExtra("name", str1);
				intent.putExtra("pass", str2);
				intent.putExtra("xingbie", str3);
				intent.putExtra("aihao", str4);

				startActivity(intent);

			}
		});

	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		if (isChecked) {

			sb.append(buttonView.getText() + " ");

		} else {

			int a = sb.indexOf((String) buttonView.getText());
			sb.delete(a, a + buttonView.length() + 1);

		}
		str4 = sb.toString();
	}

}
