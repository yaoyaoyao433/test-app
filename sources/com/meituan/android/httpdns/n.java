package com.meituan.android.httpdns;

import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.httpdns.h;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class n implements u {
    public static ChangeQuickRedirect a = null;
    private static volatile String k = "httpdns.meituan.com";
    private static volatile String l = "httpdnsvip.meituan.com";
    private static int q;
    private static int s;
    private static long u;
    f b;
    s c;
    public r d;
    public o e;
    public Proxy f;
    q j;
    private String m;
    private String n;
    private Object o;
    private volatile boolean p;
    private boolean r;
    private static long[] t = {0, 1000, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, 4000, 8000, 16000, 32000, 64000};
    public static int g = 1;
    public static int h = 2;
    public static int i = 3;
    private static Map<String, Object> v = new HashMap();

    public static /* synthetic */ boolean a(n nVar, boolean z) {
        nVar.r = false;
        return false;
    }

    public static /* synthetic */ boolean b(n nVar, boolean z) {
        nVar.p = false;
        return false;
    }

    public static /* synthetic */ void c(n nVar) {
        DnsRecord b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "c552e1f7bda95768c9bfa7fdc5b77b60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "c552e1f7bda95768c9bfa7fdc5b77b60");
            return;
        }
        try {
            if (h.a().b.b && (b = nVar.b(l, null, true, nVar.d(), null)) != null) {
                List<String> ipv4 = b.getIpv4();
                if (ipv4 != null && ipv4.size() > 0) {
                    InetAddress.getByName(ipv4.get(0));
                    synchronized (nVar.o) {
                        nVar.m = ipv4.get(0);
                    }
                    if (nVar.e != null) {
                        nVar.e.a("httpdns_ipv4", ipv4.get(0));
                    }
                }
                List<String> ipv6 = b.getIpv6();
                if (ipv6 == null || ipv6.size() <= 0) {
                    return;
                }
                InetAddress.getByName(ipv6.get(0));
                synchronized (nVar.o) {
                    nVar.n = ipv6.get(0);
                }
                if (nVar.e != null) {
                    nVar.e.a("httpdns_ipv6", ipv6.get(0));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void d(n nVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "8586301e16bf172020e24b965eb95ba2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "8586301e16bf172020e24b965eb95ba2");
            return;
        }
        boolean b = nVar.b(nVar.m);
        r rVar = nVar.d;
        rVar.a("Evn: " + nVar.m + "  " + b);
        boolean b2 = nVar.b(nVar.n);
        r rVar2 = nVar.d;
        rVar2.a("Evn: " + nVar.n + "  " + b2);
        if (b && b2) {
            q = 2;
        } else if (!b && b2) {
            q = 1;
        } else {
            q = 0;
        }
    }

    public n(r rVar, s sVar, f fVar, o oVar) {
        Object[] objArr = {rVar, sVar, fVar, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b91d23d9f9f50ffd03f02bcaa2f6f3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b91d23d9f9f50ffd03f02bcaa2f6f3d");
            return;
        }
        this.m = "103.37.155.60";
        this.n = "2405:1480:2000:3::5";
        this.o = new Object();
        this.p = false;
        this.r = true;
        this.j = new q();
        this.d = rVar;
        this.e = oVar;
        a(sVar);
        this.b = fVar;
        this.b.a(this);
        e();
    }

    public final DnsResult a(String str, d dVar) {
        Object obj;
        long j;
        DnsResult dnsResult;
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b20b0c5e2fef2082404b29d61b4c9fc", 6917529027641081856L)) {
            return (DnsResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b20b0c5e2fef2082404b29d61b4c9fc");
        }
        DnsRecord a2 = this.b.a(str, dVar);
        if (a2 != null) {
            DnsResult dnsResult2 = new DnsResult();
            dnsResult2.setResultCode(g);
            dnsResult2.setDnsRecord(a2);
            return dnsResult2;
        }
        synchronized (v) {
            Object obj2 = v.get(str);
            if (obj2 == null) {
                obj2 = new Object();
                v.put(str, obj2);
            }
            obj = obj2;
        }
        synchronized (obj) {
            Object[] objArr2 = {str, dVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78b82dcdf601d58edece6f4e76956a67", 6917529027641081856L)) {
                dnsResult = (DnsResult) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78b82dcdf601d58edece6f4e76956a67");
            } else {
                DnsResult dnsResult3 = new DnsResult();
                if (x.a(str)) {
                    d.a(dVar, "hostname null");
                } else {
                    DnsRecord a3 = this.b.a(str);
                    DnsRecord a4 = this.b.a(str, dVar);
                    if (a4 != null) {
                        dnsResult3.setResultCode(h);
                        dnsResult3.setDnsRecord(a4);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (s <= 0) {
                            j = 0;
                        } else if (s >= t.length) {
                            long[] jArr = t;
                            j = jArr[jArr.length - 1];
                        } else {
                            j = t[s];
                        }
                        this.d.a("Cooling:" + s + "   " + j);
                        if (s != 0 && (s <= 0 || currentTimeMillis - u <= j)) {
                            this.d.a("Cooling: cooltime, localdns");
                            d.a(dVar, "coolingTime:" + j);
                        }
                        DnsRecord a5 = a(str, null, false, d(), dVar);
                        if (a5 == null) {
                            s++;
                            u = System.currentTimeMillis();
                        }
                        if (a5 != null) {
                            s = 0;
                            u = 0L;
                            dnsResult3.setResultCode(h);
                            dnsResult3.setDnsRecord(a5);
                            this.b.a(str, a3, a5);
                        }
                    }
                    dnsResult = dnsResult3;
                }
                dnsResult3.setResultCode(i);
                dnsResult = dnsResult3;
            }
        }
        return dnsResult;
    }

    public static int a() {
        return q;
    }

    private String a(String str, String str2, boolean z) {
        String str3;
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e7cdf068c383d809245200e014816a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e7cdf068c383d809245200e014816a");
        }
        if (h.a().c == -1) {
            return "";
        }
        if (h.a().b.c || z) {
            return AbsApiFactory.HTTPS + k + "/fetch?dm=" + str + "&appid=" + h.a().c;
        }
        String str4 = "";
        synchronized (this.o) {
            if (q == 0) {
                str3 = AbsApiFactory.HTTP + this.m;
            } else if (q == 1) {
                str3 = AbsApiFactory.HTTP + "[" + this.n + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
            } else if ("IPv4".equals(str2)) {
                str3 = AbsApiFactory.HTTP + this.m;
            } else if ("IPv6".equals(str2)) {
                str3 = AbsApiFactory.HTTP + "[" + this.n + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
            } else {
                if (h.a().b.a) {
                    str4 = "&type=ipv6";
                }
                str3 = AbsApiFactory.HTTP + this.m;
            }
        }
        return str3 + "/fetch?dm=" + str + "&appid=" + h.a().c + str4;
    }

    public final DnsRecord a(String str, String str2, boolean z, int i2, d dVar) {
        ArrayList arrayList = null;
        Object[] objArr = {str, null, (byte) 0, Integer.valueOf(i2), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c526c0b4b98bf2ce29d457de4164032", 6917529027641081856L)) {
            return (DnsRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c526c0b4b98bf2ce29d457de4164032");
        }
        long currentTimeMillis = System.currentTimeMillis();
        DnsRecord b = b(str, null, false, i2, dVar);
        h.a aVar = h.a().b;
        if (aVar == null || !aVar.n) {
            return b;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            if (allByName != null && allByName.length > 0) {
                arrayList = new ArrayList(Arrays.asList(allByName));
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        if (b != null) {
            b.setLocalDnsCacheList(arrayList);
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        if (h.a().e) {
            a("getAllFromServerAndLocalDns serverTime:" + (currentTimeMillis2 - currentTimeMillis) + " localTime:" + (currentTimeMillis3 - currentTimeMillis2));
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.meituan.android.httpdns.r] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meituan.android.httpdns.DnsRecord b(java.lang.String r18, java.lang.String r19, boolean r20, int r21, com.meituan.android.httpdns.d r22) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.httpdns.n.b(java.lang.String, java.lang.String, boolean, int, com.meituan.android.httpdns.d):com.meituan.android.httpdns.DnsRecord");
    }

    @Override // com.meituan.android.httpdns.u
    public final void a(s sVar, boolean z) {
        Object[] objArr = {sVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705f05c32d4137cd7ab5c314374cc1c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705f05c32d4137cd7ab5c314374cc1c3");
            return;
        }
        this.b.a();
        a(sVar);
        if (z) {
            e();
        }
    }

    private void a(s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7372aa6d739399b936a318d62f4cb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7372aa6d739399b936a318d62f4cb6");
            return;
        }
        this.c = sVar;
        r rVar = this.d;
        rVar.a("changeNetState:" + sVar);
    }

    private int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b8e1f441433a528a1012a761e8b4a24", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b8e1f441433a528a1012a761e8b4a24")).intValue();
        }
        if (this.c != null) {
            switch (this.c) {
                case NET_3G:
                case NET_2G:
                case NET_UNKNOWN:
                    return 10000;
            }
        }
        int i2 = h.a().b.f * 1000;
        if (i2 > 0) {
            return i2;
        }
        return 1000;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e11736b5e2f83f2a5d9e97b6cd50d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e11736b5e2f83f2a5d9e97b6cd50d7");
        } else if (this.p) {
        } else {
            this.p = true;
            this.d.a("checkEnvironment");
            z.a(new Runnable() { // from class: com.meituan.android.httpdns.n.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfea1b635cbc3bf518d7126709dec7d2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfea1b635cbc3bf518d7126709dec7d2");
                        return;
                    }
                    if (n.this.r) {
                        if (n.this.e != null) {
                            String a2 = n.this.e.a("httpdns_ipv4");
                            if (!x.a(a2)) {
                                synchronized (n.this.o) {
                                    n.this.m = a2;
                                }
                            }
                            String a3 = n.this.e.a("httpdns_ipv6");
                            if (!x.a(a3)) {
                                synchronized (n.this.o) {
                                    n.this.n = a3;
                                }
                            }
                        }
                        if (h.a().c == -1 || !h.a().b.b) {
                            try {
                                Thread.sleep(MetricsAnrManager.ANR_THRESHOLD);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        n.c(n.this);
                    }
                    int i2 = n.q;
                    n.d(n.this);
                    if (i2 != n.q && !n.this.r) {
                        r rVar = n.this.d;
                        rVar.a("getHttpDnsIPs " + n.q);
                        n.c(n.this);
                    }
                    n.a(n.this, false);
                    n.b(n.this, false);
                }
            });
        }
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3059014228a0c71e6e80e61e937cc32e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3059014228a0c71e6e80e61e937cc32e")).booleanValue();
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (q.a(str, 0)) {
                return true;
            }
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static int b() {
        return q;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c4766d89ae5eaccac5e609a8a9548e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c4766d89ae5eaccac5e609a8a9548e3");
        } else if (this.d != null) {
            this.d.a(str);
        }
    }
}
