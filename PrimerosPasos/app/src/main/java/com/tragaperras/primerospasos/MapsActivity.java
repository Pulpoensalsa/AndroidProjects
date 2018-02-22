package com.tragaperras.primerospasos;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng budhaEstaConTodos = new LatLng(36.7560422,-4.439657);
        LatLng budhaEstaConTodos2 = new LatLng(36.7560422,-4.439657);
        LatLng budhaEstaConTodos3 = new LatLng(36.6238964,-4.5756128);

        mMap.addMarker(new MarkerOptions().position(budhaEstaConTodos).title("Paz y amor hermanos"));
        mMap.addMarker(new MarkerOptions().position(budhaEstaConTodos2).title("Paz y amor hermanos 2"));
        mMap.addMarker(new MarkerOptions().position(budhaEstaConTodos3).title("Paz y amor hermanos 3"));
        
    }
}
