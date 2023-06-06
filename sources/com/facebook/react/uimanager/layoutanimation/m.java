package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m extends Animation implements j {
    private final View a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private int g;
    private int h;
    private int i;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    public m(View view, int i, int i2, int i3, int i4) {
        this.a = view;
        b(i, i2, i3, i4);
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.b + (this.d * f);
        float f3 = this.c + (this.e * f);
        this.a.layout(Math.round(f2), Math.round(f3), Math.round(f2 + this.f + (this.h * f)), Math.round(f3 + this.g + (this.i * f)));
    }

    @Override // com.facebook.react.uimanager.layoutanimation.j
    public final void a(int i, int i2, int i3, int i4) {
        b(i, i2, i3, i4);
    }

    private void b(int i, int i2, int i3, int i4) {
        this.b = this.a.getX() - this.a.getTranslationX();
        this.c = this.a.getY() - this.a.getTranslationY();
        this.f = this.a.getWidth();
        this.g = this.a.getHeight();
        this.d = i - this.b;
        this.e = i2 - this.c;
        this.h = i3 - this.f;
        this.i = i4 - this.g;
    }
}
