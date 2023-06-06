package com.sankuai.waimai.platform.widget.filterbar.clean.usecase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static d c;
    final e b;

    public static /* synthetic */ void a(d dVar, Error error, c.InterfaceC1084c interfaceC1084c) {
        Object[] objArr = {error, interfaceC1084c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "9bc4c98c88d389d606d8e6abfbb981ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "9bc4c98c88d389d606d8e6abfbb981ab");
        } else {
            dVar.b.a(error, interfaceC1084c);
        }
    }

    private d(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1fcf4410113ae2849bd6d62cf50f153", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1fcf4410113ae2849bd6d62cf50f153");
        } else {
            this.b = eVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a<V extends c.b> implements c.InterfaceC1084c<V> {
        public static ChangeQuickRedirect a;
        private final c.InterfaceC1084c<V> c;
        private final d d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
        public final /* synthetic */ void a(Object obj) {
            c.b bVar = (c.b) obj;
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "293ebf6216f6a7fd39e941c65e2c6b4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "293ebf6216f6a7fd39e941c65e2c6b4f");
                return;
            }
            d dVar = this.d;
            c.InterfaceC1084c<V> interfaceC1084c = this.c;
            Object[] objArr2 = {bVar, interfaceC1084c};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "ab7e4e3194481fbc374bf88808fc17ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "ab7e4e3194481fbc374bf88808fc17ca");
            } else {
                dVar.b.a((e) bVar, (c.InterfaceC1084c<e>) interfaceC1084c);
            }
        }

        public a(c.InterfaceC1084c<V> interfaceC1084c, d dVar) {
            Object[] objArr = {d.this, interfaceC1084c, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf31110276114af5e6e30d8efb88f36", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf31110276114af5e6e30d8efb88f36");
                return;
            }
            this.c = interfaceC1084c;
            this.d = dVar;
        }

        @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
        public final void a(Error error) {
            Object[] objArr = {error};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "867e0800bb97646e81ed1a6021827be9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "867e0800bb97646e81ed1a6021827be9");
            } else {
                d.a(this.d, error, this.c);
            }
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f2990157da988ce8739ca2b84989d2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f2990157da988ce8739ca2b84989d2b");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d(new f());
                }
            }
        }
        return c;
    }

    public final <T extends c.a, R extends c.b> void a(final c<T, R> cVar, T t, c.InterfaceC1084c<R> interfaceC1084c) {
        Object[] objArr = {cVar, t, interfaceC1084c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "987dc097380ef0549aca34199edb8c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "987dc097380ef0549aca34199edb8c54");
            return;
        }
        cVar.b = t;
        cVar.c = new a(interfaceC1084c, this);
        this.b.a(new Runnable() { // from class: com.sankuai.waimai.platform.widget.filterbar.clean.usecase.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e048d9089aab3e6e215ae85e32065ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e048d9089aab3e6e215ae85e32065ee");
                    return;
                }
                c cVar2 = cVar;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "da256cf48c08bc9de13b4fe2144ed646", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "da256cf48c08bc9de13b4fe2144ed646");
                } else {
                    cVar2.a(cVar2.b);
                }
            }
        });
    }
}
