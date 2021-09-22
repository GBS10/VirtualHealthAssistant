package com.example.vha;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;

import kotlinx.coroutines.AbstractCoroutine;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_water){
            Intent waterschedule = new Intent(MainActivity.this, WaterSchedule.class);
            startActivity(waterschedule);
        }
        else if (id == R.id.nav_diet){
            Intent dietplan = new Intent(MainActivity.this, DietPlan.class);
            startActivity(dietplan);
        }
        else if (id == R.id.nav_rem){
            Intent remedies = new Intent(MainActivity.this, Remedies.class);
            startActivity(remedies);
        }
        else if (id == R.id.nav_routine){
            Intent routine = new Intent(MainActivity.this, Routine.class);
            startActivity(routine);
        }
        else if (id == R.id.nav_contact){
            Intent settings = new Intent(MainActivity.this, Contact.class);
            startActivity(settings);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void onButtonClick(View view){
        if (view.getId() == R.id.heartbutton){
            Intent heartmonitor = new Intent(MainActivity.this, HeartMonitor.class);
            startActivity(heartmonitor);
        }
        else if (view.getId() == R.id.foodbutton){
            Intent caloriemonitor = new Intent(MainActivity.this, CalorieMonitor.class);
            startActivity(caloriemonitor);
        }
        else if (view.getId() == R.id.tempbutton){
            Intent tempmonitor = new Intent(MainActivity.this, TempMonitor.class);
            startActivity(tempmonitor);
        }
        else if (view.getId() == R.id.oxygenbutton){
            Intent oxymonitor = new Intent(MainActivity.this, OxygenMonitor.class);
            startActivity(oxymonitor);
        }
        else if (view.getId() == R.id.sleepbutton){
            Intent sleepmonitor = new Intent(MainActivity.this, SleepMonitor.class);
            startActivity(sleepmonitor);
        }
        else if (view.getId() == R.id.waterbutton){
            Intent watermonitor = new Intent(MainActivity.this, WaterMonitor.class);
            startActivity(watermonitor);
        }
    }
}