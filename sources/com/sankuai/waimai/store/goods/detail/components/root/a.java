package com.sankuai.waimai.store.goods.detail.components.root;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.goods.detail.components.root.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import com.sankuai.waimai.store.repository.model.ProductFreeInfo;
import com.sankuai.waimai.store.repository.model.ProductVideoInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected Context b;
    protected Float c;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a d;
    protected boolean e;
    protected com.sankuai.waimai.mach.recycler.b f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.detail.components.root.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1173a {
        void a(List<c> list);
    }

    public abstract void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull GoodsDetailResponse goodsDetailResponse, GoodsSku goodsSku, InterfaceC1173a interfaceC1173a, com.sankuai.waimai.store.expose.v2.a aVar2, String str);

    public final void a(Context context, boolean z, Float f, com.sankuai.waimai.mach.recycler.b bVar) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), f, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa2c957d1b858aa9e3fdfa0328698c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa2c957d1b858aa9e3fdfa0328698c06");
            return;
        }
        this.b = context;
        this.c = f;
        this.e = z;
        this.f = bVar;
    }

    @Nullable
    public final c a(@NonNull GoodsDetailResponse goodsDetailResponse, String str, GoodsSku goodsSku, @NonNull BaseTile<BaseModuleDesc, HashMap<String, Object>> baseTile) {
        ArrayList arrayList;
        ProductFreeInfo productFreeInfo;
        GoodDetailResponse.SpuPraiseInfo spuPraiseInfo;
        GoodDetailResponse.SpuPraiseInfo spuPraiseInfo2;
        LiveInfo liveInfo;
        Object[] objArr = {goodsDetailResponse, str, goodsSku, baseTile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1afec01ee1613016a1d593ef7a6f9f0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1afec01ee1613016a1d593ef7a6f9f0c");
        }
        if (baseTile.data == null || baseTile.data.jsonData == null) {
            return null;
        }
        GoodsSpu goodsSpu = goodsDetailResponse.mGoodsSpu;
        ArrayList arrayList2 = new ArrayList();
        ProductFreeInfo productFreeInfo2 = new ProductFreeInfo();
        try {
            Object obj = baseTile.data.jsonData.get("atmosphere_pic");
            if (obj != null) {
                goodsSpu.atmospherePic = String.valueOf(obj);
            }
            Object obj2 = baseTile.data.jsonData.get("pictures");
            if (obj2 != null) {
                JSONArray jSONArray = new JSONArray(com.sankuai.waimai.store.util.i.a(obj2));
                goodsSpu.pictures.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    goodsSpu.pictures.add(jSONArray.optString(i));
                }
            }
            Object obj3 = baseTile.data.jsonData.get("product_video_infos");
            if (obj3 != null) {
                JSONArray jSONArray2 = new JSONArray(com.sankuai.waimai.store.util.i.a(obj3));
                if (jSONArray2.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject optJSONObject = jSONArray2.optJSONObject(i2);
                        if (optJSONObject != null) {
                            ProductVideoInfo productVideoInfo = new ProductVideoInfo();
                            productVideoInfo.parseVideoInfo(optJSONObject);
                            arrayList2.add(productVideoInfo);
                        }
                    }
                }
            }
            Object obj4 = baseTile.data.jsonData.get("spu_praise_info");
            spuPraiseInfo2 = obj4 != null ? new GoodDetailResponse.SpuPraiseInfo(new JSONObject(com.sankuai.waimai.store.util.i.a(obj4))) : null;
            try {
                Object obj5 = baseTile.data.jsonData.get("team_like_act_info");
                Object[] objArr2 = {obj5, productFreeInfo2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                arrayList = arrayList2;
                productFreeInfo = productFreeInfo2;
                try {
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83ca22aec63fa99826c9a07dcbeb8ffa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83ca22aec63fa99826c9a07dcbeb8ffa");
                    } else if (obj5 != null) {
                        try {
                            productFreeInfo.parseJson(new JSONObject(com.sankuai.waimai.store.util.i.a(obj5)));
                        } catch (JSONException e) {
                            com.sankuai.waimai.store.base.log.a.a(e);
                        }
                    }
                    Object obj6 = baseTile.data.jsonData.get("live_info");
                    liveInfo = obj6 != null ? LiveInfo.fromJson(com.sankuai.waimai.store.util.i.a(obj6)) : null;
                } catch (JSONException e2) {
                    e = e2;
                    spuPraiseInfo = spuPraiseInfo2;
                    com.sankuai.waimai.store.base.log.a.a(e);
                    spuPraiseInfo2 = spuPraiseInfo;
                    liveInfo = null;
                    return new c.C1175c(str, goodsSku, new com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.d(0, a(goodsSpu, arrayList)), this.c.floatValue(), goodsDetailResponse, productFreeInfo, spuPraiseInfo2, liveInfo, baseTile.layoutInfo);
                }
            } catch (JSONException e3) {
                e = e3;
                arrayList = arrayList2;
                productFreeInfo = productFreeInfo2;
            }
        } catch (JSONException e4) {
            e = e4;
            arrayList = arrayList2;
            productFreeInfo = productFreeInfo2;
            spuPraiseInfo = null;
        }
        return new c.C1175c(str, goodsSku, new com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.d(0, a(goodsSpu, arrayList)), this.c.floatValue(), goodsDetailResponse, productFreeInfo, spuPraiseInfo2, liveInfo, baseTile.layoutInfo);
    }

    private List<com.sankuai.waimai.platform.domain.core.goods.e> a(GoodsSpu goodsSpu, List<ProductVideoInfo> list) {
        com.sankuai.waimai.platform.domain.core.goods.e eVar;
        com.sankuai.waimai.platform.domain.core.goods.e eVar2;
        int i = 1;
        Object[] objArr = {goodsSpu, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d4782ddf1d0e47ceecee8b1d8fca86", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d4782ddf1d0e47ceecee8b1d8fca86");
        }
        if (com.sankuai.waimai.store.util.b.a(this.b)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (ProductVideoInfo productVideoInfo : list) {
                if (productVideoInfo != null) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = productVideoInfo;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94abece63890e514b36305427735232d", RobustBitConfig.DEFAULT_VALUE)) {
                        eVar2 = (com.sankuai.waimai.platform.domain.core.goods.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94abece63890e514b36305427735232d");
                    } else {
                        eVar2 = new com.sankuai.waimai.platform.domain.core.goods.e();
                        eVar2.b = 1;
                        eVar2.c = productVideoInfo.url;
                        eVar2.d = productVideoInfo.mainPicture;
                        eVar2.f = productVideoInfo.size;
                        eVar2.e = productVideoInfo.length;
                    }
                    if (t.a(eVar2.d)) {
                        eVar2.d = goodsSpu.getPicture();
                    }
                    eVar2.i = false;
                    arrayList.add(eVar2);
                    i = 1;
                }
            }
        }
        List<String> pictureList = goodsSpu.getPictureList();
        if (pictureList == null) {
            pictureList = new ArrayList<>();
        }
        if (com.sankuai.shangou.stone.util.a.b(pictureList)) {
            pictureList.add(ImageQualityUtil.a(this.b, goodsSpu.getPicture(), ImageQualityUtil.b(), this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_75)));
        }
        for (String str : pictureList) {
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e568ca3f8c55a3cea32480e503b4788", RobustBitConfig.DEFAULT_VALUE)) {
                eVar = (com.sankuai.waimai.platform.domain.core.goods.e) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e568ca3f8c55a3cea32480e503b4788");
            } else {
                eVar = new com.sankuai.waimai.platform.domain.core.goods.e();
                eVar.b = 0;
                eVar.c = str;
            }
            eVar.i = false;
            arrayList.add(eVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0281, code lost:
        if (r35.d.r() == 3) goto L85;
     */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.waimai.store.goods.detail.components.root.c a(com.sankuai.waimai.store.platform.domain.manager.poi.a r36, java.lang.String r37, @android.support.annotation.NonNull com.sankuai.waimai.store.repository.model.GoodsDetailResponse r38, @android.support.annotation.NonNull com.sankuai.waimai.store.repository.model.BaseTile<com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc, java.util.HashMap<java.lang.String, java.lang.Object>> r39, com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku r40, com.sankuai.waimai.mach.recycler.b r41) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.detail.components.root.a.a(com.sankuai.waimai.store.platform.domain.manager.poi.a, java.lang.String, com.sankuai.waimai.store.repository.model.GoodsDetailResponse, com.sankuai.waimai.store.repository.model.BaseTile, com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku, com.sankuai.waimai.mach.recycler.b):com.sankuai.waimai.store.goods.detail.components.root.c");
    }

    @Nullable
    public final Map<String, Object> a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull GoodsDetailResponse goodsDetailResponse, @NonNull BaseTile<BaseModuleDesc, HashMap<String, Object>> baseTile) {
        long j;
        int i = 0;
        Object[] objArr = {aVar, goodsDetailResponse, baseTile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77558cbf393e5d50717456d8511d53db", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77558cbf393e5d50717456d8511d53db");
        }
        if ((baseTile.data == null || baseTile.data.jsonData == null) && !t.a(baseTile.sourceId) && baseTile.propsData != null) {
            if (baseTile.data == null) {
                baseTile.data = new BaseModuleDesc();
            }
            baseTile.data.jsonData = new HashMap();
            baseTile.data.jsonData.put("props_data", baseTile.propsData);
        }
        if (baseTile.data != null) {
            if ((t.a(baseTile.data.templateId) && t.a(baseTile.sourceId)) || baseTile.data.jsonData == null) {
                return null;
            }
            if (aVar == null || aVar.b == null) {
                j = -1;
            } else {
                j = aVar.f();
                i = aVar.b.state;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("trace_id", goodsDetailResponse.getTraceId());
            hashMap.put("sku_id", a(goodsDetailResponse.mGoodsSpu));
            hashMap.put("name", goodsDetailResponse.mGoodsSpu.getName());
            hashMap.put("poi_status", Integer.valueOf(i));
            hashMap.put("has_comment", com.sankuai.waimai.store.platform.domain.manager.goods.a.a().c ? "1" : "0");
            hashMap.put("comment_source", com.sankuai.waimai.store.platform.domain.manager.goods.a.a().d);
            long id = goodsDetailResponse.mGoodsSpu != null ? goodsDetailResponse.mGoodsSpu.getId() : -1L;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("poi_id", String.valueOf(j));
            hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, "-1");
            hashMap2.put("spu_id", String.valueOf(id));
            hashMap2.put("stid", goodsDetailResponse.getStids());
            hashMap2.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
            hashMap2.putAll(hashMap);
            baseTile.data.jsonData.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap2);
            baseTile.data.jsonData.put("props_data", baseTile.propsData);
            try {
                baseTile.data.jsonData.put("general_info", new JSONObject(com.sankuai.waimai.store.util.i.a(baseTile.generalInfo)));
            } catch (JSONException e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
            if (!TextUtils.isEmpty(baseTile.sourceId)) {
                baseTile.data.templateId = baseTile.sourceId;
            }
            return baseTile.data.jsonData;
        }
        return null;
    }

    private String a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5f647fea45396d2d75de9d7f887bce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5f647fea45396d2d75de9d7f887bce");
        }
        if (goodsSpu == null || com.sankuai.shangou.stone.util.a.b(goodsSpu.getSkuList())) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (GoodsSku goodsSku : goodsSpu.getSkuList()) {
            if (goodsSku != null) {
                arrayList.add(String.valueOf(goodsSku.getSkuId()));
            }
        }
        return t.a(arrayList, CommonConstant.Symbol.COMMA);
    }
}
