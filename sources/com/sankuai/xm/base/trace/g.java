package com.sankuai.xm.base.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g implements Cloneable {
    public static ChangeQuickRedirect a;
    public long b;
    String c;
    String d;
    Throwable e;
    String f;
    long g;
    boolean h;
    Set<Long> i;
    boolean j;
    int k;
    String l;
    private String m;
    private i n;
    private long o;
    private String p;
    private String[] q;
    private Class<?>[] r;
    private String s;
    private List<Throwable> t;
    private Map<String, Object> u;
    private long v;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39223840c5bec208ffdbf6b9fd98d868", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39223840c5bec208ffdbf6b9fd98d868");
            return;
        }
        this.t = new ArrayList();
        this.i = new CopyOnWriteArraySet();
        this.j = false;
        this.n = i.normal;
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "258c3d415cd90bb4e733c492bdffd396", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "258c3d415cd90bb4e733c492bdffd396");
            return;
        }
        if (this.u == null) {
            this.u = new HashMap();
        }
        this.u.put(str, obj);
    }

    public final Map<String, Object> a() {
        return this.u;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a98db67dcda951ca121d015f53dcbb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a98db67dcda951ca121d015f53dcbb2");
        } else {
            this.v = j;
        }
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c716ddff4ecd9498dc246597bb8c5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c716ddff4ecd9498dc246597bb8c5e");
        } else {
            this.s = c(obj);
        }
    }

    public final void a(Throwable th) {
        this.e = th;
    }

    public final void a(boolean z) {
        this.j = true;
    }

    public final void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f56d2e286f60c9816f447a07d58d840b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f56d2e286f60c9816f447a07d58d840b");
        } else if (th == null || this.t.contains(th)) {
        } else {
            this.t.add(th);
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b13d565cb82a9147ead34e68cee385b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b13d565cb82a9147ead34e68cee385b");
        } else {
            this.i.add(Long.valueOf(j));
        }
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.m;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public final String[] f() {
        return this.q;
    }

    public final String g() {
        return this.s;
    }

    public final Throwable h() {
        return this.e;
    }

    public final List<Throwable> i() {
        return this.t;
    }

    public final boolean j() {
        return this.j;
    }

    public final long k() {
        return this.g;
    }

    public final long l() {
        return this.v;
    }

    public final long m() {
        if (this.v == 0 || this.g == 0 || this.g > this.v) {
            return -1L;
        }
        return this.v - this.g;
    }

    public final Set<Long> n() {
        return this.i;
    }

    public final i o() {
        return this.n;
    }

    public final int p() {
        return this.k;
    }

    public final void a(int i) {
        this.k = i;
    }

    public final String q() {
        return this.l;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2933cb757cbe70575fbecec95aa423", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2933cb757cbe70575fbecec95aa423");
        }
        return "TraceInfo{traceId='" + this.b + "', name='" + this.d + "', traceName='" + this.c + "', args=" + Arrays.toString(this.q) + ", action=" + this.f + ", entryTime=" + this.g + '}';
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de009f3287ef51b38e4310edaff522b8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de009f3287ef51b38e4310edaff522b8")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return a(Long.valueOf(this.b), Long.valueOf(gVar.b)) && a((Object) this.m, (Object) gVar.m) && a(this.i, gVar.i);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb6e69615c1e81a991178c9f85017846", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb6e69615c1e81a991178c9f85017846")).intValue() : Arrays.hashCode(new Object[]{Long.valueOf(this.b), this.m, this.i});
    }

    private static boolean a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0629894748f0380bbca5d81b1e3a7e46", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0629894748f0380bbca5d81b1e3a7e46")).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public g b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f96a832eb56ae3512d320566f19010d1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f96a832eb56ae3512d320566f19010d1");
            } else {
                this.b = new g();
            }
        }

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb2c171b1f1e09deb98e4de9fb4a8ee5", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb2c171b1f1e09deb98e4de9fb4a8ee5") : new a();
        }

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a77a5299488c9326f4300202ab79171", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a77a5299488c9326f4300202ab79171");
            }
            this.b.b = j;
            return this;
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4089248947af7746192684a7c1a55f1", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4089248947af7746192684a7c1a55f1");
            }
            this.b.c = str;
            return this;
        }

        public final a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5ffe56ba04ccc25f9da54d33cfecb8", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5ffe56ba04ccc25f9da54d33cfecb8");
            }
            this.b.d = str;
            return this;
        }

        public final a a(Object[] objArr) {
            Object[] objArr2 = {objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "15cb10fd4cb2bf7aa201a7f05e928f6d", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "15cb10fd4cb2bf7aa201a7f05e928f6d");
            }
            if (objArr != null) {
                this.b.q = new String[objArr.length];
                this.b.r = new Class[objArr.length];
                int length = objArr.length;
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = objArr[i2];
                    this.b.q[i] = g.c(obj);
                    this.b.r[i] = obj == null ? null : obj.getClass();
                    i++;
                }
            }
            return this;
        }

        public final a a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f5fde7a61bf5d6737880f430130e601", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f5fde7a61bf5d6737880f430130e601");
            }
            this.b.h = z;
            return this;
        }

        public final a b(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b849a9142ae7ad71f4a20294e16024d7", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b849a9142ae7ad71f4a20294e16024d7");
            }
            this.b.g = j;
            return this;
        }

        public final a a(Set<Long> set) {
            Object[] objArr = {set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf18c714ccdad6b822cb012154379af5", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf18c714ccdad6b822cb012154379af5");
            }
            if (!com.sankuai.xm.base.util.b.a(set)) {
                this.b.i.addAll(set);
            }
            return this;
        }

        public final a a(i iVar) {
            Object[] objArr = {iVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b89c75169443116ab8ec51e6174638d", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b89c75169443116ab8ec51e6174638d");
            }
            g gVar = this.b;
            if (iVar == null) {
                iVar = i.normal;
            }
            gVar.n = iVar;
            return this;
        }

        public final a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d388f14f479b99e2829a05be31aff0a8", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d388f14f479b99e2829a05be31aff0a8");
            }
            g gVar = this.b;
            if (ac.a(str)) {
                str = "single";
            }
            gVar.f = str;
            return this;
        }

        public final g b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046537f89952068d8f0a1eb6c9559231", 6917529027641081856L)) {
                return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046537f89952068d8f0a1eb6c9559231");
            }
            g gVar = this.b;
            gVar.m = System.currentTimeMillis() + CommonConstant.Symbol.UNDERLINE + hashCode();
            this.b.o = Thread.currentThread().getId();
            this.b.p = Thread.currentThread().getName();
            return this.b;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2cfff9fb94637636f678c6cd621a7c3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2cfff9fb94637636f678c6cd621a7c3") : this.b.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Object obj) {
        byte[] bArr;
        Collection collection;
        String str;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15d8c2ecb726fd9e6e20da939a3b113e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15d8c2ecb726fd9e6e20da939a3b113e");
        }
        if (obj == null) {
            return null;
        }
        b a2 = j.a(obj.getClass());
        if (a2 != null) {
            try {
                return a2.a(obj);
            } catch (Throwable th) {
                com.sankuai.xm.log.a.a(th);
            }
        }
        if (obj instanceof Map) {
            return "(size:" + ((Map) obj).size() + CommonConstant.Symbol.BRACKET_RIGHT;
        } else if (obj instanceof Collection) {
            if (((Collection) obj).isEmpty()) {
                str = "";
            } else {
                str = CommonConstant.Symbol.COMMA + c(collection.iterator().next());
            }
            return "(size:" + collection.size() + CommonConstant.Symbol.COMMA + str + CommonConstant.Symbol.BRACKET_RIGHT;
        } else if (obj instanceof byte[]) {
            return "(len:" + bArr.length + ", uri=" + com.sankuai.xm.base.proto.protobase.f.d((byte[]) obj) + CommonConstant.Symbol.BRACKET_RIGHT;
        } else {
            return String.valueOf(obj);
        }
    }
}
