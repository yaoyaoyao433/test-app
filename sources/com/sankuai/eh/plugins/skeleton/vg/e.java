package com.sankuai.eh.plugins.skeleton.vg;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final d b;

    private e(d dVar) {
        this.b = dVar;
    }

    public static ValueAnimator.AnimatorUpdateListener a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff12820e388e2c161ad8f7a8956126f0", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff12820e388e2c161ad8f7a8956126f0") : new e(dVar);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a461fc30546dcf63841dd237be60bc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a461fc30546dcf63841dd237be60bc4");
        } else {
            d.a(this.b, valueAnimator);
        }
    }
}
