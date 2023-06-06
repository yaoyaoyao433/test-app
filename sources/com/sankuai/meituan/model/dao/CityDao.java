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
public class CityDao extends AbstractDao<City, Long> {
    public static final String TABLENAME = "city";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Rank = new Property(1, String.class, "rank", false, "RANK");
        public static final Property Name = new Property(2, String.class, "name", false, "NAME");
        public static final Property Lat = new Property(3, Double.class, "lat", false, "LAT");
        public static final Property Lng = new Property(4, Double.class, "lng", false, "LNG");
        public static final Property Pinyin = new Property(5, String.class, "pinyin", false, "PINYIN");
        public static final Property IsOpen = new Property(6, Boolean.class, "isOpen", false, "IS_OPEN");
        public static final Property DivisionStr = new Property(7, String.class, "divisionStr", false, "DIVISION_STR");
        public static final Property IsForeign = new Property(8, Boolean.class, "isForeign", false, "IS_FOREIGN");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, City city) {
        City city2 = city;
        Object[] objArr = {sQLiteStatement, city2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a0d571cb8439942dbee0e019066bf54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a0d571cb8439942dbee0e019066bf54");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = city2.id;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        String str = city2.rank;
        if (str != null) {
            sQLiteStatement.bindString(2, str);
        }
        String str2 = city2.name;
        if (str2 != null) {
            sQLiteStatement.bindString(3, str2);
        }
        Double d = city2.lat;
        if (d != null) {
            sQLiteStatement.bindDouble(4, d.doubleValue());
        }
        Double d2 = city2.lng;
        if (d2 != null) {
            sQLiteStatement.bindDouble(5, d2.doubleValue());
        }
        String str3 = city2.pinyin;
        if (str3 != null) {
            sQLiteStatement.bindString(6, str3);
        }
        Boolean bool = city2.isOpen;
        if (bool != null) {
            sQLiteStatement.bindLong(7, bool.booleanValue() ? 1L : 0L);
        }
        String str4 = city2.divisionStr;
        if (str4 != null) {
            sQLiteStatement.bindString(8, str4);
        }
        Boolean bool2 = city2.isForeign;
        if (bool2 != null) {
            sQLiteStatement.bindLong(9, bool2.booleanValue() ? 1L : 0L);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(City city) {
        City city2 = city;
        Object[] objArr = {city2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc6e9be1d906af1c6d58446b49081dfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc6e9be1d906af1c6d58446b49081dfb");
        }
        if (city2 != null) {
            return city2.id;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ City readEntity(Cursor cursor, int i) {
        Boolean valueOf;
        Boolean valueOf2;
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99ca057bab3cb6b87240390c310f65f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (City) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99ca057bab3cb6b87240390c310f65f0");
        }
        int i2 = i + 0;
        Long valueOf3 = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        Double valueOf4 = cursor.isNull(i5) ? null : Double.valueOf(cursor.getDouble(i5));
        int i6 = i + 4;
        Double valueOf5 = cursor.isNull(i6) ? null : Double.valueOf(cursor.getDouble(i6));
        int i7 = i + 5;
        String string3 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        if (cursor.isNull(i8)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i8) != 0);
        }
        int i9 = i + 7;
        String string4 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        if (cursor.isNull(i10)) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        return new City(valueOf3, string, string2, valueOf4, valueOf5, string3, valueOf, string4, valueOf2);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, City city, int i) {
        Boolean valueOf;
        City city2 = city;
        Object[] objArr = {cursor, city2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c17547689b2183d8ebeaf5d7f3580b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c17547689b2183d8ebeaf5d7f3580b7");
            return;
        }
        int i2 = i + 0;
        Boolean bool = null;
        city2.id = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        city2.rank = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        city2.name = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        city2.lat = cursor.isNull(i5) ? null : Double.valueOf(cursor.getDouble(i5));
        int i6 = i + 4;
        city2.lng = cursor.isNull(i6) ? null : Double.valueOf(cursor.getDouble(i6));
        int i7 = i + 5;
        city2.pinyin = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        if (cursor.isNull(i8)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i8) != 0);
        }
        city2.isOpen = valueOf;
        int i9 = i + 7;
        city2.divisionStr = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        if (!cursor.isNull(i10)) {
            bool = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        city2.isForeign = bool;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5f8c678ca0d58b52f4e45fe60b8d9f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5f8c678ca0d58b52f4e45fe60b8d9f8");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(City city, long j) {
        City city2 = city;
        Object[] objArr = {city2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ecc798bbef8c780334d621ed9ffa4bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ecc798bbef8c780334d621ed9ffa4bb");
        }
        city2.id = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public CityDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c10939615e1293d049d778acc928296b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c10939615e1293d049d778acc928296b");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4184190b42073603ad74098bb16dd41b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4184190b42073603ad74098bb16dd41b");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'city' ('_id' INTEGER PRIMARY KEY ,'RANK' TEXT,'NAME' TEXT,'LAT' REAL,'LNG' REAL,'PINYIN' TEXT,'IS_OPEN' INTEGER,'DIVISION_STR' TEXT,'IS_FOREIGN' INTEGER);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac79453a703c5bb83b843d64462c226c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac79453a703c5bb83b843d64462c226c");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'city'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
