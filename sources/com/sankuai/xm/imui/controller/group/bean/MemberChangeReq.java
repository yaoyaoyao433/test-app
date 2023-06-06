package com.sankuai.xm.imui.controller.group.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MemberChangeReq {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AppMemberInfo> mAppMembers;
    private short mChannel;
    private long mGid;
    private List<Long> mMembers;

    public MemberChangeReq() {
    }

    public MemberChangeReq(long j, List<Long> list, short s) {
        Object[] objArr = {new Long(j), list, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d1938412bc61de73c78bbc9bbc3f17a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d1938412bc61de73c78bbc9bbc3f17a");
            return;
        }
        this.mGid = j;
        this.mMembers = list;
        this.mChannel = s;
    }

    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1332d5638f74cb376c8402746b2661a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1332d5638f74cb376c8402746b2661a");
        } else {
            this.mGid = j;
        }
    }

    public long getGid() {
        return this.mGid;
    }

    public void setMembers(List<Long> list) {
        this.mMembers = list;
    }

    public List<Long> getMembers() {
        return this.mMembers;
    }

    public void setChannel(short s) {
        this.mChannel = s;
    }

    public short getChannel() {
        return this.mChannel;
    }

    public List<AppMemberInfo> getAppMembers() {
        return this.mAppMembers;
    }

    public void setAppMembers(List<AppMemberInfo> list) {
        this.mAppMembers = list;
    }
}
