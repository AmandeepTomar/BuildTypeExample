package com.example.buildtypeexample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.paid.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("TimberArgCount")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            Glide.with(this)
                .load(R.drawable.ic_android_black_24dp)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView)



    }
}
