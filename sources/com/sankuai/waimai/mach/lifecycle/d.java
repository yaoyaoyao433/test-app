package com.sankuai.waimai.mach.lifecycle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d implements b {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.mach.lifecycle.b
    public void onActivityCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3ac0ac857f24245f4480b457d4f311b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3ac0ac857f24245f4480b457d4f311b");
        }
    }

    @Override // com.sankuai.waimai.mach.lifecycle.b
    public void onActivityDestroyed() {
    }

    @Override // com.sankuai.waimai.mach.lifecycle.b
    public void onActivityPaused() {
    }

    @Override // com.sankuai.waimai.mach.lifecycle.b
    public void onActivityResumed() {
    }

    @Override // com.sankuai.waimai.mach.lifecycle.b
    public void onActivityStarted() {
    }

    @Override // com.sankuai.waimai.mach.lifecycle.b
    public void onActivityStopped() {
    }
}
