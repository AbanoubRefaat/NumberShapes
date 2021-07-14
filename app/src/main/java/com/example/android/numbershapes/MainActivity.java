package com.example.android.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   public EditText input ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input= (EditText)findViewById(R.id.etInput);


    }
    public void check(View view){

        String message = "";

        Numbers number = new Numbers();

        number.myNumber = Integer.parseInt(input.getText().toString());

        if (input.getText().toString().isEmpty()){

            message = "Please enter your number";

        }if (number.isSquare()){
            if (number.isTriangular()){
                message = "Your number is both square and triangular";

            }else {
                message = "your number is square";

            }
        }if (number.isTriangular()){
            message= "your number is triangular";

        }else {
            message="your number either a square nor a triangular";
        }


        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }
}
