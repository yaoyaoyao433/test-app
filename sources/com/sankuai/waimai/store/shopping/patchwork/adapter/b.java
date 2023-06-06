package com.sankuai.waimai.store.shopping.patchwork.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.shopping.patchwork.adapter.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<T extends c> extends com.sankuai.waimai.store.widgets.recycler.a<T> {
    public static ChangeQuickRedirect a;
    @NonNull
    protected final com.sankuai.waimai.store.expose.a<Integer> b;
    @NonNull
    protected final f c;
    public final List<com.sankuai.waimai.store.shopping.patchwork.model.c> d;

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        return 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final /* synthetic */ void a(com.sankuai.waimai.store.widgets.recycler.e eVar, int i) {
        c cVar = (c) eVar;
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbaa85eb49b5ed21a3b7c192528ef9f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbaa85eb49b5ed21a3b7c192528ef9f3");
        } else if (cVar != null) {
            cVar.a((com.sankuai.waimai.store.shopping.patchwork.model.c) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d, i), i);
        }
    }

    public b(@NonNull f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24bf314abd0a6ac5c3132676855a0ed3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24bf314abd0a6ac5c3132676855a0ed3");
            return;
        }
        this.d = new ArrayList();
        this.c = fVar;
        this.b = new com.sankuai.waimai.store.expose.a<Integer>() { // from class: com.sankuai.waimai.store.shopping.patchwork.adapter.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.a
            public final /* synthetic */ boolean a(View view, Integer num) {
                com.sankuai.waimai.store.shopping.patchwork.model.c b;
                Integer num2 = num;
                Object[] objArr2 = {view, num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e54693bf3061c99923acc24eec2f9b1e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e54693bf3061c99923acc24eec2f9b1e")).booleanValue();
                }
                if (view != null && num2 != null && (b = b.this.b(num2.intValue())) != null) {
                    String g = b.this.c.g();
                    long i = b.this.c.i();
                    String str = b.a;
                    Object[] objArr3 = {g, new Long(i), num2, str};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.shopping.patchwork.buried.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "80bdca687f533554efbc3f081c04eaa5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "80bdca687f533554efbc3f081c04eaa5");
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.b(g, "b_waimai_g096fycd_mv").a("poi_id", Long.valueOf(i)).a("index", num2).a("price_segment", str).a();
                    }
                }
                return true;
            }
        };
        a(new com.sankuai.waimai.store.widgets.recycler.c() { // from class: com.sankuai.waimai.store.shopping.patchwork.adapter.b.2
            public static ChangeQuickRedirect a;

            private void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "666dbaacb9ce8b9f7dab5b41331681ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "666dbaacb9ce8b9f7dab5b41331681ba");
                    return;
                }
                for (com.sankuai.waimai.store.shopping.patchwork.model.c cVar : b.this.d) {
                    if (cVar != null && cVar.b) {
                        cVar.b = false;
                        cVar.d = b.this.c.h();
                        return;
                    }
                }
            }

            @Override // com.sankuai.waimai.store.widgets.recycler.c
            public final void a(com.sankuai.waimai.store.widgets.recycler.a aVar, com.sankuai.waimai.store.widgets.recycler.e eVar, int i, int i2, int i3) {
                Object[] objArr2 = {aVar, eVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28e9e195ed07572b690c22ab68a0623c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28e9e195ed07572b690c22ab68a0623c");
                    return;
                }
                com.sankuai.waimai.store.shopping.patchwork.model.c b = b.this.b(i);
                if (b == null || b.b) {
                    return;
                }
                a();
                b.b = true;
                b.this.m();
                b.this.c.a(b, i);
            }
        });
    }

    public final com.sankuai.waimai.store.shopping.patchwork.model.c b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45144c55e8e9d5bd827b2fbd8b3bc4c6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.shopping.patchwork.model.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45144c55e8e9d5bd827b2fbd8b3bc4c6") : (com.sankuai.waimai.store.shopping.patchwork.model.c) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d, i);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4539dec20b1569259fc5ce3ed4745d14", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4539dec20b1569259fc5ce3ed4745d14")).intValue() : this.d.size();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e232be3900757ffd0099b740dae08d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e232be3900757ffd0099b740dae08d");
        } else {
            this.b.a();
        }
    }
}
