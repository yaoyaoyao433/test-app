package com.sankuai.xm.imui.controller.group.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CreateGroupReq {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<Long> mAdminMembers;
    private List<AppMemberInfo> mAppAdminMembers;
    private AppMemberInfo mAppCreator;
    private List<AppMemberInfo> mAppMembers;
    private short mChannel;
    private long mCreator;
    private String mGroupName;
    private int mGroupType;
    private List<Long> mMembers;
    private int mOrgId;

    public CreateGroupReq() {
    }

    public CreateGroupReq(long j, List<Long> list, int i, short s) {
        Object[] objArr = {new Long(j), list, Integer.valueOf(i), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b40f986c97977b3cb628337b98d55c37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b40f986c97977b3cb628337b98d55c37");
            return;
        }
        this.mCreator = j;
        this.mMembers = list;
        this.mGroupType = i;
        this.mChannel = s;
    }

    public long getCreator() {
        return this.mCreator;
    }

    public void setCreator(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af7b28e4ce31bb04a53b0099045023a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af7b28e4ce31bb04a53b0099045023a9");
        } else {
            this.mCreator = j;
        }
    }

    public List<Long> getAdminMembers() {
        return this.mAdminMembers;
    }

    public void setAdminMembers(List<Long> list) {
        this.mAdminMembers = list;
    }

    public List<Long> getMembers() {
        return this.mMembers;
    }

    public void setMembers(List<Long> list) {
        this.mMembers = list;
    }

    public int getGroupType() {
        return this.mGroupType;
    }

    public void setGroupType(int i) {
        this.mGroupType = i;
    }

    public int getOrgId() {
        return this.mOrgId;
    }

    public void setOrgId(int i) {
        this.mOrgId = i;
    }

    public String getGroupName() {
        return this.mGroupName;
    }

    public void setGroupName(String str) {
        this.mGroupName = str;
    }

    public short getChannel() {
        return this.mChannel;
    }

    public void setChannel(short s) {
        this.mChannel = s;
    }

    public AppMemberInfo getAppCreator() {
        return this.mAppCreator;
    }

    public void setAppCreator(AppMemberInfo appMemberInfo) {
        this.mAppCreator = appMemberInfo;
    }

    public List<AppMemberInfo> getAppAdminMembers() {
        return this.mAppAdminMembers;
    }

    public void setAppAdminMembers(List<AppMemberInfo> list) {
        this.mAppAdminMembers = list;
    }

    public List<AppMemberInfo> getAppMembers() {
        return this.mAppMembers;
    }

    public void setAppMembers(List<AppMemberInfo> list) {
        this.mAppMembers = list;
    }
}
