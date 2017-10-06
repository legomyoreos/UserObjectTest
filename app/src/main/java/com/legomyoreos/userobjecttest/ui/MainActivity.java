package com.legomyoreos.userobjecttest.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.legomyoreos.userobjecttest.R;
import com.legomyoreos.userobjecttest.model.User;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private Button submitButton;
    private EditText usernameEditText;
    private EditText realNameEditText;
    private EditText ageEditText;
    private EditText genderEditText;
    private EditText locationEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = (Button) findViewById(R.id.submitButton);
        usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        realNameEditText = (EditText) findViewById(R.id.realNameEditText);
        ageEditText = (EditText) findViewById(R.id.ageEditText);
        genderEditText = (EditText) findViewById(R.id.genderEditText);
        locationEditText = (EditText) findViewById(R.id.locationEditText);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String age = ageEditText.getText().toString();
//                User user = new User(usernameEditText.getText().toString(), realNameEditText.getText().toString(), Integer.parseInt(age), genderEditText.getText().toString(), locationEditText.getText().toString());
//                String userNameTest = user.getUserName();

                Log.d(TAG, age);
                Toast.makeText(getApplicationContext(), "User registered", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
