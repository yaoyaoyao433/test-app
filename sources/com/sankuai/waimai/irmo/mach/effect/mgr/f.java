package com.sankuai.waimai.irmo.mach.effect.mgr;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.effect.bean.EffectZoomConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends b<ViewGroup> {
    public static ChangeQuickRedirect b;
    private ViewGroup c;
    private EffectZoomConfig d;
    private float[] e;
    private int f;
    private AnimatorSet g;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3948706a877e9ffd7469220addc78e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3948706a877e9ffd7469220addc78e0");
        } else {
            this.c = viewGroup;
        }
    }

    public f(EffectZoomConfig effectZoomConfig) {
        Object[] objArr = {effectZoomConfig};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed3e0333a31f25ccc6b121124f43d4f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed3e0333a31f25ccc6b121124f43d4f1");
            return;
        }
        this.e = new float[]{1.0f, 1.3f, 1.0f, 1.3f, 1.0f};
        this.f = 1200;
        this.d = effectZoomConfig;
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.b, com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a(com.sankuai.waimai.mach.node.a<ViewGroup> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d230d0dc28d449f32b3708a4a679d402", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d230d0dc28d449f32b3708a4a679d402");
        } else {
            super.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c1455cf62ee29f5741d0436163e71b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c1455cf62ee29f5741d0436163e71b4");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("EffectZoomManager", "start", new Object[0]);
        if (this.c == null) {
            com.sankuai.waimai.foundation.utils.log.a.c("EffectZoomManager", "start - error", new Object[0]);
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eff766163fc6a251204745cf3af42d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eff766163fc6a251204745cf3af42d47");
        } else if (this.c == null || this.d == null) {
        } else {
            float[] fArr = (this.d.zoomValues == null || this.d.zoomValues.length == 0) ? this.e : this.d.zoomValues;
            int i = this.d.repeatCount <= 0 ? 1 : this.d.repeatCount;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, View.SCALE_X, fArr);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.c, View.SCALE_Y, fArr);
            ofFloat.setRepeatCount(i);
            ofFloat2.setRepeatCount(i);
            this.g = new AnimatorSet();
            this.g.setDuration(this.d.duration <= 0 ? this.f : this.d.duration);
            this.g.playTogether(ofFloat, ofFloat2);
            this.g.start();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f06360f2c13cf950e6f28ec6253917b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f06360f2c13cf950e6f28ec6253917b");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("EffectZoomManager", "stop", new Object[0]);
        if (this.g != null) {
            this.g.end();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.b, com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae96b6977f969d3c771463dcd7fc927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae96b6977f969d3c771463dcd7fc927");
        } else {
            b();
        }
    }
}
