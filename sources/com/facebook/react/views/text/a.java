package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: ProGuard */
@TargetApi(21)
/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan implements g {
    private final float a;

    public a(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }

    private void a(TextPaint textPaint) {
        if (Float.isNaN(this.a)) {
            return;
        }
        textPaint.setLetterSpacing(this.a);
    }
}
