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
public class GroupDBMessage$$TableProxy implements TableProxy<GroupDBMessage> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(GroupDBMessage groupDBMessage) {
        Object[] objArr = {groupDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf8df509ee5bee6271bb27c99d0730e4", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf8df509ee5bee6271bb27c99d0730e4");
        }
        if (groupDBMessage == null) {
            return null;
        }
        d dVar = new d(GroupDBMessage.TABLE_NAME, groupDBMessage.getClass());
        dVar.a(new d.a("grp_message_uuid_index", "msgUuid", true));
        dVar.a(new d.a("grp_message_sender_index", "fromUid", false));
        dVar.a(new d.a("grp_message_session_cts_index", "chatId, channel, cts", false));
        dVar.a(new d.a("grp_message_session_sts_index", "chatId, channel, sts", false));
        dVar.a(new d.a("grp_message_cts_index", Message.CTS, false));
        dVar.a(new d.a("grp_msgid_index", "msgid", false));
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
        dVar.a(Message.FROM_PUB_ID, new a(Message.FROM_PUB_ID, 5));
        dVar.a(Message.FROM_PUB_NAME, new a(Message.FROM_PUB_NAME, 1));
        dVar.a(Message.MSG_SOURCE, new a(Message.MSG_SOURCE, 8));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(GroupDBMessage groupDBMessage) {
        Object[] objArr = {groupDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0ef17787469274b67c155b7dc552c75", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0ef17787469274b67c155b7dc552c75");
        }
        if (groupDBMessage == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("content", groupDBMessage.getContent());
        contentValues.put(DBMessage.RESERVE_CONTENT_ONE, groupDBMessage.getReserveContentOne());
        contentValues.put(DBMessage.RESERVE_CONTENT_TWO, groupDBMessage.getReserveContentTwo());
        contentValues.put(DBMessage.RESERVE_CONTENT_THREE, groupDBMessage.getReserveContentThree());
        contentValues.put(DBMessage.RESERVE_STRING_ONE, groupDBMessage.getReserveStringOne());
        contentValues.put(DBMessage.RESERVE_STRING_TWO, groupDBMessage.getReserveStringTwo());
        contentValues.put(DBMessage.RESERVE_STRING_THREE, groupDBMessage.getReserveStringThree());
        contentValues.put(DBMessage.RESERVE_STRING_FOUR, groupDBMessage.getReserveStringFour());
        contentValues.put(DBMessage.RESERVE_64_ONE, Long.valueOf(groupDBMessage.getReserve64One()));
        contentValues.put(DBMessage.RESERVE_64_TWO, Long.valueOf(groupDBMessage.getReserve64Two()));
        contentValues.put(DBMessage.RESERVE_64_THREE, Long.valueOf(groupDBMessage.getReserve64Three()));
        contentValues.put(DBMessage.RESERVE_64_FOUR, Long.valueOf(groupDBMessage.getReserve64Four()));
        contentValues.put(DBMessage.RESERVE_64_FIVE, Long.valueOf(groupDBMessage.getReserve64Five()));
        contentValues.put(DBMessage.RESERVE_32_ONE, Integer.valueOf(groupDBMessage.getReserve32One()));
        contentValues.put(DBMessage.RESERVE_32_TWO, Integer.valueOf(groupDBMessage.getReserve32Two()));
        contentValues.put(DBMessage.RESERVE_32_THREE, Integer.valueOf(groupDBMessage.getReserve32Three()));
        contentValues.put(DBMessage.RESERVE_32_FOUR, Integer.valueOf(groupDBMessage.getReserve32Four()));
        contentValues.put(DBMessage.RESERVE_32_FIVE, Integer.valueOf(groupDBMessage.getReserve32Five()));
        contentValues.put(DBMessage.RESERVE_32_SIX, Integer.valueOf(groupDBMessage.getReserve32Six()));
        contentValues.put("category", Integer.valueOf(groupDBMessage.getCategory()));
        contentValues.put(Message.PUB_CATEGORY, Integer.valueOf(groupDBMessage.getPubCategory()));
        contentValues.put("type", Integer.valueOf(groupDBMessage.getMsgType()));
        contentValues.put("msgId", Long.valueOf(groupDBMessage.getMsgId()));
        contentValues.put("msgUuid", groupDBMessage.getMsgUuid());
        contentValues.put(Message.FROM_APPID, Short.valueOf(groupDBMessage.getFromAppId()));
        contentValues.put(Message.TO_APPID, Short.valueOf(groupDBMessage.getToAppId()));
        contentValues.put(Message.PEER_APPID, Short.valueOf(groupDBMessage.getPeerAppId()));
        contentValues.put(Message.CHAT_ID, Long.valueOf(groupDBMessage.getChatId()));
        contentValues.put("fromUid", Long.valueOf(groupDBMessage.getFromUid()));
        contentValues.put("fromName", groupDBMessage.getFromName());
        contentValues.put(Message.TO_UID, Long.valueOf(groupDBMessage.getToUid()));
        contentValues.put(Message.PEER_UID, Long.valueOf(groupDBMessage.getPeerUid()));
        contentValues.put("sts", Long.valueOf(groupDBMessage.getSts()));
        contentValues.put(Message.CTS, Long.valueOf(groupDBMessage.getCts()));
        contentValues.put(Message.MSG_STATUS, Integer.valueOf(groupDBMessage.getMsgStatus()));
        contentValues.put(Message.FILE_STATUS, Integer.valueOf(groupDBMessage.getFileStatus()));
        contentValues.put("extension", groupDBMessage.getExtension());
        contentValues.put(Message.RECEIPT, Integer.valueOf(groupDBMessage.isReceipt() ? 1 : 0));
        contentValues.put("direction", Integer.valueOf(groupDBMessage.getDirection()));
        contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(groupDBMessage.getMsgOppositeStatus()));
        contentValues.put("errorCode", Integer.valueOf(groupDBMessage.getErrorCode()));
        contentValues.put(Message.GROUP_NAME, groupDBMessage.getGroupName());
        contentValues.put("channel", Short.valueOf(groupDBMessage.getChannel()));
        contentValues.put("version", Long.valueOf(groupDBMessage.getMsgVersion()));
        contentValues.put("seqid", Long.valueOf(groupDBMessage.getMsgSeqid()));
        contentValues.put("flag", Long.valueOf(groupDBMessage.getMsgFlag()));
        contentValues.put(Message.MSG_COMPATIBLE, groupDBMessage.getCompatible());
        contentValues.put(Message.FROM_PUB_ID, Long.valueOf(groupDBMessage.getFromPubId()));
        contentValues.put(Message.FROM_PUB_NAME, groupDBMessage.getFromPubName());
        contentValues.put(Message.MSG_SOURCE, Byte.valueOf(groupDBMessage.getMsgSource()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24ea56f95ed4197f305bc27c3db88921", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24ea56f95ed4197f305bc27c3db88921")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(GroupDBMessage groupDBMessage, String[] strArr) {
        Object[] objArr = {groupDBMessage, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53f9a4a956a7e823f1f917ce5e380003", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53f9a4a956a7e823f1f917ce5e380003");
        }
        if (groupDBMessage == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("content", hashSet)) {
            contentValues.put("content", groupDBMessage.getContent());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_ONE, groupDBMessage.getReserveContentOne());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_TWO, groupDBMessage.getReserveContentTwo());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_THREE, groupDBMessage.getReserveContentThree());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_ONE, groupDBMessage.getReserveStringOne());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_TWO, groupDBMessage.getReserveStringTwo());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_THREE, groupDBMessage.getReserveStringThree());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_FOUR, groupDBMessage.getReserveStringFour());
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_ONE, Long.valueOf(groupDBMessage.getReserve64One()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_TWO, Long.valueOf(groupDBMessage.getReserve64Two()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_THREE, Long.valueOf(groupDBMessage.getReserve64Three()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_FOUR, Long.valueOf(groupDBMessage.getReserve64Four()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_FIVE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_FIVE, Long.valueOf(groupDBMessage.getReserve64Five()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_ONE, Integer.valueOf(groupDBMessage.getReserve32One()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_TWO, Integer.valueOf(groupDBMessage.getReserve32Two()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_THREE, Integer.valueOf(groupDBMessage.getReserve32Three()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_FOUR, Integer.valueOf(groupDBMessage.getReserve32Four()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_FIVE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_FIVE, Integer.valueOf(groupDBMessage.getReserve32Five()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_SIX, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_SIX, Integer.valueOf(groupDBMessage.getReserve32Six()));
        }
        if (strArr == null || contains("category", hashSet)) {
            contentValues.put("category", Integer.valueOf(groupDBMessage.getCategory()));
        }
        if (strArr == null || contains(Message.PUB_CATEGORY, hashSet)) {
            contentValues.put(Message.PUB_CATEGORY, Integer.valueOf(groupDBMessage.getPubCategory()));
        }
        if (strArr == null || contains("type", hashSet)) {
            contentValues.put("type", Integer.valueOf(groupDBMessage.getMsgType()));
        }
        if (strArr == null || contains("msgId", hashSet)) {
            contentValues.put("msgId", Long.valueOf(groupDBMessage.getMsgId()));
        }
        if (strArr == null || contains(Message.FROM_APPID, hashSet)) {
            contentValues.put(Message.FROM_APPID, Short.valueOf(groupDBMessage.getFromAppId()));
        }
        if (strArr == null || contains(Message.TO_APPID, hashSet)) {
            contentValues.put(Message.TO_APPID, Short.valueOf(groupDBMessage.getToAppId()));
        }
        if (strArr == null || contains(Message.PEER_APPID, hashSet)) {
            contentValues.put(Message.PEER_APPID, Short.valueOf(groupDBMessage.getPeerAppId()));
        }
        if (strArr == null || contains(Message.CHAT_ID, hashSet)) {
            contentValues.put(Message.CHAT_ID, Long.valueOf(groupDBMessage.getChatId()));
        }
        if (strArr == null || contains("fromUid", hashSet)) {
            contentValues.put("fromUid", Long.valueOf(groupDBMessage.getFromUid()));
        }
        if (strArr == null || contains("fromName", hashSet)) {
            contentValues.put("fromName", groupDBMessage.getFromName());
        }
        if (strArr == null || contains(Message.TO_UID, hashSet)) {
            contentValues.put(Message.TO_UID, Long.valueOf(groupDBMessage.getToUid()));
        }
        if (strArr == null || contains(Message.PEER_UID, hashSet)) {
            contentValues.put(Message.PEER_UID, Long.valueOf(groupDBMessage.getPeerUid()));
        }
        if (strArr == null || contains("sts", hashSet)) {
            contentValues.put("sts", Long.valueOf(groupDBMessage.getSts()));
        }
        if (strArr == null || contains(Message.CTS, hashSet)) {
            contentValues.put(Message.CTS, Long.valueOf(groupDBMessage.getCts()));
        }
        if (strArr == null || contains(Message.MSG_STATUS, hashSet)) {
            contentValues.put(Message.MSG_STATUS, Integer.valueOf(groupDBMessage.getMsgStatus()));
        }
        if (strArr == null || contains(Message.FILE_STATUS, hashSet)) {
            contentValues.put(Message.FILE_STATUS, Integer.valueOf(groupDBMessage.getFileStatus()));
        }
        if (strArr == null || contains("extension", hashSet)) {
            contentValues.put("extension", groupDBMessage.getExtension());
        }
        if (strArr == null || contains(Message.RECEIPT, hashSet)) {
            contentValues.put(Message.RECEIPT, Integer.valueOf(groupDBMessage.isReceipt() ? 1 : 0));
        }
        if (strArr == null || contains("direction", hashSet)) {
            contentValues.put("direction", Integer.valueOf(groupDBMessage.getDirection()));
        }
        if (strArr == null || contains(Message.MSG_OPPOSITE_STATUS, hashSet)) {
            contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(groupDBMessage.getMsgOppositeStatus()));
        }
        if (strArr == null || contains("errorCode", hashSet)) {
            contentValues.put("errorCode", Integer.valueOf(groupDBMessage.getErrorCode()));
        }
        if (strArr == null || contains(Message.GROUP_NAME, hashSet)) {
            contentValues.put(Message.GROUP_NAME, groupDBMessage.getGroupName());
        }
        if (strArr == null || contains("channel", hashSet)) {
            contentValues.put("channel", Short.valueOf(groupDBMessage.getChannel()));
        }
        if (strArr == null || contains("version", hashSet)) {
            contentValues.put("version", Long.valueOf(groupDBMessage.getMsgVersion()));
        }
        if (strArr == null || contains("seqid", hashSet)) {
            contentValues.put("seqid", Long.valueOf(groupDBMessage.getMsgSeqid()));
        }
        if (strArr == null || contains("flag", hashSet)) {
            contentValues.put("flag", Long.valueOf(groupDBMessage.getMsgFlag()));
        }
        if (strArr == null || contains(Message.MSG_COMPATIBLE, hashSet)) {
            contentValues.put(Message.MSG_COMPATIBLE, groupDBMessage.getCompatible());
        }
        if (strArr == null || contains(Message.FROM_PUB_ID, hashSet)) {
            contentValues.put(Message.FROM_PUB_ID, Long.valueOf(groupDBMessage.getFromPubId()));
        }
        if (strArr == null || contains(Message.FROM_PUB_NAME, hashSet)) {
            contentValues.put(Message.FROM_PUB_NAME, groupDBMessage.getFromPubName());
        }
        if (strArr == null || contains(Message.MSG_SOURCE, hashSet)) {
            contentValues.put(Message.MSG_SOURCE, Byte.valueOf(groupDBMessage.getMsgSource()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public GroupDBMessage query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ebc7572d311aac031ca94f6a03089ae", 6917529027641081856L)) {
            return (GroupDBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ebc7572d311aac031ca94f6a03089ae");
        }
        if (cursor == null) {
            return null;
        }
        GroupDBMessage groupDBMessage = new GroupDBMessage();
        int columnIndex = cursor.getColumnIndex("content");
        if (columnIndex != -1) {
            groupDBMessage.setContent(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_ONE);
        if (columnIndex2 != -1) {
            groupDBMessage.setReserveContentOne(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_TWO);
        if (columnIndex3 != -1) {
            groupDBMessage.setReserveContentTwo(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_THREE);
        if (columnIndex4 != -1) {
            groupDBMessage.setReserveContentThree(cursor.getString(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_ONE);
        if (columnIndex5 != -1) {
            groupDBMessage.setReserveStringOne(cursor.getString(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_TWO);
        if (columnIndex6 != -1) {
            groupDBMessage.setReserveStringTwo(cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_THREE);
        if (columnIndex7 != -1) {
            groupDBMessage.setReserveStringThree(cursor.getString(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_FOUR);
        if (columnIndex8 != -1) {
            groupDBMessage.setReserveStringFour(cursor.getString(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex(DBMessage.RESERVE_64_ONE);
        if (columnIndex9 != -1) {
            groupDBMessage.setReserve64One(cursor.getLong(columnIndex9));
        }
        int columnIndex10 = cursor.getColumnIndex(DBMessage.RESERVE_64_TWO);
        if (columnIndex10 != -1) {
            groupDBMessage.setReserve64Two(cursor.getLong(columnIndex10));
        }
        int columnIndex11 = cursor.getColumnIndex(DBMessage.RESERVE_64_THREE);
        if (columnIndex11 != -1) {
            groupDBMessage.setReserve64Three(cursor.getLong(columnIndex11));
        }
        int columnIndex12 = cursor.getColumnIndex(DBMessage.RESERVE_64_FOUR);
        if (columnIndex12 != -1) {
            groupDBMessage.setReserve64Four(cursor.getLong(columnIndex12));
        }
        int columnIndex13 = cursor.getColumnIndex(DBMessage.RESERVE_64_FIVE);
        if (columnIndex13 != -1) {
            groupDBMessage.setReserve64Five(cursor.getLong(columnIndex13));
        }
        int columnIndex14 = cursor.getColumnIndex(DBMessage.RESERVE_32_ONE);
        if (columnIndex14 != -1) {
            groupDBMessage.setReserve32One(cursor.getInt(columnIndex14));
        }
        int columnIndex15 = cursor.getColumnIndex(DBMessage.RESERVE_32_TWO);
        if (columnIndex15 != -1) {
            groupDBMessage.setReserve32Two(cursor.getInt(columnIndex15));
        }
        int columnIndex16 = cursor.getColumnIndex(DBMessage.RESERVE_32_THREE);
        if (columnIndex16 != -1) {
            groupDBMessage.setReserve32Three(cursor.getInt(columnIndex16));
        }
        int columnIndex17 = cursor.getColumnIndex(DBMessage.RESERVE_32_FOUR);
        if (columnIndex17 != -1) {
            groupDBMessage.setReserve32Four(cursor.getInt(columnIndex17));
        }
        int columnIndex18 = cursor.getColumnIndex(DBMessage.RESERVE_32_FIVE);
        if (columnIndex18 != -1) {
            groupDBMessage.setReserve32Five(cursor.getInt(columnIndex18));
        }
        int columnIndex19 = cursor.getColumnIndex(DBMessage.RESERVE_32_SIX);
        if (columnIndex19 != -1) {
            groupDBMessage.setReserve32Six(cursor.getInt(columnIndex19));
        }
        int columnIndex20 = cursor.getColumnIndex("category");
        if (columnIndex20 != -1) {
            groupDBMessage.setCategory(cursor.getInt(columnIndex20));
        }
        int columnIndex21 = cursor.getColumnIndex(Message.PUB_CATEGORY);
        if (columnIndex21 != -1) {
            groupDBMessage.setPubCategory(cursor.getInt(columnIndex21));
        }
        int columnIndex22 = cursor.getColumnIndex("type");
        if (columnIndex22 != -1) {
            groupDBMessage.setMsgType(cursor.getInt(columnIndex22));
        }
        int columnIndex23 = cursor.getColumnIndex("msgId");
        if (columnIndex23 != -1) {
            groupDBMessage.setMsgId(cursor.getLong(columnIndex23));
        }
        int columnIndex24 = cursor.getColumnIndex("msgUuid");
        if (columnIndex24 != -1) {
            groupDBMessage.setMsgUuid(cursor.getString(columnIndex24));
        }
        int columnIndex25 = cursor.getColumnIndex(Message.FROM_APPID);
        if (columnIndex25 != -1) {
            groupDBMessage.setFromAppId(cursor.getShort(columnIndex25));
        }
        int columnIndex26 = cursor.getColumnIndex(Message.TO_APPID);
        if (columnIndex26 != -1) {
            groupDBMessage.setToAppId(cursor.getShort(columnIndex26));
        }
        int columnIndex27 = cursor.getColumnIndex(Message.PEER_APPID);
        if (columnIndex27 != -1) {
            groupDBMessage.setPeerAppId(cursor.getShort(columnIndex27));
        }
        int columnIndex28 = cursor.getColumnIndex(Message.CHAT_ID);
        if (columnIndex28 != -1) {
            groupDBMessage.setChatId(cursor.getLong(columnIndex28));
        }
        int columnIndex29 = cursor.getColumnIndex("fromUid");
        if (columnIndex29 != -1) {
            groupDBMessage.setFromUid(cursor.getLong(columnIndex29));
        }
        int columnIndex30 = cursor.getColumnIndex("fromName");
        if (columnIndex30 != -1) {
            groupDBMessage.setFromName(cursor.getString(columnIndex30));
        }
        int columnIndex31 = cursor.getColumnIndex(Message.TO_UID);
        if (columnIndex31 != -1) {
            groupDBMessage.setToUid(cursor.getLong(columnIndex31));
        }
        int columnIndex32 = cursor.getColumnIndex(Message.PEER_UID);
        if (columnIndex32 != -1) {
            groupDBMessage.setPeerUid(cursor.getLong(columnIndex32));
        }
        int columnIndex33 = cursor.getColumnIndex("sts");
        if (columnIndex33 != -1) {
            groupDBMessage.setSts(cursor.getLong(columnIndex33));
        }
        int columnIndex34 = cursor.getColumnIndex(Message.CTS);
        if (columnIndex34 != -1) {
            groupDBMessage.setCts(cursor.getLong(columnIndex34));
        }
        int columnIndex35 = cursor.getColumnIndex(Message.MSG_STATUS);
        if (columnIndex35 != -1) {
            groupDBMessage.setMsgStatus(cursor.getInt(columnIndex35));
        }
        int columnIndex36 = cursor.getColumnIndex(Message.FILE_STATUS);
        if (columnIndex36 != -1) {
            groupDBMessage.setFileStatus(cursor.getInt(columnIndex36));
        }
        int columnIndex37 = cursor.getColumnIndex("extension");
        if (columnIndex37 != -1) {
            groupDBMessage.setExtension(cursor.getString(columnIndex37));
        }
        int columnIndex38 = cursor.getColumnIndex(Message.RECEIPT);
        if (columnIndex38 != -1) {
            groupDBMessage.setReceipt(cursor.getInt(columnIndex38) != 0);
        }
        int columnIndex39 = cursor.getColumnIndex("direction");
        if (columnIndex39 != -1) {
            groupDBMessage.setDirection(cursor.getInt(columnIndex39));
        }
        int columnIndex40 = cursor.getColumnIndex(Message.MSG_OPPOSITE_STATUS);
        if (columnIndex40 != -1) {
            groupDBMessage.setMsgOppositeStatus(cursor.getInt(columnIndex40));
        }
        int columnIndex41 = cursor.getColumnIndex("errorCode");
        if (columnIndex41 != -1) {
            groupDBMessage.setErrorCode(cursor.getInt(columnIndex41));
        }
        int columnIndex42 = cursor.getColumnIndex(Message.GROUP_NAME);
        if (columnIndex42 != -1) {
            groupDBMessage.setGroupName(cursor.getString(columnIndex42));
        }
        int columnIndex43 = cursor.getColumnIndex("channel");
        if (columnIndex43 != -1) {
            groupDBMessage.setChannel(cursor.getShort(columnIndex43));
        }
        int columnIndex44 = cursor.getColumnIndex("version");
        if (columnIndex44 != -1) {
            groupDBMessage.setMsgVersion(cursor.getLong(columnIndex44));
        }
        int columnIndex45 = cursor.getColumnIndex("seqid");
        if (columnIndex45 != -1) {
            groupDBMessage.setMsgSeqid(cursor.getLong(columnIndex45));
        }
        int columnIndex46 = cursor.getColumnIndex("flag");
        if (columnIndex46 != -1) {
            groupDBMessage.setMsgFlag(cursor.getLong(columnIndex46));
        }
        int columnIndex47 = cursor.getColumnIndex(Message.MSG_COMPATIBLE);
        if (columnIndex47 != -1) {
            groupDBMessage.setCompatible(cursor.getString(columnIndex47));
        }
        int columnIndex48 = cursor.getColumnIndex(Message.FROM_PUB_ID);
        if (columnIndex48 != -1) {
            groupDBMessage.setFromPubId(cursor.getLong(columnIndex48));
        }
        int columnIndex49 = cursor.getColumnIndex(Message.FROM_PUB_NAME);
        if (columnIndex49 != -1) {
            groupDBMessage.setFromPubName(cursor.getString(columnIndex49));
        }
        int columnIndex50 = cursor.getColumnIndex(Message.MSG_SOURCE);
        if (columnIndex50 != -1) {
            groupDBMessage.setMsgSource((byte) cursor.getShort(columnIndex50));
        }
        return groupDBMessage;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(GroupDBMessage groupDBMessage) {
        Object[] objArr = {groupDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcc556169776546f2c5e8fea38afb59b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcc556169776546f2c5e8fea38afb59b");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgUuid='" + groupDBMessage.getMsgUuid() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
