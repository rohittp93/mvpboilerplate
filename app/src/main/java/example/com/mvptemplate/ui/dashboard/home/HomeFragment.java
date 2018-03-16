package example.com.mvptemplate.ui.dashboard.home;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.mvptemplate.R;
import example.com.mvptemplate.di.ActivityScoped;

/**
 * Main UI for the home screen.
 */
@ActivityScoped
public class HomeFragment extends dagger.android.support.DaggerFragment implements HomeContract.HomeView {

    @Inject
    HomeContract.HomePresenter mHomePresenter;

    /**
     * Requires empty public constructor
     */
    @Inject
    public HomeFragment() {
        // Requires empty public constructor
    }

    @BindView(R.id.et_name)
    EditText et_name;

    @BindView(R.id.btn_addname)
    Button btn_addname;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, rootView);
        //presenter.loadLiveFeeds();
        return rootView;
    }

    @Override
    public void populateList(List<String> liveFeeds) {
        Toast.makeText(getActivity(), "livefeeds returned", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setLoadingIndicator(boolean isLoading) {
        Toast.makeText(getActivity(), "Loading " + isLoading, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(Throwable throwable) {
    }

    @OnClick(R.id.btn_addname)
    void onAddNameClicked() {

    }

    @Override
    public void onResume() {
        super.onResume();
        mHomePresenter.takeView(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mHomePresenter.dropView();
    }
}