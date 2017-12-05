package ajn54.pitt.edu.pizzahub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class database extends Fragment implements View.OnClickListener {

        Button button;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.database, container, false);

            // Set variable = to R.id
            button = rootView.findViewById(R.id.button);

            // set variable to onClickListener
            button.setOnClickListener(this);

            return rootView;
        }


    // onClick class
    @Override
    public void onClick(View view) {

        // Switch statement for buttons
        switch (view.getId()) {

            // click this button to take you to the database
            case R.id.button:
                Intent myIntent = new Intent(view.getContext(), DatabaseActivity.class);
                startActivityForResult(myIntent,0);
                break;
        }
    }
}