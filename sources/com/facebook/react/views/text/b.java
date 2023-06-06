package com.facebook.react.views.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements LineHeightSpan, g {
    private final int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(float f) {
        this.a = (int) Math.ceil(f);
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent > this.a) {
            int min = Math.min(this.a, fontMetricsInt.descent);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.a) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            int i5 = (-this.a) + fontMetricsInt.descent;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.a) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.a;
        } else if ((-fontMetricsInt.top) + fontMetricsInt.bottom > this.a) {
            fontMetricsInt.top = fontMetricsInt.bottom - this.a;
        } else {
            double d = (this.a - ((-fontMetricsInt.top) + fontMetricsInt.bottom)) / 2.0f;
            fontMetricsInt.top = (int) (fontMetricsInt.top - Math.ceil(d));
            fontMetricsInt.bottom = (int) (fontMetricsInt.bottom + Math.floor(d));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
