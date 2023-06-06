package com.meituan.android.common.aidata.cache.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.cache.result.OpResult;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.cache.result.ResultSet;
import com.meituan.android.common.aidata.data.EventBean;
import com.meituan.android.common.aidata.data.MVTimeStampEvent;
import com.meituan.android.common.aidata.database.BaseTable;
import com.meituan.android.common.aidata.database.DBLocks;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.utils.GsonProvider;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EventTableV2 extends BaseTable<EventBean> implements ITableInterfaceV2 {
    private static final String TAG = "EventTableV2";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.database.BaseTable
    public ContentValues getContentValues(EventBean eventBean) {
        return null;
    }

    @Override // com.meituan.android.common.aidata.database.BaseTable
    public String getCreateSql() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.android.common.aidata.database.BaseTable
    public EventBean getItemFromCursor(Cursor cursor) {
        return null;
    }

    public EventTableV2(SQLiteOpenHelper sQLiteOpenHelper) {
        super("BaseTable", sQLiteOpenHelper, DBLocks.AIDATA_DB_RW_LOCK);
        Object[] objArr = {sQLiteOpenHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf9bb9b4972c87ce5f7b155bf47067d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf9bb9b4972c87ce5f7b155bf47067d9");
        }
    }

    @Override // com.meituan.android.common.aidata.database.BaseTable, com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "814a9e6f432dbcbf9ecd77ec168eab00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "814a9e6f432dbcbf9ecd77ec168eab00");
            return;
        }
        String tableName = getTableName();
        StringBuilder sb = new StringBuilder("database upgrade old version: ");
        sb.append(i);
        sb.append(" to newVersion: ");
        sb.append(i2);
        switch (i) {
            case 2:
                try {
                    sQLiteDatabase.execSQL("drop trigger trigger_pv_duration");
                } catch (Throwable th) {
                    th.getStackTrace();
                    CatMonitorManager.getInstance().reportDbUpgrade("del_trigger", i, i2, th.getMessage());
                }
            case 1:
                try {
                    sQLiteDatabase.execSQL("alter table " + tableName + " add COLUMN mge_type text");
                    sQLiteDatabase.execSQL("alter table " + tableName + " add COLUMN element_id text");
                    sQLiteDatabase.execSQL("alter table " + tableName + " add COLUMN val_act text");
                } catch (Throwable th2) {
                    th2.getStackTrace();
                    CatMonitorManager.getInstance().reportDbUpgrade("add_column", i, i2, th2.getMessage());
                }
                try {
                    sQLiteDatabase.execSQL("create trigger if not exists trigger_pv_duration  after insert on " + tableName + " when new.nm = 'PD' and new.duration > 0 begin update or ignore " + tableName + " set duration=new.duration where nm in ('PV','mpt') and category = new.category and msid=new.msid and req_id = new.req_id and app_launch_id = new.app_launch_id; end;");
                    break;
                } catch (Throwable th3) {
                    th3.getStackTrace();
                    CatMonitorManager.getInstance().reportDbUpgrade("add_trigger", i, i2, th3.getMessage());
                    break;
                }
        }
        if (i < 4) {
            addColumn(sQLiteDatabase, "mreq_id", "text");
            addColumn(sQLiteDatabase, "mduration_list", "text");
            addColumn(sQLiteDatabase, "mduration_total", DataConstants.TYPE.INTEGER);
            addColumn(sQLiteDatabase, "mduration_cnt", DataConstants.TYPE.INTEGER);
        }
        if (i < 5) {
            addColumn(sQLiteDatabase, "val_lab_flatten", "text");
        }
        if (i < 6) {
            addColumn(sQLiteDatabase, DataConstants.TAG_FLATTEN, "text");
        }
        if (i < 8) {
            addColumn(sQLiteDatabase, DataConstants.RTT_ENV, "text");
        }
        if (i < 9) {
            addColumn(sQLiteDatabase, DataConstants.LAST_MV_TM, DataConstants.TYPE.INTEGER);
        }
        if (i < 10) {
            addColumn(sQLiteDatabase, "mduration_gaplist", "text");
            addColumn(sQLiteDatabase, DataConstants.LAST_MD_TM, DataConstants.TYPE.INTEGER);
        }
        if (i < 11) {
            addColumn(sQLiteDatabase, "scale", "text");
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e85fe1f5ae034dcef555584f23625118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e85fe1f5ae034dcef555584f23625118");
            return;
        }
        StringBuilder sb = new StringBuilder("EventTableV2--- EventTable onDowngrade oldVersion:");
        sb.append(i);
        sb.append(" newVersion:");
        sb.append(i2);
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public OpResult writeEvent(EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7337c130dcc56145671b800f818c638c", RobustBitConfig.DEFAULT_VALUE)) {
            return (OpResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7337c130dcc56145671b800f818c638c");
        }
        StringBuilder sb = new StringBuilder("EventTableV2--- writeEvent(SQLiteDatabase db, EventBean event) entry begin for nm=");
        sb.append(eventBean.nm);
        sb.append(", mreq_id=");
        sb.append(eventBean.mreq_id);
        sb.append(", tm=");
        sb.append(eventBean.tm);
        ContentValues convert2ContentValues = convert2ContentValues(eventBean);
        eventBean.transform_end_tm = System.currentTimeMillis();
        if (convert2ContentValues == null) {
            return new OpResult(-1, "covert db value is null");
        }
        String tableName = getTableName();
        this.mWriteLock.lock();
        try {
            SQLiteDatabase database = getDatabase();
            if (database == null) {
                return new OpResult(-1, "event or db is null");
            }
            database.insert(tableName, null, convert2ContentValues);
            this.mWriteLock.unlock();
            return new OpResult(1, "");
        } catch (Throwable th) {
            try {
                return new OpResult(-1, th.getMessage());
            } finally {
                this.mWriteLock.unlock();
            }
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public void writeEvent(List<EventBean> list) {
        SQLiteDatabase sQLiteDatabase;
        StringBuilder sb;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ed562f38b10068ce35a2b7e4be84a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ed562f38b10068ce35a2b7e4be84a80");
            return;
        }
        this.mWriteLock.lock();
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            try {
                sQLiteDatabase = getDatabase();
            } catch (Exception e) {
                e = e;
            }
            if (sQLiteDatabase == null || list == null) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e2) {
                        new StringBuilder(" - removeEvent: endTransaction error ").append(e2.getMessage());
                    }
                }
                this.mWriteLock.unlock();
                return;
            }
            try {
                sQLiteDatabase.beginTransaction();
                String tableName = getTableName();
                for (EventBean eventBean : list) {
                    sQLiteDatabase.insert(tableName, null, convert2ContentValues(eventBean));
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder(" - removeEvent: endTransaction error ");
                        sb.append(e.getMessage());
                        this.mWriteLock.unlock();
                    }
                }
            } catch (Exception e4) {
                e = e4;
                sQLiteDatabase2 = sQLiteDatabase;
                new StringBuilder(" - removeEvent: delete error ").append(e.getMessage());
                if (sQLiteDatabase2 != null) {
                    try {
                        sQLiteDatabase2.endTransaction();
                    } catch (Exception e5) {
                        e = e5;
                        sb = new StringBuilder(" - removeEvent: endTransaction error ");
                        sb.append(e.getMessage());
                        this.mWriteLock.unlock();
                    }
                }
                this.mWriteLock.unlock();
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e6) {
                        new StringBuilder(" - removeEvent: endTransaction error ").append(e6.getMessage());
                    }
                }
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabase2;
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public boolean removeEvent(EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63c69c1acff2d15bccfecb47b4798feb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63c69c1acff2d15bccfecb47b4798feb")).booleanValue();
        }
        this.mWriteLock.lock();
        try {
            SQLiteDatabase database = getDatabase();
            if (database != null && eventBean != null) {
                return database.delete(getTableName(), "_id = ?", new String[]{String.valueOf(eventBean.getId())}) >= 0;
            }
            return false;
        } catch (Exception e) {
            new StringBuilder(" - removeEvent: delete error ").append(e.getMessage());
            return false;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public boolean removeEvent(List<EventBean> list) {
        SQLiteDatabase sQLiteDatabase;
        StringBuilder sb;
        StringBuilder sb2;
        boolean z = false;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbffe6175d13d0df44262689ac087f2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbffe6175d13d0df44262689ac087f2c")).booleanValue();
        }
        this.mWriteLock.lock();
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            try {
                sQLiteDatabase = getDatabase();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabase2;
            }
        } catch (Exception e) {
            e = e;
        }
        if (sQLiteDatabase != null && list != null) {
            try {
            } catch (Exception e2) {
                e = e2;
                sQLiteDatabase2 = sQLiteDatabase;
                new StringBuilder(" - removeEvent: delete error ").append(e.getMessage());
                sQLiteDatabase2 = sQLiteDatabase2;
                if (sQLiteDatabase2 != null) {
                    try {
                        sQLiteDatabase2.endTransaction();
                        sQLiteDatabase2 = sQLiteDatabase2;
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder(" - removeEvent: endTransaction error ");
                        sb.append(e.getMessage());
                        this.mWriteLock.unlock();
                        return z;
                    }
                }
                this.mWriteLock.unlock();
                return z;
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e4) {
                        new StringBuilder(" - removeEvent: endTransaction error ").append(e4.getMessage());
                    }
                }
                this.mWriteLock.unlock();
                throw th;
            }
            if (list.size() != 0) {
                sQLiteDatabase.beginTransaction();
                int size = list.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = String.valueOf(list.get(i).getId());
                }
                if (size != 1) {
                    sb2 = new StringBuilder(" _id in (");
                    while (true) {
                        if (size <= 0) {
                            break;
                        }
                        sb2.append(CommonConstant.Symbol.QUESTION_MARK);
                        size--;
                        if (size == 0) {
                            sb2.append(" ) ");
                            break;
                        }
                        sb2.append(CommonConstant.Symbol.COMMA);
                    }
                } else {
                    sb2 = new StringBuilder(" _id = ? ");
                }
                String tableName = getTableName();
                sQLiteDatabase.delete(tableName, sb2.toString(), strArr);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e5) {
                        e = e5;
                        sb = new StringBuilder(" - removeEvent: endTransaction error ");
                        sb.append(e.getMessage());
                        this.mWriteLock.unlock();
                        return z;
                    }
                }
                z = true;
                sQLiteDatabase2 = tableName;
                this.mWriteLock.unlock();
                return z;
            }
        }
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Exception e6) {
                new StringBuilder(" - removeEvent: endTransaction error ").append(e6.getMessage());
            }
        }
        this.mWriteLock.unlock();
        return false;
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public boolean removeEventById(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58910a2acea2facaeaab423f64d38abe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58910a2acea2facaeaab423f64d38abe")).booleanValue();
        }
        this.mWriteLock.lock();
        try {
            try {
                SQLiteDatabase database = getDatabase();
                if (database == null) {
                    return false;
                }
                database.delete(getTableName(), "_id = ?", new String[]{String.valueOf(l)});
                return true;
            } catch (Exception e) {
                new StringBuilder(" - removeEvent: delete error ").append(e.getMessage());
                this.mWriteLock.unlock();
                return false;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public boolean removeEventById(List<Long> list) {
        SQLiteDatabase sQLiteDatabase;
        StringBuilder sb;
        boolean z = false;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "547d9456cf7bf234a891d574fdf18312", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "547d9456cf7bf234a891d574fdf18312")).booleanValue();
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        this.mWriteLock.lock();
        try {
            try {
                sQLiteDatabase = getDatabase();
            } catch (Exception e) {
                e = e;
            }
            if (sQLiteDatabase == null || list == null) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e2) {
                        new StringBuilder(" - removeEvent: endTransaction error ").append(e2.getMessage());
                    }
                }
                this.mWriteLock.unlock();
                return false;
            }
            try {
                sQLiteDatabase.beginTransaction();
                String tableName = getTableName();
                for (int i = 0; i < list.size(); i++) {
                    sQLiteDatabase.delete(tableName, "_id = ?", new String[]{String.valueOf(list.get(i))});
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder(" - removeEvent: endTransaction error ");
                        sb.append(e.getMessage());
                        this.mWriteLock.unlock();
                        return z;
                    }
                }
                z = true;
            } catch (Exception e4) {
                e = e4;
                sQLiteDatabase2 = sQLiteDatabase;
                new StringBuilder(" - removeEvent: delete error ").append(e.getMessage());
                if (sQLiteDatabase2 != null) {
                    try {
                        sQLiteDatabase2.endTransaction();
                    } catch (Exception e5) {
                        e = e5;
                        sb = new StringBuilder(" - removeEvent: endTransaction error ");
                        sb.append(e.getMessage());
                        this.mWriteLock.unlock();
                        return z;
                    }
                }
                this.mWriteLock.unlock();
                return z;
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e6) {
                        new StringBuilder(" - removeEvent: endTransaction error ").append(e6.getMessage());
                    }
                }
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
            return z;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabase2;
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c78afab2749d5661bcb2e23712148e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c78afab2749d5661bcb2e23712148e3")).intValue();
        }
        this.mReadLock.lock();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase database = getDatabase();
                if (database == null) {
                    this.mReadLock.unlock();
                    return -1;
                }
                Cursor rawQuery = database.rawQuery("SELECT COUNT(0) FROM " + getTableName(), null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() != 0) {
                            rawQuery.moveToFirst();
                            int i = rawQuery.getInt(0);
                            if (rawQuery != null && !rawQuery.isClosed()) {
                                rawQuery.close();
                            }
                            this.mReadLock.unlock();
                            return i;
                        }
                    } catch (Exception e) {
                        e = e;
                        cursor = rawQuery;
                        new StringBuilder(" - getEvent:").append(e.getMessage());
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        this.mReadLock.unlock();
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        this.mReadLock.unlock();
                        throw th;
                    }
                }
                if (rawQuery != null && !rawQuery.isClosed()) {
                    rawQuery.close();
                }
                this.mReadLock.unlock();
                return 0;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public int getCount(long j) {
        SQLiteDatabase database;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2db2f35779440c9a51e9f2bfc826558c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2db2f35779440c9a51e9f2bfc826558c")).intValue();
        }
        Cursor cursor = null;
        this.mReadLock.lock();
        try {
            try {
                database = getDatabase();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        if (database == null) {
            this.mReadLock.unlock();
            return -1;
        }
        Cursor rawQuery = database.rawQuery("SELECT COUNT(0) FROM " + getTableName() + " where tm < ?", new String[]{String.valueOf(j)});
        if (rawQuery != null) {
            try {
                if (rawQuery.getCount() != 0) {
                    rawQuery.moveToFirst();
                    int i = rawQuery.getInt(0);
                    if (rawQuery != null && !rawQuery.isClosed()) {
                        rawQuery.close();
                    }
                    this.mReadLock.unlock();
                    return i;
                }
            } catch (Exception e2) {
                e = e2;
                cursor = rawQuery;
                new StringBuilder(" - getEvent:").append(e.getMessage());
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                this.mReadLock.unlock();
                return 0;
            } catch (Throwable th2) {
                th = th2;
                cursor = rawQuery;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                this.mReadLock.unlock();
                throw th;
            }
        }
        if (rawQuery != null && !rawQuery.isClosed()) {
            rawQuery.close();
        }
        this.mReadLock.unlock();
        return 0;
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public List<ResultRow> queryEvent(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        Object[] objArr = {strArr, str, strArr2, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70a0ed93456fee032ac3cda18b09744f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70a0ed93456fee032ac3cda18b09744f");
        }
        ResultSet resultSet = new ResultSet();
        this.mReadLock.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase database = getDatabase();
            if (database != null) {
                Cursor query = database.query(getTableName(), strArr, str, strArr2, str2, str3, str4, String.valueOf(str5));
                if (query != null) {
                    try {
                        if (query.getCount() != 0) {
                            resultSet.addRows(query);
                            List<ResultRow> resultList = resultSet.getResultList();
                            if (query != null && !query.isClosed()) {
                                query.close();
                            }
                            this.mReadLock.unlock();
                            return resultList;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        try {
                            new StringBuilder(" - getEvent:").append(th.getMessage());
                            return resultSet.getResultList();
                        } finally {
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            this.mReadLock.unlock();
                        }
                    }
                }
                if (query != null && !query.isClosed()) {
                    query.close();
                }
            }
            this.mReadLock.unlock();
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public List<ResultRow> queryEvent(String str, String[] strArr, String str2, boolean z) {
        Object[] objArr = {str, strArr, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed266c225a2f32ab14027943f5172d3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed266c225a2f32ab14027943f5172d3b");
        }
        ResultSet resultSet = new ResultSet();
        this.mReadLock.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase database = getDatabase();
            if (database != null) {
                Cursor rawQuery = database.rawQuery(str, strArr);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() != 0) {
                            resultSet.addRows(rawQuery);
                            List<ResultRow> resultList = resultSet.getResultList();
                            if (rawQuery != null && !rawQuery.isClosed()) {
                                rawQuery.close();
                            }
                            this.mReadLock.unlock();
                            return resultList;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        try {
                            new StringBuilder(" - getEvent:").append(th.getMessage());
                            CatMonitorManager.getInstance().reportDbQueryFailData("", "", "", "", "", "", "", str, true, th.getMessage(), "0.0.9.77", str2);
                            return resultSet.getResultList();
                        } finally {
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            this.mReadLock.unlock();
                        }
                    }
                }
                CatMonitorManager.getInstance().reportDbQueryFailData("", "", "", "", "", "", "", str, true, "db auth fail : result is null", "0.0.9.77", str2);
                if (rawQuery != null && !rawQuery.isClosed()) {
                    rawQuery.close();
                }
            }
            this.mReadLock.unlock();
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public OpResult deletePostData(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dfbeff38175325f53d10bdfaa0ee7a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (OpResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dfbeff38175325f53d10bdfaa0ee7a3");
        }
        if (j <= 0) {
            return new OpResult(-1, "delete postTime is negative");
        }
        this.mWriteLock.lock();
        try {
            SQLiteDatabase database = getDatabase();
            if (database == null) {
                return new OpResult(-1, "db open failed");
            }
            database.execSQL("DELETE FROM " + getTableName() + " WHERE tm <= " + String.valueOf(j));
            this.mWriteLock.unlock();
            return new OpResult(1, "success");
        } catch (Throwable th) {
            try {
                return new OpResult(-1, th.getMessage());
            } finally {
                this.mWriteLock.unlock();
            }
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7451c7cf9efe569104438714db1ce6ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7451c7cf9efe569104438714db1ce6ef");
            return;
        }
        String tableName = getTableName();
        try {
            sQLiteDatabase.execSQL("create table if not exists " + tableName + "(_id integer primary key autoincrement,date text,tm integer,uid integer,city_id integer,locate_city_id integer,lat real,lng real,sc text,ua text,net text, msid text,lch text,local_source text,ps text,apn text,mno text,wifi text,bht text, login_type text,push_id text,sdk_ver text,utm_source text,utm_medium text,utm_campaign text,utm_content text,utm_term text,category text,nm text,cid text,refer_cid text,req_id text,refer_req_id text,duration integer,bid text,nt integer,seq integer,is_auto integer, tag text,val_lab text,query_id text, sort_id text, keyword text,dealgroup_id integer,category_id text,poi_id text,ad_id integer,order_id text,title text,biz_id text,stid text,ct_poi text,abtest text,coupon_id text,sku_id text,deal_id  text,movie_id text,goods_id text,maiton_id text,promotion_id text,trace_id text,cinema_id text,select_id text,search_id text,cat_id text,item_index text,shopuuid text,activityid text,region_id text,val_lab_custom text,pageinfoKey text,url text, web_sdk_ver text,is_local integer,serial_seq integer,stm integer,mt_aurl text,app_launch_id text,app text,os text,bssid text,ext text,mge_type text,element_id text,val_act text,mreq_id text,mduration_list text,mduration_total integer,mduration_cnt integer,mduration_gaplist text,val_lab_flatten text,tag_flatten text,last_mv_tm integer,last_md_tm integer,scale text,rtt_env text" + CommonConstant.Symbol.BRACKET_RIGHT);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("create table ");
            sb.append(tableName);
            sb.append(" failed: ");
            sb.append(e);
        }
        try {
            sQLiteDatabase.execSQL("create index if not exists tm_index on " + tableName + "(tm desc)");
            sQLiteDatabase.execSQL("create index if not exists session_index on " + tableName + "(msid" + CommonConstant.Symbol.BRACKET_RIGHT);
        } catch (Throwable th) {
            new StringBuilder("create table index failed: ").append(th);
        }
        try {
            sQLiteDatabase.execSQL("create trigger if not exists trigger_pv_duration  after insert on " + tableName + " when new.nm = 'PD' and new.duration > 0 begin update or ignore " + tableName + " set duration=new.duration where nm in ('PV','mpt') and category = new.category and msid=new.msid and req_id = new.req_id and app_launch_id = new.app_launch_id; end;");
        } catch (Throwable th2) {
            new StringBuilder("create trigger failed: ").append(th2);
        }
    }

    @Override // com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public void clearTable() {
        SQLiteDatabase database;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a07f4224157df6f7fe73b8ee33c485b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a07f4224157df6f7fe73b8ee33c485b0");
            return;
        }
        this.mWriteLock.lock();
        try {
            database = getDatabase();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        if (database != null) {
            database.execSQL("DELETE FROM " + getTableName());
            this.mWriteLock.unlock();
            return;
        }
        this.mWriteLock.unlock();
    }

    @Override // com.meituan.android.common.aidata.database.BaseTable
    public void dropTable() {
        SQLiteDatabase database;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ee69eee826e336ba1b8b6514477c69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ee69eee826e336ba1b8b6514477c69");
            return;
        }
        this.mWriteLock.lock();
        try {
            database = getDatabase();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        if (database != null) {
            database.execSQL("DROP TABLE IF EXISTS " + getTableName());
            this.mWriteLock.unlock();
            return;
        }
        this.mWriteLock.unlock();
    }

    private ContentValues convert2ContentValues(EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91ede3017f2819b4504e1922a470589a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91ede3017f2819b4504e1922a470589a");
        }
        if (eventBean != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("date", eventBean.date);
                contentValues.put("tm", Long.valueOf(eventBean.tm));
                contentValues.put("uid", Long.valueOf(eventBean.uid));
                contentValues.put(DataConstants.CITY_ID, Long.valueOf(eventBean.cityId));
                contentValues.put("locate_city_id", Long.valueOf(eventBean.locateCityId));
                contentValues.put("lat", Double.valueOf(eventBean.lat));
                contentValues.put("lng", Double.valueOf(eventBean.lng));
                contentValues.put(Constants.Environment.KEY_SC, eventBean.sc);
                contentValues.put("ua", eventBean.ua);
                contentValues.put("net", eventBean.net);
                contentValues.put("msid", eventBean.msid);
                contentValues.put("lch", eventBean.lch);
                contentValues.put(Constants.Environment.KEY_LOCAL_SOURCE, eventBean.local_source);
                contentValues.put("ps", eventBean.ps);
                contentValues.put(Constants.Environment.KEY_APN, eventBean.apn);
                contentValues.put(Constants.Environment.KEY_MNO, eventBean.mno);
                contentValues.put("wifi", eventBean.wifi);
                contentValues.put("bht", eventBean.bht);
                contentValues.put(DataConstants.LOGIN_TYPE, eventBean.loginType);
                contentValues.put(DataConstants.PUSH_ID, eventBean.pushId);
                contentValues.put("sdk_ver", eventBean.sdk_ver);
                contentValues.put("utm_source", eventBean.utmSource);
                contentValues.put("utm_medium", eventBean.utmMedium);
                contentValues.put("utm_campaign", eventBean.utmCampaign);
                contentValues.put("utm_content", eventBean.utmContent);
                contentValues.put("utm_term", eventBean.utmTerm);
                contentValues.put("category", eventBean.category);
                contentValues.put("nm", eventBean.nm);
                contentValues.put("cid", eventBean.cid);
                contentValues.put(DataConstants.REFER_CID, eventBean.referCid);
                contentValues.put(Constants.EventInfoConsts.KEY_REQ_ID, eventBean.req_id);
                contentValues.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, eventBean.refer_req_id);
                long j = eventBean.pageDuration;
                if (j >= 0) {
                    contentValues.put("duration", Long.valueOf(j));
                }
                contentValues.put("bid", eventBean.bid);
                contentValues.put("nt", Integer.valueOf(eventBean.nt));
                contentValues.put("seq", Long.valueOf(eventBean.seq));
                contentValues.put(DataConstants.IS_AUTO, Integer.valueOf(eventBean.isAuto));
                contentValues.put("tag", eventBean.tag);
                contentValues.put("val_lab", eventBean.valLab);
                contentValues.put("query_id", eventBean.queryId);
                contentValues.put("sort_id", eventBean.sortId);
                contentValues.put("keyword", eventBean.keyword);
                contentValues.put("dealgroup_id", Long.valueOf(eventBean.dealgroupId));
                contentValues.put(DataConstants.CATEGORY_ID, eventBean.categoryId);
                contentValues.put("poi_id", eventBean.poiId);
                contentValues.put("ad_id", Long.valueOf(eventBean.adId));
                contentValues.put("order_id", eventBean.orderId);
                contentValues.put("title", eventBean.title);
                contentValues.put("biz_id", eventBean.bizId);
                contentValues.put("stid", eventBean.stid);
                contentValues.put("ct_poi", eventBean.ct_poi);
                contentValues.put("abtest", eventBean.abtest);
                contentValues.put("coupon_id", eventBean.couponId);
                contentValues.put("sku_id", eventBean.skuId);
                contentValues.put("deal_id", eventBean.dealId);
                contentValues.put("movie_id", eventBean.movieId);
                contentValues.put("goods_id", eventBean.goodsId);
                contentValues.put("maiton_id", eventBean.maitonId);
                contentValues.put(DataConstants.PROMOTION_ID, eventBean.promotionId);
                contentValues.put("trace_id", eventBean.traceId);
                contentValues.put("cinema_id", eventBean.cinemaId);
                contentValues.put("select_id", eventBean.selectId);
                contentValues.put("search_id", eventBean.searchId);
                contentValues.put("cat_id", eventBean.catId);
                if (eventBean.index != -1) {
                    contentValues.put(DataConstants.INDEX, Long.valueOf(eventBean.index));
                }
                contentValues.put(DataConstants.SHOPUUID, eventBean.shopUuid);
                contentValues.put(DataConstants.ACTIVITYID, eventBean.activityid);
                contentValues.put("region_id", eventBean.regionId);
                contentValues.put(DataConstants.VAL_LAB_CUSTOM, eventBean.custom);
                contentValues.put("pageinfoKey", eventBean.pageinfoKey);
                contentValues.put("url", eventBean.url);
                contentValues.put("web_sdk_ver", eventBean.web_sdk_ver);
                contentValues.put("is_local", Integer.valueOf(eventBean.isLocal));
                contentValues.put("serial_seq", Long.valueOf(eventBean.lseq));
                contentValues.put("stm", Long.valueOf(eventBean.stm));
                contentValues.put("mt_aurl", eventBean.mt_aurl);
                contentValues.put("app_launch_id", eventBean.appLaunchId);
                contentValues.put("app", eventBean.app);
                contentValues.put("os", eventBean.os);
                contentValues.put(Constants.Environment.KEY_BSSID, eventBean.bssid);
                contentValues.put("ext", eventBean.ext);
                contentValues.put("mge_type", eventBean.mge_type);
                contentValues.put("element_id", eventBean.element_id);
                contentValues.put("val_act", eventBean.val_act);
                contentValues.put("mreq_id", eventBean.mreq_id);
                contentValues.put("val_lab_flatten", eventBean.valLabFlatten);
                contentValues.put(DataConstants.TAG_FLATTEN, eventBean.tagFlatten);
                contentValues.put(DataConstants.RTT_ENV, eventBean.rttEnvFlatten);
                contentValues.put("scale", eventBean.scale);
                return contentValues;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public String getSqliteVersion(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery;
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d82e501f06aec6d0ab39c78d60ad32a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d82e501f06aec6d0ab39c78d60ad32a9");
        }
        if (sQLiteDatabase == null) {
            return "";
        }
        String str = "";
        while (sQLiteDatabase.rawQuery("select sqlite_version() AS sqlite_version", null).moveToNext()) {
            str = str + rawQuery.getString(0);
        }
        return str;
    }

    public OpResult updateExposeEvent(@NonNull EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "989919865ce4737dfcf3fb2bd562707b", RobustBitConfig.DEFAULT_VALUE)) {
            return (OpResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "989919865ce4737dfcf3fb2bd562707b");
        }
        StringBuilder sb = new StringBuilder("--- updateExposeEvent begin for mreq_id=");
        sb.append(eventBean.mreq_id);
        sb.append(", tm=");
        sb.append(eventBean.tm);
        if (!TextUtils.isEmpty(eventBean.mreq_id)) {
            ContentValues contentValues = new ContentValues();
            String str = null;
            if (eventBean.mduration_list != null && eventBean.mduration_list.size() > 0 && (str = new JSONArray((Collection) eventBean.mduration_list).toString()) != null) {
                str = str.replace(StringUtil.SPACE, "");
            }
            contentValues.put("mduration_list", str);
            contentValues.put("mduration_total", Long.valueOf(eventBean.mduration_total));
            contentValues.put("mduration_cnt", Integer.valueOf(eventBean.mduration_cnt));
            contentValues.putNull(DataConstants.LAST_MV_TM);
            contentValues.put(DataConstants.LAST_MD_TM, Long.valueOf(eventBean.tm));
            this.mWriteLock.lock();
            try {
                SQLiteDatabase database = getDatabase();
                if (database == null) {
                    return new OpResult(-1, "event or db is null");
                }
                database.update(getTableName(), contentValues, "mreq_id=?", new String[]{eventBean.mreq_id});
                this.mWriteLock.unlock();
                return new OpResult(1, "");
            } catch (Throwable th) {
                try {
                    return new OpResult(-1, th.getMessage());
                } finally {
                    this.mWriteLock.unlock();
                }
            }
        }
        return new OpResult(-1, "mreq_id is empty");
    }

    @NonNull
    public OpResult updateMVTimeStampEvent(@NonNull MVTimeStampEvent mVTimeStampEvent) {
        Object[] objArr = {mVTimeStampEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64ad6e8633cdfef97db4c4b4ccd608ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (OpResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64ad6e8633cdfef97db4c4b4ccd608ad");
        }
        new StringBuilder("start updateMVTimeStampEvent: \n ").append(GsonProvider.getInstance().toJson(mVTimeStampEvent));
        String str = mVTimeStampEvent.mreq_id;
        long j = mVTimeStampEvent.current_tm;
        if (TextUtils.isEmpty(str) || j <= 0) {
            return new OpResult(-1, "event not valid");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataConstants.LAST_MV_TM, Long.valueOf(j));
        contentValues.put("mduration_gaplist", mVTimeStampEvent.mduration_gaplist);
        this.mWriteLock.lock();
        try {
            SQLiteDatabase database = getDatabase();
            if (database == null) {
                return new OpResult(-1, "db is null");
            }
            database.update(getTableName(), contentValues, "mreq_id=?", new String[]{str});
            this.mWriteLock.unlock();
            return new OpResult(1, "");
        } catch (Exception e) {
            return new OpResult(-1, e.getMessage());
        } finally {
            this.mWriteLock.unlock();
        }
    }

    @Override // com.meituan.android.common.aidata.database.BaseTable
    public int updateByCase(EventBean eventBean, String str, String[] strArr) {
        Object[] objArr = {eventBean, str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a97763766029bd27ffaa8a4f79ae27c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a97763766029bd27ffaa8a4f79ae27c")).intValue();
        }
        this.mWriteLock.lock();
        try {
            try {
                SQLiteDatabase database = getDatabase();
                if (database == null) {
                    return -1;
                }
                return database.update(getTableName(), convert2ContentValues(eventBean), str, strArr);
            } catch (Exception unused) {
                getTableName();
                this.mWriteLock.unlock();
                return -1;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }
}
