package com.sankuai.xm.imui.controller.group.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ModifyGroupPermitsReq {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short mChannelId;
    private long mGid;
    private List<GroupPermit> mList;

    public ModifyGroupPermitsReq(long j, short s, List<GroupPermit> list) {
        Object[] objArr = {new Long(j), Short.valueOf(s), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31d813c2db2861a961b72dd609091e8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31d813c2db2861a961b72dd609091e8f");
            return;
        }
        this.mGid = j;
        this.mList = list;
        this.mChannelId = s;
    }

    public long getGid() {
        return this.mGid;
    }

    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "454244995148c0c3ddd48a0e25aefb79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "454244995148c0c3ddd48a0e25aefb79");
        } else {
            this.mGid = j;
        }
    }

    public List<GroupPermit> getList() {
        return this.mList;
    }

    public void setList(List<GroupPermit> list) {
        this.mList = list;
    }

    public short getChannelId() {
        return this.mChannelId;
    }

    public void setChannelId(short s) {
        this.mChannelId = s;
    }
}
