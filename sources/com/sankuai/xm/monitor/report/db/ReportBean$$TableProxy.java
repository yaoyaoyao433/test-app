package com.sankuai.xm.monitor.report.db;

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
public class ReportBean$$TableProxy implements TableProxy<ReportBean> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(ReportBean reportBean) {
        Object[] objArr = {reportBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40659f3c5a1e32f9e13e436eb6e20887", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40659f3c5a1e32f9e13e436eb6e20887");
        }
        if (reportBean == null) {
            return null;
        }
        d dVar = new d(ReportBean.TABLE_NAME, reportBean.getClass());
        com.sankuai.xm.base.tinyorm.a aVar = new com.sankuai.xm.base.tinyorm.a("id", 6);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = true;
        aVar.d = c1377a;
        dVar.a(aVar);
        aVar.e = false;
        dVar.a("id", aVar);
        com.sankuai.xm.base.tinyorm.a aVar2 = new com.sankuai.xm.base.tinyorm.a("name", 1);
        aVar2.e = false;
        dVar.a("name", aVar2);
        dVar.a(ReportBean.TYPE, new com.sankuai.xm.base.tinyorm.a(ReportBean.TYPE, 1));
        dVar.a("priority", new com.sankuai.xm.base.tinyorm.a("priority", 6));
        dVar.a("time", new com.sankuai.xm.base.tinyorm.a("time", 5));
        dVar.a("value", new com.sankuai.xm.base.tinyorm.a("value", 1));
        dVar.a("status", new com.sankuai.xm.base.tinyorm.a("status", 6));
        dVar.a("uid", new com.sankuai.xm.base.tinyorm.a("uid", 1));
        dVar.a(ReportBean.VALUE_1, new com.sankuai.xm.base.tinyorm.a(ReportBean.VALUE_1, 1));
        dVar.a(ReportBean.VALUE_2, new com.sankuai.xm.base.tinyorm.a(ReportBean.VALUE_2, 1));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(ReportBean reportBean) {
        Object[] objArr = {reportBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03a622ce8b5d4b4a6d1651278151f042", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03a622ce8b5d4b4a6d1651278151f042");
        }
        if (reportBean == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", reportBean.getName());
        contentValues.put(ReportBean.TYPE, reportBean.getType());
        contentValues.put("priority", Integer.valueOf(reportBean.getPriority()));
        contentValues.put("time", Long.valueOf(reportBean.getTime()));
        contentValues.put("value", reportBean.getValue());
        contentValues.put("status", Integer.valueOf(reportBean.getStatus()));
        contentValues.put("uid", reportBean.getUid());
        contentValues.put(ReportBean.VALUE_1, reportBean.getValue1());
        contentValues.put(ReportBean.VALUE_2, reportBean.getValue2());
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "018fd652ba1bd27b86ab48bb5533ec1f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "018fd652ba1bd27b86ab48bb5533ec1f")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(ReportBean reportBean, String[] strArr) {
        Object[] objArr = {reportBean, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a8fe55a6642ba1a2b5a1c36964ad92c", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a8fe55a6642ba1a2b5a1c36964ad92c");
        }
        if (reportBean == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("name", hashSet)) {
            contentValues.put("name", reportBean.getName());
        }
        if (strArr == null || contains(ReportBean.TYPE, hashSet)) {
            contentValues.put(ReportBean.TYPE, reportBean.getType());
        }
        if (strArr == null || contains("priority", hashSet)) {
            contentValues.put("priority", Integer.valueOf(reportBean.getPriority()));
        }
        if (strArr == null || contains("time", hashSet)) {
            contentValues.put("time", Long.valueOf(reportBean.getTime()));
        }
        if (strArr == null || contains("value", hashSet)) {
            contentValues.put("value", reportBean.getValue());
        }
        if (strArr == null || contains("status", hashSet)) {
            contentValues.put("status", Integer.valueOf(reportBean.getStatus()));
        }
        if (strArr == null || contains("uid", hashSet)) {
            contentValues.put("uid", reportBean.getUid());
        }
        if (strArr == null || contains(ReportBean.VALUE_1, hashSet)) {
            contentValues.put(ReportBean.VALUE_1, reportBean.getValue1());
        }
        if (strArr == null || contains(ReportBean.VALUE_2, hashSet)) {
            contentValues.put(ReportBean.VALUE_2, reportBean.getValue2());
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ReportBean query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54a9bd179339dce252da991f65b7c309", 6917529027641081856L)) {
            return (ReportBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54a9bd179339dce252da991f65b7c309");
        }
        if (cursor == null) {
            return null;
        }
        ReportBean reportBean = new ReportBean();
        int columnIndex = cursor.getColumnIndex("id");
        if (columnIndex != -1) {
            reportBean.setId(cursor.getInt(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("name");
        if (columnIndex2 != -1) {
            reportBean.setName(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex(ReportBean.TYPE);
        if (columnIndex3 != -1) {
            reportBean.setType(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex("priority");
        if (columnIndex4 != -1) {
            reportBean.setPriority(cursor.getInt(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex("time");
        if (columnIndex5 != -1) {
            reportBean.setTime(cursor.getLong(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex("value");
        if (columnIndex6 != -1) {
            reportBean.setValue(cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex("status");
        if (columnIndex7 != -1) {
            reportBean.setStatus(cursor.getInt(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex("uid");
        if (columnIndex8 != -1) {
            reportBean.setUid(cursor.getString(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex(ReportBean.VALUE_1);
        if (columnIndex9 != -1) {
            reportBean.setValue1(cursor.getString(columnIndex9));
        }
        int columnIndex10 = cursor.getColumnIndex(ReportBean.VALUE_2);
        if (columnIndex10 != -1) {
            reportBean.setValue2(cursor.getString(columnIndex10));
        }
        return reportBean;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(ReportBean reportBean) {
        Object[] objArr = {reportBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91a9584bce094a4dd4e8b89c26f3b89b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91a9584bce094a4dd4e8b89c26f3b89b");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=" + reportBean.getId());
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
