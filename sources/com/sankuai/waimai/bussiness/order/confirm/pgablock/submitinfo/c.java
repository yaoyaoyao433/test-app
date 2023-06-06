package com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.checkbox.RooCheckBox;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.order.submit.model.PreDecision;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private View A;
    private TextView B;
    private TextView C;
    private TextView D;
    private View E;
    private TextView F;
    private TextView G;
    private RooIconFont H;
    private int I;
    private int J;
    private double K;
    private int L;
    private com.sankuai.waimai.bussiness.order.confirm.a M;
    private boolean N;
    private boolean O;
    private ImageView P;
    private TextView Q;
    private boolean R;
    private RelativeLayout S;
    LinearLayout e;
    TextView f;
    LinearLayout g;
    View h;
    TextView i;
    View j;
    ViewGroup k;
    protected com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d l;
    ValueAnimator m;
    RooCheckBox n;
    public boolean o;
    public boolean p;
    TextView q;
    TextView r;
    private View s;
    private FrameLayout t;
    private TextView u;
    private TextView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private View z;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_price_submit_b;
    }

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "98bb16987652647972f34405dc917cfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "98bb16987652647972f34405dc917cfc");
            return;
        }
        cVar.k.setVisibility(8);
        cVar.M.S.a((com.meituan.android.cube.pga.common.b<Void>) null);
    }

    public c(Context context, @Nullable ViewStub viewStub, @NonNull com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "294102d5e2be1eca9fc3cc95050dd4fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "294102d5e2be1eca9fc3cc95050dd4fc");
            return;
        }
        this.m = null;
        this.K = -1.0d;
        this.N = false;
        this.O = false;
        this.o = false;
        this.p = false;
        this.R = false;
        this.M = aVar;
        if (com.sankuai.waimai.platform.model.c.a().b() == 1) {
            this.I = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_submit_b_rmb_symbol_elderly);
            this.J = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_submit_b_price_num_elderly);
        } else {
            this.I = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_submit_b_rmb_symbol);
            this.J = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_submit_b_price_num);
        }
        if (aVar.aM_()) {
            this.C.setTextSize(0, this.J);
            this.C.setTypeface(aVar.aN_());
            this.x.setTextSize(0, this.J);
            this.x.setTypeface(aVar.aN_());
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0549bbb51476d809d96b9ffdc74818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0549bbb51476d809d96b9ffdc74818");
            return;
        }
        super.b();
        this.e = (LinearLayout) this.b.findViewById(R.id.rl_rect_bg);
        this.s = this.b.findViewById(R.id.price_view_submit);
        this.f = (TextView) this.b.findViewById(R.id.txt_total_price_discounts);
        this.g = (LinearLayout) this.b.findViewById(R.id.txt_total_price_discounts_ll);
        this.t = (FrameLayout) this.b.findViewById(R.id.txt_total_price_discounts_fl);
        this.u = (TextView) this.b.findViewById(R.id.txt_total_price_discounts_first);
        this.v = (TextView) this.b.findViewById(R.id.txt_total_price_discounts_second);
        this.h = this.b.findViewById(R.id.txt_order_submit);
        this.w = (TextView) this.b.findViewById(R.id.txt_price_total);
        this.x = (TextView) this.b.findViewById(R.id.txt_total_price_discounted);
        this.i = (TextView) this.b.findViewById(R.id.txt_order_submit_content);
        this.y = (TextView) this.b.findViewById(R.id.text_vip_price_tips);
        this.A = this.b.findViewById(R.id.price_view_submit_enhance_pay_by_friend);
        this.E = this.b.findViewById(R.id.price_view_submit_enhance_pay_by_friend_line1);
        this.B = (TextView) this.b.findViewById(R.id.txt_total_price_discounts_enhance_pay_by_friend);
        this.C = (TextView) this.b.findViewById(R.id.txt_total_price_discounted_enhance_pay_by_friend);
        this.D = (TextView) this.b.findViewById(R.id.text_vip_price_tips_enhance_pay_by_friend);
        this.j = this.b.findViewById(R.id.btn_pay_by_friend);
        this.F = (TextView) this.b.findViewById(R.id.txt_pay_by_friend);
        this.k = (ViewGroup) this.b.findViewById(R.id.layout_order_coupon_tip_popup);
        this.G = (TextView) this.b.findViewById(R.id.txt_order_coupon_tip);
        this.H = (RooIconFont) this.b.findViewById(R.id.iv_order_coupon_tip_close);
        this.P = (ImageView) this.b.findViewById(R.id.im_wm_order_confirm_save_money);
        this.Q = (TextView) this.b.findViewById(R.id.txt_use_mt_pay);
        this.n = (RooCheckBox) this.b.findViewById(R.id.im_wm_order_confirm_selected);
        this.q = (TextView) this.b.findViewById(R.id.txt_pay_second_title_tip);
        this.r = (TextView) this.b.findViewById(R.id.txt_discount_payment_guarantee);
        this.S = (RelativeLayout) this.b.findViewById(R.id.rl_total_price_discounted);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2831d1987d635a515a449cb4883aa060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2831d1987d635a515a449cb4883aa060");
        } else if (com.sankuai.waimai.platform.model.c.a().b() == 1) {
            this.e.setBackgroundResource(R.drawable.wm_order_confirm_submit_layout_bg_new_elderly);
            this.f.setTextSize(2, 22.0f);
            this.u.setTextSize(2, 22.0f);
            this.v.setTextSize(2, 18.0f);
            this.w.setTextSize(2, 22.0f);
            this.w.setVisibility(8);
            this.x.setTextSize(2, 30.0f);
            this.y.setTextSize(2, 18.0f);
            this.C.setTextSize(2, 30.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.C.getLayoutParams();
            layoutParams.height = g.a(this.c, 32.0f);
            this.C.setLayoutParams(layoutParams);
            this.D.setTextSize(2, 18.0f);
            this.B.setTextSize(2, 18.0f);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.j.getLayoutParams();
            layoutParams2.height = g.a(this.c, 76.0f);
            this.j.setLayoutParams(layoutParams2);
            this.F.setTextSize(2, 22.0f);
            this.h.setBackgroundResource(R.drawable.wm_order_comfirm_submit_btn_selector_elderly);
            this.i.setTextSize(2, 22.0f);
        } else {
            this.e.setBackgroundResource(R.drawable.wm_order_confirm_submit_layout_bg_new);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf406ae093f0b8df9e20b49fc141435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf406ae093f0b8df9e20b49fc141435");
        } else {
            this.F.setTextColor(z ? this.c.getResources().getColor(R.color.wm_common_orange_5) : this.c.getResources().getColor(R.color.wm_order_pay_by_friend_unable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(double d2, boolean z, boolean z2) {
        Object[] objArr = {Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd76c4782ea94b143f6b674dd05a10a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd76c4782ea94b143f6b674dd05a10a4");
            return;
        }
        Typeface aN_ = this.M.aN_();
        if (!this.N) {
            if (!z || z2) {
                h.a(this.x, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(d2)), aN_, this.I, this.J);
            } else {
                h.a(this.x, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(d2), 0, 2)), aN_, this.I, this.J);
            }
            this.x.setVisibility(0);
            return;
        }
        if (!z || z2) {
            h.a(this.C, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(d2)), aN_, this.I, this.J);
        } else {
            h.a(this.C, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(d2), 0, 2)), aN_, this.I, this.J);
        }
        this.C.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x05c3, code lost:
        if (2 == r32.M.aL_()) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x06d8, code lost:
        if (r2 >= 0.0d) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06dc, code lost:
        if (r32.O != false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d r33, int r34) {
        /*
            Method dump skipped, instructions count: 2384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.c.a(com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d, int):void");
    }

    private void a(List<CouponInfo> list, long j, String str) {
        Object[] objArr = {list, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9549cd44a8fc2a33a8c4149cbe37258c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9549cd44a8fc2a33a8c4149cbe37258c");
        } else if (list != null && list.size() != 0) {
            CouponInfo couponInfo = null;
            for (CouponInfo couponInfo2 : list) {
                if (couponInfo2 != null && couponInfo2.type == 0) {
                    couponInfo = couponInfo2;
                }
            }
            Map<String, Object> couponExtraMap = couponInfo != null ? couponInfo.getCouponExtraMap() : null;
            if (couponExtraMap != null) {
                if (couponExtraMap.containsKey("unusableToast")) {
                    String str2 = (String) couponExtraMap.get("unusableToast");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    ae.a(this.c, str2);
                    JudasManualManager.a a = JudasManualManager.a("b_waimai_75mp5bx6_mc").a("poi_id", i.a(j, str));
                    a.a("c_ykhs39e");
                    a.a(this.c).a();
                } else if (couponExtraMap.containsKey("usableToast")) {
                    String replace = ((String) couponExtraMap.get("usableToast")).replace("<highlight>", "<font color=\"#FF4A26\">").replace("</highlight>", "</font>");
                    if (TextUtils.isEmpty(replace)) {
                        return;
                    }
                    Object[] objArr2 = {replace};
                    ChangeQuickRedirect changeQuickRedirect2 = d;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fb6086e7a7113f117f56c9b0a82685f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fb6086e7a7113f117f56c9b0a82685f");
                        return;
                    }
                    this.k.setVisibility(0);
                    this.G.setText(Html.fromHtml(replace));
                    if (this.l.q != null) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k.getLayoutParams();
                        layoutParams.setMargins(g.a(this.c, 16.0f), 0, 0, g.a(this.c, 0.0f));
                        this.k.setLayoutParams(layoutParams);
                    }
                    this.H.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.c.4
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a109ab3c6db411335142db951f5b0ae0", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a109ab3c6db411335142db951f5b0ae0");
                            } else {
                                c.a(c.this);
                            }
                        }
                    });
                    this.k.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.c.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2813ec931064f49d4ea40c53629e92a8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2813ec931064f49d4ea40c53629e92a8");
                            } else {
                                c.a(c.this);
                            }
                        }
                    }, PayTask.j);
                }
            }
        }
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a43ac4fb76498da2fe800a320ef9428", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a43ac4fb76498da2fe800a320ef9428");
        }
        if (this.l.q != null) {
            PreDecision preDecision = this.l.q;
            if (preDecision.productList != null) {
                List<PreDecision.ProductListItem> list = preDecision.productList;
                if (list.size() != 0) {
                    PreDecision.ProductListItem productListItem = list.get(0);
                    if (productListItem.prePromoInfo != null) {
                        com.sankuai.waimai.business.order.submit.model.c cVar = productListItem.prePromoInfo;
                        return (cVar.e == null || cVar.e.length() <= 0) ? "" : cVar.e;
                    }
                    return "";
                }
                return "";
            }
            return "";
        }
        return "";
    }

    private String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf73bafe1caea956e5230cb34165ecc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf73bafe1caea956e5230cb34165ecc");
        }
        if (this.l.q != null) {
            PreDecision preDecision = this.l.q;
            return !TextUtils.isEmpty(preDecision.payByFriendPopTip) ? preDecision.paySecondTitleTip : "";
        }
        return "";
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf643b35a30e9d548a337344b9738e01", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf643b35a30e9d548a337344b9738e01");
        }
        if (this.l.q != null) {
            PreDecision preDecision = this.l.q;
            return !TextUtils.isEmpty(preDecision.payByFriendPopTip) ? preDecision.payByFriendPopTip : "";
        }
        return "";
    }
}
