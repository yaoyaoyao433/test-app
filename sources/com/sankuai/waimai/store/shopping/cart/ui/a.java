package com.sankuai.waimai.store.shopping.cart.ui;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends Animation implements Animation.AnimationListener {
    public static ChangeQuickRedirect h;
    private final float a;
    private final int b;
    private final int c;
    private final int d;

    private float a(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633f667a6a998ce74258be4a2c448fd2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633f667a6a998ce74258be4a2c448fd2")).floatValue() : (f3 - f) / (f2 - f);
    }

    private float b(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48d06293bae5d8a3a7430bf5f50eb50c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48d06293bae5d8a3a7430bf5f50eb50c")).floatValue() : f + ((f2 - f) * f3);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public a(int i, int i2, int i3) {
        this(i, i2, i3, 0.2f);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e29f9fb8ecd8dcbbc9d6861d0282736e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e29f9fb8ecd8dcbbc9d6861d0282736e");
        }
    }

    public a(int i, int i2, int i3, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b7c149a35fc258f0e51df756ec25b4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b7c149a35fc258f0e51df756ec25b4a");
            return;
        }
        this.b = -i;
        this.c = i2;
        this.d = i3;
        this.a = f;
        setDuration(300L);
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        float b;
        float f2;
        Object[] objArr = {Float.valueOf(f), transformation};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7aa642f304ed1001ad6d5c2a08ad3d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7aa642f304ed1001ad6d5c2a08ad3d2");
            return;
        }
        float f3 = this.c * f;
        if (f < this.a) {
            float f4 = this.b;
            float a = a(0.0f, this.a, f);
            Object[] objArr2 = {Float.valueOf(a)};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "884f3be7ddfa38433b40f4c86e4cbd19", RobustBitConfig.DEFAULT_VALUE)) {
                f2 = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "884f3be7ddfa38433b40f4c86e4cbd19")).floatValue();
            } else {
                float f5 = 1.0f - a;
                f2 = 1.0f - (f5 * f5);
            }
            b = b(0.0f, f4, f2);
        } else {
            float a2 = a(this.a, 1.0f, f);
            b = b(this.b, this.d, a2 * a2);
        }
        transformation.getMatrix().setTranslate(f3, b);
    }
}
