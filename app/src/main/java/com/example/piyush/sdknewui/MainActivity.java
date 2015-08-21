package com.example.piyush.sdknewui;

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.piyush.sdknewui.Adapter.PageAdapter;
import com.example.piyush.sdknewui.Utils.SdkUIConstants;
import com.example.piyush.sdknewui.swipeTab.SlidingTabLayout;


public class MainActivity extends AppCompatActivity {

    private int mTabCount;
    private PagerAdapter pagerAdapter;
    private ViewPager viewPager;
    private SlidingTabLayout slidingTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabCount = SdkUIConstants.mTitles.length;

        pagerAdapter =  new PageAdapter(getSupportFragmentManager(), SdkUIConstants.mTitles, mTabCount);

        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(pagerAdapter);

        viewPager.setPageMargin(3);
        viewPager.setPageMarginDrawable(R.color.black);

        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tab_layout);
        slidingTabLayout.setDistributeEvenly(false);


        slidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        slidingTabLayout.setViewPager(viewPager);
//        slidingTabLayout.setSelectedIndicatorColors(R.color.color_paynow_button);

//        Spinner mSpinner = (Spinner) findViewById(R.id.spinner);
//        ArrayAdapter<CharSequence> mAdapter = ArrayAdapter.createFromResource(this, R.array.bank_names,
//                android.R.layout.simple_spinner_item);
//
//        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        mSpinner.setAdapter(mAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
