package com.meituan.mmp.main;

import android.os.SystemClock;
import android.os.Trace;
import android.support.annotation.NonNull;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.EmptyStackException;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ab {
    public static ChangeQuickRedirect a;
    private static final Map<String, Long> b = new ConcurrentHashMap();
    private static final ThreadLocal<Stack<String>> c = new ThreadLocal<Stack<String>>() { // from class: com.meituan.mmp.main.ab.1
        public static ChangeQuickRedirect a;

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Stack<String> initialValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5824dc26e886981405eccf8597140d7a", RobustBitConfig.DEFAULT_VALUE) ? (Stack) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5824dc26e886981405eccf8597140d7a") : new Stack<>();
        }
    };

    private static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fe0f115bac705989d1cb164ae3a0ad2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fe0f115bac705989d1cb164ae3a0ad2")).booleanValue() : DebugHelper.b();
    }

    public static void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2456908142ecf87744fb954dec3f3ab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2456908142ecf87744fb954dec3f3ab3");
        } else {
            a(str, true);
        }
    }

    public static void a(@NonNull String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6743aaa650f8852a80bc4ef8633b36f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6743aaa650f8852a80bc4ef8633b36f7");
            return;
        }
        String e = e(str);
        Trace.beginSection(e);
        if (z && c()) {
            c(e);
            c.get().push(e);
        }
    }

    public static void b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07b5f55b865f1bbcbcb32f3454cd5ce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07b5f55b865f1bbcbcb32f3454cd5ce8");
        } else {
            Trace.beginSection(e(str));
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc196bf2151ca19af9a6ac4a2cf8a036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc196bf2151ca19af9a6ac4a2cf8a036");
        } else {
            a(true);
        }
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8003bc1859a0c93cba40d4f29905cce7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8003bc1859a0c93cba40d4f29905cce7");
            return;
        }
        Trace.endSection();
        if (z && c()) {
            Stack<String> stack = c.get();
            if (!stack.empty()) {
                d(stack.pop());
            } else if (DebugHelper.b()) {
                com.meituan.mmp.lib.trace.b.a(new EmptyStackException());
            } else {
                com.meituan.mmp.lib.trace.b.d("MMPTrace", "empty stack when end section, begin and end is not matched");
            }
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b67cafadaeff4402655319a70f2f9c81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b67cafadaeff4402655319a70f2f9c81");
        } else {
            Trace.endSection();
        }
    }

    public static void c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3331a51f5e978c8424d9baa81f3d2237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3331a51f5e978c8424d9baa81f3d2237");
        } else if (c()) {
            String e = e(str);
            b.put(e, Long.valueOf(SystemClock.elapsedRealtime()));
            com.meituan.mmp.lib.trace.b.a("MMPTrace", e + " ->");
        }
    }

    public static void d(@NonNull String str) {
        String e;
        Long remove;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea888d7aef6dbe23dfc051442dd8b9a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea888d7aef6dbe23dfc051442dd8b9a1");
        } else if (c() && (remove = b.remove((e = e(str)))) != null) {
            com.meituan.mmp.lib.trace.b.a("MMPTrace", e + " <- " + (SystemClock.elapsedRealtime() - remove.longValue()) + "ms");
        }
    }

    public static String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "188bb2ff38b56f1a713ff74b16b1d8d2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "188bb2ff38b56f1a713ff74b16b1d8d2") : str.length() > 120 ? str.substring(0, 120) : str;
    }
}
