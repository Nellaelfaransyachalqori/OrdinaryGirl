package com.example.utspraktikumpember

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycler: RecyclerView
    lateinit var recyclerAdapter: AdapterAOT
    lateinit var ListData: ArrayList<DataAOT>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.rvList)
        recycler.setHasFixedSize(true)
        ListData = ArrayList()

        ListData.add(DataAOT("Eren Yeager", "230441100001", "23 Tahun", R.drawable.eren_yeager))
        ListData.add(DataAOT("Mikasa Ackerman", "230441100002", "23 Tahun", R.drawable.mikasa_ackerman))
        ListData.add(DataAOT("Armin Arlert", "230441100003", "23 Tahun", R.drawable.armin_arlert))
        ListData.add(DataAOT("Connie Springer", "230441100004", "23 Tahun", R.drawable.connie_springer))
        ListData.add(DataAOT("Sasha Braus", "230441100005", "23 Tahun", R.drawable.sasha_braus))
        ListData.add(DataAOT("Jean Kirstein", "230441100006", "23 Tahun", R.drawable.jean_kirstein))
        ListData.add(DataAOT("Annie Leonhart", "230441100007", "23 Tahun", R.drawable.annie_leonhart))
        ListData.add(DataAOT("Reiner Braun", "230441100008", "23 Tahun", R.drawable.reiner_braun))
        ListData.add(DataAOT("Levi Ackerman", "230441100009", "26 Tahun", R.drawable.levi_ackerman))
        ListData.add(DataAOT("Hanji Zoe", "230441100010", "26 Tahun", R.drawable.hanji_zoe))
        ListData.add(DataAOT("Erwin Smith", "230441100011", "30 Tahun", R.drawable.erwin_smith))
        ListData.add(DataAOT("Historia Reiss", "230441100012", "23 Tahun", R.drawable.historia_reiss))
        ListData.add(DataAOT("Kenny Ackerman", "230441100013", "40 Tahun", R.drawable.kenny_ackerman))
        ListData.add(DataAOT("Zeke Yeager", "230441100014", "40 Tahun", R.drawable.zeke_yeager))
        ListData.add(DataAOT("Grisha Yeager", "230441100015", "50 Tahun", R.drawable.grisha_yeager))
        ListData.add(DataAOT("Pieck Finger", "230441100016", "23 Tahun", R.drawable.pieck_finger))
        ListData.add(DataAOT("Gabi Braun", "230441100017", "13 Tahun", R.drawable.gabi_braun))
        ListData.add(DataAOT("Falco Grice", "230441100018", "14 Tahun", R.drawable.falco_grice))
        ListData.add(DataAOT("Ymir", "230441100019", "35 Tahun", R.drawable.ymir))
        ListData.add(DataAOT("Bertolt Hoover", "230441100020", "23 Tahun", R.drawable.bertolt_hoover))

        showList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_data, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(data: MenuItem): Boolean {
        if (data.itemId == R.id.MenuList) {
            showList()
        }
        else if (data.itemId == R.id.MenuGrid) {
            showGrid()
        }
        return super.onOptionsItemSelected(data)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager
        recyclerAdapter = AdapterAOT(ListData, this)
        recycler.adapter =recyclerAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.layoutManager = layoutManager
        recyclerAdapter = AdapterAOT(ListData, this)
        recycler.adapter =recyclerAdapter
    }
}