package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.FloatVoucherMRNBlock;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.f;
import com.sankuai.waimai.business.restaurant.poicontainer.views.SafeViewPager;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.manager.observers.a;
import com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment;
import com.sankuai.waimai.platform.restaurant.membercoupon.MemberCouponListOutput;
import com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.restaurant.framework.a implements f.a, a.InterfaceC1050a, com.sankuai.waimai.platform.restaurant.membercoupon.f {
    public static ChangeQuickRedirect b;
    public View c;
    public View d;
    public FloatCouponTabLayout e;
    public SafeViewPager j;
    public TranslateAnimation k;
    public Context l;
    public b m;
    public b n;
    c o;
    public boolean p;
    boolean q;
    g r;
    public int s;
    private String t;
    private TranslateAnimation u;
    private FloatCouponHelper v;

    public a(@NonNull Context context, g gVar, String str) {
        Object[] objArr = {context, gVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a1dfba66e717d86b3cbb7d429fd4f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a1dfba66e717d86b3cbb7d429fd4f7");
            return;
        }
        this.l = context;
        this.r = gVar;
        this.t = str;
        this.v = new FloatCouponHelper(context, gVar, str, this);
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.a
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37854d8aca30ec7b1fa41b49c99dd304", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37854d8aca30ec7b1fa41b49c99dd304");
        }
        this.c = viewGroup;
        View inflate = layoutInflater.inflate(R.layout.wm_restaurant_float_coupon_float_layer, viewGroup, false);
        this.d = inflate.findViewById(R.id.ll_content);
        this.j = (SafeViewPager) inflate.findViewById(R.id.vp_float_coupon);
        this.e = (FloatCouponTabLayout) inflate.findViewById(R.id.tab_float_coupon);
        ((ImageView) inflate.findViewById(R.id.close_button)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b911712be4d60fe068652d2cf29cfcd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b911712be4d60fe068652d2cf29cfcd");
                } else {
                    a.this.e();
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "542b88ecf3ebe89aa068b404c3c72a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "542b88ecf3ebe89aa068b404c3c72a0f");
        } else {
            this.k = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.k.setDuration(300L);
            this.u = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            this.u.setDuration(300L);
            this.u.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.4
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr3 = {animation};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "18f887defc104fd5cad8d09b26c826b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "18f887defc104fd5cad8d09b26c826b9");
                        return;
                    }
                    a.this.c.setVisibility(8);
                    if (a.this.m instanceof c) {
                        ((c) a.this.m).f();
                    }
                    if (a.this.n instanceof c) {
                        ((c) a.this.n).f();
                    }
                }
            });
        }
        return inflate;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28e046c8622d30d08466b889f94e4640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28e046c8622d30d08466b889f94e4640");
            return;
        }
        a(false);
        this.q = false;
        com.sankuai.waimai.platform.domain.manager.observers.a.a().b(this);
        String f = this.r.f();
        com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[FloatCouponBlock-hideCoupon] poiIdStr：" + f, new Object[0]);
        JudasManualManager.a a = JudasManualManager.a("b_waimai_mb05k9aa_mc", "c_CijEL", AppUtil.generatePageInfoKey(this.l));
        if (TextUtils.isEmpty(f)) {
            f = this.r.f();
        }
        a.a("poi_id", f).a();
        this.d.setVisibility(0);
        this.d.clearAnimation();
        k();
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8837bb5d346510dad294e4da14b3b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8837bb5d346510dad294e4da14b3b7");
            return;
        }
        View findViewById = this.c.getRootView().findViewById(R.id.layout_shop_action_bar_container);
        View findViewById2 = this.c.getRootView().findViewById(R.id.restaurant_full_reduce_entrance_layout);
        View findViewById3 = this.c.getRootView().findViewById(R.id.shopcart_yellow_bar_hint);
        if (findViewById3 != null) {
            com.sankuai.waimai.restaurant.shopcart.utils.g.a((View) findViewById3.getParent(), !z ? 1 : 0);
        }
        com.sankuai.waimai.restaurant.shopcart.utils.g.a(findViewById, !z ? 1 : 0);
        com.sankuai.waimai.restaurant.shopcart.utils.g.a(findViewById2, !z ? 1 : 0);
        com.sankuai.waimai.restaurant.shopcart.utils.g.a(findViewById3, !z ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d5d5ee1fca9f0c0da7ee4488cd3d84e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d5d5ee1fca9f0c0da7ee4488cd3d84e");
            return;
        }
        Boolean bool = null;
        if (this.m instanceof e) {
            e eVar = (e) this.m;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.b;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "64c4103f3ec08ce5bced1a9c6ca428d9", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "64c4103f3ec08ce5bced1a9c6ca428d9")).booleanValue();
            } else if (eVar.c != null && eVar.c.b) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        } else if (this.m instanceof d) {
            d dVar = (d) this.m;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d.b;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "4e5d5efb64d236dcc52db5d757b090ee", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "4e5d5efb64d236dcc52db5d757b090ee")).booleanValue();
            } else if (dVar.c != null && dVar.c.e) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        }
        if (bool == null) {
            return;
        }
        JudasManualManager.a("b_waimai_olq9p05m_mc", "c_CijEL", AppUtil.generatePageInfoKey(this.l)).a("coupon_user_type", !bool.booleanValue()).a();
    }

    public b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb45282bc535a526eeca069976421264", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb45282bc535a526eeca069976421264");
        }
        FloatVoucherMRNBlock.FloatCouponContainerFragment floatCouponContainerFragment = new FloatVoucherMRNBlock.FloatCouponContainerFragment();
        FloatVoucherMRNBlock floatVoucherMRNBlock = new FloatVoucherMRNBlock(com.sankuai.waimai.platform.domain.core.poi.b.a(this.r.f()), this.r.f(), i, floatCouponContainerFragment);
        floatCouponContainerFragment.b = floatVoucherMRNBlock;
        return floatVoucherMRNBlock;
    }

    public b g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f2fa069b975651a85c47b4213709e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f2fa069b975651a85c47b4213709e8");
        }
        Bundle j = j();
        if (com.sankuai.waimai.platform.restaurant.membercoupon.g.b()) {
            MPFloatCouponMemberFragment mPFloatCouponMemberFragment = new MPFloatCouponMemberFragment();
            mPFloatCouponMemberFragment.setArguments(j);
            return new d(this.t, com.sankuai.waimai.platform.domain.core.poi.b.a(this.r.f()), this.r.f(), this, mPFloatCouponMemberFragment);
        }
        RNFloatCouponMemberFragment rNFloatCouponMemberFragment = new RNFloatCouponMemberFragment();
        rNFloatCouponMemberFragment.setArguments(j);
        return new e(this.t, com.sankuai.waimai.platform.domain.core.poi.b.a(this.r.f()), this.r.f(), this, rNFloatCouponMemberFragment);
    }

    private Bundle j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63cbf7e42093c33ff1501b5a01a146a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63cbf7e42093c33ff1501b5a01a146a1");
        }
        Bundle bundle = new Bundle();
        bundle.putString("bundle_name", "mach_pro_waimai_restaurant_membership_float_layer_style_0");
        bundle.putInt("coupon_type", this.s);
        bundle.putLong("poi_id", com.sankuai.waimai.platform.domain.core.poi.b.a(this.r.f()));
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, this.r.f());
        com.sankuai.waimai.foundation.utils.log.a.b("MRN_MEMBER_FLOAT", "FloatCouponBlock, getArguments()", new Object[0]);
        return bundle;
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34befe40497812d9dc1cccbb8ed020f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34befe40497812d9dc1cccbb8ed020f7");
        } else if (this.e != null && (this.o instanceof e)) {
            FloatCouponTabLayout floatCouponTabLayout = this.e;
            if (TextUtils.isEmpty(str)) {
                str = this.l.getString(R.string.wm_restaurant_tab_float_coupon_member);
            }
            View a = this.e.a(0);
            Object[] objArr2 = {str, a};
            ChangeQuickRedirect changeQuickRedirect2 = FloatCouponTabLayout.a;
            if (PatchProxy.isSupport(objArr2, floatCouponTabLayout, changeQuickRedirect2, false, "1fff9422390cd5dce5e2bb5d7e45e7ec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, floatCouponTabLayout, changeQuickRedirect2, false, "1fff9422390cd5dce5e2bb5d7e45e7ec");
            } else if (a != null) {
                ((TextView) a.findViewById(R.id.tv_tab)).setText(str);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1a78c2932199fccb091089598e340ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1a78c2932199fccb091089598e340ca");
        } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            this.r.v = null;
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
    public final void a(@NonNull MemberCouponListOutput memberCouponListOutput) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f384f26f1db44ea32474b4da62c837d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f384f26f1db44ea32474b4da62c837d");
        } else if (this.o == null || !(this.o instanceof e) || this.o.e() || !this.q) {
        } else {
            f();
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.observers.a.InterfaceC1050a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca75ba4a0ed31bbdc480fe458b22a7be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca75ba4a0ed31bbdc480fe458b22a7be");
            return;
        }
        if (i != 1) {
            switch (i) {
                case 3:
                case 4:
                    break;
                default:
                    return;
            }
        }
        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(this.r.f());
    }

    @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b63f37d0fb7fb7e3fd407884bbbd05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b63f37d0fb7fb7e3fd407884bbbd05");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.observers.a.a().b(this);
        k();
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5af90138905f53e7fa70fd4b015d16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5af90138905f53e7fa70fd4b015d16");
            return;
        }
        this.d.startAnimation(this.u);
        this.d.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "129fd91b5cf2acdea1fa41487dafedd3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "129fd91b5cf2acdea1fa41487dafedd3");
                    return;
                }
                a.this.c.setVisibility(8);
                if (a.this.m instanceof c) {
                    ((c) a.this.m).f();
                }
                if (a.this.n instanceof c) {
                    ((c) a.this.n).f();
                }
            }
        }, 300L);
    }
}
