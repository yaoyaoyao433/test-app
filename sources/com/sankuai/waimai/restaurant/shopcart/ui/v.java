package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.submit.d;
import com.sankuai.waimai.business.restaurant.base.log.a;
import com.sankuai.waimai.business.restaurant.base.repository.model.RequiredTagInfo;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.RestaurantSchemeParams;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCart;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class v {
    public static ChangeQuickRedirect a;
    View b;
    View c;
    View d;
    View e;
    FrameLayout f;
    TextView g;
    ImageView h;
    final Activity i;
    final com.sankuai.waimai.business.restaurant.base.manager.order.g j;
    final com.sankuai.waimai.restaurant.shopcart.config.a k;
    public w l;
    public double m;
    private final String n;
    private final com.sankuai.waimai.platform.domain.core.response.a o;
    private ab p;
    private boolean q;
    private GradientDrawable r;

    public static /* synthetic */ void a(v vVar, View view) {
        boolean z;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, vVar, changeQuickRedirect, false, "8326efe16c4fc07675ae29bd5c1e4504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, vVar, changeQuickRedirect, false, "8326efe16c4fc07675ae29bd5c1e4504");
            return;
        }
        if (vVar.l != null) {
            vVar.l.a();
        }
        if ((vVar.i instanceof WMRestaurantActivity) && ((WMRestaurantActivity) vVar.i).i()) {
            com.sankuai.waimai.business.restaurant.base.log.c.a("unrequire", (String) null);
            vVar.a(view);
            return;
        }
        com.sankuai.waimai.business.restaurant.base.log.a d = com.sankuai.waimai.business.restaurant.base.log.a.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.log.a.a;
        if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "60ba919e035c08062c115e85fd581415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "60ba919e035c08062c115e85fd581415");
        } else if (d.b > 0) {
            if (d.d > 0 && d.c > 0) {
                com.sankuai.waimai.platform.capacity.log.c.a().a(a.c.a(d.b()), "restaurant/calculate/food/submit/delay", SystemClock.elapsedRealtime());
            }
            com.sankuai.waimai.platform.capacity.log.c.a().a(a.C0818a.a(d.f), "restaurant/calculate/food/submit/calculateFail", SystemClock.elapsedRealtime());
            com.sankuai.waimai.platform.capacity.log.c.a().a(a.b.a(d.e), "restaurant/calculate/food/submit/calculateLast", SystemClock.elapsedRealtime());
            d.c();
        }
        boolean j = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(vVar.j.f()).j();
        RequiredTagInfo requiredTagInfo = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().h(vVar.j.f()) != null ? com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(vVar.j.f()).n : null;
        if (requiredTagInfo != null && requiredTagInfo.hasRequiredTag && !TextUtils.isEmpty(requiredTagInfo.requiredTagId) && (j || !requiredTagInfo.hasRequiredProduct)) {
            if (!TextUtils.isEmpty(requiredTagInfo.toast)) {
                ae.a(vVar.i, requiredTagInfo.toast);
            }
            com.sankuai.waimai.platform.domain.manager.poi.a a2 = com.sankuai.waimai.platform.domain.manager.poi.a.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.domain.manager.poi.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f8b52c6d99f6f4835696ace4efdcbc39", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f8b52c6d99f6f4835696ace4efdcbc39")).booleanValue();
            } else {
                if (a2.b != null && a2.b.size() != 0) {
                    com.sankuai.waimai.foundation.core.service.poi.b bVar = a2.b.get(a2.b.size() - 1);
                    if ((bVar instanceof com.sankuai.waimai.platform.domain.manager.poi.b) && !((com.sankuai.waimai.platform.domain.manager.poi.b) bVar).a()) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                String str = requiredTagInfo.requiredTagId;
                Object[] objArr4 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, vVar, changeQuickRedirect4, false, "bc2166d61378fd455efbd72239bd1b63", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, vVar, changeQuickRedirect4, false, "bc2166d61378fd455efbd72239bd1b63");
                } else if (!TextUtils.isEmpty(str)) {
                    vVar.p.m();
                    com.sankuai.waimai.platform.domain.manager.poi.a.a().a(vVar.j.f(), str);
                }
                com.sankuai.waimai.business.restaurant.base.log.c.a("need_require", requiredTagInfo.requiredTagId);
            }
            if (!vVar.l()) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (!(PatchProxy.isSupport(objArr5, vVar, changeQuickRedirect5, false, "3d027694e36a7f3e4b44d3a9cce904d4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, vVar, changeQuickRedirect5, false, "3d027694e36a7f3e4b44d3a9cce904d4")).booleanValue() : vVar.k.d())) {
                    return;
                }
            }
            vVar.i.finish();
            return;
        }
        com.sankuai.waimai.business.restaurant.base.log.c.a("added_require", (String) null);
        vVar.a(view);
    }

    public v(Activity activity, ab abVar, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar, String str) {
        Object[] objArr = {activity, abVar, gVar, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4132d31e3f82b17d861715a1c113d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4132d31e3f82b17d861715a1c113d1");
            return;
        }
        this.m = 0.0d;
        this.i = activity;
        this.j = gVar;
        this.k = aVar;
        this.n = str;
        this.p = abVar;
        this.o = new com.sankuai.waimai.platform.domain.core.response.a();
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1e9c740bf3fee32eb7dd862f245c8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1e9c740bf3fee32eb7dd862f245c8b");
            return;
        }
        int i = z ? 0 : 8;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3b8acbc16c0d74c99d39c2117f5f657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3b8acbc16c0d74c99d39c2117f5f657");
            return;
        }
        if (this.c != null) {
            this.c.setVisibility(i);
        }
        if (this.l != null) {
            w wVar = this.l;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = w.a;
            if (PatchProxy.isSupport(objArr3, wVar, changeQuickRedirect3, false, "43086df5e1c0af0be4e69d572ac2bd19", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, wVar, changeQuickRedirect3, false, "43086df5e1c0af0be4e69d572ac2bd19");
            } else if (wVar.g != null) {
                wVar.g.setVisibility(i);
            }
        }
        if (this.d != null) {
            this.d.setVisibility(i);
        }
    }

    public final void a() {
        int color;
        PoiShoppingCart.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a66d758fe2d2ca5a73f35b0198cee6e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a66d758fe2d2ca5a73f35b0198cee6e7");
        } else if (this.j.u() && !this.j.a()) {
            a(true);
            b();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad4c6ce78234fa71e7764cd381192bcf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad4c6ce78234fa71e7764cd381192bcf");
            } else if (this.l != null) {
                w wVar = this.l;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = w.a;
                if (PatchProxy.isSupport(objArr3, wVar, changeQuickRedirect3, false, "9875658cbf5bccf39406eb2b90fd3c66", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, wVar, changeQuickRedirect3, false, "9875658cbf5bccf39406eb2b90fd3c66");
                } else {
                    wVar.p.setVisibility(8);
                    wVar.r.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0aae58c98fabdbb51db15eb9db1420b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0aae58c98fabdbb51db15eb9db1420b5");
            } else {
                if (this.l != null) {
                    w wVar2 = this.l;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = w.a;
                    if (PatchProxy.isSupport(objArr5, wVar2, changeQuickRedirect5, false, "09d8cff4ef7aae9cf6d0d888703f7ce4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, wVar2, changeQuickRedirect5, false, "09d8cff4ef7aae9cf6d0d888703f7ce4");
                    } else {
                        wVar2.m.setTextSize(11.0f);
                        wVar2.n.setTextSize(11.0f);
                        ah.a(wVar2.l, com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 6.0f), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        wVar2.q.setPadding(com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 10.0f), 0, com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 5.0f), 0);
                    }
                }
                int a2 = com.sankuai.waimai.foundation.utils.g.a(this.i, 84.0f);
                ah.b(this.h, a2, Integer.MIN_VALUE);
                ah.b(this.g, a2, Integer.MIN_VALUE);
                ah.a(this.f, com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 2.5f), Integer.MIN_VALUE, a2, Integer.MIN_VALUE);
                this.g.setTextSize(12.0f);
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ddc101a273fe6c5b4cb1ef7b9bd3bb8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ddc101a273fe6c5b4cb1ef7b9bd3bb8b");
                return;
            }
            if (!TextUtils.isEmpty(this.j.l())) {
                b(ColorUtils.a(this.j.l(), this.i.getResources().getColor(R.color.wm_shopcart_bar_background)));
                this.e.setBackground(this.r);
                color = this.i.getResources().getColor(R.color.wm_shopcart_txt_with_bg_color);
            } else {
                b(this.i.getResources().getColor(R.color.wm_shopcart_bar_background));
                this.e.setBackground(this.r);
                color = this.i.getResources().getColor(R.color.wm_common_text_hint);
            }
            if (this.l != null) {
                w wVar3 = this.l;
                Object[] objArr7 = {Integer.valueOf(color)};
                ChangeQuickRedirect changeQuickRedirect7 = w.a;
                if (PatchProxy.isSupport(objArr7, wVar3, changeQuickRedirect7, false, "983403f9ab7b723104a86dac463b851f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, wVar3, changeQuickRedirect7, false, "983403f9ab7b723104a86dac463b851f");
                } else {
                    wVar3.l.setTextColor(color);
                    wVar3.n.setTextColor(color);
                    wVar3.r.setTextColor(color);
                    wVar3.o.setTextColor(color);
                }
            }
            PoiShoppingCart poiShoppingCart = this.j.g.getPoiShoppingCart();
            String str = null;
            if (poiShoppingCart != null && (aVar = poiShoppingCart.mBalanceButton) != null) {
                str = aVar.a;
            }
            if (!TextUtils.isEmpty(str)) {
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.c = str;
                a3.i = R.drawable.wm_shopcart_submit_btn_bg;
                a3.f = ImageQualityUtil.a();
                a3.e = 1;
                a3.a(this.h);
                return;
            }
            this.h.setImageResource(R.drawable.wm_shopcart_submit_btn_bg);
        } else {
            a(false);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576d2eeaa7d6b0438bdd85d7cdf014e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576d2eeaa7d6b0438bdd85d7cdf014e7");
            return;
        }
        u();
        w();
        t();
        q();
        c();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e85274e33534d067a43603411c7e65c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e85274e33534d067a43603411c7e65c");
        } else if (this.l != null) {
            this.l.c();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17dc3e5c2dc3f5bfbaace8eba2e61567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17dc3e5c2dc3f5bfbaace8eba2e61567");
            return;
        }
        String f = this.j.f();
        boolean checkAccount = com.sankuai.waimai.business.order.api.submit.c.a().checkAccount(this.i, com.sankuai.waimai.platform.domain.core.poi.b.a(f), f, a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER);
        com.sankuai.waimai.business.restaurant.base.log.c.c(checkAccount);
        if (checkAccount) {
            this.g.setEnabled(false);
            e();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8efda199aa1d99f7c12fa93ce06e8392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8efda199aa1d99f7c12fa93ce06e8392");
        } else if (com.sankuai.waimai.business.restaurant.base.manager.order.k.a().g(this.j.f())) {
            String f = this.j.f();
            String str = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(f).r;
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.d dVar = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(f).y;
            String str2 = "";
            String str3 = "";
            if (dVar != null) {
                str2 = dVar.a;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("wmCouponViewId")) {
                        str3 = jSONObject.optString("wmCouponViewId");
                    }
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
            d.a aVar = new d.a();
            aVar.b = this.i;
            aVar.c = this.o;
            aVar.d = f;
            d.a a2 = aVar.a(com.sankuai.waimai.platform.domain.core.poi.b.a(f));
            a2.e = this.j.g();
            a2.f = this.g;
            a2.g = this.n;
            a2.m = 15;
            a2.n = this.j.q;
            a2.i = this.k.d;
            a2.k = this.j.o;
            a2.l = this.j.x();
            a2.o = this.j.b();
            a2.p = this.j.c();
            a2.r = str2;
            a2.s = str3;
            a2.q = str;
            a2.t = v();
            if (com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(f).v != null) {
                a2.u = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(f).v.getApParams();
            }
            switch (this.k.c) {
                case 1:
                case 5:
                    a2.h = "from_restaurant";
                    com.sankuai.waimai.business.order.api.submit.d a3 = a2.a();
                    com.sankuai.waimai.business.restaurant.base.log.c.d(a3.a());
                    com.sankuai.waimai.business.order.api.submit.c.a().preOrder(a3);
                    return;
                case 2:
                    a2.h = "from_goods_detail";
                    com.sankuai.waimai.business.order.api.submit.d a4 = a2.a();
                    com.sankuai.waimai.business.restaurant.base.log.c.d(a4.a());
                    com.sankuai.waimai.business.order.api.submit.c.a().preOrder(a4);
                    return;
                case 3:
                    a2.l = false;
                    a2.h = "from_poi_productset";
                    com.sankuai.waimai.business.order.api.submit.d a5 = a2.a();
                    com.sankuai.waimai.business.restaurant.base.log.c.d(a5.a());
                    com.sankuai.waimai.business.order.api.submit.c.a().preOrder(a5);
                    return;
                case 4:
                    a2.k = 0;
                    a2.l = false;
                    a2.h = "from_search_in_shop";
                    com.sankuai.waimai.business.order.api.submit.d a6 = a2.a();
                    com.sankuai.waimai.business.restaurant.base.log.c.d(a6.a());
                    com.sankuai.waimai.business.order.api.submit.c.a().preOrder(a6);
                    return;
                default:
                    return;
            }
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb7b57ccd925dfd0066c142d6eb6a0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb7b57ccd925dfd0066c142d6eb6a0a");
            return;
        }
        if (i() && !com.sankuai.waimai.business.restaurant.composeorder.a.b) {
            o();
        } else if (j()) {
            m();
        } else if (!l() && k()) {
            n();
        }
        com.sankuai.waimai.business.restaurant.base.log.c.b(com.sankuai.waimai.business.restaurant.composeorder.a.b);
        if (com.sankuai.waimai.business.restaurant.composeorder.a.b) {
            p();
        } else if (this.j.m && view == this.g) {
            h();
        } else {
            d();
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e44e37fc6da8c6e2b02d9e577f20baca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e44e37fc6da8c6e2b02d9e577f20baca");
            return;
        }
        String f = this.j.f();
        if (com.sankuai.waimai.business.order.api.submit.c.a().checkAccount(this.i, com.sankuai.waimai.platform.domain.core.poi.b.a(f), f, a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER)) {
            com.sankuai.waimai.restaurant.shopcart.utils.c.a(this.j, this.i);
            com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(f);
            ArrayList<OrderedFood> h = n != null ? n.h() : null;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            if (h != null && h.size() > 0) {
                Iterator<OrderedFood> it = h.iterator();
                while (it.hasNext()) {
                    OrderedFood next = it.next();
                    sb.append(next.getSpuId());
                    sb.append(CommonConstant.Symbol.COMMA);
                    sb2.append(next.getSkuId());
                    sb2.append(CommonConstant.Symbol.COMMA);
                }
            }
            if (sb.length() > 0) {
                sb = sb.deleteCharAt(sb.length() - 1);
            }
            if (sb2.length() > 0) {
                sb2 = sb2.deleteCharAt(sb2.length() - 1);
            }
            String str = "";
            if (n != null && n.e != null) {
                str = n.e.mShippingFeeTxt;
            }
            JudasManualManager.a("b_waimai_079ssls5_mc").a("c_CijEL").a("poi_id", f).a("spu_id", sb.toString()).a("sku_id", sb2.toString()).a("delivery_fee", str).a();
            this.i.finish();
        }
    }

    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbc8a163f28b23e73e2f6566884797c2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbc8a163f28b23e73e2f6566884797c2")).booleanValue() : this.k.a();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61fb125d3f8bb1acf8d47b8b72aff85c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61fb125d3f8bb1acf8d47b8b72aff85c");
        } else {
            this.k.c = i;
        }
    }

    private boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5fe4dbf231403ed6e4fc3c5c2647bd8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5fe4dbf231403ed6e4fc3c5c2647bd8")).booleanValue() : this.k.b();
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88cffe452b0764759f7018f0d8d0d980", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88cffe452b0764759f7018f0d8d0d980")).booleanValue() : this.k.c();
    }

    private boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e0045fc6562871fc0a197405dff33db", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e0045fc6562871fc0a197405dff33db")).booleanValue() : this.k.e();
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54969ec878f6b875bea9077115403e2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54969ec878f6b875bea9077115403e2f");
            return;
        }
        String str = "";
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.j.f());
        int i = -1;
        if (n != null) {
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.d dVar = n.y;
            if (dVar != null) {
                try {
                    JSONObject jSONObject = new JSONObject(dVar.a);
                    i = jSONObject.has("wmCouponDiscountType") ? jSONObject.optInt("wmCouponDiscountType", -1) : -1;
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
            str = com.sankuai.waimai.foundation.utils.h.a(n.f());
        }
        JudasManualManager.a a2 = JudasManualManager.a("b_UJgTx").a("poi_id", this.j.f()).a("spu_id", com.sankuai.waimai.platform.domain.manager.goods.a.a().b()).a("stid", this.j.n).a("tag_type", i).a("order_amount", str).a("seckill_act", RestaurantSchemeParams.getSecKillTag(this.j.f()));
        a2.b = AppUtil.generatePageInfoKey(this.i);
        a2.a("c_u4fk4kw").a();
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94720bd63d5105164b0b8dce99c062d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94720bd63d5105164b0b8dce99c062d2");
            return;
        }
        JudasManualManager.a a2 = JudasManualManager.a("b_waimai_fuwto6sz_mc");
        a2.b = AppUtil.generatePageInfoKey(this.i);
        a2.a("c_CijEL").a();
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982ff244f7b613faf090a5dd74a868a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982ff244f7b613faf090a5dd74a868a1");
            return;
        }
        String str = "";
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.j.f());
        int i = -1;
        if (n != null) {
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.d dVar = n.y;
            if (dVar != null) {
                try {
                    JSONObject jSONObject = new JSONObject(dVar.a);
                    i = jSONObject.has("wmCouponDiscountType") ? jSONObject.optInt("wmCouponDiscountType", -1) : -1;
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
            str = com.sankuai.waimai.foundation.utils.h.a(n.f());
        }
        JudasManualManager.a a2 = JudasManualManager.a("b_ac7Bs").a("busy_reason", this.j.j ? "1" : "0").a("poi_id", this.j.f()).a("business_type", this.j.o).a(KernelConfig.KEY_CONTAINER_TYPE, String.valueOf(this.j.s())).a("stid", this.j.n).a("is_zengbao", this.j.y() ? "1" : "0").a("tag_type", i).a("order_amount", str).a("seckill_act", RestaurantSchemeParams.getSecKillTag(this.j.f())).a("brand_id", this.j.A());
        a2.b = AppUtil.generatePageInfoKey(this.i);
        a2.a("c_CijEL").a();
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d91612d806a2889f59c535a4abfa22f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d91612d806a2889f59c535a4abfa22f");
        } else {
            com.sankuai.waimai.business.restaurant.composeorder.a.a(this.j.f(), com.sankuai.waimai.business.restaurant.composeorder.a.a().e, com.sankuai.waimai.business.restaurant.composeorder.a.a().f, this.i, 2);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06eb536961c07c85cd48646cfe8a6ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06eb536961c07c85cd48646cfe8a6ec");
            return;
        }
        this.g.setEnabled(z);
        this.g.getPaint().setFakeBoldText(z);
        this.h.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.restaurant.shopcart.ui.v.q():void");
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0036a4275554d5256dd680cd1aa6b1a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0036a4275554d5256dd680cd1aa6b1a9");
        } else if (this.q) {
        } else {
            this.q = true;
            JudasManualManager.b("b_waimai_079ssls5_mv").a("c_CijEL").a();
        }
    }

    private void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9afcad237759557ad8bc25663f3ff117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9afcad237759557ad8bc25663f3ff117");
        } else if (z) {
            a(this.g, str, str2);
        } else {
            a(str);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b576043a2e07b7c21f4316e22a4d29f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b576043a2e07b7c21f4316e22a4d29f");
        } else {
            this.g.setText(str);
        }
    }

    private void a(TextView textView, String str, String str2) {
        Object[] objArr = {textView, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7fd8d57957e46ed3cf9dccf744c865a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7fd8d57957e46ed3cf9dccf744c865a");
        } else {
            a(textView, str, str2, 11);
        }
    }

    private void a(TextView textView, String str, String str2, int i) {
        Object[] objArr = {textView, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f33c67de17b5e6030a19c34fb79460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f33c67de17b5e6030a19c34fb79460");
            return;
        }
        SpannableString spannableString = new SpannableString(str + "\n" + str2);
        spannableString.setSpan(new AbsoluteSizeSpan(com.sankuai.waimai.foundation.utils.g.d(com.meituan.android.singleton.b.a, (float) i)), str.length(), spannableString.length(), 33);
        textView.setLineSpacing((float) com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 4.0f), 1.0f);
        textView.setMaxLines(2);
        textView.setText(spannableString);
    }

    private void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f3a18a3f1e18dc28013b55e18b1a217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f3a18a3f1e18dc28013b55e18b1a217");
        } else if (z) {
            this.g.setEnabled(true);
            if (z2) {
                this.g.setTextColor(a(this.g, 16842910, -13421773));
            } else {
                this.g.setTextColor(a(this.g, -16842910, -6710887));
            }
        }
    }

    private int a(TextView textView, int i, int i2) {
        Object[] objArr = {textView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93df43eb37c672cc4a6e7c77b016cda", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93df43eb37c672cc4a6e7c77b016cda")).intValue() : textView.getTextColors() == null ? i2 : textView.getTextColors().getColorForState(new int[]{i}, i2);
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fbf2571fd35534082207f886bbfb1a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fbf2571fd35534082207f886bbfb1a7");
        }
        boolean j = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.j.f()).j();
        RequiredTagInfo requiredTagInfo = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().h(this.j.f()) != null ? com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.j.f()).n : null;
        if (requiredTagInfo == null || !requiredTagInfo.hasRequiredTag || TextUtils.isEmpty(requiredTagInfo.requiredTagId)) {
            return "";
        }
        if (j || !requiredTagInfo.hasRequiredProduct) {
            return TextUtils.isEmpty(requiredTagInfo.tips) ? this.i.getResources().getString(R.string.wm_shopcart_necessary_food_not_selected) : requiredTagInfo.tips;
        }
        return "";
    }

    private String s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db9e2ca162773ab7e945bb2612498c27", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db9e2ca162773ab7e945bb2612498c27");
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.j.f());
        String str = "";
        if (n != null && n.e != null) {
            str = n.e.previewSubTip;
        }
        return TextUtils.isEmpty(str) ? com.meituan.android.singleton.b.a.getString(R.string.wm_shopcart_cross_shipping_fee) : str;
    }

    private static boolean a(com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.h hVar) {
        if (hVar == null) {
            return false;
        }
        return hVar.a;
    }

    private String b(com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286d9b1d4043532cc8f3099c5a5a3cff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286d9b1d4043532cc8f3099c5a5a3cff") : !a(hVar) ? "" : TextUtils.isEmpty(hVar.b) ? "单点不配送" : hVar.b;
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0959bea2cec87afe9335632b4c5c6703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0959bea2cec87afe9335632b4c5c6703");
        } else if (this.l != null) {
            this.l.e();
        }
    }

    private void u() {
        PoiShoppingCart.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78f823b68c9b4d062b20ada67a9036c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78f823b68c9b4d062b20ada67a9036c");
            return;
        }
        if (!TextUtils.isEmpty(this.j.l())) {
            this.g.setTextColor(this.i.getResources().getColorStateList(R.color.wm_shopcart_rest_txt_btn_submit_promotion));
        } else {
            this.g.setTextColor(this.i.getResources().getColorStateList(R.color.wm_shopcart_txt_btn_solid));
        }
        Integer num = null;
        PoiShoppingCart poiShoppingCart = this.j.g.getPoiShoppingCart();
        if (poiShoppingCart != null && (aVar = poiShoppingCart.mBalanceButton) != null) {
            num = ColorUtils.a(aVar.b);
        }
        if (num != null) {
            this.g.setTextColor(new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{num.intValue(), this.i.getResources().getColor(R.color.wm_shopcart_txt_with_bg_color)}));
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef0a26614d6925661354366002fe9e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef0a26614d6925661354366002fe9e4");
            return;
        }
        if (this.r == null) {
            this.r = new GradientDrawable();
            this.r.setShape(0);
            this.r.setCornerRadius(com.sankuai.waimai.foundation.utils.g.a(this.i, 2.0f));
        }
        this.r.setColor(i);
    }

    private String v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6431c9ac2d2be46c0c7f272b1d114152", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6431c9ac2d2be46c0c7f272b1d114152");
        }
        try {
            String a2 = com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(this.i.getIntent(), "preview_order_callback_info", "preview_order_callback_info", "");
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("preview_order_callback_info", a2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90bb053d51eaf21bd7f8a3e74e80791b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90bb053d51eaf21bd7f8a3e74e80791b");
        } else if (this.l != null) {
            this.l.b();
        }
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45fd6fb778849e9d66b5bb658472f0e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45fd6fb778849e9d66b5bb658472f0e3")).booleanValue();
        }
        com.sankuai.waimai.restaurant.shopcart.utils.c.a(this.j, this.i);
        return false;
    }
}
