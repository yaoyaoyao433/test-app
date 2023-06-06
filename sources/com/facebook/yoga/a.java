package com.facebook.yoga;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static int a = 1;
    public static boolean b = false;
    long c = YogaNative.jni_YGConfigNew();

    public a() {
        if (this.c == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    protected final void finalize() throws Throwable {
        try {
            YogaNative.jni_YGConfigFree(this.c);
        } finally {
            super.finalize();
        }
    }

    public final void a(boolean z) {
        YogaNative.jni_YGConfigSetUseWebDefaults(this.c, false);
    }

    public final void a(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactor(this.c, 0.0f);
    }

    public final void b(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviour(this.c, true);
    }
}
