package com.example.punera.myapplication.village;

import android.util.Log;
import com.example.punera.myapplication.village.interfaces.base;
/**
 * Created by punera on 25/12/17.
 */

public class Villager implements base{
    public Villager(String name, int privilage, boolean alive) {
        this.name = name;
        this.privilage = privilage;
        this.alive = alive;
    }

    private String name;
    private int privilage;
    private boolean alive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrivilage() {
        return privilage;
    }

    public void setPrivilage(int privilage) {
        this.privilage = privilage;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public void performActionBasedOnPrivilage(){
        Log.d(this.getClass().getSimpleName(),"performAction "+getName()+" "+getPrivilage());
    }
}
