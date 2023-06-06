package com.meituan.msc.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m extends Animation implements j {
    public static ChangeQuickRedirect a;
    private final View b;
    private float c;
    private float d;
    private float e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    public m(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c2590760c9c81f49e1732b90cb3bec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c2590760c9c81f49e1732b90cb3bec");
            return;
        }
        this.b = view;
        b(i, i2, i3, i4);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        Object[] objArr = {Float.valueOf(f), transformation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c3d143c55e1d3416695268d9c2c59b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c3d143c55e1d3416695268d9c2c59b");
            return;
        }
        float f2 = this.c + (this.e * f);
        float f3 = this.d + (this.f * f);
        this.b.layout(Math.round(f2), Math.round(f3), Math.round(f2 + this.g + (this.i * f)), Math.round(f3 + this.h + (this.j * f)));
    }

    @Override // com.meituan.msc.uimanager.layoutanimation.j
    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028ca696e17253a42b31683ffd04e7a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028ca696e17253a42b31683ffd04e7a7");
        } else {
            b(i, i2, i3, i4);
        }
    }

    private void b(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619bec1b256af27d9e0449c349f57c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619bec1b256af27d9e0449c349f57c77");
            return;
        }
        this.c = this.b.getX() - this.b.getTranslationX();
        this.d = this.b.getY() - this.b.getTranslationY();
        this.g = this.b.getWidth();
        this.h = this.b.getHeight();
        this.e = i - this.c;
        this.f = i2 - this.d;
        this.i = i3 - this.g;
        this.j = i4 - this.h;
    }
}
