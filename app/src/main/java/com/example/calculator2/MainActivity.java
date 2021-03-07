package com.example.calculator2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    float Value1, Value2;
    boolean  mAddition, mSubtract, mMultiplication, mDivision;
    Boolean isNewOp = true;
    EditText ed1;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        ed1 = findViewById(R.id.EditText1);


    }



    public void acEvent(View view) {
        ed1.setText("0");
        tv1.setText("");
        tv2.setText("");
        isNewOp = true;
    }

    public void numberEvent(View view) {
        if(isNewOp){
            ed1.setText("");
            isNewOp = false;
        }

        String number = ed1.getText().toString();
            switch (view.getId()){
                case R.id.sevenBTN:
                    number += "7";
                    break;
                case R.id.eightBTN:
                    number += "8";
                    break;
                case R.id.nineBTN:
                    number += "9";
                    break;
                case R.id.fourBTN:
                    number += "4";
                    break;
                case R.id.fiveBTN:
                    number += "5";
                    break;
                case R.id.sixBTN:
                    number += "6";
                    break;
                case R.id.oneBTN:
                    number += "1";
                    break;
                case R.id.twoBTN:
                    number += "2";
                    break;
                case R.id.threeBTN:
                    number += "3";
                    break;
                case R.id.zeroBTN:
                    number += "0";
                    break;
                case R.id.dzeroBTN:
                    number += "00";
                    break;
                case R.id.dotBTN:
                        number += ".";
                    break;

            }
                ed1.setText(number);
    }


        public void OperatorEvent (View view){

        if (ed1 == null) {
            ed1.setText("");
        } else {
            Value1 = Float.parseFloat(ed1.getText() + "");
            tv2.setText(Value1 + "");
        }


            switch (view.getId()) {
                case R.id.addBTN:
                    mAddition = true;
                    tv1.setText("+");
                    break;
                case R.id.subBTN:
                    mSubtract = true;
                    tv1.setText("-");
                    break;
                case R.id.multiplyBTN:
                    mMultiplication = true;
                    tv1.setText("×");
                    break;
                case R.id.divideBTN:
                    mDivision = true;
                    tv1.setText("÷");
                    break;
            }
        ed1.setText(null);
     }


    public void equalEvent(View view) {
        Value2 = Float.parseFloat(ed1.getText()+"");

        if (mAddition){
            ed1.setText(Value1+Value2+"");
            mAddition=false;
        }
        if (mSubtract){
            ed1.setText(Value1-Value2+"");
            mSubtract=false;
        }
        if (mMultiplication){
            ed1.setText(Value1*Value2+"");
            mMultiplication=false;
        }
        if (mDivision){
            ed1.setText(Value1/Value2+"");
            mDivision=false;
        }
        tv1.setText("");
        tv2.setText("");
    }


    public void backspaceEvent(View view) {
            ed1.setText(ed1.getText().toString().substring(0, ed1.getText().toString().length() - 1));
    }



}