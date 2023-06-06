package com.sankuai.waimai.drug.controller;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.environment.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.drug.block.g;
import com.sankuai.waimai.drug.block.h;
import com.sankuai.waimai.drug.block.i;
import com.sankuai.waimai.drug.block.j;
import com.sankuai.waimai.drug.block.l;
import com.sankuai.waimai.drug.block.m;
import com.sankuai.waimai.drug.block.n;
import com.sankuai.waimai.drug.block.shopcart.NewUserTaskListBlock;
import com.sankuai.waimai.drug.contract.a;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.store.platform.domain.core.shopcart.b;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.ShopCartBaseBlockFactory;
import com.sankuai.waimai.store.shopping.cart.ui.c;
import com.sankuai.waimai.store.shopping.cart.ui.d;
import com.sankuai.waimai.store.shopping.cart.ui.e;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugShopCartController implements a {
    public static ChangeQuickRedirect a;
    private final boolean A;
    public com.sankuai.waimai.store.order.a b;
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    public b d;
    public n e;
    public com.sankuai.waimai.drug.patch.block.a f;
    public e g;
    public boolean h;
    private final View i;
    private final String j;
    private Activity k;
    private SCPageConfig l;
    private final com.sankuai.waimai.store.shopping.cart.a m;
    private GoodDetailResponse n;
    private c o;
    private h p;
    private n q;
    private j r;
    private i s;
    private m t;
    @Nullable
    private d u;
    private com.sankuai.waimai.drug.block.d v;
    private NewUserTaskListBlock w;
    private com.sankuai.waimai.drug.block.c x;
    private boolean y;
    private boolean z;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
        if (r14 <= 1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.drug.controller.DrugShopCartController r24, com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu r25, com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku r26, com.sankuai.waimai.platform.domain.core.goods.GoodsAttr[] r27, double r28, final android.widget.TextView r30, final int r31, int r32) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.drug.controller.DrugShopCartController.a(com.sankuai.waimai.drug.controller.DrugShopCartController, com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu, com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku, com.sankuai.waimai.platform.domain.core.goods.GoodsAttr[], double, android.widget.TextView, int, int):void");
    }

    public DrugShopCartController(Activity activity, @NonNull View view, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull SCPageConfig sCPageConfig, String str, com.sankuai.waimai.store.shopping.cart.a aVar2, GoodDetailResponse goodDetailResponse, boolean z) {
        int i;
        Object[] objArr = {activity, view, aVar, sCPageConfig, str, aVar2, goodDetailResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa4d2b29856096ece324db2315dfffc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa4d2b29856096ece324db2315dfffc");
            return;
        }
        this.b = com.sankuai.waimai.store.order.a.e();
        this.h = false;
        this.k = activity;
        this.i = view;
        this.c = aVar;
        this.j = str;
        this.l = sCPageConfig;
        this.m = aVar2;
        this.n = goodDetailResponse;
        this.A = z;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7cd66a97f2446e69103e4a61e2d736e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7cd66a97f2446e69103e4a61e2d736e");
        } else if (this.i != null) {
            this.d = this.b.k(this.c.d());
            this.y = this.d.e.b("cart_type") == 2;
            this.z = this.d.e.b("cart_type") == 4;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b46be55097be85d86af8741fa097cb4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b46be55097be85d86af8741fa097cb4");
            } else if (this.y) {
                this.f = new com.sankuai.waimai.drug.patch.block.d(this.j, this.k, this.c, this.l, this);
                this.f.bindView(this.i.findViewById(R.id.b2c_layout_patchwork));
            } else {
                this.f = new com.sankuai.waimai.drug.patch.block.d(this.j, this.k, this.c, this.l, this);
                this.f.bindView(this.i.findViewById(R.id.new_drug_layout_patchwork));
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4fd78fcf1fc1ca87303d48238311317e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4fd78fcf1fc1ca87303d48238311317e");
            } else {
                this.r = new j(this.k, this.c);
                this.r.bindView(this.i);
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "34899628b00c2aa6c3ca83b6435de641", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "34899628b00c2aa6c3ca83b6435de641");
            } else {
                this.s = new i(this, this.c, this.l, this.j);
                this.s.bindView(this.i);
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "100ca190229add8656dd6c6e9fa6abd5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "100ca190229add8656dd6c6e9fa6abd5");
            } else {
                this.p = new h(this.k, this.c, this.l, this, this.n);
                this.p.bindView(this.i);
                this.p.b();
                this.p.a(this.d);
            }
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6de767dbc52c5f5b0956b3d2f44ac2b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6de767dbc52c5f5b0956b3d2f44ac2b0");
                i = 1;
            } else {
                i = 1;
                this.q = new n(this, 1);
                RelativeLayout relativeLayout = (RelativeLayout) this.i.findViewById(R.id.layout_tips_try_lucky_bar);
                RelativeLayout relativeLayout2 = (RelativeLayout) this.i.findViewById(R.id.layout_shop_cart_try_lucky_bar_show_new_style);
                if (this.d.e.b("prompt_stripe_type") == 1) {
                    u.a(relativeLayout2);
                    u.c(relativeLayout);
                    this.q.bindView(relativeLayout2);
                    a(this.q);
                } else {
                    u.c(relativeLayout2);
                    u.a(relativeLayout);
                    this.q.bindView(relativeLayout);
                }
            }
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "1c9ae0c9b93c71da198c636d139f7c52", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "1c9ae0c9b93c71da198c636d139f7c52");
            } else {
                this.w = new NewUserTaskListBlock(this.k, this);
                this.w.bindView(this.i.findViewById(R.id.layout_new_user_task));
            }
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "ed022efdf99682b4c19f64454083660d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "ed022efdf99682b4c19f64454083660d");
            } else {
                this.e = new n(this, 2);
                RelativeLayout relativeLayout3 = (RelativeLayout) this.i.findViewById(R.id.layout_shop_cart_try_lucky_bar);
                RelativeLayout relativeLayout4 = (RelativeLayout) this.i.findViewById(R.id.layout_shop_cart_try_lucky_bar_close_new_style);
                if (this.d.e.b("prompt_stripe_type") == i) {
                    View[] viewArr = new View[i];
                    viewArr[0] = relativeLayout4;
                    u.a(viewArr);
                    View[] viewArr2 = new View[i];
                    viewArr2[0] = relativeLayout3;
                    u.c(viewArr2);
                    this.e.bindView(relativeLayout4);
                    a(this.e);
                } else {
                    View[] viewArr3 = new View[i];
                    viewArr3[0] = relativeLayout4;
                    u.c(viewArr3);
                    View[] viewArr4 = new View[i];
                    viewArr4[0] = relativeLayout3;
                    u.a(viewArr4);
                    this.e.bindView(relativeLayout3);
                }
            }
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "eb81fe32eeb5a468cc6a227c941e4fb1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "eb81fe32eeb5a468cc6a227c941e4fb1");
            } else {
                this.x = new com.sankuai.waimai.drug.block.c(this, this.n);
                this.x.bindView(this.i.findViewById(R.id.layout_shop_cart_announce));
            }
            Object[] objArr11 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect11 = a;
            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "041155540a69d144dfd380c06a171231", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "041155540a69d144dfd380c06a171231");
            } else {
                this.t = new m(this.k, this.c, this.l, this.j, this, this.m);
                this.t.createAndReplaceView((FrameLayout) this.i.findViewById(R.id.shop_cart_rest_layout));
                this.t.a();
            }
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = a;
            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "a7db8dd03babf3b85d86f0f623795236", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "a7db8dd03babf3b85d86f0f623795236");
            } else {
                FrameLayout frameLayout = (FrameLayout) this.i.findViewById(R.id.shop_cart_price_layout);
                int b = this.d.e.b("cart_type");
                int b2 = this.d.e.b("prompt_stripe_type");
                if (this.y) {
                    ShopCartBaseBlockFactory shopCartBaseBlockFactory = (ShopCartBaseBlockFactory) com.sankuai.waimai.router.a.a(ShopCartBaseBlockFactory.class, ShopCartBaseBlockFactory.DRUG_SHOP_CART_KEY);
                    if (shopCartBaseBlockFactory != null) {
                        this.o = shopCartBaseBlockFactory.create(this, this.m, ShopCartBaseBlockFactory.SHOP_CART_BOTTOM_BLOCK_B2C);
                        frameLayout.setPadding(0, 0, 0, 0);
                        if (b2 != i) {
                            this.e.a(0, Integer.MIN_VALUE, 0, Integer.MIN_VALUE);
                        }
                        new g(this.k, this.c, this.l, this.j).bindView(this.i);
                    }
                } else if (this.z) {
                    ShopCartBaseBlockFactory shopCartBaseBlockFactory2 = (ShopCartBaseBlockFactory) com.sankuai.waimai.router.a.a(ShopCartBaseBlockFactory.class, ShopCartBaseBlockFactory.DRUG_SHOP_CART_KEY);
                    if (shopCartBaseBlockFactory2 != null) {
                        this.o = shopCartBaseBlockFactory2.create(this, this.m, ShopCartBaseBlockFactory.SHOP_CART_BOTTOM_BLOCK_O2O);
                        frameLayout.setPadding(0, 0, 0, 0);
                        if (b2 != i) {
                            this.e.a(0, Integer.MIN_VALUE, 0, Integer.MIN_VALUE);
                            this.e.a(57);
                            this.e.getView().setPadding(0, com.sankuai.shangou.stone.util.h.a(this.k, 3.5f), 0, 0);
                            this.e.getView().setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.k, 12.0f), com.sankuai.shangou.stone.util.h.a(this.k, 12.0f), 0.0f, 0.0f).c(com.sankuai.waimai.store.util.b.b(this.k, R.color.sc_color_bc6)).a());
                        }
                    }
                } else if (this.c.B()) {
                    this.o = new com.sankuai.waimai.drug.block.b(this.k, this, this.n);
                    new g(this.k, this.c, this.l, this.j).bindView(this.i);
                    if (b2 != i) {
                        this.e.a(55);
                    }
                } else {
                    this.o = new l(this.k, this, this.n);
                    if (b2 != i) {
                        this.e.a(50);
                    }
                }
                if (!this.y && !this.z) {
                    this.u = new com.sankuai.waimai.drug.block.e(this.k, this.c, b, this.c.B(), this.n);
                    this.u.bindView(this.i);
                }
                this.o.createAndReplaceView(frameLayout);
                this.o.a();
            }
            Object[] objArr13 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect13 = a;
            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "d463970ee04d78886cf0fe0aba696243", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "d463970ee04d78886cf0fe0aba696243");
            } else {
                this.v = new com.sankuai.waimai.drug.block.d(this.k, this.c, this.l, this);
                this.v.createAndReplaceView((FrameLayout) this.i.findViewById(R.id.risk_info_layout));
                this.v.a(this.d.d().getShopCartDrugRisk());
            }
            Object[] objArr14 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect14 = a;
            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "3fa5dc1b7859d8096132321a3a2b3e61", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "3fa5dc1b7859d8096132321a3a2b3e61");
            } else if (!b.c.RELEASE.equals(com.sankuai.shangou.stone.util.environment.a.a())) {
                int a2 = com.sankuai.shangou.stone.util.h.a(this.k, 30.0f);
                TextView textView = new TextView(this.k);
                textView.setText("drug-cart");
                textView.setTextColor(SupportMenu.CATEGORY_MASK);
                textView.setGravity(17);
                textView.setTextSize(8.0f);
                textView.setBackground(new e.a().a(10.0f).c(Color.argb(100, 87, 185, 122)).a());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
                layoutParams.addRule(12);
                layoutParams.setMargins(0, 0, 0, 50);
                ((RelativeLayout) this.i).addView(textView, layoutParams);
            }
        }
        com.meituan.android.bus.a.a().a(this);
    }

    public DrugShopCartController(Activity activity, @NonNull View view, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull SCPageConfig sCPageConfig, String str, boolean z) {
        this(activity, view, aVar, sCPageConfig, str, null, null, z);
        Object[] objArr = {activity, view, aVar, sCPageConfig, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad6c3830d06c4f388597385680fa37b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad6c3830d06c4f388597385680fa37b");
        }
    }

    private void a(@NonNull n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd9875d1b64705df1df7ad76d864b0a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd9875d1b64705df1df7ad76d864b0a8");
        } else {
            nVar.getView().setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.k, 8.0f), com.sankuai.shangou.stone.util.h.a(this.k, 8.0f), 0.0f, 0.0f).c(com.sankuai.waimai.store.util.b.b(this.k, R.color.sc_color_FFF1CC)).a());
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd6212a96d48ae207659461052eb1ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd6212a96d48ae207659461052eb1ae5");
        } else if (z && !t() && this.c.A()) {
            this.h = true;
            if (this.u != null) {
                this.u.b();
            }
            this.f.hide();
            this.w.hide();
            this.e.hide();
            this.p.c();
            this.s.a();
            this.h = false;
            a(true, true);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41cd613878204e9a2a8bd6201a230aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41cd613878204e9a2a8bd6201a230aa6");
        } else {
            this.p.b();
        }
    }

    private boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f588f51904b7fe2857419d160f55a6d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f588f51904b7fe2857419d160f55a6d8")).booleanValue();
        }
        h hVar = this.p;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        return PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "709fe4e559ab387c66db40cf2b133e86", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "709fe4e559ab387c66db40cf2b133e86")).booleanValue() : hVar.d.getVisibility() == 0;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c72cef273bb0083a609fbd22167430b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c72cef273bb0083a609fbd22167430b0")).booleanValue() : this.f.isVisible();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bda035962bf549aaf815edf1ada7768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bda035962bf549aaf815edf1ada7768");
        } else if (this.c.A() || p()) {
            this.d = this.b.k(this.c.d());
            this.o.a();
            this.p.a(this.d);
            this.f.c();
            if (this.u != null) {
                this.u.a();
            }
            r();
        } else {
            this.o.hide();
            this.t.a();
            this.e.hide();
            this.x.hide();
        }
    }

    private boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6522eace1449ee10d8c6028b8bd9b558", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6522eace1449ee10d8c6028b8bd9b558")).booleanValue() : this.z && this.l.e == 2;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27ecfb9e3b4009dc94f89ee32dee4647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27ecfb9e3b4009dc94f89ee32dee4647");
            return;
        }
        q();
        a(false, false);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad9c9ae691b884ee25ca3b8c9735669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad9c9ae691b884ee25ca3b8c9735669");
            return;
        }
        q();
        a(false, false);
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a g() {
        return this.c;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final SCPageConfig h() {
        return this.l;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final Activity i() {
        return this.k;
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c79202ae21a63e638f1479ad3a66963a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c79202ae21a63e638f1479ad3a66963a");
        } else if (o() || this.f.isVisible() || this.e == null) {
        } else {
            this.e.a(this.d.k().a(), s(), this.A);
        }
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cfd299d2064b0e065e5c3d265ef6071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cfd299d2064b0e065e5c3d265ef6071");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c k = this.d.k();
        this.r.a(k, this.d);
        this.s.a(this.d);
        PoiShoppingCart.TaskActivity s = s();
        this.e.a(k.a(), s, this.A);
        this.v.a(this.d.d().getShopCartDrugRisk());
        this.q.a(k.a(), s, this.A);
        this.d.d();
    }

    private PoiShoppingCart.TaskActivity s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27eb848291f36ae990abfcaf6327d9cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiShoppingCart.TaskActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27eb848291f36ae990abfcaf6327d9cb");
        }
        if (this.c.b != null) {
            return this.c.b.getTaskActivity();
        }
        return null;
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a65fe72b468d449401adebac934de94b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a65fe72b468d449401adebac934de94b");
        } else if (this.i != null) {
            this.i.setVisibility(z ? 0 : 8);
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f5416df060119f4a46e078c6686e9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f5416df060119f4a46e078c6686e9e");
        } else {
            this.o.b();
        }
    }

    private boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2732869d7b38f6cc4dfa7dfac7ee1927", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2732869d7b38f6cc4dfa7dfac7ee1927")).booleanValue() : com.sankuai.waimai.store.order.a.e().r(this.c.d());
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final void k() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bd68b89848348eb3de8a29f3e025cbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bd68b89848348eb3de8a29f3e025cbd");
            return;
        }
        long j = -999;
        if (o()) {
            b();
            if (this.y) {
                com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(this.l.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.k), "b_waimai_ncyql8cd_mc").a("poi_id", this.c.d());
                if (this.m != null && this.m.b != null) {
                    j = this.m.b.id;
                }
                a2.a("spu_id", Long.valueOf(j)).a("stid", n()).a();
                return;
            } else if (this.z) {
                com.sankuai.waimai.store.manager.judas.b.a(this.l.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.k), "b_waimai_7bgt9pp8_mc").a("poi_id", String.valueOf(this.c.d())).a("stid", n()).a();
                return;
            } else {
                com.sankuai.waimai.store.manager.judas.b.a(this.l.d, "b_6yMpF").a("poi_id", this.c.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.c.v())).a("shopcart_status", "0").a();
                return;
            }
        }
        h hVar = this.p;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "807d7d83f4e358edab5790e0dc9c9488", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "807d7d83f4e358edab5790e0dc9c9488")).booleanValue();
        } else if (hVar.e.getAdapter().getCount() > 0) {
            z = true;
        }
        if (z) {
            a(true);
            if (this.y) {
                com.sankuai.waimai.store.callback.a a3 = com.sankuai.waimai.store.manager.judas.b.a(this.l.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.k), "b_waimai_ncyql8cd_mc").a("poi_id", this.c.d());
                if (this.m != null && this.m.b != null) {
                    j = this.m.b.id;
                }
                a3.a("spu_id", Long.valueOf(j)).a("stid", n()).a();
            } else if (this.z) {
                com.sankuai.waimai.store.manager.judas.b.a(this.l.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.k), "b_waimai_7bgt9pp8_mc").a("poi_id", String.valueOf(this.c.d())).a("stid", n()).a();
            } else {
                com.sankuai.waimai.store.manager.judas.b.a(this.l.d, "b_6yMpF").a("poi_id", this.c.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.c.v())).a("shopcart_status", "1").a();
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final String l() {
        return this.j;
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final boolean m() {
        return this.y;
    }

    public void b(double d, boolean z) {
        Object[] objArr = {Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263cf42b41b36fd5f051ec9fae79ea41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263cf42b41b36fd5f051ec9fae79ea41");
        } else {
            this.f.a(d, z, u());
        }
    }

    private int u() {
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c k;
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.d a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e4945ba54f88071f73f6b3ecd918b75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e4945ba54f88071f73f6b3ecd918b75")).intValue();
        }
        if (this.d == null || (k = this.d.k()) == null || (a2 = k.a()) == null || a2.a() == null) {
            return 2;
        }
        return com.sankuai.shangou.stone.util.i.b(Double.valueOf(this.b.n(this.c.d())), Double.valueOf(this.c.s())) ? 1 : 2;
    }

    public void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2803e7f15193626540a7b33186787a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2803e7f15193626540a7b33186787a");
        } else if (this.h) {
        } else {
            try {
                if (this.o != null) {
                    this.o.a(z);
                }
                if (this.g != null) {
                    this.g.a(z, z2);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b937c7a0aa12de7db836282be7d2e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b937c7a0aa12de7db836282be7d2e8");
        }
        if (this.m != null) {
            return this.m.f;
        }
        return (this.c == null || this.c.b == null) ? "" : this.c.b.abExpInfo;
    }

    @Subscribe
    public void buyNowWithMRN(com.sankuai.waimai.drug.mrn.a aVar) {
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a aVar2;
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e eVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15156a7b49f24735f915bf8b59912522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15156a7b49f24735f915bf8b59912522");
        } else if (aVar == null || aVar.b == null || aVar.c == null || !TextUtils.equals(this.j, aVar.a)) {
        } else {
            if (this.z) {
                final GoodsSpu goodsSpu = aVar.b;
                final GoodsSku goodsSku = aVar.c;
                final GoodsAttr[] goodsAttrArr = aVar.d;
                final int i = aVar.e;
                Object[] objArr2 = {goodsSpu, goodsSku, goodsAttrArr, null, 2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5daf2459837265c184e64eb1e3d0464c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5daf2459837265c184e64eb1e3d0464c");
                    return;
                }
                com.sankuai.waimai.store.platform.domain.manager.poi.a aVar3 = this.c;
                com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar = this.d;
                Object[] objArr3 = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), aVar3, bVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.drug.util.c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5a8a1a28e726a74aa54c51b20d8597a9", RobustBitConfig.DEFAULT_VALUE)) {
                    eVar = (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5a8a1a28e726a74aa54c51b20d8597a9");
                } else {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e eVar2 = new com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e();
                    eVar2.a(aVar3.g());
                    eVar2.b = aVar3.h();
                    eVar2.c(aVar3.s());
                    eVar2.a(aVar3.b.shippingFee);
                    eVar2.b(aVar3.b.packingFee);
                    eVar2.f = bVar.j;
                    eVar2.h = bVar.d().wmExtendInfo;
                    eVar2.j = (String) bVar.e.a("cart_extend_info");
                    ArrayList arrayList = new ArrayList();
                    Object[] objArr4 = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.drug.util.c.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b2574596b0701e27f48882d792777190", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar2 = (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b2574596b0701e27f48882d792777190");
                    } else {
                        aVar2 = new com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a();
                        aVar2.a(goodsSpu.getId());
                        GoodsSku sku = goodsSku == null ? goodsSpu.getSku() : goodsSku;
                        aVar2.b(sku.getSkuId());
                        aVar2.b = goodsSpu.getName();
                        aVar2.a(sku.getOriginPrice());
                        aVar2.c = i;
                        aVar2.d = sku.getSpec();
                        aVar2.e = 0;
                        aVar2.b(sku.getBoxNum());
                        aVar2.c(sku.getBoxPrice());
                        aVar2.f = goodsSpu.getPhysicalTag();
                        aVar2.k = goodsAttrArr;
                    }
                    arrayList.add(aVar2);
                    eVar2.c = arrayList;
                    eVar2.d = new ArrayList();
                    eVar2.e = bVar.q;
                    eVar2.i = aVar3.b.originalDeliveryType;
                    if (goodsSpu != null) {
                        eVar2.k = goodsSpu.couponPageSource;
                    }
                    eVar = eVar2;
                }
                com.sankuai.waimai.store.drug.base.net.b.a(this.j).a(com.sankuai.waimai.store.util.i.a(eVar), new com.sankuai.waimai.store.base.net.j<NetPriceCalculatorResult>() { // from class: com.sankuai.waimai.drug.controller.DrugShopCartController.3
                    public static ChangeQuickRedirect a;
                    private Dialog i;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(NetPriceCalculatorResult netPriceCalculatorResult) {
                        NetPriceCalculatorResult netPriceCalculatorResult2 = netPriceCalculatorResult;
                        Object[] objArr5 = {netPriceCalculatorResult2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ae97ffb770b2c5cd36a454b2f4b6b68d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ae97ffb770b2c5cd36a454b2f4b6b68d");
                        } else if (netPriceCalculatorResult2 == null || !com.sankuai.waimai.store.platform.domain.manager.poi.a.a(netPriceCalculatorResult2.c, DrugShopCartController.this.c.h(), netPriceCalculatorResult2.b, DrugShopCartController.this.c.g())) {
                            am.a(DrugShopCartController.this.k, (int) R.string.wm_sc_common_net_error_tip);
                        } else {
                            DrugShopCartController.a(DrugShopCartController.this, goodsSpu, goodsSku, goodsAttrArr, DrugShopCartController.this.c.s() - netPriceCalculatorResult2.E, r5, r6, i);
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7b2e1e4f4d57e41fe52760c7a01cea69", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7b2e1e4f4d57e41fe52760c7a01cea69");
                            return;
                        }
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8c0c1b0d50c38d9f64b44a526b8fefef", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8c0c1b0d50c38d9f64b44a526b8fefef");
                        } else if (this.i == null || !this.i.isShowing()) {
                            this.i = com.sankuai.waimai.store.util.d.a(DrugShopCartController.this.k);
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar2) {
                        Object[] objArr5 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "14e0f1e26661c89f05564cf4d55084a6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "14e0f1e26661c89f05564cf4d55084a6");
                        } else {
                            am.a(DrugShopCartController.this.k, bVar2.b);
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ff2d58a0fb1228f8e87ffaaa1d9e7b09", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ff2d58a0fb1228f8e87ffaaa1d9e7b09");
                            return;
                        }
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f5a94a97c9502f6e9367f96856bcf03b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f5a94a97c9502f6e9367f96856bcf03b");
                            return;
                        }
                        com.sankuai.waimai.store.util.d.a(this.i);
                        this.i = null;
                    }
                });
                return;
            }
            a(aVar.b, aVar.c, aVar.d, null, aVar.e);
        }
    }

    private void a(@NonNull final GoodsSpu goodsSpu, @NonNull final GoodsSku goodsSku, final GoodsAttr[] goodsAttrArr, final TextView textView, final int i) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr, textView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045a5b35f6ff0c6f942376c4396eb4d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045a5b35f6ff0c6f942376c4396eb4d7");
        } else {
            com.sankuai.waimai.store.manager.user.a.a(this.k, new Runnable() { // from class: com.sankuai.waimai.drug.controller.DrugShopCartController.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5fc059aaf42301fa5a5150fe641b916", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5fc059aaf42301fa5a5150fe641b916");
                    } else if (DrugShopCartController.this.m == null || DrugShopCartController.this.m.c == null) {
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new WmOrderedFood(goodsSpu.getId(), goodsSku.id, goodsAttrArr, i, 0, 0, goodsSpu.activityTag));
                        com.sankuai.waimai.store.order.a.e().a(DrugShopCartController.this.k, DrugShopCartController.this.c, DrugShopCartController.this.m.e, DrugShopCartController.this.m.d, arrayList, DrugShopCartController.this.m.c.recommendCouponInfo, textView, DrugShopCartController.this.m.g);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.drug.contract.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c91d3dcb98b51ba3ab84fa24801472", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c91d3dcb98b51ba3ab84fa24801472");
        } else if (o()) {
            b();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.contract.a
    public final void a(double d, boolean z) {
        String valueOf;
        Object[] objArr = {Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1fa0aa65ec8b3d739ab13f849c57d5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1fa0aa65ec8b3d739ab13f849c57d5f");
            return;
        }
        this.h = true;
        b();
        if (z) {
            b(d, false);
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4dfa09c824f3cc542d9a6a4b95dbd8e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4dfa09c824f3cc542d9a6a4b95dbd8e8");
            } else {
                NewUserTaskListBlock newUserTaskListBlock = this.w;
                String valueOf2 = String.valueOf(this.c.g());
                String h = this.c.h();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "191a9b5f7e9a5b052c40f0358b8ce70f", RobustBitConfig.DEFAULT_VALUE)) {
                    valueOf = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "191a9b5f7e9a5b052c40f0358b8ce70f");
                } else if (this.m == null) {
                    valueOf = "";
                } else if (this.m.b == null) {
                    valueOf = "";
                } else {
                    GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.m.b.getSkus(), 0);
                    valueOf = goodsSku == null ? "" : String.valueOf(goodsSku.id);
                }
                newUserTaskListBlock.a(valueOf2, h, valueOf, this.l.d);
            }
        }
        this.e.hide();
        this.h = false;
        a(true, false);
    }
}
