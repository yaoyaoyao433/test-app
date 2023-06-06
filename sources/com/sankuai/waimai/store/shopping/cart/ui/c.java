package com.sankuai.waimai.store.shopping.cart.ui;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartApiModel;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.util.i;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect e;
    protected com.sankuai.waimai.store.order.a f;
    public com.sankuai.waimai.store.shopping.cart.contract.a g;
    protected Activity h;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a i;
    public SCPageConfig j;
    protected String k;
    protected GoodDetailResponse l;

    public abstract void a();

    public abstract void a(d.a aVar);

    public void a(boolean z) {
    }

    public c(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodDetailResponse goodDetailResponse) {
        super(aVar.i());
        Object[] objArr = {activity, aVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0388cb4b881ddbfef8bcba50c0a8dca9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0388cb4b881ddbfef8bcba50c0a8dca9");
            return;
        }
        this.f = com.sankuai.waimai.store.order.a.e();
        this.g = aVar;
        this.h = activity;
        this.i = this.g.g();
        this.j = this.g.h();
        this.k = this.g.l();
        this.l = goodDetailResponse;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72be1e4e2978514c094f6974f7eb55d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72be1e4e2978514c094f6974f7eb55d6");
        } else {
            com.sankuai.waimai.store.shopping.cart.pre.d.a((Activity) this.mContext, this.i, this.j).a(new com.sankuai.waimai.store.shopping.cart.pre.c() { // from class: com.sankuai.waimai.store.shopping.cart.ui.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.shopping.cart.pre.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b759f2100a1d38f685daf927ca771411", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b759f2100a1d38f685daf927ca771411");
                    } else {
                        c.this.j();
                    }
                }
            });
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70b89013d551d31b0ee65ea5b045d57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70b89013d551d31b0ee65ea5b045d57");
        } else if (this.f.i(this.i.d())) {
            new com.sankuai.waimai.store.shopping.cart.c(this.h, this.i, this.j, this.k).a(new c.a() { // from class: com.sankuai.waimai.store.shopping.cart.ui.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.shopping.cart.c.a
                public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
                    Object[] objArr2 = {jSONObject, jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a09e34ad9503c0e74fbecf9eb6fe67a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a09e34ad9503c0e74fbecf9eb6fe67a2");
                        return;
                    }
                    c cVar = c.this;
                    Object[] objArr3 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = c.e;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "4b966c92c41177fe0a795e400666aa04", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "4b966c92c41177fe0a795e400666aa04");
                    } else {
                        com.sankuai.waimai.store.shopping.cart.d.a().a("order_business_channel", jSONObject);
                    }
                    com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(c.this.i.d());
                    if (k != null) {
                        ShopCartApiModel d = k.d();
                        try {
                            List<OrderedFood> p = com.sankuai.waimai.store.order.a.e().p(c.this.i.d());
                            OrderedFood orderedFood = com.sankuai.shangou.stone.util.a.a((List) p) == 1 ? (OrderedFood) com.sankuai.shangou.stone.util.a.a((List<Object>) p, 0) : null;
                            if (orderedFood != null && orderedFood.sku != null && orderedFood.sku.installment != null) {
                                jSONObject2.put("store_installment", i.a(orderedFood.sku.installment));
                            }
                            jSONObject2.put("drug_extra", d.drugExtra);
                            if (!p.a(c.this.j) && !t.a(c.this.j.h)) {
                                jSONObject.put("i_input_param", new JSONObject(c.this.j.h));
                            }
                            if (c.this.l != null && c.this.l.mFoodSpu != null && !t.a(c.this.l.mFoodSpu.orderParam)) {
                                jSONObject.put("i_input_param", new JSONObject(c.this.l.mFoodSpu.orderParam));
                            }
                            if (t.a(c.this.i.b.orderPreviewExtend)) {
                                return;
                            }
                            try {
                                JSONObject jSONObject3 = new JSONObject(c.this.i.b.orderPreviewExtend);
                                Iterator<String> keys = jSONObject3.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    jSONObject.put(next, jSONObject3.opt(next));
                                }
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }

                @Override // com.sankuai.waimai.store.shopping.cart.c.a
                public final void a(d.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ff5799b27b437394ec33754c049d991", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ff5799b27b437394ec33754c049d991");
                        return;
                    }
                    c.this.a(aVar);
                    com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(c.this.i.d());
                    if (k == null || k.u == null || !c.this.i.t()) {
                        return;
                    }
                    aVar.l = k.u.recommendCouponInfo;
                }
            });
        }
    }
}
