package com.sankuai.waimai.bussiness.order.confirm.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.submit.model.CollectOrder;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.platform.widget.listforscrollview.a {
    public static ChangeQuickRedirect a;
    long b;
    String c;
    Context d;
    public b e;
    public a f;
    private f i;
    private List<DiscountItem> j;
    private int k;
    private int l;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(double d, double d2, List<CollectOrder.DiscountStageInfo> list);
    }

    public c(@NonNull Context context, @NonNull List<DiscountItem> list, @NonNull f fVar, long j, String str) {
        super(context, list);
        Object[] objArr = {context, list, fVar, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd76463beebc3866e47ba57b800e7a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd76463beebc3866e47ba57b800e7a5");
            return;
        }
        this.b = j;
        this.c = str;
        this.d = context;
        this.j = list;
        this.i = fVar;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_symbol);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_num);
    }

    @Override // com.sankuai.waimai.platform.widget.listforscrollview.a
    public final View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0695660bff8c006d74794555a26b27b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0695660bff8c006d74794555a26b27b6");
        }
        C0889c c0889c = new C0889c();
        View inflate = a().inflate(R.layout.wm_order_confirm_adapter_discount_list, (ViewGroup) null);
        c0889c.a = (TextView) inflate.findViewById(R.id.txt_discount_name);
        c0889c.b = (TextView) inflate.findViewById(R.id.txt_allowance_tip);
        c0889c.c = (TextView) inflate.findViewById(R.id.txt_discount_info);
        c0889c.d = (ImageView) inflate.findViewById(R.id.img_discount);
        c0889c.f = (TextView) inflate.findViewById(R.id.txt_discount_tip);
        c0889c.j = (LinearLayout) inflate.findViewById(R.id.txt_discount_tip_ll);
        c0889c.e = (ImageView) inflate.findViewById(R.id.img_wm_order_detail_coupon_package);
        c0889c.g = (LinearLayout) inflate.findViewById(R.id.wm_coupon_collect_order_tip_ll);
        c0889c.h = (TextView) inflate.findViewById(R.id.wm_discount_collect_order_tip);
        c0889c.i = (ImageView) inflate.findViewById(R.id.img_allowance_icon);
        inflate.setTag(c0889c);
        final DiscountItem discountItem = (DiscountItem) b(i);
        Object[] objArr2 = {c0889c, discountItem};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5299ef2a83365028d8570073df03bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5299ef2a83365028d8570073df03bea");
        } else {
            c0889c.a.setText(discountItem.name);
            h.a(c0889c.c, discountItem.info, this.i.aN_(), this.k, this.l);
            c0889c.c.setTextColor(this.d.getResources().getColor(discountItem.infoHighlight ? R.color.wm_order_confirm_text_money_color : R.color.wm_order_confirm_title_text_color_hint));
            if (!TextUtils.isEmpty(discountItem.allowanceTipStr)) {
                try {
                    discountItem.allowanceTip = DiscountItem.c.a(new JSONObject(discountItem.allowanceTipStr));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (discountItem.allowanceTip != null && !TextUtils.isEmpty(discountItem.allowanceTip.c)) {
                c0889c.b.setVisibility(0);
                c0889c.b.setText(discountItem.allowanceTip.c);
                if (!TextUtils.isEmpty(discountItem.allowanceTip.b)) {
                    try {
                        c0889c.b.setTextColor(Color.parseColor(discountItem.allowanceTip.b));
                    } catch (Exception e2) {
                        com.dianping.judas.util.a.a(e2);
                    }
                }
            } else {
                c0889c.b.setVisibility(8);
            }
            if (discountItem.collectOrderStagePreview != null) {
                c0889c.g.setVisibility(0);
                c0889c.h.setText(discountItem.collectOrderStagePreview.collectOrderTip);
                c0889c.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.adapter.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f251d737e8780b4865685ae71f62e820", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f251d737e8780b4865685ae71f62e820");
                        } else if (c.this.e == null || com.sankuai.waimai.foundation.utils.b.b(discountItem.collectOrderStagePreview.discountStageInfo)) {
                        } else {
                            c.this.e.a(discountItem.collectOrderStagePreview.discountStageInfo.get(0).spreadPrice, discountItem.collectOrderStagePreview.discountMoney, discountItem.collectOrderStagePreview.discountStageInfo);
                            JudasManualManager.a("b_waimai_qr68yvct_mc").a("c_ykhs39e").a("wm_preview_tanceng", 3).a(c.this.d).a();
                        }
                    }
                });
                JudasManualManager.b("b_waimai_qr68yvct_mv").a("c_ykhs39e").a("wm_preview_tanceng", 3).a(this.d).a();
                c0889c.j.setVisibility(8);
            } else {
                c0889c.g.setVisibility(8);
                if (TextUtils.isEmpty(discountItem.activityTip)) {
                    c0889c.j.setVisibility(8);
                } else {
                    c0889c.j.setVisibility(0);
                }
                ah.a(c0889c.f, discountItem.activityTip);
            }
            if (TextUtils.isEmpty(discountItem.icon_url)) {
                c0889c.d.setVisibility(8);
            } else {
                c0889c.d.setVisibility(0);
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.d;
                a2.c = discountItem.icon_url;
                a2.i = R.drawable.wm_common_default_poi_circle;
                a2.a(c0889c.d);
            }
            if (TextUtils.isEmpty(discountItem.couponSign)) {
                c0889c.e.setVisibility(8);
            } else {
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.b = this.d;
                a3.c = discountItem.couponSign;
                a3.a(c0889c.e);
                c0889c.e.setVisibility(0);
            }
            if (discountItem.type == 305 && !TextUtils.isEmpty(discountItem.discountDetailInfoStr)) {
                try {
                    discountItem.discountDetailInfo = DiscountItem.d.a(new JSONObject(discountItem.discountDetailInfoStr));
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                if (discountItem.discountDetailInfo != null) {
                    c0889c.i.setVisibility(0);
                    c0889c.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.adapter.c.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb35ff73370753a756d2b4e2ad7c2ab1", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb35ff73370753a756d2b4e2ad7c2ab1");
                                return;
                            }
                            c cVar = c.this;
                            DiscountItem.d dVar = discountItem.discountDetailInfo;
                            Object[] objArr4 = {dVar};
                            ChangeQuickRedirect changeQuickRedirect4 = c.a;
                            if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "e60e0881598a92c57b655def88fb80e6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "e60e0881598a92c57b655def88fb80e6");
                            } else {
                                JudasManualManager.b("b_waimai_ibvccbb5_mc", "c_ykhs39e", cVar.d).a("price_per_usr", dVar.c).a("poi_id", i.a(cVar.b, cVar.c)).a("sku_id", cVar.a(dVar)).a("allowance_amt", dVar.d.a).a(cVar.d).a();
                            }
                            c cVar2 = c.this;
                            DiscountItem.d dVar2 = discountItem.discountDetailInfo;
                            Object[] objArr5 = {dVar2};
                            ChangeQuickRedirect changeQuickRedirect5 = c.a;
                            if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "4a14849392c1e30e057558119819cc37", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "4a14849392c1e30e057558119819cc37");
                                return;
                            }
                            AllowanceDetailDialog allowanceDetailDialog = new AllowanceDetailDialog(cVar2.d, dVar2, cVar2.b, cVar2.c);
                            View decorView = allowanceDetailDialog.getWindow().getDecorView();
                            decorView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            int measuredHeight = decorView.getMeasuredHeight();
                            int a4 = g.a(cVar2.d, 488.0f);
                            int a5 = g.a(cVar2.d, 332.0f);
                            if (measuredHeight > a4) {
                                allowanceDetailDialog.getWindow().setLayout(-1, a4);
                            } else if (measuredHeight < a5) {
                                allowanceDetailDialog.getWindow().setLayout(-1, a5);
                            }
                            allowanceDetailDialog.show();
                            Object[] objArr6 = {dVar2};
                            ChangeQuickRedirect changeQuickRedirect6 = c.a;
                            if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "2836fa2650a793d0a841a1ef59db7773", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "2836fa2650a793d0a841a1ef59db7773");
                            } else {
                                JudasManualManager.c("b_waimai_5fp5qxbp_mv", "c_ykhs39e", cVar2.d).a("price_per_usr", dVar2.c).a("poi_id", i.a(cVar2.b, cVar2.c)).a("sku_id", cVar2.a(dVar2)).a("allowance_amt", dVar2.d.a).a(cVar2.d).a();
                            }
                        }
                    });
                } else {
                    c0889c.i.setVisibility(8);
                }
            } else {
                c0889c.i.setVisibility(8);
            }
            if (!TextUtils.isEmpty(discountItem.discountsDescScheme)) {
                c0889c.i.setVisibility(0);
                c0889c.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.adapter.c.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da7fca3d25486aa4bc1c3f1854189970", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da7fca3d25486aa4bc1c3f1854189970");
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(c.this.d, discountItem.discountsDescScheme);
                        }
                    }
                });
            }
            if (discountItem.id == 43 && discountItem.addOnItemInfoPreview != null && !aa.a(discountItem.addOnItemInfoPreview.c)) {
                c0889c.g.setVisibility(0);
                c0889c.h.setText(discountItem.addOnItemInfoPreview.c);
                c0889c.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.adapter.c.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b667d12dae9641fb63501708f61f3cfd", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b667d12dae9641fb63501708f61f3cfd");
                        } else if (c.this.f == null || discountItem.addOnItemInfoPreview == null || com.sankuai.waimai.foundation.utils.b.b(discountItem.addOnItemInfoPreview.d)) {
                        } else {
                            JudasManualManager.a("b_waimai_qr68yvct_mc").a("c_ykhs39e").a("wm_preview_tanceng", 4).a(c.this.d).a();
                        }
                    }
                });
                JudasManualManager.b("b_waimai_qr68yvct_mv").a("c_ykhs39e").a("wm_preview_tanceng", 4).a(this.d).a();
                c0889c.j.setVisibility(8);
            }
        }
        return inflate;
    }

    @NotNull
    String a(DiscountItem.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74d243781c305c150e600b8aa71532c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74d243781c305c150e600b8aa71532c0");
        }
        String str = "[";
        if (dVar.e != null && dVar.e.d != null && dVar.e.d.size() > 0) {
            str = "[" + dVar.e.d.get(0).e;
            for (int i = 1; i < dVar.e.d.size(); i++) {
                str = str + CommonConstant.Symbol.COMMA + dVar.e.d.get(i).e;
            }
        }
        return str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.adapter.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0889c {
        public TextView a;
        public TextView b;
        public TextView c;
        public ImageView d;
        public ImageView e;
        public TextView f;
        public LinearLayout g;
        public TextView h;
        public ImageView i;
        public LinearLayout j;

        public C0889c() {
        }
    }
}
