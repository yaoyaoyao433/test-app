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
public class PersonalDBMessage$$TableProxy implements TableProxy<PersonalDBMessage> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(PersonalDBMessage personalDBMessage) {
        Object[] objArr = {personalDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13b102b245676739cf0775d3c0b52892", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13b102b245676739cf0775d3c0b52892");
        }
        if (personalDBMessage == null) {
            return null;
        }
        d dVar = new d(PersonalDBMessage.TABLE_NAME, personalDBMessage.getClass());
        dVar.a(new d.a("message_uuid_index", "msgUuid", true));
        dVar.a(new d.a("message_sender_index", "fromUid", false));
        dVar.a(new d.a("message_session_cts_index", "chatId, channel, cts", false));
        dVar.a(new d.a("message_session_sts_index", "chatId, channel, sts", false));
        dVar.a(new d.a("message_cts_index", Message.CTS, false));
        dVar.a(new d.a("msgid_index", "msgid", false));
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
    public ContentValues insert(PersonalDBMessage personalDBMessage) {
        Object[] objArr = {personalDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffbd7f238d74b2989bd8ab1ed0c5104a", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffbd7f238d74b2989bd8ab1ed0c5104a");
        }
        if (personalDBMessage == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("content", personalDBMessage.getContent());
        contentValues.put(DBMessage.RESERVE_CONTENT_ONE, personalDBMessage.getReserveContentOne());
        contentValues.put(DBMessage.RESERVE_CONTENT_TWO, personalDBMessage.getReserveContentTwo());
        contentValues.put(DBMessage.RESERVE_CONTENT_THREE, personalDBMessage.getReserveContentThree());
        contentValues.put(DBMessage.RESERVE_STRING_ONE, personalDBMessage.getReserveStringOne());
        contentValues.put(DBMessage.RESERVE_STRING_TWO, personalDBMessage.getReserveStringTwo());
        contentValues.put(DBMessage.RESERVE_STRING_THREE, personalDBMessage.getReserveStringThree());
        contentValues.put(DBMessage.RESERVE_STRING_FOUR, personalDBMessage.getReserveStringFour());
        contentValues.put(DBMessage.RESERVE_64_ONE, Long.valueOf(personalDBMessage.getReserve64One()));
        contentValues.put(DBMessage.RESERVE_64_TWO, Long.valueOf(personalDBMessage.getReserve64Two()));
        contentValues.put(DBMessage.RESERVE_64_THREE, Long.valueOf(personalDBMessage.getReserve64Three()));
        contentValues.put(DBMessage.RESERVE_64_FOUR, Long.valueOf(personalDBMessage.getReserve64Four()));
        contentValues.put(DBMessage.RESERVE_64_FIVE, Long.valueOf(personalDBMessage.getReserve64Five()));
        contentValues.put(DBMessage.RESERVE_32_ONE, Integer.valueOf(personalDBMessage.getReserve32One()));
        contentValues.put(DBMessage.RESERVE_32_TWO, Integer.valueOf(personalDBMessage.getReserve32Two()));
        contentValues.put(DBMessage.RESERVE_32_THREE, Integer.valueOf(personalDBMessage.getReserve32Three()));
        contentValues.put(DBMessage.RESERVE_32_FOUR, Integer.valueOf(personalDBMessage.getReserve32Four()));
        contentValues.put(DBMessage.RESERVE_32_FIVE, Integer.valueOf(personalDBMessage.getReserve32Five()));
        contentValues.put(DBMessage.RESERVE_32_SIX, Integer.valueOf(personalDBMessage.getReserve32Six()));
        contentValues.put("category", Integer.valueOf(personalDBMessage.getCategory()));
        contentValues.put(Message.PUB_CATEGORY, Integer.valueOf(personalDBMessage.getPubCategory()));
        contentValues.put("type", Integer.valueOf(personalDBMessage.getMsgType()));
        contentValues.put("msgId", Long.valueOf(personalDBMessage.getMsgId()));
        contentValues.put("msgUuid", personalDBMessage.getMsgUuid());
        contentValues.put(Message.FROM_APPID, Short.valueOf(personalDBMessage.getFromAppId()));
        contentValues.put(Message.TO_APPID, Short.valueOf(personalDBMessage.getToAppId()));
        contentValues.put(Message.PEER_APPID, Short.valueOf(personalDBMessage.getPeerAppId()));
        contentValues.put(Message.CHAT_ID, Long.valueOf(personalDBMessage.getChatId()));
        contentValues.put("fromUid", Long.valueOf(personalDBMessage.getFromUid()));
        contentValues.put("fromName", personalDBMessage.getFromName());
        contentValues.put(Message.TO_UID, Long.valueOf(personalDBMessage.getToUid()));
        contentValues.put(Message.PEER_UID, Long.valueOf(personalDBMessage.getPeerUid()));
        contentValues.put("sts", Long.valueOf(personalDBMessage.getSts()));
        contentValues.put(Message.CTS, Long.valueOf(personalDBMessage.getCts()));
        contentValues.put(Message.MSG_STATUS, Integer.valueOf(personalDBMessage.getMsgStatus()));
        contentValues.put(Message.FILE_STATUS, Integer.valueOf(personalDBMessage.getFileStatus()));
        contentValues.put("extension", personalDBMessage.getExtension());
        contentValues.put(Message.RECEIPT, Integer.valueOf(personalDBMessage.isReceipt() ? 1 : 0));
        contentValues.put("direction", Integer.valueOf(personalDBMessage.getDirection()));
        contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(personalDBMessage.getMsgOppositeStatus()));
        contentValues.put("errorCode", Integer.valueOf(personalDBMessage.getErrorCode()));
        contentValues.put(Message.GROUP_NAME, personalDBMessage.getGroupName());
        contentValues.put("channel", Short.valueOf(personalDBMessage.getChannel()));
        contentValues.put("version", Long.valueOf(personalDBMessage.getMsgVersion()));
        contentValues.put("seqid", Long.valueOf(personalDBMessage.getMsgSeqid()));
        contentValues.put("flag", Long.valueOf(personalDBMessage.getMsgFlag()));
        contentValues.put(Message.MSG_COMPATIBLE, personalDBMessage.getCompatible());
        contentValues.put(Message.SID, personalDBMessage.getSID());
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1d93bed9b0155481e764b3870ff4af7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1d93bed9b0155481e764b3870ff4af7")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(PersonalDBMessage personalDBMessage, String[] strArr) {
        Object[] objArr = {personalDBMessage, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3536fb6348eeedda040a879e330ae3fe", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3536fb6348eeedda040a879e330ae3fe");
        }
        if (personalDBMessage == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("content", hashSet)) {
            contentValues.put("content", personalDBMessage.getContent());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_ONE, personalDBMessage.getReserveContentOne());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_TWO, personalDBMessage.getReserveContentTwo());
        }
        if (strArr == null || contains(DBMessage.RESERVE_CONTENT_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_CONTENT_THREE, personalDBMessage.getReserveContentThree());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_ONE, personalDBMessage.getReserveStringOne());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_TWO, personalDBMessage.getReserveStringTwo());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_THREE, personalDBMessage.getReserveStringThree());
        }
        if (strArr == null || contains(DBMessage.RESERVE_STRING_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_STRING_FOUR, personalDBMessage.getReserveStringFour());
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_ONE, Long.valueOf(personalDBMessage.getReserve64One()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_TWO, Long.valueOf(personalDBMessage.getReserve64Two()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_THREE, Long.valueOf(personalDBMessage.getReserve64Three()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_FOUR, Long.valueOf(personalDBMessage.getReserve64Four()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_64_FIVE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_64_FIVE, Long.valueOf(personalDBMessage.getReserve64Five()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_ONE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_ONE, Integer.valueOf(personalDBMessage.getReserve32One()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_TWO, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_TWO, Integer.valueOf(personalDBMessage.getReserve32Two()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_THREE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_THREE, Integer.valueOf(personalDBMessage.getReserve32Three()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_FOUR, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_FOUR, Integer.valueOf(personalDBMessage.getReserve32Four()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_FIVE, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_FIVE, Integer.valueOf(personalDBMessage.getReserve32Five()));
        }
        if (strArr == null || contains(DBMessage.RESERVE_32_SIX, hashSet)) {
            contentValues.put(DBMessage.RESERVE_32_SIX, Integer.valueOf(personalDBMessage.getReserve32Six()));
        }
        if (strArr == null || contains("category", hashSet)) {
            contentValues.put("category", Integer.valueOf(personalDBMessage.getCategory()));
        }
        if (strArr == null || contains(Message.PUB_CATEGORY, hashSet)) {
            contentValues.put(Message.PUB_CATEGORY, Integer.valueOf(personalDBMessage.getPubCategory()));
        }
        if (strArr == null || contains("type", hashSet)) {
            contentValues.put("type", Integer.valueOf(personalDBMessage.getMsgType()));
        }
        if (strArr == null || contains("msgId", hashSet)) {
            contentValues.put("msgId", Long.valueOf(personalDBMessage.getMsgId()));
        }
        if (strArr == null || contains(Message.FROM_APPID, hashSet)) {
            contentValues.put(Message.FROM_APPID, Short.valueOf(personalDBMessage.getFromAppId()));
        }
        if (strArr == null || contains(Message.TO_APPID, hashSet)) {
            contentValues.put(Message.TO_APPID, Short.valueOf(personalDBMessage.getToAppId()));
        }
        if (strArr == null || contains(Message.PEER_APPID, hashSet)) {
            contentValues.put(Message.PEER_APPID, Short.valueOf(personalDBMessage.getPeerAppId()));
        }
        if (strArr == null || contains(Message.CHAT_ID, hashSet)) {
            contentValues.put(Message.CHAT_ID, Long.valueOf(personalDBMessage.getChatId()));
        }
        if (strArr == null || contains("fromUid", hashSet)) {
            contentValues.put("fromUid", Long.valueOf(personalDBMessage.getFromUid()));
        }
        if (strArr == null || contains("fromName", hashSet)) {
            contentValues.put("fromName", personalDBMessage.getFromName());
        }
        if (strArr == null || contains(Message.TO_UID, hashSet)) {
            contentValues.put(Message.TO_UID, Long.valueOf(personalDBMessage.getToUid()));
        }
        if (strArr == null || contains(Message.PEER_UID, hashSet)) {
            contentValues.put(Message.PEER_UID, Long.valueOf(personalDBMessage.getPeerUid()));
        }
        if (strArr == null || contains("sts", hashSet)) {
            contentValues.put("sts", Long.valueOf(personalDBMessage.getSts()));
        }
        if (strArr == null || contains(Message.CTS, hashSet)) {
            contentValues.put(Message.CTS, Long.valueOf(personalDBMessage.getCts()));
        }
        if (strArr == null || contains(Message.MSG_STATUS, hashSet)) {
            contentValues.put(Message.MSG_STATUS, Integer.valueOf(personalDBMessage.getMsgStatus()));
        }
        if (strArr == null || contains(Message.FILE_STATUS, hashSet)) {
            contentValues.put(Message.FILE_STATUS, Integer.valueOf(personalDBMessage.getFileStatus()));
        }
        if (strArr == null || contains("extension", hashSet)) {
            contentValues.put("extension", personalDBMessage.getExtension());
        }
        if (strArr == null || contains(Message.RECEIPT, hashSet)) {
            contentValues.put(Message.RECEIPT, Integer.valueOf(personalDBMessage.isReceipt() ? 1 : 0));
        }
        if (strArr == null || contains("direction", hashSet)) {
            contentValues.put("direction", Integer.valueOf(personalDBMessage.getDirection()));
        }
        if (strArr == null || contains(Message.MSG_OPPOSITE_STATUS, hashSet)) {
            contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(personalDBMessage.getMsgOppositeStatus()));
        }
        if (strArr == null || contains("errorCode", hashSet)) {
            contentValues.put("errorCode", Integer.valueOf(personalDBMessage.getErrorCode()));
        }
        if (strArr == null || contains(Message.GROUP_NAME, hashSet)) {
            contentValues.put(Message.GROUP_NAME, personalDBMessage.getGroupName());
        }
        if (strArr == null || contains("channel", hashSet)) {
            contentValues.put("channel", Short.valueOf(personalDBMessage.getChannel()));
        }
        if (strArr == null || contains("version", hashSet)) {
            contentValues.put("version", Long.valueOf(personalDBMessage.getMsgVersion()));
        }
        if (strArr == null || contains("seqid", hashSet)) {
            contentValues.put("seqid", Long.valueOf(personalDBMessage.getMsgSeqid()));
        }
        if (strArr == null || contains("flag", hashSet)) {
            contentValues.put("flag", Long.valueOf(personalDBMessage.getMsgFlag()));
        }
        if (strArr == null || contains(Message.MSG_COMPATIBLE, hashSet)) {
            contentValues.put(Message.MSG_COMPATIBLE, personalDBMessage.getCompatible());
        }
        if (strArr == null || contains(Message.SID, hashSet)) {
            contentValues.put(Message.SID, personalDBMessage.getSID());
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public PersonalDBMessage query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3957491bfcbd65be87577c25e051bf4e", 6917529027641081856L)) {
            return (PersonalDBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3957491bfcbd65be87577c25e051bf4e");
        }
        if (cursor == null) {
            return null;
        }
        PersonalDBMessage personalDBMessage = new PersonalDBMessage();
        int columnIndex = cursor.getColumnIndex("content");
        if (columnIndex != -1) {
            personalDBMessage.setContent(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_ONE);
        if (columnIndex2 != -1) {
            personalDBMessage.setReserveContentOne(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_TWO);
        if (columnIndex3 != -1) {
            personalDBMessage.setReserveContentTwo(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(DBMessage.RESERVE_CONTENT_THREE);
        if (columnIndex4 != -1) {
            personalDBMessage.setReserveContentThree(cursor.getString(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_ONE);
        if (columnIndex5 != -1) {
            personalDBMessage.setReserveStringOne(cursor.getString(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_TWO);
        if (columnIndex6 != -1) {
            personalDBMessage.setReserveStringTwo(cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_THREE);
        if (columnIndex7 != -1) {
            personalDBMessage.setReserveStringThree(cursor.getString(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex(DBMessage.RESERVE_STRING_FOUR);
        if (columnIndex8 != -1) {
            personalDBMessage.setReserveStringFour(cursor.getString(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex(DBMessage.RESERVE_64_ONE);
        if (columnIndex9 != -1) {
            personalDBMessage.setReserve64One(cursor.getLong(columnIndex9));
        }
        int columnIndex10 = cursor.getColumnIndex(DBMessage.RESERVE_64_TWO);
        if (columnIndex10 != -1) {
            personalDBMessage.setReserve64Two(cursor.getLong(columnIndex10));
        }
        int columnIndex11 = cursor.getColumnIndex(DBMessage.RESERVE_64_THREE);
        if (columnIndex11 != -1) {
            personalDBMessage.setReserve64Three(cursor.getLong(columnIndex11));
        }
        int columnIndex12 = cursor.getColumnIndex(DBMessage.RESERVE_64_FOUR);
        if (columnIndex12 != -1) {
            personalDBMessage.setReserve64Four(cursor.getLong(columnIndex12));
        }
        int columnIndex13 = cursor.getColumnIndex(DBMessage.RESERVE_64_FIVE);
        if (columnIndex13 != -1) {
            personalDBMessage.setReserve64Five(cursor.getLong(columnIndex13));
        }
        int columnIndex14 = cursor.getColumnIndex(DBMessage.RESERVE_32_ONE);
        if (columnIndex14 != -1) {
            personalDBMessage.setReserve32One(cursor.getInt(columnIndex14));
        }
        int columnIndex15 = cursor.getColumnIndex(DBMessage.RESERVE_32_TWO);
        if (columnIndex15 != -1) {
            personalDBMessage.setReserve32Two(cursor.getInt(columnIndex15));
        }
        int columnIndex16 = cursor.getColumnIndex(DBMessage.RESERVE_32_THREE);
        if (columnIndex16 != -1) {
            personalDBMessage.setReserve32Three(cursor.getInt(columnIndex16));
        }
        int columnIndex17 = cursor.getColumnIndex(DBMessage.RESERVE_32_FOUR);
        if (columnIndex17 != -1) {
            personalDBMessage.setReserve32Four(cursor.getInt(columnIndex17));
        }
        int columnIndex18 = cursor.getColumnIndex(DBMessage.RESERVE_32_FIVE);
        if (columnIndex18 != -1) {
            personalDBMessage.setReserve32Five(cursor.getInt(columnIndex18));
        }
        int columnIndex19 = cursor.getColumnIndex(DBMessage.RESERVE_32_SIX);
        if (columnIndex19 != -1) {
            personalDBMessage.setReserve32Six(cursor.getInt(columnIndex19));
        }
        int columnIndex20 = cursor.getColumnIndex("category");
        if (columnIndex20 != -1) {
            personalDBMessage.setCategory(cursor.getInt(columnIndex20));
        }
        int columnIndex21 = cursor.getColumnIndex(Message.PUB_CATEGORY);
        if (columnIndex21 != -1) {
            personalDBMessage.setPubCategory(cursor.getInt(columnIndex21));
        }
        int columnIndex22 = cursor.getColumnIndex("type");
        if (columnIndex22 != -1) {
            personalDBMessage.setMsgType(cursor.getInt(columnIndex22));
        }
        int columnIndex23 = cursor.getColumnIndex("msgId");
        if (columnIndex23 != -1) {
            personalDBMessage.setMsgId(cursor.getLong(columnIndex23));
        }
        int columnIndex24 = cursor.getColumnIndex("msgUuid");
        if (columnIndex24 != -1) {
            personalDBMessage.setMsgUuid(cursor.getString(columnIndex24));
        }
        int columnIndex25 = cursor.getColumnIndex(Message.FROM_APPID);
        if (columnIndex25 != -1) {
            personalDBMessage.setFromAppId(cursor.getShort(columnIndex25));
        }
        int columnIndex26 = cursor.getColumnIndex(Message.TO_APPID);
        if (columnIndex26 != -1) {
            personalDBMessage.setToAppId(cursor.getShort(columnIndex26));
        }
        int columnIndex27 = cursor.getColumnIndex(Message.PEER_APPID);
        if (columnIndex27 != -1) {
            personalDBMessage.setPeerAppId(cursor.getShort(columnIndex27));
        }
        int columnIndex28 = cursor.getColumnIndex(Message.CHAT_ID);
        if (columnIndex28 != -1) {
            personalDBMessage.setChatId(cursor.getLong(columnIndex28));
        }
        int columnIndex29 = cursor.getColumnIndex("fromUid");
        if (columnIndex29 != -1) {
            personalDBMessage.setFromUid(cursor.getLong(columnIndex29));
        }
        int columnIndex30 = cursor.getColumnIndex("fromName");
        if (columnIndex30 != -1) {
            personalDBMessage.setFromName(cursor.getString(columnIndex30));
        }
        int columnIndex31 = cursor.getColumnIndex(Message.TO_UID);
        if (columnIndex31 != -1) {
            personalDBMessage.setToUid(cursor.getLong(columnIndex31));
        }
        int columnIndex32 = cursor.getColumnIndex(Message.PEER_UID);
        if (columnIndex32 != -1) {
            personalDBMessage.setPeerUid(cursor.getLong(columnIndex32));
        }
        int columnIndex33 = cursor.getColumnIndex("sts");
        if (columnIndex33 != -1) {
            personalDBMessage.setSts(cursor.getLong(columnIndex33));
        }
        int columnIndex34 = cursor.getColumnIndex(Message.CTS);
        if (columnIndex34 != -1) {
            personalDBMessage.setCts(cursor.getLong(columnIndex34));
        }
        int columnIndex35 = cursor.getColumnIndex(Message.MSG_STATUS);
        if (columnIndex35 != -1) {
            personalDBMessage.setMsgStatus(cursor.getInt(columnIndex35));
        }
        int columnIndex36 = cursor.getColumnIndex(Message.FILE_STATUS);
        if (columnIndex36 != -1) {
            personalDBMessage.setFileStatus(cursor.getInt(columnIndex36));
        }
        int columnIndex37 = cursor.getColumnIndex("extension");
        if (columnIndex37 != -1) {
            personalDBMessage.setExtension(cursor.getString(columnIndex37));
        }
        int columnIndex38 = cursor.getColumnIndex(Message.RECEIPT);
        if (columnIndex38 != -1) {
            personalDBMessage.setReceipt(cursor.getInt(columnIndex38) != 0);
        }
        int columnIndex39 = cursor.getColumnIndex("direction");
        if (columnIndex39 != -1) {
            personalDBMessage.setDirection(cursor.getInt(columnIndex39));
        }
        int columnIndex40 = cursor.getColumnIndex(Message.MSG_OPPOSITE_STATUS);
        if (columnIndex40 != -1) {
            personalDBMessage.setMsgOppositeStatus(cursor.getInt(columnIndex40));
        }
        int columnIndex41 = cursor.getColumnIndex("errorCode");
        if (columnIndex41 != -1) {
            personalDBMessage.setErrorCode(cursor.getInt(columnIndex41));
        }
        int columnIndex42 = cursor.getColumnIndex(Message.GROUP_NAME);
        if (columnIndex42 != -1) {
            personalDBMessage.setGroupName(cursor.getString(columnIndex42));
        }
        int columnIndex43 = cursor.getColumnIndex("channel");
        if (columnIndex43 != -1) {
            personalDBMessage.setChannel(cursor.getShort(columnIndex43));
        }
        int columnIndex44 = cursor.getColumnIndex("version");
        if (columnIndex44 != -1) {
            personalDBMessage.setMsgVersion(cursor.getLong(columnIndex44));
        }
        int columnIndex45 = cursor.getColumnIndex("seqid");
        if (columnIndex45 != -1) {
            personalDBMessage.setMsgSeqid(cursor.getLong(columnIndex45));
        }
        int columnIndex46 = cursor.getColumnIndex("flag");
        if (columnIndex46 != -1) {
            personalDBMessage.setMsgFlag(cursor.getLong(columnIndex46));
        }
        int columnIndex47 = cursor.getColumnIndex(Message.MSG_COMPATIBLE);
        if (columnIndex47 != -1) {
            personalDBMessage.setCompatible(cursor.getString(columnIndex47));
        }
        int columnIndex48 = cursor.getColumnIndex(Message.SID);
        if (columnIndex48 != -1) {
            personalDBMessage.setSID(cursor.getString(columnIndex48));
        }
        return personalDBMessage;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(PersonalDBMessage personalDBMessage) {
        Object[] objArr = {personalDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e196c6d286065f5093637de16126bd2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e196c6d286065f5093637de16126bd2");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgUuid='" + personalDBMessage.getMsgUuid() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
