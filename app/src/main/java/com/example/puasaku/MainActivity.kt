package com.example.puasaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu?.getItem(2)?.setEnabled(false)
        menu?.getItem(3)?.isVisible = false

        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        var selectedOption = ""

        when(item?.itemId){

            R.id.tentang -> selectedOption
            R.id.bantuan -> selectedOption
            R.id.item_1 -> selectedOption
            R.id.item_2 -> selectedOption

        }

        Toast.makeText(this, "Masuk : " + selectedOption,Toast.LENGTH_SHORT).show()

        return super.onOptionsItemSelected(item)
    }
}
