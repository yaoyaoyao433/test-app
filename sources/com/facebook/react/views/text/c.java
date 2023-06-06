package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends MetricAffectingSpan implements g {
    private final AssetManager a;
    private final int b;
    private final int c;
    @Nullable
    private final String d;
    @Nullable
    private final String e;

    public c(int i, int i2, @Nullable String str, @Nullable String str2, @NonNull AssetManager assetManager) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.a = assetManager;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.b, this.c, this.d, this.e, this.a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@NonNull TextPaint textPaint) {
        a(textPaint, this.b, this.c, this.d, this.e, this.a);
    }

    private static void a(Paint paint, int i, int i2, @Nullable String str, @Nullable String str2, AssetManager assetManager) {
        Typeface a = k.a(paint.getTypeface(), i, i2, str2, assetManager);
        if (Build.VERSION.SDK_INT >= 21) {
            paint.setFontFeatureSettings(str);
        }
        paint.setTypeface(a);
        paint.setSubpixelText(true);
    }
}
