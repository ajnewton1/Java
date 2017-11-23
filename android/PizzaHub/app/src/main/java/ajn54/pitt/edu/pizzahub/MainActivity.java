//***********************************************************************
// Project: Lab 4
// Class: Mobile Application Development
//
// Author: Aaron Newton
// User: AJN54
//
// Completion time: 2 hours total
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from YouTube in designing and debugging my program.
//***********************************************************************

package ajn54.pitt.edu.pizzahub;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;
    private TabLayout tabLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Setting up the tabs with icons
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.pizza);
        tabLayout.getTabAt(1).setIcon(R.drawable.dessert);
        tabLayout.getTabAt(2).setIcon(R.drawable.wing);
        tabLayout.getTabAt(3).setIcon(R.drawable.website);
        tabLayout.getTabAt(4).setIcon(R.drawable.order);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            //Returning the current tabs
            switch (position){
                case 0:
                    pizza tab1 = new pizza();
                    return tab1;
                case 1:
                    dessert tab2 = new dessert();
                    return tab2;
                case 2:
                    wing tab3 = new wing();
                    return tab3;
                case 3:
                    website tab4 = new website();
                    return tab4;
                case 4:
                    order tab5 = new order();
                    return tab5;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // text under the icons
            switch (position) {
                case 0:
                    return "PIZZA";
                case 1:
                    return "DES'RT";
                case 2:
                    return "WINGS";
                case 3:
                    return "ONLINE";
                case 4:
                    return "ORDER";
            }
            return null;
        }
    }
}