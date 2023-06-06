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
public class ExpressDao extends AbstractDao<Express, Long> {
    public static final String TABLENAME = "express";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "ID");
        public static final Property Status = new Property(1, Short.class, "status", false, "STATUS");
        public static final Property Result = new Property(2, Short.class, "result", false, "RESULT");
        public static final Property DeliveryCompany = new Property(3, String.class, "deliveryCompany", false, "DELIVERY_COMPANY");
        public static final Property DeliveryNo = new Property(4, String.class, "deliveryNo", false, "DELIVERY_NO");
        public static final Property ExpressNodes = new Property(5, String.class, "expressNodes", false, "EXPRESS_NODES");
        public static final Property Url = new Property(6, String.class, "url", false, "URL");
        public static final Property Message = new Property(7, String.class, "message", false, "MESSAGE");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, Express express) {
        Express express2 = express;
        Object[] objArr = {sQLiteStatement, express2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fecd03ea7380be98218323eae7680134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fecd03ea7380be98218323eae7680134");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = express2.id;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Short sh = express2.status;
        if (sh != null) {
            sQLiteStatement.bindLong(2, sh.shortValue());
        }
        Short sh2 = express2.result;
        if (sh2 != null) {
            sQLiteStatement.bindLong(3, sh2.shortValue());
        }
        String str = express2.deliveryCompany;
        if (str != null) {
            sQLiteStatement.bindString(4, str);
        }
        String str2 = express2.deliveryNo;
        if (str2 != null) {
            sQLiteStatement.bindString(5, str2);
        }
        String str3 = express2.expressNodes;
        if (str3 != null) {
            sQLiteStatement.bindString(6, str3);
        }
        String str4 = express2.url;
        if (str4 != null) {
            sQLiteStatement.bindString(7, str4);
        }
        String str5 = express2.message;
        if (str5 != null) {
            sQLiteStatement.bindString(8, str5);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(Express express) {
        Express express2 = express;
        Object[] objArr = {express2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3066094b7c813cd765d44a4191f6a950", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3066094b7c813cd765d44a4191f6a950");
        }
        if (express2 != null) {
            return express2.id;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Express readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "513a23cfce4565834a803fceebe3cd4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Express) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "513a23cfce4565834a803fceebe3cd4e");
        }
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Short valueOf2 = cursor.isNull(i3) ? null : Short.valueOf(cursor.getShort(i3));
        int i4 = i + 2;
        Short valueOf3 = cursor.isNull(i4) ? null : Short.valueOf(cursor.getShort(i4));
        int i5 = i + 3;
        String string = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        String string2 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        String string3 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        int i9 = i + 7;
        return new Express(valueOf, valueOf2, valueOf3, string, string2, string3, cursor.isNull(i8) ? null : cursor.getString(i8), cursor.isNull(i9) ? null : cursor.getString(i9));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, Express express, int i) {
        Express express2 = express;
        Object[] objArr = {cursor, express2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d864b07e4c1a875dbd6deaace779fcd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d864b07e4c1a875dbd6deaace779fcd5");
            return;
        }
        int i2 = i + 0;
        express2.id = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        express2.status = cursor.isNull(i3) ? null : Short.valueOf(cursor.getShort(i3));
        int i4 = i + 2;
        express2.result = cursor.isNull(i4) ? null : Short.valueOf(cursor.getShort(i4));
        int i5 = i + 3;
        express2.deliveryCompany = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        express2.deliveryNo = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        express2.expressNodes = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        express2.url = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        express2.message = cursor.isNull(i9) ? null : cursor.getString(i9);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e71f27bc95f87f9e8e50c40f8162de4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e71f27bc95f87f9e8e50c40f8162de4");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(Express express, long j) {
        Express express2 = express;
        Object[] objArr = {express2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "994f30f67c3ff32e2088a9702c100d64", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "994f30f67c3ff32e2088a9702c100d64");
        }
        express2.id = Long.valueOf(j);
        return Long.valueOf(j);
    }
}
