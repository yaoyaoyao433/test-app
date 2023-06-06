package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.lottie.LottieResItem;
import com.sankuai.waimai.lottie.SafeLottieAnimationView;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCart;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    ImageView b;
    View c;
    TextView d;
    a e;
    SafeLottieAnimationView f;
    boolean g;
    private final Activity h;
    private final com.sankuai.waimai.business.restaurant.base.manager.order.g i;
    private Drawable j;
    private Drawable k;
    private String l;
    private String m;
    private PopupWindow n;
    private com.sankuai.waimai.restaurant.shopcart.config.a o;
    private CountDownTimer p;

    public d(Activity activity, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar) {
        Object[] objArr = {activity, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ab0c7717ef8225d7c0e8d05a6a57bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ab0c7717ef8225d7c0e8d05a6a57bc");
            return;
        }
        this.g = false;
        this.h = activity;
        this.i = gVar;
        this.o = aVar;
        this.j = com.sankuai.waimai.restaurant.shopcart.config.b.a().b;
        this.k = com.sankuai.waimai.restaurant.shopcart.config.b.a().c;
        this.l = com.sankuai.waimai.restaurant.shopcart.config.b.a().d;
        this.m = com.sankuai.waimai.restaurant.shopcart.config.b.a().e;
        this.e = new a();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb11ae9e847bb40f245ab1feb86fdd3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb11ae9e847bb40f245ab1feb86fdd3e");
        } else if (this.i.u() && !this.i.a()) {
            this.c.setVisibility(0);
            b();
        } else {
            this.c.setVisibility(8);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "602284b0cf54a572c2c3c02cc9904115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "602284b0cf54a572c2c3c02cc9904115");
            return;
        }
        int i = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().i(this.i.f());
        if (i > 0) {
            this.d.setText(String.valueOf(i));
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        e();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd3288905bb344d147ed3412e95fbdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd3288905bb344d147ed3412e95fbdb");
            return;
        }
        if (this.p != null) {
            this.p.cancel();
            this.p = null;
        }
        if (this.n == null || !this.n.isShowing()) {
            return;
        }
        com.sankuai.waimai.platform.utils.p.b(this.n);
        this.n = null;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e33d59c55ebcd8773156bb8c6d02f85a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e33d59c55ebcd8773156bb8c6d02f85a");
        } else if (this.n == null || !this.n.isShowing()) {
        } else {
            com.sankuai.waimai.platform.utils.p.b(this.n);
            this.n = null;
        }
    }

    public final boolean a(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f750751b0a4748b4f59cd1a0b2a4a299", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f750751b0a4748b4f59cd1a0b2a4a299")).booleanValue();
        }
        a aVar = this.e;
        Activity activity = this.h;
        if (view2 == null) {
            view2 = this.c;
        }
        return aVar.a(activity, view, view2, (ViewGroup) this.h.getWindow().getDecorView());
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04cf82117d646805f8b197439d0e707d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04cf82117d646805f8b197439d0e707d")).booleanValue() : g() || h() || i();
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ddfdc21e561e47ddd5b2e83343a1df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ddfdc21e561e47ddd5b2e83343a1df")).booleanValue() : com.sankuai.waimai.business.restaurant.base.manager.order.k.a().g(this.i.f());
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe715e6749c21886df92e05bfa649776", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe715e6749c21886df92e05bfa649776")).booleanValue();
        }
        if (this.j != null) {
            if (f()) {
                this.b.setImageDrawable(this.j);
            } else if (this.k != null) {
                this.b.setImageDrawable(this.k);
            } else {
                this.b.setImageResource(R.drawable.waimai_c_wm_shopcart_mt_delivery_new_disable);
            }
            a(false);
            return true;
        } else if (TextUtils.isEmpty(this.l)) {
            return false;
        } else {
            if (f()) {
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.c = this.l;
                a2.j = R.drawable.waimai_c_pagekit_icon_shoppingcart_unempty_12;
                a2.a(this.b);
            } else if (!TextUtils.isEmpty(this.m)) {
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.c = this.m;
                a3.j = R.drawable.waimai_c_wm_shopcart_mt_delivery_new_disable;
                a3.a(this.b);
            } else {
                this.b.setImageDrawable(this.h.getResources().getDrawable(R.drawable.waimai_c_wm_shopcart_mt_delivery_new_disable));
            }
            a(false);
            return true;
        }
    }

    private boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b0f7c20b94ad839394f24c4cfad1f1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b0f7c20b94ad839394f24c4cfad1f1e")).booleanValue();
        }
        boolean f = f();
        PoiShoppingCart.CartIcon k = this.i.k();
        if (k == null || k.type == 0) {
            return false;
        }
        String str = f ? k.shoppingCartIcon : k.emptyShoppingCartIcon;
        if (!TextUtils.isEmpty(str)) {
            int i = f ? R.drawable.waimai_c_pagekit_icon_shoppingcart_unempty_12 : R.drawable.waimai_c_wm_shopcart_mt_delivery_new_disable;
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.f = ImageQualityUtil.a(2);
            a2.c = str;
            a2.j = i;
            a2.a(this.b);
            a(false);
        }
        if (k.type == 1) {
            return true;
        }
        if (k.type == 2) {
            if (!this.g) {
                ArrayList arrayList = new ArrayList();
                LottieResItem lottieResItem = k.lottieResItem;
                arrayList.add(lottieResItem);
                com.sankuai.waimai.lottie.d.a().a(arrayList, "wm-rest-lottie");
                com.sankuai.waimai.lottie.e.a().a(this.f, lottieResItem.key, k.fileName, "wm-rest-lottie", new com.sankuai.waimai.lottie.c() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.lottie.c
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e164ea0b41967156454d3a0fa61da4f7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e164ea0b41967156454d3a0fa61da4f7");
                        } else if (d.this.f != null) {
                            d.this.g = false;
                            d.this.f.setTag(Boolean.valueOf(d.this.g));
                        }
                    }

                    @Override // com.sankuai.waimai.lottie.c
                    public final void a(com.airbnb.lottie.e eVar) {
                        Object[] objArr2 = {eVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e678f411da2c68281e3e68300f9a4c8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e678f411da2c68281e3e68300f9a4c8");
                        } else if (d.this.f != null) {
                            d.this.g = true;
                            d.this.f.setTag(Boolean.valueOf(d.this.g));
                        }
                    }

                    @Override // com.sankuai.waimai.lottie.c
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58903f72fcfefefa844d9e7c429e4941", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58903f72fcfefefa844d9e7c429e4941");
                        } else if (d.this.f != null) {
                            d.this.g = false;
                            d.this.f.setTag(Boolean.valueOf(d.this.g));
                        }
                    }
                });
            }
            return true;
        }
        return false;
    }

    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4e598f8d0109c318fbc943fcfaf5151", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4e598f8d0109c318fbc943fcfaf5151")).booleanValue();
        }
        this.b.setImageResource(f() ? R.drawable.wm_shopcart_divivery_animation : R.drawable.waimai_c_wm_shopcart_mt_delivery_new_disable);
        a(true);
        return true;
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ace0d5f0f991e4901d50a73b3456f2f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ace0d5f0f991e4901d50a73b3456f2f2");
            return;
        }
        int a2 = com.sankuai.waimai.foundation.utils.g.a(this.h, 50.0f);
        int a3 = com.sankuai.waimai.foundation.utils.g.a(this.h, 62.0f);
        int a4 = com.sankuai.waimai.foundation.utils.g.a(this.h, 15.5f);
        ah.b(this.c, a2, a3);
        ah.a(this.c, a4, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
