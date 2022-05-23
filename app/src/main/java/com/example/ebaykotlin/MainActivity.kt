package com.example.ebaykotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebaykotlin.adapter.HorizontalAdapter
import com.example.ebaykotlin.adapter.VerticalAdapter
import com.example.ebaykotlin.model.GridModel
import com.example.ebaykotlin.model.ListData

class MainActivity : AppCompatActivity() {
    lateinit var rec1: RecyclerView
    var gridModels = ArrayList<GridModel>()
    lateinit var rec2: RecyclerView
    var list = ArrayList<ListData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rec1 = findViewById(R.id.recyclerView)
        rec2 = findViewById(R.id.recyclerViewVertical)
        rec2.setHasFixedSize(true)
        rec2.layoutManager = GridLayoutManager(this, 3)
        val verticalAdapter = VerticalAdapter(this, gridModels)
        rec2.adapter = verticalAdapter
        rec1.setHasFixedSize(true)
        rec1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapter = HorizontalAdapter(this, list)
        rec1.adapter = adapter
        data()
        gridData()
    }

    private fun data() {
        list.add(
            ListData(
                R.drawable.headphones1,
                "Bose QuietComfort EarBuds",
                "$399.00",
                "$149.00",
                "72"
            )
        )
        list.add(ListData(R.drawable.headphones2, "Bose QuietComfort", "$399.00", "$149.00", "72"))
        list.add(
            ListData(
                R.drawable.headphones3,
                "Bose QuietComfort EarBuds",
                "$399.00",
                "$149.00",
                "72"
            )
        )
        list.add(
            ListData(
                R.drawable.headphones4,
                "Bose QuietComfort EarBuds",
                "$399.00",
                "$149.00",
                "72"
            )
        )
        list.add(ListData(R.drawable.headphones5, "Bose QuietComfort", "$399.00", "$149.00", "72"))
        list.add(
            ListData(
                R.drawable.headphones6,
                "Bose QuietComfort EarBuds",
                "$399.00",
                "$149.00",
                "72"
            )
        )
    }

    private fun gridData() {
        gridModels.add(GridModel(R.drawable.headphones1, "Bloks"))
        gridModels.add(GridModel(R.drawable.headphones2, "Heaters"))
        gridModels.add(GridModel(R.drawable.headphones3, "Generators"))
        gridModels.add(GridModel(R.drawable.headphones4, "Snowblowers"))
        gridModels.add(GridModel(R.drawable.headphones5, "Generators"))
        gridModels.add(GridModel(R.drawable.headphones6, "Thermostats"))
    }
}