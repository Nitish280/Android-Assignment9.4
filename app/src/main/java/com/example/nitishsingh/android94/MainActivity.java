package com.example.nitishsingh.android94;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
        registerForContextMenu(btn);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //here we are adding menu
        menu.setHeaderTitle("Context menu");
        menu.add(0,v.getId(),0,"Add");
        menu.add(0,v.getId(),0,"Edit");
        menu.add(0,v.getId(),0,"Delete");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Add") {
            Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Edit") {
            Toast.makeText(this, "Edit", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Delete") {
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
        } else {
            return false;
        }
        return true;

    }
}
