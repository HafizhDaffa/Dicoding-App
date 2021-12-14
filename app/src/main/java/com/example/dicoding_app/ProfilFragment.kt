package com.example.dicoding_app

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import androidx.appcompat.app.AppCompatActivity
import com.example.dicoding_app.Library.LibraryFragment

class ProfilFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profil)

        findViewById<BottomNavigationItemView>(R.id.libraryFragment).setOnClickListener {
            val intent = Intent(this, LibraryFragment::class.java)
            startActivity(intent)
        }
    }
}