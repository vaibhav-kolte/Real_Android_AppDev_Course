package com.suvai.realandroidappdevcourse

import android.app.KeyguardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView



//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

//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
class MainActivity : AppCompatActivity() {

    // Kotlin Null Problem Solution
    private lateinit var myName: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtMessage = findViewById<TextView>(R.id.txtMessage)
        val name = "Vaibhav"
        val yearOfBirth = 1996
        var currentYear = 2023

        var age: Int = currentYear - yearOfBirth

        txtMessage.text = "$name is $age year old."




        // Kotlin Null Problem Solution
//        Log.e(Companion.TAG, "onCreate: $myName")  // If use before initialization got exception
        myName = "Android Studio"
        Log.e(Companion.TAG, "onCreate: $myName")



        // Kotlin Type casting
        val keyMgr = getSystemService(Context.KEYGUARD_SERVICE) as? KeyguardManager
        if(keyMgr is KeyguardManager){
            // do something
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}