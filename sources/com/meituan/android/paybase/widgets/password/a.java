package com.meituan.android.paybase.widgets.password;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final SafePasswordView b;
    private final int c;

    private a(SafePasswordView safePasswordView, int i) {
        this.b = safePasswordView;
        this.c = i;
    }

    public static ValueAnimator.AnimatorUpdateListener a(SafePasswordView safePasswordView, int i) {
        Object[] objArr = {safePasswordView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd57ecc55757b61becdcbf3d576ff888", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd57ecc55757b61becdcbf3d576ff888") : new a(safePasswordView, i);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b093d6bd5cf3faaa4d258bb21a744b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b093d6bd5cf3faaa4d258bb21a744b4");
        } else {
            SafePasswordView.a(this.b, this.c, valueAnimator);
        }
    }
}
