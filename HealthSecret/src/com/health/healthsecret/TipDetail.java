package com.health.healthsecret;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class TipDetail extends Activity {

	Context c;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.tipdetail);
		

		int index = getIntent().getExtras().getInt("position");

		if (index == 0) {
		
			Intent tt=new Intent("com.health.healthsecret.FaceTip");
			 startActivity(tt);
		} else if (index == 1) {
			

			Intent tt=new Intent("com.health.healthsecret.Hairtip");
			 startActivity(tt);
		} else if (index == 2) {

			Intent tt=new Intent("com.health.healthsecret.FaceTip");
			 startActivity(tt);
		} else if (index == 3) {

			Intent tt=new Intent("com.health.healthsecret.FaceTip");
			 startActivity(tt);
		} else if (index == 4) {

			Intent tt=new Intent("com.health.healthsecret.FaceTip");
			 startActivity(tt);
			
		}
	}

}




