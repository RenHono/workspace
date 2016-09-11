package com.qianfeng.day10_2.asynctask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.qianfeng.day10_2.utils.HttpUtils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

public class ImAs extends AsyncTask<String, Void, Bitmap> {
	private ImageView ivcover;
	
	public ImAs(ImageView ivcover) {
		super();
		this.ivcover = ivcover;
	}

	@Override
	protected void onPostExecute(Bitmap result) {
		// TODO Auto-generated method stub
		ivcover.setImageBitmap(result);
		super.onPostExecute(result);
	}

	@Override
	protected Bitmap doInBackground(String... params) {
		
		return HttpUtils.getBitmap(params[0]);
	}

}
