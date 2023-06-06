package com.sankuai.waimai.store.shopping.cart.delegate;

import android.view.View;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.ui.e;
import com.sankuai.waimai.store.shopping.cart.util.d;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SCBaseShopCartDelegate implements c.a, a, b {
    public static ChangeQuickRedirect a;
    public int b;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    protected String d;
    protected String e;
    protected com.sankuai.waimai.store.shopping.cart.ui.b f;
    protected SCPageConfig g;
    protected View h;
    private boolean i;

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void a(GoodsSpu goodsSpu) {
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public void e() {
    }

    public SCBaseShopCartDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec2bcd6f6fcd274338322b86d2af8746", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec2bcd6f6fcd274338322b86d2af8746");
            return;
        }
        this.b = 0;
        this.i = false;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public void f() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9b492771e05d7b801853bb789946569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9b492771e05d7b801853bb789946569");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09eddaf10b1ce6a318a1055cba119e58", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09eddaf10b1ce6a318a1055cba119e58")).intValue();
        } else if (!this.c.t()) {
            i = 2;
        }
        this.b = i;
        if (!this.i) {
            com.meituan.android.bus.a.a().a(this);
            this.i = true;
        }
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e83dc871f9ecaea8c9795d0d21565a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e83dc871f9ecaea8c9795d0d21565a");
            return;
        }
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        this.i = false;
    }

    public final boolean j() {
        return this.b == 1;
    }

    public final boolean k() {
        return this.b == 2;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22105786852f602572b078e1d8fcdddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22105786852f602572b078e1d8fcdddf");
        } else if (this.f != null) {
            com.sankuai.waimai.store.shopping.cart.ui.b bVar = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.cart.ui.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "520fd7cff8d450e3c6150b4a45941b37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "520fd7cff8d450e3c6150b4a45941b37");
            } else if (com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER) {
                bVar.d();
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf60a8d81af6b81ec25477e48ba5ecc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf60a8d81af6b81ec25477e48ba5ecc4");
        } else if (this.f != null) {
            this.f.d();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61491d38f01201b124709edbeb91544", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61491d38f01201b124709edbeb91544");
        } else if (this.f != null) {
            this.f.d = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9559b3ce76f0fb944a116c35246fb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9559b3ce76f0fb944a116c35246fb2")).booleanValue();
        }
        if (j() || k()) {
            return true;
        }
        if (this.f != null) {
            com.sankuai.waimai.store.shopping.cart.ui.b bVar = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.cart.ui.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0f048bcde2e69003eb28ea50ed780d36", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0f048bcde2e69003eb28ea50ed780d36")).booleanValue() : bVar.b.isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Subscribe
    public void onSubmitOrderEvent(com.sankuai.waimai.store.shopping.cart.event.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c15242b718a15b2b74644e25c7af82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c15242b718a15b2b74644e25c7af82");
        } else if (eVar == null || eVar.d != g() || this.f == null) {
        } else {
            this.f.d();
        }
    }

    @Subscribe
    public void onClickImButton(com.sankuai.waimai.store.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3e6d796c97e675c67b2f392805de2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3e6d796c97e675c67b2f392805de2d");
        } else if (bVar == null || bVar.d != g()) {
        } else {
            d.a(i(), this.c, this.g, bVar.c);
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(final Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b7225da22ab4d87af4e01753a89a43b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b7225da22ab4d87af4e01753a89a43b");
        } else {
            al.a(new al.b<Object>() { // from class: com.sankuai.waimai.store.shopping.cart.delegate.SCBaseShopCartDelegate.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final Object a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d27826320fc615c666153e4c2001054b", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d27826320fc615c666153e4c2001054b");
                    }
                    try {
                        com.sankuai.waimai.store.manager.coupon.c.a().a(SCBaseShopCartDelegate.this.c.d(), i.a(poiCouponItem));
                        return poiCouponItem;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85b889457ebaffee2a6d55792ceb7e7a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85b889457ebaffee2a6d55792ceb7e7a");
                    } else if (obj != null) {
                        com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
                        long f = SCBaseShopCartDelegate.this.c.f();
                        Object[] objArr3 = {new Long(f)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.a.a;
                        if (PatchProxy.isSupport(objArr3, e, changeQuickRedirect3, false, "b0590ff1ebeed32cefac4694bdac1995", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect3, false, "b0590ff1ebeed32cefac4694bdac1995");
                        } else {
                            e.c(String.valueOf(f));
                        }
                    }
                }
            }, this.e);
        }
    }
}
