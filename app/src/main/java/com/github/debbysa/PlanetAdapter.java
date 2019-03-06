package com.github.debbysa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetHolder> {
    private Context context;
    private ArrayList<Planet> planets;

    @NonNull
    @Override
    public PlanetHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_row, parent, false);
        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(PlanetHolder holder, int position) {
        Planet planet = planets.get(position);
        holder.setDetails(planet);
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    public PlanetAdapter(Context context, ArrayList<Planet> planets) {
            this.context = context;
            this.planets = planets;
        }
}
