package com.sankuai.waimai.platform.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.cache.bean.DBGroupOpposite;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiSearchHistoryDao extends BaseAbstractDao<PoiSearchHistory, Long> {
    public static final String TABLENAME = "POI_SEARCH_HISTORY";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Content = new Property(1, String.class, "content", false, "CONTENT");
        public static final Property UpdateTime = new Property(2, Long.class, DBGroupOpposite.UPDATE_TIME, false, "UPDATE_TIME");
        public static final Property poiId = new Property(3, Long.class, "poiId", false, "POI_ID");
        public static final Property BizSource = new Property(4, Long.class, "bizSource", false, "BIZ_SOURCE");
        public static final Property poiIdStr = new Property(5, String.class, "poiIdStr", false, "POI_ID_STR");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    public PoiSearchHistoryDao(DaoConfig daoConfig) {
        super(daoConfig);
        Object[] objArr = {daoConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d44323cdaed6607cbc71690049f6d4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d44323cdaed6607cbc71690049f6d4a");
        }
    }

    public PoiSearchHistoryDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a6b7b66049aaa358135b25fda8a3c05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a6b7b66049aaa358135b25fda8a3c05");
        }
    }

    public static void createTable(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9adfec0ee200ab64ef71674257d937b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9adfec0ee200ab64ef71674257d937b7");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'POI_SEARCH_HISTORY' ('_id' INTEGER PRIMARY KEY ,'CONTENT' TEXT,'UPDATE_TIME' INTEGER,'POI_ID' INTEGER,'BIZ_SOURCE' INTEGER,'POI_ID_STR' TEXT);");
    }

    public static void dropTable(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f604fb60b54ebde790056a33a669c687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f604fb60b54ebde790056a33a669c687");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'POI_SEARCH_HISTORY'");
        sQLiteDatabase.execSQL(sb.toString());
    }

    @Override // de.greenrobot.dao.AbstractDao
    public void bindValues(SQLiteStatement sQLiteStatement, PoiSearchHistory poiSearchHistory) {
        Object[] objArr = {sQLiteStatement, poiSearchHistory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "958437ab0c1b4934347e9a1e97a4a2a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "958437ab0c1b4934347e9a1e97a4a2a8");
            return;
        }
        sQLiteStatement.clearBindings();
        Long id = poiSearchHistory.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String content = poiSearchHistory.getContent();
        if (content != null) {
            sQLiteStatement.bindString(2, content);
        }
        Long updateTime = poiSearchHistory.getUpdateTime();
        if (updateTime != null) {
            sQLiteStatement.bindLong(3, updateTime.longValue());
        }
        Long poiId = poiSearchHistory.getPoiId();
        if (poiId != null) {
            sQLiteStatement.bindLong(4, poiId.longValue());
        }
        Long bizSource = poiSearchHistory.getBizSource();
        if (bizSource != null) {
            sQLiteStatement.bindLong(5, bizSource.longValue());
        }
        String poiIdStr = poiSearchHistory.getPoiIdStr();
        if (poiIdStr != null) {
            sQLiteStatement.bindString(6, poiIdStr);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5af0642ced771284a87821175172ff53", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5af0642ced771284a87821175172ff53");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public PoiSearchHistory readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfb9d864b37e4d9411f5d40a1405d3a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiSearchHistory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfb9d864b37e4d9411f5d40a1405d3a1");
        }
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        Long valueOf2 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        Long valueOf3 = cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5));
        int i6 = i + 4;
        int i7 = i + 5;
        return new PoiSearchHistory(valueOf, string, valueOf2, valueOf3, cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)), cursor.isNull(i7) ? null : cursor.getString(i7));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public void readEntity(Cursor cursor, PoiSearchHistory poiSearchHistory, int i) {
        Object[] objArr = {cursor, poiSearchHistory, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b63f26263875dfcac75ec32290cc906c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b63f26263875dfcac75ec32290cc906c");
            return;
        }
        int i2 = i + 0;
        poiSearchHistory.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        poiSearchHistory.setContent(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        poiSearchHistory.setUpdateTime(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        poiSearchHistory.setPoiId(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        poiSearchHistory.setBizSource(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i + 5;
        poiSearchHistory.setPoiIdStr(cursor.isNull(i7) ? null : cursor.getString(i7));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public Long updateKeyAfterInsert(PoiSearchHistory poiSearchHistory, long j) {
        Object[] objArr = {poiSearchHistory, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "401e4488f96ad80939431bb651302137", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "401e4488f96ad80939431bb651302137");
        }
        poiSearchHistory.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public Long getKey(PoiSearchHistory poiSearchHistory) {
        Object[] objArr = {poiSearchHistory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72151fe6c43131fb956b58074f65c8d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72151fe6c43131fb956b58074f65c8d4");
        }
        if (poiSearchHistory != null) {
            return poiSearchHistory.getId();
        }
        return null;
    }
}
