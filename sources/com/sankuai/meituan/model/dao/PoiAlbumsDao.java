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
public class PoiAlbumsDao extends AbstractDao<PoiAlbums, Long> {
    public static final String TABLENAME = "poi_albums";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property PoiId = new Property(0, Long.class, "poiId", true, "POI_ID");
        public static final Property Data = new Property(1, byte[].class, "data", false, "DATA");
        public static final Property LastModified = new Property(2, Long.class, "lastModified", false, "LAST_MODIFIED");
        public static final Property HasPanoramaPic = new Property(3, Boolean.class, "hasPanoramaPic", false, "HAS_PANORAMA_PIC");
        public static final Property CoverPicUrl = new Property(4, String.class, "coverPicUrl", false, "COVER_PIC_URL");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, PoiAlbums poiAlbums) {
        PoiAlbums poiAlbums2 = poiAlbums;
        Object[] objArr = {sQLiteStatement, poiAlbums2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef5d9bb4cc793a72df488a5ac3d3ef3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef5d9bb4cc793a72df488a5ac3d3ef3a");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = poiAlbums2.poiId;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        byte[] bArr = poiAlbums2.data;
        if (bArr != null) {
            sQLiteStatement.bindBlob(2, bArr);
        }
        Long l2 = poiAlbums2.lastModified;
        if (l2 != null) {
            sQLiteStatement.bindLong(3, l2.longValue());
        }
        Boolean bool = poiAlbums2.hasPanoramaPic;
        if (bool != null) {
            sQLiteStatement.bindLong(4, bool.booleanValue() ? 1L : 0L);
        }
        String str = poiAlbums2.coverPicUrl;
        if (str != null) {
            sQLiteStatement.bindString(5, str);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(PoiAlbums poiAlbums) {
        PoiAlbums poiAlbums2 = poiAlbums;
        Object[] objArr = {poiAlbums2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85f7ecd6eb6564ba965ff50642cb32b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85f7ecd6eb6564ba965ff50642cb32b5");
        }
        if (poiAlbums2 != null) {
            return poiAlbums2.poiId;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ PoiAlbums readEntity(Cursor cursor, int i) {
        Boolean valueOf;
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1461ef7d97dc9399830d21219d5d86b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiAlbums) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1461ef7d97dc9399830d21219d5d86b1");
        }
        int i2 = i + 0;
        Long valueOf2 = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        byte[] blob = cursor.isNull(i3) ? null : cursor.getBlob(i3);
        int i4 = i + 2;
        Long valueOf3 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        int i6 = i + 4;
        return new PoiAlbums(valueOf2, blob, valueOf3, valueOf, cursor.isNull(i6) ? null : cursor.getString(i6));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, PoiAlbums poiAlbums, int i) {
        Boolean valueOf;
        PoiAlbums poiAlbums2 = poiAlbums;
        Object[] objArr = {cursor, poiAlbums2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27f610c0e88bcdb472209cf2b1d7e126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27f610c0e88bcdb472209cf2b1d7e126");
            return;
        }
        int i2 = i + 0;
        poiAlbums2.poiId = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        poiAlbums2.data = cursor.isNull(i3) ? null : cursor.getBlob(i3);
        int i4 = i + 2;
        poiAlbums2.lastModified = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        poiAlbums2.hasPanoramaPic = valueOf;
        int i6 = i + 4;
        poiAlbums2.coverPicUrl = cursor.isNull(i6) ? null : cursor.getString(i6);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f85db128e8d09ef9822a4fbc80683f36", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f85db128e8d09ef9822a4fbc80683f36");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(PoiAlbums poiAlbums, long j) {
        PoiAlbums poiAlbums2 = poiAlbums;
        Object[] objArr = {poiAlbums2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90f2e17124a53d1ca9015f0b8b32ff17", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90f2e17124a53d1ca9015f0b8b32ff17");
        }
        poiAlbums2.poiId = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public PoiAlbumsDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aab43670ec6c90c585cb30890a7a5ed5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aab43670ec6c90c585cb30890a7a5ed5");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8fa15b5d01e396bae5a0e3f1de42145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8fa15b5d01e396bae5a0e3f1de42145");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'poi_albums' ('POI_ID' INTEGER PRIMARY KEY ,'DATA' BLOB,'LAST_MODIFIED' INTEGER,'HAS_PANORAMA_PIC' INTEGER,'COVER_PIC_URL' TEXT);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0479ee96ec8498adcf11b00aa9d74899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0479ee96ec8498adcf11b00aa9d74899");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'poi_albums'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
