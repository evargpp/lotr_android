package org.niebiosa.sgame;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.niebiosa.sgame.databinding.FragmentWorldBinding;

public class WorldFragment extends Fragment {

    private WorldViewModel mViewModel;
    private FragmentWorldBinding binding;

    public static WorldFragment newInstance() {
        return new WorldFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(WorldViewModel.class);

        binding = FragmentWorldBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textWorld;
        mViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(WorldViewModel.class);
        // TODO: Use the ViewModel
    }

}