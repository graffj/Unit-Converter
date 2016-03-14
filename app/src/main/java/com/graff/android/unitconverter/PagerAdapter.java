package com.graff.android.unitconverter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


/**
 * Created by Jonathan on 2/22/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag=null;
        switch (position){
            case 0:
                frag=new LengthFragment();
                break;
            case 1:
                frag=new MassFragment();
                break;
            case 2:
                frag=new TemperatureFragment();
                break;
            case 3:
                frag=new VolumeFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 4;
    }




    @Override
    public CharSequence getPageTitle(int position) {
        String title=" ";
        switch (position){
            case 0:
                title="Length";
                break;
            case 1:
                title="Mass";
                break;
            case 2:
                title="Temperature";
                break;
            case 3:
                title="Volume";
                break;
        }

        return title;
    }


}
