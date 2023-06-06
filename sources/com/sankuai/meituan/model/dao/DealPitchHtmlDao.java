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
public class DealPitchHtmlDao extends AbstractDao<DealPitchHtml, Long> {
    public static final String TABLENAME = "deal_pitchhtml";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Did = new Property(0, Long.class, "did", true, "DID");
        public static final Property Data = new Property(1, byte[].class, "data", false, "DATA");
        public static final Property LastModified = new Property(2, Long.class, "lastModified", false, "LAST_MODIFIED");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, DealPitchHtml dealPitchHtml) {
        DealPitchHtml dealPitchHtml2 = dealPitchHtml;
        Object[] objArr = {sQLiteStatement, dealPitchHtml2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "468de8aaa8afc60ccef3168f7f9bfc00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "468de8aaa8afc60ccef3168f7f9bfc00");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = dealPitchHtml2.did;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        byte[] bArr = dealPitchHtml2.data;
        if (bArr != null) {
            sQLiteStatement.bindBlob(2, bArr);
        }
        Long l2 = dealPitchHtml2.lastModified;
        if (l2 != null) {
            sQLiteStatement.bindLong(3, l2.longValue());
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(DealPitchHtml dealPitchHtml) {
        DealPitchHtml dealPitchHtml2 = dealPitchHtml;
        Object[] objArr = {dealPitchHtml2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecfe21b1e5c53b36c3872a70ee8307d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecfe21b1e5c53b36c3872a70ee8307d5");
        }
        if (dealPitchHtml2 != null) {
            return dealPitchHtml2.did;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ DealPitchHtml readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f294c1a7581122a9cb35d6d9ceabf2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (DealPitchHtml) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f294c1a7581122a9cb35d6d9ceabf2f");
        }
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 2;
        return new DealPitchHtml(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : cursor.getBlob(i3), cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, DealPitchHtml dealPitchHtml, int i) {
        DealPitchHtml dealPitchHtml2 = dealPitchHtml;
        Object[] objArr = {cursor, dealPitchHtml2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bf6946732e94a9f59cdc851e47481cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bf6946732e94a9f59cdc851e47481cc");
            return;
        }
        int i2 = i + 0;
        dealPitchHtml2.did = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        dealPitchHtml2.data = cursor.isNull(i3) ? null : cursor.getBlob(i3);
        int i4 = i + 2;
        dealPitchHtml2.lastModified = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40840efec4ae00b85a8540adfd6cdfa7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40840efec4ae00b85a8540adfd6cdfa7");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(DealPitchHtml dealPitchHtml, long j) {
        DealPitchHtml dealPitchHtml2 = dealPitchHtml;
        Object[] objArr = {dealPitchHtml2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b2e4e26dac8cdd81e7b3667cd950a59", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b2e4e26dac8cdd81e7b3667cd950a59");
        }
        dealPitchHtml2.did = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public DealPitchHtmlDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "122530482a55fd5683eef3f66dd9d5fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "122530482a55fd5683eef3f66dd9d5fe");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d21c016df0ceec29bcb4d9e877f92c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d21c016df0ceec29bcb4d9e877f92c07");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'deal_pitchhtml' ('DID' INTEGER PRIMARY KEY ,'DATA' BLOB,'LAST_MODIFIED' INTEGER);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42b26b8aea82df10dbdaef479b545a7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42b26b8aea82df10dbdaef479b545a7f");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'deal_pitchhtml'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
