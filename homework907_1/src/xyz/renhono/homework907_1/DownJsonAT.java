package xyz.renhono.homework907_1;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.widget.TextView;
import xyz.renhono.beam.Data;
import xyz.renhono.beam.Feeds;
import xyz.renhono.beam.Paramz;
import xyz.renhono.beam.Root;

public class DownJsonAT extends AsyncTask<String, Void, String> {

	private TextView tvx;
private String strx;
	public DownJsonAT(TextView tvx) {
		super();
		this.tvx = tvx;
	}

	@Override
	protected String doInBackground(String... params) {
		// TODO Auto-generated method stub
		HttpURLConnection conn = null;

		try {
			URL url = new URL(params[0]);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(1000);
			conn.connect();

			if (conn.getResponseCode() == 200) {

				InputStream is = conn.getInputStream();
				int len = 0;
				byte[] buff = new byte[1024];
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				while ((is.read(buff)) != -1) {
					baos.write(buff);
					baos.flush();

				}
				String jstr = baos.toString();
				baos.close();
				
				
				Root root=new Root();
				Paramz paramz=new Paramz();
				Feeds feeds =new Feeds();
				Data data =new Data();
				
				JSONObject jsroot=new JSONObject(jstr); 
				root.setStatus(jsroot.optString("status"));
				
				JSONObject jsPar=jsroot.optJSONObject("paramz");
				paramz.setPageIndex(jsPar.optInt("PageIndex"));
				paramz.setPageSize(jsPar.optInt("PageSize"));
				paramz.setTotalCount(jsPar.optInt("TotalCount"));
				paramz.setTotalPage(jsPar.optInt("TotalPage"));

				JSONArray jaFee =jsPar.optJSONArray("feeds");
				
				
				for (int i = 0; i < jaFee.length(); i++) {
					JSONObject jsFees = jaFee.optJSONObject(i);
					feeds.setId(jsFees.optInt("id"));
					feeds.setOid(jsFees.optInt("oid"));
					feeds.setCategory(jsFees.optString("category"));
					
					JSONObject jsDat =jsFees.optJSONObject("data");
					
					data.setSubject(jsDat.optString("subject"));
					data.setSummary(jsDat.optString("summary"));
					data.setCover(jsDat.optString("cover"));
					data.setPic(jsDat.optString("pic"));
					data.setFormat(jsDat.optString("format"));
					data.setChanged(jsDat.optString("changed"));
					
					
				}
				feeds.setData(data);
				paramz.setFeeds(feeds);
				root.setParamz(paramz);
				
						strx= root.toString();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return strx;
	}

	protected void onPostExecute(String result) {
		// TODO Auto-generated method stub
		
		tvx.setText(result);
		super.onPostExecute(result);
	}

}
