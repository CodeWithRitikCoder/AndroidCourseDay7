package com.ritikcoder.project7ofandroidcoursewithsaumyasingh_applicationassignment1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val cardViewAndroidAppDevelopment= findViewById<CardView>(R.id.cardViewForAndroidAppDevelopment)
        val cardViewWebDevelopment= findViewById<CardView>(R.id.cardViewForWebDevelopment)
        val cardViewIOSAppDevelopment= findViewById<CardView>(R.id.cardViewForIOSDevelopment)
        val cardViewMachineLearning= findViewById<CardView>(R.id.cardViewForMachineLearnging)
        val cardViewBlockChainDevelopment= findViewById<CardView>(R.id.cardViewForBlockChainDevelopment)
        val cardViewAffiliateMarketing= findViewById<CardView>(R.id.cardViewForAffiliateMarketing)
        val buttonContactUs= findViewById<Button>(R.id.buttonForContactUs)

        cardViewAndroidAppDevelopment.setOnClickListener(){
            intent= Intent(applicationContext, AndroidAppDevelopmentActivity::class.java)
            startActivity(intent)
        }
        cardViewWebDevelopment.setOnClickListener(){
            intent= Intent(applicationContext, WebDevelopmentActivity::class.java)
            startActivity(intent)
        }
        cardViewIOSAppDevelopment.setOnClickListener(){
            intent= Intent(applicationContext, IOSAppDevelopmentActivity::class.java)
            startActivity(intent)
        }
        cardViewMachineLearning.setOnClickListener(){
            intent= Intent(applicationContext, MachineLearningActivity::class.java)
            startActivity(intent)
        }
        cardViewBlockChainDevelopment.setOnClickListener(){
            intent= Intent(applicationContext, BlockChainDevelopmentActivity::class.java)
            startActivity(intent)
        }
        cardViewAffiliateMarketing.setOnClickListener(){
            intent= Intent(applicationContext, ArtificialIntelligenceActivity::class.java)
            startActivity(intent)
        }
        //checkPermission()
        buttonContactUs.setOnClickListener(){
            //val number= "7500788252".toString()
            //val intent= Intent(Intent.ACTION_CALL)
            //intent.data= Uri.parse("tel:$number")
            //startActivity(intent)
            //intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "7500788252"))
            //startActivity(intent)
            intent= Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:"+ "7500788252")
            startActivity(intent)

        }
    }
//    private fun checkPermission(){
//        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
//            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), 101)
//        }
//    }
}