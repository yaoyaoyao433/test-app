package com.sankuai.waimai.platform.restaurant.membercoupon;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.platform.machpro.container.MPPayBaseFragment;
import com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment;
import com.sankuai.waimai.platform.restaurant.membercoupon.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPFloatCouponMemberFragment extends MPPayBaseFragment {
    public static ChangeQuickRedirect c;
    boolean d;
    public boolean e;
    public boolean j;
    public f k;
    public d l;
    public int m;
    public RNFloatCouponMemberFragment.a n;
    public c o;
    private Dialog p;
    private i q;
    private final com.sankuai.waimai.machpro.h r;

    public MPFloatCouponMemberFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61dd1ff866cf6bfb7cec94805e28e61c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61dd1ff866cf6bfb7cec94805e28e61c");
            return;
        }
        this.m = 0;
        this.r = new com.sankuai.waimai.machpro.h() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.h
            public final void a(String str, final MachMap machMap) {
                Object[] objArr2 = {str, machMap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04f10dd278f0c6d182aeb0fe2565b653", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04f10dd278f0c6d182aeb0fe2565b653");
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    if (str.equals("buy_member")) {
                        MPFloatCouponMemberFragment.a(MPFloatCouponMemberFragment.this, String.valueOf(machMap.get("skuId")), String.valueOf(machMap.get("orderToken")), String.valueOf(machMap.get("couponViewId")));
                    } else if (str.equals("member_coupon_exchange_success")) {
                        final int a2 = r.a(String.valueOf(machMap.get("exchangeType")), 0);
                        final String valueOf = String.valueOf(machMap.get("extendInfo"));
                        ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "82ea496fd6d5f69f48496db569244904", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "82ea496fd6d5f69f48496db569244904");
                                } else if (MPFloatCouponMemberFragment.this.l != null) {
                                    if (MPFloatCouponMemberFragment.this.o == null || !MPFloatCouponMemberFragment.this.o.a(MPFloatCouponMemberFragment.this.l.a, MPFloatCouponMemberFragment.this.l.b, a2, valueOf)) {
                                        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(MPFloatCouponMemberFragment.this.l.b);
                                    }
                                }
                            }
                        });
                    } else if (str.equals("member_coupon_back_success")) {
                        if (MPFloatCouponMemberFragment.this.l != null) {
                            if (MPFloatCouponMemberFragment.this.o == null || !MPFloatCouponMemberFragment.this.o.a(MPFloatCouponMemberFragment.this.l.a, MPFloatCouponMemberFragment.this.l.b)) {
                                com.sankuai.waimai.platform.domain.manager.poi.a.a().a(MPFloatCouponMemberFragment.this.l.b);
                            }
                        }
                    } else if (str.equals("magic_coupon_exchange_success")) {
                        ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment.1.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7958a494fae420ce8ded3bb2333d8c77", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7958a494fae420ce8ded3bb2333d8c77");
                                } else if (MPFloatCouponMemberFragment.this.l != null) {
                                    com.sankuai.waimai.platform.domain.manager.poi.a.a().a(MPFloatCouponMemberFragment.this.l.b);
                                }
                            }
                        });
                    } else if (str.equals("refresh_restaurant")) {
                        ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment.1.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "62ca6e013af41508b7037f7064ac2fc6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "62ca6e013af41508b7037f7064ac2fc6");
                                } else if (MPFloatCouponMemberFragment.this.l != null) {
                                    com.sankuai.waimai.platform.domain.manager.poi.a.a().a(MPFloatCouponMemberFragment.this.l.b);
                                }
                            }
                        });
                    } else if (str.equals("fetch_data_success")) {
                        ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment.1.4
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "02d0fb082e5c8be6cc565e883f4aecd5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "02d0fb082e5c8be6cc565e883f4aecd5");
                                    return;
                                }
                                com.sankuai.waimai.foundation.utils.log.a.c("MPFloatCouponMemberFrag", "fetchDataSuccess data: " + machMap, new Object[0]);
                                boolean booleanValue = ((Boolean) machMap.get("isMember")).booleanValue();
                                String str2 = (String) machMap.get("title");
                                com.sankuai.waimai.foundation.utils.log.a.c("MPFloatCouponMemberFrag", "fetchDataSuccess isMember: " + booleanValue + ", title: " + str2, new Object[0]);
                                MPFloatCouponMemberFragment.this.e = booleanValue ^ true;
                                if (MPFloatCouponMemberFragment.this.k != null) {
                                    MPFloatCouponMemberFragment.this.k.b(str2);
                                    MPFloatCouponMemberFragment.this.k.a(null);
                                }
                                MPFloatCouponMemberFragment.this.j = true;
                            }
                        });
                    } else {
                        str.equals("fetch_data_failed");
                    }
                }
            }
        };
    }

    public static /* synthetic */ void a(MPFloatCouponMemberFragment mPFloatCouponMemberFragment, k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "19efc1055d918b781adf48c0e2661b66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "19efc1055d918b781adf48c0e2661b66");
        } else if (kVar == null || !(mPFloatCouponMemberFragment.getContext() instanceof Activity)) {
        } else {
            com.sankuai.waimai.platform.capacity.pay.a.a((Activity) mPFloatCouponMemberFragment.getContext(), 1001, kVar.c, kVar.b);
        }
    }

    public static /* synthetic */ void a(MPFloatCouponMemberFragment mPFloatCouponMemberFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "52b1fcee14a8edbb1fe317165e854614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "52b1fcee14a8edbb1fe317165e854614");
            return;
        }
        FragmentActivity activity = mPFloatCouponMemberFragment.getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        ae.a((Activity) activity, str);
    }

    public static /* synthetic */ void a(MPFloatCouponMemberFragment mPFloatCouponMemberFragment, final String str, final String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "6018881ed51deacc323d59335bd511c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "6018881ed51deacc323d59335bd511c8");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0982b278dc5524cc9283bc3aa727f227", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0982b278dc5524cc9283bc3aa727f227");
                        return;
                    }
                    if (MPFloatCouponMemberFragment.this.k != null && MPFloatCouponMemberFragment.this.l != null && MPFloatCouponMemberFragment.this.l.f == 0) {
                        MPFloatCouponMemberFragment.this.k.i();
                    }
                    MPFloatCouponMemberFragment.d(MPFloatCouponMemberFragment.this);
                    MPFloatCouponMemberFragment.f(MPFloatCouponMemberFragment.this).a(str, str2, str3, new i.a() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.restaurant.membercoupon.i.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "024c388e297d8f3b2d11545b51968ddc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "024c388e297d8f3b2d11545b51968ddc");
                                return;
                            }
                            MPFloatCouponMemberFragment.this.e();
                            MPFloatCouponMemberFragment.a(MPFloatCouponMemberFragment.this, "支付请求失败，请稍后重试");
                            if (MPFloatCouponMemberFragment.this.k == null || MPFloatCouponMemberFragment.this.l == null || MPFloatCouponMemberFragment.this.l.f != 1) {
                                return;
                            }
                            MPFloatCouponMemberFragment.this.k.i();
                        }

                        @Override // com.sankuai.waimai.platform.restaurant.membercoupon.i.a
                        public final void a(k kVar) {
                            Object[] objArr3 = {kVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7c69c004ac8d308caa6c8c97ed254448", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7c69c004ac8d308caa6c8c97ed254448");
                                return;
                            }
                            MPFloatCouponMemberFragment.this.e();
                            MPFloatCouponMemberFragment.a(MPFloatCouponMemberFragment.this, kVar);
                            if (MPFloatCouponMemberFragment.this.k == null || MPFloatCouponMemberFragment.this.l == null || MPFloatCouponMemberFragment.this.l.f != 1) {
                                return;
                            }
                            MPFloatCouponMemberFragment.this.k.i();
                        }
                    });
                }
            });
        }
    }

    public static /* synthetic */ void d(MPFloatCouponMemberFragment mPFloatCouponMemberFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "e6c31d2a8b86ddbf74c950641535add2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "e6c31d2a8b86ddbf74c950641535add2");
            return;
        }
        if (mPFloatCouponMemberFragment.p != null) {
            mPFloatCouponMemberFragment.e();
        }
        mPFloatCouponMemberFragment.p = com.sankuai.waimai.platform.widget.dialog.a.a(mPFloatCouponMemberFragment.getContext());
    }

    public static /* synthetic */ i f(MPFloatCouponMemberFragment mPFloatCouponMemberFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "936af5fb0060d2c7f5d8dd700fa093d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, mPFloatCouponMemberFragment, changeQuickRedirect, false, "936af5fb0060d2c7f5d8dd700fa093d7");
        }
        if (mPFloatCouponMemberFragment.q == null) {
            mPFloatCouponMemberFragment.q = new i(mPFloatCouponMemberFragment.l);
        }
        return mPFloatCouponMemberFragment.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "977765a4cf6e82c508c34b49e58bbc3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "977765a4cf6e82c508c34b49e58bbc3b");
            return;
        }
        Context context = getContext();
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.p);
        this.p = null;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        int i = 0;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0955efe71018d9435ef8718a3cebd60f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0955efe71018d9435ef8718a3cebd60f");
            return;
        }
        super.onCreate(bundle);
        com.sankuai.waimai.machpro.h hVar = this.r;
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b4a7b64a5c97e5370d013bfe87f2bb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b4a7b64a5c97e5370d013bfe87f2bb7");
        } else {
            com.sankuai.waimai.machpro.container.a aVar = this.g;
            if (aVar != null) {
                aVar.a(hVar);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e1e5f1cb10739d7a590c1d66c158a28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e1e5f1cb10739d7a590c1d66c158a28");
            return;
        }
        com.sankuai.waimai.machpro.container.a aVar2 = this.g;
        MachMap machMap = new MachMap();
        long j = 0;
        String str = "";
        int i2 = this.l.e;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("coupon_type");
            j = arguments.getLong("poi_id");
            str = arguments.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        }
        machMap.put("couponType", String.valueOf(i));
        machMap.put("poiId", String.valueOf(j));
        machMap.put("poiIdStr", str);
        machMap.put("bizType", String.valueOf(this.l.f));
        if (i2 != 0) {
            machMap.put(MinHeight.LOWER_CASE_NAME, String.valueOf(this.l.e));
        }
        aVar2.a(machMap);
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762c34dcfa6b621086b14a6d8da47ee6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762c34dcfa6b621086b14a6d8da47ee6");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.d) {
            MRNMPFrameLayout mRNMPFrameLayout = new MRNMPFrameLayout(getContext());
            mRNMPFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            mRNMPFrameLayout.addView(onCreateView);
            return mRNMPFrameLayout;
        }
        return onCreateView;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d60c440216a2e30ee2e68ba914fd2cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d60c440216a2e30ee2e68ba914fd2cdd");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.machpro.h hVar = this.r;
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc22436cd1a1cdc371da79ffa037b666", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc22436cd1a1cdc371da79ffa037b666");
            return;
        }
        com.sankuai.waimai.machpro.container.a aVar = this.g;
        if (aVar != null) {
            aVar.b(hVar);
        }
    }
}
