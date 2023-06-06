package com.meituan.banma.jarvis;

import android.app.Application;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public com.meituan.banma.jarvis.a b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0926e7d9c6568f500b90d6f6811040ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0926e7d9c6568f500b90d6f6811040ee");
        } else {
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        private static final c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c2e914484530e4f2190553c4d5e061c", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c2e914484530e4f2190553c4d5e061c") : a.a;
    }

    private void a(@NonNull com.meituan.banma.jarvis.env.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea4675a5761e99ba059b81b179560c56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea4675a5761e99ba059b81b179560c56");
        } else {
            com.meituan.banma.jarvis.env.c.a().b = aVar;
        }
    }

    public final void a(com.meituan.banma.jarvis.env.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95636fe2620128415d0f10737959f315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95636fe2620128415d0f10737959f315");
        } else {
            com.meituan.banma.jarvis.env.c.a().c = bVar;
        }
    }

    public final void a(com.meituan.banma.jarvis.env.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24a0fa87c4c366fe896a6e91d2072888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24a0fa87c4c366fe896a6e91d2072888");
        } else {
            com.meituan.banma.jarvis.env.c.a().a(dVar);
        }
    }

    public final void a(@NonNull Application application, @NonNull com.meituan.banma.jarvis.env.a aVar, com.meituan.banma.jarvis.a aVar2) {
        Object[] objArr = {application, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db4c0026435fcd92a1d6294a78786e60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db4c0026435fcd92a1d6294a78786e60");
            return;
        }
        com.meituan.banma.jarvis.utils.a.a(application);
        a(aVar);
        this.b = aVar2;
        d();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96218e5ab3a9d270d95724a1fcdbe310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96218e5ab3a9d270d95724a1fcdbe310");
        } else {
            d.b();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5ad1710093bf9229449ef44ea89339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5ad1710093bf9229449ef44ea89339");
        } else {
            d.a();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f47fa85bcbcaf6834fa1dfc4c337b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f47fa85bcbcaf6834fa1dfc4c337b1");
        } else {
            d.c();
        }
    }

    public final void a(a.InterfaceC0637a interfaceC0637a) {
        Object[] objArr = {interfaceC0637a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7156a229bc18e8de6b3fbf1b0a1a4bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7156a229bc18e8de6b3fbf1b0a1a4bc3");
        } else {
            com.meituan.banma.jarvis.env.c.a().e = interfaceC0637a;
        }
    }
}
