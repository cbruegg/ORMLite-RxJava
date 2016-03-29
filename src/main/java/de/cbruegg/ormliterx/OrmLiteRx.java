package de.cbruegg.ormliterx;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.*;
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
     * @see Dao#queryForAll()
     */
    public static <T, ID> Observable<List<T>> queryForAll(final Dao<T, ID> dao) {
        return Observable.fromCallable(new Callable<List<T>>() {
            public List<T> call() throws Exception {
                return dao.queryForAll();
            }
        });
    }

    /**
     * @see RuntimeExceptionDao#queryForAll()
     */
    public static <T, ID> Observable<List<T>> queryForAll(final RuntimeExceptionDao<T, ID> dao) {
        return Observable.fromCallable(new Callable<List<T>>() {
            public List<T> call() throws Exception {
                return dao.queryForAll();
            }
        });
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
     * @see RuntimeExceptionWhere#query()
     */
    public static <T, ID> Observable<List<T>> query(final RuntimeExceptionWhere<T, ID> where) {
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
     * @see RuntimeExceptionQueryBuilder#query()
     */
    public static <T, ID> Observable<List<T>> query(final RuntimeExceptionQueryBuilder<T, ID> qb) {
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
     * @see RuntimeExceptionWhere#queryForFirst()
     */
    public static <T, ID> Observable<T> queryForFirst(final RuntimeExceptionWhere<T, ID> where) {
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

    /**
     * @see RuntimeExceptionQueryBuilder#queryForFirst()
     */
    public static <T, ID> Observable<T> queryForFirst(final RuntimeExceptionQueryBuilder<T, ID> qb) {
        return Observable.fromCallable(new Callable<T>() {
            public T call() throws Exception {
                return qb.queryForFirst();
            }
        });
    }

    /**
     * @see Dao#queryForId(Object)
     */
    public static <T, ID> Observable<T> queryForId(final Dao<T, ID> dao, final ID id) {
        return Observable.fromCallable(new Callable<T>() {
            public T call() throws Exception {
                return dao.queryForId(id);
            }
        });
    }

    /**
     * @see RuntimeExceptionDao#queryForId(Object)
     */
    public static <T, ID> Observable<T> queryForId(final RuntimeExceptionDao<T, ID> dao, final ID id) {
        return Observable.fromCallable(new Callable<T>() {
            public T call() throws Exception {
                return dao.queryForId(id);
            }
        });
    }

    /**
     * @see Dao#queryForEq(String, Object)
     */
    public static <T, ID> Observable<List<T>> queryForEq(final Dao<T, ID> dao, final String column, final Object o) {
        return Observable.fromCallable(new Callable<List<T>>() {
            public List<T> call() throws Exception {
                return dao.queryForEq(column, o);
            }
        });
    }

    /**
     * @see RuntimeExceptionDao#queryForEq(String, Object)
     */
    public static <T, ID> Observable<List<T>> queryForEq(final RuntimeExceptionDao<T, ID> dao, final String column, final Object o) {
        return Observable.fromCallable(new Callable<List<T>>() {
            public List<T> call() throws Exception {
                return dao.queryForEq(column, o);
            }
        });
    }

    /**
     * @see RawQueryBuilder#selectRaw(Dao, String, Object...)
     */
    public static <T, ID> Observable<List<T>> queryRaw(final Dao<T, ID> dao, final String statement, final Object... args) {
        return Observable.fromCallable(new Callable<List<T>>() {
            public List<T> call() throws Exception {
                return RawQueryBuilder.selectRaw(dao, statement, args);
            }
        });
    }

    /**
     * @see RawQueryBuilder#selectRaw(Dao, String, Object...)
     */
    public static <T, ID> Observable<List<T>> queryRaw(final RuntimeExceptionDao<T, ID> dao, final String statement, final Object... args) {
        return Observable.fromCallable(new Callable<List<T>>() {
            public List<T> call() throws Exception {
                return RawQueryBuilder.selectRaw(dao.getWrappedDao(), statement, args);
            }
        });
    }

    /**
     * @see RawQueryBuilder#selectLongRaw(Dao, String, Object...)
     */
    public static <T, ID> Observable<Long> queryLongRaw(final Dao<T, ID> dao, final String statement, final Object... args) {
        return Observable.fromCallable(new Callable<Long>() {
            public Long call() throws Exception {
                return RawQueryBuilder.selectLongRaw(dao, statement, args);
            }
        });
    }

    /**
     * @see RawQueryBuilder#selectLongRaw(Dao, String, Object...)
     */
    public static <T, ID> Observable<Long> queryLongRaw(final RuntimeExceptionDao<T, ID> dao, final String statement, final Object... args) {
        return Observable.fromCallable(new Callable<Long>() {
            public Long call() throws Exception {
                return RawQueryBuilder.selectLongRaw(dao.getWrappedDao(), statement, args);
            }
        });
    }

}
