package com.meituan.android.common.aidata.database;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.provider.BaseColumns;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseTable<T> implements BaseColumns {
    public static final String SCHEMA = "content://";
    private static final String TAG = "BaseTable";
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    protected final Lock mReadLock;
    private final SQLiteOpenHelper mSqLiteOpenHelper;
    private final String mTableName;
    @NonNull
    protected final Lock mWriteLock;

    public abstract ContentValues getContentValues(T t);

    public abstract String getCreateSql();

    public abstract T getItemFromCursor(Cursor cursor);

    public void notifyChange(Uri uri) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public BaseTable(String str, SQLiteOpenHelper sQLiteOpenHelper) {
        this(str, sQLiteOpenHelper, new ReentrantReadWriteLock());
        Object[] objArr = {str, sQLiteOpenHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4088bd54f3f104b33bc65fc5d521f17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4088bd54f3f104b33bc65fc5d521f17");
        }
    }

    public BaseTable(String str, SQLiteOpenHelper sQLiteOpenHelper, @NonNull ReadWriteLock readWriteLock) {
        Object[] objArr = {str, sQLiteOpenHelper, readWriteLock};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b98ede4d4bd80195ce4030b827c4d0ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b98ede4d4bd80195ce4030b827c4d0ed");
            return;
        }
        this.mTableName = str;
        this.mSqLiteOpenHelper = sQLiteOpenHelper;
        this.mReadLock = readWriteLock.readLock();
        this.mWriteLock = readWriteLock.writeLock();
    }

    public String getTableName() {
        return this.mTableName;
    }

    public List<T> queryAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9c6e094dee9d48e6b3d38314a445cc4", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9c6e094dee9d48e6b3d38314a445cc4") : queryByCase(null, null, null);
    }

    public List<T> queryByCase(String str, String[] strArr, String str2) {
        ArrayList arrayList;
        SQLiteDatabase database;
        Object[] objArr = {str, strArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fe63bcfeb70503509b8c2b06ae4d31f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fe63bcfeb70503509b8c2b06ae4d31f");
        }
        this.mReadLock.lock();
        Cursor cursor = null;
        try {
            try {
                database = getDatabase();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused) {
            arrayList = null;
        }
        if (database != null) {
            arrayList = new ArrayList();
            try {
                Cursor query = database.query(getTableName(), null, str, strArr, null, null, str2);
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            arrayList.add(getItemFromCursor(query));
                        } catch (Exception unused2) {
                            cursor = query;
                            getTableName();
                            if (cursor != null) {
                                cursor.close();
                            }
                            this.mReadLock.unlock();
                            return arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            this.mReadLock.unlock();
                            throw th;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (Exception unused3) {
            }
            this.mReadLock.unlock();
            return arrayList;
        }
        this.mReadLock.unlock();
        return null;
    }

    public T querySingleByCase(String str, String[] strArr, String str2) {
        Object[] objArr = {str, strArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cb8da81d03a145b0aa9a9a7a36c561b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cb8da81d03a145b0aa9a9a7a36c561b");
        }
        List<T> queryByCase = queryByCase(str, strArr, str2);
        if (queryByCase == null || queryByCase.size() <= 0) {
            return null;
        }
        return queryByCase.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public List<T> rawQuery(String str) {
        ArrayList arrayList;
        SQLiteDatabase database;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcec9c84faacc36958cf1d4d8ac83fa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcec9c84faacc36958cf1d4d8ac83fa3");
        }
        this.mReadLock.lock();
        Cursor cursor = 0;
        try {
            try {
                database = getDatabase();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused) {
            arrayList = null;
        }
        if (database != null) {
            arrayList = new ArrayList();
            try {
                Cursor rawQuery = database.rawQuery(str, null);
                while (true) {
                    try {
                        cursor = rawQuery.moveToNext();
                        if (cursor == 0) {
                            break;
                        }
                        arrayList.add(getItemFromCursor(rawQuery));
                    } catch (Exception unused2) {
                        cursor = rawQuery;
                        getTableName();
                        if (cursor != 0) {
                            cursor.close();
                        }
                        this.mReadLock.unlock();
                        return arrayList;
                    } catch (Throwable th2) {
                        cursor = rawQuery;
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        this.mReadLock.unlock();
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (Exception unused3) {
            }
            this.mReadLock.unlock();
            return arrayList;
        }
        this.mReadLock.unlock();
        return null;
    }

    public int getCount(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c17c84599043e1a13c5c5f02695fb592", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c17c84599043e1a13c5c5f02695fb592")).intValue();
        }
        Cursor cursor = null;
        this.mReadLock.lock();
        try {
            try {
                SQLiteDatabase database = getDatabase();
                if (database == null) {
                    this.mReadLock.unlock();
                    return 0;
                }
                Cursor query = database.query(getTableName(), null, str, strArr, null, null, null);
                try {
                    int count = query.getCount();
                    if (query != null) {
                        query.close();
                    }
                    this.mReadLock.unlock();
                    return count;
                } catch (Exception unused) {
                    cursor = query;
                    getTableName();
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.mReadLock.unlock();
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.mReadLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
        }
    }

    public long insert(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d48cff6db9ef04f2b1a6e75a4b9ff834", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d48cff6db9ef04f2b1a6e75a4b9ff834")).longValue();
        }
        long j = -1;
        this.mWriteLock.lock();
        try {
            try {
                SQLiteDatabase database = getDatabase();
                if (database != null) {
                    j = database.insert(getTableName(), null, getContentValues(t));
                }
            } catch (Exception unused) {
                getTableName();
            }
            return j;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void insert(List<T> list) {
        SQLiteDatabase sQLiteDatabase;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ef0dafd8db2d72437551a61be4cc58f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ef0dafd8db2d72437551a61be4cc58f");
            return;
        }
        this.mWriteLock.lock();
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            try {
                try {
                    sQLiteDatabase = getDatabase();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i = 0; i < list.size(); i++) {
                        sQLiteDatabase.insert(getTableName(), null, getContentValues(list.get(i)));
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Exception unused3) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    getTableName();
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.endTransaction();
                    }
                    this.mWriteLock.unlock();
                    return;
                } catch (Throwable th) {
                    th = th;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Exception unused4) {
                        }
                    }
                    this.mWriteLock.unlock();
                    throw th;
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
                this.mWriteLock.unlock();
                return;
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception unused5) {
                }
            }
            this.mWriteLock.unlock();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabase2;
        }
    }

    public int deleteByCase(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7552c2080f7da2df6ea5fefb3502248b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7552c2080f7da2df6ea5fefb3502248b")).intValue();
        }
        this.mWriteLock.lock();
        try {
            try {
                SQLiteDatabase database = getDatabase();
                if (database == null) {
                    return -1;
                }
                return database.delete(getTableName(), str, strArr);
            } catch (Exception unused) {
                getTableName();
                this.mWriteLock.unlock();
                return -1;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public int updateByCase(T t, String str, String[] strArr) {
        Object[] objArr = {t, str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ea00d8cf49ba80ba35c89765704a5b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ea00d8cf49ba80ba35c89765704a5b8")).intValue();
        }
        this.mWriteLock.lock();
        try {
            try {
                SQLiteDatabase database = getDatabase();
                if (database == null) {
                    return -1;
                }
                return database.update(getTableName(), getContentValues(t), str, strArr);
            } catch (Exception unused) {
                getTableName();
                this.mWriteLock.unlock();
                return -1;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public T queryById(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c8b3e1f7aa2398337a5b91036feaa9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c8b3e1f7aa2398337a5b91036feaa9f");
        }
        List<T> queryByCase = queryByCase("_id=" + j, null, null);
        if (queryByCase == null || queryByCase.size() <= 0) {
            return null;
        }
        return queryByCase.get(0);
    }

    @SuppressLint({"UseValueOf"})
    @Deprecated
    public <V> V getValue(Cursor cursor, String str, Class<V> cls) {
        int columnIndex;
        Object[] objArr = {cursor, str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d7def268c72dbe63bc048abdcc9d8f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d7def268c72dbe63bc048abdcc9d8f8");
        }
        try {
            columnIndex = cursor.getColumnIndex(str);
        } catch (Exception unused) {
        }
        if (String.class.getName().equals(cls.getName())) {
            if (columnIndex >= 0) {
                return (V) cursor.getString(columnIndex);
            }
            return null;
        } else if (Integer.class.getName().equals(cls.getName())) {
            if (columnIndex >= 0) {
                return (V) new Integer(cursor.getInt(columnIndex));
            }
            return (V) 0;
        } else if (Long.class.getName().equals(cls.getName())) {
            if (columnIndex >= 0) {
                return (V) new Long(cursor.getLong(columnIndex));
            }
            return (V) 0L;
        } else if (Float.class.getName().equals(cls.getName())) {
            if (columnIndex >= 0) {
                return (V) new Float(cursor.getFloat(columnIndex));
            }
            return (V) Float.valueOf(0.0f);
        } else if (Double.class.getName().equals(cls.getName())) {
            if (columnIndex >= 0) {
                return (V) new Double(cursor.getDouble(columnIndex));
            }
            return (V) Float.valueOf(0.0f);
        } else {
            if (Date.class.getName().equals(cls.getName())) {
                if (columnIndex >= 0) {
                    return (V) new Date(cursor.getLong(columnIndex));
                }
                return (V) new Date(System.currentTimeMillis());
            }
            return null;
        }
    }

    public String getStringValue(Cursor cursor, String str, String str2) {
        int columnIndex;
        int type;
        Object[] objArr = {cursor, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f50efb2022887fd742dde1b8b4c3ed1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f50efb2022887fd742dde1b8b4c3ed1") : (cursor == null || (columnIndex = cursor.getColumnIndex(str)) < 0 || (type = cursor.getType(columnIndex)) == 0 || type != 3) ? str2 : cursor.getString(columnIndex);
    }

    public int getIntValue(Cursor cursor, String str, int i) {
        int columnIndex;
        int type;
        Object[] objArr = {cursor, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "802e02a206b4daee448632ac176e8033", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "802e02a206b4daee448632ac176e8033")).intValue() : (cursor == null || (columnIndex = cursor.getColumnIndex(str)) < 0 || (type = cursor.getType(columnIndex)) == 0 || type != 1) ? i : cursor.getInt(columnIndex);
    }

    public long getLongValue(Cursor cursor, String str, long j) {
        int columnIndex;
        int type;
        Object[] objArr = {cursor, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0c07ea0ba0cb4271eb080c157b3c4cc", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0c07ea0ba0cb4271eb080c157b3c4cc")).longValue() : (cursor == null || (columnIndex = cursor.getColumnIndex(str)) < 0 || (type = cursor.getType(columnIndex)) == 0 || type != 1) ? j : cursor.getLong(columnIndex);
    }

    public float getFloatValue(Cursor cursor, String str, float f) {
        int columnIndex;
        int type;
        Object[] objArr = {cursor, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9a8c4462dbd09c85c2fa71a4730e4d7", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9a8c4462dbd09c85c2fa71a4730e4d7")).floatValue() : (cursor == null || (columnIndex = cursor.getColumnIndex(str)) < 0 || (type = cursor.getType(columnIndex)) == 0 || type != 2) ? f : cursor.getFloat(columnIndex);
    }

    public double getDoubleValue(Cursor cursor, String str, double d) {
        int columnIndex;
        int type;
        Object[] objArr = {cursor, str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "843b855496f7f604e9ca456a8fe60244", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "843b855496f7f604e9ca456a8fe60244")).doubleValue() : (cursor == null || (columnIndex = cursor.getColumnIndex(str)) < 0 || (type = cursor.getType(columnIndex)) == 0 || type != 2) ? d : cursor.getDouble(columnIndex);
    }

    @Nullable
    public SQLiteDatabase getDatabase() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b8a4827efc2d0e8bf25f520dad2d8b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (SQLiteDatabase) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b8a4827efc2d0e8bf25f520dad2d8b7");
        }
        if (this.mSqLiteOpenHelper != null) {
            return this.mSqLiteOpenHelper.getWritableDatabase();
        }
        DataBaseHelper defaultDB = DataBaseManager.getDataBaseManager().getDefaultDB();
        if (defaultDB == null) {
            return null;
        }
        return defaultDB.getWritableDatabase();
    }

    public static Uri getNotifyUri(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "784568d5d21c8e06fa1c882dc0e48e31", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "784568d5d21c8e06fa1c882dc0e48e31");
        }
        return Uri.parse("content://com.knowbox.wb.provider.providers.update_" + str + "/" + str);
    }

    public void notifyDataChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "388e8c87e7e132d464ccaaecfea65c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "388e8c87e7e132d464ccaaecfea65c4a");
        } else {
            notifyChange(getNotifyUri(getTableName()));
        }
    }

    public void dropColumn(String str) {
        SQLiteDatabase database;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0997da4834c5fe77805a7f9deb158de3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0997da4834c5fe77805a7f9deb158de3");
            return;
        }
        String tableName = getTableName();
        this.mWriteLock.lock();
        try {
            try {
                database = getDatabase();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("drop column ");
                sb.append(str);
                sb.append(" from ");
                sb.append(tableName);
                sb.append(" failed: ");
                sb.append(e);
            }
            if (database == null) {
                return;
            }
            database.execSQL("ALTER TABLE " + tableName + " DROP COLUMN " + str + ";");
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void alterColumn(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Object[] objArr = {sQLiteDatabase, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b48d4d2119f55c425e5363ebfe34c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b48d4d2119f55c425e5363ebfe34c31");
            return;
        }
        this.mWriteLock.lock();
        try {
            sQLiteDatabase.execSQL("ALTER TABLE " + getTableName() + " ALTER COLUMN " + str + StringUtil.SPACE + str2 + ";");
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
    }

    public void addColumn(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Object[] objArr = {sQLiteDatabase, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9b7f6fa9de4912da037a560b7be97a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9b7f6fa9de4912da037a560b7be97a9");
            return;
        }
        String tableName = getTableName();
        this.mWriteLock.lock();
        try {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE " + tableName + " ADD COLUMN " + str + StringUtil.SPACE + str2);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("add column ");
                sb.append(str);
                sb.append(" to ");
                sb.append(tableName);
                sb.append(" failed: ");
                sb.append(e);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void execSQL(String str) {
        SQLiteDatabase database;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90166a302115ea690f8e49691d46b753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90166a302115ea690f8e49691d46b753");
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                database = getDatabase();
            } catch (Exception unused) {
                getTableName();
            }
            if (database == null) {
                return;
            }
            database.execSQL(str);
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void dropTable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f0a2490ff32f5ad87ceb78ba7f16bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f0a2490ff32f5ad87ceb78ba7f16bce");
            return;
        }
        execSQL("DROP TABLE " + getTableName() + ";");
    }
}
