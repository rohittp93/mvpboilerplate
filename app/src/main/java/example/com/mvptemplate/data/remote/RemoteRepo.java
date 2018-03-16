package example.com.mvptemplate.data.remote;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import example.com.mvptemplate.data.DataSource;
import io.reactivex.Single;

/**
 * Implementation of the DataSource as Retrofit(Network Calls).
 */
@Singleton
public class RemoteRepo implements DataSource {

    @Inject
    public RemoteRepo() {

    }

    @Override
    public Single<List<String>> fetchLiveFeedsReactively() {
        return null;
    }
}