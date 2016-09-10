package xyz.renhono.homework909_1.asynctask;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;
import xyz.renhono.homework909_1.adapter.ListAD;
import xyz.renhono.homework909_1.domain.Data;
import xyz.renhono.homework909_1.util.HttpUtil;

public class DownAT extends AsyncTask<String, Void, List<Data>> {

	private Context context;
	private List<Data> list;
	private ListView lvx;
	
	public DownAT(Context context, ListView lvx) {
		super();
		this.context = context;
		this.lvx = lvx;
	}


	@Override
	protected List<Data> doInBackground(String... params) {
		// TODO Auto-generated method stub
		list=new ArrayList<Data>();
		String jsonstr =new HttpUtil().getJsonStr(params[0]);
		
		
		try {
			JSONObject jobj =new JSONObject(jsonstr);
			JSONArray jarr = jobj.optJSONArray("data");
			for (int i = 0; i < jarr.length(); i++) {
				JSONObject jdatas =jarr.optJSONObject(i);
				
				Data data=new Data();
				
				data.setName(jdatas.optString("name"));
				data.setContent(jdatas.optString("content"));
				data.setLink(jdatas.optString("link"));
				data.setImage(jdatas.optString("image"));
				list.add(data);
				
			}
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		return list;
	}


	@Override
	protected void onPostExecute(List<Data> result) {
		// TODO Auto-generated method stub
		
		ListAD listAD=new ListAD(result, context);
		
		lvx.setAdapter(listAD);
		
		
		super.onPostExecute(result);
	}

}
