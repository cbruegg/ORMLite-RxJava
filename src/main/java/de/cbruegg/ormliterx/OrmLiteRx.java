package de.cbruegg.ormliterx;

import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import rx.Observable;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * Collection of thin wrappers around ORMLite
 * for usage with RxJava.
 */
public final class OrmLiteRx {

    private OrmLiteRx() {
    }

    /**
     * @see Where#query()
     */
    public static <T, ID> Observable<List<T>> query(final Where<T, ID> where) {
        return Observable.fromCallable(new Callable<List<T>>() {
            public List<T> call() throws Exception {
                return where.query();
            }
        });
    }

    /**
     * @see QueryBuilder#query()
     */
    public static <T, ID> Observable<List<T>> query(final QueryBuilder<T, ID> qb) {
        return Observable.fromCallable(new Callable<List<T>>() {
            public List<T> call() throws Exception {
                return qb.query();
            }
        });
    }

    /**
     * @see Where#queryForFirst()
     */
    public static <T, ID> Observable<T> queryForFirst(final Where<T, ID> where) {
        return Observable.fromCallable(new Callable<T>() {
            public T call() throws Exception {
                return where.queryForFirst();
            }
        });
    }

    /**
     * @see QueryBuilder#queryForFirst()
     */
    public static <T, ID> Observable<T> queryForFirst(final QueryBuilder<T, ID> qb) {
        return Observable.fromCallable(new Callable<T>() {
            public T call() throws Exception {
                return qb.queryForFirst();
            }
        });
    }

}
