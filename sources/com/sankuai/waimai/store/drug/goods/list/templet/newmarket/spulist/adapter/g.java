package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

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
import com.sankuai.waimai.store.util.am;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.base.b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    protected View b;
    protected TextView c;
    protected TextView d;
    protected TextView e;
    protected TextView f;
    protected TextView g;
    protected TextView h;
    public com.sankuai.waimai.store.expose.v2.entity.b i;
    public d j;
    public ReceiveCouponTip k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static String a = "b_waimai_0pcol6bz_mv";
        public static String b = "b_waimai_0pcol6bz_mc";
    }

    public g(Context context, d dVar) {
        super(context);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ae2a5bc43871f1ce4298f32e0fb92c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ae2a5bc43871f1ce4298f32e0fb92c6");
        } else {
            this.j = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8130adc9f569be823d9d1b8161aafc1a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8130adc9f569be823d9d1b8161aafc1a") : layoutInflater.inflate(R.layout.wm_drug_poi_market_adapter_slogen_header_v2, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df6bde9a534937d599e651dbc0adf5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df6bde9a534937d599e651dbc0adf5d");
            return;
        }
        super.onViewCreated();
        this.b = this.mView.findViewById(R.id.slogan_root_view);
        this.c = (TextView) this.mView.findViewById(R.id.txt_slogan_header_price);
        this.d = (TextView) this.mView.findViewById(R.id.txt_slogan_header_desc);
        this.e = (TextView) this.mView.findViewById(R.id.txt_slogan_header_valid_time);
        this.f = (TextView) this.mView.findViewById(R.id.txt_slogan_header_btn);
        this.g = (TextView) this.mView.findViewById(R.id.txt_slogan_header_symbol);
        this.h = (TextView) this.mView.findViewById(R.id.txt_slogan_header_discount);
        this.i = new com.sankuai.waimai.store.expose.v2.entity.b(a.a, this.b);
        if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, this.i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.e r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.g.a(com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.e, int, int):void");
    }

    private Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b969f3110695dbf5056463944d2c3daf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b969f3110695dbf5056463944d2c3daf");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.j.n().d());
        hashMap.put("stid", this.j.n().b.abExpInfo);
        hashMap.put("coupon_id", Long.valueOf(this.k.couponId));
        hashMap.put("coupon_source", Integer.valueOf(this.k.couponType));
        return hashMap;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b531d46a4e18382dfaf9d797c8120bd4", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b531d46a4e18382dfaf9d797c8120bd4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "119de2bc477a1a6901421e54673af48c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "119de2bc477a1a6901421e54673af48c");
        } else if (this.mContext instanceof SCBaseActivity) {
            final Dialog a2 = com.sankuai.waimai.store.util.d.a(this.mContext);
            com.sankuai.waimai.store.drug.goods.list.utils.b.a(this.j.n().f(), this.j.n().h(), this.k.couponPoolId, this.k.couponId, this.k.activityId, this.k.couponType, (String) null, new com.sankuai.waimai.store.base.net.k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.g.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) obj;
                    Object[] objArr3 = {poiCouponItem};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "32b929266e6c3e21ba4cbf468143f0fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "32b929266e6c3e21ba4cbf468143f0fd");
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
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9081132b30315bec74160b4b38e5b651", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9081132b30315bec74160b4b38e5b651");
                        return;
                    }
                    super.a(bVar);
                    com.sankuai.waimai.store.util.d.a(a2);
                    String message = bVar.getMessage();
                    if (TextUtils.isEmpty(message)) {
                        message = g.this.mContext.getString(R.string.wm_sc_coupon_receive_failed);
                    }
                    am.a(g.this.mContext, message);
                }
            }, ((SCBaseActivity) this.mContext).w());
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.mContext, a.b).b(a()).a();
    }
}
