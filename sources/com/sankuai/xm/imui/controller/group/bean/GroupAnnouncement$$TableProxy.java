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
public class GroupAnnouncement$$TableProxy implements TableProxy<GroupAnnouncement> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public d create(GroupAnnouncement groupAnnouncement) {
        Object[] objArr = {groupAnnouncement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d40efa337ecb965199bdbcb0c4990bb", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d40efa337ecb965199bdbcb0c4990bb");
        }
        if (groupAnnouncement == null) {
            return null;
        }
        d dVar = new d(GroupAnnouncement.TABLE_NAME, groupAnnouncement.getClass());
        a aVar = new a("gid", 5);
        a.C1377a c1377a = new a.C1377a();
        c1377a.a = false;
        aVar.d = c1377a;
        dVar.a(aVar);
        dVar.a("gid", aVar);
        dVar.a(GroupAnnouncement.GROUP_ANNOUNCEMENT_ID, new a(GroupAnnouncement.GROUP_ANNOUNCEMENT_ID, 5));
        dVar.a("content", new a("content", 1));
        dVar.a(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR, new a(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR, 1));
        dVar.a(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_UID, new a(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_UID, 5));
        dVar.a(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_TIME, new a(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_TIME, 5));
        dVar.a(GroupAnnouncement.GROUP_ANNOUNCEMENT_READ, new a(GroupAnnouncement.GROUP_ANNOUNCEMENT_READ, 7));
        dVar.a(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT, new a(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT, 6));
        return dVar;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues insert(GroupAnnouncement groupAnnouncement) {
        Object[] objArr = {groupAnnouncement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa48285ed8ff094f531493e8e081d01d", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa48285ed8ff094f531493e8e081d01d");
        }
        if (groupAnnouncement == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("gid", Long.valueOf(groupAnnouncement.getGid()));
        contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_ID, Long.valueOf(groupAnnouncement.getAnnouncementId()));
        contentValues.put("content", groupAnnouncement.getContent());
        contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR, groupAnnouncement.getEditor());
        contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_UID, Long.valueOf(groupAnnouncement.getEditorUid()));
        contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_TIME, Long.valueOf(groupAnnouncement.getEditorTime()));
        contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_READ, Short.valueOf(groupAnnouncement.getRead()));
        contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT, Integer.valueOf(groupAnnouncement.getUnreadCount()));
        return contentValues;
    }

    private boolean contains(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c2eb375da043b98ad91474d522b017c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c2eb375da043b98ad91474d522b017c")).booleanValue();
        }
        if (str == null || set == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public ContentValues update(GroupAnnouncement groupAnnouncement, String[] strArr) {
        Object[] objArr = {groupAnnouncement, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e612c665e0331ab56f951326b28d5881", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e612c665e0331ab56f951326b28d5881");
        }
        if (groupAnnouncement == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            hashSet.addAll(Arrays.asList(strArr));
        }
        ContentValues contentValues = new ContentValues();
        if (strArr == null || contains(GroupAnnouncement.GROUP_ANNOUNCEMENT_ID, hashSet)) {
            contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_ID, Long.valueOf(groupAnnouncement.getAnnouncementId()));
        }
        if (strArr == null || contains("content", hashSet)) {
            contentValues.put("content", groupAnnouncement.getContent());
        }
        if (strArr == null || contains(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR, hashSet)) {
            contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR, groupAnnouncement.getEditor());
        }
        if (strArr == null || contains(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_UID, hashSet)) {
            contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_UID, Long.valueOf(groupAnnouncement.getEditorUid()));
        }
        if (strArr == null || contains(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_TIME, hashSet)) {
            contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_TIME, Long.valueOf(groupAnnouncement.getEditorTime()));
        }
        if (strArr == null || contains(GroupAnnouncement.GROUP_ANNOUNCEMENT_READ, hashSet)) {
            contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_READ, Short.valueOf(groupAnnouncement.getRead()));
        }
        if (strArr == null || contains(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT, hashSet)) {
            contentValues.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT, Integer.valueOf(groupAnnouncement.getUnreadCount()));
        }
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public GroupAnnouncement query(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc81175b08dd3a0aab750f47c47a68b2", 6917529027641081856L)) {
            return (GroupAnnouncement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc81175b08dd3a0aab750f47c47a68b2");
        }
        if (cursor == null) {
            return null;
        }
        GroupAnnouncement groupAnnouncement = new GroupAnnouncement();
        int columnIndex = cursor.getColumnIndex("gid");
        if (columnIndex != -1) {
            groupAnnouncement.setGid(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex(GroupAnnouncement.GROUP_ANNOUNCEMENT_ID);
        if (columnIndex2 != -1) {
            groupAnnouncement.setAnnouncementId(cursor.getLong(columnIndex2));
        }
        int columnIndex3 = cursor.getColumnIndex("content");
        if (columnIndex3 != -1) {
            groupAnnouncement.setContent(cursor.getString(columnIndex3));
        }
        int columnIndex4 = cursor.getColumnIndex(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR);
        if (columnIndex4 != -1) {
            groupAnnouncement.setEditor(cursor.getString(columnIndex4));
        }
        int columnIndex5 = cursor.getColumnIndex(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_UID);
        if (columnIndex5 != -1) {
            groupAnnouncement.setEditorUid(cursor.getLong(columnIndex5));
        }
        int columnIndex6 = cursor.getColumnIndex(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR_TIME);
        if (columnIndex6 != -1) {
            groupAnnouncement.setEditorTime(cursor.getLong(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex(GroupAnnouncement.GROUP_ANNOUNCEMENT_READ);
        if (columnIndex7 != -1) {
            groupAnnouncement.setRead(cursor.getShort(columnIndex7));
        }
        int columnIndex8 = cursor.getColumnIndex(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT);
        if (columnIndex8 != -1) {
            groupAnnouncement.setUnreadCount(cursor.getInt(columnIndex8));
        }
        return groupAnnouncement;
    }

    @Override // com.sankuai.xm.base.tinyorm.TableProxy
    public String where(GroupAnnouncement groupAnnouncement) {
        Object[] objArr = {groupAnnouncement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b17f05a07bf4c8ae702c82bc7f5b1bf8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b17f05a07bf4c8ae702c82bc7f5b1bf8");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gid=" + groupAnnouncement.getGid());
        sb.append(" AND ");
        if (sb.toString().endsWith(" AND ")) {
            sb.delete(sb.lastIndexOf(" AND "), sb.length() - 1);
        }
        return sb.toString();
    }
}
