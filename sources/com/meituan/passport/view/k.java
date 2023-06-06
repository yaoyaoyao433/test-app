package com.meituan.passport.view;

import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Interpolator {
    public static ChangeQuickRedirect a;
    private static final k b = new k();

    public static Interpolator a() {
        return b;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2d51e7f3157c0205572498ce929cd3", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2d51e7f3157c0205572498ce929cd3")).floatValue() : VerificationFrameView.a(f);
    }
}
