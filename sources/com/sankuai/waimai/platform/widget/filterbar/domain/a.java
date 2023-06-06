package com.sankuai.waimai.platform.widget.filterbar.domain;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.c;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.g;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a b;
    private final List<WeakReference<InterfaceC1085a>> c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.filterbar.domain.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1085a {
        void a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0121108c1f54ce975efb2edc013d3b23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0121108c1f54ce975efb2edc013d3b23");
        } else {
            this.c = new CopyOnWriteArrayList();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a84345077831782e8bae8fb99cf91d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a84345077831782e8bae8fb99cf91d1");
        }
        if (b == null) {
            synchronized (InterfaceC1085a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final void a(InterfaceC1085a interfaceC1085a) {
        boolean z = true;
        Object[] objArr = {interfaceC1085a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4acde65f45d454e053373383246bd73a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4acde65f45d454e053373383246bd73a");
            return;
        }
        synchronized (this.c) {
            Iterator<WeakReference<InterfaceC1085a>> it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                WeakReference<InterfaceC1085a> next = it.next();
                if (next == null) {
                    this.c.remove(next);
                } else {
                    InterfaceC1085a interfaceC1085a2 = next.get();
                    if (interfaceC1085a2 == null) {
                        this.c.remove(next);
                    } else if (interfaceC1085a2 == interfaceC1085a) {
                        break;
                    }
                }
            }
            if (!z) {
                this.c.add(new WeakReference<>(interfaceC1085a));
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb73311e4566019b696f2910ebab03ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb73311e4566019b696f2910ebab03ff");
            return;
        }
        g.a aVar = new g.a(this.c);
        c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<g, R>) new g(), (g) aVar, (c.InterfaceC1084c) new c.InterfaceC1084c<g.b<InterfaceC1085a>>() { // from class: com.sankuai.waimai.platform.widget.filterbar.domain.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(g.b<InterfaceC1085a> bVar) {
                g.b<InterfaceC1085a> bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41dc394340ebc641555f7e984c23a9cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41dc394340ebc641555f7e984c23a9cf");
                    return;
                }
                InterfaceC1085a interfaceC1085a = bVar2.b;
                if (interfaceC1085a != null) {
                    interfaceC1085a.a();
                }
            }
        });
    }
}
