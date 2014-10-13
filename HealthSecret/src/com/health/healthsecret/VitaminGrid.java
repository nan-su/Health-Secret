package com.health.healthsecret;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class VitaminGrid extends Activity{

	GridView gridView;
	 
	static final String[] Vitamin = new String[] { 
		"Juice", "Food","Mask" };
	static final String[] MyanmarVitamin=new String[]{
		"အခ်ိဳရည္","စားစရာ","မ်က္ႏွာဖုံး"
	};
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainpage);
 
		gridView = (GridView) findViewById(R.id.gridView1);
		if(Language.lang=="true")
		{
			gridView.setAdapter(new CustomVitaminAdapter(this, MyanmarVitamin));
		}
		else
		{
			gridView.setAdapter(new CustomVitaminAdapter(this, Vitamin));
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
				Intent it = new Intent(getApplicationContext(), Juicemake.class);
				it.putExtra("position", position);
				startActivity(it);
				}
				else if(position==1)
				{
				
				Intent it = new Intent(getApplicationContext(), Food.class);
				it.putExtra("position", position);
				startActivity(it);
				}
				else
				{
					
					Intent it = new Intent(getApplicationContext(), Mask.class);
					it.putExtra("position", position);
					startActivity(it);
					}	
 
			}
		});
 
	}
 
}

