package com.sankuai.xm.im.cache.bean;

import android.content.ContentValues;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.tinyorm.TableProxy;
import com.sankuai.xm.base.tinyorm.a;
import com.sankuai.xm.base.tinyorm.d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DBGroupOpposite$$TableProxy implements TableProxy<DBGroupOpposite> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(DBGroupOpposite dBGroupOpposite) {
        Object[] objArr = {dBGroupOpposite};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5afd639a2457441ac203f1668c7f165a", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5afd639a2457441ac203f1668c7f165a");
        }
        if (dBGroupOpposite == null) {
            return null;
        }
        d dVar = new d(DBGroupOpposite.TABLE_NAME, dBGroupOpposite.getClass());
        dVar.a(new d.a("msgid_index", "msgid", true));
        a aVar = new a("msgid", 5);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        aVar.e = false;
        dVar.a("msgid", aVar);
        dVar.a(DBGroupOpposite.READ_UIDS, new a(DBGroupOpposite.READ_UIDS, 1));
        dVar.a(DBGroupOpposite.UNREAD_UIDS, new a(DBGroupOpposite.UNREAD_UIDS, 1));
        dVar.a(DBGroupOpposite.UPDATE_TIME, new a(DBGroupOpposite.UPDATE_TIME, 5));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(DBGroupOpposite dBGroupOpposite) {
        Object[] objArr = {dBGroupOpposite};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60c33f541a2ec1ee9a596d17ef27e89b", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60c33f541a2ec1ee9a596d17ef27e89b");
        }
        if (dBGroupOpposite == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("msgid", Long.valueOf(dBGroupOpposite.getMsgId()));
        contentValues.put(DBGroupOpposite.READ_UIDS, dBGroupOpposite.getReadUids());
        contentValues.put(DBGroupOpposite.UNREAD_UIDS, dBGroupOpposite.getUnreadUids());
        contentValues.put(DBGroupOpposite.UPDATE_TIME, Long.valueOf(dBGroupOpposite.getUpdateTime()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71105ec0eb652eceaaf369728942c3b9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71105ec0eb652eceaaf369728942c3b9")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(DBGroupOpposite dBGroupOpposite, String[] strArr) {
        Object[] objArr = {dBGroupOpposite, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9425ffd878e990facd01a175dd9ac25e", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9425ffd878e990facd01a175dd9ac25e");
        }
        if (dBGroupOpposite == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains(DBGroupOpposite.READ_UIDS, hashSet)) {
            contentValues.put(DBGroupOpposite.READ_UIDS, dBGroupOpposite.getReadUids());
        }
        if (strArr == null || contains(DBGroupOpposite.UNREAD_UIDS, hashSet)) {
            contentValues.put(DBGroupOpposite.UNREAD_UIDS, dBGroupOpposite.getUnreadUids());
        }
        if (strArr == null || contains(DBGroupOpposite.UPDATE_TIME, hashSet)) {
            contentValues.put(DBGroupOpposite.UPDATE_TIME, Long.valueOf(dBGroupOpposite.getUpdateTime()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public DBGroupOpposite query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "828ec7e4343ae33e906adc7f09c859b2", 6917529027641081856L)) {
            return (DBGroupOpposite) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "828ec7e4343ae33e906adc7f09c859b2");
        }
        if (cursor == null) {
            return null;
        }
        DBGroupOpposite dBGroupOpposite = new DBGroupOpposite();
        int columnIndex = cursor.getColumnIndex("msgid");
        if (columnIndex != -1) {
            dBGroupOpposite.setMsgId(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex(DBGroupOpposite.READ_UIDS);
        if (columnIndex2 != -1) {
            dBGroupOpposite.setReadUids(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex(DBGroupOpposite.UNREAD_UIDS);
        if (columnIndex3 != -1) {
            dBGroupOpposite.setUnreadUids(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(DBGroupOpposite.UPDATE_TIME);
        if (columnIndex4 != -1) {
            dBGroupOpposite.setUpdateTime(cursor.getLong(columnIndex4));
        }
        return dBGroupOpposite;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(DBGroupOpposite dBGroupOpposite) {
        Object[] objArr = {dBGroupOpposite};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ffb3ffe13fd1353a9fbf4ea9643f1a2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ffb3ffe13fd1353a9fbf4ea9643f1a2");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgid=" + dBGroupOpposite.getMsgId());
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
