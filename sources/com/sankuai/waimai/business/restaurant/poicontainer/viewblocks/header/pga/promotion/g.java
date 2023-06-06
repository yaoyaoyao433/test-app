package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooLinearLayout;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    a b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private RooLinearLayout h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(View view, Poi.PoiCouponItem poiCouponItem);
    }

    public g(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7476df1f8806e48b54504f1211e38508", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7476df1f8806e48b54504f1211e38508");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a995a1d7ab2c9790991a56b36c3ff44f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a995a1d7ab2c9790991a56b36c3ff44f");
        }
        RooLinearLayout rooLinearLayout = (RooLinearLayout) layoutInflater.inflate(R.layout.wm_restaurant_layout_coupon_exchange_fold_template_a, viewGroup, false);
        this.h = rooLinearLayout;
        this.c = (TextView) rooLinearLayout.findViewById(R.id.txt_coupon_short_text_prefix);
        this.d = (TextView) rooLinearLayout.findViewById(R.id.txt_coupon_value);
        this.e = (TextView) rooLinearLayout.findViewById(R.id.txt_coupon_short_condition);
        this.f = (TextView) rooLinearLayout.findViewById(R.id.txt_coupon_short_status);
        this.g = (TextView) rooLinearLayout.findViewById(R.id.txt_coupon_money_sign);
        return rooLinearLayout;
    }

    public final void a(final Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733bd1245e5808ff28320ac1a50e1f38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733bd1245e5808ff28320ac1a50e1f38");
        } else if (poiCouponItem == null) {
        } else {
            if (poiCouponItem.isCouponExchanged()) {
                this.h.setBackgroundByResName("waimai_c_wm_restaurant_bg_coupon_exchange_fold_exchanged_template_a@23x50");
                this.f.setText(R.string.wm_restaurant_header_coupon_exchanged);
            } else {
                this.h.setBackgroundByResName("waimai_c_wm_restaurant_bg_coupon_exchange_fold_not_exchanged_template_a@23x50");
                this.f.setText(R.string.wm_restaurant_header_coupon_exchange);
            }
            if (!TextUtils.isEmpty(poiCouponItem.mCouponConditionShortTextPrefix)) {
                this.c.setText(poiCouponItem.mCouponConditionShortTextPrefix);
                this.c.setVisibility(0);
                ((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()).setMargins(com.sankuai.waimai.foundation.utils.g.a(this.y, 2.0f), 0, 0, 0);
            } else {
                this.c.setVisibility(8);
            }
            this.d.setText(com.sankuai.waimai.foundation.utils.h.a(poiCouponItem.mCouponValue));
            ah.a(this.e, poiCouponItem.mCouponConditionShortText);
            h().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.g.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63ea04e66bb8b3b2974a8f5605d18c8e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63ea04e66bb8b3b2974a8f5605d18c8e");
                    } else if (g.this.b != null) {
                        g.this.b.a(view, poiCouponItem);
                    }
                }
            });
            com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.a.a(h(), this.d, this.g, this.e, null, this.f, poiCouponItem);
        }
    }
}
