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
public class PubDBMessage$$TableProxy implements TableProxy<PubDBMessage> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(PubDBMessage pubDBMessage) {
        Object[] objArr = {pubDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6516491e7f3dacabe3b8749e1d7078b6", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6516491e7f3dacabe3b8749e1d7078b6");
        }
        if (pubDBMessage == null) {
            return null;
        }
        d dVar = new d(PubDBMessage.TABLE_NAME, pubDBMessage.getClass());
        dVar.a(new d.a("pub_message_uuid_index", "msgUuid", true));
        dVar.a(new d.a("pub_message_sender_index", "fromUid", false));
        dVar.a(new d.a("pub_message_session_cts_index", "chatId,peerUid,channel,cts", false));
        dVar.a(new d.a("pub_message_session_sts_index", "chatId,peerUid,channel,sts", false));
        dVar.a(new d.a("pub_message_cts_index", Message.CTS, false));
        dVar.a(new d.a("pub_msgid_index", "msgid", false));
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
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(PubDBMessage pubDBMessage) {
        Object[] objArr = {pubDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5fba352c45d8ec58034f642ffc8e194", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5fba352c45d8ec58034f642ffc8e194");
        }
        if (pubDBMessage == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("content", pubDBMessage.getContent());
        contentValues.put(DBMessage.RESERVE_CONTENT_ONE, pubDBMessage.getReserveContentOne());
        contentValues.put(DBMessage.RESERVE_CONTENT_TWO, pubDBMessage.getReserveContentTwo());
        contentValues.put(DBMessage.RESERVE_CONTENT_THREE, pubDBMessage.getReserveContentThree());
        contentValues.put(DBMessage.RESERVE_STRING_ONE, pubDBMessage.getReserveStringOne());
        contentValues.put(DBMessage.RESERVE_STRING_TWO, pubDBMessage.getReserveStringTwo());
        contentValues.put(DBMessage.RESERVE_STRING_THREE, pubDBMessage.getReserveStringThree());
        contentValues.put(DBMessage.RESERVE_STRING_FOUR, pubDBMessage.getReserveStringFour());
        contentValues.put(DBMessage.RESERVE_64_ONE, Long.valueOf(pubDBMessage.getReserve64One()));
        contentValues.put(DBMessage.RESERVE_64_TWO, Long.valueOf(pubDBMessage.getReserve64Two()));
        contentValues.put(DBMessage.RESERVE_64_THREE, Long.valueOf(pubDBMessage.getReserve64Three()));
        contentValues.put(DBMessage.RESERVE_64_FOUR, Long.valueOf(pubDBMessage.getReserve64Four()));
        contentValues.put(DBMessage.RESERVE_64_FIVE, Long.valueOf(pubDBMessage.getReserve64Five()));
        contentValues.put(DBMessage.RESERVE_32_ONE, Integer.valueOf(pubDBMessage.getReserve32One()));
        contentValues.put(DBMessage.RESERVE_32_TWO, Integer.valueOf(pubDBMessage.getReserve32Two()));
        contentValues.put(DBMessage.RESERVE_32_THREE, Integer.valueOf(pubDBMessage.getReserve32Three()));
        contentValues.put(DBMessage.RESERVE_32_FOUR, Integer.valueOf(pubDBMessage.getReserve32Four()));
        contentValues.put(DBMessage.RESERVE_32_FIVE, Integer.valueOf(pubDBMessage.getReserve32Five()));
        contentValues.put(DBMessage.RESERVE_32_SIX, Integer.valueOf(pubDBMessage.getReserve32Six()));
        contentValues.put("category", Integer.valueOf(pubDBMessage.getCategory()));
        contentValues.put(Message.PUB_CATEGORY, Integer.valueOf(pubDBMessage.getPubCategory()));
        contentValues.put("type", Integer.valueOf(pubDBMessage.getMsgType()));
        contentValues.put("msgId", Long.valueOf(pubDBMessage.getMsgId()));
        contentValues.put("msgUuid", pubDBMessage.getMsgUuid());
        contentValues.put(Message.FROM_APPID, Short.valueOf(pubDBMessage.getFromAppId()));
        contentValues.put(Message.TO_APPID, Short.valueOf(pubDBMessage.getToAppId()));
        contentValues.put(Message.PEER_APPID, Short.valueOf(pubDBMessage.getPeerAppId()));
        contentValues.put(Message.CHAT_ID, Long.valueOf(pubDBMessage.getChatId()));
        contentValues.put("fromUid", Long.valueOf(pubDBMessage.getFromUid()));
        contentValues.put("fromName", pubDBMessage.getFromName());
        contentValues.put(Message.TO_UID, Long.valueOf(pubDBMessage.getToUid()));
        contentValues.put(Message.PEER_UID, Long.valueOf(pubDBMessage.getPeerUid()));
        contentValues.put("sts", Long.valueOf(pubDBMessage.getSts()));
        contentValues.put(Message.CTS, Long.valueOf(pubDBMessage.getCts()));
        contentValues.put(Message.MSG_STATUS, Integer.valueOf(pubDBMessage.getMsgStatus()));
        contentValues.put(Message.FILE_STATUS, Integer.valueOf(pubDBMessage.getFileStatus()));
        contentValues.put("extension", pubDBMessage.getExtension());
        contentValues.put(Message.RECEIPT, Integer.valueOf(pubDBMessage.isReceipt() ? 1 : 0));
        contentValues.put("direction", Integer.valueOf(pubDBMessage.getDirection()));
        contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(pubDBMessage.getMsgOppositeStatus()));
        contentValues.put("errorCode", Integer.valueOf(pubDBMessage.getErrorCode()));
        contentValues.put(Message.GROUP_NAME, pubDBMessage.getGroupName());
        contentValues.put("channel", Short.valueOf(pubDBMessage.getChannel()));
        contentValues.put("version", Long.valueOf(pubDBMessage.getMsgVersion()));
        contentValues.put("seqid", Long.valueOf(pubDBMessage.getMsgSeqid()));
        contentValues.put("flag", Long.valueOf(pubDBMessage.getMsgFlag()));
        contentValues.put(Message.MSG_COMPATIBLE, pubDBMessage.getCompatible());
        contentValues.put(Message.SID, pubDBMessage.getSID());
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa4b5ae40fad17aa3667f921faef43df", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa4b5ae40fad17aa3667f921faef43df")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(PubDBMessage pubDBMessage, String[] strArr) {
        Object[] objArr = {pubDBMessage, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c77c957dc39cedf6c03edee92b1c78f", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c77c957dc39cedf6c03edee92b1c78f");
        }
        if (pubDBMessage == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("content", hashSet)) {
            contentValues.put("content", pubDBMessage.getContent());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_ONE, pubDBMessage.getReserveContentOne());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_TWO, pubDBMessage.getReserveContentTwo());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_THREE, pubDBMessage.getReserveContentThree());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_ONE, pubDBMessage.getReserveStringOne());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_TWO, pubDBMessage.getReserveStringTwo());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_THREE, pubDBMessage.getReserveStringThree());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_FOUR, pubDBMessage.getReserveStringFour());
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_ONE, Long.valueOf(pubDBMessage.getReserve64One()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_TWO, Long.valueOf(pubDBMessage.getReserve64Two()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_THREE, Long.valueOf(pubDBMessage.getReserve64Three()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_FOUR, Long.valueOf(pubDBMessage.getReserve64Four()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_FIVE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_FIVE, Long.valueOf(pubDBMessage.getReserve64Five()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_ONE, Integer.valueOf(pubDBMessage.getReserve32One()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_TWO, Integer.valueOf(pubDBMessage.getReserve32Two()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_THREE, Integer.valueOf(pubDBMessage.getReserve32Three()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_FOUR, Integer.valueOf(pubDBMessage.getReserve32Four()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_FIVE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_FIVE, Integer.valueOf(pubDBMessage.getReserve32Five()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_SIX, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_SIX, Integer.valueOf(pubDBMessage.getReserve32Six()));
        }
        if (strArr == null || contains("category", hashSet)) {
            contentValues.put("category", Integer.valueOf(pubDBMessage.getCategory()));
        }
        if (strArr == null || contains(Message.PUB_CATEGORY, hashSet)) {
            contentValues.put(Message.PUB_CATEGORY, Integer.valueOf(pubDBMessage.getPubCategory()));
        }
        if (strArr == null || contains("type", hashSet)) {
            contentValues.put("type", Integer.valueOf(pubDBMessage.getMsgType()));
        }
        if (strArr == null || contains("msgId", hashSet)) {
            contentValues.put("msgId", Long.valueOf(pubDBMessage.getMsgId()));
        }
        if (strArr == null || contains(Message.FROM_APPID, hashSet)) {
            contentValues.put(Message.FROM_APPID, Short.valueOf(pubDBMessage.getFromAppId()));
        }
        if (strArr == null || contains(Message.TO_APPID, hashSet)) {
            contentValues.put(Message.TO_APPID, Short.valueOf(pubDBMessage.getToAppId()));
        }
        if (strArr == null || contains(Message.PEER_APPID, hashSet)) {
            contentValues.put(Message.PEER_APPID, Short.valueOf(pubDBMessage.getPeerAppId()));
        }
        if (strArr == null || contains(Message.CHAT_ID, hashSet)) {
            contentValues.put(Message.CHAT_ID, Long.valueOf(pubDBMessage.getChatId()));
        }
        if (strArr == null || contains("fromUid", hashSet)) {
            contentValues.put("fromUid", Long.valueOf(pubDBMessage.getFromUid()));
        }
        if (strArr == null || contains("fromName", hashSet)) {
            contentValues.put("fromName", pubDBMessage.getFromName());
        }
        if (strArr == null || contains(Message.TO_UID, hashSet)) {
            contentValues.put(Message.TO_UID, Long.valueOf(pubDBMessage.getToUid()));
        }
        if (strArr == null || contains(Message.PEER_UID, hashSet)) {
            contentValues.put(Message.PEER_UID, Long.valueOf(pubDBMessage.getPeerUid()));
        }
        if (strArr == null || contains("sts", hashSet)) {
            contentValues.put("sts", Long.valueOf(pubDBMessage.getSts()));
        }
        if (strArr == null || contains(Message.CTS, hashSet)) {
            contentValues.put(Message.CTS, Long.valueOf(pubDBMessage.getCts()));
        }
        if (strArr == null || contains(Message.MSG_STATUS, hashSet)) {
            contentValues.put(Message.MSG_STATUS, Integer.valueOf(pubDBMessage.getMsgStatus()));
        }
        if (strArr == null || contains(Message.FILE_STATUS, hashSet)) {
            contentValues.put(Message.FILE_STATUS, Integer.valueOf(pubDBMessage.getFileStatus()));
        }
        if (strArr == null || contains("extension", hashSet)) {
            contentValues.put("extension", pubDBMessage.getExtension());
        }
        if (strArr == null || contains(Message.RECEIPT, hashSet)) {
            contentValues.put(Message.RECEIPT, Integer.valueOf(pubDBMessage.isReceipt() ? 1 : 0));
        }
        if (strArr == null || contains("direction", hashSet)) {
            contentValues.put("direction", Integer.valueOf(pubDBMessage.getDirection()));
        }
        if (strArr == null || contains(Message.MSG_OPPOSITE_STATUS, hashSet)) {
            contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(pubDBMessage.getMsgOppositeStatus()));
        }
        if (strArr == null || contains("errorCode", hashSet)) {
            contentValues.put("errorCode", Integer.valueOf(pubDBMessage.getErrorCode()));
        }
        if (strArr == null || contains(Message.GROUP_NAME, hashSet)) {
            contentValues.put(Message.GROUP_NAME, pubDBMessage.getGroupName());
        }
        if (strArr == null || contains("channel", hashSet)) {
            contentValues.put("channel", Short.valueOf(pubDBMessage.getChannel()));
        }
        if (strArr == null || contains("version", hashSet)) {
            contentValues.put("version", Long.valueOf(pubDBMessage.getMsgVersion()));
        }
        if (strArr == null || contains("seqid", hashSet)) {
            contentValues.put("seqid", Long.valueOf(pubDBMessage.getMsgSeqid()));
        }
        if (strArr == null || contains("flag", hashSet)) {
            contentValues.put("flag", Long.valueOf(pubDBMessage.getMsgFlag()));
        }
        if (strArr == null || contains(Message.MSG_COMPATIBLE, hashSet)) {
            contentValues.put(Message.MSG_COMPATIBLE, pubDBMessage.getCompatible());
        }
        if (strArr == null || contains(Message.SID, hashSet)) {
            contentValues.put(Message.SID, pubDBMessage.getSID());
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public PubDBMessage query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "518dbf27146504ca787c793647719c4a", 6917529027641081856L)) {
            return (PubDBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "518dbf27146504ca787c793647719c4a");
        }
        if (cursor == null) {
            return null;
        }
        PubDBMessage pubDBMessage = new PubDBMessage();
        int columnIndex = cursor.getColumnIndex("content");
        if (columnIndex != -1) {
            pubDBMessage.setContent(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_ONE);
        if (columnIndex2 != -1) {
            pubDBMessage.setReserveContentOne(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_TWO);
        if (columnIndex3 != -1) {
            pubDBMessage.setReserveContentTwo(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_THREE);
        if (columnIndex4 != -1) {
            pubDBMessage.setReserveContentThree(cursor.getString(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_ONE);
        if (columnIndex5 != -1) {
            pubDBMessage.setReserveStringOne(cursor.getString(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_TWO);
        if (columnIndex6 != -1) {
            pubDBMessage.setReserveStringTwo(cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_THREE);
        if (columnIndex7 != -1) {
            pubDBMessage.setReserveStringThree(cursor.getString(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_FOUR);
        if (columnIndex8 != -1) {
            pubDBMessage.setReserveStringFour(cursor.getString(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex(DBMessage.RESERVE_64_ONE);
        if (columnIndex9 != -1) {
            pubDBMessage.setReserve64One(cursor.getLong(columnIndex9));
        }
        int columnIndex10 = cursor.getColumnIndex(DBMessage.RESERVE_64_TWO);
        if (columnIndex10 != -1) {
            pubDBMessage.setReserve64Two(cursor.getLong(columnIndex10));
        }
        int columnIndex11 = cursor.getColumnIndex(DBMessage.RESERVE_64_THREE);
        if (columnIndex11 != -1) {
            pubDBMessage.setReserve64Three(cursor.getLong(columnIndex11));
        }
        int columnIndex12 = cursor.getColumnIndex(DBMessage.RESERVE_64_FOUR);
        if (columnIndex12 != -1) {
            pubDBMessage.setReserve64Four(cursor.getLong(columnIndex12));
        }
        int columnIndex13 = cursor.getColumnIndex(DBMessage.RESERVE_64_FIVE);
        if (columnIndex13 != -1) {
            pubDBMessage.setReserve64Five(cursor.getLong(columnIndex13));
        }
        int columnIndex14 = cursor.getColumnIndex(DBMessage.RESERVE_32_ONE);
        if (columnIndex14 != -1) {
            pubDBMessage.setReserve32One(cursor.getInt(columnIndex14));
        }
        int columnIndex15 = cursor.getColumnIndex(DBMessage.RESERVE_32_TWO);
        if (columnIndex15 != -1) {
            pubDBMessage.setReserve32Two(cursor.getInt(columnIndex15));
        }
        int columnIndex16 = cursor.getColumnIndex(DBMessage.RESERVE_32_THREE);
        if (columnIndex16 != -1) {
            pubDBMessage.setReserve32Three(cursor.getInt(columnIndex16));
        }
        int columnIndex17 = cursor.getColumnIndex(DBMessage.RESERVE_32_FOUR);
        if (columnIndex17 != -1) {
            pubDBMessage.setReserve32Four(cursor.getInt(columnIndex17));
        }
        int columnIndex18 = cursor.getColumnIndex(DBMessage.RESERVE_32_FIVE);
        if (columnIndex18 != -1) {
            pubDBMessage.setReserve32Five(cursor.getInt(columnIndex18));
        }
        int columnIndex19 = cursor.getColumnIndex(DBMessage.RESERVE_32_SIX);
        if (columnIndex19 != -1) {
            pubDBMessage.setReserve32Six(cursor.getInt(columnIndex19));
        }
        int columnIndex20 = cursor.getColumnIndex("category");
        if (columnIndex20 != -1) {
            pubDBMessage.setCategory(cursor.getInt(columnIndex20));
        }
        int columnIndex21 = cursor.getColumnIndex(Message.PUB_CATEGORY);
        if (columnIndex21 != -1) {
            pubDBMessage.setPubCategory(cursor.getInt(columnIndex21));
        }
        int columnIndex22 = cursor.getColumnIndex("type");
        if (columnIndex22 != -1) {
            pubDBMessage.setMsgType(cursor.getInt(columnIndex22));
        }
        int columnIndex23 = cursor.getColumnIndex("msgId");
        if (columnIndex23 != -1) {
            pubDBMessage.setMsgId(cursor.getLong(columnIndex23));
        }
        int columnIndex24 = cursor.getColumnIndex("msgUuid");
        if (columnIndex24 != -1) {
            pubDBMessage.setMsgUuid(cursor.getString(columnIndex24));
        }
        int columnIndex25 = cursor.getColumnIndex(Message.FROM_APPID);
        if (columnIndex25 != -1) {
            pubDBMessage.setFromAppId(cursor.getShort(columnIndex25));
        }
        int columnIndex26 = cursor.getColumnIndex(Message.TO_APPID);
        if (columnIndex26 != -1) {
            pubDBMessage.setToAppId(cursor.getShort(columnIndex26));
        }
        int columnIndex27 = cursor.getColumnIndex(Message.PEER_APPID);
        if (columnIndex27 != -1) {
            pubDBMessage.setPeerAppId(cursor.getShort(columnIndex27));
        }
        int columnIndex28 = cursor.getColumnIndex(Message.CHAT_ID);
        if (columnIndex28 != -1) {
            pubDBMessage.setChatId(cursor.getLong(columnIndex28));
        }
        int columnIndex29 = cursor.getColumnIndex("fromUid");
        if (columnIndex29 != -1) {
            pubDBMessage.setFromUid(cursor.getLong(columnIndex29));
        }
        int columnIndex30 = cursor.getColumnIndex("fromName");
        if (columnIndex30 != -1) {
            pubDBMessage.setFromName(cursor.getString(columnIndex30));
        }
        int columnIndex31 = cursor.getColumnIndex(Message.TO_UID);
        if (columnIndex31 != -1) {
            pubDBMessage.setToUid(cursor.getLong(columnIndex31));
        }
        int columnIndex32 = cursor.getColumnIndex(Message.PEER_UID);
        if (columnIndex32 != -1) {
            pubDBMessage.setPeerUid(cursor.getLong(columnIndex32));
        }
        int columnIndex33 = cursor.getColumnIndex("sts");
        if (columnIndex33 != -1) {
            pubDBMessage.setSts(cursor.getLong(columnIndex33));
        }
        int columnIndex34 = cursor.getColumnIndex(Message.CTS);
        if (columnIndex34 != -1) {
            pubDBMessage.setCts(cursor.getLong(columnIndex34));
        }
        int columnIndex35 = cursor.getColumnIndex(Message.MSG_STATUS);
        if (columnIndex35 != -1) {
            pubDBMessage.setMsgStatus(cursor.getInt(columnIndex35));
        }
        int columnIndex36 = cursor.getColumnIndex(Message.FILE_STATUS);
        if (columnIndex36 != -1) {
            pubDBMessage.setFileStatus(cursor.getInt(columnIndex36));
        }
        int columnIndex37 = cursor.getColumnIndex("extension");
        if (columnIndex37 != -1) {
            pubDBMessage.setExtension(cursor.getString(columnIndex37));
        }
        int columnIndex38 = cursor.getColumnIndex(Message.RECEIPT);
        if (columnIndex38 != -1) {
            pubDBMessage.setReceipt(cursor.getInt(columnIndex38) != 0);
        }
        int columnIndex39 = cursor.getColumnIndex("direction");
        if (columnIndex39 != -1) {
            pubDBMessage.setDirection(cursor.getInt(columnIndex39));
        }
        int columnIndex40 = cursor.getColumnIndex(Message.MSG_OPPOSITE_STATUS);
        if (columnIndex40 != -1) {
            pubDBMessage.setMsgOppositeStatus(cursor.getInt(columnIndex40));
        }
        int columnIndex41 = cursor.getColumnIndex("errorCode");
        if (columnIndex41 != -1) {
            pubDBMessage.setErrorCode(cursor.getInt(columnIndex41));
        }
        int columnIndex42 = cursor.getColumnIndex(Message.GROUP_NAME);
        if (columnIndex42 != -1) {
            pubDBMessage.setGroupName(cursor.getString(columnIndex42));
        }
        int columnIndex43 = cursor.getColumnIndex("channel");
        if (columnIndex43 != -1) {
            pubDBMessage.setChannel(cursor.getShort(columnIndex43));
        }
        int columnIndex44 = cursor.getColumnIndex("version");
        if (columnIndex44 != -1) {
            pubDBMessage.setMsgVersion(cursor.getLong(columnIndex44));
        }
        int columnIndex45 = cursor.getColumnIndex("seqid");
        if (columnIndex45 != -1) {
            pubDBMessage.setMsgSeqid(cursor.getLong(columnIndex45));
        }
        int columnIndex46 = cursor.getColumnIndex("flag");
        if (columnIndex46 != -1) {
            pubDBMessage.setMsgFlag(cursor.getLong(columnIndex46));
        }
        int columnIndex47 = cursor.getColumnIndex(Message.MSG_COMPATIBLE);
        if (columnIndex47 != -1) {
            pubDBMessage.setCompatible(cursor.getString(columnIndex47));
        }
        int columnIndex48 = cursor.getColumnIndex(Message.SID);
        if (columnIndex48 != -1) {
            pubDBMessage.setSID(cursor.getString(columnIndex48));
        }
        return pubDBMessage;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(PubDBMessage pubDBMessage) {
        Object[] objArr = {pubDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a56d3c8669eb4b4dfeafcb75d8855183", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a56d3c8669eb4b4dfeafcb75d8855183");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgUuid='" + pubDBMessage.getMsgUuid() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
