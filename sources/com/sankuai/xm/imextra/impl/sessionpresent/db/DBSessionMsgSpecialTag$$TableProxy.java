package com.sankuai.xm.imextra.impl.sessionpresent.db;

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
public class DBSessionMsgSpecialTag$$TableProxy implements TableProxy<DBSessionMsgSpecialTag> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(DBSessionMsgSpecialTag dBSessionMsgSpecialTag) {
        Object[] objArr = {dBSessionMsgSpecialTag};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84bb8069dd29f30b1dc6d4b9b640a6ed", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84bb8069dd29f30b1dc6d4b9b640a6ed");
        }
        if (dBSessionMsgSpecialTag == null) {
            return null;
        }
        d dVar = new d(DBSessionMsgSpecialTag.TABLE, dBSessionMsgSpecialTag.getClass());
        dVar.a(new d.a("msg_uuid_index", "msgUuid", false));
        dVar.a(new d.a("channel_index", "channel", false));
        dVar.a(new d.a("chat_index", DBSessionMsgSpecialTag.CHAT, false));
        dVar.a(DBSessionMsgSpecialTag.CHAT, new com.sankuai.xm.base.tinyorm.a(DBSessionMsgSpecialTag.CHAT, 1));
        dVar.a("channel", new com.sankuai.xm.base.tinyorm.a("channel", 7));
        com.sankuai.xm.base.tinyorm.a aVar = new com.sankuai.xm.base.tinyorm.a("tag", 1);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        dVar.a("tag", aVar);
        com.sankuai.xm.base.tinyorm.a aVar2 = new com.sankuai.xm.base.tinyorm.a("msgUuid", 1);
        a.C1377a c1377a2 = new a.C1377a();
        c1377a2.a = false;
        aVar2.d = c1377a2;
        dVar.a(aVar2);
        dVar.a("msgUuid", aVar2);
        dVar.a("sts", new com.sankuai.xm.base.tinyorm.a("sts", 5));
        dVar.a("extension", new com.sankuai.xm.base.tinyorm.a("extension", 1));
        dVar.a(com.sankuai.xm.imextra.service.chatpresent.a.TERMINAL, new com.sankuai.xm.base.tinyorm.a(com.sankuai.xm.imextra.service.chatpresent.a.TERMINAL, 5));
        dVar.a("source", new com.sankuai.xm.base.tinyorm.a("source", 6));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(DBSessionMsgSpecialTag dBSessionMsgSpecialTag) {
        Object[] objArr = {dBSessionMsgSpecialTag};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f9f9129d630d80b8899e11a48968631", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f9f9129d630d80b8899e11a48968631");
        }
        if (dBSessionMsgSpecialTag == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBSessionMsgSpecialTag.CHAT, dBSessionMsgSpecialTag.getChatKey());
        contentValues.put("channel", Short.valueOf(dBSessionMsgSpecialTag.getChannel()));
        contentValues.put("tag", dBSessionMsgSpecialTag.getTag());
        contentValues.put("msgUuid", dBSessionMsgSpecialTag.getMsgUuid());
        contentValues.put("sts", Long.valueOf(dBSessionMsgSpecialTag.getSts()));
        contentValues.put("extension", dBSessionMsgSpecialTag.getExtension());
        contentValues.put(com.sankuai.xm.imextra.service.chatpresent.a.TERMINAL, Long.valueOf(dBSessionMsgSpecialTag.getTerminalTs()));
        contentValues.put("source", Integer.valueOf(dBSessionMsgSpecialTag.getSource()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "198959e39ea904cb04a4df9837a363cc", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "198959e39ea904cb04a4df9837a363cc")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(DBSessionMsgSpecialTag dBSessionMsgSpecialTag, String[] strArr) {
        Object[] objArr = {dBSessionMsgSpecialTag, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2c9af1f5298f023e2ca4a443c8cec7d", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2c9af1f5298f023e2ca4a443c8cec7d");
        }
        if (dBSessionMsgSpecialTag == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains(DBSessionMsgSpecialTag.CHAT, hashSet)) {
            contentValues.put(DBSessionMsgSpecialTag.CHAT, dBSessionMsgSpecialTag.getChatKey());
        }
        if (strArr == null || contains("channel", hashSet)) {
            contentValues.put("channel", Short.valueOf(dBSessionMsgSpecialTag.getChannel()));
        }
        if (strArr == null || contains("sts", hashSet)) {
            contentValues.put("sts", Long.valueOf(dBSessionMsgSpecialTag.getSts()));
        }
        if (strArr == null || contains("extension", hashSet)) {
            contentValues.put("extension", dBSessionMsgSpecialTag.getExtension());
        }
        if (strArr == null || contains(com.sankuai.xm.imextra.service.chatpresent.a.TERMINAL, hashSet)) {
            contentValues.put(com.sankuai.xm.imextra.service.chatpresent.a.TERMINAL, Long.valueOf(dBSessionMsgSpecialTag.getTerminalTs()));
        }
        if (strArr == null || contains("source", hashSet)) {
            contentValues.put("source", Integer.valueOf(dBSessionMsgSpecialTag.getSource()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public DBSessionMsgSpecialTag query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1acdb8c68e633e150dda6d0c2a4f8cff", 6917529027641081856L)) {
            return (DBSessionMsgSpecialTag) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1acdb8c68e633e150dda6d0c2a4f8cff");
        }
        if (cursor == null) {
            return null;
        }
        DBSessionMsgSpecialTag dBSessionMsgSpecialTag = new DBSessionMsgSpecialTag();
        int columnIndex = cursor.getColumnIndex(DBSessionMsgSpecialTag.CHAT);
        if (columnIndex != -1) {
            dBSessionMsgSpecialTag.setChatKey(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("channel");
        if (columnIndex2 != -1) {
            dBSessionMsgSpecialTag.setChannel(cursor.getShort(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("tag");
        if (columnIndex3 != -1) {
            dBSessionMsgSpecialTag.setTag(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex("msgUuid");
        if (columnIndex4 != -1) {
            dBSessionMsgSpecialTag.setMsgUuid(cursor.getString(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex("sts");
        if (columnIndex5 != -1) {
            dBSessionMsgSpecialTag.setSts(cursor.getLong(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex("extension");
        if (columnIndex6 != -1) {
            dBSessionMsgSpecialTag.setExtension(cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(com.sankuai.xm.imextra.service.chatpresent.a.TERMINAL);
        if (columnIndex7 != -1) {
            dBSessionMsgSpecialTag.setTerminalTs(cursor.getLong(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex("source");
        if (columnIndex8 != -1) {
            dBSessionMsgSpecialTag.setSource(cursor.getInt(columnIndex8));
        }
        return dBSessionMsgSpecialTag;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(DBSessionMsgSpecialTag dBSessionMsgSpecialTag) {
        Object[] objArr = {dBSessionMsgSpecialTag};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "859681b6671438a9e2909bc465af2749", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "859681b6671438a9e2909bc465af2749");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("tag='" + dBSessionMsgSpecialTag.getTag() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        sb.append("msgUuid='" + dBSessionMsgSpecialTag.getMsgUuid() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
