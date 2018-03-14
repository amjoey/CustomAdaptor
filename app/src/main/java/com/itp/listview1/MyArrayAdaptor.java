package com.itp.listview1;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MyArrayAdaptor extends ArrayAdapter<String>{
	private final Activity context;
	private final String[] title;
	private final String[] desc;
	private final String[] edit1;
	private final Integer[] imgID;

	public MyArrayAdaptor(Activity context, String[] titles, String[] descs,String[] editText1, Integer[] imgIDs) {
		super(context, R.layout.row_layout, titles);
		this.context = context;
		this.title = titles;
		this.desc = descs;
		this.edit1 = editText1;
		this.imgID = imgIDs;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		Log.d("myarrayadaptor",String.valueOf(position));
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.row_layout,null,true);

		TextView tvTitle = (TextView) rowView.findViewById(R.id.txtTitle);
		TextView tvDesc = (TextView) rowView.findViewById(R.id.txtDescription);
		EditText editText = (EditText) rowView.findViewById(R.id.txtEdit1);
		ImageView img = (ImageView) rowView.findViewById(R.id.icon);

		tvTitle.setText(title[position]);
		tvDesc.setText("description: " + desc[position]);
		editText.setText(edit1[position]);
		img.setImageResource(imgID[position]);

		return rowView;

	}
}


	
	
