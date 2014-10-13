package com.health.healthsecret;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomExerciseAdapter extends BaseAdapter {
	
	private Context context;
	private final String[] exerciseValues;
 
	public CustomExerciseAdapter(Context context, String[] exerciseValues) {
		this.context = context;
		this.exerciseValues = exerciseValues;
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
			textView.setText(exerciseValues[position]);
			

			String mexercise = exerciseValues[position];
			 
			if (mexercise.equals("ေခါင္း")) {
				imageView.setImageResource(R.drawable.head);
			} else if (mexercise.equals("ေမးေစ့")) {
				imageView.setImageResource(R.drawable.chin);
			} else if (mexercise .equals("လက္")) {
				imageView.setImageResource(R.drawable.hand);
			} else if(mexercise .equals("ေျခေထာက္")){
				imageView.setImageResource(R.drawable.leg);
			}else if(mexercise .equals("ဗိုက္ေခါက္")){
				imageView.setImageResource(R.drawable.belly);
			}
			}
			else if(Language.lang=="false")
			{
			// set value into textview
			TextView textView = (TextView) gridView
					.findViewById(R.id.textView1);
			textView.setText(exerciseValues[position]);
 
			// set image based on selected text
			
			String exercise = exerciseValues[position];
 
			if (exercise.equals("Head")) {
				imageView.setImageResource(R.drawable.head);
			} else if (exercise.equals("Chin")) {
				imageView.setImageResource(R.drawable.chin);
			} else if (exercise .equals("Hand")) {
				imageView.setImageResource(R.drawable.hand);
			} else if(exercise .equals("Leg")){
				imageView.setImageResource(R.drawable.leg);
			}else if(exercise .equals("Belly")){
				imageView.setImageResource(R.drawable.belly);
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
		return exerciseValues.length;
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
