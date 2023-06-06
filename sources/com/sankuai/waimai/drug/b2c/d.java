package com.sankuai.waimai.drug.b2c;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.drug.j;
import com.sankuai.waimai.store.platform.domain.core.order.ShopCartPrice;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends j {
    public static ChangeQuickRedirect h;
    private com.sankuai.waimai.store.order.a i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;

    public d(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar) {
        super(activity, aVar);
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26036f3550cb7f88bc7da2f2bf121a55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26036f3550cb7f88bc7da2f2bf121a55");
        } else {
            this.i = com.sankuai.waimai.store.order.a.e();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcf7197cca233719a495a9e6bd35ad20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcf7197cca233719a495a9e6bd35ad20");
            return;
        }
        super.onViewCreated();
        this.k = (TextView) this.mView.findViewById(R.id.b2c_poi_dealInfo_original_price_txt);
        this.j = (TextView) this.mView.findViewById(R.id.b2c_poi_dealInfo_price_txt);
        this.l = (TextView) this.mView.findViewById(R.id.b2c_poi_shipping_fee_txt);
        this.m = (TextView) this.mView.findViewById(R.id.b2c_poi_original_shipping_price_txt);
    }

    @Override // com.sankuai.waimai.drug.j
    public final void a() {
        ShopCartPrice shopCartPrice;
        double o;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "effbd10b13899e6a45c8f451bf0ca0e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "effbd10b13899e6a45c8f451bf0ca0e6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c327a85866c690270d559d944601caf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c327a85866c690270d559d944601caf1");
        } else if (this.c == null || this.c.z() || !this.i.i(this.c.d())) {
            hide();
        } else {
            show();
            com.sankuai.waimai.store.platform.domain.core.shopcart.b k = this.i.k(this.c.d());
            if (k != null && (shopCartPrice = k.g) != null) {
                u.a(this.l, shopCartPrice.mShippingFeeTxt);
                u.a(this.m, shopCartPrice.mOriginShippingFeeTxt);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "084d1a88c24dcd049b7e39e53761f88a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "084d1a88c24dcd049b7e39e53761f88a");
        } else if (this.c == null || this.c.z() || !this.i.i(this.c.d())) {
            hide();
        } else {
            show();
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = h;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00261f6afc719aa6ee0050633c1cfea1", RobustBitConfig.DEFAULT_VALUE)) {
                o = ((Double) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00261f6afc719aa6ee0050633c1cfea1")).doubleValue();
            } else {
                o = this.c == null ? 0.0d : this.i.o(this.c.d());
            }
            double m = this.i.m(this.c.d());
            SpannableString spannableString = new SpannableString(this.mContext.getString(R.string.wm_sc_common_price, i.a(o)));
            spannableString.setSpan(new AbsoluteSizeSpan(13, true), 0, 1, 33);
            this.j.setText(spannableString);
            if (!i.a(Double.valueOf(m), Double.valueOf(o))) {
                this.k.setText(this.mContext.getString(R.string.wm_sc_common_price, i.a(m)));
            } else {
                this.k.setText("");
            }
        }
    }
}
