package com.health.healthsecret;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class quiz extends Activity {

	int nUnits = 10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz);


		
	// get handle of RadioGroup
	
	
	final TextView tvans=(TextView)findViewById(R.id.tvQuiz);
	Button btnSubmit=(Button)findViewById(R.id.btnSubmit);
	RadioButton rgb1=(RadioButton)findViewById(R.id.radio0);
	RadioButton rgb2=(RadioButton)findViewById(R.id.radio1);
	RadioButton rgb3=(RadioButton)findViewById(R.id.radio3);
	RadioButton rgb4=(RadioButton)findViewById(R.id.radio4);
	
		 
				// find the radiobutton by returned id
			       	 
	    
	 
	/*// listener for RadioGroup Java Android example
	       mRadioGroup.setOnCheckedChangeListener(
	                new RadioGroup.OnCheckedChangeListener() {
	                    public void onCheckedChanged(RadioGroup group,
	                            int checkedId) {
	                    	Intent tt=new Intent("com.health.healthsecret.ANSWERPAGE");
	       				 startActivity(tt);
	                       
	                    }

						
	                });*/
			
	
	    			
	    	Typeface typeface=Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/zawgyi.ttf");
	    			
	       if(Result.pageno>=22)
	       {
	    	  Result.pageno=1;
	       }
	       if(Language.lang=="false")
	       {
	       if(Result.pageno==1)
	       {
	    	   tvans.setText("1.	 A dry mouth can lead to bad breath.");
	    	   rgb3.setVisibility(View.INVISIBLE);
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	       }
	       else if(Result.pageno==2)
	       {
	    	   tvans.setText("2.	 What step should you take if your permanent tooth falls out?");
	    	   rgb1.setText("Clean it yourself ");
	    	   rgb2.setText("Keep the tooth safely  ");  
	    	   rgb3.setText("See a Dentist  ");
	    	   rgb4.setText("None of the above");
	    	   
	       } 
	       else if(Result.pageno==3)
	       {
	    	   tvans.setText("3.	Patients of bad breath should drink less water.");
	    	   rgb3.setVisibility(View.INVISIBLE);
	    	   rgb4.setVisibility(View.INVISIBLE);
	       } 
	       else if(Result.pageno==4)
	       {
	    	   tvans.setText("4.	The branch of medicine that deals with skin is called");
	    	   rgb1.setText("Hepatology");
	    	   rgb2.setText("Rheumatology");  
	    	   rgb3.setText("Dermatology");
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	    
	    	  
	       } 
	       else if(Result.pageno==5)
	       {
	    	   tvans.setText("5.	Low-carb diets can cause halitosis.");
	    	   rgb3.setVisibility(View.INVISIBLE);
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	  
	    	   
	       } 
	       else if(Result.pageno==6)
	       {
	    	   tvans.setText("6.	Flossing of teeth can help to reduce bad breath.");
	    	   rgb3.setVisibility(View.INVISIBLE);
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	    	  
	    	   
	       } 
	       else if(Result.pageno==7)
	       {
	    	   tvans.setText("7.	Which of the following is a skin related disease");
	    	   rgb1.setText("Dyspnea ");
	    	   rgb2.setText("Dermatitis");  
	    	   rgb3.setText("Dendrophobia");
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	       } 
	       else if(Result.pageno==8)
	       {
	    	   tvans.setText("8.	Visceral fat is the fat found under the skin.");
	    	   rgb3.setVisibility(View.INVISIBLE);
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	       } 
	       else if(Result.pageno==9)
	       {
	    	   tvans.setText("9.	Which is a skin condition that was made common due to its presence in a celebrity?");
	    	   rgb1.setText("Hives");
	    	   rgb2.setText("Herpes");  
	    	   rgb3.setText("Vitiligo");
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	       } 
	       else if(Result.pageno==10)
	       {
	    	   tvans.setText("10.	Cooling is brought about by");
	    	   rgb1.setText("Sweat glands   ");
	    	   rgb2.setText("Blood vessels ");  
	    	   rgb3.setText("Sweat Glands and Blood vessels");
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	       } 
	       else if(Result.pageno==11)
	       {
	    	   tvans.setText("11.	What is depression? It is a/an");
	    	   rgb1.setText("Feeling of not being well ");
	    	   rgb2.setText("Illness of the mind ");  
	    	   rgb3.setText("Illness that affects the body and the mind ");
	    	   rgb4.setText("Indication of weak personality ");
	    	 
	    	   
	       } 
	       else if(Result.pageno==12)
	       {
	    	   tvans.setText("12.	Middle layer of the skin is called");
	    	   rgb1.setText("Cutaneous Layer  ");
	    	   rgb2.setText("Subcutaneous layer ");  
	    	   rgb3.setText("Dermis");
	    	   	rgb4.setVisibility(View.INVISIBLE);
	       } 
	       else if(Result.pageno==13)
	       {
	    	   tvans.setText("13.	Skin Cancer is mostly caused by");
	    	   rgb1.setText("Too much fat in diet ");
	    	   rgb2.setText("Too much sunlight ");  
	    	   rgb3.setText("Too little exercise");
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	       } 
	       else if(Result.pageno==14)
	       {
	    	   tvans.setText("14.	A mouthwash can eliminate the bad breath caused after consuming garlic."); rgb3.setVisibility(View.INVISIBLE);
	    	   rgb3.setVisibility(View.INVISIBLE);
	    	   rgb4.setVisibility(View.INVISIBLE);
	       } 
	       else if(Result.pageno==15)
	       {
	    	   tvans.setText("15.	How many functions does the skin carry out");
	    	   rgb1.setText("Five");
	    	   rgb2.setText("Seven");  
	    	   rgb3.setText("Twelve");
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	       } 
	       else if(Result.pageno==16)
	       {
	    	   tvans.setText("16.	According to cosmetology what are the skin types");
	    	   rgb1.setText("Oily and dry skin ");
	    	   rgb2.setText("Normal and dry skin ");  
	    	   rgb3.setText("Normal, oily skin and dry skin");
	    	   rgb4.setVisibility(View.INVISIBLE);
	       } 
	       else if(Result.pageno==17)
	       {
	    	   tvans.setText("17.	Best way to maintain dental health is to brush your teeth.");
	    	   rgb1.setText("Once a day  ");
	    	   rgb2.setText("Twice a day ");  
	    	   rgb3.setText("Thrice a day  ");
	    	   rgb4.setText("After all meals");
	    	   
	       } 
	       else if(Result.pageno==18)
	       {
	    	   tvans.setText("18.	Which is the most common skin disease treated by doctors");
	    	   rgb1.setText("Rosacea ");
	    	   rgb2.setText("Acne");  
	    	   rgb3.setText("Keratosis");
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	       } 
	       else if(Result.pageno==19)
	       {
	    	   tvans.setText("19.	Which body type generally has more visceral fat?");
	    	   rgb1.setText("Apple shape  ");
	    	   rgb2.setText("Pear shape ");  
	    	   rgb3.setText("Hourglass shape  ");
	    	   rgb4.setVisibility(View.INVISIBLE);
	       } 
	       else if(Result.pageno==20)
	       {
	    	   tvans.setText("20.	Psoriasis is a chronic skin condition affecting the");
	    	   rgb1.setText("Pancreas");
	    	   rgb2.setText("Immune system ");  
	    	   rgb3.setText("Liver ");
	    	  rgb4.setVisibility(View.INVISIBLE);
	    	   
	       } 
	       else if(Result.pageno==21)
	       {
	    	   tvans.setText("21.	  The skin is the largest organ of our body");
	    	   rgb3.setVisibility(View.INVISIBLE);
	    	   rgb4.setVisibility(View.INVISIBLE);
	    	   
	       }  else if(Result.pageno==22)
	       {
	    	   tvans.setText("22.	Depression affects?");
	    	   rgb1.setText("Older people  ");
	    	   rgb2.setText("Women");  
	    	   rgb3.setText("Teenagers ");
	    	   rgb4.setText("Anyone ");
	    	   
	       }  
	       }
	       else if(Language.lang=="true")
	       {
	    	  tvans.setTypeface(typeface);
	    	  rgb1.setTypeface(typeface);
	    	  rgb1.setText("မွန္");
	    	  rgb2.setTypeface(typeface);
	    	  rgb2.setText("မွား");
	    	  rgb3.setTypeface(typeface);
	    	  rgb4.setTypeface(typeface);
	    	  if(Result.pageno==1)
		       {
		    	   tvans.setText("1.	 ေျခာက္ေသြ႕ေသာ ပါးစပ္က ခံတြင္းအနံ႔ဆိုးထြက္ျခင္းကို ျဖစ္ေစႏိုင္တယ္။");
		    	   rgb3.setVisibility(View.INVISIBLE);
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		       }
		       else if(Result.pageno==2)
		       {
		    	   tvans.setText("2.	သြားက်ိဳးသြားရင္ ဘာလုပ္မလဲ။");
		    	   rgb1.setText("ကိုယ္တိုင္ သန္႔ရွင္းပါ။  ");
		    	   rgb2.setText("သြားကို ေသခ်ာ သိမ္းပါ။   ");  
		    	   rgb3.setText("သြားကို ေသခ်ာသိမ္းယူျပီး ဆရာဝန္ ႏွင့္ ျပပါ။  ");
		    	   rgb4.setText("တစ္ခုမွ မဟုတ္ပါ။");
		    	   
		       } 
		       else if(Result.pageno==3)
		       {
		    	   tvans.setText("3.	ခံတြင္း အနံ႔ဆိုးထြက္သူမ်ား ေရ ေလွ်ာ့ေသာက္သင့္သည္။");
		    	   rgb3.setVisibility(View.INVISIBLE);
		    	   rgb4.setVisibility(View.INVISIBLE);
		       } 
		       else if(Result.pageno==4)
		       {
		    	   tvans.setText("4.	အေရျပားနဲ႔ ဆိုင္တဲ့ ေဆးအမည္က ");
		    	   rgb1.setText("ဟာပါတိုေလာ္ဂ်ီ Hepatology ");
		    	   rgb2.setText("ရူမတိုေလာ္ဂ်ီ Rheumatology ");  
		    	   rgb3.setText("ဒါးမတ္တိုေလာ္ဂ်ီ Dermatology");
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		       } 
		       else if(Result.pageno==5)
		       {
		    	   tvans.setText("5.	သြားထဲမွာ အစာဝင္ရင္ သြားၾကားထုိးရမယ္။");
		    	   rgb3.setVisibility(View.INVISIBLE);
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	  
		    	   
		       } 
		       else if(Result.pageno==6)
		       {
		    	   tvans.setText("6.	သြားကို အပ္ခ်ည္ျဖင့္ရွင္းေပးတာက ခံတြင္းအနံ႔ဆိုးထြက္ျခင္းကို ေလွ်ာ့နည္းေစႏိုင္တယ္။");
		    	   rgb3.setVisibility(View.INVISIBLE);
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	  
		    	   
		       } 
		       else if(Result.pageno==7)
		       {
		    	   tvans.setText("7.	အေရျပားနဲ႔ ပတ္သတ္တဲ့ ေရာဂါက");
		    	   rgb1.setText("  ဒစ္ပနီးရာ Dyspnea  ");
		    	   rgb2.setText("ိဒါမစ္တစ္ Dermatitis ");  
		    	   rgb3.setText("ဒန္ဒရိုဖီဘီးယား Dendrophobia");
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		       } 
		       else if(Result.pageno==8)
		       {
		    	   tvans.setText("8.	ကိုယ္တြင္း အဆီေတြကို အေရျပားေအာက္မွာ ေတြ႕ႏိုင္တယ္။");
		    	   rgb3.setVisibility(View.INVISIBLE);
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		       } 
		       else if(Result.pageno==9)
		       {
		    	   tvans.setText("9.	ဘယ္အေရျပား ျပႆနာက နာမည္ေက်ာ္တစ္ဦးေၾကာင့္ လူသိမ်ားသြားသလဲ။");
		    	   rgb1.setText("ေဟ့စ္ Hives ");
		    	   rgb2.setText("ေရယုန္ Herpes ");  
		    	   rgb3.setText("ဗီတီလီဂို Vitiligo");
		    	   rgb4.setVisibility(View.INVISIBLE);
		       } 
		       else if(Result.pageno==10)
		       {
		    	   tvans.setText("10.	အေရျပား ေအးေနျခင္းက");
		    	   rgb1.setText("ေခၽြးအိတ္ေတြေၾကာင့္ ");
		    	   rgb2.setText("ေသြးေၾကာေတြေၾကာင့္ ");  
		    	   rgb3.setText("ႏွစ္ခုလံုးေၾကာင့္");
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		       } 

		       else if(Result.pageno==11)
		       {
		    	   tvans.setText("11.	စိတ္ဓာတ္က်ျခင္းက");
		    	   rgb1.setText("ေနမေကာင္းျခင္း  ");
		    	   rgb2.setText("စိတ္ပင္ပန္းျခင္း ");  
		    	   rgb3.setText("စိတ္ေရာ လူေရာ ပင္ပန္းျခင္း ");
		    	   rgb4.setText("ကိုယ္ပိုင္ အေရအေသြး ေလ်ာ့နည္းလာျခင္း ");
		       } 
		       else if(Result.pageno==12)
		       {
		    	   tvans.setText("12.	အေရျပားရဲ႕ အလယ္လႊာကို");
		    	   rgb1.setText("က်ဴေတးနီးယက္စ္ အလႊာ  ");
		    	   rgb2.setText("ဆပ္က်ဴေတးနီးယက္စ္ အလႊာ ");  
		    	   rgb3.setText("ဒါးမစ္");
		    	   	rgb4.setVisibility(View.INVISIBLE);
		       } 
		       else if(Result.pageno==13)
		       {
		    	   tvans.setText("13.	အေရျပား ကင္ဆာျဖစ္ေစျခင္း အဓိက အေၾကာင္းက");
		    	   rgb1.setText("အဆီမ်ားလုိ႔  ");
		    	   rgb2.setText("ေနေရာင္ျခည္ ထိတာမ်ားလုိ႔   ");  
		    	   rgb3.setText("အားကစား ျပဳလုပ္တာ နည္းလုိ႔");
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		       } 
		       else if(Result.pageno==14)
		       {
		    	   tvans.setText("14.	ဂ်င္းစားထားေသာ္လည္း ခ်က္ခ်င္း ပါးလုပ္က်င္းျခင္းက ဂ်င္း၏ အနံ႕ဆိုးမ်ား ေပ်ာက္ကင္းႏိုင္သည္။"); 
		    	   rgb3.setVisibility(View.INVISIBLE);
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	  
		       } 
		       else if(Result.pageno==15)
		       {
		    	   tvans.setText("15.	အေရျပားက လုပ္ငန္း ဘယ္ႏွခုေလာက္ လုပ္သလဲ");
		    	   rgb1.setText("ငါးခု");
		    	   rgb2.setText("ခုနစ္ခု");  
		    	   rgb3.setText("ဆယ့္ႏွစ္ခု");
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		       } 
		       else if(Result.pageno==16)
		       {
		    	   tvans.setText("16.	အလွအပ ေဗဒအရ အသားအေရ  အမ်ိဳးအစားေတြက");
		    	   rgb1.setText("  အဆီျပန္ နဲ႔ ေျခာက္ေသြ႕ ေသာ အသားအေရ  ");
		    	   rgb2.setText("ပံုမွန္ နဲ႔ ေျခာက္ေသြ႕ အသားအေရ  ");  
		    	   rgb3.setText("ပံုမွန္၊ အဆီျပန္ နဲ႔ ေျခာက္ေသြ႕ အသားအေရ");
		    	   rgb4.setVisibility(View.INVISIBLE);
		       } 
		       else if(Result.pageno==17)
		       {
		    	   tvans.setText("17.	သြားေတြကို တစ္ေန႔ ဘယ္ႏွစ္ၾကိမ္ တိုက္ သင့္သလဲ။");
		    	   rgb1.setText("တစ္ၾကိမ္   ");
		    	   rgb2.setText("ႏွစ္ၾကိမ္ ");  
		    	   rgb3.setText("သံုးၾကိမ္  ");
		    	   rgb4.setText("အစာ စားျပီးတိုင္း");
		    	   
		       } 
		       else if(Result.pageno==18)
		       {
		    	   tvans.setText("18.	ဘယ္အေရျပား ျပႆနာကို ဆရာဝန္ေတြ ကုသမႈ အမ်ားဆံုးလဲ");
		    	   rgb1.setText("ရိုဆာစီရာ Rosacea ");
		    	   rgb2.setText("ဝက္ျခံ Acne ");  
		    	   rgb3.setText("ကီရာတိုဆစ္ Keratosis");
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		       } 
		       else if(Result.pageno==19)
		       {
		    	   tvans.setText("19.	ကိုယ္တြင္း အဆီေတြက ဘယ္လို ပံုမ်ိဳးရွိသလဲ။");
		    	   rgb1.setText("ပန္းသီးပံု   ");
		    	   rgb2.setText("သစ္ေတာ္သီးပံု");  
		    	   rgb3.setText("သဲနာရီပံု  ");
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		       } 
		       else if(Result.pageno==20)
		       {
		    	   tvans.setText("20.	Psoriasis ေခၚ အေရျပားမွာ အနီကြက္ေတြေပၚ၊ ေျခာက္ေသြ႕ျခင္း ျဖစ္တာက");
		    	   rgb1.setText("ပန္ခရိယက္စ္ေၾကာင့္ ");
		    	   rgb2.setText("ေရာဂါ ကာကြယ္ျခင္း အဖြဲ႕အစည္းေၾကာင့္  ");  
		    	   rgb3.setText("အသည္းေၾကာင့္ ");
		    	  rgb4.setVisibility(View.INVISIBLE);
		    	   
		       } 
		       else if(Result.pageno==21)
		       {
		    	   tvans.setText("21.	အၾကီးမားဆံုး အဂၤါက အေရျပားပါတဲ့။");
		    	   rgb3.setVisibility(View.INVISIBLE);
		    	   rgb4.setVisibility(View.INVISIBLE);
		    	   
		    	   
		    	   
		       }  else if(Result.pageno==22)
		       {
		    	   tvans.setText("22.	စိတ္ဓာတ္က်ျခင္းက ဘယ္သူေတြကို သက္ေရာက္ေစႏိုင္လဲ။");
		    	   rgb1.setText("အသက္ၾကီးသူမ်ား ");
		    	   rgb2.setText("အမ်ိဳးသမီးမ်ား ");  
		    	   rgb3.setText("ဆယ္ေက်ာ္သက္  ");
		    	   rgb4.setText("လူတိုင္း ");
		    	   
		       }  
				
	       }
	
	btnSubmit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			RadioGroup  mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
			int nIdRadio = mRadioGroup.getCheckedRadioButtonId();
			// TODO Auto-generated method stub
			if(Result.pageno==1 ||Result.pageno==6||Result.pageno==5||Result.pageno==19||Result.pageno==21)
			{
				if(nIdRadio == R.id.radio0) Result.result = 1;
				else  Result.result = 2; 
			}
			else if(Result.pageno==3||Result.pageno==14||Result.pageno==17 ||Result.pageno==8||Result.pageno==13||Result.pageno==15||Result.pageno==7||Result.pageno==18||Result.pageno==20)
			{
				if(nIdRadio == R.id.radio1) Result.result = 1;
    			else Result.result = 2; 
			}
			else if(Result.pageno==2 ||Result.pageno==10||Result.pageno==12||Result.pageno==4||Result.pageno==16||Result.pageno==9||Result.pageno==11)
			{
				if(nIdRadio == R.id.radio3) Result.result = 1;
    			else Result.result = 2; 
			}
			else 
			{
				if(nIdRadio == R.id.radio4) Result.result = 1;
    			else Result.result = 2; 
			}
			finish();
			Intent tt=new Intent("com.health.healthsecret.ANSWERPAGE");
				 startActivity(tt);
			
		}
	});
	
	 
}
}
