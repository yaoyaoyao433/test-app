package com.facebook.fbui.textlayoutbuilder;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.support.annotation.VisibleForTesting;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.util.LruCache;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class TextLayoutBuilder {
    @VisibleForTesting
    static final LruCache<Integer, Layout> e = new LruCache<>(100);
    public int a = 0;
    public int b = 2;
    public int c = Integer.MAX_VALUE;
    public int d = 2;
    @VisibleForTesting
    public final a f = new a();
    public Layout g = null;
    public boolean h = true;
    private boolean i = false;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MeasureMode {
    }

    /* compiled from: ProGuard */
    @VisibleForTesting
    /* loaded from: classes.dex */
    public static class a {
        public float b;
        public float c;
        public float d;
        public int e;
        public int f;
        public int g;
        public CharSequence h;
        public ColorStateList i;
        public int[] v;
        public int[] w;
        public TextPaint a = new TextPaint(1);
        public float j = 1.0f;
        public float k = 0.0f;
        public float l = Float.MAX_VALUE;
        public boolean m = true;
        public TextUtils.TruncateAt n = null;
        public boolean o = false;
        public int p = Integer.MAX_VALUE;
        public Layout.Alignment q = Layout.Alignment.ALIGN_NORMAL;
        public TextDirectionHeuristicCompat r = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        public int s = 0;
        public int t = 0;
        public int u = 0;
        boolean x = false;

        a() {
        }

        public final void a() {
            if (this.x) {
                TextPaint textPaint = new TextPaint(this.a);
                textPaint.set(this.a);
                this.a = textPaint;
                this.x = false;
            }
        }

        public final int hashCode() {
            return ((((((((((((((((((((((((((((((((((((((((((((((((((this.a.getColor() + 31) * 31) + Float.floatToIntBits(this.a.getTextSize())) * 31) + (this.a.getTypeface() != null ? this.a.getTypeface().hashCode() : 0)) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + this.e) * 31) + this.a.linkColor) * 31) + Float.floatToIntBits(this.a.density)) * 31) + Arrays.hashCode(this.a.drawableState)) * 31) + this.f) * 31) + this.g) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + (this.m ? 1 : 0)) * 31) + (this.n != null ? this.n.hashCode() : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.p) * 31) + (this.q != null ? this.q.hashCode() : 0)) * 31) + (this.r != null ? this.r.hashCode() : 0)) * 31) + this.s) * 31) + this.t) * 31) + Arrays.hashCode(this.v)) * 31) + Arrays.hashCode(this.w)) * 31) + (this.h != null ? this.h.hashCode() : 0);
        }
    }

    public final TextLayoutBuilder a(Typeface typeface) {
        if (this.f.a.getTypeface() != typeface) {
            this.f.a();
            this.f.a.setTypeface(typeface);
            this.g = null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b A[EXC_TOP_SPLITTER, LOOP:0: B:84:0x014b->B:76:0x01ce, LOOP_START, PHI: r15 
      PHI: (r15v2 int) = (r15v1 int), (r15v3 int) binds: [B:55:0x0118, B:76:0x01ce] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout a() {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder.a():android.text.Layout");
    }
}
