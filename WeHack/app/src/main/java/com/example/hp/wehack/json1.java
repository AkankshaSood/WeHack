package com.example.hp.wehack;

import java.util.ArrayList;

/**
 * Created by Akanksha on 10/4/2018.
 */

public class json1 {
    ArrayList<json2> items;

    public json1(ArrayList<json2> items)
    {
        this.items = items;
    }

    public ArrayList<json2> getItems() {
        return items;
    }
}
