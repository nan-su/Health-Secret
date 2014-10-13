package com.health.healthsecret;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGridViewAdapter extends BaseAdapter {
	private Context context;
	private final String[] mobileValues;
	
	
	public CustomGridViewAdapter(Context context, String[] mobileValues) {
		this.context = context;
		this.mobileValues = mobileValues;
	}
 
	public View getView(int position, View convertView, ViewGroup parent) {
 
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View gridView;
 
		if (convertView == null) {
 
			gridView = new View(context);
 
			// get layout from mobile.xml
			gridView = inflater.inflate(R.layout.row_grid, null);
 
			// set value into textview
			Typeface typeface=Typeface.createFromAsset(context.getAssets(), "fonts/zawgyi.ttf");
			ImageView imageView = (ImageView) gridView
					.findViewById(R.id.imageView1);
			if(Language.lang=="true")
			{
			TextView textView = (TextView) gridView
					.findViewById(R.id.textView1);
			 textView.setTypeface(typeface);
			textView.setText(mobileValues[position]);
			

			String mmobile = mobileValues[position];
 
			if (mmobile.equals("မ်က္ႏွာ")) {
				imageView.setImageResource(R.drawable.cleaningl);
			} else if (mmobile.equals("ဆံပင္")) {
				imageView.setImageResource(R.drawable.gh2);
			} else if (mmobile.equals("အေရျပား")) {
				imageView.setImageResource(R.drawable.sk2);
			} else if(mmobile.equals("မိတ္ကပ္")){
				imageView.setImageResource(R.drawable.m3);
			} else if(mmobile.equals("၀ိတ္ခ်နည္း")){
				imageView.setImageResource(R.drawable.weight);
			}
			}
			else if(Language.lang=="false")
			{
				TextView textView = (TextView) gridView
						.findViewById(R.id.textView1);
				textView.setText(mobileValues[position]);
				
			// set image based on selected text
			
			
			String mobile = mobileValues[position];
 
			if (mobile.equals("Face")) {
				imageView.setImageResource(R.drawable.cleaningl);
			} else if (mobile.equals("Hair")) {
				imageView.setImageResource(R.drawable.gh2);
			} else if (mobile.equals("Skin")) {
				imageView.setImageResource(R.drawable.sk2);
			} else if(mobile.equals("MakeUp")){
				imageView.setImageResource(R.drawable.m3);
			} else if(mobile.equals("Weight Loss")){
				imageView.setImageResource(R.drawable.weight);
			}
			}
 
		} else {
			gridView = (View) convertView;
		}
 
		return gridView;
	}
 
	@Override
	public int getCount() {
		return mobileValues.length;
	}
 
	@Override
	public Object getItem(int position) {
		return null;
	}
 
	@Override
	public long getItemId(int position) {
		return 0;
	}
 
}