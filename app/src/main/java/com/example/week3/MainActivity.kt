package com.example.week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
        var editTextUserName:EditText?=null
        var editTextPassword:EditText?=null
        var ButtonButtonLogin:Button?=null
        var TextViewShow:TextView?=null
        var checkBox:CheckBox?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            connectViews()

        editTextPassword?.text
        ButtonButtonLogin?.setOnClickListener {

            val UserName=editTextUserName?.text
            val Password=editTextPassword?.text
            if (UserName?.isEmpty()==true ||Password?.isEmpty()==true && checkBox?.isChecked==true ){
            TextViewShow?.setText("Enter value Password or Username")
            }else
            {TextViewShow?.setText("Hello $UserName Your Password $Password")}

            //TextViewShow?.setText(editTextUserName?.text)
        }
    }



    private  fun connectViews(){
          editTextPassword=findViewById(R.id.idPassword)
          editTextUserName=findViewById(R.id.idUserName)
          ButtonButtonLogin=findViewById(R.id.ButtonLogin)
        TextViewShow=findViewById(R.id.TvShow)
        checkBox=findViewById(R.id.cbox)
}

}