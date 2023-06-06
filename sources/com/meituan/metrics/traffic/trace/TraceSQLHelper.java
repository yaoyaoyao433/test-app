package com.meituan.metrics.traffic.trace;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.support.annotation.NonNull;
import android.util.Pair;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TraceSQLHelper {
    private static final String DATABASE_NAME = "traffic.db";
    private static final int DATABASE_VERSION = 3;
    public static final String KEY_BACKGROUND = "background";
    public static final String KEY_COUNT = "count";
    public static final String KEY_CUSTOM_MSG = "custom_msg";
    public static final String KEY_DATE = "date";
    public static final String KEY_DOWN = "down";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_MOBILE = "mobile";
    public static final String KEY_TOTAL = "value";
    public static final String KEY_TRAFFIC_KEY = "traffic_key";
    public static final String KEY_TYPE = "type";
    public static final String KEY_UP = "up";
    public static final String KEY_WIFI = "wifi";
    private static final String TABLE_NAME = "detail";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile TraceSQLHelper sInstance;
    private CatchException exception;
    private ILogger logger;
    private final SQLiteOpenHelper mDB;
    private volatile boolean sReadOnlyException;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface CustomMsgHandler {
        String updateCustomMsg(String str, String str2);
    }

    public static TraceSQLHelper getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7675464d5eeb4281d643f71ba4f81c30", RobustBitConfig.DEFAULT_VALUE)) {
            return (TraceSQLHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7675464d5eeb4281d643f71ba4f81c30");
        }
        if (sInstance == null) {
            synchronized (TraceSQLHelper.class) {
                if (sInstance == null) {
                    sInstance = new TraceSQLHelper(Metrics.getInstance().getContext());
                }
            }
        }
        return sInstance;
    }

    public TraceSQLHelper(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1848991fa4c6713a962d0b637259210", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1848991fa4c6713a962d0b637259210");
            return;
        }
        this.logger = Logger.getMetricxLogger();
        this.exception = new CatchException("TraceSQLHelper", 1, MetricsAnrManager.ANR_THRESHOLD);
        this.sReadOnlyException = false;
        this.mDB = new SQLiteOpenHelper(context, DATABASE_NAME, null, 3) { // from class: com.meituan.metrics.traffic.trace.TraceSQLHelper.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                Object[] objArr2 = {sQLiteDatabase};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e92534b72f0ff5bd6604cc3579e876df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e92534b72f0ff5bd6604cc3579e876df");
                } else {
                    TraceSQLHelper.this.createTable(sQLiteDatabase);
                }
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                Object[] objArr2 = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f3abe1ab34e81af780ffa65c018e031e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f3abe1ab34e81af780ffa65c018e031e");
                    return;
                }
                TraceSQLHelper.this.dropTable(sQLiteDatabase);
                TraceSQLHelper.this.createTable(sQLiteDatabase);
            }
        };
    }

    private void reOpenDb() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa8ebe515bffcffa1be35c3db6c6f664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa8ebe515bffcffa1be35c3db6c6f664");
        } else if (this.sReadOnlyException) {
            synchronized (TraceSQLHelper.class) {
                if (this.sReadOnlyException) {
                    if (this.mDB != null) {
                        try {
                            this.mDB.close();
                        } catch (Throwable unused) {
                        }
                    }
                    sInstance = new TraceSQLHelper(Metrics.getInstance().getContext());
                    this.sReadOnlyException = false;
                }
            }
        }
    }

    private void checkSQLiteException(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6010f54fde08908db8c63d180c8095d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6010f54fde08908db8c63d180c8095d0");
        } else if (th instanceof SQLiteReadOnlyDatabaseException) {
            this.sReadOnlyException = true;
        } else {
            this.exception.reportException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90a50ad4e6013346dac881ce754747c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90a50ad4e6013346dac881ce754747c4");
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE detail(traffic_key TEXT,type TEXT,date TEXT,value INTEGER,up INTEGER,down INTEGER,wifi INTEGER,mobile INTEGER,foreground INTEGER,background INTEGER,count INTEGER,custom_msg TEXT,PRIMARY KEY(type,traffic_key,date))");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dropTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a8085be409d97dfb3f42e685bed89c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a8085be409d97dfb3f42e685bed89c0");
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS detail");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @android.annotation.SuppressLint({"Range"})
    public void updateDetails(java.util.List<android.content.ContentValues> r26, java.lang.String[] r27, java.lang.String[] r28, boolean r29, boolean r30, @android.support.annotation.Nullable com.meituan.metrics.traffic.trace.TraceSQLHelper.CustomMsgHandler r31) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.traffic.trace.TraceSQLHelper.updateDetails(java.util.List, java.lang.String[], java.lang.String[], boolean, boolean, com.meituan.metrics.traffic.trace.TraceSQLHelper$CustomMsgHandler):void");
    }

    @SuppressLint({"Range"})
    public Pair<String, LinkedList<ContentValues>> queryAll(String[] strArr, String str, String[] strArr2, String str2, String str3) {
        Object[] objArr = {strArr, str, strArr2, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0a0a7a28266fcdeae9e9e87cf32c331", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0a0a7a28266fcdeae9e9e87cf32c331");
        }
        Cursor cursor = null;
        LinkedList linkedList = new LinkedList();
        String str4 = "";
        try {
            Cursor query = this.mDB.getReadableDatabase().query("detail", strArr, str, strArr2, null, null, str2, str3);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        for (String str5 : strArr) {
                            contentValues.put(str5, query.getString(query.getColumnIndex(str5)));
                        }
                        linkedList.add(contentValues);
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        try {
                            str4 = th.getLocalizedMessage();
                            this.logger.e(th.getLocalizedMessage());
                            checkSQLiteException(th);
                            return new Pair<>(str4, linkedList);
                        } finally {
                            IOUtils.close(cursor);
                        }
                    }
                }
            }
            IOUtils.close(query);
        } catch (Throwable th2) {
            th = th2;
        }
        return new Pair<>(str4, linkedList);
    }

    public void deleteAll(String str, String str2) throws SQLiteException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "011e8893c442c53ab6da1fa7d9946f92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "011e8893c442c53ab6da1fa7d9946f92");
            return;
        }
        try {
            reOpenDb();
            this.mDB.getWritableDatabase().delete("detail", "type=? and date=?", new String[]{str, str2});
        } catch (Throwable th) {
            this.logger.e(th.getLocalizedMessage());
            checkSQLiteException(th);
        }
    }
}
