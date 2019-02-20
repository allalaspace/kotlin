package com.kotlin.allalaspace.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class ContextualMenu : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contextual_menu)

        val mToolbar : Toolbar =  findViewById<Toolbar>(R.id.toolbar)
        mToolbar.setTitle("Standalone Toolbar !")
        mToolbar.setSubtitle("welcome !")

        val button : Button = findViewById<Button>(R.id.button) as Button
        mToolbar.inflateMenu(R.menu.menu_main)
        mToolbar.setOnMenuItemClickListener( Toolbar.OnMenuItemClickListener {

            item : MenuItem? ->
            when (item!!.itemId) {
                R.id.save -> {
                    Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
                }
                R.id.mail -> {
                    Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
                }

            }

             true
        })

        button!!.setOnClickListener(View.OnClickListener() {
            fun onClick(v : View ) {
               val  actionMode : ActionMode = this.startActionMode(ContextualCallback())
            }
        })
    }

    class ContextualCallback : ActionMode.Callback{



        override fun onCreateActionMode(actionMode : ActionMode , menu : Menu) : Boolean{

            actionMode.getMenuInflater().inflate(R.menu.contextual_menu, menu)
            return true
        }

        override fun onPrepareActionMode( actionMode: ActionMode, menu : Menu ) : Boolean {
           actionMode.setTitle("My Action Mode")
           actionMode.setSubtitle("By Smartherd")
            return false
        }

        override fun onActionItemClicked(actionMode : ActionMode , item : MenuItem ) : Boolean {

            // add Functionality to Menu items.
            //switch case statements
            return false
        }

        override fun onDestroyActionMode( actionMode : ActionMode) {

            //Action Mode is completed

        }
    }
}
