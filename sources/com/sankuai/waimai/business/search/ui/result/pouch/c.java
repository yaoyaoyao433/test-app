package com.sankuai.waimai.business.search.ui.result.pouch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.util.k;
import com.sankuai.waimai.business.search.datatype.PoiEntity;
import com.sankuai.waimai.business.search.datatype.SearchThemeSlideData;
import com.sankuai.waimai.business.search.datatype.g;
import com.sankuai.waimai.business.search.model.h;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.business.search.ui.result.ResultFragment;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.business.search.adapterdelegates.a<Serializable, a> {
    public static ChangeQuickRedirect d;
    private ResultFragment e;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e752d001b5c61537d8e9185f6857506", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e752d001b5c61537d8e9185f6857506");
        }
        f fVar = new f(this.b, this.e);
        return new a(fVar.a(viewGroup), fVar);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ void a(Serializable serializable, @NonNull a aVar, @NonNull int i) {
        String jSONObject;
        Serializable serializable2 = serializable;
        a aVar2 = aVar;
        Object[] objArr = {serializable2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbfa0b8c7f7ec015f958e04d6b628dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbfa0b8c7f7ec015f958e04d6b628dd");
        } else if (!(serializable2 instanceof PouchDynamicAd)) {
            if (!(serializable2 instanceof SearchThemeSlideData)) {
                if (serializable2 instanceof g) {
                    g gVar = (g) serializable2;
                    try {
                        JSONObject jSONObject2 = new JSONObject(gVar.adPoiInfo.c);
                        String optString = jSONObject2.optString("templateId");
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        Object[] objArr2 = {jSONObject2, gVar};
                        ChangeQuickRedirect changeQuickRedirect2 = d;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e90dd285545429314f2dbf7ec1b4234d", RobustBitConfig.DEFAULT_VALUE)) {
                            jSONObject = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e90dd285545429314f2dbf7ec1b4234d");
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("adType", gVar.adType);
                            jSONObject3.put("brandId", gVar.adPoiInfo.b);
                            jSONObject3.put("brandPic", gVar.adPoiInfo.a);
                            jSONObject3.put("chargeInfo", gVar.chargeInfo);
                            jSONObject3.put("poiId", gVar.id);
                            jSONObject3.put("poiIdStr", gVar.poiIdStr);
                            jSONObject3.put("ptCpmMaterial", jSONObject2);
                            jSONObject = jSONObject3.toString();
                        }
                        PouchDynamicAd pouchDynamicAd = new PouchDynamicAd();
                        pouchDynamicAd.adTemplateId = optString;
                        pouchDynamicAd.adContainerId = PouchDynamicAd.CONTAINER_ID_POUCH_COMMON;
                        pouchDynamicAd.stringData = jSONObject;
                        pouchDynamicAd.index = ((g) serializable2).getStatisticsIndex();
                        pouchDynamicAd.businessName = "wm_search_brand";
                        aVar2.b.b = 1;
                        aVar2.b.d = gVar.getStatisticsIndex();
                        aVar2.b.e = a(gVar);
                        aVar2.b.a(i, pouchDynamicAd);
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                return;
            }
            aVar2.b.b = 2;
            PouchDynamicAd pouchDynamicAd2 = new PouchDynamicAd();
            pouchDynamicAd2.adContainerId = PouchDynamicAd.CONTAINER_ID_POUCH_COMMON;
            SearchThemeSlideData searchThemeSlideData = (SearchThemeSlideData) serializable2;
            pouchDynamicAd2.adTemplateId = searchThemeSlideData.templateId;
            pouchDynamicAd2.businessName = "wm_search_slide";
            pouchDynamicAd2.stringData = com.sankuai.waimai.pouch.util.c.a(searchThemeSlideData.templateData);
            pouchDynamicAd2.index = searchThemeSlideData.getStatisticsIndex();
            aVar2.b.a(i, pouchDynamicAd2);
        } else {
            aVar2.b.b = 0;
            aVar2.b.a(i, (PouchDynamicAd) serializable2);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ boolean a(@NonNull Serializable serializable, @NonNull List<Serializable> list, int i) {
        Serializable serializable2 = serializable;
        Object[] objArr = {serializable2, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd1e287297299c7690befd6bcacfca9f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd1e287297299c7690befd6bcacfca9f")).booleanValue() : (serializable2 instanceof PouchDynamicAd) || (serializable2 instanceof SearchThemeSlideData) || ((serializable2 instanceof g) && ((g) serializable2).isPtAd());
    }

    public c(ResultFragment resultFragment, Context context) {
        super(context);
        Object[] objArr = {resultFragment, context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "317c8ffc2b0d3956ca2d538a5f0b2283", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "317c8ffc2b0d3956ca2d538a5f0b2283");
        } else {
            this.e = resultFragment;
        }
    }

    private Map<String, Object> a(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0994c48a539f77de86b5b2a77519bb19", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0994c48a539f77de86b5b2a77519bb19");
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("rank_type", Integer.valueOf(SearchShareData.a(this.b).R));
            hashMap.put("distance", poiEntity.poiDistance);
            hashMap.put("ship_type", Integer.valueOf(poiEntity.deliveryType));
            hashMap.put("card_type", Integer.valueOf(poiEntity.showType));
            hashMap.put("status", Integer.valueOf(poiEntity.status));
            hashMap.put("delivery_fee", poiEntity.shippingFeeTip);
            if (!com.sankuai.waimai.foundation.utils.d.a(poiEntity.discounts)) {
                JSONArray jSONArray = new JSONArray();
                for (com.sankuai.waimai.business.search.model.d dVar : poiEntity.discounts) {
                    if (dVar != null) {
                        jSONArray.put(String.valueOf(dVar.f));
                    }
                }
                hashMap.put("poi_act_id", jSONArray.toString());
            } else {
                hashMap.put("poi_act_id", "");
            }
            hashMap.put("keyword", SearchShareData.a(this.b).g);
            hashMap.put("label_word", SearchShareData.a(this.b).h);
            hashMap.put("search_log_id", SearchShareData.a(this.b).l);
            hashMap.put("is_have_sku", com.sankuai.waimai.foundation.utils.d.a(poiEntity.productList) ? "0" : "1");
            JSONArray jSONArray2 = new JSONArray();
            for (h hVar : poiEntity.productList) {
                if (hVar != null && !TextUtils.isEmpty(hVar.i)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("spu_id", hVar.b);
                    jSONObject.put("activity_type", hVar.i);
                    jSONArray2.put(jSONObject);
                }
            }
            if (jSONArray2.length() > 0) {
                hashMap.put("activity_type", jSONArray2);
            } else {
                hashMap.put("activity_type", "");
            }
            hashMap.put("is_zengbao", Integer.valueOf(poiEntity.insuranceType));
            hashMap.put("is_filter_result", k.a(SearchShareData.a(this.b)));
            hashMap.put("poi_recommend_type", k.a(poiEntity, SearchShareData.a(this.b).z));
            hashMap.put("template_type", Integer.valueOf(SearchShareData.a(this.b).y));
            hashMap.put("min_total", poiEntity.minPriceTip);
            String str = SearchShareData.a(this.b).S;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            hashMap.put("filter_type", str);
            hashMap.put("stid", SearchShareData.a(this.b).d);
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.c("ExtraMap", e.getMessage(), new Object[0]);
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.c
    public final void b(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8d2204863c1012ab81b317f0459234d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8d2204863c1012ab81b317f0459234d");
        } else {
            super.b(sVar);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.c
    public final void a(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5abb4e2897d8b675e8329ef1c896190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5abb4e2897d8b675e8329ef1c896190");
        } else {
            super.a(sVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public f b;

        public a(View view, f fVar) {
            super(view);
            Object[] objArr = {view, fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f3af1dc19e142c6cc1b68b9759658c1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f3af1dc19e142c6cc1b68b9759658c1");
            } else {
                this.b = fVar;
            }
        }
    }
}
