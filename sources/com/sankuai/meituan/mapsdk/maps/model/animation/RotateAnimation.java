package com.sankuai.meituan.mapsdk.maps.model.animation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RotateAnimation extends Animation {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;

    public RotateAnimation(float f, float f2, float f3, float f4, float f5) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efa341026a27751b1ae0ce0b960d00eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efa341026a27751b1ae0ce0b960d00eb");
            return;
        }
        this.a = Animation.AnimationType.ROTATE;
        this.d = f;
        this.e = f2;
        this.f = Math.min(1.0f, Math.max(0.0f, f3));
        this.g = Math.min(1.0f, Math.max(0.0f, f4));
        this.h = f5;
    }

    public RotateAnimation(float f, float f2) {
        this(f, f2, 0.0f, 0.0f, 0.0f);
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c826c6dbe2847407f607a8c23b89a862", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c826c6dbe2847407f607a8c23b89a862");
        }
    }

    public float getFromdegree() {
        return this.d;
    }

    public float getTodegree() {
        return this.e;
    }

    public float getPivotx() {
        return this.f;
    }

    public float getPivoty() {
        return this.g;
    }

    public float getPivotz() {
        return this.h;
    }
}
