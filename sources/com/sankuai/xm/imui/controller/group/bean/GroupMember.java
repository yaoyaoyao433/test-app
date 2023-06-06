package com.sankuai.xm.imui.controller.group.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Index;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "group_member_index", value = "gid, uid")}, name = GroupMember.TABLE_NAME)
/* loaded from: classes6.dex */
public class GroupMember {
    public static final String GROUP_ID = "gid";
    public static final String MEMBER_ID = "uid";
    public static final String MEMBER_JOIN_TIME = "jts";
    public static final String MEMBER_ROLE = "role";
    public static final String TABLE_NAME = "group_member";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Id
    @Property(name = "gid")
    private long mGid;
    @Property(name = MEMBER_JOIN_TIME)
    private long mJoinTime;
    @Property(name = MEMBER_ROLE)
    private String mRole;
    @Id
    @Property(name = "uid")
    private long mUid;

    public GroupMember(long j, long j2, String str) {
        Object[] objArr = {new Long(j), new Long(j2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c232ca72e3787c2a097d80955728fd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c232ca72e3787c2a097d80955728fd0");
            return;
        }
        this.mRole = "participant";
        this.mGid = j;
        this.mUid = j2;
        this.mRole = str;
    }

    public GroupMember() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "283e1e86ab82f2357196c1c6839d48f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "283e1e86ab82f2357196c1c6839d48f6");
        } else {
            this.mRole = "participant";
        }
    }

    @GetM(property = "mGid")
    public long getGid() {
        return this.mGid;
    }

    @SetM(property = "mGid")
    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc713ee5c3b3d6cb40142cdd4c05f1f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc713ee5c3b3d6cb40142cdd4c05f1f4");
        } else {
            this.mGid = j;
        }
    }

    @GetM(property = "mUid")
    public long getUid() {
        return this.mUid;
    }

    @SetM(property = "mUid")
    public void setUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "193599749e5ff99e6869c416eae2da93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "193599749e5ff99e6869c416eae2da93");
        } else {
            this.mUid = j;
        }
    }

    @GetM(property = "mRole")
    public String getRole() {
        return this.mRole;
    }

    @SetM(property = "mRole")
    public void setRole(String str) {
        this.mRole = str;
    }

    @GetM(property = "mJoinTime")
    public long getJoinTime() {
        return this.mJoinTime;
    }

    @SetM(property = "mJoinTime")
    public void setJoinTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79162d0b61f799b1364a4d5b6b009f34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79162d0b61f799b1364a4d5b6b009f34");
        } else {
            this.mJoinTime = j;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e79d29f751cda98d8a3b28ab9694c4f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e79d29f751cda98d8a3b28ab9694c4f");
        }
        return "GroupMember{mGid=" + this.mGid + ", mUid=" + this.mUid + ", mRole='" + this.mRole + "', mJoinTime=" + this.mJoinTime + '}';
    }

    public boolean isValid() {
        return this.mGid > 0 && this.mUid > 0;
    }
}
