package com.sankuai.xm.im.cache.bean;

import android.content.ContentValues;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.tinyorm.TableProxy;
import com.sankuai.xm.base.tinyorm.a;
import com.sankuai.xm.base.tinyorm.d;
import com.sankuai.xm.im.message.bean.Message;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DBSession$$TableProxy implements TableProxy<DBSession> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(DBSession dBSession) {
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "987417d442a0b3fb92cf4f70813166d6", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "987417d442a0b3fb92cf4f70813166d6");
        }
        if (dBSession == null) {
            return null;
        }
        d dVar = new d(DBSession.TABLE_NAME, dBSession.getClass());
        dVar.a(new d.a("session_key", "key", true));
        dVar.a(DBSession.UN_READ, new a(DBSession.UN_READ, 6));
        dVar.a("key", new a("key", 1));
        dVar.a("content", new a("content", 1));
        dVar.a(DBMessage.RESERVE_CONTENT_ONE, new a(DBMessage.RESERVE_CONTENT_ONE, 1));
        dVar.a(DBMessage.RESERVE_CONTENT_TWO, new a(DBMessage.RESERVE_CONTENT_TWO, 1));
        dVar.a(DBMessage.RESERVE_CONTENT_THREE, new a(DBMessage.RESERVE_CONTENT_THREE, 1));
        dVar.a(DBMessage.RESERVE_STRING_ONE, new a(DBMessage.RESERVE_STRING_ONE, 1));
        dVar.a(DBMessage.RESERVE_STRING_TWO, new a(DBMessage.RESERVE_STRING_TWO, 1));
        dVar.a(DBMessage.RESERVE_STRING_THREE, new a(DBMessage.RESERVE_STRING_THREE, 1));
        dVar.a(DBMessage.RESERVE_STRING_FOUR, new a(DBMessage.RESERVE_STRING_FOUR, 1));
        dVar.a(DBMessage.RESERVE_64_ONE, new a(DBMessage.RESERVE_64_ONE, 5));
        dVar.a(DBMessage.RESERVE_64_TWO, new a(DBMessage.RESERVE_64_TWO, 5));
        dVar.a(DBMessage.RESERVE_64_THREE, new a(DBMessage.RESERVE_64_THREE, 5));
        dVar.a(DBMessage.RESERVE_64_FOUR, new a(DBMessage.RESERVE_64_FOUR, 5));
        dVar.a(DBMessage.RESERVE_64_FIVE, new a(DBMessage.RESERVE_64_FIVE, 5));
        dVar.a(DBMessage.RESERVE_32_ONE, new a(DBMessage.RESERVE_32_ONE, 6));
        dVar.a(DBMessage.RESERVE_32_TWO, new a(DBMessage.RESERVE_32_TWO, 6));
        dVar.a(DBMessage.RESERVE_32_THREE, new a(DBMessage.RESERVE_32_THREE, 6));
        dVar.a(DBMessage.RESERVE_32_FOUR, new a(DBMessage.RESERVE_32_FOUR, 6));
        dVar.a(DBMessage.RESERVE_32_FIVE, new a(DBMessage.RESERVE_32_FIVE, 6));
        dVar.a(DBMessage.RESERVE_32_SIX, new a(DBMessage.RESERVE_32_SIX, 6));
        dVar.a("category", new a("category", 6));
        dVar.a(Message.PUB_CATEGORY, new a(Message.PUB_CATEGORY, 6));
        dVar.a("type", new a("type", 6));
        dVar.a("msgId", new a("msgId", 5));
        a aVar = new a("msgUuid", 1);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        dVar.a("msgUuid", aVar);
        dVar.a(Message.FROM_APPID, new a(Message.FROM_APPID, 7));
        dVar.a(Message.TO_APPID, new a(Message.TO_APPID, 7));
        dVar.a(Message.PEER_APPID, new a(Message.PEER_APPID, 7));
        dVar.a(Message.CHAT_ID, new a(Message.CHAT_ID, 5));
        dVar.a("fromUid", new a("fromUid", 5));
        dVar.a("fromName", new a("fromName", 1));
        dVar.a(Message.TO_UID, new a(Message.TO_UID, 5));
        dVar.a(Message.PEER_UID, new a(Message.PEER_UID, 5));
        dVar.a("sts", new a("sts", 5));
        dVar.a(Message.CTS, new a(Message.CTS, 5));
        dVar.a(Message.MSG_STATUS, new a(Message.MSG_STATUS, 6));
        dVar.a(Message.FILE_STATUS, new a(Message.FILE_STATUS, 6));
        dVar.a("extension", new a("extension", 1));
        dVar.a(Message.RECEIPT, new a(Message.RECEIPT, 2));
        dVar.a("direction", new a("direction", 6));
        dVar.a(Message.MSG_OPPOSITE_STATUS, new a(Message.MSG_OPPOSITE_STATUS, 6));
        dVar.a("errorCode", new a("errorCode", 6));
        dVar.a(Message.GROUP_NAME, new a(Message.GROUP_NAME, 1));
        dVar.a("channel", new a("channel", 7));
        dVar.a("version", new a("version", 5));
        dVar.a("seqid", new a("seqid", 5));
        dVar.a("flag", new a("flag", 5));
        dVar.a(Message.MSG_COMPATIBLE, new a(Message.MSG_COMPATIBLE, 1));
        dVar.a(Message.SID, new a(Message.SID, 1));
        dVar.a(Message.FROM_PUB_ID, new a(Message.FROM_PUB_ID, 5));
        dVar.a(Message.FROM_PUB_NAME, new a(Message.FROM_PUB_NAME, 1));
        dVar.a(Message.MSG_SOURCE, new a(Message.MSG_SOURCE, 8));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(DBSession dBSession) {
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "617f72f5d6322caf5c4c646c9edc9ec6", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "617f72f5d6322caf5c4c646c9edc9ec6");
        }
        if (dBSession == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBSession.UN_READ, Integer.valueOf(dBSession.getUnRead()));
        contentValues.put("key", dBSession.getKey());
        contentValues.put("content", dBSession.getContent());
        contentValues.put(DBMessage.RESERVE_CONTENT_ONE, dBSession.getReserveContentOne());
        contentValues.put(DBMessage.RESERVE_CONTENT_TWO, dBSession.getReserveContentTwo());
        contentValues.put(DBMessage.RESERVE_CONTENT_THREE, dBSession.getReserveContentThree());
        contentValues.put(DBMessage.RESERVE_STRING_ONE, dBSession.getReserveStringOne());
        contentValues.put(DBMessage.RESERVE_STRING_TWO, dBSession.getReserveStringTwo());
        contentValues.put(DBMessage.RESERVE_STRING_THREE, dBSession.getReserveStringThree());
        contentValues.put(DBMessage.RESERVE_STRING_FOUR, dBSession.getReserveStringFour());
        contentValues.put(DBMessage.RESERVE_64_ONE, Long.valueOf(dBSession.getReserve64One()));
        contentValues.put(DBMessage.RESERVE_64_TWO, Long.valueOf(dBSession.getReserve64Two()));
        contentValues.put(DBMessage.RESERVE_64_THREE, Long.valueOf(dBSession.getReserve64Three()));
        contentValues.put(DBMessage.RESERVE_64_FOUR, Long.valueOf(dBSession.getReserve64Four()));
        contentValues.put(DBMessage.RESERVE_64_FIVE, Long.valueOf(dBSession.getReserve64Five()));
        contentValues.put(DBMessage.RESERVE_32_ONE, Integer.valueOf(dBSession.getReserve32One()));
        contentValues.put(DBMessage.RESERVE_32_TWO, Integer.valueOf(dBSession.getReserve32Two()));
        contentValues.put(DBMessage.RESERVE_32_THREE, Integer.valueOf(dBSession.getReserve32Three()));
        contentValues.put(DBMessage.RESERVE_32_FOUR, Integer.valueOf(dBSession.getReserve32Four()));
        contentValues.put(DBMessage.RESERVE_32_FIVE, Integer.valueOf(dBSession.getReserve32Five()));
        contentValues.put(DBMessage.RESERVE_32_SIX, Integer.valueOf(dBSession.getReserve32Six()));
        contentValues.put("category", Integer.valueOf(dBSession.getCategory()));
        contentValues.put(Message.PUB_CATEGORY, Integer.valueOf(dBSession.getPubCategory()));
        contentValues.put("type", Integer.valueOf(dBSession.getMsgType()));
        contentValues.put("msgId", Long.valueOf(dBSession.getMsgId()));
        contentValues.put("msgUuid", dBSession.getMsgUuid());
        contentValues.put(Message.FROM_APPID, Short.valueOf(dBSession.getFromAppId()));
        contentValues.put(Message.TO_APPID, Short.valueOf(dBSession.getToAppId()));
        contentValues.put(Message.PEER_APPID, Short.valueOf(dBSession.getPeerAppId()));
        contentValues.put(Message.CHAT_ID, Long.valueOf(dBSession.getChatId()));
        contentValues.put("fromUid", Long.valueOf(dBSession.getFromUid()));
        contentValues.put("fromName", dBSession.getFromName());
        contentValues.put(Message.TO_UID, Long.valueOf(dBSession.getToUid()));
        contentValues.put(Message.PEER_UID, Long.valueOf(dBSession.getPeerUid()));
        contentValues.put("sts", Long.valueOf(dBSession.getSts()));
        contentValues.put(Message.CTS, Long.valueOf(dBSession.getCts()));
        contentValues.put(Message.MSG_STATUS, Integer.valueOf(dBSession.getMsgStatus()));
        contentValues.put(Message.FILE_STATUS, Integer.valueOf(dBSession.getFileStatus()));
        contentValues.put("extension", dBSession.getExtension());
        contentValues.put(Message.RECEIPT, Integer.valueOf(dBSession.isReceipt() ? 1 : 0));
        contentValues.put("direction", Integer.valueOf(dBSession.getDirection()));
        contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(dBSession.getMsgOppositeStatus()));
        contentValues.put("errorCode", Integer.valueOf(dBSession.getErrorCode()));
        contentValues.put(Message.GROUP_NAME, dBSession.getGroupName());
        contentValues.put("channel", Short.valueOf(dBSession.getChannel()));
        contentValues.put("version", Long.valueOf(dBSession.getMsgVersion()));
        contentValues.put("seqid", Long.valueOf(dBSession.getMsgSeqid()));
        contentValues.put("flag", Long.valueOf(dBSession.getMsgFlag()));
        contentValues.put(Message.MSG_COMPATIBLE, dBSession.getCompatible());
        contentValues.put(Message.SID, dBSession.getSID());
        contentValues.put(Message.FROM_PUB_ID, Long.valueOf(dBSession.getFromPubId()));
        contentValues.put(Message.FROM_PUB_NAME, dBSession.getFromPubName());
        contentValues.put(Message.MSG_SOURCE, Byte.valueOf(dBSession.getMsgSource()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "770511518fbd84a4c03a5db1078dd06e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "770511518fbd84a4c03a5db1078dd06e")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(DBSession dBSession, String[] strArr) {
        Object[] objArr = {dBSession, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d1cb7ead73b00f51755caca4e0f0772", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d1cb7ead73b00f51755caca4e0f0772");
        }
        if (dBSession == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains(DBSession.UN_READ, hashSet)) {
            contentValues.put(DBSession.UN_READ, Integer.valueOf(dBSession.getUnRead()));
        }
        if (strArr == null || contains("key", hashSet)) {
            contentValues.put("key", dBSession.getKey());
        }
        if (strArr == null || contains("content", hashSet)) {
            contentValues.put("content", dBSession.getContent());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_ONE, dBSession.getReserveContentOne());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_TWO, dBSession.getReserveContentTwo());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_THREE, dBSession.getReserveContentThree());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_ONE, dBSession.getReserveStringOne());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_TWO, dBSession.getReserveStringTwo());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_THREE, dBSession.getReserveStringThree());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_FOUR, dBSession.getReserveStringFour());
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_ONE, Long.valueOf(dBSession.getReserve64One()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_TWO, Long.valueOf(dBSession.getReserve64Two()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_THREE, Long.valueOf(dBSession.getReserve64Three()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_FOUR, Long.valueOf(dBSession.getReserve64Four()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_FIVE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_FIVE, Long.valueOf(dBSession.getReserve64Five()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_ONE, Integer.valueOf(dBSession.getReserve32One()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_TWO, Integer.valueOf(dBSession.getReserve32Two()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_THREE, Integer.valueOf(dBSession.getReserve32Three()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_FOUR, Integer.valueOf(dBSession.getReserve32Four()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_FIVE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_FIVE, Integer.valueOf(dBSession.getReserve32Five()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_SIX, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_SIX, Integer.valueOf(dBSession.getReserve32Six()));
        }
        if (strArr == null || contains("category", hashSet)) {
            contentValues.put("category", Integer.valueOf(dBSession.getCategory()));
        }
        if (strArr == null || contains(Message.PUB_CATEGORY, hashSet)) {
            contentValues.put(Message.PUB_CATEGORY, Integer.valueOf(dBSession.getPubCategory()));
        }
        if (strArr == null || contains("type", hashSet)) {
            contentValues.put("type", Integer.valueOf(dBSession.getMsgType()));
        }
        if (strArr == null || contains("msgId", hashSet)) {
            contentValues.put("msgId", Long.valueOf(dBSession.getMsgId()));
        }
        if (strArr == null || contains(Message.FROM_APPID, hashSet)) {
            contentValues.put(Message.FROM_APPID, Short.valueOf(dBSession.getFromAppId()));
        }
        if (strArr == null || contains(Message.TO_APPID, hashSet)) {
            contentValues.put(Message.TO_APPID, Short.valueOf(dBSession.getToAppId()));
        }
        if (strArr == null || contains(Message.PEER_APPID, hashSet)) {
            contentValues.put(Message.PEER_APPID, Short.valueOf(dBSession.getPeerAppId()));
        }
        if (strArr == null || contains(Message.CHAT_ID, hashSet)) {
            contentValues.put(Message.CHAT_ID, Long.valueOf(dBSession.getChatId()));
        }
        if (strArr == null || contains("fromUid", hashSet)) {
            contentValues.put("fromUid", Long.valueOf(dBSession.getFromUid()));
        }
        if (strArr == null || contains("fromName", hashSet)) {
            contentValues.put("fromName", dBSession.getFromName());
        }
        if (strArr == null || contains(Message.TO_UID, hashSet)) {
            contentValues.put(Message.TO_UID, Long.valueOf(dBSession.getToUid()));
        }
        if (strArr == null || contains(Message.PEER_UID, hashSet)) {
            contentValues.put(Message.PEER_UID, Long.valueOf(dBSession.getPeerUid()));
        }
        if (strArr == null || contains("sts", hashSet)) {
            contentValues.put("sts", Long.valueOf(dBSession.getSts()));
        }
        if (strArr == null || contains(Message.CTS, hashSet)) {
            contentValues.put(Message.CTS, Long.valueOf(dBSession.getCts()));
        }
        if (strArr == null || contains(Message.MSG_STATUS, hashSet)) {
            contentValues.put(Message.MSG_STATUS, Integer.valueOf(dBSession.getMsgStatus()));
        }
        if (strArr == null || contains(Message.FILE_STATUS, hashSet)) {
            contentValues.put(Message.FILE_STATUS, Integer.valueOf(dBSession.getFileStatus()));
        }
        if (strArr == null || contains("extension", hashSet)) {
            contentValues.put("extension", dBSession.getExtension());
        }
        if (strArr == null || contains(Message.RECEIPT, hashSet)) {
            contentValues.put(Message.RECEIPT, Integer.valueOf(dBSession.isReceipt() ? 1 : 0));
        }
        if (strArr == null || contains("direction", hashSet)) {
            contentValues.put("direction", Integer.valueOf(dBSession.getDirection()));
        }
        if (strArr == null || contains(Message.MSG_OPPOSITE_STATUS, hashSet)) {
            contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(dBSession.getMsgOppositeStatus()));
        }
        if (strArr == null || contains("errorCode", hashSet)) {
            contentValues.put("errorCode", Integer.valueOf(dBSession.getErrorCode()));
        }
        if (strArr == null || contains(Message.GROUP_NAME, hashSet)) {
            contentValues.put(Message.GROUP_NAME, dBSession.getGroupName());
        }
        if (strArr == null || contains("channel", hashSet)) {
            contentValues.put("channel", Short.valueOf(dBSession.getChannel()));
        }
        if (strArr == null || contains("version", hashSet)) {
            contentValues.put("version", Long.valueOf(dBSession.getMsgVersion()));
        }
        if (strArr == null || contains("seqid", hashSet)) {
            contentValues.put("seqid", Long.valueOf(dBSession.getMsgSeqid()));
        }
        if (strArr == null || contains("flag", hashSet)) {
            contentValues.put("flag", Long.valueOf(dBSession.getMsgFlag()));
        }
        if (strArr == null || contains(Message.MSG_COMPATIBLE, hashSet)) {
            contentValues.put(Message.MSG_COMPATIBLE, dBSession.getCompatible());
        }
        if (strArr == null || contains(Message.SID, hashSet)) {
            contentValues.put(Message.SID, dBSession.getSID());
        }
        if (strArr == null || contains(Message.FROM_PUB_ID, hashSet)) {
            contentValues.put(Message.FROM_PUB_ID, Long.valueOf(dBSession.getFromPubId()));
        }
        if (strArr == null || contains(Message.FROM_PUB_NAME, hashSet)) {
            contentValues.put(Message.FROM_PUB_NAME, dBSession.getFromPubName());
        }
        if (strArr == null || contains(Message.MSG_SOURCE, hashSet)) {
            contentValues.put(Message.MSG_SOURCE, Byte.valueOf(dBSession.getMsgSource()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public DBSession query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2843541e06ee7d325725dc96df587ad", 6917529027641081856L)) {
            return (DBSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2843541e06ee7d325725dc96df587ad");
        }
        if (cursor == null) {
            return null;
        }
        DBSession dBSession = new DBSession();
        int columnIndex = cursor.getColumnIndex(DBSession.UN_READ);
        if (columnIndex != -1) {
            dBSession.setUnRead(cursor.getInt(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("key");
        if (columnIndex2 != -1) {
            dBSession.setKey(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("content");
        if (columnIndex3 != -1) {
            dBSession.setContent(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_ONE);
        if (columnIndex4 != -1) {
            dBSession.setReserveContentOne(cursor.getString(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_TWO);
        if (columnIndex5 != -1) {
            dBSession.setReserveContentTwo(cursor.getString(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_THREE);
        if (columnIndex6 != -1) {
            dBSession.setReserveContentThree(cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_ONE);
        if (columnIndex7 != -1) {
            dBSession.setReserveStringOne(cursor.getString(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_TWO);
        if (columnIndex8 != -1) {
            dBSession.setReserveStringTwo(cursor.getString(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_THREE);
        if (columnIndex9 != -1) {
            dBSession.setReserveStringThree(cursor.getString(columnIndex9));
        }
        int columnIndex10 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_FOUR);
        if (columnIndex10 != -1) {
            dBSession.setReserveStringFour(cursor.getString(columnIndex10));
        }
        int columnIndex11 = cursor.getColumnIndex(DBMessage.RESERVE_64_ONE);
        if (columnIndex11 != -1) {
            dBSession.setReserve64One(cursor.getLong(columnIndex11));
        }
        int columnIndex12 = cursor.getColumnIndex(DBMessage.RESERVE_64_TWO);
        if (columnIndex12 != -1) {
            dBSession.setReserve64Two(cursor.getLong(columnIndex12));
        }
        int columnIndex13 = cursor.getColumnIndex(DBMessage.RESERVE_64_THREE);
        if (columnIndex13 != -1) {
            dBSession.setReserve64Three(cursor.getLong(columnIndex13));
        }
        int columnIndex14 = cursor.getColumnIndex(DBMessage.RESERVE_64_FOUR);
        if (columnIndex14 != -1) {
            dBSession.setReserve64Four(cursor.getLong(columnIndex14));
        }
        int columnIndex15 = cursor.getColumnIndex(DBMessage.RESERVE_64_FIVE);
        if (columnIndex15 != -1) {
            dBSession.setReserve64Five(cursor.getLong(columnIndex15));
        }
        int columnIndex16 = cursor.getColumnIndex(DBMessage.RESERVE_32_ONE);
        if (columnIndex16 != -1) {
            dBSession.setReserve32One(cursor.getInt(columnIndex16));
        }
        int columnIndex17 = cursor.getColumnIndex(DBMessage.RESERVE_32_TWO);
        if (columnIndex17 != -1) {
            dBSession.setReserve32Two(cursor.getInt(columnIndex17));
        }
        int columnIndex18 = cursor.getColumnIndex(DBMessage.RESERVE_32_THREE);
        if (columnIndex18 != -1) {
            dBSession.setReserve32Three(cursor.getInt(columnIndex18));
        }
        int columnIndex19 = cursor.getColumnIndex(DBMessage.RESERVE_32_FOUR);
        if (columnIndex19 != -1) {
            dBSession.setReserve32Four(cursor.getInt(columnIndex19));
        }
        int columnIndex20 = cursor.getColumnIndex(DBMessage.RESERVE_32_FIVE);
        if (columnIndex20 != -1) {
            dBSession.setReserve32Five(cursor.getInt(columnIndex20));
        }
        int columnIndex21 = cursor.getColumnIndex(DBMessage.RESERVE_32_SIX);
        if (columnIndex21 != -1) {
            dBSession.setReserve32Six(cursor.getInt(columnIndex21));
        }
        int columnIndex22 = cursor.getColumnIndex("category");
        if (columnIndex22 != -1) {
            dBSession.setCategory(cursor.getInt(columnIndex22));
        }
        int columnIndex23 = cursor.getColumnIndex(Message.PUB_CATEGORY);
        if (columnIndex23 != -1) {
            dBSession.setPubCategory(cursor.getInt(columnIndex23));
        }
        int columnIndex24 = cursor.getColumnIndex("type");
        if (columnIndex24 != -1) {
            dBSession.setMsgType(cursor.getInt(columnIndex24));
        }
        int columnIndex25 = cursor.getColumnIndex("msgId");
        if (columnIndex25 != -1) {
            dBSession.setMsgId(cursor.getLong(columnIndex25));
        }
        int columnIndex26 = cursor.getColumnIndex("msgUuid");
        if (columnIndex26 != -1) {
            dBSession.setMsgUuid(cursor.getString(columnIndex26));
        }
        int columnIndex27 = cursor.getColumnIndex(Message.FROM_APPID);
        if (columnIndex27 != -1) {
            dBSession.setFromAppId(cursor.getShort(columnIndex27));
        }
        int columnIndex28 = cursor.getColumnIndex(Message.TO_APPID);
        if (columnIndex28 != -1) {
            dBSession.setToAppId(cursor.getShort(columnIndex28));
        }
        int columnIndex29 = cursor.getColumnIndex(Message.PEER_APPID);
        if (columnIndex29 != -1) {
            dBSession.setPeerAppId(cursor.getShort(columnIndex29));
        }
        int columnIndex30 = cursor.getColumnIndex(Message.CHAT_ID);
        if (columnIndex30 != -1) {
            dBSession.setChatId(cursor.getLong(columnIndex30));
        }
        int columnIndex31 = cursor.getColumnIndex("fromUid");
        if (columnIndex31 != -1) {
            dBSession.setFromUid(cursor.getLong(columnIndex31));
        }
        int columnIndex32 = cursor.getColumnIndex("fromName");
        if (columnIndex32 != -1) {
            dBSession.setFromName(cursor.getString(columnIndex32));
        }
        int columnIndex33 = cursor.getColumnIndex(Message.TO_UID);
        if (columnIndex33 != -1) {
            dBSession.setToUid(cursor.getLong(columnIndex33));
        }
        int columnIndex34 = cursor.getColumnIndex(Message.PEER_UID);
        if (columnIndex34 != -1) {
            dBSession.setPeerUid(cursor.getLong(columnIndex34));
        }
        int columnIndex35 = cursor.getColumnIndex("sts");
        if (columnIndex35 != -1) {
            dBSession.setSts(cursor.getLong(columnIndex35));
        }
        int columnIndex36 = cursor.getColumnIndex(Message.CTS);
        if (columnIndex36 != -1) {
            dBSession.setCts(cursor.getLong(columnIndex36));
        }
        int columnIndex37 = cursor.getColumnIndex(Message.MSG_STATUS);
        if (columnIndex37 != -1) {
            dBSession.setMsgStatus(cursor.getInt(columnIndex37));
        }
        int columnIndex38 = cursor.getColumnIndex(Message.FILE_STATUS);
        if (columnIndex38 != -1) {
            dBSession.setFileStatus(cursor.getInt(columnIndex38));
        }
        int columnIndex39 = cursor.getColumnIndex("extension");
        if (columnIndex39 != -1) {
            dBSession.setExtension(cursor.getString(columnIndex39));
        }
        int columnIndex40 = cursor.getColumnIndex(Message.RECEIPT);
        if (columnIndex40 != -1) {
            dBSession.setReceipt(cursor.getInt(columnIndex40) != 0);
        }
        int columnIndex41 = cursor.getColumnIndex("direction");
        if (columnIndex41 != -1) {
            dBSession.setDirection(cursor.getInt(columnIndex41));
        }
        int columnIndex42 = cursor.getColumnIndex(Message.MSG_OPPOSITE_STATUS);
        if (columnIndex42 != -1) {
            dBSession.setMsgOppositeStatus(cursor.getInt(columnIndex42));
        }
        int columnIndex43 = cursor.getColumnIndex("errorCode");
        if (columnIndex43 != -1) {
            dBSession.setErrorCode(cursor.getInt(columnIndex43));
        }
        int columnIndex44 = cursor.getColumnIndex(Message.GROUP_NAME);
        if (columnIndex44 != -1) {
            dBSession.setGroupName(cursor.getString(columnIndex44));
        }
        int columnIndex45 = cursor.getColumnIndex("channel");
        if (columnIndex45 != -1) {
            dBSession.setChannel(cursor.getShort(columnIndex45));
        }
        int columnIndex46 = cursor.getColumnIndex("version");
        if (columnIndex46 != -1) {
            dBSession.setMsgVersion(cursor.getLong(columnIndex46));
        }
        int columnIndex47 = cursor.getColumnIndex("seqid");
        if (columnIndex47 != -1) {
            dBSession.setMsgSeqid(cursor.getLong(columnIndex47));
        }
        int columnIndex48 = cursor.getColumnIndex("flag");
        if (columnIndex48 != -1) {
            dBSession.setMsgFlag(cursor.getLong(columnIndex48));
        }
        int columnIndex49 = cursor.getColumnIndex(Message.MSG_COMPATIBLE);
        if (columnIndex49 != -1) {
            dBSession.setCompatible(cursor.getString(columnIndex49));
        }
        int columnIndex50 = cursor.getColumnIndex(Message.SID);
        if (columnIndex50 != -1) {
            dBSession.setSID(cursor.getString(columnIndex50));
        }
        int columnIndex51 = cursor.getColumnIndex(Message.FROM_PUB_ID);
        if (columnIndex51 != -1) {
            dBSession.setFromPubId(cursor.getLong(columnIndex51));
        }
        int columnIndex52 = cursor.getColumnIndex(Message.FROM_PUB_NAME);
        if (columnIndex52 != -1) {
            dBSession.setFromPubName(cursor.getString(columnIndex52));
        }
        int columnIndex53 = cursor.getColumnIndex(Message.MSG_SOURCE);
        if (columnIndex53 != -1) {
            dBSession.setMsgSource((byte) cursor.getShort(columnIndex53));
        }
        return dBSession;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(DBSession dBSession) {
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f46dd8744394bd2f8bfce7f5cad3962a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f46dd8744394bd2f8bfce7f5cad3962a");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgUuid='" + dBSession.getMsgUuid() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
