package org.niebiosa.sgame.di;

import org.lotr.controllers.GameController;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class GameModule {

    @Provides
    @Singleton
    public GameController provideGameController() {
        return new GameController();
    }
}
