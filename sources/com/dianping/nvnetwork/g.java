package com.dianping.nvnetwork;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.dianping.nvnetwork.tunnel.tool.Log;
import com.dianping.nvnetwork.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import dianping.com.nvlinker.NVLinker;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    private static List<r> A = null;
    public static ChangeQuickRedirect a = null;
    public static String b = "4.0.0";
    public static String c = "unknown";
    public static String d = "unknown";
    public static String e = "unknown";
    public static String f = "unknown";
    public static boolean g = false;
    public static boolean h = false;
    private static int i = 0;
    private static volatile com.dianping.monitor.e j = null;
    private static com.dianping.nvnetwork.util.j k = null;
    private static SharedPreferences l = null;
    private static Context m = null;
    private static volatile boolean n = false;
    private static volatile boolean o = false;
    private static boolean p = false;
    private static int q = 0;
    private static int r = 0;
    private static int s = 0;
    private static int t = -1;
    private static String u = null;
    private static int v = -1;
    private static b w = null;
    private static a x = null;
    private static volatile ExecutorService y = null;
    private static volatile int z = 10000;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        String a();
    }

    public static void a(Context context, int i2, int i3, String str, b bVar) {
        Object[] objArr = {context, Integer.valueOf(i2), 0, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e85f08d659b3128a122805e361b123d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e85f08d659b3128a122805e361b123d");
            return;
        }
        Object[] objArr2 = {context, Integer.valueOf(i2), 0, str, (byte) 1, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "25d6f3a47f8ffb32aaefba2d10dd94ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "25d6f3a47f8ffb32aaefba2d10dd94ef");
        } else {
            a(context, i2, 0, str, true, null, bVar);
        }
    }

    public static void a(Context context, int i2, String str, b bVar) {
        Object[] objArr = {context, Integer.valueOf(i2), str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f832aa0f6174eab8e5d850a7641b4a84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f832aa0f6174eab8e5d850a7641b4a84");
        } else {
            a(context, i2, 0, "unknown", true, str, bVar);
        }
    }

    private static void a(Context context, int i2, int i3, String str, boolean z2, String str2, b bVar) {
        String str3;
        Object[] objArr = {context, Integer.valueOf(i2), 0, str, (byte) 1, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e07039e1eea5de2c16eb66ee61eddcba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e07039e1eea5de2c16eb66ee61eddcba");
        } else if (n) {
        } else {
            synchronized (g.class) {
                if (!(context instanceof Application)) {
                    throw new RuntimeException("context must be Application.");
                }
                m = context;
                com.dianping.nvnetwork.util.d.a();
                l = context.getSharedPreferences(context.getPackageName() + ".networkconfig", 0);
                i = i2;
                w = bVar;
                k = new com.dianping.nvnetwork.util.j(context);
                if (str2 == null) {
                    try {
                        str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        str3 = "1.0";
                    }
                } else {
                    str3 = str2;
                }
                com.dianping.monitor.impl.a.setSharkSdkVersion("5.4.1");
                String str4 = TextUtils.isEmpty(str) ? "unknown" : str;
                c = str3;
                f = str4;
                d = Build.MODEL;
                e = Build.VERSION.RELEASE;
                n = true;
                if (!NVLinker.isLinkerInit()) {
                    NVLinker.init(context, i2, str4, str3, new NVLinker.ILikner() { // from class: com.dianping.nvnetwork.g.1
                        public static ChangeQuickRedirect a;

                        @Override // dianping.com.nvlinker.NVLinker.ILikner
                        public final String getCityID() {
                            return "1";
                        }

                        @Override // dianping.com.nvlinker.NVLinker.ILikner
                        public final String getUnionID() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "949d568aae9f2c1e99a4c4a5e0912b94", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "949d568aae9f2c1e99a4c4a5e0912b94") : g.j();
                        }
                    });
                }
                com.dianping.nvnetwork.util.m.a().b = i2;
                com.dianping.nvnetwork.util.m.c = new m.a() { // from class: com.dianping.nvnetwork.g.2
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.nvnetwork.util.m.a
                    public final String a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ad7de26301457bd3c426a21befb2a87", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ad7de26301457bd3c426a21befb2a87") : g.j();
                    }
                };
                new Handler(com.dianping.nvnetwork.util.d.b()).post(new Runnable() { // from class: com.dianping.nvnetwork.g.3
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 411
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.g.AnonymousClass3.run():void");
                    }
                });
            }
        }
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b76f79ff82cdd2792cf2bc37b8c39e4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b76f79ff82cdd2792cf2bc37b8c39e4")).intValue();
        }
        z();
        return i;
    }

    public static Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bf09e53353807860231e9496d1904db", 6917529027641081856L)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bf09e53353807860231e9496d1904db");
        }
        z();
        return m;
    }

    public static SharedPreferences c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86c14fa7f0a999e41dfaf3d81fceeabc", 6917529027641081856L)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86c14fa7f0a999e41dfaf3d81fceeabc");
        }
        z();
        return l;
    }

    public static com.dianping.monitor.e d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ed39903a52dfe7a00eb6c2ae352c076", 6917529027641081856L)) {
            return (com.dianping.monitor.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ed39903a52dfe7a00eb6c2ae352c076");
        }
        if (!n) {
            return new com.dianping.nvnetwork.a();
        }
        if (j == null) {
            synchronized (g.class) {
                if (j == null) {
                    j = new com.dianping.monitor.impl.a(m, i, c) { // from class: com.dianping.nvnetwork.g.4
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.monitor.impl.a
                        public final String getUnionid() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5c1f722802a3b898e2e9bcaced29e67", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5c1f722802a3b898e2e9bcaced29e67") : g.j();
                        }

                        @Override // com.dianping.monitor.impl.a, com.dianping.monitor.e
                        public final String getCommand(String str) {
                            Object[] objArr2 = {str};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a031c3e8357716d702416326edb78985", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a031c3e8357716d702416326edb78985") : g.b(str);
                        }
                    };
                    if (x == a.MRN) {
                        j = new com.dianping.monitor.mrn.a(m, i, c) { // from class: com.dianping.nvnetwork.g.5
                            public static ChangeQuickRedirect b;

                            @Override // com.dianping.monitor.impl.a
                            public final String getUnionid() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = b;
                                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb48505e070365149b9616d11ccaa6e0", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb48505e070365149b9616d11ccaa6e0") : g.j();
                            }

                            @Override // com.dianping.monitor.impl.a, com.dianping.monitor.e
                            public final String getCommand(String str) {
                                Object[] objArr2 = {str};
                                ChangeQuickRedirect changeQuickRedirect2 = b;
                                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e43adfd43eb479f22c59057a4b5f57e", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e43adfd43eb479f22c59057a4b5f57e") : g.b(str);
                            }
                        };
                    }
                }
            }
        }
        return j;
    }

    public static com.dianping.monitor.impl.m e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eedcc59ca11a8d6f9863630786d2f11c", 6917529027641081856L)) {
            return (com.dianping.monitor.impl.m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eedcc59ca11a8d6f9863630786d2f11c");
        }
        if (n) {
            com.dianping.monitor.impl.m mVar = new com.dianping.monitor.impl.m(287, m);
            mVar.a("shark_appId", String.valueOf(i));
            return mVar;
        }
        return null;
    }

    public static com.dianping.nvnetwork.util.j f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32be21a3a6e5a65989e064c2063ce887", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.util.j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32be21a3a6e5a65989e064c2063ce887");
        }
        z();
        return k;
    }

    public static int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5c92eff97eb62a82696620416319dd1", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5c92eff97eb62a82696620416319dd1")).intValue();
        }
        z();
        com.dianping.nvnetwork.fork.b a2 = com.dianping.nvnetwork.fork.b.a(m);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvnetwork.fork.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a5e648b608061b9d267b47c3b50bf469", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a5e648b608061b9d267b47c3b50bf469")).intValue();
        }
        if (com.dianping.nvnetwork.fork.b.b != null) {
            com.dianping.nvnetwork.tunnel2.g gVar = com.dianping.nvnetwork.fork.b.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvnetwork.tunnel2.g.a;
            if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "016d95fa2b0afc9e3fb262bd72672f58", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "016d95fa2b0afc9e3fb262bd72672f58")).intValue();
            }
            if (!h.h().ae) {
                return gVar.b != null ? gVar.b.f() : XPlayerConstants.MEDIA_ERROR_IJK_PLAYER;
            } else if (gVar.c != null) {
                com.dianping.nvnetwork.shark.f fVar = gVar.c;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.dianping.nvnetwork.shark.f.a;
                if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "22a8b7979c63ec87843373c3d7c488b2", 6917529027641081856L)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "22a8b7979c63ec87843373c3d7c488b2")).intValue();
                }
                com.dianping.nvnetwork.shark.e a3 = fVar.a(null);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.dianping.nvnetwork.shark.e.a;
                if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "0df003c26a442c73ea4bf88088937aee", 6917529027641081856L)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "0df003c26a442c73ea4bf88088937aee")).intValue();
                }
                if (a3.c.i()) {
                    return 10000;
                }
                return XPlayerConstants.MEDIA_ERROR_IJK_PLAYER;
            } else {
                return XPlayerConstants.MEDIA_ERROR_IJK_PLAYER;
            }
        }
        return XPlayerConstants.MEDIA_ERROR_IJK_PLAYER;
    }

    public static int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff968d4d51d09c539f81b9b567c1c7f0", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff968d4d51d09c539f81b9b567c1c7f0")).intValue();
        }
        z();
        com.dianping.nvnetwork.fork.b a2 = com.dianping.nvnetwork.fork.b.a(b());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvnetwork.fork.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "579f9817c9951931a924b27b9f780925", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "579f9817c9951931a924b27b9f780925")).intValue();
        }
        if (!h.h().G || com.dianping.nvnetwork.fork.b.b == null) {
            return Integer.MAX_VALUE;
        }
        com.dianping.nvnetwork.tunnel2.g gVar = com.dianping.nvnetwork.fork.b.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvnetwork.tunnel2.g.a;
        if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "2d7e36b3346f93017fe81c1c17c67315", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "2d7e36b3346f93017fe81c1c17c67315")).intValue();
        }
        if (gVar.c == null) {
            return Integer.MAX_VALUE;
        }
        return gVar.c.a();
    }

    public static String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00939663d595c0b80aac5b05db2007ad", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00939663d595c0b80aac5b05db2007ad");
        }
        z();
        return c;
    }

    public static String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "feb0ae78e110436a3ef080a37940599e", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "feb0ae78e110436a3ef080a37940599e") : w != null ? w.a() : "";
    }

    public static void a(boolean z2) {
        Object[] objArr = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ca174d6a2e1ae8eb3c0af64ba4f0b6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ca174d6a2e1ae8eb3c0af64ba4f0b6d");
            return;
        }
        Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d7d87ba67007d526c0d6493325173bc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d7d87ba67007d526c0d6493325173bc3");
            return;
        }
        StringBuilder sb = new StringBuilder("set debug :: ");
        sb.append(z2);
        sb.append(", switch Address true");
        com.dianping.networklog.c.a("set debug :: " + z2 + ", switch Address true", 4);
        Log.DEBUG = z2;
        if (z2) {
            o = z2;
            a(h.h().aM, 8000);
            com.dianping.nvnetwork.util.g.b = 3;
        } else if (o) {
            a(null, 0);
            o = z2;
        }
    }

    @Deprecated
    public static boolean k() {
        return p;
    }

    public static void a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d1c686b71edbacabee8eb3c03dd9bc2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d1c686b71edbacabee8eb3c03dd9bc2");
            return;
        }
        t = i2;
        com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_FORCE_SELECT_TUNNEL);
    }

    public static int l() {
        return t;
    }

    public static String m() {
        return u;
    }

    public static int n() {
        return v;
    }

    public static int o() {
        return z;
    }

    public static void b(final boolean z2) {
        Object[] objArr = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "745df8808cbd33b368ec4faecddc8eca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "745df8808cbd33b368ec4faecddc8eca");
            return;
        }
        if (h.h().aC) {
            if (y == null) {
                y = com.sankuai.android.jarvis.c.a("nv_global_set_background_mode_jarvis", "shark_nv_global", 60L);
            }
            y.execute(new Runnable() { // from class: com.dianping.nvnetwork.g.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b709bdf9feeb43bf110b1099b27c81e7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b709bdf9feeb43bf110b1099b27c81e7");
                    } else {
                        NVLinker.setBackgroundMode(z2);
                    }
                }
            });
        } else {
            NVLinker.setBackgroundMode(z2);
        }
        Message message = new Message();
        message.arg1 = 13579;
        if (z2) {
            message.what = 10002;
            z = 10002;
            d().flush();
            if (h.h().B) {
                h.h().b(true);
            }
            if (h.h().C) {
                h.h().c(true);
            }
            if (h.h().aB) {
                com.dianping.nvnetwork.monitor.a.a(SystemClock.elapsedRealtime());
            }
            com.dianping.nvnetwork.util.i.a("app run in background.");
            com.dianping.networklog.c.b();
        } else {
            message.what = 10001;
            z = 10001;
            h.h().a(false);
            d().flush();
            h.h().b(false);
            h.h().c(false);
            com.dianping.nvnetwork.util.i.a("app run in foreground.");
            if (n) {
                com.dianping.nvnetwork.tunnel.a.a(m).a(0);
            }
            if (h.h().aB) {
                com.dianping.nvnetwork.monitor.a.a(-1L);
            }
        }
        com.dianping.nvnetwork.util.l.a().a(message);
    }

    public static boolean p() {
        return o;
    }

    public static void b(int i2) {
        q = i2;
    }

    public static void c(int i2) {
        r = i2;
    }

    public static void d(int i2) {
        s = i2;
    }

    public static int q() {
        return q;
    }

    public static int r() {
        return r;
    }

    public static int s() {
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c18f85f3a56ddc096b1790c5aa0f4731", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c18f85f3a56ddc096b1790c5aa0f4731");
        }
        try {
            URL url = new URL(str);
            return url.getHost() + url.getPath();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public static String t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8afbcd248db26c7a7d6b464658cf75d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8afbcd248db26c7a7d6b464658cf75d") : m.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        NATIVE,
        MRN;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6623f19b2b8b4c15f1297ece27e4f741", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6623f19b2b8b4c15f1297ece27e4f741");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad673541d371a1284f8a865391f0144a", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad673541d371a1284f8a865391f0144a") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80f98acf454c7814131646ba4d4acc44", 6917529027641081856L) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80f98acf454c7814131646ba4d4acc44") : (a[]) values().clone();
        }
    }

    public static void a(String str, int i2) {
        Object[] objArr = {str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62356e74b60414ee8a805e8676fd51fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62356e74b60414ee8a805e8676fd51fc");
            return;
        }
        u = str;
        v = i2;
        if (o) {
            com.dianping.nvlbservice.i.b = true;
            com.dianping.nvtunnelkit.debug.a.a().a(true);
            com.dianping.nvtunnelkit.debug.a.a().b = true;
            Message message = new Message();
            message.what = 30000;
            com.dianping.nvnetwork.util.l.a().a(message);
        }
    }

    public static boolean u() {
        return n;
    }

    public static String v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "845db28e641d753526ac90050299f57c", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "845db28e641d753526ac90050299f57c") : com.dianping.nvtunnelkit.utils.c.d();
    }

    public static List<r> w() {
        return A;
    }

    private static void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a90cc4976250e4ec38ca3c8a07097993", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a90cc4976250e4ec38ca3c8a07097993");
        } else if (n) {
        } else {
            com.dianping.networklog.c.a("you must call NVGlobal.init() first.", 4);
        }
    }
}
