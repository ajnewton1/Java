package ajn54.pitt.edu.pizzahub;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class order extends Fragment implements View.OnClickListener {

    // TextViews and Buttons
    TextView pizzaTV;
    TextView wingsTV;
    TextView saladTV;
    TextView sidesTV;
    TextView resultsTV;
    Button clear;
    Button calc;

    // Pizza button
    Button small;

    // Wings button
    Button six;

    // Salads button
    Button salad;

    // Sides button
    Button gBread;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.order, container, false);

        // Set variable = to R.id
        pizzaTV = rootView.findViewById(R.id.pizzaTV);
        wingsTV = rootView.findViewById(R.id.wingsTV);
        saladTV = rootView.findViewById(R.id.saladTV);
        sidesTV = rootView.findViewById(R.id.sidesTV);
        resultsTV = rootView.findViewById(R.id.resultsTV);
        clear = rootView.findViewById(R.id.clearBtn);
        calc = rootView.findViewById(R.id.calcBtn);
        small = rootView.findViewById(R.id.smallPizzaBtn);
        six = rootView.findViewById(R.id.sixWingsBtn);
        salad = rootView.findViewById(R.id.saladBtn);
        gBread = rootView.findViewById(R.id.gBreadBtn);

        // set variable to onClickListener
        clear.setOnClickListener(this);
        calc.setOnClickListener(this);
        small.setOnClickListener(this);
        six.setOnClickListener(this);
        salad.setOnClickListener(this);
        gBread.setOnClickListener(this);

        return rootView;
    }

    // onClick class
    @Override
    public void onClick(View view) {

        // Set variables to strings
        String string = pizzaTV.getText().toString();
        String string2 = wingsTV.getText().toString();
        String string3 = saladTV.getText().toString();
        String string4 = sidesTV.getText().toString();

        // Switch statement for buttons
        switch (view.getId()) {

            // click this button to display the buttonText in TextView
            case R.id.smallPizzaBtn:
                pizzaTV.setText(string + small.getText());
                break;

            // click this button to display the buttonText in TextView
            case R.id.sixWingsBtn:
                wingsTV.setText(string2 + six.getText());
                break;

            // click this button to display the buttonText in TextView
            case R.id.saladBtn:
                saladTV.setText(string3 + salad.getText());
                break;

            // click this button to display the buttonText in TextView
            case R.id.gBreadBtn:
                sidesTV.setText(string4 + gBread.getText());
                break;

            // click this button to clear all text in TextView
            case R.id.clearBtn:
                pizzaTV.setText("");
                wingsTV.setText("");
                saladTV.setText("");
                sidesTV.setText("");
                break;

            // click this button to display the buttonText in TextView
            case R.id.calcBtn:

                // If statement so app wont quit when no text is available
                if (pizzaTV.getText().toString().equals("")) {
                    pizzaTV.setText("0");
                }
                if (wingsTV.getText().toString().equals("")) {
                    wingsTV.setText("0");
                }
                if (saladTV.getText().toString().equals("")) {
                    saladTV.setText("0");
                }
                if (sidesTV.getText().toString().equals("")) {
                    sidesTV.setText("0");
                }

                // Converting string to double and displaying output in TextView
                double num1 = Double.parseDouble(pizzaTV.getText().toString());
                double num2 = Double.parseDouble(wingsTV.getText().toString());
                double num3 = Double.parseDouble(saladTV.getText().toString());
                double num4 = Double.parseDouble(sidesTV.getText().toString());
                double result;
                result = num1 + num2 + num3 + num4;
                resultsTV.setText(result + "");
        }
    }
}