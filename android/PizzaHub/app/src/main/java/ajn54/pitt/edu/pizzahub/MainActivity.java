//***********************************************************************
// Project: Project
// Class: Mobile Application Development
//
// Author: Aaron Newton
// User: AJN54
//
// Completion time:  3 days
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

        // Displaying icons on Tabs
        tabLayout.getTabAt(0).setIcon(R.drawable.pizza);
        tabLayout.getTabAt(1).setIcon(R.drawable.wing);
        tabLayout.getTabAt(2).setIcon(R.drawable.salad);
        tabLayout.getTabAt(3).setIcon(R.drawable.side);
        tabLayout.getTabAt(4).setIcon(R.drawable.dessert);
        tabLayout.getTabAt(5).setIcon(R.drawable.website);
        tabLayout.getTabAt(6).setIcon(R.drawable.order);
        tabLayout.getTabAt(7).setIcon(R.drawable.database);
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

        // Associating Java file with each Tab
        @Override
        public Fragment getItem(int position) {
            //Returning the current tabs
            switch (position){
                case 0:
                    pizza tab1 = new pizza();
                    return tab1;
                case 1:
                    wing tab2 = new wing();
                    return tab2;
                case 2:
                    salad tab3 = new salad();
                    return tab3;
                case 3:
                    side tab4 = new side();
                    return tab4;
                case 4:
                    dessert tab5 = new dessert();
                    return tab5;
                case 5:
                    website tab6 = new website();
                    return tab6;
                case 6:
                    order tab7 = new order();
                    return tab7;
                case 7:
                    database tab8 = new database();
                    return tab8;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 8;
        }
    }
}