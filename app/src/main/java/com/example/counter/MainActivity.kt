package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btninc=findViewById<Button>(R.id.inc_id)
        val btndec=findViewById<Button>(R.id.dec_id)

        val reset=findViewById<Button>(R.id.reset_id)
        val counter=findViewById<TextView>(R.id.counter)

        var count=0

        btninc.setOnClickListener{
     count++
            counter.text=count.toString()

        }
        btndec.setOnClickListener{
            if(count>0)
             count--
            counter.text=count.toString()

//            counter.text=" "+count--
            if(count<0) {
                counter.text = "0"

            }
            if(count==0)
                Toast.makeText(this, "can't be negative.", Toast.LENGTH_SHORT,).show()
        }
        reset.setOnClickListener{
            counter.text="0"
            count=0
        }
    }
}