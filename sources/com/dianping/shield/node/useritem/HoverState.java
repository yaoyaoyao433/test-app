package com.dianping.shield.node.useritem;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum HoverState {
    NORMAL,
    HOVER,
    END;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    HoverState() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc0155d1db1d51c85a66a67803d9fa50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc0155d1db1d51c85a66a67803d9fa50");
        }
    }

    public static HoverState valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f826e10ded649654a40e6fe953953557", RobustBitConfig.DEFAULT_VALUE) ? (HoverState) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f826e10ded649654a40e6fe953953557") : (HoverState) Enum.valueOf(HoverState.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static HoverState[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "44f2a0fc9dfce31f3ea61601b18b0918", RobustBitConfig.DEFAULT_VALUE) ? (HoverState[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "44f2a0fc9dfce31f3ea61601b18b0918") : (HoverState[]) values().clone();
    }
}
