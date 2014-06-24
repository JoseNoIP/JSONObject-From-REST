package mx.com.ecube.library;

import java.net.URL;

import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;

public class JSONFromREST extends AsyncTask<URL, Integer, JSONObject>{
	
	private static final String TAG = "JSONFromREST";
	
	private Context context;
	private JSONFromRESTListener<JSONObject> listener;
	
	public JSONFromREST(Context context, JSONFromRESTListener<JSONObject> listener){
		this.context = context;
		this.listener = listener;
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected JSONObject doInBackground(URL... params) {
		//Get the JSONObject
		return null;
	}

	@Override
	protected void onPostExecute(JSONObject result) {
		super.onPostExecute(result);
		listener.onTaskComplete(result);
	}

}
