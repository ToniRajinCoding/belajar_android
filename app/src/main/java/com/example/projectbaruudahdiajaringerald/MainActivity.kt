package com.example.projectbaruudahdiajaringerald



import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun moveActivities(view: View) {
        val button_Look = findViewById<Button>(R.id.buttonLook)
        val intent = Intent(this, lookupList::class.java)
        startActivity(intent)
    }

}