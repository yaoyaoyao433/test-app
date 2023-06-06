package de.greenrobot.dao;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AbstractDao<T, K> {
    protected final DaoConfig config;
    protected final SQLiteDatabase db;
    protected IdentityScope<K, T> identityScope;
    protected IdentityScopeLong<T> identityScopeLong;
    protected final int pkOrdinal;
    protected final AbstractDaoSession session;
    protected TableStatements statements;

    protected void attachEntity(T t) {
    }

    protected abstract void bindValues(SQLiteStatement sQLiteStatement, T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract K getKey(T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean isEntityUpdateable();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T readEntity(Cursor cursor, int i);

    protected abstract void readEntity(Cursor cursor, T t, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract K readKey(Cursor cursor, int i);

    protected abstract K updateKeyAfterInsert(T t, long j);

    public AbstractDao(DaoConfig daoConfig) {
        this(daoConfig, null);
    }

    public AbstractDao(DaoConfig daoConfig, AbstractDaoSession abstractDaoSession) {
        this.config = daoConfig;
        this.session = abstractDaoSession;
        this.db = daoConfig.db;
        this.identityScope = (IdentityScope<K, T>) daoConfig.getIdentityScope();
        if (this.identityScope instanceof IdentityScopeLong) {
            this.identityScopeLong = (IdentityScopeLong) this.identityScope;
        }
        this.statements = daoConfig.statements;
        this.pkOrdinal = daoConfig.pkProperty != null ? daoConfig.pkProperty.ordinal : -1;
    }

    public AbstractDaoSession getSession() {
        return this.session;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TableStatements getStatements() {
        return this.config.statements;
    }

    public String getTablename() {
        return this.config.tablename;
    }

    public Property[] getProperties() {
        return this.config.properties;
    }

    public Property getPkProperty() {
        return this.config.pkProperty;
    }

    public String[] getAllColumns() {
        return this.config.allColumns;
    }

    public String[] getPkColumns() {
        return this.config.pkColumns;
    }

    public String[] getNonPkColumns() {
        return this.config.nonPkColumns;
    }

    public T load(K k) {
        T t;
        assertSinglePk();
        if (k == null) {
            return null;
        }
        return (this.identityScope == null || (t = this.identityScope.get(k)) == null) ? loadUniqueAndCloseCursor(this.db.rawQuery(this.statements.getSelectByKey(), new String[]{k.toString()})) : t;
    }

    public T loadByRowId(long j) {
        return loadUniqueAndCloseCursor(this.db.rawQuery(this.statements.getSelectByRowId(), new String[]{Long.toString(j)}));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T loadUniqueAndCloseCursor(Cursor cursor) {
        try {
            return loadUnique(cursor);
        } finally {
            cursor.close();
        }
    }

    protected T loadUnique(Cursor cursor) {
        if (cursor.moveToFirst()) {
            if (!cursor.isLast()) {
                throw new DaoException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrent(cursor, 0, true);
        }
        return null;
    }

    public List<T> loadAll() {
        return loadAllAndCloseCursor(this.db.rawQuery(this.statements.getSelectAll(), null));
    }

    public boolean detach(T t) {
        if (this.identityScope != null) {
            return this.identityScope.detach(getKeyVerified(t), t);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<T> loadAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }

    public void insertInTx(Iterable<T> iterable) {
        insertInTx(iterable, isEntityUpdateable());
    }

    public void insertInTx(T... tArr) {
        insertInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    public void insertInTx(Iterable<T> iterable, boolean z) {
        executeInsertInTx(this.statements.getInsertStatement(), iterable, z);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable, boolean z) {
        executeInsertInTx(this.statements.getInsertOrReplaceStatement(), iterable, z);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable) {
        insertOrReplaceInTx(iterable, isEntityUpdateable());
    }

    public void insertOrReplaceInTx(T... tArr) {
        insertOrReplaceInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    private void executeInsertInTx(SQLiteStatement sQLiteStatement, Iterable<T> iterable, boolean z) {
        synchronized (sQLiteStatement) {
            this.db.beginTransaction();
            if (this.identityScope != null) {
                this.identityScope.lock();
            }
            for (T t : iterable) {
                bindValues(sQLiteStatement, t);
                if (z) {
                    updateKeyAfterInsertAndAttach(t, sQLiteStatement.executeInsert(), false);
                } else {
                    sQLiteStatement.execute();
                }
            }
            if (this.identityScope != null) {
                this.identityScope.unlock();
            }
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
        }
    }

    public long insert(T t) {
        return executeInsert(t, this.statements.getInsertStatement());
    }

    public long insertWithoutSettingPk(T t) {
        long executeInsert;
        SQLiteStatement insertStatement = this.statements.getInsertStatement();
        synchronized (insertStatement) {
            bindValues(insertStatement, t);
            executeInsert = insertStatement.executeInsert();
        }
        return executeInsert;
    }

    public long insertOrReplace(T t) {
        return executeInsert(t, this.statements.getInsertOrReplaceStatement());
    }

    private long executeInsert(T t, SQLiteStatement sQLiteStatement) {
        long executeInsert;
        synchronized (sQLiteStatement) {
            bindValues(sQLiteStatement, t);
            executeInsert = sQLiteStatement.executeInsert();
        }
        updateKeyAfterInsertAndAttach(t, executeInsert, true);
        return executeInsert;
    }

    protected void updateKeyAfterInsertAndAttach(T t, long j, boolean z) {
        attachEntity(updateKeyAfterInsert(t, j), t, z);
    }

    protected List<T> loadAllFromCursor(Cursor cursor) {
        CursorWindow window;
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList(count);
        if ((cursor instanceof CrossProcessCursor) && (window = ((CrossProcessCursor) cursor).getWindow()) != null) {
            if (window.getNumRows() == count) {
                cursor = new FastCursor(window);
            } else {
                DaoLog.d("Window vs. result size: " + window.getNumRows() + "/" + count);
            }
        }
        if (cursor.moveToFirst()) {
            if (this.identityScope != null) {
                this.identityScope.lock();
                this.identityScope.reserveRoom(count);
            }
            do {
                try {
                    arrayList.add(loadCurrent(cursor, 0, false));
                } finally {
                    if (this.identityScope != null) {
                        this.identityScope.unlock();
                    }
                }
            } while (cursor.moveToNext());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T loadCurrent(Cursor cursor, int i, boolean z) {
        if (this.identityScopeLong != null) {
            if (i == 0 || !cursor.isNull(this.pkOrdinal + i)) {
                long j = cursor.getLong(this.pkOrdinal + i);
                T t = z ? this.identityScopeLong.get2(j) : this.identityScopeLong.get2NoLock(j);
                if (t != null) {
                    return t;
                }
                T readEntity = readEntity(cursor, i);
                if (z) {
                    this.identityScopeLong.put2(j, readEntity);
                } else {
                    this.identityScopeLong.put2NoLock(j, readEntity);
                }
                attachEntity(readEntity);
                return readEntity;
            }
            return null;
        } else if (this.identityScope != null) {
            K readKey = readKey(cursor, i);
            if (i == 0 || readKey != null) {
                T noLock = z ? this.identityScope.get(readKey) : this.identityScope.getNoLock(readKey);
                if (noLock != null) {
                    return noLock;
                }
                T readEntity2 = readEntity(cursor, i);
                attachEntity(readKey, readEntity2, z);
                return readEntity2;
            }
            return null;
        } else if (i == 0 || readKey(cursor, i) != null) {
            T readEntity3 = readEntity(cursor, i);
            attachEntity(readEntity3);
            return readEntity3;
        } else {
            return null;
        }
    }

    protected final <O> O loadCurrentOther(AbstractDao<O, ?> abstractDao, Cursor cursor, int i) {
        return abstractDao.loadCurrent(cursor, i, true);
    }

    public List<T> queryRaw(String str, String... strArr) {
        SQLiteDatabase sQLiteDatabase = this.db;
        return loadAllAndCloseCursor(sQLiteDatabase.rawQuery(String.valueOf(this.statements.getSelectAll()) + str, strArr));
    }

    public List<T> query(String str, String[] strArr, String str2, String str3, String str4) {
        return loadAllAndCloseCursor(this.db.query(this.config.tablename, getAllColumns(), str, strArr, str2, str3, str4));
    }

    public void deleteAll() {
        SQLiteDatabase sQLiteDatabase = this.db;
        sQLiteDatabase.execSQL("DELETE FROM '" + this.config.tablename + CommonConstant.Symbol.SINGLE_QUOTES);
        if (this.identityScope != null) {
            this.identityScope.clear();
        }
    }

    public void delete(T t) {
        assertSinglePk();
        K keyVerified = getKeyVerified(t);
        deleteByKey(keyVerified);
        if (this.identityScope != null) {
            this.identityScope.remove((IdentityScope<K, T>) keyVerified);
        }
    }

    public void deleteByKey(K k) {
        assertSinglePk();
        SQLiteStatement deleteStatement = this.statements.getDeleteStatement();
        synchronized (deleteStatement) {
            deleteByKeyInsideSynchronized(k, deleteStatement);
        }
        if (this.identityScope != null) {
            this.identityScope.remove((IdentityScope<K, T>) k);
        }
    }

    private void deleteByKeyInsideSynchronized(K k, SQLiteStatement sQLiteStatement) {
        if (k instanceof Long) {
            sQLiteStatement.bindLong(1, ((Long) k).longValue());
        } else {
            sQLiteStatement.bindString(1, k.toString());
        }
        sQLiteStatement.execute();
    }

    public void deleteInTx(Iterable<T> iterable) {
        assertSinglePk();
        SQLiteStatement deleteStatement = this.statements.getDeleteStatement();
        synchronized (deleteStatement) {
            this.db.beginTransaction();
            ArrayList arrayList = null;
            if (this.identityScope != null) {
                this.identityScope.lock();
                arrayList = new ArrayList();
            }
            for (T t : iterable) {
                K keyVerified = getKeyVerified(t);
                deleteByKeyInsideSynchronized(keyVerified, deleteStatement);
                if (arrayList != null) {
                    arrayList.add(keyVerified);
                }
            }
            if (this.identityScope != null) {
                this.identityScope.unlock();
            }
            this.db.setTransactionSuccessful();
            if (arrayList != null && this.identityScope != null) {
                this.identityScope.remove((Iterable) arrayList);
            }
            this.db.endTransaction();
        }
    }

    public void deleteInTx(T... tArr) {
        deleteInTx(Arrays.asList(tArr));
    }

    public void refresh(T t) {
        assertSinglePk();
        K keyVerified = getKeyVerified(t);
        Cursor rawQuery = this.db.rawQuery(this.statements.getSelectByKey(), new String[]{keyVerified.toString()});
        try {
            if (!rawQuery.moveToFirst()) {
                throw new DaoException("Entity does not exist in the database anymore: " + t.getClass() + " with key " + keyVerified);
            } else if (!rawQuery.isLast()) {
                throw new DaoException("Expected unique result, but count was " + rawQuery.getCount());
            } else {
                readEntity(rawQuery, t, 0);
                attachEntity(keyVerified, t, true);
            }
        } finally {
            rawQuery.close();
        }
    }

    public void update(T t) {
        assertSinglePk();
        SQLiteStatement updateStatement = this.statements.getUpdateStatement();
        synchronized (updateStatement) {
            updateInsideSynchronized(t, updateStatement, true);
        }
    }

    public QueryBuilder<T> queryBuilder() {
        return new QueryBuilder<>(this);
    }

    protected void updateInsideSynchronized(T t, SQLiteStatement sQLiteStatement, boolean z) {
        bindValues(sQLiteStatement, t);
        int length = this.config.allColumns.length + 1;
        K key = getKey(t);
        if (key instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) key).longValue());
        } else {
            sQLiteStatement.bindString(length, key.toString());
        }
        sQLiteStatement.execute();
        attachEntity(key, t, z);
    }

    protected final void attachEntity(K k, T t, boolean z) {
        if (this.identityScope != null && k != null) {
            if (z) {
                this.identityScope.put(k, t);
            } else {
                this.identityScope.putNoLock(k, t);
            }
        }
        attachEntity(t);
    }

    public void updateInTx(Iterable<T> iterable) {
        SQLiteStatement updateStatement = this.statements.getUpdateStatement();
        synchronized (updateStatement) {
            this.db.beginTransaction();
            if (this.identityScope != null) {
                this.identityScope.lock();
            }
            try {
                for (T t : iterable) {
                    updateInsideSynchronized(t, updateStatement, false);
                }
                this.db.setTransactionSuccessful();
                this.db.endTransaction();
            } finally {
                if (this.identityScope != null) {
                    this.identityScope.unlock();
                }
            }
        }
    }

    public void updateInTx(T... tArr) {
        updateInTx(Arrays.asList(tArr));
    }

    protected void assertSinglePk() {
        if (this.config.pkColumns.length == 1) {
            return;
        }
        throw new DaoException(this + " (" + this.config.tablename + ") does not have a single-column primary key");
    }

    public long count() {
        SQLiteDatabase sQLiteDatabase = this.db;
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, CommonConstant.Symbol.SINGLE_QUOTES + this.config.tablename + '\'');
    }

    protected K getKeyVerified(T t) {
        K key = getKey(t);
        if (key == null) {
            if (t == null) {
                throw new NullPointerException("Entity may not be null");
            }
            throw new DaoException("Entity has no key");
        }
        return key;
    }

    public SQLiteDatabase getDatabase() {
        return this.db;
    }
}
