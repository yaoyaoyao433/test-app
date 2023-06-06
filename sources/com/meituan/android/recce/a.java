package com.meituan.android.recce;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.meituan.android.recce.views.RecceBaseViewPackage;
import com.meituan.android.recce.views.RecceViewManagerProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ boolean b = !a.class.desiredAssertionStatus();
    private static WeakReference<Context> c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static String i;
    private static com.meituan.android.recce.reporter.b j;

    public static String e() {
        return "1.1.0";
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc80647bd8b89b226dc87433495e734a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc80647bd8b89b226dc87433495e734a");
            return;
        }
        c = new WeakReference<>(context);
        j();
    }

    public static com.meituan.android.recce.reporter.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8718f1e53058651c152b5c8bba74fdd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.recce.reporter.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8718f1e53058651c152b5c8bba74fdd9");
        }
        if (b || j != null) {
            return j;
        }
        throw new AssertionError("recceReporter must set before call getRecceReporter()");
    }

    public static void a(com.meituan.android.recce.reporter.b bVar) {
        j = bVar;
    }

    public static Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46763537ed6dbeef6c39dcd1cee6336b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46763537ed6dbeef6c39dcd1cee6336b");
        }
        if (c == null || c.get() == null) {
            return null;
        }
        return c.get();
    }

    public static String c() {
        return d;
    }

    public static void a(String str) {
        d = str;
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21c785eb055959b601661a9fd2f1bec0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21c785eb055959b601661a9fd2f1bec0");
        }
        Context context = c.get();
        if (TextUtils.isEmpty(e) && context != null) {
            try {
                e = WebSettings.getDefaultUserAgent(context) + "  Recce/1.1.0";
            } catch (Throwable unused) {
                e = "Recce/1.1.0";
            }
        }
        return e;
    }

    public static String f() {
        return f;
    }

    public static String g() {
        return g;
    }

    public static String h() {
        return h;
    }

    public static String i() {
        return i;
    }

    public static void a(com.meituan.android.recce.bridge.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8030cc3c74ce4df79fb6d63041dc0ffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8030cc3c74ce4df79fb6d63041dc0ffc");
        } else {
            com.meituan.android.recce.bridge.a.a(bVar);
        }
    }

    public static void a(RecceViewManagerProvider recceViewManagerProvider) {
        Object[] objArr = {recceViewManagerProvider};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8230b71513752fdb848c7c1d0d3d5c47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8230b71513752fdb848c7c1d0d3d5c47");
        } else {
            RecceBaseViewPackage.registerViewManagers(recceViewManagerProvider);
        }
    }

    private static void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cb83efeb85ef6978375bae389372e2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cb83efeb85ef6978375bae389372e2c");
            return;
        }
        Iterator it = com.sankuai.meituan.serviceloader.b.a(com.meituan.android.recce.dev.b.class, (String) null).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
