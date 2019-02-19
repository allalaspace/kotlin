package com.kotlin.allalaspace.kotlin

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

        }else{


        }



    }

    fun showToolbarAsActionbar(view: View) {

        val intent = Intent(this, ActionBarToolbar::class.java)
        startActivity(intent)
    }

    fun showStandaloneToolbar(view: View) {

        val intent = Intent(this, StandaloneToolbar::class.java)
        startActivity(intent)
    }

    fun showContextualMenu(view: View) {
        val intent = Intent(this, ContextualMenu::class.java)
        startActivity(intent)
    }



}
