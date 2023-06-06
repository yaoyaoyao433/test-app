package com.sankuai.waimai.drug;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.drug.controller.DrugShopCartController;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.w;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements h {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    protected String c;
    protected String d;
    protected DrugShopCartController e;
    protected SCPageConfig f;
    protected View g;
    private Activity h;
    private final com.sankuai.waimai.store.shopping.cart.a i;
    private GoodDetailResponse j;
    private boolean k;

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void e() {
    }

    public g(@NonNull Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i, View view, SCPageConfig sCPageConfig, String str, String str2, com.sankuai.waimai.store.shopping.cart.a aVar2, GoodDetailResponse goodDetailResponse, boolean z) {
        this(activity, aVar, -1, view, sCPageConfig, str, str2, null, null);
        Object[] objArr = {activity, aVar, -1, view, sCPageConfig, str, str2, null, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21cc797b233a66de02e24ae01bd23a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21cc797b233a66de02e24ae01bd23a5");
        } else {
            this.k = z;
        }
    }

    public g(@NonNull Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i, View view, SCPageConfig sCPageConfig, String str, String str2, com.sankuai.waimai.store.shopping.cart.a aVar2, GoodDetailResponse goodDetailResponse) {
        Object[] objArr = {activity, aVar, Integer.valueOf(i), view, sCPageConfig, str, str2, aVar2, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c295a8a7197fe27c2531c9cc0498fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c295a8a7197fe27c2531c9cc0498fc");
            return;
        }
        this.h = activity;
        this.b = aVar;
        this.g = view;
        this.f = sCPageConfig;
        this.c = str;
        this.d = str2;
        this.i = aVar2;
        this.j = goodDetailResponse;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2f0d5a37251e4734868fabdd83e477", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2f0d5a37251e4734868fabdd83e477");
        } else if (this.e != null) {
            DrugShopCartController drugShopCartController = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DrugShopCartController.a;
            if (PatchProxy.isSupport(objArr2, drugShopCartController, changeQuickRedirect2, false, "356282a38117605fb9192daec5308988", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, drugShopCartController, changeQuickRedirect2, false, "356282a38117605fb9192daec5308988");
            } else {
                com.meituan.android.bus.a.a().b(drugShopCartController);
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "312d47a4c224c7831cbd144911945bc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "312d47a4c224c7831cbd144911945bc9");
        } else if (this.e != null) {
            DrugShopCartController drugShopCartController = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DrugShopCartController.a;
            if (PatchProxy.isSupport(objArr2, drugShopCartController, changeQuickRedirect2, false, "eb94f1b628830e3a1fca034c5d8907d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, drugShopCartController, changeQuickRedirect2, false, "eb94f1b628830e3a1fca034c5d8907d2");
            } else if (com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER) {
                drugShopCartController.j();
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688ea56dbda6f15a1c0651d0f643f2e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688ea56dbda6f15a1c0651d0f643f2e1");
        } else if (this.e != null) {
            this.e.j();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void a(GoodsSpu goodsSpu) {
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c k;
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.d a2;
        boolean b;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a887813730c1b1a00989b3e5d9f97c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a887813730c1b1a00989b3e5d9f97c");
        } else if (this.e != null) {
            DrugShopCartController drugShopCartController = this.e;
            Object[] objArr2 = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = DrugShopCartController.a;
            if (PatchProxy.isSupport(objArr2, drugShopCartController, changeQuickRedirect2, false, "e3c91c836b4501092250a6a911b0263f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, drugShopCartController, changeQuickRedirect2, false, "e3c91c836b4501092250a6a911b0263f");
            } else if (w.a(goodsSpu, drugShopCartController.c.d()) < 2) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = DrugShopCartController.a;
                if (PatchProxy.isSupport(objArr3, drugShopCartController, changeQuickRedirect3, false, "41c48ed077e49daf7b06bff13224311e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, drugShopCartController, changeQuickRedirect3, false, "41c48ed077e49daf7b06bff13224311e");
                } else if (drugShopCartController.d == null || 1 == drugShopCartController.d.B || (k = drugShopCartController.d.k()) == null || (a2 = k.a()) == null) {
                } else {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b a3 = a2.a();
                    Object[] objArr4 = {a3};
                    ChangeQuickRedirect changeQuickRedirect4 = DrugShopCartController.a;
                    if (PatchProxy.isSupport(objArr4, drugShopCartController, changeQuickRedirect4, false, "5acf1c900d1db0f61e458df5f799e52b", RobustBitConfig.DEFAULT_VALUE)) {
                        b = ((Boolean) PatchProxy.accessDispatch(objArr4, drugShopCartController, changeQuickRedirect4, false, "5acf1c900d1db0f61e458df5f799e52b")).booleanValue();
                    } else {
                        b = (a3 == null || t.a(a3.c) || a3.a != 1) ? false : com.sankuai.shangou.stone.util.i.b(Double.valueOf(drugShopCartController.b.n(drugShopCartController.c.d())), Double.valueOf(drugShopCartController.c.s()));
                    }
                    if (b) {
                        drugShopCartController.b(a2.a().d, true);
                        drugShopCartController.h = false;
                        drugShopCartController.a(true, false);
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void a(com.sankuai.waimai.store.shopping.cart.ui.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab6924a8d6f4f20b32e431a244ab91f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab6924a8d6f4f20b32e431a244ab91f");
        } else if (this.e != null) {
            this.e.g = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8bf69eae1fdd7d411f5f5a0a1f34c1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8bf69eae1fdd7d411f5f5a0a1f34c1f")).booleanValue();
        }
        if (this.e != null) {
            DrugShopCartController drugShopCartController = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DrugShopCartController.a;
            return PatchProxy.isSupport(objArr2, drugShopCartController, changeQuickRedirect2, false, "d70e1d034581e3af58dbdfc0491298c7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, drugShopCartController, changeQuickRedirect2, false, "d70e1d034581e3af58dbdfc0491298c7")).booleanValue() : drugShopCartController.e.isVisible();
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbcc85540690b15f6dd2e46e499f015e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbcc85540690b15f6dd2e46e499f015e");
            return;
        }
        if (this.e != null) {
            this.e.b();
            DrugShopCartController drugShopCartController = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DrugShopCartController.a;
            if (PatchProxy.isSupport(objArr2, drugShopCartController, changeQuickRedirect2, false, "b23124b17b790aa5b4f57fac36954857", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, drugShopCartController, changeQuickRedirect2, false, "b23124b17b790aa5b4f57fac36954857");
            } else {
                drugShopCartController.f.hide();
            }
        }
        this.e = new DrugShopCartController(this.h, this.g, this.b, this.f, this.d, this.i, this.j, this.k);
        this.e.d();
        this.e.b(true);
    }

    @Override // com.sankuai.waimai.drug.h
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "469188c0ab36676f4090a091d919f238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "469188c0ab36676f4090a091d919f238");
            return;
        }
        if (this.e == null && this.g != null && !com.sankuai.waimai.store.util.b.a(this.h)) {
            this.e = new DrugShopCartController(this.h, this.g, this.b, this.f, this.d, this.k);
        }
        if (this.e != null) {
            if (this.b.r() == 3) {
                this.e.a(false);
            } else {
                com.sankuai.waimai.store.order.a.e().c(this.b.d(), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d20e51799cef5965140d1dc6a1959289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d20e51799cef5965140d1dc6a1959289");
        } else if (this.e != null) {
            this.e.d();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9a2aba3b03c28849c3d1de04b7b737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9a2aba3b03c28849c3d1de04b7b737");
        } else if (this.e != null) {
            this.e.a(z);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.delegate.b
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f623db6f6036106db4b3b568686e7ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f623db6f6036106db4b3b568686e7ba");
        } else if (this.e != null) {
            this.e.b(z);
        }
    }
}
