package org.niebiosa.sgame;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ComponentGoodsFragment extends Fragment {

    private ComponentGoodsViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_component_goods, container, false);

        TextView mithrilTextView = view.findViewById(R.id.textGoodsValueMithril);
        TextView woodTextView = view.findViewById(R.id.textGoodsValueWood);
        TextView breadTextView = view.findViewById(R.id.textGoodsValueBread);
        TextView fishTextView = view.findViewById(R.id.textGoodsValueFish);

        viewModel = new ViewModelProvider(this).get(ComponentGoodsViewModel.class);

        viewModel.getMithril().observe(getViewLifecycleOwner(), mithrilTextView::setText);
        viewModel.getWood().observe(getViewLifecycleOwner(), woodTextView::setText);
        viewModel.getBread().observe(getViewLifecycleOwner(), breadTextView::setText);
        viewModel.getFish().observe(getViewLifecycleOwner(), fishTextView::setText);

        return view;
    }
}
