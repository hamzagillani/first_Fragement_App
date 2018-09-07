package com.helloworld.gillani.first_fragement_app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   // Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button1=(Button)findViewById(R.id.btn1);
//        button2=(Button)findViewById(R.id.btn2);
//        button3 =(Button)findViewById(R.id.btn3);
//
//    button1.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            FragmentManager fragmentManager=getSupportFragmentManager();
//            FragmentTransaction transaction=fragmentManager.beginTransaction();
//
//            Fragement_1 fragement_1=new Fragement_1();
//            transaction.replace(R.id.fagment,fragement_1);
//            transaction.commit();
//        }
//    });
//
//    button2.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            FragmentManager fragmentManager=getSupportFragmentManager();
//            FragmentTransaction transaction=fragmentManager.beginTransaction();
//            Fragment_2 fragment_2=new Fragment_2();
//            transaction.replace(R.id.fagment,fragment_2);
//            transaction.commit();
//        }
//    });
//
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                FragmentManager fragmentManager=getSupportFragmentManager();
//                FragmentTransaction transaction=fragmentManager.beginTransaction();
//                Fragment_2 fragment_2=new Fragment_2();
//                transaction.replace(R.id.fagment,fragment_2);
//                transaction.commit();
//            }
//        });
//


    }


    public void ChangeFragment(View view){
        Fragment fragment;

        if (view==findViewById(R.id.btn1)){
            fragment=new Fragment1();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();

            transaction.replace(R.id.fragment,fragment);
            transaction.commit();


        }
        if (view==findViewById(R.id.btn2)){
            fragment=new Fragment2();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();

            transaction.replace(R.id.fragment,fragment);
            transaction.commit();
        }
        if (view==findViewById(R.id.btn3)){
            fragment=new Fragment3();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();

            transaction.replace(R.id.fragment,fragment);
            transaction.commit();
        }
    }


}
