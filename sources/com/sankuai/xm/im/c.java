package com.sankuai.xm.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.session.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static Map<b, a> b = new HashMap();

    static {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63c6bf9d7cfa19ff743c99418c9ef380", 6917529027641081856L)) {
            ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63c6bf9d7cfa19ff743c99418c9ef380")).booleanValue();
            return;
        }
        short c = com.sankuai.xm.base.f.m().c();
        if (c == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (c == 1) {
            i = 5000;
            hashMap.put(b.DATA, new a());
        } else {
            i = 1000;
        }
        hashMap.put(b.PEER_CHAT, new a(i));
        hashMap.put(b.GROUP_CHAT, new a(i));
        hashMap.put(b.PUB_CHAT, new a(i));
        a(hashMap);
    }

    public static void a(Map<b, a> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "830047327df0e38de83828d6f3cf9504", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "830047327df0e38de83828d6f3cf9504");
        } else if (map != null) {
            synchronized (c.class) {
                b.clear();
                b.putAll(map);
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "62e5801e1e7242f91499356355920043", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "62e5801e1e7242f91499356355920043");
                } else if (map != null) {
                    for (Map.Entry<b, a> entry : map.entrySet()) {
                        b key = entry.getKey();
                        Object[] objArr3 = {key};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        int i = -1;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "61493cee80f6fc22bac662f56d6b9070", 6917529027641081856L)) {
                            i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "61493cee80f6fc22bac662f56d6b9070")).intValue();
                        } else if (key != null) {
                            switch (key) {
                                case PEER_CHAT:
                                    i = 1;
                                    continue;
                                case GROUP_CHAT:
                                    i = 2;
                                    continue;
                                case PUB_CHAT:
                                    i = 3;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        a.C1395a.a(i, entry.getValue().b);
                    }
                }
                b.put(b.DATA, new a());
            }
        }
    }

    public static synchronized boolean a(b bVar) {
        synchronized (c.class) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4225bc93863df3047e294df46feabb41", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4225bc93863df3047e294df46feabb41")).booleanValue();
            }
            return b.containsKey(bVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum b {
        PEER_CHAT,
        GROUP_CHAT,
        PUB_CHAT,
        KF_CUSTOM,
        KF_BUSINESS,
        DATA;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bca623842091bbaea37f86675fb44ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bca623842091bbaea37f86675fb44ee");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79addf3fbd743bb332f1b55d665c37ef", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79addf3fbd743bb332f1b55d665c37ef") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f72c0a7ba71f6a2c363ccebd02b49088", 6917529027641081856L) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f72c0a7ba71f6a2c363ccebd02b49088") : (b[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0ba1696fb89265d9ffe1456c7c8132c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0ba1696fb89265d9ffe1456c7c8132c");
            } else {
                this.b = 1000;
            }
        }

        public a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c9fa4974d989b19d866d50d75664fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c9fa4974d989b19d866d50d75664fc");
            } else {
                this.b = i;
            }
        }
    }
}
