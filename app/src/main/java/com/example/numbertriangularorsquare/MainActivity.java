package com.example.numbertriangularorsquare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static class Number {
        int n;
        public boolean Triangular(){
            int x=1;
            int temp=1;
            while(temp<n){
                x+=1;
                temp+=x;
            }
            return temp == n;
        }
        public boolean Square(){
            return Math.sqrt(n) == Math.floor(Math.sqrt(n));
        }
    }
    public void Enter(View view) {
        EditText editText=(EditText)findViewById(R.id.editText);


        Number t= new Number();
        t.n=Integer.parseInt(editText.getText().toString());
        Log.i("value",Integer.toString(t.n));
        String a=Integer.toString(t.n);
        if(t.Triangular() && t.Square())
            a+=" is both Triangular and Square";
        else if(t.Triangular() && !t.Square())
            a+=" is Triangular but not Square";
        else if(!t.Triangular() && t.Square())
            a+=" is not Triangular but Square";
        else a+=" is neither Triangular nor Square";
        Toast.makeText(this,a,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}