package com.dianping.nvlbservice;

import android.support.annotation.NonNull;
import com.dianping.nvlbservice.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b implements f {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private static volatile g d;
    private f c;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b6fba4a133b0165d4f84bbeb3450688", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b6fba4a133b0165d4f84bbeb3450688");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2018522e91ae24d03bb9691b86c99bb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2018522e91ae24d03bb9691b86c99bb7");
        } else {
            this.c = new j(m.a());
        }
    }

    public static f a(@NonNull m mVar, @NonNull d dVar) {
        Object[] objArr = {mVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccfec0344f317a5d6b122358d69e931b", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccfec0344f317a5d6b122358d69e931b") : new c(mVar, dVar);
    }

    @Override // com.dianping.nvlbservice.f
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5599ae28bcecab7455f2d4f3247af5ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5599ae28bcecab7455f2d4f3247af5ee");
        } else {
            this.c.a(j);
        }
    }

    @Override // com.dianping.nvlbservice.f
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d7634af4bb59352de8882344ade1eff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d7634af4bb59352de8882344ade1eff");
        } else {
            this.c.a(eVar);
        }
    }

    @Override // com.dianping.nvlbservice.f
    public final List<h> a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff78ac6b49d6fdddc0bbc264e38d5617", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff78ac6b49d6fdddc0bbc264e38d5617") : this.c.a(mVar);
    }

    @Override // com.dianping.nvlbservice.f
    public final void a(f.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea846c480645f73dd704e60002b7fbaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea846c480645f73dd704e60002b7fbaa");
        } else {
            this.c.a(aVar);
        }
    }

    public static void a(g gVar) {
        d = gVar;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c776a7e6606fe008a8375fc01b7f9eb5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c776a7e6606fe008a8375fc01b7f9eb5") : d != null ? d.a() : "";
    }
}
