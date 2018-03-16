package example.com.mvptemplate.ui.dashboard.favorites;

import android.support.annotation.Nullable;

import javax.inject.Inject;

import example.com.mvptemplate.data.DataSource;
import example.com.mvptemplate.data.Repository;
import example.com.mvptemplate.di.ActivityScoped;
import example.com.mvptemplate.rx.SchedulersFacade;

/**
 * Listens to user actions from the UI ({@link FavoritesFragment}), retrieves the data and updates
 * the UI as required.
 * <p>
 * By marking the constructor with {@code @Inject}, Dagger injects the dependencies required to
 * create an instance of the FavoritesPresenter (if it fails, it emits a compiler error). It uses
 * {@link FavoritesModule} to do so.
 * <p>
 * Dagger generated code doesn't require public access to the constructor or class, and
 * therefore, to ensure the developer doesn't instantiate the class manually and bypasses Dagger,
 * it's good practice minimise the visibility of the class/constructor as much as possible.
 */

@ActivityScoped
public class FavoritesPresenter implements FavoritesContract.FavoritesPresenter {
    private final DataSource mRepository;
    private final SchedulersFacade mSchedulersFacade;

    @Nullable
    private FavoritesContract.FavoritesView mFavoritesView;

    @Inject
    public FavoritesPresenter(Repository mRepository, SchedulersFacade mSchedulersFacade) {
        this.mRepository = mRepository;
        this.mSchedulersFacade = mSchedulersFacade;
    }

    @Override
    public void loadSomeData() {

    }

    @Override
    public void takeView(FavoritesContract.FavoritesView view) {
        this.mFavoritesView = view;
    }

    @Override
    public void dropView() {
        this.mFavoritesView = null;
    }
}
