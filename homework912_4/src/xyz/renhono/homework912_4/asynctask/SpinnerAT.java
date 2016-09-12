package xyz.renhono.homework912_4.asynctask;

import java.util.List;

import android.os.AsyncTask;
import xyz.renhono.homework912_4.domain.City;
import xyz.renhono.homework912_4.interfaces.CityRB;

public class SpinnerAT extends AsyncTask<String, Void, List<City>> {

	private CityRB cityRB;
	
	
	public SpinnerAT(CityRB cityRB) {
		super();
		this.cityRB = cityRB;
	}


	@Override
	protected List<City> doInBackground(String... params) {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}


	@Override
	protected void onPostExecute(List<City> result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);
	}

}
