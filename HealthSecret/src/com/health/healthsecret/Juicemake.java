package com.health.healthsecret;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.annotation.SuppressLint;
import android.content.Context;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class Juicemake extends FragmentActivity {
	
	
	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	public static  String m1 ="true";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facetip);

		// Create the adapter that will return a fragment for each of the three
		// primary sections of the app.
		mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		
		
	}

	

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args);
			return fragment;
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 5;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			
			switch (position) {
			case 0:
				return getString(R.string.title_section24);
			case 1:
				return getString(R.string.title_section25);
			case 2:
				return getString(R.string.title_section26);
			case 3:
				return getString(R.string.title_section27);
			case 4:
				return getString(R.string.title_section28);
			}
			return null;
		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}

		@SuppressLint({ "NewApi", "SetJavaScriptEnabled" })
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main_dummy, container, false);
			
			WebView wv = (WebView)rootView.findViewById(R.id.my_webview);
			wv.getSettings().setJavaScriptEnabled(true);
			wv.getSettings().setBuiltInZoomControls(true);
			wv.getSettings().setSupportZoom(true);
						
			wv.setWebViewClient(new WebViewClient() {

				@Override

				public boolean shouldOverrideUrlLoading(WebView view, String url) {

				view.loadUrl(url);

				return true;

				}

				});
			
				

				
		       
		/*	if(getArguments().getInt(ARG_SECTION_NUMBER)==1)
			{
				dummyImageView.setImageResource(R.drawable.exercise1);
				
				if(m1=="true")
					
				{dummyTextView.setTypeface(typeface);
			dummyTextView.setText("ေန႕ာင္းပါသမလား " +
					"				ဘာေတြလုပ္ေနလည္း");}
				else
				{
					dummyTextView.setText("How are u???" +"Good Morning"+m1);
					
				}
			}
			
			else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
			{
				dummyImageView.setImageResource(R.drawable.personal);
				dummyTextView.setText("Are u crazy?? " +
						"				What do u want???");
				
			}
			else if(getArguments().getInt(ARG_SECTION_NUMBER)==3)
			{
				dummyImageView.setImageResource(R.drawable.quizz2);
				dummyTextView.setText("Well,Good Job " +
					"				See U soon");
			
			}*/
				if(getArguments().getInt(ARG_SECTION_NUMBER)==1)
				{
					
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "Juice/MyanmarTropicaljuice.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/Juice/MyanmarTropicaljuice.html", html.toString(), "text/html", "utf-8", null);
					}
					else{
					wv.loadUrl("file:///android_asset/Juice/Tropicaljuice.html");
					}
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "Juice/MyanmarPapayaBerrtjuice.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/Juice/MyanmarPapayaBerrtjuice.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/Juice/PapayaBerrtjuice.html");
					}
					
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==3)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "Juice/MyanmarCBJuice.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/Juice/MyanmarCBJuice.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/Juice/CBJuice.html");
					}
				
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==4)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "Juice/MyanmarStrawBananajuice.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/Juice/MyanmarStrawBananajuice.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/Juice/StrawBananajuice.html");
					}
				
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==5)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "Juice/MyanmarCarrotMangojuice.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/Juice/MyanmarCarrotMangojuice.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/Juice/CarrotMangojuice.html");
					}
				
				}
				
			return rootView;
		}
	} 

	static String loadAssetsText(Context context, String path) {
		if (TextUtils.isEmpty(path)) return null;
		
		InputStream stream = null;
		try {
			stream = context.getAssets().open(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (stream != null) {
			StringBuilder builder = new StringBuilder();
			
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
				String str;

			    while ((str = reader.readLine()) != null) {
			    	builder.append(str);
			    }
			    
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return builder.toString();
		}
		return "";
	}
}
