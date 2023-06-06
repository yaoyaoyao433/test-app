package com.meituan.android.common.aidata.cache.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.android.common.aidata.data.GestureBean;
import com.meituan.android.common.aidata.database.BaseTable;
import com.meituan.android.common.aidata.database.DBLocks;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GestureTable extends BaseTable<GestureBean> {
    private static final String TAG = "GestureTable";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.database.BaseTable
    public String getCreateSql() {
        return null;
    }

    public GestureTable(SQLiteOpenHelper sQLiteOpenHelper) {
        super("GestureTable", sQLiteOpenHelper, DBLocks.AIDATA_DB_RW_LOCK);
        Object[] objArr = {sQLiteOpenHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f110f81eae0d41b3bf7a48ddf1b05c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f110f81eae0d41b3bf7a48ddf1b05c8");
        }
    }

    public void createTable(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "227ef07d47e52a07e3900b925623779b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "227ef07d47e52a07e3900b925623779b");
            return;
        }
        String tableName = getTableName();
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + tableName + "(id INTEGER PRIMARY KEY AUTOINCREMENT,cid TEXT,req_id TEXT,msid TEXT,tm INTEGER,stm INTEGER,seq INTEGER,start_time INTEGER,end_time INTEGER,time_gap INTEGER,time_interval INTEGER,start_x TEXT,start_y TEXT,start_pressure TEXT,end_x TEXT,end_y TEXT,end_pressure TEXT,x_gap TEXT,y_gap TEXT,trail TEXT,collect_id TEXT,report_id TEXT,app TEXT,lat REAL,lng REAL,sdk_ver TEXT,scale TEXT,app_launch_id TEXT" + CommonConstant.Symbol.BRACKET_RIGHT);
            try {
                String str = "CREATE INDEX IF NOT EXISTS gesture_tm_index ON " + tableName + "(tm DESC)";
                new StringBuilder("--- start create index: ").append(str);
                sQLiteDatabase.execSQL(str);
            } catch (Exception e) {
                new StringBuilder("--- build index failed: ").append(e);
            }
        } catch (Exception e2) {
            new StringBuilder("--- createTable failed: ").append(e2);
        }
    }

    @Override // com.meituan.android.common.aidata.database.BaseTable, com.meituan.android.common.aidata.cache.table.ITableInterfaceV2
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4eddcf7cc2bbf6e3eafbc70911ca4178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4eddcf7cc2bbf6e3eafbc70911ca4178");
            return;
        }
        super.onUpgrade(sQLiteDatabase, i, i2);
        StringBuilder sb = new StringBuilder("upgrade database from version ");
        sb.append(i);
        sb.append(" to version ");
        sb.append(i2);
        if (i < 11) {
            addColumn(sQLiteDatabase, "scale", "text");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.android.common.aidata.database.BaseTable
    public GestureBean getItemFromCursor(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46813da8ba45962efb714327a0d437e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (GestureBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46813da8ba45962efb714327a0d437e7");
        }
        GestureBean gestureBean = new GestureBean();
        gestureBean.cid = (String) getValue(cursor, "cid", String.class);
        gestureBean.req_id = (String) getValue(cursor, Constants.EventInfoConsts.KEY_REQ_ID, String.class);
        gestureBean.msid = (String) getValue(cursor, "msid", String.class);
        gestureBean.tm = ((Long) getValue(cursor, "tm", Long.class)).longValue();
        gestureBean.stm = ((Long) getValue(cursor, "stm", Long.class)).longValue();
        gestureBean.seq = ((Long) getValue(cursor, "seq", Long.class)).longValue();
        gestureBean.start_time = ((Long) getValue(cursor, Constants.GestureData.KEY_START_TIME, Long.class)).longValue();
        gestureBean.end_time = ((Long) getValue(cursor, Constants.GestureData.KEY_END_TIME, Long.class)).longValue();
        gestureBean.time_gap = ((Long) getValue(cursor, Constants.GestureData.KEY_TIME_GAP, Long.class)).longValue();
        gestureBean.time_interval = ((Long) getValue(cursor, Constants.GestureData.KEY_TIME_INTERVAL, Long.class)).longValue();
        gestureBean.start_x = (String) getValue(cursor, "start_x", String.class);
        gestureBean.start_y = (String) getValue(cursor, "start_y", String.class);
        gestureBean.start_pressure = (String) getValue(cursor, "start_pressure", String.class);
        gestureBean.end_x = (String) getValue(cursor, "end_x", String.class);
        gestureBean.end_y = (String) getValue(cursor, "end_y", String.class);
        gestureBean.end_pressure = (String) getValue(cursor, "end_pressure", String.class);
        gestureBean.x_gap = (String) getValue(cursor, "x_gap", String.class);
        gestureBean.y_gap = (String) getValue(cursor, "y_gap", String.class);
        gestureBean.trail = (String) getValue(cursor, Constants.GestureData.KEY_TRAIL, String.class);
        gestureBean.collect_id = (String) getValue(cursor, Constants.GestureData.KEY_COLLECT_ID, String.class);
        gestureBean.report_id = (String) getValue(cursor, Constants.GestureData.KEY_REPORT_ID, String.class);
        gestureBean.app = (String) getValue(cursor, "app", String.class);
        gestureBean.lat = ((Double) getValue(cursor, "lat", Double.class)).doubleValue();
        gestureBean.lng = ((Double) getValue(cursor, "lng", Double.class)).doubleValue();
        gestureBean.sdk_ver = (String) getValue(cursor, "sdk_ver", String.class);
        gestureBean.app_launch_id = (String) getValue(cursor, "app_launch_id", String.class);
        return gestureBean;
    }

    @Override // com.meituan.android.common.aidata.database.BaseTable
    public ContentValues getContentValues(GestureBean gestureBean) {
        Object[] objArr = {gestureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8f63bc17d26d365b0d1c0c55931e2a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8f63bc17d26d365b0d1c0c55931e2a4");
        }
        if (gestureBean == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("cid", gestureBean.cid);
        contentValues.put(Constants.EventInfoConsts.KEY_REQ_ID, gestureBean.req_id);
        contentValues.put("msid", gestureBean.msid);
        contentValues.put("tm", Long.valueOf(gestureBean.tm));
        contentValues.put("stm", Long.valueOf(gestureBean.stm));
        contentValues.put("seq", Long.valueOf(gestureBean.seq));
        contentValues.put(Constants.GestureData.KEY_START_TIME, Long.valueOf(gestureBean.start_time));
        contentValues.put(Constants.GestureData.KEY_END_TIME, Long.valueOf(gestureBean.end_time));
        contentValues.put(Constants.GestureData.KEY_TIME_GAP, Long.valueOf(gestureBean.time_gap));
        contentValues.put(Constants.GestureData.KEY_TIME_INTERVAL, Long.valueOf(gestureBean.time_interval));
        contentValues.put("start_x", gestureBean.start_x);
        contentValues.put("start_y", gestureBean.start_y);
        contentValues.put("start_pressure", gestureBean.start_pressure);
        contentValues.put("end_x", gestureBean.end_x);
        contentValues.put("end_y", gestureBean.end_y);
        contentValues.put("end_pressure", gestureBean.end_pressure);
        contentValues.put("x_gap", gestureBean.x_gap);
        contentValues.put("y_gap", gestureBean.y_gap);
        contentValues.put(Constants.GestureData.KEY_TRAIL, gestureBean.trail);
        contentValues.put(Constants.GestureData.KEY_COLLECT_ID, gestureBean.collect_id);
        contentValues.put(Constants.GestureData.KEY_REPORT_ID, gestureBean.report_id);
        contentValues.put("app", gestureBean.app);
        contentValues.put("lat", Double.valueOf(gestureBean.lat));
        contentValues.put("lng", Double.valueOf(gestureBean.lng));
        contentValues.put("sdk_ver", gestureBean.sdk_ver);
        contentValues.put("app_launch_id", gestureBean.app_launch_id);
        contentValues.put("scale", gestureBean.scale);
        return contentValues;
    }
}
