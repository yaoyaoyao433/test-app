package com.sankuai.xm.file.proxy;

import android.os.Build;
import android.text.TextUtils;
import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.r;
import com.sankuai.xm.im.message.bean.MsgAddition;
import com.sankuai.xm.network.c;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {
    public static ChangeQuickRedirect a = null;
    private static long b = 0;
    private static String c = "";
    private static String d = "";
    private static short e = 0;
    private static String f = "";
    private static String g = "";
    private static String h = "";
    private static boolean i = true;
    private static HashSet<String> j = new HashSet<>();

    public static void a(long j2, String str, String str2, String str3) {
        b = j2;
        c = str;
        d = str2;
        f = str3;
    }

    public static void a(short s) {
        e = s;
    }

    public static void a(String str) {
        g = str;
    }

    public static String a() {
        return g;
    }

    public static void a(HashSet<String> hashSet) {
        Object[] objArr = {hashSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86c558c53f441a2b0a0531201b7b6328", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86c558c53f441a2b0a0531201b7b6328");
            return;
        }
        synchronized (f.class) {
            j.addAll(hashSet);
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "193df995fd559959c681b243e7b0e708", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "193df995fd559959c681b243e7b0e708");
            return;
        }
        synchronized (f.class) {
            j.clear();
        }
    }

    public static void a(boolean z) {
        i = z;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "627c72187553ecbf09211715ab14cf8e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "627c72187553ecbf09211715ab14cf8e")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        synchronized (f.class) {
            if (i) {
                if (j.isEmpty()) {
                    return true;
                }
                return j.contains(com.sankuai.xm.base.util.net.e.b(str));
            }
            return true;
        }
    }

    public static String a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee4d5f7fea1dcfc183769f61b2d657ec", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee4d5f7fea1dcfc183769f61b2d657ec");
        }
        if (map == null) {
            return "";
        }
        return "mtracid:" + map.get("M-TraceId") + ", ua:" + map.get("User-Agent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Map] */
    public static Map<String, String> a(String str, boolean z) {
        HashMap hashMap;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "500ac9bd3737cb05720b6a32c5d6b161", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "500ac9bd3737cb05720b6a32c5d6b161");
        }
        HashMap hashMap2 = new HashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "951ca90baa5430ac679a9968237fb611", 6917529027641081856L)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "951ca90baa5430ac679a9968237fb611");
        } else {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("Content-Type", HHNetConfig.JSON);
            StringBuilder sb = new StringBuilder("XmSDK/");
            sb.append(g);
            sb.append("(Android; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("; FileSDK/");
            com.sankuai.xm.base.extendimpl.a.a();
            sb.append("4.46.113; ");
            sb.append(h);
            sb.append("/");
            sb.append((int) e);
            sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
            hashMap3.put("User-Agent", sb.toString());
            hashMap3.put("M-TraceId", Long.toString(com.sankuai.xm.base.util.c.a()));
            hashMap = hashMap3;
        }
        hashMap2.putAll(hashMap);
        if (z && com.sankuai.xm.file.proxy.b.b().b(str)) {
            hashMap2.put("xmtk", com.sankuai.xm.file.proxy.b.b().k);
        } else {
            hashMap2.put("u", String.valueOf(b));
            hashMap2.put("uu", d);
            if (b(str)) {
                hashMap2.put("al", c);
            } else {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1e5b7f47a15446ba523749c4a42bb6b4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1e5b7f47a15446ba523749c4a42bb6b4");
                } else {
                    com.sankuai.xm.file.util.b.b("reportExceptionUrl url:" + str, new Object[0]);
                }
            }
            hashMap2.put("mat", "AL");
            hashMap2.put("ai", String.valueOf((int) e));
            hashMap2.put(MsgAddition.DT, "1");
        }
        return hashMap2;
    }

    public static Map<String, String> b(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ebbd2b4391d8e90e59597236d284773", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ebbd2b4391d8e90e59597236d284773");
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(a(str, true));
        hashMap.remove("Content-Type");
        return hashMap;
    }

    public static Map<String, String> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4604a2f6e244901116938bcbaf6f5e8b", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4604a2f6e244901116938bcbaf6f5e8b");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("u", String.valueOf(b));
        hashMap.put("uu", d);
        hashMap.put("al", c);
        hashMap.put("mat", "AL");
        hashMap.put("ai", String.valueOf((int) e));
        hashMap.put(MsgAddition.DT, "1");
        return hashMap;
    }

    public static Map<String, String> a(String str, Map<String, String> map) {
        Set<com.sankuai.xm.network.httpurlconnection.a> set;
        com.sankuai.xm.network.httpurlconnection.b bVar;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03e7cb89f2561e1d9a59f54dd6273438", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03e7cb89f2561e1d9a59f54dd6273438");
        }
        Map<String, String> hashMap = map == null ? new HashMap<>() : map;
        com.sankuai.xm.network.httpurlconnection.g a2 = com.sankuai.xm.network.httpurlconnection.g.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.network.httpurlconnection.g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "1c1536613d0743eeea4a5f9979afdbda", 6917529027641081856L)) {
            set = (Set) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "1c1536613d0743eeea4a5f9979afdbda");
        } else {
            HashSet hashSet = new HashSet();
            hashSet.addAll(a2.c);
            set = hashSet;
        }
        if (!set.isEmpty()) {
            for (com.sankuai.xm.network.httpurlconnection.a aVar : set) {
                Object[] objArr3 = {str, hashMap, null};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.network.httpurlconnection.b.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4e0bd132c2cdf252bac98904562a6856", 6917529027641081856L)) {
                    bVar = (com.sankuai.xm.network.httpurlconnection.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4e0bd132c2cdf252bac98904562a6856");
                } else if (TextUtils.isEmpty(str)) {
                    bVar = null;
                } else {
                    bVar = new com.sankuai.xm.network.httpurlconnection.b();
                    bVar.b = str;
                    if (hashMap != null) {
                        bVar.c = new HashMap(hashMap);
                    }
                }
                Map<String, String> a3 = aVar.a(bVar);
                if (a3 != null) {
                    hashMap.putAll(a3);
                }
            }
        }
        return hashMap;
    }

    public static c.a a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ec264e5872d94d8f41ee63901ce65b6", 6917529027641081856L) ? (c.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ec264e5872d94d8f41ee63901ce65b6") : new c.a(5000, exc.getMessage());
    }

    public static a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97f157a9b074284bca3e34ecb98463c0", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97f157a9b074284bca3e34ecb98463c0") : new a();
    }

    public static b e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14e71c5f29c660185e37a80a0343910b", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14e71c5f29c660185e37a80a0343910b") : new b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private Map<String, Object> b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ac5a4f613819e22817aa313eed0594", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ac5a4f613819e22817aa313eed0594");
            } else {
                this.b = new TreeMap(new Comparator<String>() { // from class: com.sankuai.xm.file.proxy.f.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(String str, String str2) {
                        String str3 = str;
                        String str4 = str2;
                        Object[] objArr2 = {str3, str4};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31f5055cf64cc88ff7ef4c2f15e34565", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31f5055cf64cc88ff7ef4c2f15e34565")).intValue() : str3.compareTo(str4);
                    }
                });
            }
        }

        public final a a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd58a218e151aa867f9d66f616f06cc", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd58a218e151aa867f9d66f616f06cc");
            }
            if (TextUtils.isEmpty(str)) {
                com.sankuai.xm.file.util.b.b("filesdk", "key is invalid.");
                return this;
            } else if (obj == null) {
                com.sankuai.xm.file.util.b.b("filesdk", "value is invalid.");
                return this;
            } else {
                this.b.put(str, obj);
                return this;
            }
        }

        public final a a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f87988eb00f0c66db2fecaec7e67e72", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f87988eb00f0c66db2fecaec7e67e72");
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "293e3530f54cbc9709808219300e9847", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "293e3530f54cbc9709808219300e9847") : r.a(this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        int b;
        String c;
        String d;
        private Map<String, String> e;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d8ae406880ae5b194f465ed1b75998", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d8ae406880ae5b194f465ed1b75998");
                return;
            }
            this.b = 0;
            this.c = "";
            this.d = "";
            this.e = new TreeMap();
        }

        public final b a(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db78e7920197b9bf19c26594cc570dc9", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db78e7920197b9bf19c26594cc570dc9");
            }
            if (map != null) {
                this.e.putAll(map);
            }
            return this;
        }

        public final com.sankuai.xm.network.c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9907ab4eba05cc7b737665e1f345712", 6917529027641081856L)) {
                return (com.sankuai.xm.network.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9907ab4eba05cc7b737665e1f345712");
            }
            com.sankuai.xm.network.c cVar = new com.sankuai.xm.network.c();
            cVar.a(this.b);
            cVar.a(this.c);
            cVar.b(this.d);
            this.e.put("Request-Id", cVar.v());
            cVar.a(this.e);
            return cVar;
        }
    }
}
