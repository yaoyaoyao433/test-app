package com.sankuai.xm.im.message.bean;

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
public class MsgAddition$$TableProxy implements TableProxy<MsgAddition> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(MsgAddition msgAddition) {
        Object[] objArr = {msgAddition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf4a3306dded3cce90e0e7fc41539ded", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf4a3306dded3cce90e0e7fc41539ded");
        }
        if (msgAddition == null) {
            return null;
        }
        d dVar = new d(MsgAddition.TABLE, msgAddition.getClass());
        dVar.a(MsgAddition.FROM, new a(MsgAddition.FROM, 5));
        dVar.a(MsgAddition.DT, new a(MsgAddition.DT, 8));
        dVar.a("did", new a("did", 1));
        a aVar = new a("msgid", 5);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        dVar.a("msgid", aVar);
        dVar.a("channel", new a("channel", 7));
        dVar.a("data", new a("data", 1));
        dVar.a(MsgAddition.RECEIVERS, new a(MsgAddition.RECEIVERS, 0));
        dVar.a("sts", new a("sts", 5));
        dVar.a("seqid", new a("seqid", 6));
        dVar.a(MsgAddition.FINAL, new a(MsgAddition.FINAL, 2));
        dVar.a("category", new a("category", 6));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(MsgAddition msgAddition) {
        Object[] objArr = {msgAddition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a4146faef25cc1fb4befb4f8d5d4d57", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a4146faef25cc1fb4befb4f8d5d4d57");
        }
        if (msgAddition == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MsgAddition.FROM, Long.valueOf(msgAddition.getFromUid()));
        contentValues.put(MsgAddition.DT, Byte.valueOf(msgAddition.getDeviceType()));
        contentValues.put("did", msgAddition.getDeviceId());
        contentValues.put("msgid", Long.valueOf(msgAddition.getMsgId()));
        contentValues.put("channel", Short.valueOf(msgAddition.getChannel()));
        contentValues.put("data", msgAddition.getAdditionData());
        contentValues.put(MsgAddition.RECEIVERS, msgAddition.getReceivers());
        contentValues.put("sts", Long.valueOf(msgAddition.getSts()));
        contentValues.put("seqid", Integer.valueOf(msgAddition.getSeqId()));
        contentValues.put(MsgAddition.FINAL, Integer.valueOf(msgAddition.isFinal() ? 1 : 0));
        contentValues.put("category", Integer.valueOf(msgAddition.getCategory()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fab54cb26287c49b6336912becb2351", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fab54cb26287c49b6336912becb2351")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(MsgAddition msgAddition, String[] strArr) {
        Object[] objArr = {msgAddition, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "917ff8e950a7c80e2bc7b0056f35fd4b", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "917ff8e950a7c80e2bc7b0056f35fd4b");
        }
        if (msgAddition == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains(MsgAddition.FROM, hashSet)) {
            contentValues.put(MsgAddition.FROM, Long.valueOf(msgAddition.getFromUid()));
        }
        if (strArr == null || contains(MsgAddition.DT, hashSet)) {
            contentValues.put(MsgAddition.DT, Byte.valueOf(msgAddition.getDeviceType()));
        }
        if (strArr == null || contains("did", hashSet)) {
            contentValues.put("did", msgAddition.getDeviceId());
        }
        if (strArr == null || contains("channel", hashSet)) {
            contentValues.put("channel", Short.valueOf(msgAddition.getChannel()));
        }
        if (strArr == null || contains("data", hashSet)) {
            contentValues.put("data", msgAddition.getAdditionData());
        }
        if (strArr == null || contains(MsgAddition.RECEIVERS, hashSet)) {
            contentValues.put(MsgAddition.RECEIVERS, msgAddition.getReceivers());
        }
        if (strArr == null || contains("sts", hashSet)) {
            contentValues.put("sts", Long.valueOf(msgAddition.getSts()));
        }
        if (strArr == null || contains("seqid", hashSet)) {
            contentValues.put("seqid", Integer.valueOf(msgAddition.getSeqId()));
        }
        if (strArr == null || contains(MsgAddition.FINAL, hashSet)) {
            contentValues.put(MsgAddition.FINAL, Integer.valueOf(msgAddition.isFinal() ? 1 : 0));
        }
        if (strArr == null || contains("category", hashSet)) {
            contentValues.put("category", Integer.valueOf(msgAddition.getCategory()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public MsgAddition query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67ddf5cf0ccb93f562c00dc8ff7ec950", 6917529027641081856L)) {
            return (MsgAddition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67ddf5cf0ccb93f562c00dc8ff7ec950");
        }
        if (cursor == null) {
            return null;
        }
        MsgAddition msgAddition = new MsgAddition();
        int columnIndex = cursor.getColumnIndex(MsgAddition.FROM);
        if (columnIndex != -1) {
            msgAddition.setFromUid(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex(MsgAddition.DT);
        if (columnIndex2 != -1) {
            msgAddition.setDeviceType((byte) cursor.getShort(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("did");
        if (columnIndex3 != -1) {
            msgAddition.setDeviceId(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex("msgid");
        if (columnIndex4 != -1) {
            msgAddition.setMsgId(cursor.getLong(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex("channel");
        if (columnIndex5 != -1) {
            msgAddition.setChannel(cursor.getShort(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex("data");
        if (columnIndex6 != -1) {
            msgAddition.setAdditionData(cursor.getString(columnIndex6));
        }
        cursor.getColumnIndex(MsgAddition.RECEIVERS);
        int columnIndex7 = cursor.getColumnIndex("sts");
        if (columnIndex7 != -1) {
            msgAddition.setSts(cursor.getLong(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex("seqid");
        if (columnIndex8 != -1) {
            msgAddition.setSeqId(cursor.getInt(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex(MsgAddition.FINAL);
        if (columnIndex9 != -1) {
            msgAddition.setFinal(cursor.getInt(columnIndex9) != 0);
        }
        int columnIndex10 = cursor.getColumnIndex("category");
        if (columnIndex10 != -1) {
            msgAddition.setCategory(cursor.getInt(columnIndex10));
        }
        return msgAddition;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(MsgAddition msgAddition) {
        Object[] objArr = {msgAddition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e400778cf29399da4ff90d1dc5a11e74", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e400778cf29399da4ff90d1dc5a11e74");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgid=" + msgAddition.getMsgId());
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
