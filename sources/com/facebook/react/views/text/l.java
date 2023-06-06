package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l extends CharacterStyle implements g {
    private final float a;
    private final float b;
    private final float c;
    private final int d;

    public l(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.c, this.a, this.b, this.d);
    }
}
