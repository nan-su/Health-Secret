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


public class Legex extends FragmentActivity {
	
	
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
			return 9;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			
			switch (position) {
			case 0:
				return getString(R.string.title_section29);
			case 1:
				return getString(R.string.title_section30);
			case 2:
				return getString(R.string.title_section31);
			case 3:
				return getString(R.string.title_section32);
			case 4:
				return getString(R.string.title_section33);
			case 5:
				return getString(R.string.title_section34);
			case 6:
				return getString(R.string.title_section35);
			case 7:
				return getString(R.string.title_section36);
			case 8:
				return getString(R.string.title_section37);
			
				
			}
			return null;
		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	@SuppressLint("SetJavaScriptEnabled")
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}

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

				if(getArguments().getInt(ARG_SECTION_NUMBER)==1)
				{
					
					if(Language.lang=="true")
					{

						CharSequence html = loadAssetsText(inflater.getContext(), "legExercise/l1myanmar.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/legExercise/l1myanmar.html", html.toString(), "text/html", "utf-8", null);
						
					}
					else{
					wv.loadUrl("file:///android_asset/legExercise/l1.html");
					}
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==2)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "legExercise/l2myanmar.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/legExercise/l2myanmar.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/legExercise/l2.html");
					}
					
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==3)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "legExercise/l3myanmar.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/legExercise/l3myanmar.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/legExercise/l3.html");
					}
				
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==4)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "legExercise/l4myanmar.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/legExercise/l4myanmar.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/legExercise/l4.html");
					}
				
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==5)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "legExercise/l5myanmar.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/legExercise/l5myanmar.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/legExercise/l5.html");
					}
				
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==6)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "legExercise/l6myanmar.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/legExercise/l6myanmar.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/legExercise/l6.html");
					}
				
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==7)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "legExercise/l7myanmar.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/legExercise/l7myanmar.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/legExercise/l7.html");
					}
				
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==8)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "legExercise/l8myanmar.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/legExercise/l8myanmar.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/legExercise/l8.html");
					}
				
				}
				else if(getArguments().getInt(ARG_SECTION_NUMBER)==9)
				{
					if(Language.lang=="true")
					{
						CharSequence html = loadAssetsText(inflater.getContext(), "legExercise/l9myanmar.html"); 
						html = Utility.ZawGyiDrawFix(html);
						wv.loadDataWithBaseURL("file:///android_asset/legExercise/l9myanmar.html", html.toString(), "text/html", "utf-8", null);
					}
					
					else
					{
					wv.loadUrl("file:///android_asset/legExercise/l9.html");
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
