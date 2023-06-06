package com.sankuai.meituan.mapsdk.maps.model.animation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ScaleAnimation extends Animation {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float d;
    private float e;
    private float f;
    private float g;

    public ScaleAnimation(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec8f5bd3f4c107758675f8ecf71339b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec8f5bd3f4c107758675f8ecf71339b2");
            return;
        }
        this.a = Animation.AnimationType.SCALE;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    public float getFromX() {
        return this.d;
    }

    public float getToX() {
        return this.e;
    }

    public float getFromY() {
        return this.f;
    }

    public float getToY() {
        return this.g;
    }
}
