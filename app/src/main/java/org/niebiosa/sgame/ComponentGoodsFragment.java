package org.niebiosa.sgame;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import org.niebiosa.sgame.databinding.FragmentComponentGoodsBinding;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ComponentGoodsFragment extends Fragment {

    private ComponentGoodsViewModel viewModel;
    private FragmentComponentGoodsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_component_goods, container, false);

        viewModel = new ViewModelProvider(this).get(ComponentGoodsViewModel.class);

        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(getViewLifecycleOwner());

        return binding.getRoot();
    }
}
