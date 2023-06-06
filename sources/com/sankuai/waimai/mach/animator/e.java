package com.sankuai.waimai.mach.animator;

import android.animation.TimeInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements TimeInterpolator {
    public static ChangeQuickRedirect a;
    private final TimeInterpolator b;

    public e(TimeInterpolator timeInterpolator) {
        Object[] objArr = {timeInterpolator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bff9a3a3804e6d0d10522eed806739dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bff9a3a3804e6d0d10522eed806739dc");
        } else {
            this.b = timeInterpolator;
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218adfafeeb83917d6b2f00adb79aa98", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218adfafeeb83917d6b2f00adb79aa98")).floatValue() : 1.0f - this.b.getInterpolation(f);
    }
}
