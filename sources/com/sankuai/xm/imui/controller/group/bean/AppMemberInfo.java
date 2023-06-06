package com.sankuai.xm.imui.controller.group.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AppMemberInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<Short> mAppIds;
    private long mUid;

    public long getUid() {
        return this.mUid;
    }

    public void setUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "954e58fb4b1f2fcc141c00678609b42e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "954e58fb4b1f2fcc141c00678609b42e");
        } else {
            this.mUid = j;
        }
    }

    public List<Short> getAppIds() {
        return this.mAppIds;
    }

    public void setAppIds(List<Short> list) {
        this.mAppIds = list;
    }
}
