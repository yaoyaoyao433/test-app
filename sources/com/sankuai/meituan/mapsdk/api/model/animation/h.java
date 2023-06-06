package com.sankuai.meituan.mapsdk.api.model.animation;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.ScaleAnimation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends d {
    public static ChangeQuickRedirect a;

    public h(com.sankuai.meituan.mapsdk.core.interfaces.e eVar, Animation animation) {
        super(eVar, animation);
        Object[] objArr = {eVar, animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "788f4c8c7ec6d9abf9348328adf5b537", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "788f4c8c7ec6d9abf9348328adf5b537");
            return;
        }
        ScaleAnimation scaleAnimation = (ScaleAnimation) animation;
        setObjectValues(new Object[]{Float.valueOf(scaleAnimation.getFromX()), Float.valueOf(scaleAnimation.getToX())});
    }

    @Override // com.sankuai.meituan.mapsdk.api.model.animation.d
    public final void a(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1402b8fae50b4dfb3ea37ac2c552364a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1402b8fae50b4dfb3ea37ac2c552364a");
        } else {
            this.c.setScale(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
