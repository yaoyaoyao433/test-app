package com.sankuai.meituan.model.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiFavoriteDao extends AbstractDao<PoiFavorite, Long> {
    public static final String TABLENAME = "poi_favorite";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property PoiId = new Property(0, Long.class, "poiId", true, "POI_ID");
        public static final Property Index = new Property(1, Integer.class, "index", false, "INDEX");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, PoiFavorite poiFavorite) {
        PoiFavorite poiFavorite2 = poiFavorite;
        Object[] objArr = {sQLiteStatement, poiFavorite2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40fefb925443e08d29a207a063e0ed32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40fefb925443e08d29a207a063e0ed32");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = poiFavorite2.poiId;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Integer num = poiFavorite2.index;
        if (num != null) {
            sQLiteStatement.bindLong(2, num.intValue());
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(PoiFavorite poiFavorite) {
        PoiFavorite poiFavorite2 = poiFavorite;
        Object[] objArr = {poiFavorite2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db525366d1880c54cf8ccb0902152d86", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db525366d1880c54cf8ccb0902152d86");
        }
        if (poiFavorite2 != null) {
            return poiFavorite2.poiId;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ PoiFavorite readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae7db9c81314b11d0932a44fffab2909", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiFavorite) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae7db9c81314b11d0932a44fffab2909");
        }
        int i2 = i + 0;
        int i3 = i + 1;
        return new PoiFavorite(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, PoiFavorite poiFavorite, int i) {
        PoiFavorite poiFavorite2 = poiFavorite;
        Object[] objArr = {cursor, poiFavorite2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ebfd852b11ded0f2f072a3739ccd504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ebfd852b11ded0f2f072a3739ccd504");
            return;
        }
        int i2 = i + 0;
        poiFavorite2.poiId = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        poiFavorite2.index = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6a82a3d8584bf91bfe77e61cb1a6e80", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6a82a3d8584bf91bfe77e61cb1a6e80");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(PoiFavorite poiFavorite, long j) {
        PoiFavorite poiFavorite2 = poiFavorite;
        Object[] objArr = {poiFavorite2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "549f59f0b4254f327fccf486c4a9a59e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "549f59f0b4254f327fccf486c4a9a59e");
        }
        poiFavorite2.poiId = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public PoiFavoriteDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "781b71ef2fdb01c3f4ba11bc21ed4beb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "781b71ef2fdb01c3f4ba11bc21ed4beb");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "536fdd960f8f84fcbba1e37bb79b645e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "536fdd960f8f84fcbba1e37bb79b645e");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'poi_favorite' ('POI_ID' INTEGER PRIMARY KEY ,'INDEX' INTEGER);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43bd6dc245624889ac1aa250021440c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43bd6dc245624889ac1aa250021440c5");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'poi_favorite'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
