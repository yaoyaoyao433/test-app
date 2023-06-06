package com.sankuai.xm.imui.controller.group.bean;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
import java.util.Arrays;
/* compiled from: ProGuard */
@Entity(name = GroupAnnouncement.TABLE_NAME)
/* loaded from: classes6.dex */
public class GroupAnnouncement {
    public static final String GROUP_ANNOUNCEMENT_CONTENT = "content";
    public static final String GROUP_ANNOUNCEMENT_EDITOR = "editor";
    public static final String GROUP_ANNOUNCEMENT_EDITOR_TIME = "ed_time";
    public static final String GROUP_ANNOUNCEMENT_EDITOR_UID = "ed_uid";
    public static final String GROUP_ANNOUNCEMENT_ID = "gaid";
    public static final String GROUP_ANNOUNCEMENT_READ = "read";
    public static final String GROUP_ANNOUNCEMENT_UNREAD_COUNT = "unreadCount";
    public static final String GROUP_ID = "gid";
    public static final short READ = 1;
    public static final String TABLE_NAME = "group_announcement";
    public static final short UNREAD = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(name = GROUP_ANNOUNCEMENT_ID)
    private long mAnnouncementId;
    @Property(name = "content")
    private String mContent;
    @Property(name = GROUP_ANNOUNCEMENT_EDITOR)
    private String mEditor;
    @Property(name = GROUP_ANNOUNCEMENT_EDITOR_TIME)
    private long mEditorTime;
    @Property(name = GROUP_ANNOUNCEMENT_EDITOR_UID)
    private long mEditorUid;
    @Id
    @Property(name = "gid")
    private long mGid;
    @Property(name = GROUP_ANNOUNCEMENT_READ)
    private short mRead;
    @Property(name = GROUP_ANNOUNCEMENT_UNREAD_COUNT)
    private int mUnreadCount;

    public GroupAnnouncement() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96442d1506f7793a844c84ec1bede062", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96442d1506f7793a844c84ec1bede062");
            return;
        }
        this.mRead = (short) 0;
        this.mUnreadCount = 0;
    }

    @GetM(property = "mGid")
    public long getGid() {
        return this.mGid;
    }

    @SetM(property = "mGid")
    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90b291e9a20750d9c64a0210ad4aa001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90b291e9a20750d9c64a0210ad4aa001");
        } else {
            this.mGid = j;
        }
    }

    @GetM(property = "mAnnouncementId")
    public long getAnnouncementId() {
        return this.mAnnouncementId;
    }

    @SetM(property = "mAnnouncementId")
    public void setAnnouncementId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67c143c457ec55e8e86613a3c2f885e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67c143c457ec55e8e86613a3c2f885e9");
        } else {
            this.mAnnouncementId = j;
        }
    }

    @GetM(property = "mContent")
    public String getContent() {
        return this.mContent;
    }

    @SetM(property = "mContent")
    public void setContent(String str) {
        this.mContent = str;
    }

    @GetM(property = "mEditor")
    public String getEditor() {
        return this.mEditor;
    }

    @SetM(property = "mEditor")
    public void setEditor(String str) {
        this.mEditor = str;
    }

    @GetM(property = "mEditorUid")
    public long getEditorUid() {
        return this.mEditorUid;
    }

    @SetM(property = "mEditorUid")
    public void setEditorUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcb11e2d69ceebe2f63e002b866d804a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcb11e2d69ceebe2f63e002b866d804a");
        } else {
            this.mEditorUid = j;
        }
    }

    @GetM(property = "mEditorTime")
    public long getEditorTime() {
        return this.mEditorTime;
    }

    @SetM(property = "mEditorTime")
    public void setEditorTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c1092b7ee01740f191e9afe340b2e89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c1092b7ee01740f191e9afe340b2e89");
        } else {
            this.mEditorTime = j;
        }
    }

    @SetM(property = "mRead")
    public void setRead(short s) {
        this.mRead = s;
    }

    @GetM(property = "mRead")
    public short getRead() {
        return this.mRead;
    }

    @GetM(property = "mUnreadCount")
    public int getUnreadCount() {
        return this.mUnreadCount;
    }

    @SetM(property = "mUnreadCount")
    public void setUnreadCount(int i) {
        this.mUnreadCount = i;
    }

    public boolean isRead() {
        return this.mRead == 1;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cba8f3026f2edb9779e2621585e56334", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cba8f3026f2edb9779e2621585e56334")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupAnnouncement groupAnnouncement = (GroupAnnouncement) obj;
        return this.mGid == groupAnnouncement.mGid && this.mAnnouncementId == groupAnnouncement.mAnnouncementId && this.mEditorUid == groupAnnouncement.mEditorUid && this.mEditorTime == groupAnnouncement.mEditorTime && this.mRead == groupAnnouncement.mRead && this.mUnreadCount == groupAnnouncement.mUnreadCount && TextUtils.equals(this.mContent, groupAnnouncement.mContent) && TextUtils.equals(this.mEditor, groupAnnouncement.mEditor);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "072862b9a8752276f98fc233c8005ed2", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "072862b9a8752276f98fc233c8005ed2")).intValue() : Arrays.hashCode(new Object[]{Long.valueOf(this.mGid), Long.valueOf(this.mAnnouncementId), this.mContent, this.mEditor, Long.valueOf(this.mEditorUid), Long.valueOf(this.mEditorTime), Short.valueOf(this.mRead), Integer.valueOf(this.mUnreadCount)});
    }
}
