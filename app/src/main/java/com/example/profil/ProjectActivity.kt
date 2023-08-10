package com.example.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectActivity : AppCompatActivity() {

    lateinit var projectView: RecyclerView
    lateinit var projectAdapter: ProjectAdapter
    val list = ArrayList<ProjectData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        projectView = findViewById(R.id.rvProject)
        projectView.layoutManager = LinearLayoutManager(this)

        list.add(
            ProjectData("Duplicate_app", "calculator", "https://github.com/natasyaayu/DUPLICATE-APP")
        )

        list.add(
            ProjectData(  "tugas",
                "profil guru",
                "https://github.com/natasyaayu/projek-profil-teacher-app")


        )

        list.add(
            ProjectData("UPC", "Upc_XIPPLG2", "https://github.com/natasyaayu/UPC_XIpplg2_3019")
        )

        projectAdapter = ProjectAdapter(list)
        projectView.adapter = projectAdapter

    }

}