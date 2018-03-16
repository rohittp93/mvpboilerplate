package example.com.mvptemplate.ui.dashboard.favorites;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import example.com.mvptemplate.di.ActivityScoped;
import example.com.mvptemplate.di.FragmentScoped;

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link FavoritesPresenter}.
 */

@Module
public abstract class FavoritesModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract FavoritesFragment favoritesFragment();

    @ActivityScoped
    @Binds
    abstract FavoritesContract.FavoritesPresenter favoritesPresenter(FavoritesPresenter presenter);
}