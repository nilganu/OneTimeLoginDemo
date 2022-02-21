package com.cahrusat.onetimelogindiv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var prefer=getSharedPreferences("MyPref", MODE_PRIVATE)
        var str=prefer.getString("UserName","wrong")


        Handler().postDelayed(Runnable {

            if(str.equals("wrong")) {
                var intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            }
            else
            {
                var intent = Intent(applicationContext, WelcomeScreen::class.java)
                startActivity(intent)
            }
            finish()
        },3000)
    }
}