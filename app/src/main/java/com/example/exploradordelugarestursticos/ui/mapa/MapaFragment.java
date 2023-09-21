package com.example.exploradordelugarestursticos.ui.mapa;

import static androidx.core.content.PermissionChecker.checkSelfPermission;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.exploradordelugarestursticos.R;
import com.example.exploradordelugarestursticos.databinding.FragmentMapaBinding;
import com.google.android.gms.maps.SupportMapFragment;

public class MapaFragment extends Fragment {

    private FragmentMapaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MapaViewModel mapaViewModel =
                new ViewModelProvider(this).get(MapaViewModel.class);

        binding = FragmentMapaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //observers
        /*mapaViewModel.getMutable().observe(getViewLifecycleOwner(), new Observer<Location>() {
            @Override
            public void onChanged(Location location) {
                mapaViewModel.obtenerMapa();
            }
        });*/
        mapaViewModel.getMutableMapa().observe(getViewLifecycleOwner(), new Observer<MapaViewModel.MapaActual>() {
            @Override
            public void onChanged(MapaViewModel.MapaActual mapaActual) {
                    SupportMapFragment smf=(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
                    smf.getMapAsync(mapaActual);
                }
            });
        //acciones
        mapaViewModel.obtenerUltimaUbicacion();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}