package com.sankuai.xm.base.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.util.ac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static volatile long i;
    private static c j;
    private static final Map<Class<?>, b> c = new HashMap();
    private static final Set<String> d = new HashSet();
    private static final Set<String> e = new HashSet();
    private static final Set<Class<?>> f = new HashSet();
    private static boolean g = false;
    private static volatile boolean h = false;
    public static ThreadLocal<a> b = new ThreadLocal<>();

    public static void a(c cVar) {
        j = cVar;
    }

    public static <T> void a(Class<T> cls, b<T> bVar) {
        Object[] objArr = {cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6255219faca40862652c4973c66b213", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6255219faca40862652c4973c66b213");
            return;
        }
        synchronized (c) {
            c.put(cls, bVar);
        }
    }

    public static void a(boolean z) {
        g = z;
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "768abaaa314c413317a826f73040453a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "768abaaa314c413317a826f73040453a");
            return;
        }
        com.sankuai.xm.log.a.b("xm_trace Tracing::setEnable:: %s", Boolean.valueOf(z));
        h = z;
        if (j != null) {
            j.a(h);
        }
    }

    public static void a(long j2) {
        i = j2;
    }

    public static b a(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c25f472be0d77be245259a2fb9bc676", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c25f472be0d77be245259a2fb9bc676");
        }
        synchronized (c) {
            for (Map.Entry<Class<?>, b> entry : c.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    return entry.getValue();
                }
            }
            return null;
        }
    }

    public static void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7295fad0f3354ac2e92acb0d0776190", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7295fad0f3354ac2e92acb0d0776190");
            return;
        }
        g a2 = a();
        if (a2 != null && obj != null) {
            a2.a(str, obj);
            return;
        }
        com.sankuai.xm.log.a.c("Tracing::putTraceParams, no trace or no value:" + str + "/" + obj, new Object[0]);
    }

    public static void a(Object obj, String[] strArr, int[] iArr, String[] strArr2, int[] iArr2, int[] iArr3) {
        int intValue;
        Object[] objArr = {obj, null, iArr, strArr2, iArr2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcfd2eba68509565a4e4796b5be73c47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcfd2eba68509565a4e4796b5be73c47");
            return;
        }
        g a2 = a();
        if (a2 == null) {
            return;
        }
        if ((obj instanceof Integer) || (obj instanceof Short)) {
            intValue = ((Integer) obj).intValue();
        } else {
            String valueOf = String.valueOf(obj);
            if (iArr2 != null && strArr2 != null && iArr2.length == strArr2.length) {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    if (strArr2[i2].equals(valueOf)) {
                        intValue = iArr2[i2];
                        break;
                    }
                }
            }
            intValue = 0;
        }
        a(a2, intValue, iArr, iArr2, null);
    }

    public static void a(g gVar, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        g gVar2;
        Object[] objArr = {gVar, Integer.valueOf(i2), iArr, iArr2, iArr3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf6c258ac06769ffa570814a94bc0587", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf6c258ac06769ffa570814a94bc0587");
            return;
        }
        if (gVar == null) {
            gVar2 = a();
            if (gVar2 == null) {
                return;
            }
        } else {
            gVar2 = gVar;
        }
        if (iArr2 == null && iArr3 == null && iArr != null) {
            for (int i3 : iArr) {
                if (i2 == i3) {
                    return;
                }
            }
            gVar2.a("code", (Object) Integer.valueOf(i2));
            gVar2.k = i2;
            return;
        }
        if (iArr2 != null) {
            for (int i4 : iArr2) {
                if (i2 == i4) {
                    gVar2.a("code", (Object) Integer.valueOf(i2));
                    gVar2.k = i2;
                    return;
                }
            }
        }
        if (iArr3 == null || iArr3.length != 2 || iArr3[0] >= i2 || i2 >= iArr3[1]) {
            return;
        }
        gVar2.a("code", (Object) Integer.valueOf(i2));
        gVar2.k = i2;
    }

    public static void a(i iVar, String str, String[] strArr, Object[] objArr) {
        Object[] objArr2 = {iVar, str, strArr, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "229e62a4ab9e2bdf0f5412677694b65d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "229e62a4ab9e2bdf0f5412677694b65d");
        } else {
            a((g) null, iVar, str, false, objArr, strArr);
        }
    }

    public static void b(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4fbc710beaa64bf019849b8f07bdbde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4fbc710beaa64bf019849b8f07bdbde");
        } else if (j2 == 0) {
        } else {
            a((Object) null, (Throwable) null);
        }
    }

    public static void a(long j2, Throwable th) {
        Object[] objArr = {new Long(j2), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8853a1a3a6ce1f195feb1ba5e4a4260", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8853a1a3a6ce1f195feb1ba5e4a4260");
        } else if (j2 == 0) {
        } else {
            a(th);
        }
    }

    public static void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "552af4b351f0f984873635cad088b62b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "552af4b351f0f984873635cad088b62b");
        } else if (gVar == null) {
        } else {
            a(gVar, i.normal, "Runnable::run", true, (Object[]) null, (String[]) null);
        }
    }

    public static void b(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d824fc76ae646b5db312743d78bb3fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d824fc76ae646b5db312743d78bb3fc");
        } else if (gVar == null) {
        } else {
            a(gVar, i.collect, "collection", false, (Object[]) null, (String[]) null);
        }
    }

    private static void a(g.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40e5385de4e01718cafea1e659aa655b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40e5385de4e01718cafea1e659aa655b");
            return;
        }
        aVar.b(System.currentTimeMillis());
        a e2 = e();
        final g b2 = aVar.b();
        e2.push(b2);
        if (b2.h || b2.b == 0) {
            return;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = "xm_trace ";
        objArr2[1] = b2;
        objArr2[2] = Boolean.valueOf(j == null);
        com.sankuai.xm.log.a.b("%s, traceBegin::%s, processor empty is %s.", objArr2);
        if (j != null) {
            m.e().a(22, new Runnable() { // from class: com.sankuai.xm.base.trace.j.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "78bbcb456771a1c4ad5548a1286dc7ad", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "78bbcb456771a1c4ad5548a1286dc7ad");
                    } else if (j.j != null) {
                        j.j.a(g.this);
                    }
                }
            });
        }
    }

    public static void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aea1bcb70b3863869b66db6c86de22b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aea1bcb70b3863869b66db6c86de22b6");
        } else {
            a(obj, (Throwable) null);
        }
    }

    public static void c(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "374b2e5c58dcbe81acf22df2e6b38ab6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "374b2e5c58dcbe81acf22df2e6b38ab6");
        } else if (gVar == null) {
        } else {
            a((Object) null);
        }
    }

    public static void a(g gVar, Throwable th) {
        Object[] objArr = {gVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9929c73af379a6ddb1556bb0a4c5074", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9929c73af379a6ddb1556bb0a4c5074");
        } else if (gVar == null) {
        } else {
            a(th);
        }
    }

    public static Runnable a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2963a26df3c0c1b838cce6f4e1c1cfd", 6917529027641081856L) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2963a26df3c0c1b838cce6f4e1c1cfd") : new h(runnable);
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75c5f3407a60cd3d0675a0b57f8ef037", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75c5f3407a60cd3d0675a0b57f8ef037");
        } else {
            a((Object) null, th);
        }
    }

    private static void a(Object obj, Throwable th) {
        Object[] objArr = {obj, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "508cd0d7db8f2f3948ff29bb6d1307f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "508cd0d7db8f2f3948ff29bb6d1307f0");
            return;
        }
        try {
            a f2 = f();
            if (f2 != null && !f2.isEmpty()) {
                final g pop = f2.pop();
                if (f2.isEmpty()) {
                    b.set(null);
                }
                if (pop != null && h) {
                    pop.a(System.currentTimeMillis());
                    pop.a(obj);
                    pop.e = th;
                    if (th != null) {
                        pop.j = true;
                    }
                    if (pop.h || j == null) {
                        return;
                    }
                    m.e().a(22, new Runnable() { // from class: com.sankuai.xm.base.trace.j.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d0efb7c0ce9e7e9575a4f295d2e6587", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d0efb7c0ce9e7e9575a4f295d2e6587");
                            } else if (j.j != null) {
                                j.j.c(g.this);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (h) {
                IllegalStateException illegalStateException = new IllegalStateException("traceEnd is NOT matched with traceBegin/traceNode");
                if (g) {
                    throw illegalStateException;
                }
            }
        } catch (Throwable th2) {
            com.sankuai.xm.log.a.a(th2, "xm_trace Tracing::traceEnd", new Object[0]);
        }
    }

    public static String a(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "8e186ce9e2077c1f84605cceb80a94f9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "8e186ce9e2077c1f84605cceb80a94f9");
        }
        try {
            String format = String.format(str2, objArr);
            try {
                g a2 = h ? a() : null;
                if (a2 != null && a2.b != 0) {
                    Object[] objArr3 = new Object[2];
                    String str3 = a2.c;
                    String str4 = a2.d;
                    long j2 = a2.b;
                    Object[] objArr4 = {str3, str4, new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    objArr3[0] = PatchProxy.isSupport(objArr4, null, changeQuickRedirect2, true, "2775895cf8f4189a12f6cb82b98f64bd", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect2, true, "2775895cf8f4189a12f6cb82b98f64bd") : String.format("module=%s,node=%s,traceid=%d,uid=%d ", str3, str4, Long.valueOf(j2), Long.valueOf(com.sankuai.xm.base.f.m().b));
                    objArr3[1] = format;
                    String format2 = String.format("%s, msg=%s", objArr3);
                    a(str, format2);
                    return format2;
                }
            } catch (Throwable unused) {
            }
            return format;
        } catch (Throwable unused2) {
            return "";
        }
    }

    private static a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "653b445dd0cda864f2f92e2a79550b29", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "653b445dd0cda864f2f92e2a79550b29");
        }
        a f2 = f();
        if (f2 == null) {
            a aVar = new a();
            b.set(aVar);
            return aVar;
        }
        return f2;
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce07614e09e9e57bacf7f86b197a5d84", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce07614e09e9e57bacf7f86b197a5d84");
        }
        a f2 = f();
        if (f2 == null || f2.isEmpty()) {
            return null;
        }
        return f2.peek();
    }

    public static long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "869915edbdd898f00cd2dd65ca805173", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "869915edbdd898f00cd2dd65ca805173")).longValue();
        }
        g a2 = a();
        if (a2 == null) {
            return 0L;
        }
        return a2.b;
    }

    private static a f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd1ba6884c02d6962d86d5b71beb99ef", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd1ba6884c02d6962d86d5b71beb99ef") : b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends Stack<g> {
        public static ChangeQuickRedirect a = null;
        private static final long serialVersionUID = -367779046110431127L;

        public final long a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f841a61bf1690fc26d0264a718278a", 6917529027641081856L)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f841a61bf1690fc26d0264a718278a")).longValue();
            }
            g peek = isEmpty() ? null : peek();
            if (peek == null) {
                return 0L;
            }
            return peek.b;
        }

        public final String b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5405ef2064ae0dd12bd3771e3f43351c", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5405ef2064ae0dd12bd3771e3f43351c");
            }
            g peek = isEmpty() ? null : peek();
            return peek == null ? "" : peek.c;
        }

        public final String c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06931675e26ba23ce75a5f21ed4984ae", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06931675e26ba23ce75a5f21ed4984ae");
            }
            g peek = isEmpty() ? null : peek();
            return peek == null ? "single" : peek.f;
        }

        @Override // java.util.Stack
        /* renamed from: a */
        public final g push(g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618f912f8d5850f9616d440f2b1798ba", 6917529027641081856L)) {
                return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618f912f8d5850f9616d440f2b1798ba");
            }
            if (j.i > 0 && !isEmpty()) {
                g peek = peek();
                if (System.currentTimeMillis() - peek.g > j.i) {
                    gVar.l = peek.toString();
                }
            }
            return (g) super.push(gVar);
        }
    }

    public static void a(i iVar, String str, String str2, long j2, String str3, Object[] objArr) {
        long j3;
        long j4;
        Object[] objArr2 = {iVar, str, str2, 0L, str3, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "3646ad764bdf5c9961e898622aee26ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "3646ad764bdf5c9961e898622aee26ea");
            return;
        }
        try {
            if (h) {
                if (iVar != i.begin) {
                    j4 = e().a();
                    j3 = 0;
                } else {
                    j3 = 0;
                    j4 = 0;
                }
                if (j4 == j3) {
                    j4 = com.sankuai.xm.base.util.c.b();
                }
                a(g.a.a().a(j4).a(iVar).a(str2).b(str).a(objArr).a(false).c(str3));
            }
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th, "xm_trace Tracing::traceBegin:: %s", str);
        }
    }

    public static void a(long j2, g gVar, String str, boolean z) {
        Object[] objArr = {new Long(j2), gVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85c8eafe5911f7f0fbf6e2cfd1bc3f3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85c8eafe5911f7f0fbf6e2cfd1bc3f3e");
        } else if (!h || j2 == 0) {
        } else {
            g.a a2 = g.a.a().a(i.recv).a(j2).b(str).a(z);
            if (gVar != null) {
                a2.a(gVar.b).a(gVar.c).c(gVar.f).a(gVar.i);
            }
            a(a2);
        }
    }

    private static void a(g gVar, i iVar, String str, boolean z, Object[] objArr, String[] strArr) {
        Object[] objArr2 = {gVar, iVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), objArr, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "1f7872749295582f50520c4474059545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "1f7872749295582f50520c4474059545");
            return;
        }
        try {
            if (h) {
                String b2 = e().b();
                g.a c2 = g.a.a().b(str).a(iVar).a(e().a()).a(b2).a(objArr).a(z).c(e().c());
                if (gVar != null) {
                    b2 = gVar.c;
                    c2.a(gVar.b).a(b2).c(gVar.f);
                    c2.a(gVar.i);
                }
                if (!ac.a(b2) && !com.sankuai.xm.base.util.b.b(strArr) && !new ArrayList(Arrays.asList(strArr)).contains(b2)) {
                    c2.a(true);
                }
                a(c2);
            }
        } catch (Throwable th) {
            com.sankuai.xm.log.a.a(th, "xm_trace Tracing::traceBegin:: %s", str);
        }
    }

    public static void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62736210328555fe49f481d7283c2bb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62736210328555fe49f481d7283c2bb1");
            return;
        }
        try {
            if (h) {
                a f2 = f();
                if (f2 != null && !f2.isEmpty()) {
                    final g peek = f2.peek();
                    if (peek == null) {
                        return;
                    }
                    peek.b(th);
                    if (peek.h || j == null) {
                        return;
                    }
                    m.e().a(22, new Runnable() { // from class: com.sankuai.xm.base.trace.j.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5264e8cc7c2730ea145e8ed18a794b85", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5264e8cc7c2730ea145e8ed18a794b85");
                            } else if (j.j != null) {
                                j.j.b(g.this);
                            }
                        }
                    });
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("traceCatch is NOT matched with traceBegin/traceNode");
                if (g) {
                    throw illegalStateException;
                }
            }
        } catch (Throwable th2) {
            com.sankuai.xm.log.a.a(th2, "xm_trace Tracing::traceCatch", new Object[0]);
        }
    }
}
