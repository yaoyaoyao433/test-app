package com.sankuai.waimai.irmo.mach.effect.mgr;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends b<ViewGroup> {
    public static ChangeQuickRedirect b;
    private com.sankuai.waimai.irmo.widget.c c;

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void c() {
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void d() {
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final /* synthetic */ void a(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf49743db68765aa0df696952be97e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf49743db68765aa0df696952be97e6");
            return;
        }
        this.c = new com.sankuai.waimai.irmo.widget.c(viewGroup.getContext());
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(this.c, viewGroup.getChildCount());
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.b, com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a(com.sankuai.waimai.mach.node.a<ViewGroup> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c97762c8eef04f5142b1876b98020f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c97762c8eef04f5142b1876b98020f0");
        } else {
            super.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae84b65b067810eeeb7832dbf00a532e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae84b65b067810eeeb7832dbf00a532e");
        } else if (this.c != null) {
            this.c.setVisibility(0);
            com.sankuai.waimai.foundation.utils.log.a.c("EffectLightManager", "start--mScanningView=" + this.c.toString(), new Object[0]);
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c("EffectLightManager", "start--error=", new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c91ff730d51f1585cf314aa97bb4555c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c91ff730d51f1585cf314aa97bb4555c");
        } else if (this.c != null) {
            this.c.setVisibility(8);
            com.sankuai.waimai.foundation.utils.log.a.c("EffectLightManager", "stop--mScanningView=" + this.c.toString(), new Object[0]);
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c("EffectLightManager", "stop--error=", new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.b, com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b5edc09a1fbc0f7e23408e155406c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b5edc09a1fbc0f7e23408e155406c7");
        } else {
            b();
        }
    }
}
