package com.health.healthsecret;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Answerpage extends Activity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.answerpage);
		final TextView ans=(TextView)findViewById(R.id.txtans);
		Button btnNext=(Button)findViewById(R.id.btnNext);
		Typeface typeface=Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/zawgyi.ttf");
		if(Language.lang=="false")
		{
		switch(Result.pageno)
		{
		case 1:
			if(Result.result==1)
				ans.setText(getString(R.string.correct) +"\n"+getString(R.string.ans1));
			else if(Result.result==2)
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans1));
			break;
		case 2:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans6));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans6));
			break;
		case 3:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans3));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans3));
			break;
		case 4:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans14));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans14));
			break;
		case 5:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans5));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans5));
			break;
		case 6:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans2));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans2));
			break;
		case 7:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans17));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans17));
			break;
		case 8:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans8));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans8));
			break;
		case 9:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans19));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans19));
			break;
		case 10:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans10));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans10));
			break;
		case 11:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans21));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans21));
			break;
		case 12:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans12));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans12));
			break;
		case 13:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans13));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans13));
			break;
		case 14:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans4));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans4));
			break;
		case 15:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans15));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans15));
			break;	
		case 16:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans16));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans16));
			break;
		case 17:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans7));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans7));
			break;
		case 18:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans18));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans18));
			break;
		case 19:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans9));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans9));
			break;
		case 20:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans20));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans20));
			break;
		case 21:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans11));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans11));
			break;
		case 22:
			if(Result.result==1)
				ans.setText(getString(R.string.correct)+"\n"+getString(R.string.ans22));
			else
				ans.setText(getString(R.string.wrong)+"\n"+getString(R.string.ans22));
			break;
			
		}
		}
		else if(Language.lang=="true")
		{
			ans.setTypeface(typeface);
			switch(Result.pageno)
			{
			case 1:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n" +getString(R.string.mans1));
				else if(Result.result==2)
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans1));
				break;
			case 2:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans6));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans6));
				break;
			case 3:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans3));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans3));
				break;
			case 4:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans14));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans14));
				break;
			case 5:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans5));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans5));
				break;
			case 6:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans2));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans2));
				break;
			case 7:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans17));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans17));
				break;
			case 8:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans8));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans8));
				break;
			case 9:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans19));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans19));
				break;
			case 10:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans10));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans10));
				break;
			case 11:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans21));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans21));
				break;
			case 12:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans12));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans12));
				break;
			case 13:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans13));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans13));
				break;
			case 14:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans4));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans4));
				break;
			case 15:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans15));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans15));
				break;	
			case 16:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans16));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans16));
				break;
			case 17:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans7));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans7));
				break;
			case 18:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans18));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans18));
				break;
			case 19:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans9));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans9));
				break;
			case 20:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans20));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans20));
				break;
			case 21:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans11));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans11));
				break;
			case 22:
				if(Result.result==1)
					ans.setText(getString(R.string.mcorrect)+"\n"+getString(R.string.mans22));
				else
					ans.setText(getString(R.string.mwrong)+"\n"+getString(R.string.mans22));
				break;
			}
		}
		btnNext.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Result.pageno+=1;
				finish();
				Intent tt=new Intent("com.health.healthsecret.QUIZ");
   				 startActivity(tt);
				
			}
		});
		
	}
	
}
