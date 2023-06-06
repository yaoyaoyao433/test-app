package com.sankuai.meituan.mapsdk.maps.model.animation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class EmergeAnimation extends Animation {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LatLng d;

    public EmergeAnimation(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a277673fe864188b8653ddea5d5e617e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a277673fe864188b8653ddea5d5e617e");
            return;
        }
        this.a = Animation.AnimationType.EMERGE;
        this.d = latLng;
    }

    public LatLng getTarget() {
        return this.d;
    }
}
