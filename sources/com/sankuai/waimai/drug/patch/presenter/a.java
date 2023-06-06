package com.sankuai.waimai.drug.patch.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.model.d;
import com.sankuai.waimai.drug.patch.contract.b;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.manager.order.b;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends b.a {
    public static ChangeQuickRedirect c;
    @NonNull
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a d;
    private double e;
    private int f;

    public a(b.InterfaceC0944b interfaceC0944b, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(interfaceC0944b);
        Object[] objArr = {interfaceC0944b, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f65b44090798674d6edff9305cee9f66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f65b44090798674d6edff9305cee9f66");
        } else {
            this.d = aVar;
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.b.a
    public final void a(double d, int i, @Nullable GoodsSpu goodsSpu, @Nullable GoodsSku goodsSku, int i2) {
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a aVar;
        Object[] objArr = {Double.valueOf(d), Integer.valueOf(i), goodsSpu, goodsSku, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f6bf0df77ef5f380ec489fd2ee5a0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f6bf0df77ef5f380ec489fd2ee5a0cf");
        } else if (this.d.c()) {
            ArrayList arrayList = new ArrayList();
            if (goodsSpu == null) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(this.d.d());
                if (k != null) {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a(arrayList, k.b, 0, (List<b.a>) null);
                    com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a(arrayList, k.c, 1, (List<b.a>) null);
                }
            } else if (goodsSpu != null && goodsSku != null) {
                Object[] objArr2 = {goodsSpu, goodsSku, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c065bbfccaa68462662158c8e382db22", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c065bbfccaa68462662158c8e382db22");
                } else {
                    aVar = new com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a();
                    aVar.a(goodsSpu.getId());
                    GoodsSku sku = goodsSku == null ? goodsSpu.getSku() : goodsSku;
                    aVar.b(sku.getSkuId());
                    aVar.b = goodsSpu.getName();
                    aVar.a(sku.getOriginPrice());
                    aVar.c = i2;
                    aVar.d = sku.getSpec();
                    aVar.e = 0;
                    aVar.k = goodsSpu.getFirstGoodAttr();
                }
                arrayList.add(aVar);
            }
            com.sankuai.waimai.store.platform.domain.core.shopcart.b k2 = com.sankuai.waimai.store.order.a.e().k(this.d.d());
            double f = k2 != null ? k2.f() : 0.0d;
            Object[] objArr3 = {Double.valueOf(d), Integer.valueOf(i), arrayList, Double.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "581b29d5ab408710537b2fe0d11f2c0b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "581b29d5ab408710537b2fe0d11f2c0b");
            } else if (this.d.c()) {
                double d2 = this.d.b.shippingFee;
                double s = this.d.s();
                this.e = d;
                this.f = i;
                com.sankuai.waimai.store.drug.base.net.b.a(this.b.e()).a(this.d.g(), this.d.h(), d, i, d2, s, i.a(arrayList), this.d.b.cartExtendInfo, f, new k<d>() { // from class: com.sankuai.waimai.drug.patch.presenter.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(Object obj) {
                        d dVar = (d) obj;
                        Object[] objArr4 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "26a96074c7d5a6a2b092a444fe338f6b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "26a96074c7d5a6a2b092a444fe338f6b");
                        } else {
                            a.this.b.a(dVar);
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e6041ac7b4a22cd42c11f9548e60211", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e6041ac7b4a22cd42c11f9548e60211");
                            return;
                        }
                        super.a();
                        a.this.b.f();
                    }

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                        Object[] objArr4 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5c56463a66569c92074e979dfcc9cde2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5c56463a66569c92074e979dfcc9cde2");
                            return;
                        }
                        super.a(bVar);
                        if (bVar != null) {
                            a.this.b.a(bVar.getMessage(), bVar.c);
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.b.a
    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku, int i) {
        Object[] objArr = {goodsSpu, goodsSku, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b223443bc2f3abc18f671739bad1c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b223443bc2f3abc18f671739bad1c5c");
        } else {
            a(this.e, this.f, goodsSpu, goodsSku, 0);
        }
    }

    @Override // com.sankuai.waimai.drug.patch.contract.b.a
    @NonNull
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a a() {
        return this.d;
    }
}
