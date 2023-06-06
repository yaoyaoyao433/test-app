package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.w;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    public boolean a = true;
    public float b = Float.NaN;
    float c = Float.NaN;
    public float d = Float.NaN;
    public float e = Float.NaN;
    float f = Float.NaN;
    r g = r.UNSET;

    public final void a(float f) {
        this.b = f;
    }

    public final void b(float f) {
        if (f != 0.0f && f < 1.0f) {
            throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
        }
        this.e = f;
    }

    public final int a() {
        float f = !Float.isNaN(this.b) ? this.b : 14.0f;
        if (this.a) {
            return (int) Math.ceil(w.a(f, d()));
        }
        return (int) Math.ceil(w.a(f));
    }

    public final float b() {
        float a;
        if (Float.isNaN(this.c)) {
            return Float.NaN;
        }
        if (this.a) {
            a = w.a(this.c, d());
        } else {
            a = w.a(this.c);
        }
        return !Float.isNaN(this.f) && (this.f > a ? 1 : (this.f == a ? 0 : -1)) > 0 ? this.f : a;
    }

    public final float c() {
        float a;
        if (Float.isNaN(this.d)) {
            return Float.NaN;
        }
        if (this.a) {
            a = w.a(this.d, d());
        } else {
            a = w.a(this.d);
        }
        return a / a();
    }

    private float d() {
        if (Float.isNaN(this.e)) {
            return 0.0f;
        }
        return this.e;
    }

    public final String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + this.a + "\n  getFontSize(): " + this.b + "\n  getEffectiveFontSize(): " + a() + "\n  getHeightOfTallestInlineViewOrImage(): " + this.f + "\n  getLetterSpacing(): " + this.d + "\n  getEffectiveLetterSpacing(): " + c() + "\n  getLineHeight(): " + this.c + "\n  getEffectiveLineHeight(): " + b() + "\n  getTextTransform(): " + this.g + "\n  getMaxFontSizeMultiplier(): " + this.e + "\n  getEffectiveMaxFontSizeMultiplier(): " + d() + "\n}";
    }
}
