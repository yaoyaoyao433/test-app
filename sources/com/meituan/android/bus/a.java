package com.meituan.android.bus;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private final rx.subjects.e<Object, Object> c;
    private final CopyOnWriteArrayList<Object> d;
    private final CopyOnWriteArrayList<e> e;
    private final c f;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f8c04f0d6338ad14645b11bfcadffcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f8c04f0d6338ad14645b11bfcadffcc");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(new C0185a());
                }
            }
        }
        return b;
    }

    public static a a(C0185a c0185a) {
        Object[] objArr = {c0185a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f744c59429d4e08585399d933709cce7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f744c59429d4e08585399d933709cce7") : new a(c0185a);
    }

    private a(C0185a c0185a) {
        Object[] objArr = {c0185a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76079458a24b41063e632d6529614db3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76079458a24b41063e632d6529614db3");
            return;
        }
        this.c = new rx.subjects.d(rx.subjects.b.g());
        this.d = new CopyOnWriteArrayList<>();
        this.e = new CopyOnWriteArrayList<>();
        this.f = new c(c0185a.b, c0185a.c);
    }

    public final synchronized void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3f42b9ae6055dc51dbe0bff6121f26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3f42b9ae6055dc51dbe0bff6121f26e");
            return;
        }
        Class<?> cls = obj.getClass();
        if (this.d.contains(obj)) {
            throw new b("the instance of " + cls.getSimpleName() + " has been registered!");
        }
        this.d.add(obj);
        CopyOnWriteArrayList<d> a2 = this.f.a(cls);
        if (a2 == null || a2.size() == 0) {
            throw new b("the instance of " + cls.getSimpleName() + " has no methods use subscribe annotation!");
        }
        Iterator<d> it = a2.iterator();
        while (it.hasNext()) {
            d next = it.next();
            Object[] objArr2 = {obj, next};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91febf0a421299c467068023989dbd27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91febf0a421299c467068023989dbd27");
            } else {
                this.e.add(new e(obj, next, this.c.a((Class<Object>) next.c)));
            }
        }
    }

    public final synchronized void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b76508139752590d4302b2b2978f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b76508139752590d4302b2b2978f14");
            return;
        }
        this.d.remove(obj);
        int size = this.e.size();
        int i = 0;
        while (i < size) {
            e eVar = this.e.get(i);
            if (eVar.b == obj) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "585adaa51b620c0db15e6273724827c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "585adaa51b620c0db15e6273724827c8");
                } else {
                    eVar.d.unsubscribe();
                }
                this.e.remove(i);
                i--;
                size--;
            }
            i++;
        }
    }

    public final void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ece88cd929369fa202610b77abeead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ece88cd929369fa202610b77abeead");
        } else {
            this.c.onNext(obj);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.bus.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0185a {
        public static ChangeQuickRedirect a;
        public boolean b;
        public List<com.meituan.android.bus.annotation.a> c;

        public C0185a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "873d015a094ca463afa9b76bede6949e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "873d015a094ca463afa9b76bede6949e");
            } else {
                this.b = false;
            }
        }
    }
}
