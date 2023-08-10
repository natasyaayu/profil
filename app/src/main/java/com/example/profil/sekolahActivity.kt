package com.example.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class sekolahActivity : AppCompatActivity() {
    lateinit var sekolahView: RecyclerView
    lateinit var sekolahAdapter: SekolahAdapter
    val list = ArrayList<SekolahData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekolah)

        sekolahView = findViewById(R.id.rvSekolah)
        sekolahView.layoutManager = LinearLayoutManager(this)

        list.add(SekolahData("SDN Blerong 1", " JL.Blerong, kec. guntur, kab. demak"))
        list.add(SekolahData("MTSn 1 Demak", " JL.Candisari, kec. Mranggen, kab. demak"))
        list.add(SekolahData("SMKN 1 Sayung", " Jl. Semarang-Demak km. 14 onggorawe"))

        sekolahAdapter = SekolahAdapter(list)
        sekolahView.adapter = sekolahAdapter
    }
}