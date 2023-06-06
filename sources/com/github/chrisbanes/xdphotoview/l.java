package com.github.chrisbanes.xdphotoview;

import android.widget.ImageView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.github.chrisbanes.xdphotoview.l$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }
}
