package example.com.mvptemplate.data.local;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import example.com.mvptemplate.data.DataSource;
import io.reactivex.Single;

/**
 * Concrete implementation of DataSource as a Realm/Room/Sqlite.
 */
@Singleton
public class LocalRepo implements DataSource {

    @Inject
    public LocalRepo() {

    }

    @Override
    public Single<List<String>> fetchLiveFeedsReactively() {
        return null;
    }
}