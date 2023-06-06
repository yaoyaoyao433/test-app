package com.meituan.android.mtplayer.video.proxy;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static volatile h b;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        private static final l a = new l();
    }

    public static synchronized l a() {
        synchronized (l.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ceda2d10258e95ecf42f46438067c04", RobustBitConfig.DEFAULT_VALUE)) {
                return (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ceda2d10258e95ecf42f46438067c04");
            }
            return a.a;
        }
    }

    private synchronized h d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0485bbb330b645725c7a38534c629af7", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0485bbb330b645725c7a38534c629af7");
        }
        if (b == null) {
            synchronized (l.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    public final synchronized k a(@NonNull String str, @NonNull d dVar, c cVar, @NonNull String str2, int i) {
        Object[] objArr = {str, dVar, cVar, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59561143cd839ecdbe32a299c3802774", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59561143cd839ecdbe32a299c3802774");
        }
        h d = d();
        if (d != null) {
            return d.a(str, dVar, cVar, str2, null, i);
        }
        return null;
    }

    public final synchronized k a(@NonNull String str, @NonNull r rVar) {
        Object[] objArr = {str, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa334fbe9db2ca39545e423f2b04e7c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa334fbe9db2ca39545e423f2b04e7c0");
        }
        h d = d();
        if (d != null) {
            return d.a(str, null, null, null, rVar, -1);
        }
        return null;
    }

    public final synchronized void a(@NonNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f3cbee917905355b4503e5e5d489188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f3cbee917905355b4503e5e5d489188");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            h d = d();
            Object[] objArr2 = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "53a358376e0f5c50e6788a6d55f92472", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "53a358376e0f5c50e6788a6d55f92472");
                return;
            }
            n.a(str);
            synchronized (d.b) {
                Set<Integer> set = d.e.get(str);
                if (set != null && set.contains(Integer.valueOf(i))) {
                    set.remove(Integer.valueOf(i));
                }
                if (set == null || set.isEmpty() || (set.size() == 1 && set.contains(-1))) {
                    k remove = d.d.remove(str);
                    d.e.remove(str);
                    if (remove != null) {
                        remove.a();
                        com.meituan.android.mtplayer.video.utils.c.a("Proxy", "shutdown client for url " + str + ", current clients count:" + d.a());
                    }
                }
            }
        }
    }

    public final synchronized void b(@NonNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d19c8ab19f35e09aa825817253ab1ce4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d19c8ab19f35e09aa825817253ab1ce4");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            d().a(str, i);
        }
    }

    public final synchronized h b() {
        return b;
    }

    @Deprecated
    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0745e5580b31ed98214706aba977b49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0745e5580b31ed98214706aba977b49");
            return;
        }
        if (b != null) {
            h hVar = b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "7fe2feb3a4d9d6e75df2d2c5bf3b878d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "7fe2feb3a4d9d6e75df2d2c5bf3b878d");
            } else {
                com.meituan.android.mtplayer.video.utils.c.a("Proxy", "HttpProxyCacheServer:Shutdown proxy server");
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "950830a318ac3f23d50977d11d531cb0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "950830a318ac3f23d50977d11d531cb0");
                } else {
                    synchronized (hVar.b) {
                        for (k kVar : hVar.d.values()) {
                            kVar.a();
                        }
                        hVar.d.clear();
                    }
                }
                try {
                    if (!hVar.f.isClosed()) {
                        hVar.f.close();
                    }
                } catch (IOException e) {
                    hVar.a(new p("Error shutting down proxy server", e));
                }
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mtplayer.video.proxy.sourcestorage.c.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "519eee02cced3d23650351e3d630637f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "519eee02cced3d23650351e3d630637f");
                } else {
                    com.meituan.android.mtplayer.video.proxy.sourcestorage.a.a();
                }
            }
            b = null;
        }
    }
}
