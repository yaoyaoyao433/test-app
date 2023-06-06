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
public final class b extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    d b;
    private final a c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        void a(View view, Poi.PoiCouponItem poiCouponItem);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static abstract class a extends com.sankuai.waimai.platform.base.b {
        public static ChangeQuickRedirect a;

        public abstract void a(@NonNull Poi.PoiCouponItem poiCouponItem);

        public a(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "555831f9255d6dc55b705f67853f7ebe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "555831f9255d6dc55b705f67853f7ebe");
            }
        }
    }

    public b(@NonNull Context context, boolean z) {
        super(context);
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef189724f4da8e3998f191e3cb5934b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef189724f4da8e3998f191e3cb5934b");
        } else {
            this.c = z ? new C0852b(context) : new c(context);
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ce201d4898c9ae03ba0c6b24e7743c9", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ce201d4898c9ae03ba0c6b24e7743c9") : this.c.a(viewGroup);
    }

    public final void a(@NonNull Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09626363bff5afce7fdb8d511975db54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09626363bff5afce7fdb8d511975db54");
        } else {
            this.c.a(poiCouponItem);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    final class c extends a {
        public static ChangeQuickRedirect b;
        private View d;
        private TextView e;
        private TextView f;
        private TextView g;
        private final int h;

        public c(@NonNull Context context) {
            super(context);
            Object[] objArr = {b.this, context};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad1d583689cc9f1860270a7a1792893f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad1d583689cc9f1860270a7a1792893f");
            } else {
                this.h = com.sankuai.waimai.foundation.utils.g.b(this.y, 16.0f);
            }
        }

        @Override // com.sankuai.waimai.platform.base.b
        public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            Object[] objArr = {layoutInflater, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b82e141688a9af9fdec3cbc0288119", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b82e141688a9af9fdec3cbc0288119");
            }
            this.d = layoutInflater.inflate(R.layout.wm_restaurant_shop_header_fold_goods_and_poi_coupon_layout_to_buy, viewGroup, false);
            this.e = (TextView) this.d.findViewById(R.id.coupon_discount);
            this.f = (TextView) this.d.findViewById(R.id.coupon_desc);
            this.g = (TextView) this.d.findViewById(R.id.coupon_button_text);
            return this.d;
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.b.a
        public final void a(@NonNull final Poi.PoiCouponItem poiCouponItem) {
            Object[] objArr = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b8e549a635bb522d69f1abc8ddb7a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b8e549a635bb522d69f1abc8ddb7a1");
                return;
            }
            if (!TextUtils.isEmpty(poiCouponItem.mDiscountDesc) || !TextUtils.isEmpty(poiCouponItem.mCouponName)) {
                a(this.e, poiCouponItem.mDiscountDesc);
                a(this.f, poiCouponItem.mCouponName);
            } else {
                if (this.e != null) {
                    this.e.setVisibility(8);
                }
                ah.a(this.f, poiCouponItem.mCouponDesc);
            }
            ah.a(this.g, poiCouponItem.mCouponButtonText);
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.b.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d7488c36fff404a4e13f6e64c4e0db2", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d7488c36fff404a4e13f6e64c4e0db2");
                    } else if (b.this.b != null) {
                        b.this.b.a(c.this.h(), poiCouponItem);
                    }
                }
            });
        }

        private void a(TextView textView, String str) {
            Object[] objArr = {textView, str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fa9a731d287d310f4f3b1f711715218", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fa9a731d287d310f4f3b1f711715218");
            } else if (textView != null) {
                if (TextUtils.isEmpty(str)) {
                    textView.setText("");
                } else if (!str.matches(".*[0-9].*")) {
                    ah.a(textView, str);
                } else {
                    int length = str.length();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    for (int i = 0; i < length; i++) {
                        char charAt = str.charAt(i);
                        if (charAt == '.' || (charAt >= '0' && charAt < '9')) {
                            int i2 = i + 1;
                            spannableStringBuilder.setSpan(new com.sankuai.waimai.business.restaurant.base.widget.b(this.h), i, i2, 33);
                            spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                        }
                    }
                    ah.a(textView, spannableStringBuilder);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    final class C0852b extends a {
        public static ChangeQuickRedirect b;
        private View d;
        private TextView e;
        private TextView f;

        public C0852b(@NonNull Context context) {
            super(context);
            Object[] objArr = {b.this, context};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a15c27fb720495b17564a6fa9877e2f8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a15c27fb720495b17564a6fa9877e2f8");
            }
        }

        @Override // com.sankuai.waimai.platform.base.b
        public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            Object[] objArr = {layoutInflater, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8567a5fc12491cd60611a259aef15698", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8567a5fc12491cd60611a259aef15698");
            }
            this.d = layoutInflater.inflate(R.layout.wm_restaurant_shop_header_fold_goods_and_poi_coupon_layout_bought, viewGroup, false);
            this.e = (TextView) this.d.findViewById(R.id.txt_coupon_name);
            this.f = (TextView) this.d.findViewById(R.id.txt_coupon_btn_text);
            return this.d;
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.b.a
        public final void a(@NonNull final Poi.PoiCouponItem poiCouponItem) {
            Object[] objArr = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64688f7724de77f8465bf0434e408d26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64688f7724de77f8465bf0434e408d26");
                return;
            }
            TextView textView = this.e;
            String str = poiCouponItem.mCouponName;
            Object[] objArr2 = {textView, str};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23c13bdbaf8b8249e1d3d4db72b06e04", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23c13bdbaf8b8249e1d3d4db72b06e04");
            } else if (textView != null) {
                if (TextUtils.isEmpty(str)) {
                    textView.setText("");
                } else if (!str.matches(".*[0-9].*")) {
                    ah.a(textView, str);
                } else {
                    int length = str.length();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    for (int i = 0; i < length; i++) {
                        char charAt = str.charAt(i);
                        if (charAt == '.' || (charAt >= '0' && charAt < '9')) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), i, i + 1, 33);
                        }
                    }
                    ah.a(textView, spannableStringBuilder);
                }
            }
            ah.a(this.f, poiCouponItem.mCouponButtonText);
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.b.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d9b80bb07aa11b061c8c5a77cd313a1d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d9b80bb07aa11b061c8c5a77cd313a1d");
                    } else if (b.this.b != null) {
                        b.this.b.a(C0852b.this.h(), poiCouponItem);
                    }
                }
            });
        }
    }
}
