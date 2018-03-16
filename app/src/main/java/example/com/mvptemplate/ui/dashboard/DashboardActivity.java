package example.com.mvptemplate.ui.dashboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Button;
import android.widget.FrameLayout;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.support.DaggerAppCompatActivity;
import example.com.mvptemplate.R;
import example.com.mvptemplate.ui.dashboard.favorites.FavoritesFragment;
import example.com.mvptemplate.ui.dashboard.home.HomeFragment;

public class DashboardActivity extends DaggerAppCompatActivity {
    @BindView(R.id.btn_favorites)
    Button btn_favorites;

    @BindView(R.id.btn_home)
    Button home;

    @BindView(R.id.fragment_container)
    FrameLayout container;

    @Inject
    HomeFragment homeFragmentProvider;

    @Inject
    FavoritesFragment favoritesFragmentProvider;

    FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
        mFragmentManager = getSupportFragmentManager();
        Fragment mFragment = mFragmentManager.findFragmentById(R.id.fragment_container);

        if (mFragment == null) {
            mFragment = homeFragmentProvider;
            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_container, mFragment);
            fragmentTransaction.commit();
        }
    }

    @OnClick(R.id.btn_home)
    void onHomeClicked() {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, homeFragmentProvider);
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_favorites)
    void onFavoritesClicked() {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, favoritesFragmentProvider);
        fragmentTransaction.commit();
    }
}