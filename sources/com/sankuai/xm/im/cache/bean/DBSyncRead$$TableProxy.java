package com.sankuai.xm.im.cache.bean;

import android.content.ContentValues;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.tinyorm.TableProxy;
import com.sankuai.xm.base.tinyorm.a;
import com.sankuai.xm.base.tinyorm.d;
import com.sankuai.xm.im.message.bean.SyncRead;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DBSyncRead$$TableProxy implements TableProxy<DBSyncRead> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(DBSyncRead dBSyncRead) {
        Object[] objArr = {dBSyncRead};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "518fb65bca0b528c9a2e8d3bbb9e3cf3", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "518fb65bca0b528c9a2e8d3bbb9e3cf3");
        }
        if (dBSyncRead == null) {
            return null;
        }
        d dVar = new d(DBSyncRead.TABLE_NAME, dBSyncRead.getClass());
        dVar.a(new d.a("read_unique_index", "chat_key", true));
        a aVar = new a("chat_key", 1);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        aVar.e = false;
        dVar.a("chat_key", aVar);
        dVar.a("channel", new a("channel", 7));
        dVar.a(DBSyncRead.PEER_APPID, new a(DBSyncRead.PEER_APPID, 7));
        dVar.a(SyncRead.LOCAL_CLIENT_STAMP, new a(SyncRead.LOCAL_CLIENT_STAMP, 5));
        dVar.a(SyncRead.REMOTE_CLIENT_STAMP, new a(SyncRead.REMOTE_CLIENT_STAMP, 5));
        dVar.a(SyncRead.LOCAL_SERVER_STAMP, new a(SyncRead.LOCAL_SERVER_STAMP, 5));
        dVar.a(SyncRead.REMOTE_SERVER_STAMP, new a(SyncRead.REMOTE_SERVER_STAMP, 5));
        dVar.a("times", new a("times", 6));
        dVar.a("uts", new a("uts", 5));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(DBSyncRead dBSyncRead) {
        Object[] objArr = {dBSyncRead};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60309759db103718a730ee29b03becd3", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60309759db103718a730ee29b03becd3");
        }
        if (dBSyncRead == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_key", dBSyncRead.getChatKey());
        contentValues.put("channel", Short.valueOf(dBSyncRead.getChannel()));
        contentValues.put(DBSyncRead.PEER_APPID, Short.valueOf(dBSyncRead.getPeerAppid()));
        contentValues.put(SyncRead.LOCAL_SERVER_STAMP, Long.valueOf(dBSyncRead.getLsts()));
        contentValues.put(SyncRead.REMOTE_SERVER_STAMP, Long.valueOf(dBSyncRead.getRsts()));
        contentValues.put("uts", Long.valueOf(dBSyncRead.getUpdateStamp()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3806263012f235e8385e64845540a867", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3806263012f235e8385e64845540a867")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(DBSyncRead dBSyncRead, String[] strArr) {
        Object[] objArr = {dBSyncRead, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc3dd96973c5ed8f00b7a3217b8eec79", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc3dd96973c5ed8f00b7a3217b8eec79");
        }
        if (dBSyncRead == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("channel", hashSet)) {
            contentValues.put("channel", Short.valueOf(dBSyncRead.getChannel()));
        }
        if (strArr == null || contains(DBSyncRead.PEER_APPID, hashSet)) {
            contentValues.put(DBSyncRead.PEER_APPID, Short.valueOf(dBSyncRead.getPeerAppid()));
        }
        if (strArr == null || contains(SyncRead.LOCAL_SERVER_STAMP, hashSet)) {
            contentValues.put(SyncRead.LOCAL_SERVER_STAMP, Long.valueOf(dBSyncRead.getLsts()));
        }
        if (strArr == null || contains(SyncRead.REMOTE_SERVER_STAMP, hashSet)) {
            contentValues.put(SyncRead.REMOTE_SERVER_STAMP, Long.valueOf(dBSyncRead.getRsts()));
        }
        if (strArr == null || contains("uts", hashSet)) {
            contentValues.put("uts", Long.valueOf(dBSyncRead.getUpdateStamp()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public DBSyncRead query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2c7ae29343aabb70bd079f16ae78762", 6917529027641081856L)) {
            return (DBSyncRead) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2c7ae29343aabb70bd079f16ae78762");
        }
        if (cursor == null) {
            return null;
        }
        DBSyncRead dBSyncRead = new DBSyncRead();
        int columnIndex = cursor.getColumnIndex("chat_key");
        if (columnIndex != -1) {
            dBSyncRead.setChatKey(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("channel");
        if (columnIndex2 != -1) {
            dBSyncRead.setChannel(cursor.getShort(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex(DBSyncRead.PEER_APPID);
        if (columnIndex3 != -1) {
            dBSyncRead.setPeerAppid(cursor.getShort(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(SyncRead.LOCAL_SERVER_STAMP);
        if (columnIndex4 != -1) {
            dBSyncRead.setLsts(cursor.getLong(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex(SyncRead.REMOTE_SERVER_STAMP);
        if (columnIndex5 != -1) {
            dBSyncRead.setRsts(cursor.getLong(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex("uts");
        if (columnIndex6 != -1) {
            dBSyncRead.setUpdateStamp(cursor.getLong(columnIndex6));
        }
        return dBSyncRead;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(DBSyncRead dBSyncRead) {
        Object[] objArr = {dBSyncRead};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d844ee5f26600fa4f386066eea3edcf2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d844ee5f26600fa4f386066eea3edcf2");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("chat_key='" + dBSyncRead.getChatKey() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
