package org.niebiosa.sgame;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import org.lotr.controllers.GameController;
import org.lotr.world.Bakery;
import org.lotr.world.FishingHut;
import org.lotr.world.Mine;
import org.lotr.world.Sawmill;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class GoodsFragment extends Fragment {

    private GoodsViewModel mViewModel;

    public static GoodsFragment newInstance() {
        return new GoodsFragment();
    }

    @Inject
    GameController gc;
    private ComponentGoodsViewModel viewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_goods, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(GoodsViewModel.class);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(ComponentGoodsViewModel.class);

        ImageView mine = view.findViewById(R.id.imageView_1_1);
        ImageView bakery = view.findViewById(R.id.imageView_1_3);
        ImageView fisherHut = view.findViewById(R.id.imageView_3_1);
        ImageView sawmill = view.findViewById(R.id.imageView_1_2);

        mine.setOnClickListener(v -> {
            Mine mineBuilding = gc.getTeam().getCurrentCity().findBuildingByType(Mine.class);
            if (mineBuilding != null) {
                int mithril = mineBuilding.collectOre();
                gc.getTeam().addMithril(mithril);
                viewModel.updateResources(gc);
                Toast.makeText(requireContext(), "Zmagazynowano mithril: " + mithril, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(requireContext(), "Kopalnia nieznaleziona!", Toast.LENGTH_SHORT).show();
            }
        });

        bakery.setOnClickListener(v -> {
            Bakery bakeryBuilding = gc.getTeam().getCurrentCity().findBuildingByType(Bakery.class);
            if (bakeryBuilding != null) {
                int breads = bakeryBuilding.collectBread();
                gc.getTeam().addBread(breads);
                viewModel.updateResources(gc);
                Toast.makeText(requireContext(), "Zmagazynowano pieczywo: " + breads, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(requireContext(), "Piekarnia nieznaleziona!", Toast.LENGTH_SHORT).show();
            }
        });

        fisherHut.setOnClickListener(v -> {
            FishingHut fishingHut = gc.getTeam().getCurrentCity().findBuildingByType(FishingHut.class);
            if (fishingHut != null) {
                int fish = fishingHut.collectFish();
                gc.getTeam().addFish(fish);
                viewModel.updateResources(gc);
                Toast.makeText(requireContext(), "Zmagazynowano ryby: " + fish, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(requireContext(), "Chatka rybacka nieznaleziona!", Toast.LENGTH_SHORT).show();
            }
        });

        sawmill.setOnClickListener(v -> {
            Sawmill sawmillBuilding = gc.getTeam().getCurrentCity().findBuildingByType(Sawmill.class);
            if (sawmillBuilding != null) {
                int wood = sawmillBuilding.collectWood();
                gc.getTeam().addWood(wood);
                viewModel.updateResources(gc);
                Toast.makeText(requireContext(), "Zmagazynowano drewno: " + wood, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(requireContext(), "Tartak nieznaleziony!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
