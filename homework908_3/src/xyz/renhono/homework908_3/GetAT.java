package xyz.renhono.homework908_3;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

public class GetAT extends AsyncTask<String, Void, List<Map<String, String>>> {

	private List<Map<String, String>> list = new ArrayList<Map<String, String>>();
	private Context context;
	private ListView lvx;

	public GetAT(Context context, ListView lvx) {
		super();
		this.context = context;
		this.lvx = lvx;
	}

	@Override
	protected List<Map<String, String>> doInBackground(String... params) {
		// TODO Auto-generated method stub

		HttpURLConnection conn = null;
		try {
			URL url = new URL(params[0]);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(1000);
			conn.connect();

			if (conn.getResponseCode() == 200) {
				InputStream is = conn.getInputStream();
				byte[] buff = new byte[1024];
				int len = 0;
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				while ((len = is.read(buff)) != -1) {
					baos.write(buff, 0, len);
					baos.flush();
				}

				String jstr = baos.toString();
				baos.close();

				JSONObject jobj = new JSONObject(jstr);
				JSONObject jdata = jobj.optJSONObject("result");

				Map<String, String> map = new HashMap<String, String>();

				map.put("status", jdata.optString("status"));
				map.put("phone", jdata.optString("phone"));
				map.put("area", jdata.optString("area"));
				map.put("postno", jdata.optString("postno"));
				map.put("att", jdata.optString("att"));
				map.put("ctype", jdata.optString("ctype"));
				map.put("par", jdata.optString("par"));
				map.put("prefix", jdata.optString("prefix"));
				map.put("operators", jdata.optString("operators"));
				map.put("style_simcall", jdata.optString("style_simcall"));
				map.put("style_citynm", jdata.optString("style_citynm"));

				list.add(map);

			}

		} catch (

		Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != conn) {
				conn.disconnect();
			}
		}

		return list;
	}

	@Override
	protected void onPostExecute(List<Map<String, String>> result) {
		// TODO Auto-generated method stub

		NeAdapter adapter = new NeAdapter(context, list);
		lvx.setAdapter(adapter);

		super.onPostExecute(result);
	}

}
