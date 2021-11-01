package com.ldh.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar,toolbar1;
    private DrawerLayout drawerLayout,drawerLayout1;
    private NavigationView navigationView,navigationView1;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        actionToolBar();
        anhXa1();
        anhXa2();
    }
    public void actionToolBar()
    {
        toolbar.setNavigationIcon(R.drawable.ic_action_menu);
    }
    public void anhXa()
    {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) findViewById(R.id.navigationView);
        listView = (ListView) findViewById(R.id.listView);
    }
    public void anhXa1()
    {
        toolbar1 = (Toolbar) findViewById(R.id.toolbar1);
        drawerLayout1 = (DrawerLayout) findViewById(R.id.drawerLayout1);
        navigationView1 = (NavigationView) findViewById(R.id.navigationView1);
        toolbar1.setNavigationIcon((R.drawable.ic_action_back));
    }
    public void anhXa2()
    {
        toolbar1 = (Toolbar) findViewById(R.id.toolbar2);
        drawerLayout1 = (DrawerLayout) findViewById(R.id.drawerLayout2);
        navigationView1 = (NavigationView) findViewById(R.id.navigationView2);
        toolbar1.setNavigationIcon((R.drawable.ic_sharp_open_in_new));
    }
}