package com.sankuai.waimai.machpro.component.swiper_v2;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements MPViewPager.d {
    public static ChangeQuickRedirect a;
    private float b;

    public f(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "356cb46edb10d5a0d9792555001ff112", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "356cb46edb10d5a0d9792555001ff112");
            return;
        }
        this.b = 1.0f;
        this.b = f;
    }

    @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.d
    public final void a(@NonNull View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c419c731da686359358261c32bb484e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c419c731da686359358261c32bb484e");
            return;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i == 0) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else if (f >= 1.0f || f <= -1.0f) {
            view.setScaleX(this.b);
            view.setScaleY(this.b);
        }
        if (f < 0.0f && f > -1.0f) {
            float abs = 1.0f - ((1.0f - this.b) * Math.abs(f));
            view.setScaleX(abs);
            view.setScaleY(abs);
        }
        if (i <= 0 || f >= 1.0f) {
            return;
        }
        float f2 = this.b + ((1.0f - f) * (1.0f - this.b));
        view.setScaleX(f2);
        view.setScaleY(f2);
    }
}
