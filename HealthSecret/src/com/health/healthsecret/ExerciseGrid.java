package com.health.healthsecret;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class ExerciseGrid extends Activity {


	GridView gridView;
	 
	static final String[] Exercise = new String[] { 
		"Head", "Chin","Hand", "Leg","Belly" };
	static final String[] MyanmarExercise=new String[]{
		"ေခါင္း","ေမးေစ့","လက္","ေျခေထာက္","ဗိုက္ေခါက္"
	};
	
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainpage);
 
		gridView = (GridView) findViewById(R.id.gridView1);
 
		if(Language.lang=="true")
		{
			gridView.setAdapter(new CustomExerciseAdapter(this, MyanmarExercise));
		}
		else
		{
			gridView.setAdapter(new CustomExerciseAdapter(this, Exercise));
			}
 
		
 
		
 
		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				/*Toast.makeText(
				   getApplicationContext(),
				   ((TextView) v.findViewById(R.id.textView1))
				   .getText(), Toast.LENGTH_SHORT).show();*/
				if(position==0)
				{
				Intent it = new Intent(getApplicationContext(), HeadNeckex.class);
				it.putExtra("position", position);
				startActivity(it);
				}
				if(position==1)
				{
				Intent it = new Intent(getApplicationContext(), Chinex.class);
				it.putExtra("position", position);
				startActivity(it);
				}
				if(position==2)
				{
				Intent it = new Intent(getApplicationContext(), Handex.class);
				it.putExtra("position", position);
				startActivity(it);
				}
				if(position==3)
				{
				Intent it = new Intent(getApplicationContext(), Legex.class);
				it.putExtra("position", position);
				startActivity(it);
				}
				if(position==4)
				{
					Intent it = new Intent(getApplicationContext(), Bellyex.class);
					it.putExtra("position", position);
					startActivity(it);
					}
			}
		});
 
	}
 
}


