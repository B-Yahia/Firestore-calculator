package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    int num1,num2;
    float result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNum = findViewById(R.id.num1);
        final EditText secondNum = findViewById(R.id.num2);
        Button btnPlus = findViewById(R.id.plus);
        Button btnMinus = findViewById(R.id.minus);
        Button btnDiv = findViewById(R.id.div);
        Button btnMulti = findViewById(R.id.multi);
        final TextView Result = findViewById(R.id.result);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              num1 = Integer.parseInt(firstNum.getText().toString());
              num2 = Integer.parseInt(secondNum.getText().toString());
              result= num1+num2;
              Result.setText(String.valueOf(result));
              //Store the reslt in firestore
                FirebaseFirestore db = FirebaseFirestore.getInstance();
                CalObject calObject = new CalObject();
                calObject.setsResult(Float.toString(result));


                db.collection("ResultCal").document().set(calObject);



            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstNum.getText().toString());
                num2 = Integer.parseInt(secondNum.getText().toString());
                result= num1/num2;
                Result.setText(String.valueOf(result));
                //Store the reslt in firestore
                FirebaseFirestore db = FirebaseFirestore.getInstance();
                CalObject calObject = new CalObject();
                calObject.setsResult(Float.toString(result));


                db.collection("ResultCal").document().set(calObject);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstNum.getText().toString());
                num2 = Integer.parseInt(secondNum.getText().toString());
                result= num1-num2;
                Result.setText(String.valueOf(result));
                //Store the reslt in firestore
                FirebaseFirestore db = FirebaseFirestore.getInstance();
                CalObject calObject = new CalObject();
                calObject.setsResult(Float.toString(result));


                db.collection("ResultCal").document().set(calObject);
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(firstNum.getText().toString());
                num2 = Integer.parseInt(secondNum.getText().toString());
                result= num1*num2;
                Result.setText(String.valueOf(result));
                //Store the reslt in firestore
                FirebaseFirestore db = FirebaseFirestore.getInstance();
                CalObject calObject = new CalObject();
                calObject.setsResult(Float.toString(result));


                db.collection("ResultCal").document().set(calObject);
            }
        });
    }
}
