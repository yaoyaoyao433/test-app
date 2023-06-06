package com.meituan.msc.views.scroll;

import android.support.annotation.Nullable;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<T> {
        void a(T t);

        void a(T t, b bVar);

        void a(T t, c cVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public final int a;
        public final int b;
        public final boolean c;

        public b(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }
    }

    public static <T> void a(a<T> aVar, T t, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, t, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62b1ed146b85625718ebc875032d353e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62b1ed146b85625718ebc875032d353e");
            return;
        }
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
                aVar.a(t);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), aVar.getClass().getSimpleName()));
        }
    }

    public static <T> void a(a<T> aVar, T t, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, t, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f3f8db93a9baf3817c5ab09e6b7f619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f3f8db93a9baf3817c5ab09e6b7f619");
            return;
        }
        com.facebook.infer.annotation.a.a(aVar);
        com.facebook.infer.annotation.a.a(t);
        com.facebook.infer.annotation.a.a(readableArray);
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -402165208) {
            if (hashCode != 28425985) {
                if (hashCode == 2055114131 && str.equals("scrollToEnd")) {
                    c2 = 1;
                }
            } else if (str.equals("flashScrollIndicators")) {
                c2 = 2;
            }
        } else if (str.equals("scrollTo")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
                a(aVar, t, readableArray);
                return;
            case 1:
                b(aVar, t, readableArray);
                return;
            case 2:
                aVar.a(t);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, aVar.getClass().getSimpleName()));
        }
    }

    private static <T> void a(a<T> aVar, T t, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10eb1211db5bd6dbf65a13c9a8f60105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10eb1211db5bd6dbf65a13c9a8f60105");
        } else {
            aVar.a((a<T>) t, new b(Math.round(s.a(readableArray.getDouble(0))), Math.round(s.a(readableArray.getDouble(1))), readableArray.getBoolean(2)));
        }
    }

    private static <T> void b(a<T> aVar, T t, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb1a6bfb365a8fa08b04719aaf6d2f6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb1a6bfb365a8fa08b04719aaf6d2f6a");
        } else {
            aVar.a((a<T>) t, new c(readableArray.getBoolean(0)));
        }
    }
}
