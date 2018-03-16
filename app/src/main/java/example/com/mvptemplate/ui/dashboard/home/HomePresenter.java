package example.com.mvptemplate.ui.dashboard.home;

import android.support.annotation.Nullable;

import javax.inject.Inject;

import example.com.mvptemplate.data.DataSource;
import example.com.mvptemplate.data.Repository;
import example.com.mvptemplate.di.ActivityScoped;
import example.com.mvptemplate.rx.SchedulersFacade;


/**
 * Listens to user actions from the UI ({@link HomeFragment}), retrieves the data and updates
 * the UI as required.
 * <p>
 * By marking the constructor with {@code @Inject}, Dagger injects the dependencies required to
 * create an instance of the HomePresenter (if it fails, it emits a compiler error). It uses
 * {@link HomeModule} to do so.
 * <p>
 * Dagger generated code doesn't require public access to the constructor or class, and
 * therefore, to ensure the developer doesn't instantiate the class manually and bypasses Dagger,
 * it's good practice minimise the visibility of the class/constructor as much as possible.
 */
@ActivityScoped
public class HomePresenter implements HomeContract.HomePresenter {
    private final DataSource mRepository;
    private final SchedulersFacade mSchedulersFacade;

    @Nullable
    private HomeContract.HomeView mHomeView;


    /**
     * Dagger strictly enforces that arguments not marked with {@code @Nullable} are not injected
     * with {@code @Nullable} values.
     */
    @Inject
    public HomePresenter(Repository mRepository, SchedulersFacade schedulersFacade) {
        this.mRepository = mRepository;
        this.mSchedulersFacade = schedulersFacade;
    }

    @Override
    public void loadLiveFeeds() {
    }

    @Override
    public void takeView(HomeContract.HomeView view) {
        this.mHomeView = view;
    }

    @Override
    public void dropView() {
        this.mHomeView = null;
    }
}