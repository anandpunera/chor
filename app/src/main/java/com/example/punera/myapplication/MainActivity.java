package com.example.punera.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.punera.myapplication.village.Villager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Integer.parseInt("teststring"));
        ListView playerList = (ListView) findViewById(R.id.list_item);
        playerList.setAdapter(adapter);
        List<Villager> villagers = new ArrayList<>();
        villagers.add(new Villager("villager1",0,true));
        villagers.add(new Villager("villager2",1,true));
        villagers.add(new Villager("villager3",0,true));
        villagers.add(new Villager("villager4",2,true));
        villagers.add(new Villager("villager5",2,true));
        villagers.add(new Villager("villager6",0,true));
        villagers.add(new Villager("villager7",0,true));
        villagers.add(new Villager("villager8",0,true));
        villagers.add(new Villager("villager9",2,true));
        for (Villager villager:villagers){
            TextView textView = (TextView) findViewById(R.id.message);
            textView.setText(villager.getName());
            if(villager.getPrivilage() == 1) {
                textView.setBackgroundColor(4);
            }
            else if (villager.getPrivilage() == 2){
                textView.setBackgroundColor(9);
            }
            playerList.addView(textView);
        }
    }

}
