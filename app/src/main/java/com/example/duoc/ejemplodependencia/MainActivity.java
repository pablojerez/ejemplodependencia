package com.example.duoc.ejemplodependencia;

import org.osmdroid.api.IMapController;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private MapView myOpenMapView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myOpenMapView = (MapView)findViewById(R.id.openmapview);
        myOpenMapView.setBuiltInZoomControls(true);
        IMapController controller = myOpenMapView.getController();
        controller.setZoom(4);
        myOpenMapView.setMultiTouchControls(true);
    }
}
