package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hg extends hf implements IAnimationSet {
    public hg(boolean z) {
        if (this.a == null) {
            this.a = new hx(z);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setDuration(long j) {
        if (this.a == null) {
            return;
        }
        this.a.a(j);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setInterpolator(Interpolator interpolator) {
        if (this.a == null || interpolator == null) {
            return;
        }
        this.a.f = interpolator;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet
    public final boolean addAnimation(Animation animation) {
        if (animation != null && (animation instanceof hf)) {
            hf hfVar = (hf) animation;
            if (hfVar.a == null || this.a == null) {
                return false;
            }
            ((hx) this.a).a(hfVar.a);
            return true;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet
    public final void cleanAnimation() {
        if (this.a == null) {
            return;
        }
        ((hx) this.a).c();
    }
}
