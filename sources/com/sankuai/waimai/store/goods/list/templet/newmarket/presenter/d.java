package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class d {
    public static ChangeQuickRedirect a;
    public final String b;

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83ec6a788a7b49cbc62feb72caa608fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83ec6a788a7b49cbc62feb72caa608fd");
        } else {
            this.b = str;
        }
    }

    public final void a(@NonNull g gVar, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.b bVar) {
        Object[] objArr = {gVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a71cc6cf0199c845d30391e4f33c0c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a71cc6cf0199c845d30391e4f33c0c1");
            return;
        }
        GoodsPoiCategory a2 = gVar.a();
        a.C1295a c1295a = new a.C1295a();
        c1295a.c = 0;
        c1295a.e = a2.tag;
        c1295a.a = String.valueOf(gVar.f);
        c1295a.b = gVar.g;
        c1295a.g = a2.type;
        c1295a.h = gVar.b();
        c1295a.l = gVar.o;
        c1295a.i = gVar.h;
        c1295a.o = gVar.m;
        c1295a.m = a2.extra;
        c1295a.n = gVar.r;
        c1295a.p = gVar.q;
        com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b).a(c1295a, new a(gVar, bVar, true));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements j<SpuProductsResponse> {
        public static ChangeQuickRedirect a;
        @NonNull
        private final com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.b c;
        @NonNull
        private final g d;
        private final boolean e;

        @Override // com.sankuai.waimai.store.base.net.j
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "065bd44f7f7f8d8e515a7764e1f70cba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "065bd44f7f7f8d8e515a7764e1f70cba");
            }
        }

        @Override // com.sankuai.waimai.store.base.net.j
        public final void b() {
        }

        @Override // com.sankuai.waimai.store.base.net.j
        public final /* synthetic */ void a(SpuProductsResponse spuProductsResponse) {
            SpuProductsResponse spuProductsResponse2 = spuProductsResponse;
            Object[] objArr = {spuProductsResponse2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c17dc30727b79c328f41fe6b65819c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c17dc30727b79c328f41fe6b65819c2");
                return;
            }
            if (this.e) {
                GoodsPoiCategory a2 = this.d.a();
                Object[] objArr2 = {spuProductsResponse2, a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a25d122d865ebc586ca921eeec0fbe42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a25d122d865ebc586ca921eeec0fbe42");
                } else if (!com.sankuai.shangou.stone.util.a.b(spuProductsResponse2.productSpuList) && a2 != null) {
                    a2.spuIds = spuProductsResponse2.spuIds;
                    a2.saleOutSpuIds = spuProductsResponse2.saleOutSpuIds;
                    a2.saleOutRemind = spuProductsResponse2.saleOutRemind;
                    a2.sortList = spuProductsResponse2.sortList;
                    a2.traceId = spuProductsResponse2.traceId;
                    if (spuProductsResponse2.brandUpdate) {
                        a2.brandInfo = spuProductsResponse2.brandInfo;
                    }
                    String str = a2.tag;
                    for (int size = spuProductsResponse2.productSpuList.size() - 1; size >= 0; size--) {
                        GoodsSpu goodsSpu = spuProductsResponse2.productSpuList.get(size);
                        if (goodsSpu != null) {
                            goodsSpu.setTag(str);
                            if (com.sankuai.shangou.stone.util.a.b(goodsSpu.skus)) {
                                spuProductsResponse2.productSpuList.remove(size);
                            }
                        }
                    }
                }
            }
            if (com.sankuai.shangou.stone.util.a.b(spuProductsResponse2.productSpuList)) {
                a(new com.sankuai.waimai.store.repository.net.b(-1, com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_no_more_goods)));
            } else {
                this.c.a(this.d, spuProductsResponse2);
            }
        }

        public a(@NonNull g gVar, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.b bVar, boolean z) {
            Object[] objArr = {d.this, gVar, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1610630a5e19e92076bda67c40ec8615", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1610630a5e19e92076bda67c40ec8615");
                return;
            }
            this.c = bVar;
            this.d = gVar;
            this.e = z;
        }

        @Override // com.sankuai.waimai.store.base.net.j
        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d6f5a3c1abd60072dec83b3dd080d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d6f5a3c1abd60072dec83b3dd080d4");
            } else {
                this.c.a(this.d, bVar);
            }
        }
    }
}
