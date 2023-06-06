package com.sankuai.xm.imui.controller.group.bean;

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
public class AtMeInfo$$TableProxy implements TableProxy<AtMeInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(AtMeInfo atMeInfo) {
        Object[] objArr = {atMeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "000b132371d838f4d3441a0671e87176", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "000b132371d838f4d3441a0671e87176");
        }
        if (atMeInfo == null) {
            return null;
        }
        d dVar = new d(AtMeInfo.TABLE_NAME, atMeInfo.getClass());
        a aVar = new a("uuid", 1);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        dVar.a("uuid", aVar);
        dVar.a("msgId", new a("msgId", 5));
        dVar.a("gid", new a("gid", 5));
        dVar.a("fromUid", new a("fromUid", 5));
        dVar.a("fromName", new a("fromName", 1));
        dVar.a("type", new a("type", 6));
        dVar.a(AtMeInfo.TIME_STAMP, new a(AtMeInfo.TIME_STAMP, 5));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(AtMeInfo atMeInfo) {
        Object[] objArr = {atMeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b741bdf9f66354268336dc995309b86", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b741bdf9f66354268336dc995309b86");
        }
        if (atMeInfo == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", atMeInfo.getUuid());
        contentValues.put("msgId", Long.valueOf(atMeInfo.getMsgId()));
        contentValues.put("gid", Long.valueOf(atMeInfo.getGid()));
        contentValues.put("fromUid", Long.valueOf(atMeInfo.getFromUid()));
        contentValues.put("fromName", atMeInfo.getFromName());
        contentValues.put("type", Integer.valueOf(atMeInfo.getType()));
        contentValues.put(AtMeInfo.TIME_STAMP, Long.valueOf(atMeInfo.getTimeStamp()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34b0dba15025ada3c488245859e632b9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34b0dba15025ada3c488245859e632b9")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(AtMeInfo atMeInfo, String[] strArr) {
        Object[] objArr = {atMeInfo, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d004d93fb749283bb9d1b9e4cfb355c9", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d004d93fb749283bb9d1b9e4cfb355c9");
        }
        if (atMeInfo == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("msgId", hashSet)) {
            contentValues.put("msgId", Long.valueOf(atMeInfo.getMsgId()));
        }
        if (strArr == null || contains("gid", hashSet)) {
            contentValues.put("gid", Long.valueOf(atMeInfo.getGid()));
        }
        if (strArr == null || contains("fromUid", hashSet)) {
            contentValues.put("fromUid", Long.valueOf(atMeInfo.getFromUid()));
        }
        if (strArr == null || contains("fromName", hashSet)) {
            contentValues.put("fromName", atMeInfo.getFromName());
        }
        if (strArr == null || contains("type", hashSet)) {
            contentValues.put("type", Integer.valueOf(atMeInfo.getType()));
        }
        if (strArr == null || contains(AtMeInfo.TIME_STAMP, hashSet)) {
            contentValues.put(AtMeInfo.TIME_STAMP, Long.valueOf(atMeInfo.getTimeStamp()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public AtMeInfo query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f120039acffdb860b8071b915aef663", 6917529027641081856L)) {
            return (AtMeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f120039acffdb860b8071b915aef663");
        }
        if (cursor == null) {
            return null;
        }
        AtMeInfo atMeInfo = new AtMeInfo();
        int columnIndex = cursor.getColumnIndex("uuid");
        if (columnIndex != -1) {
            atMeInfo.setUuid(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("msgId");
        if (columnIndex2 != -1) {
            atMeInfo.setMsgId(cursor.getLong(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("gid");
        if (columnIndex3 != -1) {
            atMeInfo.setGid(cursor.getLong(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex("fromUid");
        if (columnIndex4 != -1) {
            atMeInfo.setFromUid(cursor.getLong(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex("fromName");
        if (columnIndex5 != -1) {
            atMeInfo.setFromName(cursor.getString(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex("type");
        if (columnIndex6 != -1) {
            atMeInfo.setType(cursor.getInt(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(AtMeInfo.TIME_STAMP);
        if (columnIndex7 != -1) {
            atMeInfo.setTimeStamp(cursor.getLong(columnIndex7));
        }
        return atMeInfo;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(AtMeInfo atMeInfo) {
        Object[] objArr = {atMeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1097336da4c0382bd5abc38b58fdf984", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1097336da4c0382bd5abc38b58fdf984");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("uuid='" + atMeInfo.getUuid() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
