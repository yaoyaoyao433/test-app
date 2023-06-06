package com.sankuai.waimai.store.goods.list.viewblocks.header.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCPoiCouponView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private View b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a g;
    private Poi.CouponSummary h;

    public SCPoiCouponView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c037452267ac47cfe0d4911dc5667dc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c037452267ac47cfe0d4911dc5667dc1");
        }
    }

    public SCPoiCouponView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d40db31fba187be264659b67e8e7ecd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d40db31fba187be264659b67e8e7ecd");
        }
    }

    public SCPoiCouponView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d3e3dc2e4f61a411845dfe8492626ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d3e3dc2e4f61a411845dfe8492626ba");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "496d6f4dea76e65c3ccadfe869bd591f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "496d6f4dea76e65c3ccadfe869bd591f");
            return;
        }
        this.b = LayoutInflater.from(getContext()).inflate(R.layout.wm_st_goods_list_coupon_view, (ViewGroup) this, false);
        this.c = (TextView) this.b.findViewById(R.id.txt_coupon_num);
        this.e = (TextView) this.b.findViewById(R.id.txt_coupon_other_desc);
        this.d = (TextView) this.b.findViewById(R.id.txt_coupon_desc);
        this.f = (TextView) this.b.findViewById(R.id.txt_coupon_status);
        setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.widget.SCPoiCouponView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e9db56eedc3d95608a8428d224e0e4a5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e9db56eedc3d95608a8428d224e0e4a5");
                } else if (SCPoiCouponView.this.g == null) {
                } else {
                    Poi.PoiCouponEntity poiCoupon = SCPoiCouponView.this.g.b.getPoiCoupon();
                    if (poiCoupon != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) poiCoupon.getPoiCouponCategoryList())) {
                        com.sankuai.waimai.store.coupons.a a2 = com.sankuai.waimai.store.coupons.a.a();
                        Context context2 = SCPoiCouponView.this.getContext();
                        com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = SCPoiCouponView.this.g;
                        Poi.CouponTabInfo couponTabInfo = poiCoupon.couponTabInfo;
                        List<Poi.CouponCategoryList> poiCouponCategoryList = poiCoupon.getPoiCouponCategoryList();
                        Object[] objArr4 = {context2, aVar, couponTabInfo, poiCouponCategoryList};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.coupons.a.a;
                        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "796a00be1974e50e56541ec889032817", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "796a00be1974e50e56541ec889032817");
                        } else {
                            a2.a(context2, aVar, couponTabInfo, poiCouponCategoryList, 1);
                        }
                    }
                    if (SCPoiCouponView.this.h != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("poi_id", SCPoiCouponView.this.g.d());
                        b.a(SCPoiCouponView.this.getContext(), "b_c3aavchh").a(hashMap).a(SCPoiCouponView.this.getContext()).a("status", Integer.valueOf(SCPoiCouponView.this.h.mReceiveStatus)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(SCPoiCouponView.this.g.v())).a();
                    }
                }
            }
        });
        addView(this.b);
    }

    public void setPoiHelper(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        this.g = aVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad476e0a6e532c00fb80f6d24f3f3d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad476e0a6e532c00fb80f6d24f3f3d0");
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            Poi.CouponSummary couponSummary = this.h;
            Object[] objArr2 = {couponSummary};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b2d817159288e4b8076506a668a9b8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b2d817159288e4b8076506a668a9b8e");
            } else if (couponSummary == null || this.g == null || !u.a(this)) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", this.g.d());
                b.b(getContext(), "b_ec9ocyca").a(hashMap).a("status", Integer.valueOf(couponSummary.mReceiveStatus)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.g.v())).a();
            }
        }
    }

    public void setData(Poi.CouponSummary couponSummary) {
        Object[] objArr = {couponSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebffc8e45f8b8552105995a6e744e452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebffc8e45f8b8552105995a6e744e452");
            return;
        }
        this.h = couponSummary;
        if (couponSummary == null) {
            return;
        }
        int i = couponSummary.mReceiveStatus;
        if (1 == i) {
            this.c.setText(couponSummary.mCouponCountTip);
            this.d.setText(couponSummary.mSummaryTip);
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            this.e.setVisibility(8);
            this.f.setText(getContext().getString(R.string.wm_sc_shop_accept_coupon));
            u.a(this.b, -1, getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_53));
            this.b.setBackgroundResource(R.drawable.wm_st_coupon_goods_list_bigger);
        } else if (2 == i) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.e.setVisibility(0);
            this.e.setText(couponSummary.mSummaryTip);
            this.f.setText(getContext().getString(R.string.wm_sc_shop_accept_coupon));
            u.a(this.b, -1, h.a(getContext(), 35.0f));
            this.b.setBackgroundResource(R.drawable.wm_st_coupon_goods_list_normal);
        } else if (3 == i) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.e.setVisibility(0);
            this.e.setText(couponSummary.mSummaryTip);
            this.f.setText(getContext().getString(R.string.wm_sc_shop_view_coupon));
            u.a(this.b, -1, h.a(getContext(), 35.0f));
            this.b.setBackgroundResource(R.drawable.wm_st_coupon_goods_list_normal);
        }
    }
}
