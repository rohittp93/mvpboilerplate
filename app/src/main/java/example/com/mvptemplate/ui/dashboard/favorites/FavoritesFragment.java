package example.com.mvptemplate.ui.dashboard.favorites;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.support.DaggerFragment;
import example.com.mvptemplate.R;
import example.com.mvptemplate.di.ActivityScoped;

/**
 * Main UI for the favorites screen.
 */

@ActivityScoped
public class FavoritesFragment extends DaggerFragment implements FavoritesContract.FavoritesView {
    @Inject
    FavoritesContract.FavoritesPresenter mFavoritesPresenter;


    @Inject
    public FavoritesFragment() {
        // Requires empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_favorites, container, false);
        ButterKnife.bind(this, rootView);
        //presenter.loadLiveFeeds();
        return rootView;
    }

    @Override
    public void populateList(String someData) {
    }

    @Override
    public void setLoadingIndicator(boolean isLoaded) {

    }

    @Override
    public void showError(Throwable throwable) {

    }

    @Override
    public void onResume() {
        super.onResume();
        this.mFavoritesPresenter.takeView(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mFavoritesPresenter.dropView();
    }
}
