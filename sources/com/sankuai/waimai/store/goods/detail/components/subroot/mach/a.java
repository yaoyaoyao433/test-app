package com.sankuai.waimai.store.goods.detail.components.subroot.mach;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.recycler.h;
import com.sankuai.waimai.store.goods.detail.components.subroot.mach.d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;
    protected Map<String, Object> b;
    protected BaseActivity c;
    protected Mach d;
    @NonNull
    protected com.sankuai.waimai.mach.recycler.b e;
    protected List<com.sankuai.waimai.mach.container.d> f;
    private final String g;
    private String h;
    private String i;
    private Mach.d j;
    private g k;

    public abstract String a(T t);

    public abstract void a(T t, com.sankuai.waimai.mach.recycler.c cVar);

    public abstract void a(@NonNull String str, @Nullable Map<String, Object> map);

    public abstract Map<String, Object> b(T t);

    @NonNull
    public abstract Mach.a c();

    public a(@NonNull BaseActivity baseActivity, String str, String str2, String str3, Map<String, Object> map, @NonNull com.sankuai.waimai.mach.recycler.b bVar) {
        Object[] objArr = {baseActivity, str, str2, str3, map, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06024cb4c731de3380506d5f5463102e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06024cb4c731de3380506d5f5463102e");
            return;
        }
        this.f = new CopyOnWriteArrayList();
        this.j = new Mach.d() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.mach.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.Mach.d
            public final void a(@NonNull String str4, @Nullable Map<String, Object> map2) {
                Object[] objArr2 = {str4, map2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01ea2369c09f2da53f85cc2859bea1ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01ea2369c09f2da53f85cc2859bea1ee");
                    return;
                }
                com.sankuai.waimai.mach.log.b.a("MachJS", "js receive event eventName:" + str4, "params:" + com.sankuai.waimai.mach.log.b.a(map2));
                a.this.a(str4, map2);
            }
        };
        this.k = new g() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.mach.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.g
            public final void a(String str4, String str5) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(Throwable th) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(com.sankuai.waimai.mach.node.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2df5bd6264207aa2cc54f900e5d938ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2df5bd6264207aa2cc54f900e5d938ba");
                    return;
                }
                for (com.sankuai.waimai.mach.container.d dVar : a.this.f) {
                    if (dVar != null) {
                        dVar.a(aVar);
                    }
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "498b4a494c5888fbaad110b1581a4a8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "498b4a494c5888fbaad110b1581a4a8e");
                    return;
                }
                for (com.sankuai.waimai.mach.container.d dVar : a.this.f) {
                    if (dVar != null) {
                        dVar.e();
                    }
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1421421c2b9e06b142f77dce04698ef4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1421421c2b9e06b142f77dce04698ef4");
                    return;
                }
                for (com.sankuai.waimai.mach.container.d dVar : a.this.f) {
                    if (dVar != null) {
                        dVar.d();
                    }
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7315a28ddae9793e0826e75a49dffaf4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7315a28ddae9793e0826e75a49dffaf4");
                    return;
                }
                for (com.sankuai.waimai.mach.container.d dVar : a.this.f) {
                    if (dVar != null) {
                        dVar.a(i);
                    }
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i, Throwable th) {
                Object[] objArr2 = {Integer.valueOf(i), th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72cdf6ec2164a623eae34b48886df324", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72cdf6ec2164a623eae34b48886df324");
                    return;
                }
                for (com.sankuai.waimai.mach.container.d dVar : a.this.f) {
                    if (dVar != null) {
                        dVar.a();
                    }
                }
            }
        };
        this.c = baseActivity;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.b = map;
        this.e = bVar;
    }

    public final com.sankuai.waimai.mach.recycler.b b() {
        return this.e;
    }

    public final void a(com.sankuai.waimai.mach.container.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ec68a83353a59be73de1e28b81d130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ec68a83353a59be73de1e28b81d130");
        } else if (this.f.contains(dVar)) {
        } else {
            this.f.add(dVar);
        }
    }

    @Nullable
    public final com.sankuai.waimai.mach.recycler.c a(T t, String str, int i, d.a aVar) {
        Object[] objArr = {t, str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e61daeb408b7a47810d8bf235599d18", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e61daeb408b7a47810d8bf235599d18");
        }
        Map<String, Object> b = b(t);
        String a2 = a((a<T>) t);
        if (TextUtils.isEmpty(a2) || b == null || b.size() == 0) {
            aVar.b();
            return null;
        }
        h a3 = this.e.a(a2, a2, str, 3000);
        if (a3 != null) {
            if (this.c.isDestroyed()) {
                aVar.b();
                return null;
            }
            com.sankuai.waimai.mach.recycler.c cVar = new com.sankuai.waimai.mach.recycler.c(a2, a3, c(), str, this.g);
            this.d = cVar.k();
            if (this.d != null) {
                this.d.registerJsEventCallback(this.j);
                this.d.addRenderListener(this.k);
            }
            this.e.a(this.c, cVar, i, 0, b, str);
            if (cVar.b() == null) {
                aVar.b();
                return null;
            }
            a((a<T>) t, cVar);
            aVar.a();
            return cVar;
        }
        aVar.b();
        return null;
    }

    public final Mach d() {
        return this.d;
    }
}
