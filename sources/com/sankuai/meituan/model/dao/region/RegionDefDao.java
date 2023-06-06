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
public class RegionDefDao extends AbstractDao<RegionDef, Long> {
    public static final String TABLENAME = "def";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "ID");
        public static final Property Name = new Property(1, String.class, "name", false, "NAME");
        public static final Property Level = new Property(2, Integer.class, "level", false, "LEVEL");
        public static final Property Fullname = new Property(3, String.class, "fullname", false, "FULLNAME");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, RegionDef regionDef) {
        RegionDef regionDef2 = regionDef;
        Object[] objArr = {sQLiteStatement, regionDef2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daa1f9dc564bb6998acdeecc9e639b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daa1f9dc564bb6998acdeecc9e639b98");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = regionDef2.id;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        String str = regionDef2.name;
        if (str != null) {
            sQLiteStatement.bindString(2, str);
        }
        Integer num = regionDef2.level;
        if (num != null) {
            sQLiteStatement.bindLong(3, num.intValue());
        }
        String str2 = regionDef2.fullname;
        if (str2 != null) {
            sQLiteStatement.bindString(4, str2);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(RegionDef regionDef) {
        RegionDef regionDef2 = regionDef;
        Object[] objArr = {regionDef2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cc9b019cf26145ef98b15b036352f62", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cc9b019cf26145ef98b15b036352f62");
        }
        if (regionDef2 != null) {
            return regionDef2.id;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ RegionDef readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d70fa1da752e35d2f83849ab154ee14f", RobustBitConfig.DEFAULT_VALUE)) {
            return (RegionDef) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d70fa1da752e35d2f83849ab154ee14f");
        }
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 2;
        int i5 = i + 3;
        return new RegionDef(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : cursor.getString(i3), cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)), cursor.isNull(i5) ? null : cursor.getString(i5));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, RegionDef regionDef, int i) {
        RegionDef regionDef2 = regionDef;
        Object[] objArr = {cursor, regionDef2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e81870bfa40f8bec8effc1e543d8697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e81870bfa40f8bec8effc1e543d8697");
            return;
        }
        int i2 = i + 0;
        regionDef2.id = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        regionDef2.name = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        regionDef2.level = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        regionDef2.fullname = cursor.isNull(i5) ? null : cursor.getString(i5);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46772e8eec2fe2b99167e0c0a1efd0cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46772e8eec2fe2b99167e0c0a1efd0cf");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(RegionDef regionDef, long j) {
        RegionDef regionDef2 = regionDef;
        Object[] objArr = {regionDef2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "255923f6d32d450a44a16cab45ed5e7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "255923f6d32d450a44a16cab45ed5e7b");
        }
        regionDef2.id = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public RegionDefDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57a4c9370e9e3aee1ad54ec436058788", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57a4c9370e9e3aee1ad54ec436058788");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e0d9f0b10a6016537e38f204da948272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e0d9f0b10a6016537e38f204da948272");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'def' ('ID' INTEGER PRIMARY KEY ,'NAME' TEXT,'LEVEL' INTEGER,'FULLNAME' TEXT);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "208634615d14a2bfc4473cc70d93b99e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "208634615d14a2bfc4473cc70d93b99e");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'def'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
