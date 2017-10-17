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
// I received help from no one in designing and debugging my program.
//***********************************************************************

package ajn54.pitt.edu.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class addingCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adding);

        // Click the button to preform the actions
        Button addbtn = (Button) findViewById(R.id.addbtn);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numPT1 = (EditText) findViewById(R.id.numPT1);
                EditText numPT2 = (EditText) findViewById(R.id.numPT2);
                TextView resultsTV = (TextView) findViewById(R.id.resultsTV);

                // Create two instances of numbers and add them together
                int num1 = Integer.parseInt(numPT1.getText().toString());
                int num2 = Integer.parseInt(numPT2.getText().toString());
                int result = num1 + num2;
                resultsTV.setText(result + "");
            }
        });
    }
}