package com.sankuai.xm.im.session.entry;

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
public class SessionStamp$$TableProxy implements TableProxy<SessionStamp> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(SessionStamp sessionStamp) {
        Object[] objArr = {sessionStamp};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01c5aec02ee01537bdfe079d8358d338", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01c5aec02ee01537bdfe079d8358d338");
        }
        if (sessionStamp == null) {
            return null;
        }
        d dVar = new d(SessionStamp.TABLE_NAME, sessionStamp.getClass());
        dVar.a(new d.a("chat_stamp_unique_index", "chat_key", true));
        com.sankuai.xm.base.tinyorm.a aVar = new com.sankuai.xm.base.tinyorm.a("chat_key", 1);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        aVar.e = false;
        dVar.a("chat_key", aVar);
        dVar.a("max_sts", new com.sankuai.xm.base.tinyorm.a("max_sts", 5));
        dVar.a("max_msg_id", new com.sankuai.xm.base.tinyorm.a("max_msg_id", 5));
        dVar.a("max_my_cts", new com.sankuai.xm.base.tinyorm.a("max_my_cts", 5));
        dVar.a("max_other_cts", new com.sankuai.xm.base.tinyorm.a("max_other_cts", 5));
        dVar.a(SessionStamp.EARLIEST_STS, new com.sankuai.xm.base.tinyorm.a(SessionStamp.EARLIEST_STS, 5));
        dVar.a("extension", new com.sankuai.xm.base.tinyorm.a("extension", 1));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(SessionStamp sessionStamp) {
        Object[] objArr = {sessionStamp};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e186618f509c50144d7e6d59e62a41c", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e186618f509c50144d7e6d59e62a41c");
        }
        if (sessionStamp == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_key", sessionStamp.getChatKey());
        contentValues.put("max_sts", Long.valueOf(sessionStamp.getMaxSts()));
        contentValues.put("max_msg_id", Long.valueOf(sessionStamp.getMaxMsgId()));
        contentValues.put("max_my_cts", Long.valueOf(sessionStamp.getMaxMyCts()));
        contentValues.put("max_other_cts", Long.valueOf(sessionStamp.getMaxOthCts()));
        contentValues.put(SessionStamp.EARLIEST_STS, Long.valueOf(sessionStamp.getEarliestSts()));
        contentValues.put("extension", sessionStamp.getExtension());
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e5a1751e5da3d651e63e246c8d9f42c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e5a1751e5da3d651e63e246c8d9f42c")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(SessionStamp sessionStamp, String[] strArr) {
        Object[] objArr = {sessionStamp, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f605b224919e8f0d9add104c6f1e2f77", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f605b224919e8f0d9add104c6f1e2f77");
        }
        if (sessionStamp == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("max_sts", hashSet)) {
            contentValues.put("max_sts", Long.valueOf(sessionStamp.getMaxSts()));
        }
        if (strArr == null || contains("max_msg_id", hashSet)) {
            contentValues.put("max_msg_id", Long.valueOf(sessionStamp.getMaxMsgId()));
        }
        if (strArr == null || contains("max_my_cts", hashSet)) {
            contentValues.put("max_my_cts", Long.valueOf(sessionStamp.getMaxMyCts()));
        }
        if (strArr == null || contains("max_other_cts", hashSet)) {
            contentValues.put("max_other_cts", Long.valueOf(sessionStamp.getMaxOthCts()));
        }
        if (strArr == null || contains(SessionStamp.EARLIEST_STS, hashSet)) {
            contentValues.put(SessionStamp.EARLIEST_STS, Long.valueOf(sessionStamp.getEarliestSts()));
        }
        if (strArr == null || contains("extension", hashSet)) {
            contentValues.put("extension", sessionStamp.getExtension());
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public SessionStamp query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e347f65073739c87022116aecad68ee8", 6917529027641081856L)) {
            return (SessionStamp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e347f65073739c87022116aecad68ee8");
        }
        if (cursor == null) {
            return null;
        }
        SessionStamp sessionStamp = new SessionStamp();
        int columnIndex = cursor.getColumnIndex("chat_key");
        if (columnIndex != -1) {
            sessionStamp.setChatKey(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("max_sts");
        if (columnIndex2 != -1) {
            sessionStamp.setMaxSts(cursor.getLong(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("max_msg_id");
        if (columnIndex3 != -1) {
            sessionStamp.setMaxMsgId(cursor.getLong(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex("max_my_cts");
        if (columnIndex4 != -1) {
            sessionStamp.setMaxMyCts(cursor.getLong(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex("max_other_cts");
        if (columnIndex5 != -1) {
            sessionStamp.setMaxOthCts(cursor.getLong(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex(SessionStamp.EARLIEST_STS);
        if (columnIndex6 != -1) {
            sessionStamp.setEarliestSts(cursor.getLong(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex("extension");
        if (columnIndex7 != -1) {
            sessionStamp.setExtension(cursor.getString(columnIndex7));
        }
        return sessionStamp;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(SessionStamp sessionStamp) {
        Object[] objArr = {sessionStamp};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e3717a1b0d6353a4d56cbc145f98f29", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e3717a1b0d6353a4d56cbc145f98f29");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("chat_key='" + sessionStamp.getChatKey() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
