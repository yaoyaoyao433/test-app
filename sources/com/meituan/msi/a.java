package com.meituan.msi;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.msi.location.c;
import com.meituan.msi.provider.d;
import com.meituan.msi.util.p;
import com.meituan.msi.util.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static q b = null;
    private static Context c = null;
    private static volatile boolean d = false;
    private static int e = -1;
    private static d f = null;
    private static com.meituan.msi.interceptor.b g = null;
    private static c h = null;
    private static com.meituan.msi.api.setting.a i = null;
    private static boolean j = true;
    private static boolean k = false;

    @NonNull
    public static d a() {
        return f;
    }

    public static void a(d dVar) {
        f = dVar;
    }

    @NonNull
    public static synchronized boolean b() {
        boolean z;
        synchronized (a.class) {
            z = d;
        }
        return z;
    }

    public static synchronized void a(@NonNull Context context, @NonNull d dVar) {
        synchronized (a.class) {
            Object[] objArr = {context, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74119f806a7044a488dfab237bde1815", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74119f806a7044a488dfab237bde1815");
            } else if (d) {
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                c = applicationContext;
                d = true;
                f = dVar;
                q a2 = q.a(context, "msi_runtime_config", 2);
                b = a2;
                if (a2 != null) {
                    k = b.b("msi_debug", false);
                }
                r.b();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = p.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "077bd5a866e4b327ca026fceecaca5c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "077bd5a866e4b327ca026fceecaca5c0");
                } else {
                    Horn.register("msi_migrate_config_android", new HornCallback() { // from class: com.meituan.msi.util.p.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.common.horn.HornCallback
                        public final void onChanged(boolean z, String str) {
                            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d249f42518edb17e004ab33bdaf97ebc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d249f42518edb17e004ab33bdaf97ebc");
                                return;
                            }
                            new StringBuilder("horn onChanged result=").append(str);
                            if (z) {
                                try {
                                    Map<String, Object> map = (Map) w.a(str, new TypeToken<Map<String, Object>>() { // from class: com.meituan.msi.util.p.1.1
                                        {
                                            AnonymousClass1.this = this;
                                        }
                                    }.getType());
                                    if (map != null) {
                                        p.b = map;
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public static synchronized com.meituan.msi.interceptor.b c() {
        com.meituan.msi.interceptor.b bVar;
        synchronized (a.class) {
            bVar = g;
        }
        return bVar;
    }

    public static c d() {
        return h;
    }

    public static void a(c cVar) {
        h = cVar;
    }

    public static void a(int i2) {
        e = 11;
    }

    public static int e() {
        return e;
    }

    @NonNull
    public static synchronized Context f() {
        Context context;
        synchronized (a.class) {
            context = c;
        }
        return context;
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            if (context == null) {
                return;
            }
            c = context;
        }
    }

    public static synchronized void a(com.meituan.msi.api.setting.a aVar) {
        synchronized (a.class) {
            i = aVar;
        }
    }

    public static synchronized com.meituan.msi.api.setting.a g() {
        com.meituan.msi.api.setting.a aVar;
        synchronized (a.class) {
            aVar = i;
        }
        return aVar;
    }

    public static boolean h() {
        return j;
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "570008b58675cdbf449e341fa8af8c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "570008b58675cdbf449e341fa8af8c6c");
            return;
        }
        k = z;
        if (b != null) {
            b.a("msi_debug", k);
        }
    }

    public static boolean i() {
        return k;
    }
}
