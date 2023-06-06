package com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
import java.util.Map;
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
    private TextView k;
    private ImageView l;
    private ImageView m;
    private LinearLayout n;
    private ImageView o;
    private LinearLayout p;
    private TextView q;
    private TextView r;
    private CouponInfo s;
    private boolean t;
    private boolean u;
    private final HashMap<String, Object> v;
    private CouponInfo w;
    private int x;
    private int y;
    @NonNull
    private final f z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, double d, double d2, double d3);

        void a(String str, String str2);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_coupon;
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3b6a88deded19d726615464dfb5f474c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3b6a88deded19d726615464dfb5f474c");
            return;
        }
        Activity activity = (Activity) bVar.c;
        if (activity == null || activity.isFinishing() || !(bVar.z instanceof com.sankuai.waimai.bussiness.order.confirm.a)) {
            return;
        }
        Rect rect = ((com.sankuai.waimai.bussiness.order.confirm.a) bVar.z).V.a().b;
        if (bVar.e() && ah.a(bVar.k, rect)) {
            bVar.f();
        }
    }

    public b(@NonNull Context context, @NonNull f fVar, @Nullable a aVar) {
        super(context);
        Object[] objArr = {context, fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21daa8ca0fb5eee5aa6fe5149315a2f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21daa8ca0fb5eee5aa6fe5149315a2f0");
            return;
        }
        this.e = "0";
        this.t = false;
        this.u = false;
        this.v = new HashMap<>();
        this.g = aVar;
        this.z = fVar;
        this.x = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_symbol);
        this.y = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_num);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76252d1964ecc880a83a3e5a256f1995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76252d1964ecc880a83a3e5a256f1995");
            return;
        }
        super.b();
        this.h = (ViewGroup) this.b.findViewById(R.id.layout_mt_coupon);
        this.i = (TextView) this.b.findViewById(R.id.txt_coupon_title);
        this.j = (TextView) this.b.findViewById(R.id.txt_mt_coupon_tip);
        this.k = (TextView) this.b.findViewById(R.id.txt_coupon_info);
        this.l = (ImageView) this.b.findViewById(R.id.coupon_dot_bubble);
        this.m = (ImageView) this.b.findViewById(R.id.img_coupon_package);
        this.n = (LinearLayout) this.b.findViewById(R.id.img_arrow_coupon_ll);
        this.o = (ImageView) this.b.findViewById(R.id.coupon_icon);
        this.p = (LinearLayout) this.b.findViewById(R.id.wm_coupon_collect_order_tip_ll);
        this.q = (TextView) this.b.findViewById(R.id.wm_coupon_collect_order_tip);
        this.r = (TextView) this.b.findViewById(R.id.wm_coupon_collect_order_tv);
        this.h.setPadding(this.h.getPaddingLeft(), g.a(this.c, 8.0f), this.h.getPaddingRight(), g.a(this.c, 8.0f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ffe375558bb445ae5cdc5e6495d14d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ffe375558bb445ae5cdc5e6495d14d8");
            return;
        }
        this.h.setVisibility(8);
        if (cVar.e == null || cVar.e.size() == 0) {
            return;
        }
        this.u = false;
        this.t = false;
        this.s = null;
        CouponInfo couponInfo = null;
        boolean z = false;
        for (CouponInfo couponInfo2 : cVar.e) {
            if (couponInfo2 != null && couponInfo2.type == 0) {
                this.s = couponInfo2;
                this.e = couponInfo2.selectedCouponViewId;
                this.i.setText(couponInfo2.description);
                if (!TextUtils.isEmpty(couponInfo2.mtCouponTip)) {
                    this.j.setVisibility(0);
                    this.j.setText(couponInfo2.mtCouponTip);
                } else {
                    this.j.setVisibility(8);
                }
                b(couponInfo2);
                a(couponInfo2);
                this.h.setVisibility(0);
                z = couponInfo2.isUsable();
                if (!couponInfo2.isUsable()) {
                    this.n.setVisibility(8);
                } else {
                    this.n.setVisibility(0);
                }
                if (!TextUtils.isEmpty(couponInfo2.iconUrl)) {
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = this.c;
                    a2.c = couponInfo2.iconUrl;
                    a2.a(this.o);
                    this.o.setVisibility(0);
                } else {
                    this.o.setVisibility(8);
                }
                if (!TextUtils.isEmpty(couponInfo2.couponSign)) {
                    b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a3.b = this.c;
                    a3.c = couponInfo2.couponSign;
                    a3.a(this.m);
                    this.m.setVisibility(0);
                    JudasManualManager.b("b_kz27sq8a").a("c_ykhs39e").a(this.c).a();
                } else {
                    this.m.setVisibility(8);
                }
                this.w = couponInfo2;
                if (couponInfo2.couponTipType == 1) {
                    this.l.setVisibility(0);
                } else {
                    this.l.setVisibility(8);
                }
                if (couponInfo2.bubbleSource == 1) {
                    this.v.clear();
                    if (cVar.d) {
                        JudasManualManager.b("b_3x1l0ywb").a("c_ykhs39e").a((Map<String, Object>) this.v).a(this.c).a();
                    }
                }
                a(couponInfo2.selectedCouponViewId);
                couponInfo = couponInfo2;
            }
        }
        if (this.h.getVisibility() == 0) {
            int i = couponInfo != null ? couponInfo.backgroundHighlightType : 0;
            Map<String, Object> extraMap = couponInfo != null ? couponInfo.getExtraMap() : null;
            final Long valueOf = Long.valueOf((extraMap != null && extraMap.containsKey("exchangeType") && (extraMap.get("exchangeType") instanceof Long)) ? ((Long) extraMap.get("exchangeType")).longValue() : 0L);
            ViewGroup viewGroup = this.h;
            final int i2 = i;
            final int i3 = z ? 1 : 0;
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ff2f797f089d61a04e8e2af8c323c7b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ff2f797f089d61a04e8e2af8c323c7b");
                        return;
                    }
                    if (i3 == 1 && b.this.g != null) {
                        b.this.g.a(b.this.e, com.sankuai.waimai.bussiness.order.base.a.a(cVar));
                    }
                    JudasManualManager.a a4 = JudasManualManager.a("b_1CdKD").a("is_exchange_merchant_red", i2).a("poi_id", i.a(cVar.b, cVar.c)).a("vip_coupon_type", valueOf.longValue());
                    if (cVar.h != null && cVar.h.d != null && cVar.h.d.g) {
                        a4.a("user_buy_status", cVar.h.d.i).a("cate_id", cVar.h.d.k == 31 ? 2 : 1);
                    }
                    a4.a("c_ykhs39e");
                    a4.a(b.this.c).a();
                }
            });
        }
        this.h.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c16109d314707a229c72d12fbde1cc60", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c16109d314707a229c72d12fbde1cc60");
                } else {
                    b.b(b.this);
                }
            }
        });
        if (this.p.getVisibility() == 0) {
            this.p.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fb1b717b842b43e5e1b4b5d88dad68d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fb1b717b842b43e5e1b4b5d88dad68d");
                    } else {
                        b.this.g();
                    }
                }
            });
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3b8fa7cc0296c878ded5b0875bdb94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3b8fa7cc0296c878ded5b0875bdb94");
        } else {
            com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(str);
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4700a74b39dc4d5819551d6139a94fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4700a74b39dc4d5819551d6139a94fb")).booleanValue() : !this.u && this.h.getVisibility() == 0 && this.k.getVisibility() == 0;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a2d8541a072c1dd2482315bd917bf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a2d8541a072c1dd2482315bd917bf9");
            return;
        }
        this.u = true;
        if (this.f == null || this.f.e == null || this.s == null) {
            return;
        }
        Map<String, Object> extraMap = this.s.getExtraMap();
        long longValue = (extraMap.containsKey("exchangeType") && (extraMap.get("exchangeType") instanceof Long)) ? ((Long) extraMap.get("exchangeType")).longValue() : 0L;
        if (TextUtils.isEmpty(this.s.statusTip) || this.s.backgroundHighlightType != 1) {
            return;
        }
        JudasManualManager.b("b_04lnbt2h").a("c_ykhs39e").a("poi_id", i.a(this.f != null ? this.f.b : 0L, this.f != null ? this.f.c : "")).a("vip_coupon_type", longValue).a(this.c).a();
    }

    public final void g() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ccb979eb728c1aaaef990e7cc955b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ccb979eb728c1aaaef990e7cc955b9d");
            return;
        }
        Activity activity = (Activity) this.c;
        if (activity == null || activity.isFinishing() || !(this.z instanceof com.sankuai.waimai.bussiness.order.confirm.a)) {
            return;
        }
        Rect rect = ((com.sankuai.waimai.bussiness.order.confirm.a) this.z).V.a().b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84f612724044790121e18d5c88bccfc9", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84f612724044790121e18d5c88bccfc9")).booleanValue();
        } else {
            z = !this.t && this.p.getVisibility() == 0;
        }
        if (z && ah.a(this.p, rect)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "820381162a698c6a79bafc4106272886", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "820381162a698c6a79bafc4106272886");
                return;
            }
            this.t = true;
            if (this.f == null || this.f.e == null || this.s == null || !c(this.s)) {
                return;
            }
            JudasManualManager.b("b_waimai_qr68yvct_mv").a("c_ykhs39e").a("wm_preview_tanceng", 1).a(this.c).a();
        }
    }

    private void a(@Nullable final CouponInfo couponInfo) {
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbbeb66a48f0cca94d11a257f9812e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbbeb66a48f0cca94d11a257f9812e6a");
        } else if (couponInfo == null || couponInfo.type != 0) {
        } else {
            if (c(couponInfo)) {
                this.p.setVisibility(0);
                this.r.setVisibility(0);
                this.p.setBackgroundResource(R.drawable.wm_order_confirm_collect_order_tip_bg_5);
                this.q.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_add_staple_color));
                this.q.setText(couponInfo.collectOrder.collectOrderTip);
                this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.b.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "558abe9456bd2e84a82890ba1ee83df4", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "558abe9456bd2e84a82890ba1ee83df4");
                            return;
                        }
                        if (b.this.g != null) {
                            b.this.g.a(2, couponInfo.collectOrder.couponPrice, couponInfo.collectOrder.couponDiscountPrice, couponInfo.collectOrder.spreadMoney);
                        }
                        JudasManualManager.a("b_waimai_qr68yvct_mc").a("c_ykhs39e").a("wm_preview_tanceng", 1).a(b.this.c).a();
                    }
                });
            } else if (!TextUtils.isEmpty(couponInfo.activityInfo)) {
                this.p.setVisibility(0);
                this.p.setBackgroundResource(R.drawable.wm_order_confirm_collect_order_tip_bg_4);
                this.q.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_title_text_color_auxiliary));
                this.q.setText(Html.fromHtml(couponInfo.activityInfo.replace("<highlight>", "<font color=\"#FF8000\">").replace("</highlight>", "</font>")));
                this.r.setVisibility(8);
            } else {
                this.p.setVisibility(8);
            }
        }
    }

    private void b(CouponInfo couponInfo) {
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c8ddc16b9e551a712d7244781aa2627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c8ddc16b9e551a712d7244781aa2627");
        } else if (couponInfo.statusTipStyle == 3 && !TextUtils.isEmpty(couponInfo.statusTip)) {
            int a2 = g.a(this.c, 4.0f);
            this.k.setPadding(0, 0, a2, 0);
            this.k.setTextSize(2, 12.0f);
            this.k.setBackground(this.c.getResources().getDrawable(R.drawable.wm_order_confirm_coupon_exchange_tag_bg));
            this.k.setTextColor(-10799872);
            this.k.setGravity(16);
            this.k.setCompoundDrawablePadding(a2);
            this.k.setCompoundDrawablesWithIntrinsicBounds(R.drawable.wm_order_confirm_coupon_vip_tag_icon, 0, 0, 0);
            this.k.setText(couponInfo.statusTip);
        } else {
            d(couponInfo);
            if (couponInfo.statusTipStyle == 1) {
                this.k.setTextSize(2, 14.0f);
                this.k.setPadding(0, 0, 0, 0);
                this.k.setBackground(null);
                this.k.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_coupon_info_color));
                this.k.setCompoundDrawablePadding(0);
                this.k.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else if (couponInfo.statusTipStyle == 2) {
                this.k.setTextSize(2, 12.0f);
                int a3 = g.a(this.c, 4.0f);
                this.k.setPadding(a3, 0, a3, 0);
                this.k.setBackground(this.c.getResources().getDrawable(R.drawable.wm_order_confirm_coupon_info_text_bg));
                this.k.setTextColor(-1);
                this.k.setCompoundDrawablePadding(0);
                this.k.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else if (couponInfo.statusTipStyle == 0) {
                this.k.setTextSize(2, 14.0f);
                this.k.setPadding(0, 0, 0, 0);
                this.k.setBackground(null);
                this.k.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_title_text_color_hint));
                this.k.setCompoundDrawablePadding(0);
                this.k.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            h.a(this.k, couponInfo.statusTip, this.z.aN_(), this.x, this.y);
        }
    }

    private boolean c(CouponInfo couponInfo) {
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcbc7cb580758d02264fef4150792739", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcbc7cb580758d02264fef4150792739")).booleanValue() : (couponInfo.collectOrder == null || TextUtils.isEmpty(couponInfo.collectOrder.collectOrderTip) || couponInfo.collectOrder.spreadMoney == -1.0d || couponInfo.collectOrder.couponPrice == -1.0d || couponInfo.collectOrder.couponDiscountPrice == -1.0d) ? false : true;
    }

    private int d(CouponInfo couponInfo) {
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "356f57af3faea547e4e073faa5c905da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "356f57af3faea547e4e073faa5c905da")).intValue();
        }
        String str = couponInfo.selectedCouponViewId;
        if (a(couponInfo.isUsable(), str)) {
            return 0;
        }
        return b(couponInfo.isUsable(), str) ? 1 : 2;
    }

    private boolean a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f17cfac2601ca849548591bcc08c58c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f17cfac2601ca849548591bcc08c58c")).booleanValue() : (!z || "0".equals(str) || "-1".equals(str)) ? false : true;
    }

    private boolean b(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ca35075cef066c38dbab04b03d315d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ca35075cef066c38dbab04b03d315d")).booleanValue() : z && "-1".equals(str);
    }
}
