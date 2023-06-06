package com.meituan.android.mrn.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile a c;
    public final List<InterfaceC0294a> b;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0294a {
        void a();

        void b();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25cb65dc9563c6da6bf34e3cdeb65b77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25cb65dc9563c6da6bf34e3cdeb65b77");
        } else {
            this.b = new CopyOnWriteArrayList();
        }
    }

    public static synchronized a a() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "318a86628150270282d2925666801964", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "318a86628150270282d2925666801964");
            }
            if (c == null) {
                c = new a();
            }
            return c;
        }
    }

    public final void a(InterfaceC0294a interfaceC0294a) {
        Object[] objArr = {interfaceC0294a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af577789fb2f2ab63eaf6fc59e77779a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af577789fb2f2ab63eaf6fc59e77779a");
        } else if (interfaceC0294a == null) {
        } else {
            synchronized (this.b) {
                if (!this.b.contains(interfaceC0294a)) {
                    this.b.add(interfaceC0294a);
                }
            }
        }
    }

    public final void b(InterfaceC0294a interfaceC0294a) {
        Object[] objArr = {interfaceC0294a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d16873837a5d0e011108b0f154abb442", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d16873837a5d0e011108b0f154abb442");
        } else if (interfaceC0294a == null) {
        } else {
            synchronized (this.b) {
                this.b.remove(interfaceC0294a);
            }
        }
    }
}
