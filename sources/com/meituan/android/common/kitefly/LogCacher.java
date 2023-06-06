package com.meituan.android.common.kitefly;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.IOUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogCacher {
    private static final int COUNT = 1000;
    private static final String TAG = "logCacher";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ILogger cacherLogger;
    private final String dbName;
    private SQLHelper helper;
    private final Gson logGson;
    private final CatchException mCacherException;
    private final Context mContext;
    private volatile AtomicInteger mDBCount;
    private final AtomicInteger mDBErrorNum;
    private volatile boolean sReadOnlyException;
    private final String tableName;

    public LogCacher(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fb608fb6c2dc167b7a019bd2ff731c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fb608fb6c2dc167b7a019bd2ff731c4");
            return;
        }
        this.sReadOnlyException = false;
        this.logGson = new Gson();
        this.mDBErrorNum = new AtomicInteger(0);
        this.mContext = context;
        this.dbName = str;
        this.tableName = str2;
        this.helper = new SQLHelper(context, str, str2);
        this.mCacherException = new CatchException(TAG, 3, MetricsAnrManager.ANR_THRESHOLD);
        this.cacherLogger = Logger.getBabelLogger();
        this.cacherLogger.d(TAG, "Init LogCacher with", str);
    }

    private void reOpenDb() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d21b0e1dc2a44d68c8150a2ea49cf586", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d21b0e1dc2a44d68c8150a2ea49cf586");
        } else if (this.sReadOnlyException) {
            synchronized (SQLHelper.class) {
                if (this.sReadOnlyException) {
                    if (this.helper.mDB != null) {
                        try {
                            this.helper.mDB.close();
                        } catch (Throwable unused) {
                        }
                    }
                    this.helper = new SQLHelper(this.mContext, this.dbName, this.tableName);
                    this.sReadOnlyException = false;
                }
            }
        }
    }

    private void checkSQLiteException(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "946536924ca468b1929a30c32986c0c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "946536924ca468b1929a30c32986c0c8");
            return;
        }
        if (th instanceof SQLiteReadOnlyDatabaseException) {
            this.sReadOnlyException = true;
        }
        if (!(th instanceof SQLiteException) || this.mDBErrorNum.get() >= 5) {
            return;
        }
        SLACounter.getInstance().incrementDBError(1);
        this.mDBErrorNum.addAndGet(1);
    }

    @NonNull
    @SuppressLint({"Range"})
    public LinkedList<Log> queryLogs() {
        Throwable th;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2f3c6193f1618bb6a806538302f3117", 6917529027641081856L)) {
            return (LinkedList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2f3c6193f1618bb6a806538302f3117");
        }
        Cursor cursor = null;
        LinkedList<Log> linkedList = new LinkedList<>();
        try {
            reOpenDb();
            Cursor cursor2 = this.helper.mDB.getReadableDatabase().query(this.tableName, new String[]{"id", "uploaded", SnifferDBHelper.COLUMN_LOG, "tags", "type", "tags", "type", "category", "ts", "status", "token", "_value", "env", "details", "raw", "is_main_thread", "loguuid", CrashHianalyticsData.THREAD_ID, "thread_name", "inner_property"}, null, null, null, null, null, "1000");
            if (cursor2 != null) {
                try {
                    if (cursor2.moveToFirst()) {
                        do {
                            Log build = new Log.Builder().build();
                            try {
                                build.innerProperty = (Log.InnerProperty) this.logGson.fromJson(cursor2.getString(cursor2.getColumnIndex("inner_property")), new TypeToken<Log.InnerProperty>() { // from class: com.meituan.android.common.kitefly.LogCacher.1
                                    public static ChangeQuickRedirect changeQuickRedirect;
                                }.getType());
                            } catch (Exception unused) {
                                build.innerProperty = new Log.InnerProperty();
                            } catch (Throwable th2) {
                                th = th2;
                                IOUtils.close(cursor2);
                                throw th;
                            }
                            build.innerProperty.dbId = cursor2.getString(cursor2.getColumnIndex("id"));
                            build.log = cursor2.getString(cursor2.getColumnIndex(SnifferDBHelper.COLUMN_LOG));
                            build.option = convertStr2Map(cursor2.getString(cursor2.getColumnIndex("tags")));
                            build.tag = cursor2.getString(cursor2.getColumnIndex("type"));
                            build.reportChannel = cursor2.getString(cursor2.getColumnIndex("category"));
                            build.ts = cursor2.getLong(cursor2.getColumnIndex("ts"));
                            build.status = cursor2.getInt(cursor2.getColumnIndex("status"));
                            build.token = cursor2.getString(cursor2.getColumnIndex("token"));
                            String string = cursor2.getString(cursor2.getColumnIndex("_value"));
                            if (!TextUtils.isEmpty(string) && !"nil".equals(string)) {
                                build.value = Double.valueOf(string);
                            }
                            build.envMaps = convertStr2Map(cursor2.getString(cursor2.getColumnIndex("env")));
                            build.details = cursor2.getString(cursor2.getColumnIndex("details"));
                            build.raw = cursor2.getString(cursor2.getColumnIndex("raw"));
                            build.isMainThread = cursor2.getInt(cursor2.getColumnIndex("is_main_thread")) == 1;
                            build.logUUId = cursor2.getString(cursor2.getColumnIndex("loguuid"));
                            build.threadId = cursor2.getString(cursor2.getColumnIndex(CrashHianalyticsData.THREAD_ID));
                            build.threadName = cursor2.getString(cursor2.getColumnIndex("thread_name"));
                            build.logSource = 0;
                            linkedList.add(build);
                        } while (cursor2.moveToNext());
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursor2;
                    try {
                        checkSQLiteException(th);
                        this.cacherLogger.e("cacher queryLogs", th);
                        this.mCacherException.reportException(th);
                        IOUtils.close(cursor);
                        return linkedList;
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursor;
                        IOUtils.close(cursor2);
                        throw th;
                    }
                }
            }
            this.cacherLogger.d(TAG, "Query Logs from db:", this.dbName, "Log size:", Integer.valueOf(linkedList.size()));
            IOUtils.close(cursor2);
        } catch (Throwable th5) {
            th = th5;
        }
        return linkedList;
    }

    private ContentValues populateCV(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "706e80399d09d7fe99890911a0739ef2", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "706e80399d09d7fe99890911a0739ef2");
        }
        try {
            ContentValues contentValues = new ContentValues();
            JSONObject jSONObject = new JSONObject(log.option);
            contentValues.put("uploaded", "0");
            contentValues.put(SnifferDBHelper.COLUMN_LOG, log.log);
            contentValues.put("tags", jSONObject.toString());
            contentValues.put("type", log.tag);
            contentValues.put("category", log.reportChannel);
            contentValues.put("ts", Long.valueOf(log.ts));
            contentValues.put("status", Integer.valueOf(log.status));
            contentValues.put("token", log.token);
            if (log.value != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(log.value.longValue());
                contentValues.put("_value", sb.toString());
            } else {
                contentValues.put("_value", "nil");
            }
            if (log.envMaps.size() == 0) {
                contentValues.put("env", "");
            } else {
                contentValues.put("env", new JSONObject(log.envMaps).toString());
            }
            contentValues.put("details", log.details);
            contentValues.put("raw", log.raw);
            contentValues.put("is_main_thread", Integer.valueOf(log.isMainThread ? 1 : 0));
            contentValues.put("loguuid", log.logUUId);
            contentValues.put(CrashHianalyticsData.THREAD_ID, log.threadId);
            contentValues.put("thread_name", log.threadName);
            contentValues.put("inner_property", this.logGson.toJson(log.innerProperty));
            this.cacherLogger.d(TAG, "Transform Logs to CV for ", this.dbName);
            return contentValues;
        } catch (Throwable th) {
            this.cacherLogger.e("Error in LogCacher.populateCv:", th);
            this.mCacherException.reportException(th);
            return null;
        }
    }

    public boolean insertLogs(@NonNull List<Log> list) {
        boolean z;
        AtomicInteger calculateDBCount;
        int i;
        LinkedList linkedList;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e815d6edf29baf41c65a9308f33ebbc4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e815d6edf29baf41c65a9308f33ebbc4")).booleanValue();
        }
        int size = list.size();
        try {
            reOpenDb();
            calculateDBCount = calculateDBCount();
            if (1000 - calculateDBCount.get() < size) {
                Logger.getBabelLogger().i("trigger delete", Integer.valueOf(calculateDBCount.get()), " insert size:", Integer.valueOf(size));
                i = calculateDBCount.get() - this.helper.timeLRU(size - (1000 - calculateDBCount.get()));
                calculateDBCount.set(i);
            } else {
                i = calculateDBCount.get();
            }
            linkedList = new LinkedList();
            for (Log log : list) {
                ContentValues populateCV = populateCV(log);
                if (populateCV != null) {
                    linkedList.add(populateCV);
                }
            }
        } catch (Throwable th) {
            checkSQLiteException(th);
            this.cacherLogger.e("cacher insertLog", th);
            this.mCacherException.reportException(th);
        }
        if (this.helper.insertBatch(linkedList)) {
            calculateDBCount.set(i + size);
            z = true;
            this.cacherLogger.d(TAG, "Insert logs to", this.dbName, "Result:", Boolean.valueOf(z));
            return z;
        }
        z = false;
        this.cacherLogger.d(TAG, "Insert logs to", this.dbName, "Result:", Boolean.valueOf(z));
        return z;
    }

    public boolean deleteUploadedLog(LinkedList<Log> linkedList) {
        boolean z;
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57c6c752c99bda41c6f28808eb94a6c7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57c6c752c99bda41c6f28808eb94a6c7")).booleanValue();
        }
        try {
            reOpenDb();
            z = this.helper.deleteReportedData(linkedList);
            if (z) {
                calculateDBCount().addAndGet(-linkedList.size());
            } else {
                StringBuilder sb = new StringBuilder();
                Iterator<Log> it = linkedList.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().tag);
                    sb.append(";");
                }
                this.mCacherException.reportException(new RuntimeException(sb.toString()));
            }
        } catch (Throwable th) {
            checkSQLiteException(th);
            this.cacherLogger.e("Error in cacher deleteUploadedLog", th);
            this.mCacherException.reportException(th);
            z = false;
        }
        this.cacherLogger.d(TAG, "Delete uploaded logs from", this.dbName, "Result:", Boolean.valueOf(z));
        return z;
    }

    public int queryCounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f1ef2dbd470abf20b802e6d0527974e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f1ef2dbd470abf20b802e6d0527974e")).intValue();
        }
        try {
            return this.helper.queryCounts();
        } catch (Throwable th) {
            checkSQLiteException(th);
            this.cacherLogger.e("cacher queryCounts", th);
            this.mCacherException.reportException(th);
            return 0;
        }
    }

    public AtomicInteger calculateDBCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f1b7c78dcfab17ab3a061eeff26ca7e", 6917529027641081856L)) {
            return (AtomicInteger) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f1b7c78dcfab17ab3a061eeff26ca7e");
        }
        if (this.mDBCount == null) {
            this.mDBCount = new AtomicInteger(queryCounts());
        }
        return this.mDBCount;
    }

    public void clearLog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bc88ba05f8efb92804293357316b44b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bc88ba05f8efb92804293357316b44b");
            return;
        }
        try {
            reOpenDb();
            int deleteAll = this.helper.deleteAll();
            AtomicInteger calculateDBCount = calculateDBCount();
            calculateDBCount.set(calculateDBCount.get() - deleteAll);
        } catch (Throwable th) {
            checkSQLiteException(th);
            this.cacherLogger.e("cacher clearLog", th);
            this.mCacherException.reportException(th);
        }
    }

    private Map<String, Object> convertStr2Map(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f34eceb3c17cb1b14522681d0dd3a016", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f34eceb3c17cb1b14522681d0dd3a016");
        }
        HashMap hashMap = new HashMap();
        try {
            return (Map) this.logGson.fromJson(str, new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.common.kitefly.LogCacher.2
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
        } catch (Exception e) {
            this.cacherLogger.e("Error in LogCacher.convertStr2Map: ", e);
            return hashMap;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SQLHelper {
        private static final int DATABASE_VERSION = 11;
        private static final String KEY_CATEGORY = "category";
        private static final String KEY_DETAILS = "details";
        private static final String KEY_ENV = "env";
        private static final String KEY_ID = "id";
        private static final String KEY_INNER_PROPERTY = "inner_property";
        private static final String KEY_IS_MAIN_THREAD = "is_main_thread";
        private static final String KEY_LOG = "log";
        private static final String KEY_LOGUUID = "loguuid";
        private static final String KEY_RAW = "raw";
        private static final String KEY_STATUS = "status";
        private static final String KEY_TAGS = "tags";
        private static final String KEY_THREAD_ID = "thread_id";
        private static final String KEY_THREAD_NAME = "thread_name";
        private static final String KEY_TOKEN = "token";
        private static final String KEY_TS = "ts";
        private static final String KEY_TYPE = "type";
        private static final String KEY_UPLOADED = "uploaded";
        private static final String KEY_VALUE = "_value";
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final ILogger dbLogger = Logger.getBabelLogger();
        private static final CatchException mDBException = new CatchException("LogCacher DB", 5, 500);
        private final CatchException SQLException;
        private final SQLiteOpenHelper mDB;
        private final String tableName;

        public SQLHelper(Context context, String str, final String str2) {
            Object[] objArr = {context, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0e90b29ccb4b262c03c8cd1f6689b11", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0e90b29ccb4b262c03c8cd1f6689b11");
                return;
            }
            this.SQLException = new CatchException(LogCacher.TAG, 5, MetricsAnrManager.ANR_THRESHOLD);
            this.tableName = str2;
            this.mDB = new SQLiteOpenHelper(context, str, null, 11) { // from class: com.meituan.android.common.kitefly.LogCacher.SQLHelper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.database.sqlite.SQLiteOpenHelper
                public void onCreate(SQLiteDatabase sQLiteDatabase) {
                    Object[] objArr2 = {sQLiteDatabase};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "362b9cedf26e95506ddbf3e0b87e162b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "362b9cedf26e95506ddbf3e0b87e162b");
                    } else {
                        createTable(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                    Object[] objArr2 = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1663e6bdbf1b5abd5229d9bc5a91ab8a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1663e6bdbf1b5abd5229d9bc5a91ab8a");
                        return;
                    }
                    dropTable(sQLiteDatabase);
                    onCreate(sQLiteDatabase);
                }

                private void createTable(SQLiteDatabase sQLiteDatabase) {
                    Object[] objArr2 = {sQLiteDatabase};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0191fe7620b2aebb6084a153d3f65a4e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0191fe7620b2aebb6084a153d3f65a4e");
                        return;
                    }
                    String str3 = "CREATE TABLE " + str2 + "(id INTEGER PRIMARY KEY AUTOINCREMENT,uploaded TEXT,log TEXT,tags TEXT,type TEXT,category TEXT,ts INTTGER,status INT,token TEXT,_value TEXT,env TEXT,details TEXT,raw TEXT,is_main_thread INTEGER,loguuid TEXT,thread_id TEXT,thread_name TEXT,inner_property TEXT)";
                    Logger.getBabelLogger().i("create table sql:", str3);
                    sQLiteDatabase.execSQL(str3);
                }

                private void dropTable(SQLiteDatabase sQLiteDatabase) {
                    Object[] objArr2 = {sQLiteDatabase};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f16aae87a57f15b2003a10489274e660", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f16aae87a57f15b2003a10489274e660");
                        return;
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean insertBatch(List<ContentValues> list) {
            SQLiteDatabase sQLiteDatabase;
            boolean z = true;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a563a10d8877525b16830c4a82479b6c", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a563a10d8877525b16830c4a82479b6c")).booleanValue();
            }
            try {
                sQLiteDatabase = this.mDB.getWritableDatabase();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.beginTransaction();
                        Iterator<ContentValues> it = list.iterator();
                        boolean z2 = true;
                        while (it.hasNext()) {
                            z2 &= sQLiteDatabase.insertWithOnConflict(this.tableName, null, it.next(), 0) != -1;
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        z = z2;
                    } catch (Throwable th) {
                        th = th;
                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                        throw th;
                    }
                }
                if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
                return z;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int queryCounts() throws SQLiteException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d40b2beb3152fc3f309821c27bf0fabd", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d40b2beb3152fc3f309821c27bf0fabd")).intValue();
            }
            Cursor cursor = null;
            try {
                Cursor query = this.mDB.getReadableDatabase().query(this.tableName, new String[]{"id"}, null, null, null, null, null, null);
                try {
                    int count = query.getCount();
                    IOUtils.close(query);
                    return count;
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    IOUtils.close(cursor);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean deleteReportedData(LinkedList<Log> linkedList) throws SQLiteException {
            Object[] objArr = {linkedList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26970077491755d81b83b8595594ba8a", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26970077491755d81b83b8595594ba8a")).booleanValue();
            }
            SQLiteDatabase writableDatabase = this.mDB.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    writableDatabase.beginTransaction();
                    Iterator<Log> it = linkedList.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        z &= writableDatabase.delete(this.tableName, "id= ?", new String[]{it.next().innerProperty.dbId}) == 1;
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return z;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int deleteAll() throws SQLiteException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b3df1e26a2f7fbb5bdd894181a7bb98", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b3df1e26a2f7fbb5bdd894181a7bb98")).intValue() : this.mDB.getWritableDatabase().delete(this.tableName, null, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int timeLRU(int r21) throws android.database.sqlite.SQLiteException {
            /*
                r20 = this;
                r8 = r20
                r0 = 1
                java.lang.Object[] r9 = new java.lang.Object[r0]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
                r10 = 0
                r9[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.common.kitefly.LogCacher.SQLHelper.changeQuickRedirect
                java.lang.String r12 = "22a6c21505f353db207fa20d500148ba"
                r4 = 0
                r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                r1 = r9
                r2 = r20
                r3 = r11
                r5 = r12
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L29
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r8, r11, r10, r12)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
            L29:
                r1 = 0
                android.database.sqlite.SQLiteOpenHelper r2 = r8.mDB
                android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()
                r2.beginTransaction()     // Catch: java.lang.Throwable -> L98
                java.lang.String r12 = r8.tableName     // Catch: java.lang.Throwable -> L98
                java.lang.String r3 = "id"
                java.lang.String r4 = "type"
                java.lang.String[] r13 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L98
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                java.lang.String r18 = "id ASC"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
                r3.<init>()     // Catch: java.lang.Throwable -> L98
                r4 = r21
                r3.append(r4)     // Catch: java.lang.Throwable -> L98
                java.lang.String r19 = r3.toString()     // Catch: java.lang.Throwable -> L98
                r11 = r2
                android.database.Cursor r3 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L98
                if (r3 == 0) goto L83
                boolean r1 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L80
                if (r1 == 0) goto L83
                r1 = 0
            L64:
                java.lang.String r4 = r8.tableName     // Catch: java.lang.Throwable -> L80
                java.lang.String r5 = "id=?"
                java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L80
                java.lang.String r7 = r3.getString(r10)     // Catch: java.lang.Throwable -> L80
                r6[r10] = r7     // Catch: java.lang.Throwable -> L80
                int r4 = r2.delete(r4, r5, r6)     // Catch: java.lang.Throwable -> L80
                if (r4 != r0) goto L79
                int r1 = r1 + 1
            L79:
                boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L80
                if (r4 != 0) goto L64
                goto L84
            L80:
                r0 = move-exception
                r1 = r3
                goto L99
            L83:
                r1 = 0
            L84:
                r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L80
                if (r3 == 0) goto L8c
                r3.close()
            L8c:
                if (r2 == 0) goto L97
                boolean r0 = r2.inTransaction()
                if (r0 == 0) goto L97
                r2.endTransaction()
            L97:
                return r1
            L98:
                r0 = move-exception
            L99:
                if (r1 == 0) goto L9e
                r1.close()
            L9e:
                if (r2 == 0) goto La9
                boolean r1 = r2.inTransaction()
                if (r1 == 0) goto La9
                r2.endTransaction()
            La9:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.kitefly.LogCacher.SQLHelper.timeLRU(int):int");
        }
    }
}
