package com.cahrusat.onetimelogindiv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)
        var txtview:TextView=findViewById(R.id.txtUser)
        var prefer=getSharedPreferences("MyPref", MODE_PRIVATE)
        var str=prefer.getString("UserName","wrong")
        txtview.append(str)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id=item.itemId
        if(id==R.id.item1)
        {
            var prefer=getSharedPreferences("MyPref", MODE_PRIVATE)
            var editor=prefer.edit()
            editor.clear()
            editor.commit()
            var intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(applicationContext,"Logout successfully",Toast.LENGTH_LONG).
           show()
        }
        else if(id==R.id.item2)
        {
            Toast.makeText(applicationContext,"Item2",Toast.LENGTH_LONG).
            show()
        }
        return super.onOptionsItemSelected(item)
    }
}