package ajn54.pitt.edu.listview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color);


        // Make button instance and Action
        Button convertBtn = (Button) findViewById(R.id.convertBtn);
        convertBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // Make instances for color EditText and convert them to int.
                EditText redText = (EditText) findViewById(R.id.redText);
                int redNum = Integer.parseInt(redText.getText().toString());
                // Convert to 255 if color is over 255
                if (redNum > 255) {
                    redNum = 255;
                }

                EditText greenText = (EditText) findViewById(R.id.greenText);
                int greenNum = Integer.parseInt(greenText.getText().toString());
                // Convert to 255 if color is over 255
                if (greenNum > 255) {
                    greenNum = 255;
                }

                EditText blueText = (EditText) findViewById(R.id.blueText);
                int blueNum = Integer.parseInt(blueText.getText().toString());
                // Convert to 255 if color is over 255
                if (blueNum > 255) {
                    blueNum = 255;
                }

                // Make instance for ColorView and then apply the color once button is hit
                TextView colorView = (TextView) findViewById(R.id.colorView);
                colorView.setBackgroundColor(Color.rgb(redNum, greenNum, blueNum));

            }
        });
    }
}