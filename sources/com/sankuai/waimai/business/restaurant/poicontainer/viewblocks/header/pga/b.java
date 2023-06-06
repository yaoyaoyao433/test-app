package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.framework.i;
import com.sankuai.waimai.business.restaurant.framework.viewpager.FloatFragmentAdapter;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.FloatCouponHelper;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.FloatVoucherMRNBlock;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.FloatVoucherMRNFragment;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.d;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.e;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_r_coupon_popup_container"}, viewModel = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a.class)
/* loaded from: classes4.dex */
public class b extends com.sankuai.waimai.business.restaurant.base.config.b<com.meituan.android.cube.pga.view.a, com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect t;
    public com.sankuai.waimai.business.restaurant.framework.backpress.a u;
    private com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a v;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0098667200057af1c415a3107558c52", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0098667200057af1c415a3107558c52") : new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a();
    }

    public b(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36e49239bf6aa346c4e4f3122be961a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36e49239bf6aa346c4e4f3122be961a");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c798948947551ee1f0e31cd851d3de2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c798948947551ee1f0e31cd851d3de2");
        }
        FrameLayout frameLayout = new FrameLayout(m());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setVisibility(8);
        return new com.meituan.android.cube.pga.view.a(m(), frameLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.support.v4.app.FragmentActivity, android.arch.lifecycle.f] */
    @Override // com.meituan.android.cube.pga.block.b
    public final void H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c58ffc9c01dc18cb8a10b167fd9f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c58ffc9c01dc18cb8a10b167fd9f97");
            return;
        }
        super.H();
        ViewGroup viewGroup = (ViewGroup) this.g.a();
        String w = ((BaseActivity) l()).w();
        i iVar = new i(m());
        iVar.a(this);
        viewGroup.setVisibility(8);
        this.v = new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a(l(), ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b, w);
        this.v.a(iVar, null, 2);
        viewGroup.addView(this.v.a(LayoutInflater.from(m()), viewGroup));
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).M.a.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.b[] bVarArr;
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12ec544fa9271d6daac680e1be5229ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12ec544fa9271d6daac680e1be5229ba");
                    return;
                }
                if (b.this.v != null) {
                    final com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a aVar = b.this.v;
                    final int intValue = num2.intValue();
                    Object[] objArr3 = {Integer.valueOf(intValue)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.b;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "7b08b83df1bce31565d558eebc3cb420", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "7b08b83df1bce31565d558eebc3cb420");
                    } else {
                        aVar.a(true);
                        com.sankuai.waimai.platform.domain.manager.observers.a.a().a(aVar);
                        aVar.s = intValue;
                        if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                            if (!aVar.p) {
                                Object[] objArr4 = {Integer.valueOf(intValue)};
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.b;
                                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "8c9e3acb81791608ff241d23097a9ca1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "8c9e3acb81791608ff241d23097a9ca1");
                                } else {
                                    Object[] objArr5 = {Integer.valueOf(intValue)};
                                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.b;
                                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "03220194d67ad0a0d1279b0c265ede0f", RobustBitConfig.DEFAULT_VALUE)) {
                                        bVarArr = (com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.b[]) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "03220194d67ad0a0d1279b0c265ede0f");
                                    } else if (FloatCouponHelper.b == null) {
                                        bVarArr = null;
                                    } else if (((String[]) FloatCouponHelper.b.first).length > 1) {
                                        aVar.m = aVar.g();
                                        aVar.a((com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a) aVar.m);
                                        aVar.n = aVar.a(intValue);
                                        aVar.a((com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a) aVar.n);
                                        bVarArr = new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.b[]{aVar.m, aVar.n};
                                        aVar.e.a(true);
                                    } else if (((String[]) FloatCouponHelper.b.first).length == 1 && ((Boolean) FloatCouponHelper.b.second).booleanValue()) {
                                        aVar.m = aVar.g();
                                        aVar.a((com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a) aVar.m);
                                        bVarArr = new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.b[]{aVar.m};
                                        aVar.e.a(false);
                                    } else {
                                        aVar.n = aVar.a(intValue);
                                        aVar.a((com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a) aVar.n);
                                        bVarArr = new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.b[]{aVar.n};
                                        aVar.e.a(false);
                                    }
                                    if (bVarArr != null) {
                                        FloatFragmentAdapter floatFragmentAdapter = new FloatFragmentAdapter(((FragmentActivity) aVar.c()).getSupportFragmentManager(), bVarArr);
                                        aVar.j.setAdapter(floatFragmentAdapter);
                                        floatFragmentAdapter.b = (String[]) FloatCouponHelper.b.first;
                                        aVar.e.setupWithViewPager(aVar.j);
                                        aVar.j.setCanScrollHorizontal(false);
                                        aVar.j.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.FloatCouponBlock$5
                                            public static ChangeQuickRedirect a;

                                            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                                            public void onPageScrollStateChanged(int i) {
                                            }

                                            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                                            public void onPageScrolled(int i, float f, int i2) {
                                            }

                                            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                                            public void onPageSelected(int i) {
                                                Object[] objArr6 = {Integer.valueOf(i)};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b3f55c00b783e83878265e1301fb8c2a", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b3f55c00b783e83878265e1301fb8c2a");
                                                    return;
                                                }
                                                a.this.q = true;
                                                a.this.e.b(i);
                                                if (i == 0) {
                                                    a.this.o = (c) a.this.m;
                                                    if (a.this.o != null && a.this.o.e()) {
                                                        a.this.f();
                                                    }
                                                } else {
                                                    a.this.o = (c) a.this.n;
                                                    String f = a.this.r.f();
                                                    com.sankuai.waimai.foundation.utils.log.a.c("member_log", "[MemberExchangeHelper-setupViewPager-onPageSelected] poiIdStr：" + f, new Object[0]);
                                                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_yrg5dm44_mc", "c_CijEL", AppUtil.generatePageInfoKey(a.this.l));
                                                    if (TextUtils.isEmpty(f)) {
                                                        f = a.this.r.f();
                                                    }
                                                    a2.a("poi_id", f).a();
                                                }
                                                if (a.this.o == null || a.this.o.e()) {
                                                    return;
                                                }
                                                a.this.o.g();
                                            }
                                        });
                                        aVar.p = true;
                                    }
                                }
                            }
                            if (aVar.n instanceof FloatVoucherMRNBlock) {
                                FloatVoucherMRNBlock floatVoucherMRNBlock = (FloatVoucherMRNBlock) aVar.n;
                                Object[] objArr6 = {Integer.valueOf(intValue)};
                                ChangeQuickRedirect changeQuickRedirect6 = FloatVoucherMRNBlock.b;
                                if (PatchProxy.isSupport(objArr6, floatVoucherMRNBlock, changeQuickRedirect6, false, "1e59080a75e2b904f3a46a482a8ad3ad", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, floatVoucherMRNBlock, changeQuickRedirect6, false, "1e59080a75e2b904f3a46a482a8ad3ad");
                                } else {
                                    floatVoucherMRNBlock.c = intValue;
                                    if (floatVoucherMRNBlock.j) {
                                        floatVoucherMRNBlock.j = false;
                                        try {
                                            floatVoucherMRNBlock.k = FloatVoucherMRNFragment.a(floatVoucherMRNBlock.d, floatVoucherMRNBlock.e, floatVoucherMRNBlock.c);
                                            Activity c = floatVoucherMRNBlock.c();
                                            if (c instanceof FragmentActivity) {
                                                ((FragmentActivity) c).getSupportFragmentManager().beginTransaction().replace(R.id.float_voucher_fragment_container, floatVoucherMRNBlock.k).commitAllowingStateLoss();
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            }
                            if (aVar.m instanceof e) {
                                e eVar = (e) aVar.m;
                                Object[] objArr7 = {Integer.valueOf(intValue)};
                                ChangeQuickRedirect changeQuickRedirect7 = e.b;
                                if (PatchProxy.isSupport(objArr7, eVar, changeQuickRedirect7, false, "917aca485824810635f8068ea49250c2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, eVar, changeQuickRedirect7, false, "917aca485824810635f8068ea49250c2");
                                } else if (eVar.c != null) {
                                    eVar.c.k = intValue;
                                }
                            } else if (aVar.m instanceof d) {
                                d dVar = (d) aVar.m;
                                Object[] objArr8 = {Integer.valueOf(intValue)};
                                ChangeQuickRedirect changeQuickRedirect8 = d.b;
                                if (PatchProxy.isSupport(objArr8, dVar, changeQuickRedirect8, false, "3cee547b1a7d68a9dcd023d56b46259e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, dVar, changeQuickRedirect8, false, "3cee547b1a7d68a9dcd023d56b46259e");
                                } else if (dVar.c != null) {
                                    dVar.c.m = intValue;
                                }
                            }
                            if (aVar.c.getVisibility() == 8) {
                                aVar.c.setVisibility(0);
                                Object[] objArr9 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.b;
                                if (PatchProxy.isSupport(objArr9, aVar, changeQuickRedirect9, false, "4627dec34b7ab432cc98c81d6472dd63", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr9, aVar, changeQuickRedirect9, false, "4627dec34b7ab432cc98c81d6472dd63");
                                } else {
                                    aVar.d.startAnimation(aVar.k);
                                    aVar.d.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.6
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr10 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect10 = a;
                                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "7a9d5c3aa945a872f6f792d7dec7c0ef", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "7a9d5c3aa945a872f6f792d7dec7c0ef");
                                            } else if (aVar.o != null) {
                                                aVar.o.g();
                                            }
                                        }
                                    }, 300L);
                                }
                            }
                            aVar.j.post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i = 0;
                                    Object[] objArr10 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect10 = a;
                                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "2272c9b7558f6e638f0db028e4f69c1c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "2272c9b7558f6e638f0db028e4f69c1c");
                                        return;
                                    }
                                    if (intValue != 2 && intValue != 9 && intValue != 8) {
                                        i = 1;
                                    }
                                    if (i == 0) {
                                        aVar.o = (c) aVar.m;
                                    } else {
                                        aVar.o = (c) aVar.n;
                                    }
                                    aVar.j.setCurrentItem(i);
                                    aVar.e.b(i);
                                }
                            });
                        } else {
                            com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COUPON;
                            com.sankuai.waimai.platform.domain.manager.user.a.a(aVar.l, new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr10 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect10 = a;
                                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "95914f11809b7c83f8a17599ef00c6a8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "95914f11809b7c83f8a17599ef00c6a8");
                                    } else {
                                        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(aVar.r.f());
                                    }
                                }
                            });
                        }
                    }
                }
                ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) b.this.F()).I.a.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.FALSE);
                Boolean bool = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) b.this.F()).H.f.a().b;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) b.this.F()).H.b.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
            }
        });
        this.u = new com.sankuai.waimai.business.restaurant.framework.backpress.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.b.2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.framework.backpress.a
            public final boolean b() {
                boolean z;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "032e2b08d09f252ac5ff475ab91e87d9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "032e2b08d09f252ac5ff475ab91e87d9")).booleanValue();
                }
                if (b.this.v != null) {
                    com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a aVar = b.this.v;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.a.b;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "1a44c3581f2d2cde93478604bbf6d0a8", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "1a44c3581f2d2cde93478604bbf6d0a8")).booleanValue();
                    } else {
                        z = aVar.c.getVisibility() == 0;
                    }
                    if (z) {
                        b.this.v.e();
                        return true;
                    }
                }
                return false;
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.j.a().b.a(l(), this.u);
    }
}
