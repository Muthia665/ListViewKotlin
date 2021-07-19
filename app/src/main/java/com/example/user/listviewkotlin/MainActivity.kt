package com.example.user.listviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var siswi = arrayOf("Aisyah", "Muhtia", "Zahra")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listview)

        val adapter = ArrayAdapter(this,R.layout.listitem,R.id.txtItem,siswi)

        listView.adapter = adapter


        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity,"Nama Saya = "+listView.getItemAtPosition(position) as String, Toast.LENGTH_SHORT).show()
            }

        }

        }

    }