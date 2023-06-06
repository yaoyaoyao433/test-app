package com.sankuai.xm.monitor.report.db;

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
public class TraceBean$$TableProxy implements TableProxy<TraceBean> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(TraceBean traceBean) {
        Object[] objArr = {traceBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8be97f97cfb5c514b5e3b5b94df8a1d", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8be97f97cfb5c514b5e3b5b94df8a1d");
        }
        if (traceBean == null) {
            return null;
        }
        d dVar = new d(TraceBean.TABLE_NAME, traceBean.getClass());
        com.sankuai.xm.base.tinyorm.a aVar = new com.sankuai.xm.base.tinyorm.a("id", 1);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        aVar.e = false;
        dVar.a("id", aVar);
        com.sankuai.xm.base.tinyorm.a aVar2 = new com.sankuai.xm.base.tinyorm.a("trace_id", 5);
        a.C1377a c1377a2 = new a.C1377a();
        c1377a2.a = false;
        aVar2.d = c1377a2;
        dVar.a(aVar2);
        aVar2.e = false;
        dVar.a("trace_id", aVar2);
        com.sankuai.xm.base.tinyorm.a aVar3 = new com.sankuai.xm.base.tinyorm.a("name", 1);
        aVar3.e = false;
        dVar.a("name", aVar3);
        dVar.a(TraceBean.TRACE_NAME, new com.sankuai.xm.base.tinyorm.a(TraceBean.TRACE_NAME, 1));
        com.sankuai.xm.base.tinyorm.a aVar4 = new com.sankuai.xm.base.tinyorm.a("type", 1);
        aVar4.e = false;
        dVar.a("type", aVar4);
        dVar.a(TraceBean.RULE, new com.sankuai.xm.base.tinyorm.a(TraceBean.RULE, 6));
        dVar.a(TraceBean.TOOL, new com.sankuai.xm.base.tinyorm.a(TraceBean.TOOL, 6));
        dVar.a(TraceBean.DEADLINE, new com.sankuai.xm.base.tinyorm.a(TraceBean.DEADLINE, 5));
        dVar.a(TraceBean.CREATE_TIME, new com.sankuai.xm.base.tinyorm.a(TraceBean.CREATE_TIME, 5));
        dVar.a(TraceBean.EXE_TIME, new com.sankuai.xm.base.tinyorm.a(TraceBean.EXE_TIME, 5));
        dVar.a(TraceBean.UPDATE_TIME, new com.sankuai.xm.base.tinyorm.a(TraceBean.UPDATE_TIME, 5));
        dVar.a("status", new com.sankuai.xm.base.tinyorm.a("status", 6));
        dVar.a("uid", new com.sankuai.xm.base.tinyorm.a("uid", 5));
        dVar.a(TraceBean.SHARED_IDS, new com.sankuai.xm.base.tinyorm.a(TraceBean.SHARED_IDS, 1));
        dVar.a("params", new com.sankuai.xm.base.tinyorm.a("params", 1));
        dVar.a("action", new com.sankuai.xm.base.tinyorm.a("action", 1));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(TraceBean traceBean) {
        Object[] objArr = {traceBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d08e89183f4349e839e0db6803b65d4f", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d08e89183f4349e839e0db6803b65d4f");
        }
        if (traceBean == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", traceBean.getId());
        contentValues.put("trace_id", Long.valueOf(traceBean.getTraceId()));
        contentValues.put("name", traceBean.getName());
        contentValues.put(TraceBean.TRACE_NAME, traceBean.getTraceName());
        contentValues.put("type", traceBean.getType());
        contentValues.put(TraceBean.RULE, Integer.valueOf(traceBean.getRule()));
        contentValues.put(TraceBean.TOOL, Integer.valueOf(traceBean.getTool()));
        contentValues.put(TraceBean.DEADLINE, Long.valueOf(traceBean.getDeadline()));
        contentValues.put(TraceBean.CREATE_TIME, Long.valueOf(traceBean.getCreateTime()));
        contentValues.put(TraceBean.EXE_TIME, Long.valueOf(traceBean.getExeTime()));
        contentValues.put(TraceBean.UPDATE_TIME, Long.valueOf(traceBean.getUpdateTime()));
        contentValues.put("status", Integer.valueOf(traceBean.getStatus()));
        contentValues.put("uid", Long.valueOf(traceBean.getUid()));
        contentValues.put(TraceBean.SHARED_IDS, traceBean.getSharedIds());
        contentValues.put("params", traceBean.getParams());
        contentValues.put("action", traceBean.getAction());
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "648b273747e3bafe2fa66ed3f6f665ea", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "648b273747e3bafe2fa66ed3f6f665ea")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(TraceBean traceBean, String[] strArr) {
        Object[] objArr = {traceBean, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7053672a21fc468909d1f3bac1f43df7", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7053672a21fc468909d1f3bac1f43df7");
        }
        if (traceBean == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("name", hashSet)) {
            contentValues.put("name", traceBean.getName());
        }
        if (strArr == null || contains(TraceBean.TRACE_NAME, hashSet)) {
            contentValues.put(TraceBean.TRACE_NAME, traceBean.getTraceName());
        }
        if (strArr == null || contains("type", hashSet)) {
            contentValues.put("type", traceBean.getType());
        }
        if (strArr == null || contains(TraceBean.RULE, hashSet)) {
            contentValues.put(TraceBean.RULE, Integer.valueOf(traceBean.getRule()));
        }
        if (strArr == null || contains(TraceBean.TOOL, hashSet)) {
            contentValues.put(TraceBean.TOOL, Integer.valueOf(traceBean.getTool()));
        }
        if (strArr == null || contains(TraceBean.DEADLINE, hashSet)) {
            contentValues.put(TraceBean.DEADLINE, Long.valueOf(traceBean.getDeadline()));
        }
        if (strArr == null || contains(TraceBean.CREATE_TIME, hashSet)) {
            contentValues.put(TraceBean.CREATE_TIME, Long.valueOf(traceBean.getCreateTime()));
        }
        if (strArr == null || contains(TraceBean.EXE_TIME, hashSet)) {
            contentValues.put(TraceBean.EXE_TIME, Long.valueOf(traceBean.getExeTime()));
        }
        if (strArr == null || contains(TraceBean.UPDATE_TIME, hashSet)) {
            contentValues.put(TraceBean.UPDATE_TIME, Long.valueOf(traceBean.getUpdateTime()));
        }
        if (strArr == null || contains("status", hashSet)) {
            contentValues.put("status", Integer.valueOf(traceBean.getStatus()));
        }
        if (strArr == null || contains("uid", hashSet)) {
            contentValues.put("uid", Long.valueOf(traceBean.getUid()));
        }
        if (strArr == null || contains(TraceBean.SHARED_IDS, hashSet)) {
            contentValues.put(TraceBean.SHARED_IDS, traceBean.getSharedIds());
        }
        if (strArr == null || contains("params", hashSet)) {
            contentValues.put("params", traceBean.getParams());
        }
        if (strArr == null || contains("action", hashSet)) {
            contentValues.put("action", traceBean.getAction());
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public TraceBean query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0725021bc36b0f96ae3f51287a4d4035", 6917529027641081856L)) {
            return (TraceBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0725021bc36b0f96ae3f51287a4d4035");
        }
        if (cursor == null) {
            return null;
        }
        TraceBean traceBean = new TraceBean();
        int columnIndex = cursor.getColumnIndex("id");
        if (columnIndex != -1) {
            traceBean.setId(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("trace_id");
        if (columnIndex2 != -1) {
            traceBean.setTraceId(cursor.getLong(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("name");
        if (columnIndex3 != -1) {
            traceBean.setName(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(TraceBean.TRACE_NAME);
        if (columnIndex4 != -1) {
            traceBean.setTraceName(cursor.getString(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex("type");
        if (columnIndex5 != -1) {
            traceBean.setType(cursor.getString(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex(TraceBean.RULE);
        if (columnIndex6 != -1) {
            traceBean.setRule(cursor.getInt(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(TraceBean.TOOL);
        if (columnIndex7 != -1) {
            traceBean.setTool(cursor.getInt(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex(TraceBean.DEADLINE);
        if (columnIndex8 != -1) {
            traceBean.setDeadline(cursor.getLong(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex(TraceBean.CREATE_TIME);
        if (columnIndex9 != -1) {
            traceBean.setCreateTime(cursor.getLong(columnIndex9));
        }
        int columnIndex10 = cursor.getColumnIndex(TraceBean.EXE_TIME);
        if (columnIndex10 != -1) {
            traceBean.setExeTime(cursor.getLong(columnIndex10));
        }
        int columnIndex11 = cursor.getColumnIndex(TraceBean.UPDATE_TIME);
        if (columnIndex11 != -1) {
            traceBean.setUpdateTime(cursor.getLong(columnIndex11));
        }
        int columnIndex12 = cursor.getColumnIndex("status");
        if (columnIndex12 != -1) {
            traceBean.setStatus(cursor.getInt(columnIndex12));
        }
        int columnIndex13 = cursor.getColumnIndex("uid");
        if (columnIndex13 != -1) {
            traceBean.setUid(cursor.getLong(columnIndex13));
        }
        int columnIndex14 = cursor.getColumnIndex(TraceBean.SHARED_IDS);
        if (columnIndex14 != -1) {
            traceBean.setSharedIds(cursor.getString(columnIndex14));
        }
        int columnIndex15 = cursor.getColumnIndex("params");
        if (columnIndex15 != -1) {
            traceBean.setParams(cursor.getString(columnIndex15));
        }
        int columnIndex16 = cursor.getColumnIndex("action");
        if (columnIndex16 != -1) {
            traceBean.setAction(cursor.getString(columnIndex16));
        }
        return traceBean;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(TraceBean traceBean) {
        Object[] objArr = {traceBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4be9398cf4d45f0b5c0ef36bcd3ca570", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4be9398cf4d45f0b5c0ef36bcd3ca570");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id='" + traceBean.getId() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        sb.append("trace_id=" + traceBean.getTraceId());
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
