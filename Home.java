package com.example.calsys.recyc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.calsys.tzcard.ArrayAdapter;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView recycler_hoomw;
    ArrayAdapter cadapter;
    ArrayList<Inventory> array_name = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recycler_hoomw = findViewById(R.id.myrec);
        cadapter = new ArrayAdapter(array_name);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());
        recycler_hoomw.setLayoutManager(lm);
        recycler_hoomw.setItemAnimator(new DefaultItemAnimator());
        recycler_hoomw.setAdapter(cadapter);

        inputdata();
    }

    private void inputdata() {
        Inventory d = new Inventory("fasil", "13");
        array_name.add(d);
        Inventory d1 = new Inventory("kkkk", "12");
        array_name.add(d1);
        Inventory d2 = new Inventory("sharej", "14");
        array_name.add(d2);
        Inventory d3 = new Inventory("jio", "14");
        array_name.add(d3);
        Inventory d4 = new Inventory("chem", "14");
        array_name.add(d4);
        Inventory d5 = new Inventory("math", "14");
        array_name.add(d5);
        Inventory d6 = new Inventory("sam", "14");
        array_name.add(d6);
        Inventory d7 = new Inventory("zero", "14");
        array_name.add(d7);
        Inventory d8 = new Inventory("mark", "14");
        array_name.add(d8);
        Inventory d9 = new Inventory("get", "14");
        array_name.add(d9);
        Inventory d10 = new Inventory("hi", "14");
        array_name.add(d10);
        Inventory d11 = new Inventory("hlo", "14");
        array_name.add(d11);

    }
}
