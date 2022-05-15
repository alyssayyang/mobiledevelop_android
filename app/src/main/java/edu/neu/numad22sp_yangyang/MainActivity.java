/*
YANG YANG
CS 5520 A1
MAY 13 2022
 */

package edu.neu.numad22sp_yangyang;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToastMsg(String msg){
        Toast toast = Toast.makeText(this,msg,Toast.LENGTH_LONG);
        //toast.setGravity(Gravity.FILL_HORIZONTAL,0,0);
        toast.show();
    }

    public void intro(View v){
        displayToastMsg("YANG YANG \nyang.yang16@northeastern.edu");
    }


}