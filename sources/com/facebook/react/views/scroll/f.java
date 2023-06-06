package com.facebook.react.views.scroll;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.w;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a<T> {
        void flashScrollIndicators(T t);

        void scrollTo(T t, b bVar);

        void scrollToEnd(T t, c cVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final int b;
        public final boolean c;

        b(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c {
        public final boolean a;

        c(boolean z) {
            this.a = z;
        }
    }

    public static Map<String, Integer> a() {
        return com.facebook.react.common.c.a("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static <T> void a(a<T> aVar, T t, int i, @Nullable ReadableArray readableArray) {
        com.facebook.infer.annotation.a.a(aVar);
        com.facebook.infer.annotation.a.a(t);
        com.facebook.infer.annotation.a.a(readableArray);
        switch (i) {
            case 1:
                a(aVar, t, readableArray);
                return;
            case 2:
                b(aVar, t, readableArray);
                return;
            case 3:
                aVar.flashScrollIndicators(t);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), aVar.getClass().getSimpleName()));
        }
    }

    public static <T> void a(a<T> aVar, T t, String str, @Nullable ReadableArray readableArray) {
        char c2;
        com.facebook.infer.annotation.a.a(aVar);
        com.facebook.infer.annotation.a.a(t);
        com.facebook.infer.annotation.a.a(readableArray);
        int hashCode = str.hashCode();
        if (hashCode == -402165208) {
            if (str.equals("scrollTo")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 28425985) {
            if (hashCode == 2055114131 && str.equals("scrollToEnd")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("flashScrollIndicators")) {
                c2 = 2;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                a(aVar, t, readableArray);
                return;
            case 1:
                b(aVar, t, readableArray);
                return;
            case 2:
                aVar.flashScrollIndicators(t);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, aVar.getClass().getSimpleName()));
        }
    }

    private static <T> void a(a<T> aVar, T t, @Nullable ReadableArray readableArray) {
        aVar.scrollTo(t, new b(Math.round(w.a((float) readableArray.getDouble(0))), Math.round(w.a((float) readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    private static <T> void b(a<T> aVar, T t, @Nullable ReadableArray readableArray) {
        aVar.scrollToEnd(t, new c(readableArray.getBoolean(0)));
    }
}
