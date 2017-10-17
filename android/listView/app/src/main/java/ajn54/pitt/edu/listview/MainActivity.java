//***********************************************************************
// Project: Assignment 1
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

package ajn54.pitt.edu.listview;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create listview with buttons
        listview = (ListView)findViewById(R.id.listview);
        String[] values = new String[]{"Hello World","Addition Calculator","Color Changer"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item,android.R.id.text1,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long id) {

                // Create three intents that direct to the other classes
                if(position==0) {
                    Intent myintent = new Intent(view.getContext(),helloWorld.class);
                    startActivityForResult(myintent,0);
                }
                if(position==1) {
                    Intent myintent = new Intent(view.getContext(),addingCalc.class);
                    startActivityForResult(myintent,1);
                }
                if(position==2) {
                    Intent myintent = new Intent(view.getContext(),color.class);
                    startActivityForResult(myintent,2);
                }

            }
        });
    }
}
