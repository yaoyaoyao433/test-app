package com.meituan.crashreporter;

import android.content.Context;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.task.ThreadManager;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.crashreporter.crash.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.m;
import com.meituan.snare.n;
import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    public static boolean b;
    public static volatile boolean c;
    private static b d;
    private static c e;
    private static h f;
    private Context g;
    private d h;

    public final c a(Context context, d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38428d1c318d876a01c9d8c77f76be0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38428d1c318d876a01c9d8c77f76be0d");
        }
        if (this.g != null) {
            return this;
        }
        c = ProcessUtils.is64Bit();
        Internal.sCrashReporterConfig = dVar;
        ContextProvider.getInstance().updateContext(context);
        this.g = context.getApplicationContext();
        this.h = dVar;
        f = new h(this.g, this.h);
        com.meituan.crashreporter.crash.d a2 = com.meituan.crashreporter.crash.d.a();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.crashreporter.crash.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "bc60c4ffe9a981ac300c6ab1e7eb9f0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "bc60c4ffe9a981ac300c6ab1e7eb9f0c");
        } else {
            a2.b = true;
            a2.c = new com.meituan.crashreporter.crash.c(context);
            com.meituan.crashreporter.crash.c cVar = a2.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.crashreporter.crash.c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "ac6cd21a467ce864b833d99e50012750", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "ac6cd21a467ce864b833d99e50012750")).booleanValue();
            } else {
                n c2 = c().a().c();
                if (c2 == null) {
                    c2 = new n();
                }
                m.a().a(cVar.b, c2);
                m.a().a(cVar);
                m.a().a(new c.a());
                m.a().a(com.meituan.crashreporter.container.a.a());
                if (!c) {
                    m.a().a(com.meituan.crashreporter.container.e.a());
                }
            }
        }
        final e a3 = e.a();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = e.a;
        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "cc54b4eaddd2e23a0a37e9be457b2027", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "cc54b4eaddd2e23a0a37e9be457b2027");
        } else if (!a3.b) {
            a3.c = c().a().f();
            a3.b();
            Logger.getSnareLogger().d("开始定期60s上报");
            long j = b ? 5000 : 60000;
            ThreadManager.getInstance().scheduleAtFixedRate(new com.meituan.crashreporter.thread.a() { // from class: com.meituan.crashreporter.e.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.crashreporter.thread.a
                public final void a() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "618e13a9dd45841e93bc2ad1ed78d5ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "618e13a9dd45841e93bc2ad1ed78d5ba");
                        return;
                    }
                    e.b(e.this);
                    e.this.d();
                }
            }, j, j);
            a3.b = true;
        }
        return this;
    }

    public final d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38dab764860bd6c05d8cbe4fce6298c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38dab764860bd6c05d8cbe4fce6298c2");
        }
        if (this.h == null) {
            this.h = new d() { // from class: com.meituan.crashreporter.c.1
                @Override // com.meituan.crashreporter.d
                public final String a() {
                    return "";
                }

                @Override // com.meituan.crashreporter.d
                public final String b() {
                    return "";
                }
            };
        }
        return this.h;
    }

    public static h b() {
        return f;
    }

    public static c c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc1b91276f501a5a27b2d3dda3923e5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc1b91276f501a5a27b2d3dda3923e5f");
        }
        if (e == null) {
            synchronized (c.class) {
                if (e == null) {
                    e = new c();
                }
            }
        }
        return e;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99590a9f18d419183aad5500695768b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99590a9f18d419183aad5500695768b");
        } else {
            f.a(aVar);
        }
    }

    public static void a(Throwable th, int i, String str, boolean z) {
        Object[] objArr = {th, Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "989c38a7c00964cb79bbda96aa2fd14c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "989c38a7c00964cb79bbda96aa2fd14c");
        } else {
            com.meituan.crashreporter.crash.d.a().a(th, str, z);
        }
    }

    public static void a(Throwable th, String str, boolean z) {
        Object[] objArr = {th, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "381da5e9a4b9082e1841aba32f7ec586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "381da5e9a4b9082e1841aba32f7ec586");
        } else {
            com.meituan.crashreporter.crash.d.a().a(th, str, false);
        }
    }

    @Deprecated
    public static void a(String str, int i, String str2, boolean z, boolean z2) {
        Object[] objArr = {str, Integer.valueOf(i), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bd0989d0c36c43274bf819f75f12944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bd0989d0c36c43274bf819f75f12944");
            return;
        }
        com.meituan.crashreporter.crash.d a2 = com.meituan.crashreporter.crash.d.a();
        Object[] objArr2 = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.crashreporter.crash.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4e0c2bad65bc199cea6ce6196b384594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4e0c2bad65bc199cea6ce6196b384594");
        } else if (!a2.b || a2.c == null) {
        } else {
            a2.c.a(str, f, str2, z, z2);
        }
    }

    public static com.meituan.crashreporter.container.c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2a962f8475e5db45a9b719fd171b0f7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.crashreporter.container.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2a962f8475e5db45a9b719fd171b0f7") : com.meituan.crashreporter.container.d.b().a(str);
    }

    public static b d() {
        return d;
    }

    public static void a(b bVar) {
        d = bVar;
    }
}
