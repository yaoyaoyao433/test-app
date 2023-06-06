package com.sankuai.meituan.model.dao.region;

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
public class RegionLinkDao extends AbstractDao<RegionLink, Long> {
    public static final String TABLENAME = "link";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "ID");
        public static final Property Fromid = new Property(1, Long.class, "fromid", false, "FROMID");
        public static final Property Toid = new Property(2, Long.class, "toid", false, "TOID");
        public static final Property Level = new Property(3, Integer.class, "level", false, "LEVEL");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, RegionLink regionLink) {
        RegionLink regionLink2 = regionLink;
        Object[] objArr = {sQLiteStatement, regionLink2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d6647438f2784811ac4101f199d4ceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d6647438f2784811ac4101f199d4ceb");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = regionLink2.id;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Long l2 = regionLink2.fromid;
        if (l2 != null) {
            sQLiteStatement.bindLong(2, l2.longValue());
        }
        Long l3 = regionLink2.toid;
        if (l3 != null) {
            sQLiteStatement.bindLong(3, l3.longValue());
        }
        Integer num = regionLink2.level;
        if (num != null) {
            sQLiteStatement.bindLong(4, num.intValue());
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(RegionLink regionLink) {
        RegionLink regionLink2 = regionLink;
        Object[] objArr = {regionLink2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dca4203314f4465f338748f60f43c22a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dca4203314f4465f338748f60f43c22a");
        }
        if (regionLink2 != null) {
            return regionLink2.id;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ RegionLink readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "308c7efbd5950d17969610d63e1cdefc", RobustBitConfig.DEFAULT_VALUE)) {
            return (RegionLink) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "308c7efbd5950d17969610d63e1cdefc");
        }
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 2;
        int i5 = i + 3;
        return new RegionLink(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)), cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)), cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, RegionLink regionLink, int i) {
        RegionLink regionLink2 = regionLink;
        Object[] objArr = {cursor, regionLink2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "965eb48a69abdd27f13843f9fb7cba2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "965eb48a69abdd27f13843f9fb7cba2d");
            return;
        }
        int i2 = i + 0;
        regionLink2.id = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        regionLink2.fromid = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        regionLink2.toid = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        regionLink2.level = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a5906197d1f8b9a3cdb8d0cf2179a72", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a5906197d1f8b9a3cdb8d0cf2179a72");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(RegionLink regionLink, long j) {
        RegionLink regionLink2 = regionLink;
        Object[] objArr = {regionLink2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff8332093fd9a66784e216fb593f4a90", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff8332093fd9a66784e216fb593f4a90");
        }
        regionLink2.id = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public RegionLinkDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31eb596c8d94c116dcdf386c4b8f32b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31eb596c8d94c116dcdf386c4b8f32b9");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ba942d4c1100db01757180edda4ec28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ba942d4c1100db01757180edda4ec28");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'link' ('ID' INTEGER PRIMARY KEY ,'FROMID' INTEGER,'TOID' INTEGER,'LEVEL' INTEGER);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78b0a3e05922bf5e38c54aa4d43bc2c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78b0a3e05922bf5e38c54aa4d43bc2c5");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'link'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
