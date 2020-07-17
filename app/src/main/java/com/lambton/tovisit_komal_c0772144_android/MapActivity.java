package com.lambton.tovisit_komal_c0772144_android;

import android.app.AlertDialog;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
    private static final int REQUEST_CODE = 1;
    private static final int RADIUS = 1500;
    private static final String TAG = "MAP";
    private static final long WAIT_TIME = 5L;
    private GoogleMap mMap;
    Location currUserLocation;
    Marker fvt_dest, startL, User;

    Boolean isEditing = false;

    AlertDialog dropdownMenu;

    String s = null;
    Place p = null;

    DatabaseHelper mDatabase;

    // location manager and listener
    LocationManager locationManager;
    LocationListener locationListener;
    Geocoder geocoder;

    //Context context;

    Spinner typeMap, nearby, markerAction;

    private String place_name;
    private Object[] dataTransfer;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
setContentView(R.layout.activity_map);
    }
}
