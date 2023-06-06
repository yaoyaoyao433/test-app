package com.sankuai.meituan.mapsdk.api.model.animation;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.TranslateAnimation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends d {
    public static ChangeQuickRedirect a;

    public i(com.sankuai.meituan.mapsdk.core.interfaces.e eVar, Animation animation) {
        super(eVar, animation);
        Object[] objArr = {eVar, animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c01c0b1bccd6160dac0c5d7b16024b7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c01c0b1bccd6160dac0c5d7b16024b7a");
            return;
        }
        setObjectValues(new Object[]{eVar.getPosition(), ((TranslateAnimation) animation).getTarget()});
        setEvaluator(new a());
    }

    @Override // com.sankuai.meituan.mapsdk.api.model.animation.d
    public final void a(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af40198a87bcd47cb693f18b5fe2a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af40198a87bcd47cb693f18b5fe2a49");
        } else {
            this.c.setPosition((LatLng) valueAnimator.getAnimatedValue());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a implements TypeEvaluator<LatLng> {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ LatLng evaluate(float f, LatLng latLng, LatLng latLng2) {
            LatLng latLng3 = latLng;
            LatLng latLng4 = latLng2;
            Object[] objArr = {Float.valueOf(f), latLng3, latLng4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae2bcd389ecfe25191c23d4dc04a678", RobustBitConfig.DEFAULT_VALUE)) {
                return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae2bcd389ecfe25191c23d4dc04a678");
            }
            double d = f;
            return new LatLng(latLng3.latitude + ((latLng4.latitude - latLng3.latitude) * d), latLng3.longitude + ((latLng4.longitude - latLng3.longitude) * d));
        }
    }
}
