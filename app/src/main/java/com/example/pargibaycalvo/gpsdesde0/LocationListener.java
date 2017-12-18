package com.example.pargibaycalvo.gpsdesde0;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by pargibaycalvo on 18/12/17.
 */

public class MyLocationListener implements LocationListener {
    MainActivity mainActivity;

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onLocationChanged(Location loc) {
        loc.getLatitude();
        loc.getLongitude();
        String Text = "Mi ubicacion actual es: " + "\n Latitud = "
                + loc.getLatitude() + "\n Longitud = " + loc.getLongitude();
        messageTextView.setText(Text);
        this.mainActivity.setLocation(loc);
    }

    @Override
    public void onProviderDisabled(String provider) {
        messageTextView.setText("GPS Desactivado");
    }

    @Override
    public void onProviderEnabled(String provider) {
        messageTextView.setText("GPS Activado");
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }
}