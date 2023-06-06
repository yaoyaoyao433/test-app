package com.sankuai.titans.protocol.services.statisticInfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum LifeCycleType {
    Titans("titans"),
    Container("webview"),
    WebPage("page");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private String name;

    public static LifeCycleType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57113a8c428ef56f3208bbd29431848b", RobustBitConfig.DEFAULT_VALUE) ? (LifeCycleType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57113a8c428ef56f3208bbd29431848b") : (LifeCycleType) Enum.valueOf(LifeCycleType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LifeCycleType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "adbdfe8b625772cc1152802b80b27d69", RobustBitConfig.DEFAULT_VALUE) ? (LifeCycleType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "adbdfe8b625772cc1152802b80b27d69") : (LifeCycleType[]) values().clone();
    }

    LifeCycleType(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8edda270b28350a6e4f21d33f0375a2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8edda270b28350a6e4f21d33f0375a2e");
        } else {
            this.name = str;
        }
    }

    public final String getName() {
        return this.name;
    }
}
