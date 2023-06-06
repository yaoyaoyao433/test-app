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
public class InshopSearchHistoryDao extends BaseAbstractDao<InshopSearchHistory, Long> {
    public static final String TABLENAME = "INSHOP_SEARCH_HISTORY";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Content = new Property(1, String.class, "content", false, "CONTENT");
        public static final Property UpdateTime = new Property(2, Long.class, DBGroupOpposite.UPDATE_TIME, false, "UPDATE_TIME");
        public static final Property PoiId = new Property(3, Long.class, "poiId", false, "POI_ID");
        public static final Property Data1 = new Property(4, String.class, "data1", false, "DATA1");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    public InshopSearchHistoryDao(DaoConfig daoConfig) {
        super(daoConfig);
        Object[] objArr = {daoConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09b26f5b918545377040e3189c5d26d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09b26f5b918545377040e3189c5d26d9");
        }
    }

    public InshopSearchHistoryDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09cefbbcdcf1120185b89dc71171dab1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09cefbbcdcf1120185b89dc71171dab1");
        }
    }

    public static void createTable(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20667e861675bfea4b9825dae141f701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20667e861675bfea4b9825dae141f701");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'INSHOP_SEARCH_HISTORY' ('_id' INTEGER PRIMARY KEY ,'CONTENT' TEXT,'UPDATE_TIME' INTEGER,'POI_ID' INTEGER,'DATA1' TEXT);");
    }

    public static void dropTable(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63acbf655c383653cf55e18dc9581b8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63acbf655c383653cf55e18dc9581b8f");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'INSHOP_SEARCH_HISTORY'");
        sQLiteDatabase.execSQL(sb.toString());
    }

    @Override // de.greenrobot.dao.AbstractDao
    public void bindValues(SQLiteStatement sQLiteStatement, InshopSearchHistory inshopSearchHistory) {
        Object[] objArr = {sQLiteStatement, inshopSearchHistory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e895537bb3100345ea54a99a6fed4318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e895537bb3100345ea54a99a6fed4318");
            return;
        }
        sQLiteStatement.clearBindings();
        Long id = inshopSearchHistory.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String content = inshopSearchHistory.getContent();
        if (content != null) {
            sQLiteStatement.bindString(2, content);
        }
        Long updateTime = inshopSearchHistory.getUpdateTime();
        if (updateTime != null) {
            sQLiteStatement.bindLong(3, updateTime.longValue());
        }
        Long poiId = inshopSearchHistory.getPoiId();
        if (poiId != null) {
            sQLiteStatement.bindLong(4, poiId.longValue());
        }
        String data1 = inshopSearchHistory.getData1();
        if (data1 != null) {
            sQLiteStatement.bindString(5, data1);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc949324bc21e63571fac76b086d8253", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc949324bc21e63571fac76b086d8253");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public InshopSearchHistory readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fc0510b3c92c0cf47c40571918cabd4", RobustBitConfig.DEFAULT_VALUE)) {
            return (InshopSearchHistory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fc0510b3c92c0cf47c40571918cabd4");
        }
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        Long valueOf2 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        int i6 = i + 4;
        return new InshopSearchHistory(valueOf, string, valueOf2, cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)), cursor.isNull(i6) ? null : cursor.getString(i6));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public void readEntity(Cursor cursor, InshopSearchHistory inshopSearchHistory, int i) {
        Object[] objArr = {cursor, inshopSearchHistory, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "745462e7938b9b621cb6602b6fe9aac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "745462e7938b9b621cb6602b6fe9aac6");
            return;
        }
        int i2 = i + 0;
        inshopSearchHistory.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        inshopSearchHistory.setContent(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        inshopSearchHistory.setUpdateTime(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        inshopSearchHistory.setPoiId(cursor.isNull(i5) ? null : Long.valueOf(cursor.getLong(i5)));
        int i6 = i + 4;
        inshopSearchHistory.setData1(cursor.isNull(i6) ? null : cursor.getString(i6));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public Long updateKeyAfterInsert(InshopSearchHistory inshopSearchHistory, long j) {
        Object[] objArr = {inshopSearchHistory, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37d53f0eb4e1e2b498f4cd39119d8cfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37d53f0eb4e1e2b498f4cd39119d8cfe");
        }
        inshopSearchHistory.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public Long getKey(InshopSearchHistory inshopSearchHistory) {
        Object[] objArr = {inshopSearchHistory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "944b3f97465277cdd40defe35c92c2ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "944b3f97465277cdd40defe35c92c2ed");
        }
        if (inshopSearchHistory != null) {
            return inshopSearchHistory.getId();
        }
        return null;
    }
}
