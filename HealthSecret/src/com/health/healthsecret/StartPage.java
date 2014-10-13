package com.health.healthsecret;






import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;


public class StartPage extends Activity  {

	Button q1,t1,v1,e1;
	Switch sl;
	 private static final long delay = 2000L;
	    private boolean mRecentlyBackPressed = false;
	    private Handler mExitHandler = new Handler();
	    private Runnable mExitRunnable = new Runnable() {

	        @Override
	        public void run() {
	            mRecentlyBackPressed=false;   
	        }
	    };
	    
	    @Override
	    public void onBackPressed() {

	        //You may also add condition if (doubleBackToExitPressedOnce || fragmentManager.getBackStackEntryCount() != 0) // in case of Fragment-based add
	        if (mRecentlyBackPressed) {
	            mExitHandler.removeCallbacks(mExitRunnable);
	            mExitHandler = null;
	            super.onBackPressed();
	        }
	        else
	        {
	            mRecentlyBackPressed = true;
	            Toast.makeText(this, "Press back once again to exit", Toast.LENGTH_SHORT).show();
	            mExitHandler.postDelayed(mExitRunnable, delay);
	        }
	    }

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startpage);
		q1=(Button)findViewById(R.id.btnquiz);
		t1=(Button)findViewById(R.id.btntip);
		v1=(Button)findViewById(R.id.btnvitamin);
		e1=(Button)findViewById(R.id.btnexercise);
		sl=(Switch)findViewById(R.id.lang1);
		Result.pageno=1;
		
		sl.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(sl.isChecked())
				{
				Language.lang="true";
				
		 
		       	}
				else
					Language.lang="false";
				
			}
		});
		
q1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(sl.isChecked())
				{
				Language.lang="true";
		 
		       	}
				else
					Language.lang="false";
				Intent a = new Intent("com.health.healthsecret.QUIZ");
				startActivity(a);
				
			}
		});

t1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(sl.isChecked())
		{
		Language.lang="true";
 
       	}
		else
			Language.lang="false";
		Intent i = new Intent("com.health.healthsecret.MAINPAGE");
		startActivity(i);
		
	}
});

e1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(sl.isChecked())
		{
		Language.lang="true";
 
       	}
		else
			Language.lang="false";
		Intent i = new Intent("com.health.healthsecret.EXERCISEGRID");
		startActivity(i);
		
	}
});

v1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(sl.isChecked())
		{
		Language.lang="true";
 
       	}
		else
			Language.lang="false";
		Intent i = new Intent("com.health.healthsecret.VITAMINGRID");
		startActivity(i);
		
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		 super.onCreateOptionsMenu(menu);
		MenuInflater blow=getMenuInflater();
		blow.inflate(R.menu.cool_menu, menu);
		return true;
	}

		
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.aboutUs:
			Intent i=new Intent("com.health.healthsecret.ABOUT");
			startActivity(i);
			break;
		case R.id.ref:
			Intent j=new Intent("com.health.healthsecret.REFERENCE");
			startActivity(j);
			break;
		case R.id.exit:
			finish();
			break;
		}
		return false;
	}

	
	


}



