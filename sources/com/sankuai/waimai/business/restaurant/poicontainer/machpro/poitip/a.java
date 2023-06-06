package com.sankuai.waimai.business.restaurant.poicontainer.machpro.poitip;

import android.content.Context;
import android.content.DialogInterface;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.block.b;
import com.meituan.android.cube.pga.common.e;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.RestRecommendPoi;
import com.sankuai.waimai.platform.model.c;
import com.sankuai.waimai.restaurant.shopcart.ui.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends b<com.meituan.android.cube.pga.viewmodel.a<JsonObject>, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect f;
    PoiTipPopupFragment g;
    private e h;

    public static /* synthetic */ void a(a aVar, Poi poi) {
        h hVar;
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "08ae1b3ee8f9f6a5d645adc9358daf6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "08ae1b3ee8f9f6a5d645adc9358daf6b");
        } else if (!(aVar.l() instanceof WMRestaurantActivity) || (hVar = aVar.F().F.v.a().b) == null) {
        } else {
            if (poi.isRest()) {
                hVar.a(1);
            } else {
                hVar.a(2);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "403e8252243e522b8091979bd5de2511", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "403e8252243e522b8091979bd5de2511");
            } else if (hVar.f) {
            } else {
                JudasManualManager.a b = JudasManualManager.b("b_waimai_uhsi6xcw_mv");
                b.b = AppUtil.generatePageInfoKey(hVar.e);
                b.a(hVar.b()).a("poi_id", hVar.b.f()).a("scene_id", hVar.b.o() == 3 ? "dayang" : "chaopei").a();
                hVar.f = true;
            }
        }
    }

    public a(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c7a3afa157f298d55d6c5addb25ae3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c7a3afa157f298d55d6c5addb25ae3");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80783f28236d37e61c73c686ec6c5b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80783f28236d37e61c73c686ec6c5b2");
            return;
        }
        super.s();
        this.h = F().J.a(new com.meituan.android.cube.pga.action.b<i.b<Poi, RestRecommendPoi, Boolean>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.poitip.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.b<Poi, RestRecommendPoi, Boolean> bVar) {
                i.b<Poi, RestRecommendPoi, Boolean> bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00f027ebaf2c328f72d06defbe883caf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00f027ebaf2c328f72d06defbe883caf");
                } else {
                    a.this.a(bVar2.c);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a<JsonObject> L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6422ef9d4d402859b0de7dbeacee96", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6422ef9d4d402859b0de7dbeacee96") : new com.meituan.android.cube.pga.viewmodel.a<>((Context) null);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Poi poi;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc00d2680b2ec579a1d6fc99ebc4a4a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc00d2680b2ec579a1d6fc99ebc4a4a5");
            return;
        }
        super.I();
        JsonObject e = G().e();
        try {
            z = e.get("is_show_rcmd_pois").getAsBoolean();
        } catch (Exception unused) {
        }
        try {
            poi = (Poi) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson((JsonElement) e.get("poi_info").getAsJsonObject(), (Class<Object>) Poi.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            poi = null;
        }
        if (poi == null || c.a().b() == 3) {
            return;
        }
        if ((poi.getState() == 4 || poi.isInDeliveryRange) && !(poi.isRest() && z)) {
            return;
        }
        a(poi);
    }

    void a(final Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13ceee4c84a260622ff5212dcfb16eb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13ceee4c84a260622ff5212dcfb16eb0");
        } else if (poi == null || this.g != null) {
        } else {
            boolean z = poi.getState() == 3;
            this.g = PoiTipPopupFragment.q();
            this.g.h = new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.poitip.a.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf1a440dde946f7633ef5664cd849c3e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf1a440dde946f7633ef5664cd849c3e");
                        return;
                    }
                    a.a(a.this, poi);
                    a.this.g = null;
                }
            };
            this.g.a(poi.id);
            this.g.i = poi.poiIDStr;
            this.g.g = z;
            this.g.a(l());
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e777aa8fe81543c0dda5b639dd069a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e777aa8fe81543c0dda5b639dd069a");
            return;
        }
        super.v();
        if (this.g != null) {
            this.g.l();
            this.g = null;
        }
        if (this.h == null || this.h.isUnsubscribed()) {
            return;
        }
        this.h.unsubscribe();
        this.h = null;
    }
}
