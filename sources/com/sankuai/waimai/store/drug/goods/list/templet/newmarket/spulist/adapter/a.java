package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.coupon.MemberCouponEntry;
import com.sankuai.waimai.store.drug.coupon.a;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    ImageView b;
    TextView c;
    ImageView d;
    com.sankuai.waimai.store.expose.v2.entity.b e;
    private a.b f;
    private d g;

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "77bc90d096dd2bae225733d7605eaac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "77bc90d096dd2bae225733d7605eaac2");
        } else if (aVar.g.n() != null) {
            if (aVar.f == null) {
                aVar.f = new com.sankuai.waimai.store.drug.coupon.d(new MemberCouponEntry(aVar.mContext));
            }
            com.sankuai.waimai.store.manager.judas.b.a(aVar.mContext, "b_waimai_r9p85p75_mc").b(aVar.a()).a();
            aVar.f.a(aVar.g.n().f(), aVar.g.n().d(), ((SCBaseActivity) aVar.mContext).w(), (Dialog) null, 6, (Poi.PoiCouponItem) null);
        }
    }

    public a(Context context, d dVar) {
        super(context);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4482df2423a8630645b71a00bcb8b1e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4482df2423a8630645b71a00bcb8b1e7");
        } else {
            this.g = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8555bcd207a41ef2af2a4aafb9f6a3f3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8555bcd207a41ef2af2a4aafb9f6a3f3") : layoutInflater.inflate(R.layout.wm_drug_to_be_poi_member_layout, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8548faa3c20dedc8536d72af6f33ff1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8548faa3c20dedc8536d72af6f33ff1");
            return;
        }
        super.onViewCreated();
        this.mView.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.mContext, 4.0f)).c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFF8E9)).a());
        this.b = (ImageView) this.mView.findViewById(R.id.to_be_member_icon);
        this.c = (TextView) this.mView.findViewById(R.id.to_be_member_text);
        this.d = (ImageView) this.mView.findViewById(R.id.to_be_member_container_bg);
        this.mView.findViewById(R.id.join_member).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bb0395514ae7d65a11ddf953019aacd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bb0395514ae7d65a11ddf953019aacd");
                } else {
                    a.a(a.this);
                }
            }
        });
        this.e = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_r9p85p75_mv", this.mView);
        if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c170f7439c853cea62d6bf6b60d9c44", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c170f7439c853cea62d6bf6b60d9c44");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.g.n() == null ? "-999" : this.g.n().d());
        hashMap.put("cat_id", "102530");
        hashMap.put("show_position", 2);
        return hashMap;
    }
}
