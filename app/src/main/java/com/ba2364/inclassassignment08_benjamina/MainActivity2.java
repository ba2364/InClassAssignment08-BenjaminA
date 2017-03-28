package com.ba2364.inclassassignment08_benjamina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference cityRef = database.getReference("city");

    private EditText city;
    private EditText state;
    private EditText population;
    private CheckBox big;
    private Button firebaseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        city = (EditText) findViewById(R.id.cityName);
        state = (EditText) findViewById(R.id.state);
        population = (EditText) findViewById(R.id.population);
        big = (CheckBox) findViewById(R.id.big);
        firebaseButton = (Button) findViewById(R.id.firebaseButton);
    }

    public void addToFirebase(View view) {
        String cityName = city.getText().toString();
        String st = state.getText().toString();
        int pop = Integer.parseInt(population.getText().toString());
        boolean biggy = ((CheckBox) findViewById(R.id.big)).isChecked();
        cityRef.push().setValue(new City(cityName, st, pop, biggy));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}