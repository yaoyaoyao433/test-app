package com.sankuai.xm.imui.controller.group.bean;

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
public class GroupPermit$$TableProxy implements TableProxy<GroupPermit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(GroupPermit groupPermit) {
        Object[] objArr = {groupPermit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "571d16841d5e419a74bb3bf42785cfd9", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "571d16841d5e419a74bb3bf42785cfd9");
        }
        if (groupPermit == null) {
            return null;
        }
        d dVar = new d(GroupPermit.TABLE_NAME, groupPermit.getClass());
        a aVar = new a("gid", 5);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        dVar.a("gid", aVar);
        a aVar2 = new a("name", 1);
        a.C1377a c1377a2 = new a.C1377a();
        c1377a2.a = false;
        aVar2.d = c1377a2;
        dVar.a(aVar2);
        dVar.a("name", aVar2);
        dVar.a("value", new a("value", 6));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(GroupPermit groupPermit) {
        Object[] objArr = {groupPermit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea69a5ebef32474ebbdf8bf6d2793f4d", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea69a5ebef32474ebbdf8bf6d2793f4d");
        }
        if (groupPermit == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("gid", Long.valueOf(groupPermit.getGid()));
        contentValues.put("name", groupPermit.getName());
        contentValues.put("value", Integer.valueOf(groupPermit.getValue()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7b5e1a4e1030e61954466345fba9c78", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7b5e1a4e1030e61954466345fba9c78")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(GroupPermit groupPermit, String[] strArr) {
        Object[] objArr = {groupPermit, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe4d1c6cecf8538a887cbce82ca6e5c0", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe4d1c6cecf8538a887cbce82ca6e5c0");
        }
        if (groupPermit == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains("value", hashSet)) {
            contentValues.put("value", Integer.valueOf(groupPermit.getValue()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public GroupPermit query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b7fd4f7d82078eb27f7b1e78425bdef", 6917529027641081856L)) {
            return (GroupPermit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b7fd4f7d82078eb27f7b1e78425bdef");
        }
        if (cursor == null) {
            return null;
        }
        GroupPermit groupPermit = new GroupPermit();
        int columnIndex = cursor.getColumnIndex("gid");
        if (columnIndex != -1) {
            groupPermit.setGid(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("name");
        if (columnIndex2 != -1) {
            groupPermit.setName(cursor.getString(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("value");
        if (columnIndex3 != -1) {
            groupPermit.setValue(cursor.getInt(columnIndex3));
        }
        return groupPermit;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(GroupPermit groupPermit) {
        Object[] objArr = {groupPermit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c24bc8d33d7f24acf12a797c198c52e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c24bc8d33d7f24acf12a797c198c52e");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gid=" + groupPermit.getGid());
        sb.append(" AND ");
        sb.append("name='" + groupPermit.getName() + CommonConstant.Symbol.SINGLE_QUOTES);
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
