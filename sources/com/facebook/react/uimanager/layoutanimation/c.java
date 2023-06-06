package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class c extends a {
    abstract boolean c();

    @Override // com.facebook.react.uimanager.layoutanimation.a
    final boolean a() {
        return this.b > 0 && this.a != null;
    }

    @Override // com.facebook.react.uimanager.layoutanimation.a
    final Animation a(View view, int i, int i2, int i3, int i4) {
        if (this.a != null) {
            switch (this.a) {
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
                    throw new com.facebook.react.uimanager.i("Missing animation for property : " + this.a);
            }
        }
        throw new com.facebook.react.uimanager.i("Missing animated property from animation config");
    }
}
