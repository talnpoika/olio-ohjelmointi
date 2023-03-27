package com.example.userregister;

/* Mikko Talonpoika 03/23 Olio-ohjelmointi viikko 9*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText eMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstName = findViewById(R.id.txtFirstName);
        lastName = findViewById(R.id.txtLastName);
        eMail = findViewById(R.id.txtEmail);

    }

    public void addUser(View view) {
        RadioGroup rg = findViewById(R.id.radioGroup);

        switch (rg.getCheckedRadioButtonId()) {
            case (R.id.rbTite):
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), eMail.getText().toString(), "Tietotekniikka"));
                break;
            case (R.id.rbTuta):
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), eMail.getText().toString(), "Tuotantotalous"));
                break;
            case (R.id.rbLate):
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), eMail.getText().toString(), "Laskennallinen tekniikka"));
                break;
            case (R.id.rbSate):
                UserStorage.getInstance().addUser(new User(firstName.getText().toString(), lastName.getText().toString(), eMail.getText().toString(), "Sähkötekniikka"));
                break;
        }

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}