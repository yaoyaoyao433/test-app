package com.sankuai.xm.imui.controller.group.bean;

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
public class GroupMember$$TableProxy implements TableProxy<GroupMember> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(GroupMember groupMember) {
        Object[] objArr = {groupMember};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30d592f4991a82baec542755fb3783cb", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30d592f4991a82baec542755fb3783cb");
        }
        if (groupMember == null) {
            return null;
        }
        d dVar = new d(GroupMember.TABLE_NAME, groupMember.getClass());
        dVar.a(new d.a("group_member_index", "gid, uid", false));
        a aVar = new a("gid", 5);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        dVar.a("gid", aVar);
        a aVar2 = new a("uid", 5);
        a.C1377a c1377a2 = new a.C1377a();
        c1377a2.a = false;
        aVar2.d = c1377a2;
        dVar.a(aVar2);
        dVar.a("uid", aVar2);
        dVar.a(GroupMember.MEMBER_ROLE, new a(GroupMember.MEMBER_ROLE, 1));
        dVar.a(GroupMember.MEMBER_JOIN_TIME, new a(GroupMember.MEMBER_JOIN_TIME, 5));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(GroupMember groupMember) {
        Object[] objArr = {groupMember};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b3bbf3f40ef6a050e67ecbf60773876", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b3bbf3f40ef6a050e67ecbf60773876");
        }
        if (groupMember == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("gid", Long.valueOf(groupMember.getGid()));
        contentValues.put("uid", Long.valueOf(groupMember.getUid()));
        contentValues.put(GroupMember.MEMBER_ROLE, groupMember.getRole());
        contentValues.put(GroupMember.MEMBER_JOIN_TIME, Long.valueOf(groupMember.getJoinTime()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "375b156dc28566fbfbda7542bd47ea6e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "375b156dc28566fbfbda7542bd47ea6e")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(GroupMember groupMember, String[] strArr) {
        Object[] objArr = {groupMember, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbdfefb8c2123f060eb7ae9b40b9b9cb", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbdfefb8c2123f060eb7ae9b40b9b9cb");
        }
        if (groupMember == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains(GroupMember.MEMBER_ROLE, hashSet)) {
            contentValues.put(GroupMember.MEMBER_ROLE, groupMember.getRole());
        }
        if (strArr == null || contains(GroupMember.MEMBER_JOIN_TIME, hashSet)) {
            contentValues.put(GroupMember.MEMBER_JOIN_TIME, Long.valueOf(groupMember.getJoinTime()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public GroupMember query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61139753e683876c34b484d60aad5a43", 6917529027641081856L)) {
            return (GroupMember) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61139753e683876c34b484d60aad5a43");
        }
        if (cursor == null) {
            return null;
        }
        GroupMember groupMember = new GroupMember();
        int columnIndex = cursor.getColumnIndex("gid");
        if (columnIndex != -1) {
            groupMember.setGid(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("uid");
        if (columnIndex2 != -1) {
            groupMember.setUid(cursor.getLong(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex(GroupMember.MEMBER_ROLE);
        if (columnIndex3 != -1) {
            groupMember.setRole(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(GroupMember.MEMBER_JOIN_TIME);
        if (columnIndex4 != -1) {
            groupMember.setJoinTime(cursor.getLong(columnIndex4));
        }
        return groupMember;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(GroupMember groupMember) {
        Object[] objArr = {groupMember};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "499074b7f7fb269e00e00921074d2bc3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "499074b7f7fb269e00e00921074d2bc3");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gid=" + groupMember.getGid());
        sb.append(" AND ");
        sb.append("uid=" + groupMember.getUid());
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
