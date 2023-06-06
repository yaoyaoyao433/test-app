package com.sankuai.meituan.mapsdk.api.model.animation;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.RotateAnimation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends d {
    public static ChangeQuickRedirect a;

    public g(com.sankuai.meituan.mapsdk.core.interfaces.e eVar, Animation animation) {
        super(eVar, animation);
        Object[] objArr = {eVar, animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc086e9a1d8f09ca25e68ac0f4cda13f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc086e9a1d8f09ca25e68ac0f4cda13f");
            return;
        }
        RotateAnimation rotateAnimation = (RotateAnimation) animation;
        setObjectValues(new Object[]{Float.valueOf(0.0f - rotateAnimation.getFromdegree()), Float.valueOf(0.0f - rotateAnimation.getTodegree())});
    }

    @Override // com.sankuai.meituan.mapsdk.api.model.animation.d
    public final void a(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95758f0be0e0f6c5902bd60b31f24efd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95758f0be0e0f6c5902bd60b31f24efd");
            return;
        }
        this.c.setAnchor(((RotateAnimation) this.d).getPivotx(), ((RotateAnimation) this.d).getPivoty());
        this.c.setRotateAngle(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
