package com.sankuai.xm.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends b {
    public static ChangeQuickRedirect d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public String k;
    public boolean l;
    public short m;
    public int n;
    public String o;
    public int p;
    public int q;
    public int r;
    public Set<com.sankuai.xm.login.manager.lvs.a> s;

    private static int a(int i) {
        if (i == 0) {
            return 0;
        }
        return i + 600;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef8520d2238c3c26e8b54ff0576cf36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef8520d2238c3c26e8b54ff0576cf36");
            return;
        }
        this.l = false;
        this.p = 0;
        this.q = 0;
        this.s = new HashSet();
    }

    public final void a(int i, String str) {
        Object[] objArr = {1, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee3c2d2dd621e97567babae2401a78f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee3c2d2dd621e97567babae2401a78f");
            return;
        }
        a(30, b(1, str), f.m().i());
        a();
    }

    private HashMap<String, Object> b(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa7ad96e8a4e79232823f6ce0104298", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa7ad96e8a4e79232823f6ce0104298");
        }
        this.f = System.currentTimeMillis();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("msg", str);
        hashMap.put("socket_result", Integer.valueOf(i));
        hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.k);
        hashMap.put("ids", b());
        hashMap.put("status", Integer.valueOf(this.l ? 1 : 0));
        hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Short.valueOf(this.m));
        hashMap.put("time", Long.valueOf(this.f - this.e));
        hashMap.put("socket_time", Long.valueOf(this.f - this.e));
        hashMap.put("net", Integer.valueOf(this.n));
        hashMap.put("detect", "");
        hashMap.put("count", Integer.valueOf(this.p));
        hashMap.put("appstate", Integer.valueOf(this.b));
        if (this.c != 0) {
            hashMap.put("backtime", Long.valueOf(System.currentTimeMillis() - this.c));
        }
        hashMap.put("type", Integer.valueOf(m.a().m() ? 1 : 0));
        return hashMap;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff1222283583f1023a0324c2e8b77c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff1222283583f1023a0324c2e8b77c8");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        HashMap<String, Object> b = b(1, sb.toString());
        if (!com.sankuai.xm.network.analyse.d.c().b()) {
            i = 2;
        }
        com.sankuai.xm.login.d.a("ConnectStatisticsContext::logSocketErrorAfterCheck:: socket result:" + i);
        if (i == 2) {
            b.put("result", 10);
            b.put("socket_result", 10);
        } else if (i == 1) {
            b.put("result", 2);
            b.put("socket_result", 2);
        } else {
            b.put("result", 1);
            b.put("socket_result", 1);
        }
        if (i2 == 10 || i2 == 7 || i2 == 112 || i2 == 8 || i2 == 16 || i2 == 15) {
            com.sankuai.xm.login.d.a("ConnectStatisticsContext::logSocketErrorAfterCheck:: socket filter error:" + i2);
        } else {
            a(30, b, f.m().i());
        }
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r12 != 40) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r12, java.util.HashMap<java.lang.String, java.lang.Object> r13, boolean r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            r1 = 1
            r0[r1] = r13
            java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.base.c.d
            java.lang.String r10 = "0a9fa9f555958aee4a0d0a495d0d958a"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L29:
            if (r13 != 0) goto L2d
            r0 = 0
            goto L33
        L2d:
            java.lang.String r0 = "result"
            java.lang.Object r0 = r13.get(r0)
        L33:
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L43
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L43
            r0 = 4
            com.sankuai.xm.base.init.b.a(r0)
        L43:
            com.sankuai.xm.base.init.b.d()
            long r0 = r11.e
            long r2 = r11.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L62
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "ConnectStatisticsContext::reportEvent params error, may clear. "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.Object[] r13 = new java.lang.Object[r8]
            com.sankuai.xm.login.d.c(r12, r13)
            return
        L62:
            com.sankuai.xm.base.service.e r0 = com.sankuai.xm.base.service.m.d()
            java.lang.String r1 = "connect_ip"
            r0.a(r1, r13)
            if (r14 == 0) goto L8d
            r14 = 30
            r0 = 10
            if (r12 == r0) goto L81
            r1 = 20
            if (r12 == r1) goto L7e
            if (r12 == r14) goto L84
            r2 = 40
            if (r12 == r2) goto L7e
            goto L8a
        L7e:
            r11.a(r1, r13, r12)
        L81:
            r11.a(r0, r13, r12)
        L84:
            r11.a(r14, r13, r12)
            r11.a(r8, r13, r12)
        L8a:
            r11.c()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.c.a(int, java.util.HashMap, boolean):void");
    }

    public final void a(int i, String str, int i2) {
        HashMap<String, Object> hashMap;
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df6e8454c093f7f942da826fade7ffcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df6e8454c093f7f942da826fade7ffcf");
            return;
        }
        this.h = System.currentTimeMillis();
        if (this.g != 0) {
            Object[] objArr2 = {Integer.valueOf(i), str, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "697150b9c22bd503ac0adb9211c1ffc3", 6917529027641081856L)) {
                hashMap = (HashMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "697150b9c22bd503ac0adb9211c1ffc3");
            } else {
                hashMap = new HashMap<>();
                hashMap.put("result", Integer.valueOf(i));
                hashMap.put("msg", str);
                hashMap.put("socket_result", 0);
                hashMap.put("exchange_result", Integer.valueOf(i));
                hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.k);
                hashMap.put("ids", b());
                hashMap.put("status", Integer.valueOf(this.l ? 1 : 0));
                hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Short.valueOf(this.m));
                hashMap.put("time", Long.valueOf(this.h - this.e));
                hashMap.put("socket_time", Long.valueOf(this.f - this.e));
                hashMap.put("exchange_time", Long.valueOf(this.h - this.g));
                hashMap.put("net", Integer.valueOf(this.n));
                hashMap.put("detect", "");
                hashMap.put("count", Integer.valueOf(this.p));
                hashMap.put("appstate", Integer.valueOf(this.b));
                if (this.c != 0) {
                    hashMap.put("backtime", Long.valueOf(System.currentTimeMillis() - this.c));
                }
                hashMap.put("type", Integer.valueOf(m.a().m() ? 1 : 0));
                hashMap.put("code", Integer.valueOf(this.r));
                hashMap.put("http_result", Integer.valueOf(i2));
            }
            a(10, hashMap, f.m().i());
        } else {
            com.sankuai.xm.log.a.c("logExchangeKeyErrorEvent repeat in one connect, exchange error=%d,other error=%d", Integer.valueOf(i), Integer.valueOf(i2));
        }
        a();
    }

    public final void b(int i, String str, int i2) {
        HashMap<String, Object> hashMap;
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3718cfa2fba5f1b2c4efb09e4b3269", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3718cfa2fba5f1b2c4efb09e4b3269");
            return;
        }
        this.j = System.currentTimeMillis();
        if (this.i != 0) {
            Object[] objArr2 = {Integer.valueOf(i), str, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68f031b9ab085b6607a1151fb581e8bc", 6917529027641081856L)) {
                hashMap = (HashMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68f031b9ab085b6607a1151fb581e8bc");
            } else {
                hashMap = new HashMap<>();
                hashMap.put("result", Integer.valueOf(i));
                hashMap.put("msg", str);
                hashMap.put("socket_result", 0);
                hashMap.put("exchange_result", 0);
                hashMap.put("login_result", Integer.valueOf(i));
                hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.k);
                hashMap.put("ids", b());
                hashMap.put("status", Integer.valueOf(this.l ? 1 : 0));
                hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Short.valueOf(this.m));
                hashMap.put("time", Long.valueOf(this.j - this.e));
                hashMap.put("socket_time", Long.valueOf(this.f - this.e));
                hashMap.put("exchange_time", Long.valueOf(this.h - this.g));
                hashMap.put("login_time", Long.valueOf(this.j - this.i));
                hashMap.put("net", Integer.valueOf(this.n));
                hashMap.put("detect", "");
                hashMap.put("count", Integer.valueOf(this.p));
                hashMap.put("appstate", Integer.valueOf(this.b));
                if (this.c != 0) {
                    hashMap.put("backtime", Long.valueOf(System.currentTimeMillis() - this.c));
                }
                hashMap.put("type", Integer.valueOf(m.a().m() ? 1 : 0));
                hashMap.put("code", Integer.valueOf(this.r));
                hashMap.put("http_result", Integer.valueOf(i2));
            }
            a(20, hashMap, f.m().i());
        } else {
            com.sankuai.xm.log.a.c("logAuthErrorEvent repeat in one connect, auth error=%d,other error=%d", Integer.valueOf(i), Integer.valueOf(i2));
        }
        a();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1e6623f0e1b2af8476c196920cfeda2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1e6623f0e1b2af8476c196920cfeda2");
            return;
        }
        this.e = System.currentTimeMillis();
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.r = 0;
        this.k = "";
        this.l = false;
        this.m = (short) 0;
        this.n = -1;
        this.o = "";
        this.p = 0;
        this.q = 0;
        synchronized (this) {
            this.s.clear();
        }
    }

    private void a(int i, HashMap<String, Object> hashMap, int i2) {
        Object[] objArr = {Integer.valueOf(i), hashMap, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4dc0f0e5c4357b793aba020001622c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4dc0f0e5c4357b793aba020001622c");
            return;
        }
        int intValue = ((Integer) hashMap.get("result")).intValue();
        int intValue2 = hashMap.get("http_result") != null ? ((Integer) hashMap.get("http_result")).intValue() : 0;
        String str = "";
        long j = 0;
        if (i == 0) {
            str = "api.neixin.cn/sdk/socket/full_connect";
            j = ((Long) hashMap.get("time")).longValue();
        } else if (i == 10) {
            str = "api.neixin.cn/sdk/socket/exchange";
            intValue = (i2 == 20 || i2 == 40) ? 0 : 0;
            j = ((Long) hashMap.get("exchange_time")).longValue();
        } else if (i == 20) {
            str = "api.neixin.cn/sdk/socket/auth";
            if (i2 == 40) {
                intValue = 0;
            }
            j = ((Long) hashMap.get("login_time")).longValue();
        } else if (i == 30) {
            str = "api.neixin.cn/sdk/socket/connected";
            intValue = (i2 == 10 || i2 == 20 || i2 == 40) ? 0 : 0;
            j = ((Long) hashMap.get("socket_time")).longValue();
        }
        if (intValue2 != 0) {
            intValue = intValue2;
        }
        a(str, intValue, j);
    }

    private void a(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da26477c8c64acc39eceb71c3fa7a3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da26477c8c64acc39eceb71c3fa7a3d");
            return;
        }
        com.sankuai.xm.monitor.cat.b bVar = new com.sankuai.xm.monitor.cat.b();
        bVar.b = str;
        bVar.c = a(i);
        bVar.d = 200;
        bVar.g = j;
        m.d().a(bVar);
    }

    public String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313f4af685104157ae9b39c0f5a0b817", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313f4af685104157ae9b39c0f5a0b817");
        }
        String str = "";
        HashSet<com.sankuai.xm.login.manager.lvs.a> hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.s);
        }
        for (com.sankuai.xm.login.manager.lvs.a aVar : hashSet) {
            if (!ac.a(com.sankuai.xm.login.manager.lvs.b.a(aVar))) {
                str = str + com.sankuai.xm.login.manager.lvs.b.a(aVar) + CommonConstant.Symbol.COMMA;
            }
        }
        return str;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c54a70c2b505bf02c8f3186cd545d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c54a70c2b505bf02c8f3186cd545d6");
            return;
        }
        if (this.l && !ac.a(this.k)) {
            a("api.neixin.cn/sdk/socket/ipv6socket", 0, 0L);
        }
        HashSet<com.sankuai.xm.login.manager.lvs.a> hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.s);
        }
        for (com.sankuai.xm.login.manager.lvs.a aVar : hashSet) {
            if (com.sankuai.xm.login.manager.lvs.b.b(aVar) && !ac.a(com.sankuai.xm.login.manager.lvs.b.a(aVar))) {
                a("api.neixin.cn/sdk/socket/ipv6socket", 1, 0L);
            }
        }
    }
}
