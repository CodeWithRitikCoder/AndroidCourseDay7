package com.ritikcoder.project7ofandroidcoursewithsaumyasingh_applicationassignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLetsGo= findViewById<Button>(R.id.buttonForLetsGo)

        buttonLetsGo.setOnClickListener(){
            intent= Intent(applicationContext, Activity2::class.java)
            startActivity(intent)
        }

    }
}