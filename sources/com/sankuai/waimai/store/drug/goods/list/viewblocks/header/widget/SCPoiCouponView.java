package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.widget;

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
import com.sankuai.waimai.store.drug.coupons.b;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.manager.poi.a;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCPoiCouponView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private View b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private a g;
    private Poi.CouponSummary h;

    public SCPoiCouponView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75431e0e354ed222a3b7d8320ee158c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75431e0e354ed222a3b7d8320ee158c6");
        }
    }

    public SCPoiCouponView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33cd5562abb5d642f79b59551829128", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33cd5562abb5d642f79b59551829128");
        }
    }

    public SCPoiCouponView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe9e97571b13b7b66168da2d09da77a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe9e97571b13b7b66168da2d09da77a0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc0bbdcfa7854639a61b00a1a66ea39e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc0bbdcfa7854639a61b00a1a66ea39e");
            return;
        }
        this.b = LayoutInflater.from(getContext()).inflate(R.layout.wm_drug_goods_list_coupon_view, (ViewGroup) this, false);
        this.c = (TextView) this.b.findViewById(R.id.txt_coupon_num);
        this.e = (TextView) this.b.findViewById(R.id.txt_coupon_other_desc);
        this.d = (TextView) this.b.findViewById(R.id.txt_coupon_desc);
        this.f = (TextView) this.b.findViewById(R.id.txt_coupon_status);
        setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.widget.SCPoiCouponView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0b76317803f4feec2e7c071abed4346", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0b76317803f4feec2e7c071abed4346");
                } else if (SCPoiCouponView.this.g == null) {
                } else {
                    Poi.PoiCouponEntity poiCoupon = SCPoiCouponView.this.g.b.getPoiCoupon();
                    if (poiCoupon != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) poiCoupon.getPoiCouponCategoryList())) {
                        Context context2 = SCPoiCouponView.this.getContext();
                        a aVar = SCPoiCouponView.this.g;
                        Object[] objArr4 = {context2, aVar, poiCoupon};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "4ab73f5399d7bb2231adbdc0a96d35fc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "4ab73f5399d7bb2231adbdc0a96d35fc");
                        } else {
                            b.a(context2, aVar, poiCoupon, 0L, null, 1, false, null, null, 0);
                        }
                    }
                    if (SCPoiCouponView.this.h != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("poi_id", SCPoiCouponView.this.g.d());
                        com.sankuai.waimai.store.manager.judas.b.a(SCPoiCouponView.this.getContext(), "b_c3aavchh").a(hashMap).a(SCPoiCouponView.this.getContext()).a("status", Integer.valueOf(SCPoiCouponView.this.h.mReceiveStatus)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(SCPoiCouponView.this.g.v())).a();
                    }
                }
            }
        });
        addView(this.b);
    }

    public void setPoiHelper(a aVar) {
        this.g = aVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce93e86f0815a9bbd2721239e09bd77c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce93e86f0815a9bbd2721239e09bd77c");
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            Poi.CouponSummary couponSummary = this.h;
            Object[] objArr2 = {couponSummary};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e235d371280265802f3624e8e29cdb9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e235d371280265802f3624e8e29cdb9");
            } else if (couponSummary == null || this.g == null || !u.a(this)) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", this.g.d());
                com.sankuai.waimai.store.manager.judas.b.b(getContext(), "b_ec9ocyca").a(hashMap).a("status", Integer.valueOf(couponSummary.mReceiveStatus)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.g.v())).a();
            }
        }
    }

    public void setData(Poi.CouponSummary couponSummary) {
        Object[] objArr = {couponSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2e444b22574321ed54966ff85987ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2e444b22574321ed54966ff85987ab");
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
