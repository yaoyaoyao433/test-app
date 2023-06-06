package com.meituan.mmp.lib.api;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.engine.b;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.msi.h;
import com.meituan.mmp.lib.msi.o;
import com.meituan.mmp.main.x;
import com.meituan.msi.privacy.permission.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a = null;
    public static a l = null;
    private static int n = 3;
    public final com.meituan.mmp.lib.engine.m b;
    @Nullable
    public ab c;
    public com.meituan.mmp.lib.interfaces.c d;
    public com.meituan.mmp.lib.msi.o e;
    public n f;
    public List<k> g;
    public boolean h;
    public int i;
    public int j;
    public final o k;
    private com.meituan.mmp.lib.a m;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(@NonNull Activity activity, @NonNull String[] strArr, String str);
    }

    public h(com.meituan.mmp.lib.engine.m mVar, com.meituan.mmp.lib.interfaces.c cVar, b.a aVar) {
        h.b bVar;
        Object[] objArr = {mVar, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b8f8143b070cc0d4925f98a3892d4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b8f8143b070cc0d4925f98a3892d4b");
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = n;
        this.k = new o();
        this.b = mVar;
        this.d = cVar;
        this.g = new ArrayList(2);
        this.f = new n(this, mVar, cVar, aVar);
        this.g.add(this.f);
        if (mVar != null && mVar.h != null && (bVar = mVar.h.h) != null) {
            this.h = bVar.d();
        }
        this.e = new com.meituan.mmp.lib.msi.o(this.b, this);
        this.g.add(this.e);
        x.a(this.d);
    }

    public final void a(@NonNull com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b57b146d5c0a2262ebbe2b3614e66e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b57b146d5c0a2262ebbe2b3614e66e1");
            return;
        }
        this.c = aVar.y();
        this.m = aVar;
        if (this.g == null || this.g.size() <= 0) {
            return;
        }
        for (k kVar : this.g) {
            kVar.a(aVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f1391990b00b19e54dcfffb4059e38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f1391990b00b19e54dcfffb4059e38");
            return;
        }
        com.meituan.mmp.main.ab.a("ApisManager.onCreate");
        if (this.g != null && this.g.size() > 0) {
            for (k kVar : this.g) {
                kVar.a();
            }
        }
        com.meituan.mmp.main.ab.a();
    }

    public final void a(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c5f084dde29f495e656b7edab01ad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c5f084dde29f495e656b7edab01ad8");
        } else if (this.g != null && this.g.size() > 0) {
            for (k kVar : this.g) {
                kVar.a(configuration);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cb020a91f5fd6d44e5e0f3b0eaf7bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cb020a91f5fd6d44e5e0f3b0eaf7bf8");
            return;
        }
        x.b(this.d);
        this.m = null;
        if (this.g == null || this.g.size() <= 0) {
            return;
        }
        for (k kVar : this.g) {
            kVar.b();
        }
    }

    public final void b(com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0ee625851d2730d0bd581d562a664c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0ee625851d2730d0bd581d562a664c6");
        } else if (this.g != null && this.g.size() > 0) {
            for (k kVar : this.g) {
                kVar.b(aVar);
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2780a7b9e28f77730c887138d05d99da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2780a7b9e28f77730c887138d05d99da");
        } else if (this.g != null && this.g.size() > 0) {
            for (k kVar : this.g) {
                kVar.c();
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9ba2856375dddf43488618198259f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9ba2856375dddf43488618198259f3");
        } else if (this.g != null && this.g.size() > 0) {
            for (k kVar : this.g) {
                kVar.d();
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6773d5389e0c47422cdc5e5b72017a6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6773d5389e0c47422cdc5e5b72017a6a");
        } else if (this.e != null) {
            com.meituan.mmp.lib.msi.o oVar = this.e;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.msi.o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "8417369f6ad31ad9e257fd008bf96700", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "8417369f6ad31ad9e257fd008bf96700");
            } else if (oVar.c == null || oVar.c.b() == null) {
            } else {
                oVar.c.b().b(i);
            }
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6577680ea76398261f806dee8ba68ea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6577680ea76398261f806dee8ba68ea6");
        } else if (this.e != null) {
            com.meituan.mmp.lib.msi.o oVar = this.e;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.msi.o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "b72f7b2e32e62fa3e7f9d837b4b3055c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "b72f7b2e32e62fa3e7f9d837b4b3055c");
            } else if (oVar.c == null || oVar.c.b() == null) {
            } else {
                oVar.c.b().a(i);
            }
        }
    }

    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3d134154bb5e935b7a9c1bb1a20d18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3d134154bb5e935b7a9c1bb1a20d18");
        } else if (this.g != null && this.g.size() > 0) {
            for (k kVar : this.g) {
                kVar.a(i, i2, intent);
            }
        }
    }

    public final String a(Event event, com.meituan.mmp.lib.interfaces.a aVar) {
        Object[] objArr = {event, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c364964f3535e385267224a3847f081", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c364964f3535e385267224a3847f081");
        }
        if (this.f != null) {
            return this.f.a(event, aVar);
        }
        return null;
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a92b14cbd0eb43d8ba7b04fc2a13444", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a92b14cbd0eb43d8ba7b04fc2a13444");
        }
        if (this.e != null) {
            com.meituan.mmp.lib.msi.o oVar = this.e;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.msi.o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "e506925f1a2ea3605086524ccf566c1a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "e506925f1a2ea3605086524ccf566c1a");
            }
            com.meituan.mmp.lib.trace.b.b("MMPMsi", "msiSyncInvoke " + str);
            return oVar.c.a(oVar.a(str));
        }
        return null;
    }

    public final String a(String str, com.meituan.mmp.lib.interfaces.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f722fe7e62a0dd6e2f6d530262500603", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f722fe7e62a0dd6e2f6d530262500603");
        }
        if (this.e != null) {
            com.meituan.mmp.lib.msi.o oVar = this.e;
            Object[] objArr2 = {str, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.msi.o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "a10cf3e16fd3b376ddda6e203be320c3", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "a10cf3e16fd3b376ddda6e203be320c3");
            }
            com.meituan.mmp.lib.trace.b.b("MMPMsi", "msiAsyncInvoke " + str);
            oVar.c.a(oVar.a(str), new o.c(aVar));
            return null;
        }
        return null;
    }

    public final void a(@NonNull String[] strArr, String str, a.InterfaceC0498a interfaceC0498a) {
        Object[] objArr = {strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6554692bbd1649bb445498d7ac1c3885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6554692bbd1649bb445498d7ac1c3885");
        } else if (this.e == null || !this.h) {
        } else {
            this.e.a(strArr, str, interfaceC0498a);
        }
    }

    public final boolean e() {
        return this.f != null && this.h;
    }

    public static void c(int i) {
        n = 0;
    }
}
