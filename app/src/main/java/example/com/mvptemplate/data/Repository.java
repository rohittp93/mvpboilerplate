package example.com.mvptemplate.data;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

/**
 * <p>
 * By marking the constructor with {@code @Inject} and the class with {@code @Singleton}, Dagger
 * injects the dependencies required to create an instance of the Respository (if it fails, it
 * emits a compiler error). It uses {@link RepositoryModule} to do so, and the constructed
 * instance is available in {@link example.com.mvptemplate.di.AppComponent}.
 * <p/>
 * Dagger generated code doesn't require public access to the constructor or class, and
 * therefore, to ensure the developer doesn't instantiate the class manually and bypasses Dagger,
 * it's good practice minimise the visibility of the class/constructor as much as possible.
 */

@Singleton
public class Repository implements DataSource {
    private final DataSource mRemoteDataSource;
    private final DataSource mLocalDataSource;

    @Inject
    public Repository(@Remote DataSource mRemoteDataSource, @Local DataSource mLocalDataSource) {
        this.mRemoteDataSource = mRemoteDataSource;
        this.mLocalDataSource = mLocalDataSource;
    }

    @Override
    public Single<List<String>> fetchLiveFeedsReactively() {

        mRemoteDataSource.fetchLiveFeedsReactively();

        return null;
    }
}