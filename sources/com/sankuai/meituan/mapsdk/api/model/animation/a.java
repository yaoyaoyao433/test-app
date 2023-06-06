package com.sankuai.meituan.mapsdk.api.model.animation;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.animation.AlphaAnimation;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends d {
    public static ChangeQuickRedirect a;

    public a(com.sankuai.meituan.mapsdk.core.interfaces.e eVar, Animation animation) {
        super(eVar, animation);
        Object[] objArr = {eVar, animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82abe1e35cbd2750d7f3b20c441a79eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82abe1e35cbd2750d7f3b20c441a79eb");
            return;
        }
        AlphaAnimation alphaAnimation = (AlphaAnimation) animation;
        setObjectValues(new Object[]{Float.valueOf(alphaAnimation.getFromAlpha()), Float.valueOf(alphaAnimation.getToAlpha())});
    }

    @Override // com.sankuai.meituan.mapsdk.api.model.animation.d
    public final void a(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6617959761df72465819e1c54f29059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6617959761df72465819e1c54f29059");
        } else {
            this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
