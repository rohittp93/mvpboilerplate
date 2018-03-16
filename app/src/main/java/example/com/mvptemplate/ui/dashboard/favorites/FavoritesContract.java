package example.com.mvptemplate.ui.dashboard.favorites;

import example.com.mvptemplate.mvp.BasePresenter;

/**
 * This specifies the contract between the view and the presenter.
 */

public class FavoritesContract {
    interface FavoritesView {
        void populateList(String someData);

        void setLoadingIndicator(boolean isLoading);

        void showError(Throwable throwable);
    }

    interface FavoritesPresenter extends BasePresenter<FavoritesView> {
        void loadSomeData();
    }
}