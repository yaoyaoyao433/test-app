package com.sankuai.waimai.irmo.mach.effect.mgr;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.effect.bean.EffectBreathingLightConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends b<ViewGroup> {
    public static ChangeQuickRedirect b;
    private com.sankuai.waimai.irmo.widget.a c;
    private EffectBreathingLightConfig d;
    private String e;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302b2788d2f8e5bfc7b17fdab661f1aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302b2788d2f8e5bfc7b17fdab661f1aa");
            return;
        }
        this.c = new com.sankuai.waimai.irmo.widget.a(viewGroup.getContext());
        if (this.d != null) {
            this.c.setDuration(this.d.duration);
            this.c.setShadowColor(this.d.color);
        }
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(this.c, 0);
        this.e = this.c.toString();
        com.sankuai.waimai.foundation.utils.log.a.c("EffectLightManager", "onViewCreated--mScanningView=" + this.e, new Object[0]);
    }

    public c(EffectBreathingLightConfig effectBreathingLightConfig) {
        Object[] objArr = {effectBreathingLightConfig};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d635c8758edb5f194fc29001dac7e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d635c8758edb5f194fc29001dac7e6");
        } else {
            this.d = effectBreathingLightConfig;
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.b, com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a(com.sankuai.waimai.mach.node.a<ViewGroup> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd107e2edc98b3ad4070146f21cd82ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd107e2edc98b3ad4070146f21cd82ef");
            return;
        }
        super.a(aVar);
        com.sankuai.waimai.foundation.utils.log.a.c("EffectLightManager", "onBind--mScanningView=" + this.e, new Object[0]);
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "176c959a06b36f832b3b8cdabde97696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "176c959a06b36f832b3b8cdabde97696");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3deaa7f66079a56b90186cca8b691b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3deaa7f66079a56b90186cca8b691b39");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "135a0e3f3393457cd5ef67d667f7d88c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "135a0e3f3393457cd5ef67d667f7d88c");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("EffectLightManager", "onUnbind--mScanningView=" + this.e, new Object[0]);
        b();
    }
}
