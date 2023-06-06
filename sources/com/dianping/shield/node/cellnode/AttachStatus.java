package com.dianping.shield.node.cellnode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum AttachStatus {
    DETACHED,
    PARTLY_ATTACHED,
    FULLY_ATTACHED,
    PREFETCH;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    AttachStatus() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e97064f934cf768739dc3ff5c1e4ab2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e97064f934cf768739dc3ff5c1e4ab2");
        }
    }

    public static AttachStatus valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06f1f9bb81064ba345e90c5ec37f0b89", RobustBitConfig.DEFAULT_VALUE) ? (AttachStatus) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06f1f9bb81064ba345e90c5ec37f0b89") : (AttachStatus) Enum.valueOf(AttachStatus.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AttachStatus[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63ca2c2f93c6a38eb298c9d79e050c97", RobustBitConfig.DEFAULT_VALUE) ? (AttachStatus[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63ca2c2f93c6a38eb298c9d79e050c97") : (AttachStatus[]) values().clone();
    }
}
