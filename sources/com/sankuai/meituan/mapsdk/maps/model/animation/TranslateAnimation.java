package com.sankuai.meituan.mapsdk.maps.model.animation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TranslateAnimation extends Animation {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LatLng d;

    public TranslateAnimation(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd71981c62b90ec15fe1344a20681258", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd71981c62b90ec15fe1344a20681258");
            return;
        }
        this.a = Animation.AnimationType.TRANSLATE;
        this.d = latLng;
    }

    public LatLng getTarget() {
        return this.d;
    }
}
