package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l extends Animation {
    private final View a;
    private final float b;
    private final float c;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements Animation.AnimationListener {
        private final View a;
        private boolean b = false;

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        public a(View view) {
            this.a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }
    }

    public l(View view, float f, float f2) {
        this.a = view;
        this.b = f;
        this.c = f2 - f;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        this.a.setAlpha(this.b + (this.c * f));
    }
}
