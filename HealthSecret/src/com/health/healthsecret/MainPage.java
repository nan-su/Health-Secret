package com.health.healthsecret;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainPage extends Activity {

	
		GridView gridView;
		 
		static final String[] MOBILE_OS = new String[] { 
			"Face", "Hair","Skin", "MakeUp","Weight Loss" };
	   static final String[] MyanmarMOBILE_OS=new String[]{
		   "မ်က္ႏွာ","ဆံပင္","အေရျပား","မိတ္ကပ္","၀ိတ္ခ်နည္း" };
		@Override
		public void onCreate(Bundle savedInstanceState) {
	 
			super.onCreate(savedInstanceState);
			setContentView(R.layout.mainpage);
	 
			gridView = (GridView) findViewById(R.id.gridView1);
	 
			if(Language.lang=="true")
			{
			gridView.setAdapter(new CustomGridViewAdapter(this, MyanmarMOBILE_OS));
			}
			else
			{
				gridView.setAdapter(new CustomGridViewAdapter(this, MOBILE_OS));
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
					Intent it = new Intent(getApplicationContext(), FaceTip.class);
					it.putExtra("position", position);
					startActivity(it);
					}
					else if(position==1)
					{
						Intent it = new Intent(getApplicationContext(), Hairtip.class);
						it.putExtra("position", position);
						startActivity(it);
					}
					else if(position==2)
					{
						Intent it = new Intent(getApplicationContext(), SkinTip.class);
						it.putExtra("position", position);
						startActivity(it);
					}
					if(position==3)
					{
					Intent it = new Intent(getApplicationContext(), MakeupTip.class);
					it.putExtra("position", position);
					startActivity(it);
					}
					if(position==4)
					{
					Intent it = new Intent(getApplicationContext(), Weightlossex.class);
					it.putExtra("position", position);
					startActivity(it);
					}
				}
			});
	 
		}
	 
	}
