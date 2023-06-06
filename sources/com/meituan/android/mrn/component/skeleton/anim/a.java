package com.meituan.android.mrn.component.skeleton.anim;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected ValueAnimator b;
    protected View c;

    public abstract ValueAnimator a();

    public abstract void a(ValueAnimator valueAnimator);

    public abstract void a(Canvas canvas, RectF rectF, Paint paint);

    public a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1841a2623b5fa7533562b7c7e78796", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1841a2623b5fa7533562b7c7e78796");
            return;
        }
        this.c = view;
        this.b = a();
        this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.android.mrn.component.skeleton.anim.a.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e39b9dc744a45fb3c6d3c9061e697855", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e39b9dc744a45fb3c6d3c9061e697855");
                } else {
                    a.this.a(valueAnimator);
                }
            }
        });
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5ce69709d6e03a1d07a94f2a04300f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5ce69709d6e03a1d07a94f2a04300f");
        } else if (this.b != null) {
            this.b.cancel();
        }
    }

    public final void a(long j) {
        Object[] objArr = {0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a3ad60901eee07132fb40f73a53f1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a3ad60901eee07132fb40f73a53f1c");
        } else if (this.b == null || this.b.isRunning()) {
        } else {
            this.b.setStartDelay(0L);
            this.b.start();
        }
    }
}
