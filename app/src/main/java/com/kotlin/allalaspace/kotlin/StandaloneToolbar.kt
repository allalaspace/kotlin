package com.kotlin.allalaspace.kotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

class  StandaloneToolbar : AppCompatActivity() {

    private var mToolbar : Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        mToolbar =  findViewById<Toolbar>(R.id.toolbar) as Toolbar
        mToolbar!!.setTitle("Standalone Toolbar !")
        mToolbar!!.setSubtitle("by Smartherd !")
        //mToolbar.setNavigationIcon(R.drawable.navigation_back);


        // Compatibility by JAVA

        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
          //  mToolbar.setElevation(10f);}

        mToolbar!!.inflateMenu(R.menu.menu_main);
        mToolbar!!.setOnMenuItemClickListener( Toolbar.OnMenuItemClickListener() {
            item : MenuItem ->
            when(item!!.itemId){
                R.id.save -> {
                  //Toast.makeText(this, item.title.toString(), Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.mail -> {
                   // Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show();
                    true
                }

            }
true
//
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//
//                String title = (String) item.getTitle();
//                Toast.makeText(StandaloneToolbar.this, title + " Selected !", Toast.LENGTH_SHORT).show();
//
//                switch (item.getItemId()) {
//
//                    case R.id.save:
//                        // Perform the individual Menu Actions.
//                        break;
//
//                    case R.id.mail:
//                        // Perform some Actions.
//                        break;
//
//                }
//
//                // Similarly you can write CASES for other menu items as well.
//
//
//                return true;
//            }
        })

        }}


