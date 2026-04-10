package com.example.menus;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.item1) {
            Toast.makeText(this, "Option 1 Selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.item2) {
            Toast.makeText(this, "Option 2 Selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.item3) {
            Toast.makeText(this, "Option 3 Selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
