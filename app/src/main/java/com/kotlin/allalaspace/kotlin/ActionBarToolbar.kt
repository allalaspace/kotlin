package com.kotlin.allalaspace.kotlin

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast


class  ActionBarToolbar : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

            val mToolbar : Toolbar   = findViewById<Toolbar>(R.id.toolbar)
            setSupportActionBar(mToolbar)
            val actionBar : ActionBar = supportActionBar as ActionBar
            actionBar.setTitle("Action Bar Toolbar !")
            actionBar.setSubtitle("Welcome !")
    }


       override fun onCreateOptionsMenu(menu: Menu) : Boolean {
//            getMenuInflater().inflate(R.menu.menu_main, menu);
//            return true;
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true

        }


       override fun onOptionsItemSelected(item : MenuItem ) : Boolean{

            var msg: String = ""
            when (item.itemId) {

                 R.id.save -> msg = getString(R.string.save)
                 R.id.mail -> msg = getString(R.string.mail)
                 R.id.camera -> msg = getString(R.string.camera)
                 R.id.settings -> msg = getString(R.string.settings)
                 R.id.web_search -> msg = getString(R.string.web_search)
                 R.id.help -> msg = getString(R.string.help)

            }

            Toast.makeText(this, msg + " clicked !", Toast.LENGTH_SHORT).show()
            return super.onOptionsItemSelected(item)
        }

    }

