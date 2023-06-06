package com.sankuai.waimai.platform.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HistoryLocationInfoDao extends BaseAbstractDao<HistoryLocationInfo, Long> {
    public static final String TABLENAME = "HISTORY_LOCATION_INFO";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Lat = new Property(1, String.class, "lat", false, "LAT");
        public static final Property Lng = new Property(2, String.class, "lng", false, "LNG");
        public static final Property Desc = new Property(3, String.class, "desc", false, "DESC");
        public static final Property Timestamp = new Property(4, String.class, DeviceInfo.TM, false, "TIMESTAMP");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    public HistoryLocationInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
        Object[] objArr = {daoConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3743ed987d27ff7dc073a2eedc8c1820", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3743ed987d27ff7dc073a2eedc8c1820");
        }
    }

    public HistoryLocationInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "451c4f2c94de33fb2b0545c9203d7fb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "451c4f2c94de33fb2b0545c9203d7fb4");
        }
    }

    public static void createTable(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "48c99f7d4607e75c6a07507e2a7adacd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "48c99f7d4607e75c6a07507e2a7adacd");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'HISTORY_LOCATION_INFO' ('_id' INTEGER PRIMARY KEY ,'LAT' TEXT,'LNG' TEXT,'DESC' TEXT,'TIMESTAMP' TEXT);");
    }

    public static void dropTable(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "66b466b8eb38dc0e02b016b9bbe7072f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "66b466b8eb38dc0e02b016b9bbe7072f");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'HISTORY_LOCATION_INFO'");
        sQLiteDatabase.execSQL(sb.toString());
    }

    @Override // de.greenrobot.dao.AbstractDao
    public void bindValues(SQLiteStatement sQLiteStatement, HistoryLocationInfo historyLocationInfo) {
        Object[] objArr = {sQLiteStatement, historyLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7c44100711eed58333c30dde1385dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7c44100711eed58333c30dde1385dad");
            return;
        }
        sQLiteStatement.clearBindings();
        Long id = historyLocationInfo.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String lat = historyLocationInfo.getLat();
        if (lat != null) {
            sQLiteStatement.bindString(2, lat);
        }
        String lng = historyLocationInfo.getLng();
        if (lng != null) {
            sQLiteStatement.bindString(3, lng);
        }
        String desc = historyLocationInfo.getDesc();
        if (desc != null) {
            sQLiteStatement.bindString(4, desc);
        }
        String timestamp = historyLocationInfo.getTimestamp();
        if (timestamp != null) {
            sQLiteStatement.bindString(5, timestamp);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acb3f2b1a757a2a61de56990818725ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acb3f2b1a757a2a61de56990818725ad");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public HistoryLocationInfo readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e1a3748f6e57afd3e6c80dac0343b6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (HistoryLocationInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e1a3748f6e57afd3e6c80dac0343b6b");
        }
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        int i6 = i + 4;
        return new HistoryLocationInfo(valueOf, string, string2, cursor.isNull(i5) ? null : cursor.getString(i5), cursor.isNull(i6) ? null : cursor.getString(i6));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public void readEntity(Cursor cursor, HistoryLocationInfo historyLocationInfo, int i) {
        Object[] objArr = {cursor, historyLocationInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96ad3e213c3c4f1db71840db26940542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96ad3e213c3c4f1db71840db26940542");
            return;
        }
        int i2 = i + 0;
        historyLocationInfo.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        historyLocationInfo.setLat(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        historyLocationInfo.setLng(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        historyLocationInfo.setDesc(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        historyLocationInfo.setTimestamp(cursor.isNull(i6) ? null : cursor.getString(i6));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public Long updateKeyAfterInsert(HistoryLocationInfo historyLocationInfo, long j) {
        Object[] objArr = {historyLocationInfo, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a78a511e9d0496efb753ede64d83fbaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a78a511e9d0496efb753ede64d83fbaa");
        }
        historyLocationInfo.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public Long getKey(HistoryLocationInfo historyLocationInfo) {
        Object[] objArr = {historyLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2584adc740795f1a8ad8323c686221c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2584adc740795f1a8ad8323c686221c3");
        }
        if (historyLocationInfo != null) {
            return historyLocationInfo.getId();
        }
        return null;
    }
}
