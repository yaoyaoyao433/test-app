package com.sankuai.waimai.machpro.animator;

import android.animation.TimeInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h implements TimeInterpolator {
    public static ChangeQuickRedirect a;
    TimeInterpolator b;

    public h(TimeInterpolator timeInterpolator) {
        Object[] objArr = {timeInterpolator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61baf0ae96fd38b56d1cc212febb1d28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61baf0ae96fd38b56d1cc212febb1d28");
        } else {
            this.b = timeInterpolator;
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5d40c2deff94b3455b88b62ec4f2e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5d40c2deff94b3455b88b62ec4f2e6")).floatValue();
        }
        if (this.b != null) {
            if (f < 0.5d) {
                return this.b.getInterpolation(f) * 2.0f;
            }
            return 2.0f - (this.b.getInterpolation(f) * 2.0f);
        }
        return 1.0f;
    }
}
