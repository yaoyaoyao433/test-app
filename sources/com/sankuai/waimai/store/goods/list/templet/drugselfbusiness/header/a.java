package com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.header;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.viewblocks.header.l;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.viewblocks.i;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.goods.list.viewblocks.header.a {
    public static ChangeQuickRedirect c;
    private l d;
    private TextView l;
    private TextView m;
    private ImageView n;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_sc_drug_self_bussiness_header_layout;
    }

    public a(@NonNull d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9284e987e631a89a5b931a372337f642", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9284e987e631a89a5b931a372337f642");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924e0ff229c227bba8d895a638008973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924e0ff229c227bba8d895a638008973");
            return;
        }
        this.d = new com.sankuai.waimai.store.goods.list.viewblocks.header.widget.a(this.a, view.findViewById(R.id.shop_logo_layout));
        this.l = (TextView) view.findViewById(R.id.poi_page_header_poi_name);
        this.m = (TextView) view.findViewById(R.id.poi_page_header_poi_impression_text);
        this.n = (ImageView) view.findViewById(R.id.icon);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final i a(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73251e1175334d3e4ae0dd75407f4c61", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73251e1175334d3e4ae0dd75407f4c61") : new i(dVar) { // from class: com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.header.a.1
            @Override // com.sankuai.waimai.store.viewblocks.i
            public final int a() {
                return R.layout.wm_sc_self_business_shop_action_bar;
            }
        };
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4608471988ee3fd74e5a36594e736d3b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4608471988ee3fd74e5a36594e736d3b")).intValue() : this.mView.getMeasuredHeight();
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8890f4e67e5522e29074ca47ef0178ca", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8890f4e67e5522e29074ca47ef0178ca")).intValue() : h.a(this.mContext, 63.0f) + u.a(getContext());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(RestMenuResponse restMenuResponse) {
        Poi.PoiImpressLabel poiImpressLabel;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acc9eecb225d2bf5c50fe451bf8e79ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acc9eecb225d2bf5c50fe451bf8e79ef");
            return;
        }
        super.a(restMenuResponse);
        Poi poi = restMenuResponse.getPoi();
        if (poi == null) {
            return;
        }
        this.d.a(poi);
        l lVar = this.d;
        Object[] objArr2 = {4};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "b4e162a908e81d8a3d60b1d9af8ddfab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "b4e162a908e81d8a3d60b1d9af8ddfab");
        } else {
            lVar.b.setBackgroundResource(R.color.transparent);
            lVar.c.setVisibility(4);
        }
        Object[] objArr3 = {poi};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09274f1e8dee2ad6b92327e17324d761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09274f1e8dee2ad6b92327e17324d761");
        } else {
            this.l.setText(poi.name);
        }
        Object[] objArr4 = {poi};
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "828c7c4972629fa45846f856273a5373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "828c7c4972629fa45846f856273a5373");
        } else {
            Poi.PoiLabel newPoiLabels = poi.getNewPoiLabels();
            if (newPoiLabels != null && (poiImpressLabel = (Poi.PoiImpressLabel) com.sankuai.shangou.stone.util.a.a((List<Object>) newPoiLabels.labels, 0)) != null) {
                this.m.setText(poiImpressLabel.mLabelText);
            }
        }
        Object[] objArr5 = {poi};
        ChangeQuickRedirect changeQuickRedirect5 = c;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2357f68d81730b87d31f8a4977788a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2357f68d81730b87d31f8a4977788a79");
        } else {
            m.b(poi.nameTag).a(this.n);
        }
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a1bef4b11c221671543da20771bc0e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a1bef4b11c221671543da20771bc0e")).intValue() : a() - b();
    }
}
