package com.example.dicoding_app.Library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dicoding_app.ProfilFragment
import com.example.dicoding_app.R

class DetailFragment : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_detail)

        val tvDataReceived: TextView = findViewById(R.id.rv_heroes_detail)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetDetail: TextView = findViewById(R.id.tv_set_detail)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tIDetail = intent.getStringExtra(EXTRA_DETAIL)

        /*
        replaceFragment(libraryFragment)
*/
        findViewById<BottomNavigationItemView>(R.id.libraryFragment).setOnClickListener {
            val intent = Intent(this, LibraryFragment::class.java)
            startActivity(intent)
        }
        findViewById<BottomNavigationItemView>(R.id.profilFragment).setOnClickListener {
            val intent = Intent(this, ProfilFragment::class.java)
            startActivity(intent)
        }
        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetDetail.text = tIDetail

    }
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
    }


}