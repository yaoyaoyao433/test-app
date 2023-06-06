package com.meituan.mtwebkit.internal;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.meituan.mtwebkit.MTWebViewFactoryProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.security.SignatureException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class m {
    public static ChangeQuickRedirect a;
    protected static MTWebViewFactoryProvider b;
    protected static final Object c = new Object();
    protected PackageInfo d;
    protected Context e;
    protected volatile boolean f;

    public abstract void d();

    public abstract void f();

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77de6299c729d08ee904edbf65109cf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77de6299c729d08ee904edbf65109cf3");
        } else {
            this.f = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        @SuppressLint({"StaticFieldLeak"})
        public static final m a;

        static {
            int v = h.v();
            e.c("MTWebViewModeBase", "初始化ModeHolder.INSTANCE, currentMode: " + v);
            if (v != 4) {
                switch (v) {
                    case 0:
                        a = new com.meituan.mtwebkit.internal.mode.b();
                        return;
                    case 1:
                        throw new IllegalArgumentException("not support");
                    case 2:
                        try {
                            if (h.a() == null) {
                                Application a2 = com.meituan.mtwebkit.internal.a.a();
                                File file = new File(a2.getCacheDir(), "mt_webview_cache.zip");
                                c.a(a2.getAssets().open("MeituanWebView.apk"), file);
                                j.a(l.a(file));
                                file.delete();
                            }
                            a = new com.meituan.mtwebkit.internal.mode.c();
                            return;
                        } catch (IOException | SignatureException e) {
                            throw new IllegalArgumentException("MeituanWebView.apk extract failed", e);
                        }
                    default:
                        a = new com.meituan.mtwebkit.internal.mode.d();
                        return;
                }
            }
            a = new com.meituan.mtwebkit.internal.mode.a();
        }
    }

    public static m a() {
        return a.a;
    }

    public final PackageInfo b() {
        PackageInfo packageInfo;
        synchronized (c) {
            packageInfo = this.d;
        }
        return packageInfo;
    }

    public final Context c() {
        Context context;
        synchronized (c) {
            context = this.e;
        }
        return context;
    }

    public final MTWebViewFactoryProvider e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "851d16136a32fd660b6932306df2a860", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebViewFactoryProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "851d16136a32fd660b6932306df2a860");
        }
        synchronized (c) {
            if (b != null) {
                return b;
            }
            d();
            return b;
        }
    }

    public final boolean g() {
        return this.f;
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c762db86b9238ced5bf3b93c2057ed3a", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("not support reloadMode");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c762db86b9238ced5bf3b93c2057ed3a");
    }
}
