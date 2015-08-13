package com.example.piyush.sdknewui.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.piyush.sdknewui.fragments.CreditDebitFragment;
import com.example.piyush.sdknewui.fragments.EmiFragment;
import com.example.piyush.sdknewui.fragments.NetBankingFragment;
import com.example.piyush.sdknewui.fragments.PayuMoneyFragment;
import com.example.piyush.sdknewui.fragments.SavedCardsFragment;

/**
 * Created by piyush on 29/7/15.
 */
public class PageAdapter extends FragmentPagerAdapter {

    private String[] mTitles;
    private int mTabCount;

    public PageAdapter(FragmentManager fm, String[] titles, int tabCount) {
        super(fm);
        this.mTitles = titles;
        this.mTabCount = tabCount;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i){
            case 0:
                fragment = new SavedCardsFragment();
                break;
            case 1:
                fragment = new CreditDebitFragment();
                break;
            case 2:
                fragment = new NetBankingFragment();
                break;
            case 3:
                fragment = new PayuMoneyFragment();
                break;
            case 4:
                fragment = new EmiFragment();
                break;
            default:
                fragment = new SavedCardsFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return mTabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
