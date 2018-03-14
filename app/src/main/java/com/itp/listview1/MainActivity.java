package com.itp.listview1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener { 

	String[] data,dataEdit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
		data = getResources().getStringArray(R.array.products);
		dataEdit = new String[]{"one","two","three","four","five"};
		
		Integer[] imgID = {
				R.drawable.goodday,
				R.drawable.lovely,
				R.drawable.goodday,
				R.drawable.lovely,
				R.drawable.goodday,
			};




		MyArrayAdaptor adap = new MyArrayAdaptor(this, data, data,dataEdit, imgID);
		
		ListView lv = (ListView) findViewById(R.id.listView1);
		lv.setAdapter(adap);
		
		lv.setOnItemClickListener(this);
	}
	

    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

    	Toast.makeText(getBaseContext(), 
    		"you" + String.valueOf(position) + " " + data[position] , 0).show();
    }
	
}	

	


