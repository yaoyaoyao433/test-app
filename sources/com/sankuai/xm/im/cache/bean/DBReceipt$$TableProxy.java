package com.sankuai.xm.im.cache.bean;

import android.content.ContentValues;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.tinyorm.TableProxy;
import com.sankuai.xm.base.tinyorm.a;
import com.sankuai.xm.base.tinyorm.d;
import com.sankuai.xm.im.message.bean.Receipt;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DBReceipt$$TableProxy implements TableProxy<DBReceipt> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(DBReceipt dBReceipt) {
        Object[] objArr = {dBReceipt};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4af3db6fcd9290a90de7efb2c3e8c33", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4af3db6fcd9290a90de7efb2c3e8c33");
        }
        if (dBReceipt == null) {
            return null;
        }
        d dVar = new d(DBReceipt.TABLE_NAME, dBReceipt.getClass());
        dVar.a(new d.a("receipt_msgUuid", "msgUuid", true));
        dVar.a("msgId", new a("msgId", 5));
        a aVar = new a("msgUuid", 1);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        dVar.a("msgUuid", aVar);
        dVar.a(Receipt.UN_RECEIPT_COUNT, new a(Receipt.UN_RECEIPT_COUNT, 6));
        dVar.a(Receipt.RECEIPT_COUNT, new a(Receipt.RECEIPT_COUNT, 6));
        dVar.a(Receipt.UN_RECEIPT_UIDS, new a(Receipt.UN_RECEIPT_UIDS, 1));
        dVar.a(Receipt.RECEIPT_UIDS, new a(Receipt.RECEIPT_UIDS, 1));
        dVar.a(Receipt.STAMP, new a(Receipt.STAMP, 5));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(DBReceipt dBReceipt) {
        Object[] objArr = {dBReceipt};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d525d918364c13b10204292b3fc4fd21", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d525d918364c13b10204292b3fc4fd21");
        }
        if (dBReceipt == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("msgId", Long.valueOf(dBReceipt.getMsgId()));
        contentValues.put("msgUuid", dBReceipt.getMsgUuid());
        contentValues.put(Receipt.UN_RECEIPT_COUNT, Integer.valueOf(dBReceipt.getUnReceiptCount()));
        contentValues.put(Receipt.RECEIPT_COUNT, Integer.valueOf(dBReceipt.getReceiptCount()));
        contentValues.put(Receipt.UN_RECEIPT_UIDS, dBReceipt.getUnReceiptUids());
        contentValues.put(Receipt.RECEIPT_UIDS, dBReceipt.getReceiptUids());
        contentValues.put(Receipt.STAMP, Long.valueOf(dBReceipt.getStamp()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9177a8e3981410db9ae38611a2c90cbc", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9177a8e3981410db9ae38611a2c90cbc")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(DBReceipt dBReceipt, String[] strArr) {
        Object[] objArr = {dBReceipt, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa217daa18ee537285555ce455c178a8", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa217daa18ee537285555ce455c178a8");
        }
        if (dBReceipt == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("msgId", hashSet)) {
            contentValues.put("msgId", Long.valueOf(dBReceipt.getMsgId()));
        }
        if (strArr == null || contains(Receipt.UN_RECEIPT_COUNT, hashSet)) {
            contentValues.put(Receipt.UN_RECEIPT_COUNT, Integer.valueOf(dBReceipt.getUnReceiptCount()));
        }
        if (strArr == null || contains(Receipt.RECEIPT_COUNT, hashSet)) {
            contentValues.put(Receipt.RECEIPT_COUNT, Integer.valueOf(dBReceipt.getReceiptCount()));
        }
        if (strArr == null || contains(Receipt.UN_RECEIPT_UIDS, hashSet)) {
            contentValues.put(Receipt.UN_RECEIPT_UIDS, dBReceipt.getUnReceiptUids());
        }
        if (strArr == null || contains(Receipt.RECEIPT_UIDS, hashSet)) {
            contentValues.put(Receipt.RECEIPT_UIDS, dBReceipt.getReceiptUids());
        }
        if (strArr == null || contains(Receipt.STAMP, hashSet)) {
            contentValues.put(Receipt.STAMP, Long.valueOf(dBReceipt.getStamp()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public DBReceipt query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3ef8dbce1d4609a4dbd85d3af9e2bbd", 6917529027641081856L)) {
            return (DBReceipt) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3ef8dbce1d4609a4dbd85d3af9e2bbd");
        }
        if (cursor == null) {
            return null;
        }
        DBReceipt dBReceipt = new DBReceipt();
        int columnIndex = cursor.getColumnIndex("msgId");
        if (columnIndex != -1) {
            dBReceipt.setMsgId(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("msgUuid");
        if (columnIndex2 != -1) {
            dBReceipt.setMsgUuid(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex(Receipt.UN_RECEIPT_COUNT);
        if (columnIndex3 != -1) {
            dBReceipt.setUnReceiptCount(cursor.getInt(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(Receipt.RECEIPT_COUNT);
        if (columnIndex4 != -1) {
            dBReceipt.setReceiptCount(cursor.getInt(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex(Receipt.UN_RECEIPT_UIDS);
        if (columnIndex5 != -1) {
            dBReceipt.setUnReceiptUids(cursor.getString(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex(Receipt.RECEIPT_UIDS);
        if (columnIndex6 != -1) {
            dBReceipt.setReceiptUids(cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(Receipt.STAMP);
        if (columnIndex7 != -1) {
            dBReceipt.setStamp(cursor.getLong(columnIndex7));
        }
        return dBReceipt;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(DBReceipt dBReceipt) {
        Object[] objArr = {dBReceipt};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "872ad1f60e43729eca758568f4458f80", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "872ad1f60e43729eca758568f4458f80");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgUuid='" + dBReceipt.getMsgUuid() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
