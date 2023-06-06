package com.sankuai.meituan.model.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SubwayDao extends AbstractDao<Subway, Long> {
    public static final String TABLENAME = "subway";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static final Property CityId = new Property(0, Long.class, "cityId", true, "CITY_ID");
        public static final Property Data = new Property(1, byte[].class, "data", false, "DATA");
        public static final Property LastModified = new Property(2, Long.class, "lastModified", false, "LAST_MODIFIED");
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, Subway subway) {
        Subway subway2 = subway;
        Object[] objArr = {sQLiteStatement, subway2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8fd3922b0182d95470c075b8827580b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8fd3922b0182d95470c075b8827580b");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = subway2.cityId;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        byte[] bArr = subway2.data;
        if (bArr != null) {
            sQLiteStatement.bindBlob(2, bArr);
        }
        Long l2 = subway2.lastModified;
        if (l2 != null) {
            sQLiteStatement.bindLong(3, l2.longValue());
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(Subway subway) {
        Subway subway2 = subway;
        Object[] objArr = {subway2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "469553d21ecc0657fbb78dccd69d02df", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "469553d21ecc0657fbb78dccd69d02df");
        }
        if (subway2 != null) {
            return subway2.cityId;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Subway readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3dc1e90bfe93e36d4ea76fe6c1b2eeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Subway) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3dc1e90bfe93e36d4ea76fe6c1b2eeb");
        }
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 2;
        return new Subway(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : cursor.getBlob(i3), cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, Subway subway, int i) {
        Subway subway2 = subway;
        Object[] objArr = {cursor, subway2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be5926806c3f34ac9c00c85c7d98e65d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be5926806c3f34ac9c00c85c7d98e65d");
            return;
        }
        int i2 = i + 0;
        subway2.cityId = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        subway2.data = cursor.isNull(i3) ? null : cursor.getBlob(i3);
        int i4 = i + 2;
        subway2.lastModified = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e0288af08c302aaa6710bd3f46c71bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e0288af08c302aaa6710bd3f46c71bc");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(Subway subway, long j) {
        Subway subway2 = subway;
        Object[] objArr = {subway2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "beabdb92315e42fa2bcb0797805ce452", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "beabdb92315e42fa2bcb0797805ce452");
        }
        subway2.cityId = Long.valueOf(j);
        return Long.valueOf(j);
    }
}
