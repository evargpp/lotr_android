package org.niebiosa.sgame;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import org.lotr.controllers.GameController;
import javax.inject.Inject;
import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class ComponentGoodsViewModel extends ViewModel {

    private final MutableLiveData<String> mithril = new MutableLiveData<>();
    private final MutableLiveData<String> wood = new MutableLiveData<>();
    private final MutableLiveData<String> bread = new MutableLiveData<>();
    private final MutableLiveData<String> fish = new MutableLiveData<>();

    @Inject
    public ComponentGoodsViewModel(GameController gc) {
        mithril.setValue(String.valueOf(gc.getTeam().getMithril()));
        wood.setValue(String.valueOf(gc.getTeam().getWood()));
        bread.setValue(String.valueOf(gc.getTeam().getBread()));
        fish.setValue(String.valueOf(gc.getTeam().getFish()));
    }

    public void updateResources(GameController gc) {
        mithril.setValue(String.valueOf(gc.getTeam().getMithril()));
        wood.setValue(String.valueOf(gc.getTeam().getWood()));
        bread.setValue(String.valueOf(gc.getTeam().getBread()));
        fish.setValue(String.valueOf(gc.getTeam().getFish()));
    }

    public LiveData<String> getMithril() {
        return mithril;
    }

    public LiveData<String> getWood() {
        return wood;
    }

    public LiveData<String> getBread() {
        return bread;
    }

    public LiveData<String> getFish() {
        return fish;
    }
}
