package com.sankuai.xm.monitor.statistics;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.c;
import com.sankuai.xm.base.service.m;
import java.net.URL;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public c b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.monitor.statistics.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1415b {
        public static b a = new b();
    }

    public static /* synthetic */ String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1c14a70395db56a2e93a4923e2fed3d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1c14a70395db56a2e93a4923e2fed3d");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(AbsApiFactory.HTTPS)) {
            return str.substring(8);
        }
        return str.startsWith(AbsApiFactory.HTTP) ? str.substring(7) : str;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed81981056bd8eee0b18f6ed2bb0d7d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed81981056bd8eee0b18f6ed2bb0d7d7");
            return;
        }
        this.b = (c) m.a(c.class);
        this.b.a_(com.sankuai.xm.base.entity.c.class).a(new com.sankuai.xm.base.callback.c<com.sankuai.xm.base.entity.c>() { // from class: com.sankuai.xm.monitor.statistics.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.c
            public final /* synthetic */ boolean a(com.sankuai.xm.base.entity.c cVar) {
                com.sankuai.xm.base.entity.c cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e9618601afcc7697df81792be8dacf8", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e9618601afcc7697df81792be8dacf8")).booleanValue();
                }
                if (cVar2 != null) {
                    com.sankuai.xm.log.c.b("traffic", "SocketTrafficEvent, up=%d, down=%d", Long.valueOf(cVar2.a), Long.valueOf(cVar2.b));
                }
                return false;
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public long b;
        public long c;
        public int d;
        public float e;
        private String f;
        private String g;
        private String h;
        private long i;
        private long j;
        private long k;
        private long l;
        private long m;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac3dc9f1442442174ce56b1db9b9a3b9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac3dc9f1442442174ce56b1db9b9a3b9");
                return;
            }
            this.d = 102;
            this.m = SystemClock.uptimeMillis();
        }

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bc45de5af2c9c102238841107e6254d", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bc45de5af2c9c102238841107e6254d") : new a();
        }

        public final a a(URL url) {
            Object[] objArr = {url};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61921bd9131cf84fdd032e8da6dcb0a9", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61921bd9131cf84fdd032e8da6dcb0a9");
            }
            if (url != null) {
                this.h = url.toString();
                this.f = b.a(url.getHost());
                this.g = url.getPath();
                this.k = url.toString().length();
            } else {
                this.h = null;
                this.g = null;
                this.f = null;
                this.k = 0L;
            }
            return this;
        }

        public final a a(Map<String, List<String>> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a0ed522e6f5cc9b509ce21c14dbdf07", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a0ed522e6f5cc9b509ce21c14dbdf07");
            }
            this.b = c(map);
            return this;
        }

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aadb726ce9518396808a74070fdcdde", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aadb726ce9518396808a74070fdcdde");
            }
            this.i = j;
            return this;
        }

        public final a b(Map<String, List<String>> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a82cbe1b0c1100b78d09306c34d1359b", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a82cbe1b0c1100b78d09306c34d1359b");
            }
            this.c += c(map);
            return this;
        }

        public final a b(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c5af9d56fc5fa05b9714527f27ef6f", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c5af9d56fc5fa05b9714527f27ef6f");
            }
            this.j = j;
            return this;
        }

        public final a c(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e45112497591a5bcb3b5082276541d", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e45112497591a5bcb3b5082276541d");
            }
            this.i = j;
            return this;
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0687366dbcfb3f6f7654c3022bf2755", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0687366dbcfb3f6f7654c3022bf2755");
            } else {
                this.l = System.currentTimeMillis();
            }
        }

        private long c(Map<String, List<String>> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "447dfe0e25c9d2c824bb63f136aa965c", 6917529027641081856L)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "447dfe0e25c9d2c824bb63f136aa965c")).longValue();
            }
            if (map == null) {
                return 0L;
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    key = "";
                }
                sb.append(key);
                for (String str : entry.getValue()) {
                    sb.append(str);
                }
            }
            return sb.toString().getBytes().length;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19a1f1d13cc5169ba5e3a9f4a0dfea90", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19a1f1d13cc5169ba5e3a9f4a0dfea90");
            }
            return "TrafficBean{host='" + this.f + "', path='" + this.g + "', url='" + this.h + "', reqHeadSize=" + this.b + ", resHeadSize=" + this.c + ", reqBodySize=" + this.i + ", resBodySize=" + this.j + '}';
        }
    }
}
