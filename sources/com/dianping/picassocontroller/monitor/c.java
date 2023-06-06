package com.dianping.picassocontroller.monitor;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final e c = e.a(20);
    private static final e d = e.a(20);
    private static final e e = e.a(20);
    private static final e f = e.a(20);
    private static volatile boolean g = true;
    public static WeakReference<Activity> b = null;

    public static synchronized void a() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de7ee3e0b243ae1157e435e4e992644f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de7ee3e0b243ae1157e435e4e992644f");
                return;
            }
            if (b != null && b.get() != null) {
                c.a(System.nanoTime());
            }
        }
    }

    public static synchronized void b() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "417b5a25313f555bcf7ea52d70b30d04", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "417b5a25313f555bcf7ea52d70b30d04");
                return;
            }
            if (b != null && b.get() != null) {
                d.a(System.nanoTime());
            }
        }
    }

    public static synchronized void c() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a406390c0cecd32f83a9800aca53b933", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a406390c0cecd32f83a9800aca53b933");
                return;
            }
            if (b != null && b.get() != null) {
                e.a(System.nanoTime());
            }
        }
    }

    public static synchronized void d() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23aa9aa0db3658945a07c37be6300fc2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23aa9aa0db3658945a07c37be6300fc2");
                return;
            }
            if (b != null && b.get() != null) {
                f.a(System.nanoTime());
            }
        }
    }
}
