package example.com.mvptemplate.data;

import java.util.List;

import io.reactivex.Single;

/**
 * Main entry point for accessing tasks data.
 */

public interface DataSource {
    Single<List<String>> fetchLiveFeedsReactively();
}