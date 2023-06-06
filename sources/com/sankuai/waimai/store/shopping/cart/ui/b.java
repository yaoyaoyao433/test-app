package com.sankuai.waimai.store.shopping.cart.ui;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.waimai.drug.block.shopcart.NewUserTaskListBlock;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.block.f;
import com.sankuai.waimai.store.shopping.cart.block.g;
import com.sankuai.waimai.store.shopping.cart.block.h;
import com.sankuai.waimai.store.shopping.cart.block.j;
import com.sankuai.waimai.store.shopping.cart.block.k;
import com.sankuai.waimai.store.shopping.cart.block.l;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.shopping.cart.contract.a {
    public static ChangeQuickRedirect a;
    public l b;
    public com.sankuai.waimai.store.shopping.patchwork.a c;
    public e d;
    private final View e;
    private final String f;
    private Activity g;
    private com.sankuai.waimai.store.order.a h;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a i;
    private SCPageConfig j;
    private com.sankuai.waimai.store.platform.domain.core.shopcart.b k;
    private com.sankuai.waimai.store.shopping.cart.a l;
    private GoodDetailResponse m;
    private c n;
    private f o;
    private l p;
    private h q;
    private g r;
    private k s;
    @Nullable
    private d t;
    private com.sankuai.waimai.store.shopping.cart.block.b u;
    private NewUserTaskListBlock v;
    private boolean w;

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final boolean m() {
        return false;
    }

    public b(Activity activity, @NonNull View view, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull SCPageConfig sCPageConfig, String str, com.sankuai.waimai.store.shopping.cart.a aVar2, GoodDetailResponse goodDetailResponse) {
        Object[] objArr = {activity, view, aVar, sCPageConfig, str, aVar2, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401afad4e08dfd1520ec993cfbfaba56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401afad4e08dfd1520ec993cfbfaba56");
            return;
        }
        this.h = com.sankuai.waimai.store.order.a.e();
        this.w = false;
        this.g = activity;
        this.e = view;
        this.i = aVar;
        this.f = str;
        this.j = sCPageConfig;
        this.l = aVar2;
        this.m = goodDetailResponse;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47c7554f671f404f0348d33356cb1daa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47c7554f671f404f0348d33356cb1daa");
        } else if (this.e != null) {
            this.k = this.h.k(this.i.d());
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c3d529f0ce76aabe62c737fcbcdd1c60", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c3d529f0ce76aabe62c737fcbcdd1c60");
            } else {
                this.c = new com.sankuai.waimai.store.shopping.patchwork.g(this.f, this.g, this.i, this.j, this, this.m);
                this.c.bindView(this.e.findViewById(R.id.layout_patchwork));
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "314ac1005359d318a0260074ce78905f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "314ac1005359d318a0260074ce78905f");
            } else {
                this.q = new h(this.g, this.i);
                this.q.bindView(this.e);
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "064920e1d059ecc11a4cfdffaafa92cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "064920e1d059ecc11a4cfdffaafa92cd");
            } else {
                this.r = new g(this.g, this.i, this.j);
                this.r.bindView(this.e);
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a9ea2237dabeeae2838f381e4abe9fdf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a9ea2237dabeeae2838f381e4abe9fdf");
            } else {
                this.o = new f(this.g, this.i, this.j, this, this.m);
                this.o.bindView(this.e);
                this.o.b();
                this.o.a(this.k);
            }
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7eafdeb4e5f2f4ae60080b19c23be2e1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7eafdeb4e5f2f4ae60080b19c23be2e1");
            } else {
                this.p = new l(this, 1);
                this.p.bindView(this.e.findViewById(R.id.layout_tips_try_lucky_bar));
            }
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8a97a82deb21b14a3356bf3e729b91af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8a97a82deb21b14a3356bf3e729b91af");
            } else {
                this.v = new NewUserTaskListBlock(this.g, this);
                this.v.bindView(this.e.findViewById(R.id.layout_new_user_task));
            }
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "24fd065db25780f309f25d56b3340c23", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "24fd065db25780f309f25d56b3340c23");
            } else {
                this.b = new l(this, 2);
                this.b.bindView(this.e.findViewById(R.id.layout_shop_cart_try_lucky_bar));
            }
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "736a906ada0bf79d0a79e0461cae2372", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "736a906ada0bf79d0a79e0461cae2372");
            } else {
                this.s = new k(this.g, this.i, this.j, this.f);
                this.s.createAndReplaceView((FrameLayout) this.e.findViewById(R.id.shop_cart_rest_layout));
                this.s.a();
            }
            Object[] objArr11 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect11 = a;
            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "e20d328df65afd6f89de271888858dc2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "e20d328df65afd6f89de271888858dc2");
            } else {
                FrameLayout frameLayout = (FrameLayout) this.e.findViewById(R.id.shop_cart_price_layout);
                int b = this.k.e.b("cart_type");
                if (this.i.B()) {
                    this.n = new com.sankuai.waimai.store.shopping.cart.block.a(this.g, this, this.m);
                    new com.sankuai.waimai.store.shopping.cart.block.e(this.g, this.i, this.j, this.f).bindView(this.e);
                    this.b.a(55);
                } else {
                    this.n = new j(this.g, this, this.m);
                    this.b.a(50);
                }
                this.t = new com.sankuai.waimai.store.shopping.cart.block.c(this.g, this.i, b, this.i.B(), this.m);
                this.t.bindView(this.e);
                this.n.createAndReplaceView(frameLayout);
                this.n.a();
            }
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = a;
            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "d8412b284e51d418c3a11bc318085d7c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "d8412b284e51d418c3a11bc318085d7c");
                return;
            }
            this.u = new com.sankuai.waimai.store.shopping.cart.block.b(this.g, this.i, this.j, this);
            this.u.createAndReplaceView((FrameLayout) this.e.findViewById(R.id.risk_info_layout));
            this.u.a(this.k.d().getShopCartDrugRisk());
        }
    }

    public b(Activity activity, @NonNull View view, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull SCPageConfig sCPageConfig, String str) {
        this(activity, view, aVar, sCPageConfig, str, null, null);
        Object[] objArr = {activity, view, aVar, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7e319b232282b40bbca8f61cae8167a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7e319b232282b40bbca8f61cae8167a");
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7220b5e64968ea74aa299f0668ce34df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7220b5e64968ea74aa299f0668ce34df");
        } else if (z && !r() && this.i.A()) {
            this.w = true;
            if (this.t != null) {
                this.t.b();
            }
            this.c.hide();
            this.v.hide();
            this.b.hide();
            this.o.c();
            this.r.a();
            this.w = false;
            a(true, true);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956c51367c498b05de8d98c9e65dd8eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956c51367c498b05de8d98c9e65dd8eb");
        } else {
            this.o.b();
        }
    }

    private boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eca59f7d5b88a75f858f3044f468f54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eca59f7d5b88a75f858f3044f468f54")).booleanValue();
        }
        f fVar = this.o;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        return PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "81657ae13349efe2797295eb27484fb0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "81657ae13349efe2797295eb27484fb0")).booleanValue() : fVar.d.getVisibility() == 0;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3538d45d4842adf885935fbaf23c2831", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3538d45d4842adf885935fbaf23c2831")).booleanValue() : this.c.isVisible();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c643656af3ea96566d4c654628106c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c643656af3ea96566d4c654628106c6");
        } else if (this.i.A()) {
            this.k = this.h.k(this.i.d());
            this.n.a();
            this.o.a(this.k);
            this.c.a();
            if (this.t != null) {
                this.t.a();
            }
            q();
        } else {
            this.n.hide();
            this.s.a();
            this.b.hide();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3700a096c464d7a851c26472438e991a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3700a096c464d7a851c26472438e991a");
            return;
        }
        o();
        a(false, false);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a5c5944d91f41f5d1dd86c4034a1cdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a5c5944d91f41f5d1dd86c4034a1cdb");
            return;
        }
        o();
        a(false, false);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a g() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final SCPageConfig h() {
        return this.j;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final Activity i() {
        return this.g;
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3db7421a6fe1893e851025b76300850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3db7421a6fe1893e851025b76300850");
        } else if (j() || this.c.isVisible() || this.b == null) {
        } else {
            this.b.a(this.k.k().a(), p());
        }
    }

    private PoiShoppingCart.TaskActivity p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10a263ab0f7d1ad1909a8fdd8e81722", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiShoppingCart.TaskActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10a263ab0f7d1ad1909a8fdd8e81722");
        }
        if (this.i.b != null) {
            return this.i.b.getTaskActivity();
        }
        return null;
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c150bb84add13dd0b5fa45a9c3e85d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c150bb84add13dd0b5fa45a9c3e85d");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c k = this.k.k();
        PoiShoppingCart.TaskActivity p = p();
        this.q.a(k, this.k);
        this.r.a(this.k);
        this.b.a(k.a(), p);
        this.u.a(this.k.d().getShopCartDrugRisk());
        this.p.a(k.a(), p);
        this.c.a(this.k.d().collectTitle);
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262e60a4b7ef11b3f81980c189771884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262e60a4b7ef11b3f81980c189771884");
        } else if (this.e != null) {
            this.e.setVisibility(z ? 0 : 8);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4eb2244d4a94e00837946d8a13a2a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4eb2244d4a94e00837946d8a13a2a9f");
        } else {
            this.n.b();
        }
    }

    private boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cceed12b46238290e270220a5eb11edb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cceed12b46238290e270220a5eb11edb")).booleanValue() : com.sankuai.waimai.store.order.a.e().r(this.i.d());
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final void k() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b20397eeeb9cef90c416450a9d5c1f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b20397eeeb9cef90c416450a9d5c1f0a");
        } else if (j()) {
            a();
            com.sankuai.waimai.store.manager.judas.b.a(this.j.d, "b_6yMpF").a("poi_id", this.i.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.i.v())).a("shopcart_status", "0").a();
        } else {
            f fVar = this.o;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "6b1a1beed28b3af45abf9ecb1e146d6d", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "6b1a1beed28b3af45abf9ecb1e146d6d")).booleanValue();
            } else if (fVar.e.getAdapter().getCount() > 0) {
                z = true;
            }
            if (z) {
                a(true);
                com.sankuai.waimai.store.manager.judas.b.a(this.j.d, "b_6yMpF").a("poi_id", this.i.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.i.v())).a("shopcart_status", "1").a();
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final String l() {
        return this.f;
    }

    private void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ee5854d6599e5c361530780e8abb0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ee5854d6599e5c361530780e8abb0d");
        } else if (this.w) {
        } else {
            try {
                if (this.n != null) {
                    this.n.a(z);
                }
                if (this.d != null) {
                    this.d.a(z, z2);
                }
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35fd48f95168515b8de4099dc44a24a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35fd48f95168515b8de4099dc44a24a4");
        }
        if (this.l != null) {
            return this.l.f;
        }
        return (this.i == null || this.i.b == null) ? "" : this.i.b.abExpInfo;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final void a(double d, boolean z) {
        String valueOf;
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c k;
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.d a2;
        double d2;
        int i = 2;
        Object[] objArr = {Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0aadd8503d913b6da9264bc96a74d7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0aadd8503d913b6da9264bc96a74d7b");
            return;
        }
        this.w = true;
        a();
        if (z) {
            Object[] objArr2 = {Double.valueOf(d), (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb8e5a899c9bd6c73e0f09ee8ae513b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb8e5a899c9bd6c73e0f09ee8ae513b9");
            } else {
                com.sankuai.waimai.store.shopping.patchwork.a aVar = this.c;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9504bf1b92cab94dbb1403de050f1715", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9504bf1b92cab94dbb1403de050f1715")).intValue();
                } else if (this.k != null && (k = this.k.k()) != null && (a2 = k.a()) != null && a2.a() != null && i.b(Double.valueOf(this.h.n(this.i.d())), Double.valueOf(this.i.s()))) {
                    d2 = d;
                    i = 1;
                    aVar.a(d2, false, i);
                }
                d2 = d;
                aVar.a(d2, false, i);
            }
        } else {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "de797bacf865f9baec520382f7a952d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "de797bacf865f9baec520382f7a952d9");
            } else {
                NewUserTaskListBlock newUserTaskListBlock = this.v;
                String valueOf2 = String.valueOf(this.i.f());
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5cf05eb811763ed27a5c979c5ad22f38", RobustBitConfig.DEFAULT_VALUE)) {
                    valueOf = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5cf05eb811763ed27a5c979c5ad22f38");
                } else if (this.l == null) {
                    valueOf = "";
                } else if (this.l.b == null) {
                    valueOf = "";
                } else {
                    GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.l.b.getSkus(), 0);
                    valueOf = goodsSku == null ? "" : String.valueOf(goodsSku.id);
                }
                newUserTaskListBlock.a(valueOf2, valueOf, this.j.d);
            }
        }
        this.b.hide();
        this.w = false;
        a(true, false);
    }
}
