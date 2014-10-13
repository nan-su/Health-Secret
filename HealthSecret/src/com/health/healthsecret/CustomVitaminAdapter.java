package com.health.healthsecret;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomVitaminAdapter extends BaseAdapter {
	private Context context;
	private final String[] vitaminValues;
 
	public CustomVitaminAdapter(Context context, String[] vitaminValues) {
		this.context = context;
		this.vitaminValues = vitaminValues;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View gridView;
 
		if (convertView == null) {
 
			gridView = new View(context);
 
			// get layout from mobile.xml
			gridView = inflater.inflate(R.layout.row_grid, null);
 
			Typeface typeface=Typeface.createFromAsset(context.getAssets(), "fonts/zawgyi.ttf");
			ImageView imageView = (ImageView) gridView
					.findViewById(R.id.imageView1);
			if(Language.lang=="true")
			{
			TextView textView = (TextView) gridView
					.findViewById(R.id.textView1);
			 textView.setTypeface(typeface);
			textView.setText(vitaminValues[position]);
			
			String mexercise = vitaminValues[position];
			 
			if (mexercise.equals("အခ်ိဳရည္")) {
				imageView.setImageResource(R.drawable.j1);
			} else if (mexercise.equals("စားစရာ")) {
				imageView.setImageResource(R.drawable.food2);
			} else if (mexercise .equals("မ်က္ႏွာဖုံး")) {
				imageView.setImageResource(R.drawable.masks250);
			}
			}
			else if(Language.lang=="false")
			{
			
			// set value into textview
			TextView textView = (TextView) gridView
					.findViewById(R.id.textView1);
			textView.setText(vitaminValues[position]);
 
			// set image based on selected text
			 
			String exercise = vitaminValues[position];
 
			if (exercise.equals("Juice")) {
				imageView.setImageResource(R.drawable.j1);
			} else if (exercise.equals("Food")) {
				imageView.setImageResource(R.drawable.food2);
			} else if (exercise .equals("Mask")) {
				imageView.setImageResource(R.drawable.masks250);
			}
			}
 
		} else {
			gridView = (View) convertView;
		}
 
		return gridView;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return vitaminValues.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
