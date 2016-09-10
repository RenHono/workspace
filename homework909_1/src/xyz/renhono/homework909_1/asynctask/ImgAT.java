package xyz.renhono.homework909_1.asynctask;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import xyz.renhono.homework909_1.util.HttpUtil;

public class ImgAT extends AsyncTask<String, Void, Bitmap> {

	private ImageView ivx;

	public ImgAT(ImageView ivx) {
		super();
		this.ivx = ivx;
	}

	@Override
	protected Bitmap doInBackground(String... params) {
		// TODO Auto-generated method stub
		try {
			Bitmap bitmap = new HttpUtil().getJsonBitmap(params[0]);
			
			
			

			return bitmap;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	protected void onPostExecute(Bitmap result) {
		// TODO Auto-generated method stub
		
		ivx.setImageBitmap(result);
		
		super.onPostExecute(result);
	}

}
