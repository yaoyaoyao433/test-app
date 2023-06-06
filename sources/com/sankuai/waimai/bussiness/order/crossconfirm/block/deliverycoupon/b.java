package com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    String e;
    @Nullable
    c f;
    @Nullable
    final a g;
    private ViewGroup h;
    private TextView i;
    private TextView j;
    private RooIconFont k;
    private ImageView l;
    private boolean m;
    private CouponInfo n;
    private int o;
    private int p;
    @NonNull
    private final f q;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str, double d);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_delivery_coupon;
    }

    public static /* synthetic */ void b(b bVar) {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "89601c14160b3cc27d20f0ee5b6e6326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "89601c14160b3cc27d20f0ee5b6e6326");
            return;
        }
        Activity activity = (Activity) bVar.c;
        if (activity == null || activity.isFinishing() || !(bVar.q instanceof com.sankuai.waimai.bussiness.order.confirm.a)) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0a65b88a8d7675fc733e4d78c1fac39d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0a65b88a8d7675fc733e4d78c1fac39d")).booleanValue();
        } else if (!bVar.m && bVar.h.getVisibility() == 0 && bVar.j.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            bVar.m = true;
            if (bVar.f == null || bVar.f.d == null || bVar.n == null || TextUtils.isEmpty(bVar.n.statusTip)) {
                return;
            }
            JudasManualManager.b("b_waimai_0ninv6b9_mv").a("c_ykhs39e").a(bVar.c).a();
        }
    }

    public b(@NonNull Context context, @NonNull f fVar, @Nullable a aVar) {
        super(context);
        Object[] objArr = {context, fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2fbd9b0ccb58ab9c7b55598df3ad12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2fbd9b0ccb58ab9c7b55598df3ad12");
            return;
        }
        this.e = "-1";
        this.m = false;
        this.g = aVar;
        this.q = fVar;
        this.o = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_symbol);
        this.p = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_num);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5043f324f8fa937ed84127171e18d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5043f324f8fa937ed84127171e18d7");
            return;
        }
        super.b();
        this.h = (ViewGroup) this.b.findViewById(R.id.layout_delivery_coupon);
        this.i = (TextView) this.b.findViewById(R.id.txt_delivery_coupon_title);
        this.j = (TextView) this.b.findViewById(R.id.txt_delivery_coupon_info);
        this.k = (RooIconFont) this.b.findViewById(R.id.img_arrow_delivery_coupon);
        this.l = (ImageView) this.b.findViewById(R.id.coupon_icon);
        this.h.setPadding(this.h.getPaddingLeft(), g.a(this.c, 8.0f), this.h.getPaddingRight(), g.a(this.c, 8.0f));
    }

    public final void a(@NonNull final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8082acfd198c8e4b9fe97245bee4477", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8082acfd198c8e4b9fe97245bee4477");
            return;
        }
        this.h.setVisibility(8);
        if (cVar.d == null || cVar.d.size() == 0) {
            return;
        }
        this.m = false;
        boolean z = false;
        for (CouponInfo couponInfo : cVar.d) {
            if (couponInfo != null && couponInfo.type == 2) {
                this.n = couponInfo;
                this.e = couponInfo.selectedDeliveryCouponViewId;
                this.i.setText(couponInfo.description);
                b(couponInfo);
                h.a(this.j, couponInfo.statusTip, this.q.aN_(), this.o, this.p);
                this.h.setVisibility(0);
                this.k.setVisibility(couponInfo.isUsable() ? 0 : 8);
                z = couponInfo.isUsable();
                if (!TextUtils.isEmpty(couponInfo.iconUrl)) {
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = this.c;
                    a2.c = couponInfo.iconUrl;
                    a2.a(this.l);
                    this.l.setVisibility(0);
                } else {
                    this.l.setVisibility(8);
                }
            }
        }
        if (this.h.getVisibility() == 0) {
            ViewGroup viewGroup = this.h;
            final int i = z ? 1 : 0;
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "367697eba2f998f2fa639d7219777ba9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "367697eba2f998f2fa639d7219777ba9");
                        return;
                    }
                    if (i == 1 && b.this.g != null) {
                        b.this.g.a(b.this.e, cVar.e);
                    }
                    JudasManualManager.a("b_waimai_x492htux_mc").a("c_ykhs39e").a(b.this.c).a();
                }
            });
        }
        this.h.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2623b448ef47fc5655442f34ca22193a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2623b448ef47fc5655442f34ca22193a");
                } else {
                    b.b(b.this);
                }
            }
        });
    }

    private int a(CouponInfo couponInfo) {
        boolean z;
        boolean z2;
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbe588596c5cd57b76c2bbc8238e9f27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbe588596c5cd57b76c2bbc8238e9f27")).intValue();
        }
        String str = couponInfo.selectedDeliveryCouponViewId;
        boolean isUsable = couponInfo.isUsable();
        Object[] objArr2 = {Byte.valueOf(isUsable ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "086f4570d6740182ad2c6b9554348d29", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "086f4570d6740182ad2c6b9554348d29")).booleanValue();
        } else {
            z = (!isUsable || "0".equals(str) || "-1".equals(str)) ? false : true;
        }
        if (z) {
            return 0;
        }
        boolean isUsable2 = couponInfo.isUsable();
        Object[] objArr3 = {Byte.valueOf(isUsable2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4a6ec738fa165db3b5131be11fd8ebde", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4a6ec738fa165db3b5131be11fd8ebde")).booleanValue();
        } else {
            z2 = isUsable2 && "-1".equals(str);
        }
        return z2 ? 1 : 2;
    }

    private void b(CouponInfo couponInfo) {
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf475224719057f7399f506ee636e95c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf475224719057f7399f506ee636e95c");
            return;
        }
        a(couponInfo);
        if (couponInfo.statusTipStyle == 1) {
            this.j.setTextSize(2, 14.0f);
            this.j.setPadding(0, 0, 0, 0);
            this.j.setBackground(null);
            this.j.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_coupon_info_color));
            this.j.setCompoundDrawablePadding(0);
            this.j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (couponInfo.statusTipStyle == 2) {
            this.j.setTextSize(2, 12.0f);
            int a2 = g.a(this.c, 4.0f);
            this.j.setPadding(a2, 0, a2, 0);
            this.j.setBackground(this.c.getResources().getDrawable(R.drawable.wm_order_confirm_coupon_info_text_bg));
            this.j.setTextColor(-1);
            this.j.setCompoundDrawablePadding(0);
            this.j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (couponInfo.statusTipStyle == 0) {
            this.j.setTextSize(2, 14.0f);
            this.j.setPadding(0, 0, 0, 0);
            this.j.setBackground(null);
            this.j.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_title_text_color_hint));
            this.j.setCompoundDrawablePadding(0);
            this.j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }
}
