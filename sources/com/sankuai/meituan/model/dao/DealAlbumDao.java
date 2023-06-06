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
public class DealAlbumDao extends AbstractDao<DealAlbum, Long> {
    public static final String TABLENAME = "deal_album";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "ID");
        public static final Property Did = new Property(1, Long.class, "did", false, "DID");
        public static final Property Pic = new Property(2, String.class, "pic", false, "PIC");
        public static final Property Thumb = new Property(3, String.class, "thumb", false, "THUMB");
        public static final Property Desc = new Property(4, String.class, "desc", false, "DESC");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, DealAlbum dealAlbum) {
        DealAlbum dealAlbum2 = dealAlbum;
        Object[] objArr = {sQLiteStatement, dealAlbum2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbd57212d17d721798bf43881f1fff9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbd57212d17d721798bf43881f1fff9e");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = dealAlbum2.id;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Long l2 = dealAlbum2.did;
        if (l2 != null) {
            sQLiteStatement.bindLong(2, l2.longValue());
        }
        String str = dealAlbum2.pic;
        if (str != null) {
            sQLiteStatement.bindString(3, str);
        }
        String str2 = dealAlbum2.thumb;
        if (str2 != null) {
            sQLiteStatement.bindString(4, str2);
        }
        String str3 = dealAlbum2.desc;
        if (str3 != null) {
            sQLiteStatement.bindString(5, str3);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(DealAlbum dealAlbum) {
        DealAlbum dealAlbum2 = dealAlbum;
        Object[] objArr = {dealAlbum2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c71d93d1e248599c4944df9e18c9261a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c71d93d1e248599c4944df9e18c9261a");
        }
        if (dealAlbum2 != null) {
            return dealAlbum2.id;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ DealAlbum readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4130c9f72f52b79b3183821e3df2cba3", RobustBitConfig.DEFAULT_VALUE)) {
            return (DealAlbum) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4130c9f72f52b79b3183821e3df2cba3");
        }
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long valueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        String string = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        int i6 = i + 4;
        return new DealAlbum(valueOf, valueOf2, string, cursor.isNull(i5) ? null : cursor.getString(i5), cursor.isNull(i6) ? null : cursor.getString(i6));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, DealAlbum dealAlbum, int i) {
        DealAlbum dealAlbum2 = dealAlbum;
        Object[] objArr = {cursor, dealAlbum2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feec3e1110eb03f06b07184a0555cab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feec3e1110eb03f06b07184a0555cab7");
            return;
        }
        int i2 = i + 0;
        dealAlbum2.id = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        dealAlbum2.did = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        dealAlbum2.pic = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        dealAlbum2.thumb = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        dealAlbum2.desc = cursor.isNull(i6) ? null : cursor.getString(i6);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d04b57e9f9093cb815e69f1adf28082", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d04b57e9f9093cb815e69f1adf28082");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(DealAlbum dealAlbum, long j) {
        DealAlbum dealAlbum2 = dealAlbum;
        Object[] objArr = {dealAlbum2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31597bff71f978a10927977e59db08f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31597bff71f978a10927977e59db08f0");
        }
        dealAlbum2.id = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public DealAlbumDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "491ea9dba0a31c6f5dafc8f6b3a03724", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "491ea9dba0a31c6f5dafc8f6b3a03724");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b651b4d79898706f6e7771a43f8489c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b651b4d79898706f6e7771a43f8489c");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'deal_album' ('ID' INTEGER PRIMARY KEY AUTOINCREMENT ,'DID' INTEGER,'PIC' TEXT,'THUMB' TEXT,'DESC' TEXT);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d25762d9866b45619fc98563978bb2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d25762d9866b45619fc98563978bb2c");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'deal_album'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
