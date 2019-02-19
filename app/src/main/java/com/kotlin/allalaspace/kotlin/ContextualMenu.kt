package com.kotlin.allalaspace.kotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

class ContextualMenu : AppCompatActivity() {

//    Button button;
//    ActionMode actionMode;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contextual_menu)

       /* Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("Standalone Toolbar !");
        mToolbar.setSubtitle("by Smartherd !");

        button = (Button) findViewById(R.id.button);
        mToolbar.inflateMenu(R.menu.menu_main);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {


            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String title = (String) item.getTitle(); // here show how to get the title directly.

                Toast.makeText(ContextualMenu.this, title + " Selected !", Toast.LENGTH_SHORT).show();

                switch (item.getItemId()) {

                    case R.id.save:
                        // Perform the individual Menu Actions.
                        break;

                    case R.id.mail:
                        // Perform some Actions.
                        break;

                    // Similarly you can write CASES for other menu items as well.
                }
                return true;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionMode = ContextualMenu.this.startActionMode(new ContextualCallback());

            }
        });
    }

    class ContextualCallback implements ActionMode.Callback{


        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {

            actionMode.getMenuInflater().inflate(R.menu.contextual_menu, menu);

            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {

            actionMode.setTitle("My Action Mode");
           actionMode.setSubtitle("By Smartherd");

            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem item) {

            // add Functionality to Menu items.
            //switch case statements
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

            //Action Mode is completed

        }*/
    }
}
