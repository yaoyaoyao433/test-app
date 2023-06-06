package com.sankuai.xm.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    public static ChangeQuickRedirect g;
    private Map<String, List<String>> a;
    private String b;
    private int c;
    private int d;
    private d e;
    private boolean f;
    protected String h;
    public int i;
    protected String j;
    protected Map<String, String> k;
    public int l;
    protected com.sankuai.xm.network.httpurlconnection.c m;
    public a n;
    public com.sankuai.xm.network.httpurlconnection.retry.d o;
    com.sankuai.xm.network.a p;
    private long q;
    private com.sankuai.xm.network.httpurlconnection.merge.a r;
    private boolean s;
    private volatile boolean t;
    private long u;
    private long v;
    private g w;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "299c535911b7be6fb65573c843b4b40b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "299c535911b7be6fb65573c843b4b40b");
            return;
        }
        this.i = 0;
        this.j = "";
        this.k = new HashMap();
        this.k.put("M-TraceId", Long.toString(com.sankuai.xm.base.util.c.a()));
        this.a = new HashMap();
        this.b = "";
        this.l = 0;
        this.m = null;
        this.e = null;
        this.n = null;
        this.h = UUID.randomUUID().toString();
        this.q = 0L;
        this.r = null;
        this.o = new com.sankuai.xm.network.httpurlconnection.retry.c();
        this.s = true;
        this.t = false;
        this.u = 0L;
        this.v = 0L;
        this.w = j.a();
    }

    public final com.sankuai.xm.network.a h() {
        return this.p;
    }

    public final int i() {
        return this.i;
    }

    public final void a(int i) {
        this.i = i;
    }

    public final String j() {
        return this.j;
    }

    public final void a(String str) {
        this.j = str;
    }

    public final Map<String, String> k() {
        return this.k;
    }

    public final void a(Map<String, String> map) {
        this.k = map;
    }

    public String l() {
        return this.b;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final int m() {
        return this.l;
    }

    public final void b(int i) {
        this.l = i;
    }

    public final boolean n() {
        return this.t;
    }

    public final void c(boolean z) {
        this.t = z;
    }

    public final int o() {
        return this.c;
    }

    public final int p() {
        return this.d;
    }

    public final com.sankuai.xm.network.httpurlconnection.c q() {
        return this.m;
    }

    public final d r() {
        return this.e;
    }

    public final a s() {
        return this.n;
    }

    public final boolean t() {
        return this.n != null;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96ff8fb6d85d1686bb2517b1bfe9429b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96ff8fb6d85d1686bb2517b1bfe9429b");
        } else {
            this.u = j;
        }
    }

    public final long u() {
        return this.u;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d163965e05dc6332ce5b13d05668965d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d163965e05dc6332ce5b13d05668965d");
        } else {
            this.v = j;
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0c4bcefbdfca58b866b3e5f85e58b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0c4bcefbdfca58b866b3e5f85e58b0");
        } else if (ac.a(str)) {
        } else {
            if (this.k == null) {
                this.k = new HashMap();
            }
            if (str2 == null) {
                str2 = "";
            }
            this.k.put(str, str2);
        }
    }

    public final String v() {
        return this.h;
    }

    public final g w() {
        return this.w;
    }

    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41131ec31c461e16e472ceefdf2b1c3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41131ec31c461e16e472ceefdf2b1c3a");
        } else if (this.m != null) {
            com.sankuai.xm.network.httpurlconnection.c cVar = this.m;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.network.httpurlconnection.c.h;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f9f10bf126c0ad6bd2d705629c10f7a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f9f10bf126c0ad6bd2d705629c10f7a0");
            } else if (cVar.j != 0) {
                cVar.i = System.currentTimeMillis() - cVar.j;
            }
            if (z) {
                this.m.a(this.e);
            } else {
                this.m.a(this);
            }
        }
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8789ce9bf08386ccd3cbe8c0534bc514", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8789ce9bf08386ccd3cbe8c0534bc514");
            return;
        }
        this.e = dVar;
        if (this.e != null) {
            this.e.d = this;
        }
        b(true);
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfa3b332e0a910ce850f4548618bfeb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfa3b332e0a910ce850f4548618bfeb2");
            return;
        }
        this.n = aVar;
        if (this.n != null) {
            this.n.b = this;
            this.n.f = this.j;
        }
        b(false);
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc61e8a8560449726d63b9d77c54f3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc61e8a8560449726d63b9d77c54f3b");
            return;
        }
        this.n = new a(i, str);
        this.n.b = this;
        this.n.f = this.j;
        b(false);
    }

    public final boolean x() {
        return this.f;
    }

    public final void a(int i, String str, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "945c380730230a564a551d4d01ed0cc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "945c380730230a564a551d4d01ed0cc6");
            return;
        }
        this.n = new a(i, str);
        this.n.b = this;
        this.n.e = i2;
        this.n.f = this.j;
        this.n.g = i3;
        b(false);
    }

    public final String y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c108f3440840c934107fd36fd9ef8726", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c108f3440840c934107fd36fd9ef8726") : this.k.containsKey("M-TraceId") ? this.k.get("M-TraceId") : "-1";
    }

    public final long z() {
        return this.q;
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263724b1180971d53d3fcf42dc199c54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263724b1180971d53d3fcf42dc199c54");
        } else {
            this.q = j;
        }
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f0b9cdd49b3ca4964459a2276f137e5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f0b9cdd49b3ca4964459a2276f137e5")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.h.equals(((c) obj).h);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4541e3d9682fb3bd3f65306fbe5bf791", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4541e3d9682fb3bd3f65306fbe5bf791")).intValue() : this.h.hashCode();
    }

    public boolean bZ_() {
        return this.r != null;
    }

    public final void a(com.sankuai.xm.network.httpurlconnection.merge.a aVar) {
        this.r = aVar;
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c9b158996af867533ed24ce8ba0d779", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c9b158996af867533ed24ce8ba0d779");
        } else if (this.r != null) {
            this.r.a(cVar, this);
        }
    }

    public final String A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cb09ed8f583370239cc460e856b6d51", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cb09ed8f583370239cc460e856b6d51") : this.r == null ? "" : this.r.a();
    }

    public final long B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae24143784e99d1c48bc59607f2cf9cd", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae24143784e99d1c48bc59607f2cf9cd")).longValue() : this.r == null ? 0L : 500L;
    }

    public final com.sankuai.xm.network.httpurlconnection.retry.d C() {
        return this.o;
    }

    public final boolean E() {
        if (this.q > 0) {
            this.s = true;
        }
        return this.s;
    }

    public final void d(boolean z) {
        this.s = z;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6acf7fba9deefa32964b1d4cbde57666", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6acf7fba9deefa32964b1d4cbde57666");
        }
        try {
            long b = j.b();
            String y = y();
            String l = l();
            return "url=" + this.j + ",mtraceid=" + y + ",xmtraceid=" + b + ",body=" + l;
        } catch (Exception unused) {
            return super.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        c b;
        public int c;
        public String d;
        public int e;
        String f;
        public int g;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a4655b19ee0f9b7a6d916df2588612", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a4655b19ee0f9b7a6d916df2588612");
                return;
            }
            this.g = -1;
            this.b = null;
            this.c = 0;
            this.d = "";
            this.e = 200;
            this.f = "";
            this.g = -1;
        }

        public a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "570ea24338fd485567cecf5542223f29", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "570ea24338fd485567cecf5542223f29");
                return;
            }
            this.g = -1;
            this.b = null;
            this.c = i;
            this.d = str;
            this.e = 200;
            this.f = "";
        }

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final c c() {
            return this.b;
        }

        public final int d() {
            return this.e;
        }

        public final String e() {
            return this.f;
        }
    }

    public int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39f074343ab70a2c40c1c188768c5f77", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39f074343ab70a2c40c1c188768c5f77")).intValue();
        }
        com.sankuai.xm.network.httpurlconnection.c cVar = this.m;
        if (cVar != null) {
            cVar.a();
        }
        return 0;
    }

    public final String D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "741deab461abe3080f1465afaf6de1fd", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "741deab461abe3080f1465afaf6de1fd");
        }
        String str = "";
        Map<String, String> map = this.k;
        if (map == null) {
            return "";
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str + entry.getKey() + CommonConstant.Symbol.COLON + entry.getValue() + StringUtil.SPACE;
        }
        return str;
    }
}
