package com.meituan.msc.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c extends a {
    public static ChangeQuickRedirect d;

    public abstract boolean c();

    @Override // com.meituan.msc.uimanager.layoutanimation.a
    public final boolean a() {
        return this.c > 0 && this.b != null;
    }

    @Override // com.meituan.msc.uimanager.layoutanimation.a
    public final Animation a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b3178306058a152ecd4483850d45b39", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b3178306058a152ecd4483850d45b39");
        }
        if (this.b != null) {
            switch (this.b) {
                case OPACITY:
                    return new l(view, c() ? view.getAlpha() : 0.0f, c() ? 0.0f : view.getAlpha());
                case SCALE_XY:
                    float f = c() ? 1.0f : 0.0f;
                    float f2 = c() ? 0.0f : 1.0f;
                    return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
                case SCALE_X:
                    return new ScaleAnimation(c() ? 1.0f : 0.0f, c() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
                case SCALE_Y:
                    return new ScaleAnimation(1.0f, 1.0f, c() ? 1.0f : 0.0f, c() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
                default:
                    throw new com.meituan.msc.uimanager.g("Missing animation for property : " + this.b);
            }
        }
        throw new com.meituan.msc.uimanager.g("Missing animated property from animation config");
    }
}
