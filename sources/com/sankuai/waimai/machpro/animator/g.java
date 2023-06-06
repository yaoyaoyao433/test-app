package com.sankuai.waimai.machpro.animator;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends ValueAnimator {
    public static ChangeQuickRedirect a;
    protected final String b;
    protected final View c;
    protected final com.facebook.yoga.d d;

    private g(com.facebook.yoga.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957c292b0a238b414a58cc9939a56cad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957c292b0a238b414a58cc9939a56cad");
            return;
        }
        this.b = str;
        this.d = dVar;
        this.c = (View) dVar.w();
    }

    public static g a(com.facebook.yoga.d dVar, String str, PropertyValuesHolder propertyValuesHolder) {
        Object[] objArr = {dVar, str, propertyValuesHolder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3220a83ef0904ebc3ab220cabb2f07a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3220a83ef0904ebc3ab220cabb2f07a5");
        }
        g gVar = new g(dVar, str);
        gVar.setValues(propertyValuesHolder);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "99981e27dbbaa759f3b4165263d4dec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "99981e27dbbaa759f3b4165263d4dec9");
        } else {
            gVar.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.machpro.animator.g.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr3 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a75c26ff645a1d099793aa2543e75466", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a75c26ff645a1d099793aa2543e75466");
                    } else {
                        g.this.a(com.sankuai.waimai.mach.utils.g.a(String.valueOf(valueAnimator.getAnimatedValue())));
                    }
                }
            });
        }
        return gVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0150, code lost:
        if (r1.equals("height") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(float r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.animator.g.a(float):void");
    }
}
