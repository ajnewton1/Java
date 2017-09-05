package ajn54.pitt.edu.addingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button addbtn = (Button) findViewById(R.id.addbtn);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numPT1 = (EditText) findViewById(R.id.numPT1);
                EditText numPT2 = (EditText) findViewById(R.id.numPT2);
                TextView resultsTV = (TextView) findViewById(R.id.resultsTV);

                int num1 = Integer.parseInt(numPT1.getText().toString());
                int num2 = Integer.parseInt(numPT2.getText().toString());
                int result = num1 + num2;
                resultsTV.setText(result + "");
            }
        });
    }
}
