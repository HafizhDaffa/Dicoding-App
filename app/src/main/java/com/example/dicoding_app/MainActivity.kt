package com.example.dicoding_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.dicoding_app.Library.LibraryFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 5000


   /* private val detailFragment = DetailFragment()
    private val libraryFragment = LibraryFragment()
    private val profilFragment = ProfilFragment()*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            startActivity(Intent(this, LibraryFragment::class.java ))
        },SPLASH_TIME_OUT)
        /*
        replaceFragment(libraryFragment)
*/
      /*  findViewById<BottomNavigationItemView>(R.id.libraryFragment).setOnClickListener {
            val intent = Intent(this, LibraryFragment::class.java)
            startActivity(intent)
        }
        findViewById<BottomNavigationItemView>(R.id.profilFragment).setOnClickListener {
            val intent = Intent(this, ProfilFragment::class.java)
            startActivity(intent)
        }*/
    }
}