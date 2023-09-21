package com.example.exploradordelugarestursticos.ui.lugaresTuristicos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exploradordelugarestursticos.databinding.FragmentLugaresTuristicosBinding;
import com.example.exploradordelugarestursticos.ui.lugaresTuristicos.Model.LugarTuristico;

import java.util.List;

public class LugaresTuristicosFragment extends Fragment {

    private FragmentLugaresTuristicosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LugaresTuristicosViewModel lgViewModel =
                new ViewModelProvider(this).get(LugaresTuristicosViewModel.class);

        binding = FragmentLugaresTuristicosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        lgViewModel.getMutable().observe(getViewLifecycleOwner(), new Observer<List<LugarTuristico>>() {
            @Override
            public void onChanged(List<LugarTuristico> lista) {
                RecyclerView rv = binding.getRoot();
                GridLayoutManager glm = new GridLayoutManager(requireContext(),2, RecyclerView.HORIZONTAL,false);
                rv.setLayoutManager(glm);
                LugarAdapter adapter = new LugarAdapter(lista,requireContext(),getLayoutInflater());
                rv.setAdapter(adapter);
            }
        });
        lgViewModel.cargarLista();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}