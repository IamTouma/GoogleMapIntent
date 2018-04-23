package com.example.googlemapintent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=東京駅")))
//        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.681382,139.766084?z=22")))

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener({
            val url = String.format(Locale.US,
                    "http://maps.google.com/maps?saddr=%s&daddr=%s&dirflg=%s",
                    "東京駅",
                    "町田駅",
                    "r")
            val intent = Intent(Intent.ACTION_VIEW)
                            .setClassName("com.google.android.apps.maps","com.google.android.maps.MapsActivity")
                            .setData(Uri.parse(url))
            startActivity(intent)
        })

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener({
            val url = String.format(Locale.US,
                    "http://maps.google.com/maps?saddr=%s,%s&daddr=%s,%s",
                    "35.681382",
                    "139.7660842",
                    "35.684752",
                    "139.707937")
            val intent = Intent(Intent.ACTION_VIEW)
                    .setClassName("com.google.android.apps.maps","com.google.android.maps.MapsActivity")
                    .setData(Uri.parse(url))
            startActivity(intent)
        })
    }
}
