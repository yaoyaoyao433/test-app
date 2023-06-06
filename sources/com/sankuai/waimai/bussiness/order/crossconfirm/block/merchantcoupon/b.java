package com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private CouponInfo A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    @NonNull
    private final f F;
    String e;
    String f;
    String g;
    List<com.sankuai.waimai.bussiness.order.confirm.coupon.model.f> h;
    CallbackInfo i;
    @Nullable
    c j;
    @Nullable
    a k;
    private ViewGroup l;
    private TextView m;
    private TextView n;
    private TextView o;
    private LinearLayout p;
    private RooIconFont q;
    private ImageView r;
    private com.sankuai.waimai.bussiness.order.base.mach.b s;
    private com.sankuai.waimai.bussiness.order.base.mach.b t;
    private String u;
    private Activity v;
    private ViewGroup w;
    private ViewGroup x;
    private LinearLayout y;
    private TextView z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, double d, double d2, double d3, String str);

        void a(String str, String str2, String str3);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_poi_coupon;
    }

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "fc6a49da3bce851b8d452ecda39d41ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "fc6a49da3bce851b8d452ecda39d41ff");
        } else if (bVar.k != null) {
            bVar.k.a(bVar.e, bVar.f, bVar.g);
        }
    }

    public static /* synthetic */ void d(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "f9d1eba6ab47072dd75d9d0cbd46eaa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "f9d1eba6ab47072dd75d9d0cbd46eaa8");
            return;
        }
        Activity activity = (Activity) bVar.c;
        if (activity == null || activity.isFinishing() || !(bVar.F instanceof com.sankuai.waimai.bussiness.order.confirm.a)) {
            return;
        }
        Rect rect = ((com.sankuai.waimai.bussiness.order.confirm.a) bVar.F).V.a().b;
        if (bVar.f() && ah.a(bVar.n, rect)) {
            bVar.e();
        }
    }

    public b(@NonNull Context context, @NonNull f fVar, @Nullable a aVar) {
        super(context);
        Object[] objArr = {context, fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f731c565876735fdd7e854966730d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f731c565876735fdd7e854966730d4");
            return;
        }
        this.u = "";
        this.e = "0";
        this.f = "0";
        this.g = "0";
        this.h = new ArrayList();
        this.B = false;
        this.C = false;
        if (context instanceof BaseActivity) {
            this.u = ((BaseActivity) context).w();
            this.v = (Activity) context;
            this.s = new com.sankuai.waimai.bussiness.order.base.mach.b(this.v, this.u, "c_ykhs39e");
            this.s.a(this.w, "submit-order-poi-coupon-guide", "waimai");
            this.t = new com.sankuai.waimai.bussiness.order.base.mach.b(this.v, this.u, "c_ykhs39e");
            this.t.a(this.x, "submit-order-poi-coupon-package-detail", "waimai");
        }
        this.k = aVar;
        this.F = fVar;
        this.D = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_symbol);
        this.E = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_num);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b4e7db9b48e2fe654344bf3a367796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b4e7db9b48e2fe654344bf3a367796");
            return;
        }
        super.b();
        this.l = (ViewGroup) this.b.findViewById(R.id.layout_poi_coupon);
        this.m = (TextView) this.b.findViewById(R.id.txt_poi_coupon_title);
        this.n = (TextView) this.b.findViewById(R.id.txt_poi_coupon_info);
        this.o = (TextView) this.b.findViewById(R.id.txt_poi_coupon_use_tip);
        this.p = (LinearLayout) this.b.findViewById(R.id.txt_poi_coupon_use_tip_ll);
        this.q = (RooIconFont) this.b.findViewById(R.id.img_arrow_poi_coupon);
        this.r = (ImageView) this.b.findViewById(R.id.coupon_icon);
        this.y = (LinearLayout) this.b.findViewById(R.id.poi_coupon_collect_order_tip_ll);
        this.z = (TextView) this.b.findViewById(R.id.poi_coupon_collect_order_tip);
        this.w = (ViewGroup) this.b.findViewById(R.id.mach_container_for_poi_coupon_guide);
        this.x = (ViewGroup) this.b.findViewById(R.id.mach_container_for_poi_coupon_package_detail);
        this.w.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ed44305f6406a249828df3edbba0289", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ed44305f6406a249828df3edbba0289");
                    return;
                }
                b.a(b.this);
                String str = "";
                if (b.this.j != null && b.this.j.g != null) {
                    str = b.this.j.g.a();
                }
                JudasManualManager.a("b_waimai_6e6bg3ni_mc").a("c_ykhs39e").a(b.this.c).a("poi_id", i.a(b.this.j != null ? b.this.j.b : 0L, b.this.j != null ? b.this.j.c : "")).a("vp_sku_id", str).a();
            }
        });
        this.l.setPadding(this.l.getPaddingLeft(), g.a(this.c, 8.0f), this.l.getPaddingRight(), g.a(this.c, 8.0f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull c cVar) {
        boolean z;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dcd9ccd0de3b373c9ff7025b671c1a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dcd9ccd0de3b373c9ff7025b671c1a7");
            return;
        }
        this.l.setVisibility(8);
        if (cVar.e == null || cVar.e.size() == 0) {
            return;
        }
        this.B = false;
        this.C = false;
        this.A = null;
        final String str = "";
        boolean z2 = false;
        for (CouponInfo couponInfo : cVar.e) {
            if (couponInfo != null && couponInfo.type == 1) {
                this.A = couponInfo;
                this.e = couponInfo.selectedCouponViewId;
                this.f = couponInfo.selectedGoodsCouponViewId;
                this.g = couponInfo.selectedSgGoodsCouponViewId;
                this.m.setText(couponInfo.description);
                d(couponInfo);
                h.a(this.n, couponInfo.statusTip, this.F.aN_(), this.D, this.E);
                a(couponInfo);
                this.l.setVisibility(0);
                if (!TextUtils.isEmpty(couponInfo.iconUrl)) {
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = this.c;
                    a2.c = couponInfo.iconUrl;
                    a2.a(this.r);
                    this.r.setVisibility(0);
                } else {
                    this.r.setVisibility(8);
                }
                if (!couponInfo.isUsable()) {
                    this.q.setVisibility(8);
                } else {
                    this.q.setVisibility(0);
                }
                if (cVar.f == 1) {
                    if (this.s != null) {
                        this.s.a(cVar.g.d, "", cVar.g.b());
                    }
                    this.w.setVisibility(0);
                    this.x.setVisibility(8);
                } else if (cVar.f == 2) {
                    if (this.t != null) {
                        this.t.a(cVar.g.d, "", cVar.g.b());
                    }
                    this.w.setVisibility(8);
                    this.x.setVisibility(0);
                    z = true;
                    if (!z || TextUtils.isEmpty(couponInfo.poiCouponUseTip) || b(couponInfo)) {
                        this.p.setVisibility(8);
                    } else {
                        this.p.setVisibility(0);
                        this.o.setText(couponInfo.poiCouponUseTip);
                    }
                    z2 = couponInfo.isUsable();
                    str = couponInfo.statusTip;
                } else {
                    this.w.setVisibility(8);
                    this.x.setVisibility(8);
                }
                z = false;
                if (!z) {
                }
                this.p.setVisibility(8);
                z2 = couponInfo.isUsable();
                str = couponInfo.statusTip;
            }
        }
        if (this.l.getVisibility() == 0) {
            ViewGroup viewGroup = this.l;
            final int i = z2 ? 1 : 0;
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8dcccdfcab6afd57fb2dc2e4f9f5771f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8dcccdfcab6afd57fb2dc2e4f9f5771f");
                        return;
                    }
                    if (i == 1) {
                        b.a(b.this);
                    }
                    JudasManualManager.a("b_f6INz").a("coupon_category", str).a("c_ykhs39e").a(b.this.c).a();
                }
            });
        }
        this.l.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.b.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea24e7d67a155e132fccd8d9657ca958", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea24e7d67a155e132fccd8d9657ca958");
                } else {
                    b.d(b.this);
                }
            }
        });
        if (this.y.getVisibility() == 0) {
            this.y.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82bef3384ed4de21a2c9645cc45198b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82bef3384ed4de21a2c9645cc45198b9");
                    } else {
                        b.this.g();
                    }
                }
            });
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d50f7081e5be37718d6ec73edf864963", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d50f7081e5be37718d6ec73edf864963");
        } else if (this.s == null || this.w.getVisibility() != 0) {
        } else {
            String str = "";
            if (this.j != null && this.j.g != null) {
                str = this.j.g.a();
            }
            JudasManualManager.b("b_waimai_6e6bg3ni_mv").a("c_ykhs39e").a(this.c).a("poi_id", i.a(this.j != null ? this.j.b : 0L, this.j != null ? this.j.c : "")).a("vp_sku_id", str).a();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af6eb4a8cbc7f96ca062ef591c17751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af6eb4a8cbc7f96ca062ef591c17751");
            return;
        }
        this.B = true;
        h();
        if (this.j == null || this.j.e == null || this.A == null || TextUtils.isEmpty(this.A.statusTip)) {
            return;
        }
        JudasManualManager.b("b_sb768pey").a("c_ykhs39e").a("coupon_category", this.A.statusTip).a(this.c).a();
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f0b978e17eee1729f8950fa1077e12", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f0b978e17eee1729f8950fa1077e12")).booleanValue() : !this.B && this.l.getVisibility() == 0 && this.n.getVisibility() == 0;
    }

    public final void g() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9b81ec6e31962d806ef479373c36e98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9b81ec6e31962d806ef479373c36e98");
            return;
        }
        Activity activity = (Activity) this.c;
        if (activity == null || activity.isFinishing() || !(this.F instanceof com.sankuai.waimai.bussiness.order.confirm.a)) {
            return;
        }
        Rect rect = ((com.sankuai.waimai.bussiness.order.confirm.a) this.F).V.a().b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25ff6551624dcbe9111cadc0a0fee43b", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25ff6551624dcbe9111cadc0a0fee43b")).booleanValue();
        } else {
            z = !this.C && this.y.getVisibility() == 0;
        }
        if (z && ah.a(this.y, rect)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6433e40b25ae3d4419eeb998cbb3acd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6433e40b25ae3d4419eeb998cbb3acd");
                return;
            }
            this.C = true;
            if (this.j == null || this.j.e == null || this.A == null || !b(this.A)) {
                return;
            }
            if (this.j != null && this.j.h == 2) {
                if (com.sankuai.waimai.foundation.utils.b.b(this.j.e)) {
                    return;
                }
                for (CouponInfo couponInfo : this.j.e) {
                    if (couponInfo != null && couponInfo.type == 1 && couponInfo.collectOrder != null) {
                        JudasManualManager.b("b_waimai_qr68yvct_mv").a("c_ykhs39e").a("wm_preview_tanceng", 2).a("stid", couponInfo.collectOrder.mCouponCollectStid).a(this.c).a();
                    }
                }
                return;
            }
            JudasManualManager.b("b_waimai_qr68yvct_mv").a("c_ykhs39e").a("wm_preview_tanceng", 2).a(this.c).a();
        }
    }

    private void a(@Nullable final CouponInfo couponInfo) {
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf73e898ed3257f0af3f3d48d172155d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf73e898ed3257f0af3f3d48d172155d");
        } else if (couponInfo == null || couponInfo.type != 1) {
        } else {
            if (b(couponInfo)) {
                this.y.setVisibility(0);
                this.z.setText(couponInfo.collectOrder.collectOrderTip);
                this.y.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.b.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10a416074c84df798211a3d8b4318f73", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10a416074c84df798211a3d8b4318f73");
                            return;
                        }
                        if (b.this.k != null) {
                            b.this.k.a(3, couponInfo.collectOrder.couponPrice, couponInfo.collectOrder.couponDiscountPrice, couponInfo.collectOrder.spreadMoney, couponInfo.collectOrder.recommendCouponViewId);
                        }
                        if (b.this.j == null || b.this.j.h != 2) {
                            JudasManualManager.a("b_waimai_qr68yvct_mc").a("c_ykhs39e").a("wm_preview_tanceng", 2).a(b.this.c).a();
                        } else {
                            JudasManualManager.a("b_waimai_qr68yvct_mc").a("c_ykhs39e").a("wm_preview_tanceng", 2).a("stid", couponInfo.collectOrder.mCouponCollectStid).a(b.this.c).a();
                        }
                    }
                });
                return;
            }
            this.y.setVisibility(8);
        }
    }

    private boolean b(CouponInfo couponInfo) {
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a402f2af6ff6a2611552601a257da2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a402f2af6ff6a2611552601a257da2")).booleanValue() : (couponInfo.collectOrder == null || TextUtils.isEmpty(couponInfo.collectOrder.collectOrderTip) || couponInfo.collectOrder.spreadMoney == -1.0d || couponInfo.collectOrder.couponPrice == -1.0d || couponInfo.collectOrder.couponDiscountPrice == -1.0d) ? false : true;
    }

    private int c(CouponInfo couponInfo) {
        boolean z;
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af3c14b412297dd56a978cbbb442939a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af3c14b412297dd56a978cbbb442939a")).intValue();
        }
        if (a(couponInfo.isUsable(), couponInfo.selectedCouponViewId) || a(couponInfo.isUsable(), couponInfo.selectedGoodsCouponViewId) || a(couponInfo.isUsable(), couponInfo.selectedSgGoodsCouponViewId)) {
            return 0;
        }
        boolean isUsable = couponInfo.isUsable();
        String str = couponInfo.selectedCouponViewId;
        Object[] objArr2 = {Byte.valueOf(isUsable ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48c29cb0de8f9d985fc4d6028531d705", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48c29cb0de8f9d985fc4d6028531d705")).booleanValue();
        } else {
            z = isUsable && "-1".equals(str);
        }
        return z ? 1 : 2;
    }

    private void d(CouponInfo couponInfo) {
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a7a9edb7b45c42309009a00f3256e4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a7a9edb7b45c42309009a00f3256e4f");
            return;
        }
        c(couponInfo);
        if (couponInfo.statusTipStyle == 1) {
            this.n.setTextSize(2, 14.0f);
            this.n.setPadding(0, 0, 0, 0);
            this.n.setBackground(null);
            this.n.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_coupon_info_color));
            this.n.setCompoundDrawablePadding(0);
            this.n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (couponInfo.statusTipStyle == 2) {
            this.n.setTextSize(2, 12.0f);
            int a2 = g.a(this.c, 4.0f);
            this.n.setPadding(a2, 0, a2, 0);
            this.n.setBackground(this.c.getResources().getDrawable(R.drawable.wm_order_confirm_coupon_info_text_bg));
            this.n.setTextColor(-1);
            this.n.setCompoundDrawablePadding(0);
            this.n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (couponInfo.statusTipStyle == 0) {
            this.n.setTextSize(2, 14.0f);
            this.n.setPadding(0, 0, 0, 0);
            this.n.setBackground(null);
            this.n.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_title_text_color_hint));
            this.n.setCompoundDrawablePadding(0);
            this.n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    private boolean a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b17ef48a7760de38e06640e45deb97d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b17ef48a7760de38e06640e45deb97d")).booleanValue() : (!z || "0".equals(str) || "-1".equals(str)) ? false : true;
    }
}
