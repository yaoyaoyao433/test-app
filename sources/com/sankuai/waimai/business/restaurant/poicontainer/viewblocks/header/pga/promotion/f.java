package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
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
public final class f extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    a b;
    private View c;
    private TextView d;
    private TextView e;
    private TextView f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(View view, Poi.PoiCouponItem poiCouponItem);
    }

    public f(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455d320c1ca6f6d63f42c721d174e0c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455d320c1ca6f6d63f42c721d174e0c8");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "165f8afc2c5a8cac1eabceeb9fc0fcf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "165f8afc2c5a8cac1eabceeb9fc0fcf9");
        }
        this.c = LayoutInflater.from(this.y).inflate(R.layout.wm_restaurant_shop_header_coupon_poi, viewGroup, false);
        this.d = (TextView) this.c.findViewById(R.id.shop_coupon_value);
        this.e = (TextView) this.c.findViewById(R.id.shop_coupon_symbal);
        this.f = (TextView) this.c.findViewById(R.id.coupon_button_text);
        return this.c;
    }

    public final void a(final Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33b76a27a9c96c5091750cdf62c8f1d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33b76a27a9c96c5091750cdf62c8f1d8");
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(poiCouponItem.mDiscountDesc)) {
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) poiCouponItem.mDiscountDesc);
            int indexOf = poiCouponItem.mDiscountDesc.indexOf("折");
            spannableStringBuilder.setSpan(new com.sankuai.waimai.business.restaurant.base.widget.b(com.sankuai.waimai.foundation.utils.g.b(this.y, 10.0f)), indexOf, poiCouponItem.mDiscountDesc.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, indexOf, 33);
        }
        if (poiCouponItem.mCouponType == 3) {
            this.d.setTypeface(null, 0);
            this.e.setVisibility(8);
            this.d.setText(spannableStringBuilder);
        } else {
            this.e.setVisibility(0);
            this.d.setTypeface(null, 1);
            this.d.setText(com.sankuai.waimai.foundation.utils.h.a(poiCouponItem.mCouponValue));
        }
        if (poiCouponItem.isCouponReceived()) {
            this.d.setTextColor(this.y.getResources().getColor(R.color.wm_common_text_money));
            this.e.setTextColor(this.y.getResources().getColor(R.color.wm_common_text_money));
            if (this.f != null) {
                ah.a(this.f, poiCouponItem.mCouponButtonText);
                this.f.setTextColor(this.y.getResources().getColor(R.color.wm_common_text_money));
            }
            this.c.setBackgroundResource(R.drawable.wm_restaurant_common_coupon_getted_new);
        } else {
            this.d.setTextColor(this.y.getResources().getColor(R.color.ceres_all_f));
            this.e.setTextColor(this.y.getResources().getColor(R.color.ceres_all_f));
            if (this.f != null) {
                ah.a(this.f, poiCouponItem.mCouponButtonText);
                this.f.setTextColor(this.y.getResources().getColor(R.color.ceres_all_f));
            }
            this.c.setBackgroundResource(R.drawable.wm_restaurant_common_coupon_unget_new);
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddc3992c9f5adea853e4176d01112416", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddc3992c9f5adea853e4176d01112416");
                } else if (f.this.b != null) {
                    f.this.b.a(view, poiCouponItem);
                }
            }
        });
        com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.a.a(h(), this.d, this.e, null, null, this.f, poiCouponItem);
    }
}
