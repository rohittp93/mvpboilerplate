package example.com.mvptemplate.ui.dashboard.home;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import example.com.mvptemplate.di.ActivityScoped;
import example.com.mvptemplate.di.FragmentScoped;

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link HomePresenter}.
 */

@Module
public abstract class HomeModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract HomeFragment homeFragment();

    @ActivityScoped
    @Binds
    abstract HomeContract.HomePresenter homePresenter(HomePresenter presenter);
}