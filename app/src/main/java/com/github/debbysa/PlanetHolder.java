package com.github.debbysa;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class PlanetHolder extends RecyclerView.ViewHolder {
    private TextView txtName, txtDistance, txtGravity, txtDiameter;
    public PlanetHolder(View itemView) {
        super(itemView);
        txtName = itemView.findViewById(R.id.txtName);
        txtDistance = itemView.findViewById(R.id.txtDistance);
        txtGravity = itemView.findViewById(R.id.txtGravity);
        txtDiameter = itemView.findViewById(R.id.txtDiameter);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // handle click event
            }
        });
    }

    public void setDetails(Planet planet) {
        txtName.setText(planet.getPlanetName());
        txtDistance.setText(String.format(Locale.US, "Distance from Sun : %d Million KM", planet.getDistanceFromSun()));
        txtGravity.setText(String.format(Locale.US, "Surface Gravity : %d N/kg", planet.getGravity()));
        txtDiameter.setText(String.format(Locale.US, "Diameter : %d KM", planet.getDiameter()));
    }

}
