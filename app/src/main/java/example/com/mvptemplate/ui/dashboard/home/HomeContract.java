package example.com.mvptemplate.ui.dashboard.home;

import java.util.List;

import example.com.mvptemplate.mvp.BasePresenter;

/**
 * This specifies the contract between the view and the presenter.
 */

public class HomeContract {
    interface HomeView {
        void populateList(List<String> liveFeeds);

        void setLoadingIndicator(boolean isLoading);

        void showError(Throwable throwable);
    }

    interface HomePresenter extends BasePresenter<HomeView> {
        void loadLiveFeeds();
    }
}