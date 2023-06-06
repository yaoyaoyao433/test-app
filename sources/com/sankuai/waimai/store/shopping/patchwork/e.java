package com.sankuai.waimai.store.shopping.patchwork;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.shopping.patchwork.d;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends d.a {
    public static ChangeQuickRedirect c;
    @NonNull
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a d;
    private double e;
    private int f;

    public e(d.b bVar, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(bVar);
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa77a193ca92f06826b40c823fed298f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa77a193ca92f06826b40c823fed298f");
        } else {
            this.d = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.a
    public final void a(double d, int i) {
        Object[] objArr = {Double.valueOf(d), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ef7091f473d1e9a876373ccc67ead7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ef7091f473d1e9a876373ccc67ead7");
        } else if (i.a(Double.valueOf(this.e), Double.valueOf(d)) && i == this.f && this.b.e()) {
        } else {
            this.e = d;
            this.f = i;
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.b()).a(this.d.f(), d, i, new k<com.sankuai.waimai.store.shopping.patchwork.model.b>() { // from class: com.sankuai.waimai.store.shopping.patchwork.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    com.sankuai.waimai.store.shopping.patchwork.model.b bVar = (com.sankuai.waimai.store.shopping.patchwork.model.b) obj;
                    int i2 = 0;
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59ae65c66abf87f838303a0b13a615c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59ae65c66abf87f838303a0b13a615c3");
                        return;
                    }
                    e.this.b.d();
                    e.this.b.b(bVar.a != null ? bVar.a.a : "");
                    List<com.sankuai.waimai.store.shopping.patchwork.model.c> list = bVar.b;
                    Object[] objArr3 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b48957c8c6b06c7720252e2ee694dba", RobustBitConfig.DEFAULT_VALUE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b48957c8c6b06c7720252e2ee694dba")).intValue();
                    } else if (com.sankuai.shangou.stone.util.a.b(list)) {
                        i2 = -1;
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= list.size()) {
                                break;
                            }
                            com.sankuai.waimai.store.shopping.patchwork.model.c cVar = list.get(i3);
                            if (cVar != null && cVar.b) {
                                i2 = i3;
                                break;
                            }
                            i3++;
                        }
                    }
                    com.sankuai.waimai.store.shopping.patchwork.model.c cVar2 = (com.sankuai.waimai.store.shopping.patchwork.model.c) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.b, i2);
                    e.this.b.a(bVar.b, i2, cVar2 != null ? cVar2.c : null);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3cd0d9418bbc2594fbad5188e7943ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3cd0d9418bbc2594fbad5188e7943ee");
                        return;
                    }
                    super.a();
                    e.this.b.c();
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "427cc46ffbc09b511958b04307d214d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "427cc46ffbc09b511958b04307d214d9");
                        return;
                    }
                    super.a(bVar);
                    if (bVar != null) {
                        e.this.b.a(bVar.getMessage(), bVar.c);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0efc2c9a519cf88a9ed9b4986530a074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0efc2c9a519cf88a9ed9b4986530a074");
        } else {
            a(this.e, this.f);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.a
    @NonNull
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a b() {
        return this.d;
    }
}
