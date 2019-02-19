package com.kotlin.allalaspace.kotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


class  ActionBarToolbar : AppCompatActivity() {

         private var mToolbar: Toolbar? = null
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

         mToolbar = findViewById<Toolbar>(R.id.toolbar)
            setSupportActionBar(mToolbar)
            val actionBar = supportActionBar
            actionBar!!.setTitle("Action Bar Toolbar !")
            actionBar!!.setSubtitle("Welcome !")
    }


    /*    @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }*/

       /* @Override
        public boolean onOptionsItemSelected(MenuItem item) {

            String msg = "";

            switch (item.getItemId()) {

                case R.id.save:
                    msg = getString(R.string.save);
                    break;

                case R.id.mail:
                    msg = getString(R.string.mail);
                    break;

                case R.id.camera:
                    msg = getString(R.string.camera);
                    break;

                case R.id.settings:
                    msg = getString(R.string.settings);
                    break;

                case R.id.web_search:
                    msg = getString(R.string.web_search);
                    break;

                case R.id.help:
                    msg = getString(R.string.help);
                    break;
            }

            Toast.makeText(this, msg + " clicked !", Toast.LENGTH_SHORT).show();

            return super.onOptionsItemSelected(item);
        }*/

    }

