package com.cs407.anothercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void add(View view){
       // Log.i("INFO", "Button Pressed");

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int number1 = Integer.parseInt(myTextField.getText().toString().trim());
        int number2 = Integer.parseInt(myTextField2.getText().toString().trim());

        int result = number1+number2;

        String answer = String.valueOf(result);


        goToActivity(answer);
        // Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }
    public void subtract(View view){
        // Log.i("INFO", "Button Pressed");

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int number1 = Integer.parseInt(myTextField.getText().toString().trim());
        int number2 = Integer.parseInt(myTextField2.getText().toString().trim());

        int result = number1-number2;

        String answer = String.valueOf(result);


        goToActivity(answer);
        // Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void multiply(View view){
        // Log.i("INFO", "Button Pressed");

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int number1 = Integer.parseInt(myTextField.getText().toString().trim());
        int number2 = Integer.parseInt(myTextField2.getText().toString().trim());

        int result = number1*number2;

        String answer = String.valueOf(result);


        goToActivity(answer);
        // Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void divide(View view){
        // Log.i("INFO", "Button Pressed");

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int number1 = Integer.parseInt(myTextField.getText().toString().trim());
        int number2 = Integer.parseInt(myTextField2.getText().toString().trim());

        if (number2 == 0) {
            String answer = "cannot divide by 0";
            goToActivity(answer);
        } else {
            int result = number1 / number2;
            String answer = String.valueOf(result);
            goToActivity(answer);

        }





        // Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }
    public void goToActivity(String s) {
        Intent intent = new Intent(this, display.class);
        intent.putExtra("message",s);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}