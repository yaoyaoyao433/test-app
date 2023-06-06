package com.sankuai.meituan.mapsdk.maps.model.animation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AlphaAnimation extends Animation {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float d;
    private float e;

    public AlphaAnimation(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6a4d03907886e5e49708255aa7e8067", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6a4d03907886e5e49708255aa7e8067");
            return;
        }
        this.d = 0.0f;
        this.e = 1.0f;
        this.a = Animation.AnimationType.ALPHA;
        this.d = f;
        this.e = f2;
    }

    public float getFromAlpha() {
        return this.d;
    }

    public float getToAlpha() {
        return this.e;
    }
}
