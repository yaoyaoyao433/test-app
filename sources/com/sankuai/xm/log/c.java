package com.sankuai.xm.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.p;
import java.util.Date;
import java.util.LinkedList;
import java.util.TimeZone;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static d b = d.a();

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b71a8629c7ead3fed297c187a11dafaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b71a8629c7ead3fed297c187a11dafaf");
            return;
        }
        final d dVar = b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "09df898019aff875ca05ea73e8043ba1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "09df898019aff875ca05ea73e8043ba1");
            return;
        }
        try {
            if (d.c) {
                return;
            }
            d.c = true;
            d.b.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            b bVar = new b();
            if (d.d == null) {
                synchronized (d.class) {
                    if (d.d == null) {
                        d.d = bVar;
                    }
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "e3c4208904316e977b53d4674b394af5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "e3c4208904316e977b53d4674b394af5");
                return;
            }
            dVar.b("MLog", "MLog init finished, writeCacheLog", new Object[0]);
            com.sankuai.xm.threadpool.scheduler.a.b().a(21, new Runnable() { // from class: com.sankuai.xm.log.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    LinkedList<a> linkedList;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1fcdfb2f34b964737a7fba11c5b89088", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1fcdfb2f34b964737a7fba11c5b89088");
                        return;
                    }
                    try {
                        synchronized (d.class) {
                            linkedList = new LinkedList(d.g);
                            d.g.clear();
                        }
                        for (a aVar : linkedList) {
                            if (aVar != null) {
                                d.d.a(aVar.b, aVar.c, aVar.d);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(p.a(e));
                    }
                }
            });
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e78cdd88d85ac697554170260d398002", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e78cdd88d85ac697554170260d398002");
            return;
        }
        d dVar = b;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "8f83efc7ca5db414e8fb02dd64fc9317", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "8f83efc7ca5db414e8fb02dd64fc9317");
        } else if (i <= 0 || i > 5) {
            d.e = 3;
        } else {
            d.e = i;
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c6288f577d3238f0efee141b3cfea18", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c6288f577d3238f0efee141b3cfea18")).booleanValue() : d.b();
    }

    public static void a(Object obj, String str, Object... objArr) {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e59eba65abdd8d3ed826752dc55fbada", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e59eba65abdd8d3ed826752dc55fbada");
        } else {
            b.a(obj, str, objArr);
        }
    }

    public static void b(Object obj, String str, Object... objArr) {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "b9a43ea13b4542d215a2ca0e4dc7a3b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "b9a43ea13b4542d215a2ca0e4dc7a3b2");
        } else {
            b.b(obj, str, objArr);
        }
    }

    public static void c(Object obj, String str, Object... objArr) {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "96dee394c68f9fe4c4cfd0ddad249f01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "96dee394c68f9fe4c4cfd0ddad249f01");
        } else {
            b.c(obj, str, objArr);
        }
    }

    public static void d(Object obj, String str, Object... objArr) {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "186f1413f794ac8998744871571fe7ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "186f1413f794ac8998744871571fe7ae");
        } else {
            b.d(obj, str, objArr);
        }
    }

    public static void a(Object obj, Throwable th) {
        Object[] objArr = {obj, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cea684d533c7a46e465abda2402ee98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cea684d533c7a46e465abda2402ee98");
        } else {
            b.a(obj, th);
        }
    }

    public static void a(Object obj, Throwable th, String str, Object... objArr) {
        Object[] objArr2 = {obj, th, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "23164f82f0de52fa26b818cd8bacd196", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "23164f82f0de52fa26b818cd8bacd196");
        } else {
            b.a(obj, th, str, objArr);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e63ab45eddc9ef36ea19f8900ac3c24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e63ab45eddc9ef36ea19f8900ac3c24");
        } else {
            b.a(str, (Date) null);
        }
    }

    public static void a(String str, Date date) {
        Object[] objArr = {str, date};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "373ff7850dd96b4bfd66cfa8015a20b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "373ff7850dd96b4bfd66cfa8015a20b2");
        } else {
            b.a(str, date);
        }
    }

    public static String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8a403f43d15eac72c69d353cad9cc0b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8a403f43d15eac72c69d353cad9cc0b");
        }
        return String.format("%s :: %s : ", str, str2) + str3;
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2bd6e7b22805815ed4fcf25212596c0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2bd6e7b22805815ed4fcf25212596c0");
        }
        d dVar = b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        return PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "79ff325e448a8286c83077e7326299ff", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "79ff325e448a8286c83077e7326299ff") : d.b.format(Long.valueOf(System.currentTimeMillis()));
    }
}
