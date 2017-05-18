package com.learningforever.myapplication;

import android.graphics.Color;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.MyClass;
import com.learningforever.myapplication.LambdaExpression.Person;
import com.learningforever.myapplication.MathPackage.Circle;
import com.learningforever.myapplication.MathPackage.Employee;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    MyClass myClass=new MyClass();


    }
    public void thayDoiKieuPrimative(Integer i)
    {
        i++;
    }
    public void ThayDoi(Circle circle)
    {
        circle.setR(500);
    }

    public void PressButton(View view) throws CloneNotSupportedException
    {
        try {

           int a;
            a=100;
            int b=50;
            b=100;
            tricky();tricky2();
            int c=500;
            c=800;
          //  view.setBackgroundColor(Color.BLACK);
            c=500;
            c=800;
            c = 800;

        }
        catch (Exception ex)
        {
            int abcd=100;
        }
    }
    public void tricky()
    {
       int abcd=50;
        int mmm=800;
        mmm=800;
        mmm=800;
        tricky2();
        mmm=444;
        mmm=800;

    }
    public void tricky2()
    {
        int abcd=50;
        int mmm=800;
        mmm=800;
        mmm=800;
        mmm=444;
        mmm=800;

    }
}
