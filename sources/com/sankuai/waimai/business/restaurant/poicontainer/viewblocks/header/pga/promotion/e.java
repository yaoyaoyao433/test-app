package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    a b;
    private View c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(View view, Poi.PoiCouponItem poiCouponItem);
    }

    public e(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "573ea7595273bf1d51079de52cdd75d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "573ea7595273bf1d51079de52cdd75d5");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd64010ee2436d6352eb9771f680886", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd64010ee2436d6352eb9771f680886");
        }
        this.c = LayoutInflater.from(this.y).inflate(R.layout.wm_restaurant_shop_header_normal_coupon, viewGroup, false);
        this.d = (TextView) this.c.findViewById(R.id.shop_coupon_value);
        this.e = (TextView) this.c.findViewById(R.id.shop_coupon_symbal);
        this.f = (TextView) this.c.findViewById(R.id.shop_coupon_condition);
        this.g = (TextView) this.c.findViewById(R.id.coupon_button_text);
        return this.c;
    }

    public final void a(final Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a692796640bf273364a396e0c17c62ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a692796640bf273364a396e0c17c62ef");
            return;
        }
        this.e.setVisibility(0);
        this.d.setTypeface(null, 1);
        this.d.setText(com.sankuai.waimai.foundation.utils.h.a(poiCouponItem.mCouponValue));
        if (poiCouponItem.isCouponReceived()) {
            this.d.setTextColor(this.y.getResources().getColor(R.color.wm_common_text_money));
            this.e.setTextColor(this.y.getResources().getColor(R.color.wm_common_text_money));
            this.f.setTextColor(this.y.getResources().getColor(R.color.wm_common_text_money));
            ah.a(this.f, poiCouponItem.mCouponConditionShortText);
            if (this.g != null) {
                ah.a(this.g, poiCouponItem.mCouponButtonText);
                this.g.setTextColor(this.y.getResources().getColor(R.color.wm_common_text_money));
            }
            this.c.setBackgroundResource(R.drawable.wm_restaurant_common_coupon_getted_new);
        } else {
            this.d.setTextColor(this.y.getResources().getColor(R.color.ceres_all_f));
            this.e.setTextColor(this.y.getResources().getColor(R.color.ceres_all_f));
            this.f.setTextColor(this.y.getResources().getColor(R.color.ceres_all_f));
            ah.a(this.f, poiCouponItem.mCouponConditionShortText);
            if (this.g != null) {
                ah.a(this.g, poiCouponItem.mCouponButtonText);
                this.g.setTextColor(this.y.getResources().getColor(R.color.ceres_all_f));
            }
            this.c.setBackgroundResource(R.drawable.wm_restaurant_common_coupon_unget_new);
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2179a8e2bdb2535ffe9aa5e1186c930", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2179a8e2bdb2535ffe9aa5e1186c930");
                } else if (e.this.b != null) {
                    e.this.b.a(view, poiCouponItem);
                }
            }
        });
        com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.a.a(h(), this.d, this.e, this.f, null, this.g, poiCouponItem);
    }
}
