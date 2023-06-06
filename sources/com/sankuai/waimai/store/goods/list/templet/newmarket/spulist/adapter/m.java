package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.app.Dialog;
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
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.activities.ReceiveCouponTip;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.am;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class m extends com.sankuai.waimai.store.base.b implements View.OnClickListener {
    public static ChangeQuickRedirect b;
    protected View c;
    protected TextView d;
    protected TextView e;
    protected TextView f;
    protected TextView g;
    protected TextView h;
    protected TextView i;
    protected GoodsPoiCategory j;
    protected GoodsPoiCategory k;
    public com.sankuai.waimai.store.expose.v2.entity.b l;
    public j m;
    public ReceiveCouponTip n;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        public static String a = "b_waimai_sg_f77dc2k4_mv";
        public static String b = "b_waimai_sg_f77dc2k4_mc";
        public static String c = "b_waimai_mzic4qs9_mv";
        public static String d = "b_waimai_mzic4qs9_mc";
        public static String e = "b_waimai_sg_x2t33bpy_mv";
        public static String f = "b_waimai_sg_x2t33bpy_mc";
    }

    public m(Context context, j jVar) {
        super(context);
        Object[] objArr = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa2ceb5f8d9386ed7b71f5c02731597", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa2ceb5f8d9386ed7b71f5c02731597");
        } else {
            this.m = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566771e6c30cedf66f224eb54fb8dacc", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566771e6c30cedf66f224eb54fb8dacc") : layoutInflater.inflate(R.layout.wm_st_poi_market_adapter_slogen_header_v2, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39238f123db0c61f276684b000ff321b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39238f123db0c61f276684b000ff321b");
            return;
        }
        super.onViewCreated();
        this.c = this.mView.findViewById(R.id.slogan_root_view);
        this.d = (TextView) this.mView.findViewById(R.id.txt_slogan_header_price);
        this.e = (TextView) this.mView.findViewById(R.id.txt_slogan_header_desc);
        this.f = (TextView) this.mView.findViewById(R.id.txt_slogan_header_valid_time);
        this.g = (TextView) this.mView.findViewById(R.id.txt_slogan_header_btn);
        this.h = (TextView) this.mView.findViewById(R.id.txt_slogan_header_symbol);
        this.i = (TextView) this.mView.findViewById(R.id.txt_slogan_header_discount);
        this.l = new com.sankuai.waimai.store.expose.v2.entity.b(a() ? a.e : a.a, this.c);
        if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, this.l);
        }
    }

    public void a(k kVar, int i, int i2) {
        Object[] objArr = {kVar, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3cc70577c6cdafc5ce897eef152535c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3cc70577c6cdafc5ce897eef152535c");
        } else if (kVar == null) {
        } else {
            GoodsPoiCategory goodsPoiCategory = kVar.b;
            this.k = goodsPoiCategory;
            this.j = this.m.m();
            if (goodsPoiCategory == null || goodsPoiCategory.receiveCouponTip == null) {
                return;
            }
            this.n = goodsPoiCategory.receiveCouponTip;
            if (this.j.type == 25) {
                this.l = new com.sankuai.waimai.store.expose.v2.entity.b(a.c, this.c);
                if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
                    com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, this.l);
                }
                this.l.b(c(this.n));
            } else {
                this.l.b(b(this.n));
            }
            a(this.n);
        }
    }

    public final void a(ReceiveCouponTip receiveCouponTip) {
        int i;
        Object[] objArr = {receiveCouponTip};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd9b044d182c9d1881dd325561ee8b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd9b044d182c9d1881dd325561ee8b96");
            return;
        }
        int i2 = -6711404;
        if (receiveCouponTip.couponStatus == 0) {
            this.c.setBackgroundResource(R.drawable.wm_sc_poi_coupon_getting);
            i2 = -1;
            this.f.setTextColor(-1711276033);
            i = -1;
        } else if (receiveCouponTip.couponStatus == 1) {
            this.c.setBackgroundResource(R.drawable.wm_sc_poi_coupon_got);
            i2 = -40093;
            i = -21347;
            this.f.setTextColor(-1711322586);
        } else if (receiveCouponTip.couponStatus != 4) {
            return;
        } else {
            this.c.setBackgroundResource(R.drawable.wm_sc_poi_coupon_empty);
            i = -4408131;
            this.f.setVisibility(8);
            this.f.setTextColor(-6711404);
        }
        this.c.setPadding(this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6), 0, 0, 0);
        this.h.setTextColor(i2);
        this.i.setTextColor(i2);
        this.d.setTextColor(i2);
        this.e.setTextColor(i2);
        this.g.setTextColor(i);
        if (!com.sankuai.shangou.stone.util.t.a(receiveCouponTip.price)) {
            String str = receiveCouponTip.price;
            if (str.charAt(0) == 165 || str.charAt(0) == 65509) {
                this.h.setVisibility(0);
                this.h.setText("¥");
                str = str.substring(1);
            } else {
                this.h.setVisibility(8);
            }
            if (str.endsWith("折")) {
                this.i.setVisibility(0);
                this.i.setText("折");
                str = str.substring(0, str.length() - 1);
            } else {
                this.i.setVisibility(8);
            }
            this.d.setVisibility(0);
            this.d.setText(str);
        } else {
            this.d.setVisibility(8);
        }
        if (!com.sankuai.shangou.stone.util.t.a(receiveCouponTip.activityDesc)) {
            this.e.setVisibility(0);
            this.e.setText(receiveCouponTip.activityDesc);
        } else {
            this.e.setVisibility(8);
        }
        if (!com.sankuai.shangou.stone.util.t.a(receiveCouponTip.couponValidTimeText) && receiveCouponTip.couponStatus != 4) {
            this.f.setVisibility(0);
            this.f.setText(receiveCouponTip.couponValidTimeText);
        } else {
            this.f.setVisibility(8);
        }
        d(receiveCouponTip);
        if (!com.sankuai.shangou.stone.util.t.a(receiveCouponTip.couponButtonText)) {
            this.g.setVisibility(0);
            this.g.setText(receiveCouponTip.couponButtonText);
        } else {
            this.g.setVisibility(8);
        }
        if (receiveCouponTip.couponStatus == 0) {
            this.g.setClickable(true);
            this.g.setOnClickListener(this);
            return;
        }
        this.g.setClickable(false);
        this.g.setOnClickListener(null);
    }

    public final Map<String, Object> b(ReceiveCouponTip receiveCouponTip) {
        Object[] objArr = {receiveCouponTip};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6afe83e1f61c0bac5534c656c2077620", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6afe83e1f61c0bac5534c656c2077620");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", (this.m.p() == null || this.m.p().d() == null) ? "-999" : this.m.p().d());
        hashMap.put("stid", this.m.p().b.abExpInfo);
        hashMap.put("coupon_id", Long.valueOf(receiveCouponTip.couponId));
        hashMap.put("status", Integer.valueOf(receiveCouponTip.couponStatus));
        hashMap.put("coupon_source", Integer.valueOf(receiveCouponTip.couponType));
        Map<String, String> t = this.m.t();
        if (t != null && !t.isEmpty()) {
            String str = t.get("rank_trace_id");
            if (str != null) {
                hashMap.put("rankTraceIdV2", str);
            }
            String str2 = t.get("rank_extend");
            if (str2 != null) {
                hashMap.put("rankExtendV2", str2);
            }
        }
        return hashMap;
    }

    public final Map<String, Object> c(ReceiveCouponTip receiveCouponTip) {
        Object[] objArr = {receiveCouponTip};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da480d9e3c60f6f741b89844ecccec4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da480d9e3c60f6f741b89844ecccec4");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stid", this.m.p().b.abExpInfo);
        hashMap.put("coupon_id", Long.valueOf(receiveCouponTip.couponId));
        hashMap.put("status", Integer.valueOf(receiveCouponTip.couponStatus));
        hashMap.put("activity_id", Long.valueOf(receiveCouponTip.activityId));
        hashMap.put("activity_type", Integer.valueOf(this.k.mWmActivityTypeValue));
        hashMap.put("coupon_type", Integer.valueOf(receiveCouponTip.couponType));
        hashMap.put("poi_id", (this.m.p() == null || this.m.p().d() == null) ? "-999" : this.m.p().d());
        Map<String, String> t = this.m.t();
        if (t != null && !t.isEmpty()) {
            String str = t.get("rank_trace_id");
            if (str != null) {
                hashMap.put("rankTraceIdV2", str);
            }
            String str2 = t.get("rank_extend");
            if (str2 != null) {
                hashMap.put("rankExtendV2", str2);
            }
        }
        return hashMap;
    }

    private void d(ReceiveCouponTip receiveCouponTip) {
        Object[] objArr = {receiveCouponTip};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538c02183c5fd0640179d8d3877c8b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538c02183c5fd0640179d8d3877c8b69");
        } else if (receiveCouponTip.couponStatus == 4) {
            receiveCouponTip.couponButtonText = "已抢光";
        } else if (receiveCouponTip.couponStatus == 1) {
            receiveCouponTip.couponButtonText = "已领";
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b96510cdb126832a235257015d510132", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b96510cdb126832a235257015d510132");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9c0fc7a6efd7854fe7417703204806c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9c0fc7a6efd7854fe7417703204806c");
        } else if (this.mContext instanceof SCBaseActivity) {
            final Dialog a2 = com.sankuai.waimai.store.util.d.a(this.mContext);
            com.sankuai.waimai.store.base.net.sg.a.a((Object) ((SCBaseActivity) this.mContext).w()).a(this.m.p().f(), this.m.p().h(), this.n.couponPoolId, this.n.couponId, this.n.activityId, this.n.couponType, null, "inner_sd", a() ? "inner_sd_04" : "inner_sd_06", new com.sankuai.waimai.store.base.net.k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.m.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) obj;
                    Object[] objArr3 = {poiCouponItem};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3bf64f0e841b8cbb5b275d4763ea681", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3bf64f0e841b8cbb5b275d4763ea681");
                        return;
                    }
                    super.a((AnonymousClass1) poiCouponItem);
                    com.sankuai.waimai.store.util.d.a(a2);
                    com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2de863a0a4eeeaf4b0e579999a9e8406", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2de863a0a4eeeaf4b0e579999a9e8406");
                        return;
                    }
                    super.a(bVar);
                    com.sankuai.waimai.store.util.d.a(a2);
                    String message = bVar.getMessage();
                    if (TextUtils.isEmpty(message)) {
                        message = m.this.mContext.getString(R.string.wm_sc_coupon_receive_failed);
                    }
                    am.a(m.this.mContext, message);
                }
            });
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.mContext, a() ? a.f : (this.j == null || this.j.type != 25) ? a.b : a.d).b((this.j == null || this.j.type != 25) ? b(this.n) : c(this.n)).a();
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a3aa240fa8dcc47b32a86d97f1cf71", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a3aa240fa8dcc47b32a86d97f1cf71")).booleanValue() : (this.m == null || this.m.p() == null || this.m.p().d != 3) ? false : true;
    }
}
