package com.sankuai.xm.im.cache.bean;

import android.content.ContentValues;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.tinyorm.TableProxy;
import com.sankuai.xm.base.tinyorm.a;
import com.sankuai.xm.base.tinyorm.d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DBPubOpposite$$TableProxy implements TableProxy<DBPubOpposite> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(DBPubOpposite dBPubOpposite) {
        Object[] objArr = {dBPubOpposite};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d326b553f68248df9bdaf735db09c6a9", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d326b553f68248df9bdaf735db09c6a9");
        }
        if (dBPubOpposite == null) {
            return null;
        }
        d dVar = new d(DBPubOpposite.TABLE_NAME, dBPubOpposite.getClass());
        dVar.a(new d.a("key_index", "key", true));
        dVar.a(new d.a("sending_time_index", DBPubOpposite.SENDING_TIME, false));
        a aVar = new a("key", 1);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        aVar.e = false;
        dVar.a("key", aVar);
        dVar.a(DBPubOpposite.SENDING_TIME, new a(DBPubOpposite.SENDING_TIME, 5));
        dVar.a(DBPubOpposite.SEND_OPPOSITE_TIME, new a(DBPubOpposite.SEND_OPPOSITE_TIME, 5));
        dVar.a(DBPubOpposite.RECV_OPPOSITE_TIME, new a(DBPubOpposite.RECV_OPPOSITE_TIME, 5));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(DBPubOpposite dBPubOpposite) {
        Object[] objArr = {dBPubOpposite};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5ba5be09462617c225ee96d0fe98035", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5ba5be09462617c225ee96d0fe98035");
        }
        if (dBPubOpposite == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", dBPubOpposite.getKey());
        contentValues.put(DBPubOpposite.SENDING_TIME, Long.valueOf(dBPubOpposite.getSendingTime()));
        contentValues.put(DBPubOpposite.SEND_OPPOSITE_TIME, Long.valueOf(dBPubOpposite.getSendOppositeTime()));
        contentValues.put(DBPubOpposite.RECV_OPPOSITE_TIME, Long.valueOf(dBPubOpposite.getRecvOppositeTime()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecbc96e00d90817958ce1524dc38dda9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecbc96e00d90817958ce1524dc38dda9")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(DBPubOpposite dBPubOpposite, String[] strArr) {
        Object[] objArr = {dBPubOpposite, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b72e9c35d1a30dadd783c708161d9dca", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b72e9c35d1a30dadd783c708161d9dca");
        }
        if (dBPubOpposite == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains(DBPubOpposite.SENDING_TIME, hashSet)) {
            contentValues.put(DBPubOpposite.SENDING_TIME, Long.valueOf(dBPubOpposite.getSendingTime()));
        }
        if (strArr == null || contains(DBPubOpposite.SEND_OPPOSITE_TIME, hashSet)) {
            contentValues.put(DBPubOpposite.SEND_OPPOSITE_TIME, Long.valueOf(dBPubOpposite.getSendOppositeTime()));
        }
        if (strArr == null || contains(DBPubOpposite.RECV_OPPOSITE_TIME, hashSet)) {
            contentValues.put(DBPubOpposite.RECV_OPPOSITE_TIME, Long.valueOf(dBPubOpposite.getRecvOppositeTime()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public DBPubOpposite query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a77576d1fb1667df91a9a1af422b250", 6917529027641081856L)) {
            return (DBPubOpposite) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a77576d1fb1667df91a9a1af422b250");
        }
        if (cursor == null) {
            return null;
        }
        DBPubOpposite dBPubOpposite = new DBPubOpposite();
        int columnIndex = cursor.getColumnIndex("key");
        if (columnIndex != -1) {
            dBPubOpposite.setKey(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex(DBPubOpposite.SENDING_TIME);
        if (columnIndex2 != -1) {
            dBPubOpposite.setSendingTime(cursor.getLong(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex(DBPubOpposite.SEND_OPPOSITE_TIME);
        if (columnIndex3 != -1) {
            dBPubOpposite.setSendOppositeTime(cursor.getLong(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(DBPubOpposite.RECV_OPPOSITE_TIME);
        if (columnIndex4 != -1) {
            dBPubOpposite.setRecvOppositeTime(cursor.getLong(columnIndex4));
        }
        return dBPubOpposite;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(DBPubOpposite dBPubOpposite) {
        Object[] objArr = {dBPubOpposite};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b25ee81278c819834fdb3ec86ce85c06", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b25ee81278c819834fdb3ec86ce85c06");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("key='" + dBPubOpposite.getKey() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
