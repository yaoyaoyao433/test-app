package com.sankuai.meituan.mapsdk.maps.model.animation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FrameAnimation extends Animation {
    public static ChangeQuickRedirect changeQuickRedirect;
    private BitmapDescriptor[] d;

    public FrameAnimation(BitmapDescriptor[] bitmapDescriptorArr) {
        Object[] objArr = {bitmapDescriptorArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1be2ab51e3a255f91667bb6ee9efddbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1be2ab51e3a255f91667bb6ee9efddbe");
            return;
        }
        this.a = Animation.AnimationType.FRAME;
        this.d = bitmapDescriptorArr;
    }

    public BitmapDescriptor[] getFrameIcons() {
        return this.d;
    }
}
