package com.example.dicoding_app.Library

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dicoding_app.ProfilFragment
import com.example.dicoding_app.R

class LibraryFragment : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Hero> = arrayListOf()

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_library)

        val btnMoveActivity: RecyclerView = findViewById(R.id.rv_heroes)
        btnMoveActivity.setOnClickListener(this)

        findViewById<BottomNavigationItemView>(R.id.profilFragment).setOnClickListener {
            val intent = Intent(this, ProfilFragment::class.java)
            startActivity(intent)
        }
        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(HeroesData.listData)
        showRecyclerList()
    }
    override fun onClick(v: View) {
//        when (v.id) {
//            R.id.rv_heroes -> {
//                val moveWithDataIntent = Intent(this@LibraryFragment, DetailFragment::class.java)
//                moveWithDataIntent.putExtra(DetailFragment.EXTRA_NAME, "heroesNames")
//                moveWithDataIntent.putExtra(DetailFragment.EXTRA_DETAIL, "heroesDetails")
//                moveWithDataIntent.putExtra(DetailFragment.EXTRA_PHOTO, "heroesImages")
//                startActivity(moveWithDataIntent)
//            }
//        }
    }

    private fun showSelectedHero(hero: Hero) {
        Toast.makeText(this, "Kamu memilih " + hero.name, Toast.LENGTH_SHORT).show()
    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvHeroes.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListHeroAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                showSelectedHero(data)
            }
        })
    }
}