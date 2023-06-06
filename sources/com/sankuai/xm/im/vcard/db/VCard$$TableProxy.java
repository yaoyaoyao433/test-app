package com.sankuai.xm.im.vcard.db;

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
public class VCard$$TableProxy implements TableProxy<VCard> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(VCard vCard) {
        Object[] objArr = {vCard};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4a9e0e9aa85b7c5a035a44aa54e979b", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4a9e0e9aa85b7c5a035a44aa54e979b");
        }
        if (vCard == null) {
            return null;
        }
        d dVar = new d(VCard.TABLE_NAME, vCard.getClass());
        dVar.a(VCard.AVATAR_URL, new com.sankuai.xm.base.tinyorm.a(VCard.AVATAR_URL, 1));
        dVar.a(VCard.BIG_AVATAR_URL, new com.sankuai.xm.base.tinyorm.a(VCard.BIG_AVATAR_URL, 1));
        dVar.a("name", new com.sankuai.xm.base.tinyorm.a("name", 1));
        com.sankuai.xm.base.tinyorm.a aVar = new com.sankuai.xm.base.tinyorm.a(VCard.INFO_ID, 5);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        dVar.a(VCard.INFO_ID, aVar);
        dVar.a("type", new com.sankuai.xm.base.tinyorm.a("type", 6));
        dVar.a(VCard.IN_GROUP, new com.sankuai.xm.base.tinyorm.a(VCard.IN_GROUP, 7));
        dVar.a("status", new com.sankuai.xm.base.tinyorm.a("status", 7));
        dVar.a("extension", new com.sankuai.xm.base.tinyorm.a("extension", 1));
        dVar.a("uts", new com.sankuai.xm.base.tinyorm.a("uts", 5));
        dVar.a("description", new com.sankuai.xm.base.tinyorm.a("description", 1));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(VCard vCard) {
        Object[] objArr = {vCard};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f7d88c3123854f85b07dd49091b0f43", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f7d88c3123854f85b07dd49091b0f43");
        }
        if (vCard == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(VCard.AVATAR_URL, vCard.getAvatarUrl());
        contentValues.put(VCard.BIG_AVATAR_URL, vCard.getBigAvatarUrl());
        contentValues.put("name", vCard.getName());
        contentValues.put(VCard.INFO_ID, Long.valueOf(vCard.getInfoId()));
        contentValues.put("type", Integer.valueOf(vCard.getType()));
        contentValues.put(VCard.IN_GROUP, Short.valueOf(vCard.getInGroup()));
        contentValues.put("status", Short.valueOf(vCard.getStatus()));
        contentValues.put("extension", vCard.getExtension());
        contentValues.put("uts", Long.valueOf(vCard.getUpdateStamp()));
        contentValues.put("description", vCard.getDescription());
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77f55672458216f387249d9cf0b2e9eb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77f55672458216f387249d9cf0b2e9eb")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(VCard vCard, String[] strArr) {
        Object[] objArr = {vCard, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cb041d7e8fa4cdfb83d1754d801b243", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cb041d7e8fa4cdfb83d1754d801b243");
        }
        if (vCard == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains(VCard.AVATAR_URL, hashSet)) {
            contentValues.put(VCard.AVATAR_URL, vCard.getAvatarUrl());
        }
        if (strArr == null || contains(VCard.BIG_AVATAR_URL, hashSet)) {
            contentValues.put(VCard.BIG_AVATAR_URL, vCard.getBigAvatarUrl());
        }
        if (strArr == null || contains("name", hashSet)) {
            contentValues.put("name", vCard.getName());
        }
        if (strArr == null || contains("type", hashSet)) {
            contentValues.put("type", Integer.valueOf(vCard.getType()));
        }
        if (strArr == null || contains(VCard.IN_GROUP, hashSet)) {
            contentValues.put(VCard.IN_GROUP, Short.valueOf(vCard.getInGroup()));
        }
        if (strArr == null || contains("status", hashSet)) {
            contentValues.put("status", Short.valueOf(vCard.getStatus()));
        }
        if (strArr == null || contains("extension", hashSet)) {
            contentValues.put("extension", vCard.getExtension());
        }
        if (strArr == null || contains("uts", hashSet)) {
            contentValues.put("uts", Long.valueOf(vCard.getUpdateStamp()));
        }
        if (strArr == null || contains("description", hashSet)) {
            contentValues.put("description", vCard.getDescription());
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public VCard query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a25183c73cd4a69826023e11a96657e6", 6917529027641081856L)) {
            return (VCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a25183c73cd4a69826023e11a96657e6");
        }
        if (cursor == null) {
            return null;
        }
        VCard vCard = new VCard();
        int columnIndex = cursor.getColumnIndex(VCard.AVATAR_URL);
        if (columnIndex != -1) {
            vCard.setAvatarUrl(cursor.getString(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex(VCard.BIG_AVATAR_URL);
        if (columnIndex2 != -1) {
            vCard.setBigAvatarUrl(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("name");
        if (columnIndex3 != -1) {
            vCard.setName(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(VCard.INFO_ID);
        if (columnIndex4 != -1) {
            vCard.setInfoId(cursor.getLong(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex("type");
        if (columnIndex5 != -1) {
            vCard.setType(cursor.getInt(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex(VCard.IN_GROUP);
        if (columnIndex6 != -1) {
            vCard.setInGroup(cursor.getShort(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex("status");
        if (columnIndex7 != -1) {
            vCard.setStatus(cursor.getShort(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex("extension");
        if (columnIndex8 != -1) {
            vCard.setExtension(cursor.getString(columnIndex8));
        }
        int columnIndex9 = cursor.getColumnIndex("uts");
        if (columnIndex9 != -1) {
            vCard.setUpdateStamp(cursor.getLong(columnIndex9));
        }
        int columnIndex10 = cursor.getColumnIndex("description");
        if (columnIndex10 != -1) {
            vCard.setDescription(cursor.getString(columnIndex10));
        }
        return vCard;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(VCard vCard) {
        Object[] objArr = {vCard};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48144e253b287a532a53d2ede7e85537", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48144e253b287a532a53d2ede7e85537");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("info_id=" + vCard.getInfoId());
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
