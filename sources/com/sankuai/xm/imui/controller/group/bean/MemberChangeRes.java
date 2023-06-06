package com.sankuai.xm.imui.controller.group.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MemberChangeRes {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<Long> mFailedMembers;
    private long mGid;
    private List<Long> mSuccessMembers;

    public MemberChangeRes(long j, List<Long> list, List<Long> list2) {
        Object[] objArr = {new Long(j), list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "266404686291f4974f9aa48bb97f15bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "266404686291f4974f9aa48bb97f15bd");
            return;
        }
        this.mGid = j;
        this.mSuccessMembers = list;
        this.mFailedMembers = list2;
    }

    public long getGid() {
        return this.mGid;
    }

    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebb2e0fde691180dfc986c36fd6f3d2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebb2e0fde691180dfc986c36fd6f3d2b");
        } else {
            this.mGid = j;
        }
    }

    public List<Long> getSuccessMembers() {
        return this.mSuccessMembers;
    }

    public void setSuccessMembers(List<Long> list) {
        this.mSuccessMembers = list;
    }

    public List<Long> getFailedMembers() {
        return this.mFailedMembers;
    }

    public void setFailedMembers(List<Long> list) {
        this.mFailedMembers = list;
    }
}
