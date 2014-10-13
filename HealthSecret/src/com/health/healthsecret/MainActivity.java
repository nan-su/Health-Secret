package com.health.healthsecret;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;


public class MainActivity extends Activity {
	
	
	MediaPlayer ourSong;
	
	@Override
	protected void onCreate(Bundle Start) {
		// TODO Auto-generated method stub
		super.onCreate(Start);
		Language.lang="false";
		setContentView(R.layout.activity_main);
		 ourSong=MediaPlayer.create(MainActivity.this, R.raw.music);
		ourSong.start();
		Thread timer = new Thread(){
		 public void run(){
			 try{
				 sleep(5000);
				 
			 }
			 catch(InterruptedException e){
				 e.printStackTrace();
			 }finally{
				 Intent tt=new Intent("com.health.healthsecret.STARTPAGE");
				 startActivity(tt);
			 }
		 }
		 
		};
		timer.start();
	}
	@Override
	protected void onPause(){
		//ToDo Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	
	
	}

}
