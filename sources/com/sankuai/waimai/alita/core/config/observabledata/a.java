package com.sankuai.waimai.alita.core.config.observabledata;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;
    protected T b;
    private CopyOnWriteArrayList<InterfaceC0700a> c;
    private CopyOnWriteArrayList<WeakReference<InterfaceC0700a>> d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.config.observabledata.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0700a<U> {
        void update(U u, U u2);
    }

    public T a(T t) {
        return t;
    }

    public abstract boolean a(T t, T t2);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e7b9f62c06525ac5de24febf24d9a7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e7b9f62c06525ac5de24febf24d9a7c");
            return;
        }
        this.c = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
    }

    @Nullable
    public final T a() {
        return this.b;
    }

    public synchronized void b(@Nullable T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cf80616a1445246183e4350403d9ce7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cf80616a1445246183e4350403d9ce7");
            return;
        }
        if (!a(this.b, t)) {
            T a2 = a((a<T>) this.b);
            b(t, a2);
            c(t, a2);
        }
        this.b = t;
    }

    public final synchronized void a(@NonNull InterfaceC0700a interfaceC0700a) {
        Object[] objArr = {interfaceC0700a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd69be5330aba7657a2100e6767d739b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd69be5330aba7657a2100e6767d739b");
            return;
        }
        if (interfaceC0700a != null && !this.c.contains(interfaceC0700a)) {
            this.c.add(interfaceC0700a);
        }
    }

    public final synchronized void b(@NonNull InterfaceC0700a interfaceC0700a) {
        Object[] objArr = {interfaceC0700a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b0897a54f51a11b7287d3405054f12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b0897a54f51a11b7287d3405054f12");
            return;
        }
        a(interfaceC0700a);
        interfaceC0700a.update(this.b, null);
    }

    public final synchronized void c(@NonNull InterfaceC0700a interfaceC0700a) {
        boolean z = true;
        Object[] objArr = {interfaceC0700a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38753ca5479a9f95ab5804d0852e55a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38753ca5479a9f95ab5804d0852e55a4");
            return;
        }
        Iterator<WeakReference<InterfaceC0700a>> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (interfaceC0700a == it.next().get()) {
                break;
            }
        }
        if (!z) {
            this.d.add(new WeakReference<>(interfaceC0700a));
        }
    }

    public final synchronized void b(T t, T t2) {
        Object[] objArr = {t, t2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f2938849f7fad0fe3d69e72154d3649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f2938849f7fad0fe3d69e72154d3649");
            return;
        }
        Iterator<InterfaceC0700a> it = this.c.iterator();
        while (it.hasNext()) {
            InterfaceC0700a next = it.next();
            if (next != null) {
                next.update(t, t2);
            }
        }
    }

    public final synchronized void c(T t, T t2) {
        InterfaceC0700a interfaceC0700a;
        Object[] objArr = {t, t2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb90ee7b2d851bdf121af955852bb371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb90ee7b2d851bdf121af955852bb371");
            return;
        }
        Iterator<WeakReference<InterfaceC0700a>> it = this.d.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0700a> next = it.next();
            if (next != null && (interfaceC0700a = next.get()) != null) {
                interfaceC0700a.update(t, t2);
            }
        }
    }

    private synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dea33ba4b586ffcc5c5c8c77907598f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dea33ba4b586ffcc5c5c8c77907598f");
        } else {
            this.c.clear();
        }
    }

    private synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c74ba4046c1a789d42e119884bcd063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c74ba4046c1a789d42e119884bcd063");
        } else {
            this.d.clear();
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ee66aea485af1716f4544a2540017e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ee66aea485af1716f4544a2540017e");
            return;
        }
        c();
        d();
    }
}
