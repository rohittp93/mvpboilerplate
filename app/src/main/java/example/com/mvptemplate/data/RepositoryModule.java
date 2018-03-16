package example.com.mvptemplate.data;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import example.com.mvptemplate.data.local.LocalRepo;
import example.com.mvptemplate.data.remote.RemoteRepo;

/**
 * This is used by Dagger to inject the required arguments into the {@link Repository}.
 */
@Module
abstract public class RepositoryModule {
    @Singleton
    @Binds
    @Local
    abstract DataSource provideLocalDataSource(LocalRepo dataSource);

    @Singleton
    @Binds
    @Remote
    abstract DataSource provideRemoteDataSource(RemoteRepo dataSource);
}