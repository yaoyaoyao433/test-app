package com.sankuai.waimai.restaurant.shopcart.ui;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class z extends Animation implements Animation.AnimationListener {
    public static ChangeQuickRedirect f;
    private final int a;
    private final int b;
    private final int c;

    private float a(float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0919b51f0e64c1b745b8a1ade94c3ab5", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0919b51f0e64c1b745b8a1ade94c3ab5")).floatValue() : (f4 - f2) / (f3 - f2);
    }

    private float b(float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515b3dc740631f79c1c1fd469ffa21d2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515b3dc740631f79c1c1fd469ffa21d2")).floatValue() : f2 + ((f3 - f2) * f4);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public z(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3efc5d2d64de872910cb9cbc690be2a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3efc5d2d64de872910cb9cbc690be2a1");
            return;
        }
        this.a = -i;
        this.b = i2;
        this.c = i3;
        setDuration(350L);
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f2, Transformation transformation) {
        float b;
        float f3;
        Object[] objArr = {Float.valueOf(f2), transformation};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b61543d024bf59800ff1433906fb97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b61543d024bf59800ff1433906fb97");
            return;
        }
        float f4 = this.b * f2;
        if (f2 < 0.2f) {
            float f5 = this.a;
            float a = a(0.0f, 0.2f, f2);
            Object[] objArr2 = {Float.valueOf(a)};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1fb9883646854aad67b89ad23d836406", RobustBitConfig.DEFAULT_VALUE)) {
                f3 = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1fb9883646854aad67b89ad23d836406")).floatValue();
            } else {
                float f6 = 1.0f - a;
                f3 = 1.0f - (f6 * f6);
            }
            b = b(0.0f, f5, f3);
        } else {
            float a2 = a(0.2f, 1.0f, f2);
            b = b(this.a, this.c, a2 * a2);
        }
        transformation.getMatrix().setTranslate(f4, b);
    }
}
