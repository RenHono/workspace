package com.example.app2;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class ButtonOnClickListener implements OnClickListener {

	private Context context ;
	
	
	
	public ButtonOnClickListener(Context context) {
		super();
	this.context=context;
		
		
	}


	@Override
	public void onClick(View v) {
		Toast.makeText(context, "外部类输出", Toast.LENGTH_LONG).show();
		System.out.println("外部类");
	}

}
