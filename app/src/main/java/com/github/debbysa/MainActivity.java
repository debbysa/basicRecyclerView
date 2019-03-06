package com.github.debbysa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlanetAdapter adapter;
    private ArrayList<Planet> planetArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainplanet);
        recyclerView = findViewById(R.id.rv_planets);

//        List<Student> students = new ArrayList<>();
//        students.add(new Student("deby", "123"));
//        students.add(new Student("deby", "123"));
//        students.add(new Student("deby", "123"));
//        students.add(new Student("deby", "123"));
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        StudentAdapter studentAdapter = new StudentAdapter(students, this);
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(studentAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        planetArrayList = new ArrayList<>();
        adapter = new PlanetAdapter(this, planetArrayList);
        recyclerView.setAdapter(adapter);
        createListData();
    }

    private void createListData() {
        Planet planet = new Planet("Merkurius", 58, 4, 4900);
        planetArrayList.add(planet);
        planet = new Planet("Venus", 108, 9, 12750);
        planetArrayList.add(planet);
        planet = new Planet("Bumi", 150, 10, 12750);
        planetArrayList.add(planet);
        planet = new Planet("Mars", 228, 4, 6800);
        planetArrayList.add(planet);
        planet = new Planet("Jupiter", 778, 26, 143000);
        planetArrayList.add(planet);
        planet = new Planet("Saturnus", 1429, 11, 120000);
        planetArrayList.add(planet);
        planet = new Planet("Uranus", 2870, 9, 52400);
        planetArrayList.add(planet);
        planet = new Planet("Neptunus", 4500, 12, 50500);
        planetArrayList.add(planet);
        planet = new Planet("Pluto", 5900, 1, 2320);
        planetArrayList.add(planet);
        adapter.notifyDataSetChanged();
    }
}
