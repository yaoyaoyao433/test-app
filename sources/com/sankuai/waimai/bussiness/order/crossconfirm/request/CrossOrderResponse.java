package com.sankuai.waimai.bussiness.order.crossconfirm.request;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.GetVerifyCodeResponse;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.model.PreviewSubmitModel;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.UnAvailableFood;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CrossOrderResponse {
    public int a;
    public String b;
    public MultiPoiOrderPreviewResult c;
    @SerializedName("missingfoods")
    public List<com.sankuai.waimai.platform.domain.core.order.a> d;
    public long e;
    public String f;
    public int g;
    public GetVerifyCodeResponse h;
    public double i;
    @SerializedName("spu_tag_id")
    public String j;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String k;
    @SerializedName("popup_text")
    public String l;
    public PreviewSubmitModel m;
    public List<UnAvailableFood> n;
    public List<OrderFoodOutput> o;
    public JsonObject p;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<CrossOrderResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public CrossOrderResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "459cddb6f8703787ccf26bfd487b5cd9", RobustBitConfig.DEFAULT_VALUE)) {
                return (CrossOrderResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "459cddb6f8703787ccf26bfd487b5cd9");
            }
            try {
                if (jsonElement.isJsonObject()) {
                    CrossOrderResponse crossOrderResponse = new CrossOrderResponse();
                    JsonObject jsonObject = (JsonObject) jsonElement;
                    crossOrderResponse.a = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(jsonObject, "code", 0);
                    crossOrderResponse.b = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(jsonObject, "msg", "");
                    JsonObject a2 = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(jsonObject, "data", new JsonObject());
                    int i = crossOrderResponse.a;
                    if (i == 0) {
                        crossOrderResponse.c = (MultiPoiOrderPreviewResult) jsonDeserializationContext.deserialize(a2, MultiPoiOrderPreviewResult.class);
                    } else if (i != 8) {
                        int i2 = 14;
                        if (i != 14) {
                            if (i == 19) {
                                crossOrderResponse.j = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "spu_tag_id", (String) null);
                                crossOrderResponse.k = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, NetLogConstants.Details.SCHEME, (String) null);
                                crossOrderResponse.l = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "popup_text", (String) null);
                            } else if (i == 44 || i == 51) {
                                crossOrderResponse.m = (PreviewSubmitModel) new Gson().fromJson((JsonElement) a2, (Class<Object>) PreviewSubmitModel.class);
                            } else if (i == 66) {
                                crossOrderResponse.k = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "schema", (String) null);
                                crossOrderResponse.e = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "wm_poi_id", 0L);
                                crossOrderResponse.f = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
                                crossOrderResponse.d = (List) jsonDeserializationContext.deserialize(com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "missingfoods", new JsonArray()), new TypeToken<List<com.sankuai.waimai.platform.domain.core.order.a>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.CrossOrderResponse.Deserializer.1
                                }.getType());
                            } else if (i != 71) {
                                switch (i) {
                                    case 3:
                                        crossOrderResponse.d = new ArrayList();
                                        JsonArray a3 = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "missingfoods", new JsonArray());
                                        crossOrderResponse.e = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "wm_poi_id", 0L);
                                        crossOrderResponse.f = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
                                        if (com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "biz_type", 1) != 2) {
                                            i2 = 15;
                                        }
                                        crossOrderResponse.g = i2;
                                        for (int i3 = 0; i3 < a3.size(); i3++) {
                                            JsonObject jsonObject2 = (JsonObject) a3.get(i3);
                                            if (jsonObject2 != null) {
                                                crossOrderResponse.d.add((com.sankuai.waimai.platform.domain.core.order.a) jsonDeserializationContext.deserialize(jsonObject2, com.sankuai.waimai.platform.domain.core.order.a.class));
                                            }
                                        }
                                        break;
                                    case 5:
                                        crossOrderResponse.h = (GetVerifyCodeResponse) jsonDeserializationContext.deserialize(a2, GetVerifyCodeResponse.class);
                                        crossOrderResponse.e = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "wm_poi_Id", 0L);
                                        crossOrderResponse.f = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
                                        break;
                                }
                            } else {
                                crossOrderResponse.p = a2;
                                JsonArray a4 = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "unAvailableFoodList", new JsonArray());
                                if (a4 != null) {
                                    crossOrderResponse.n = (List) jsonDeserializationContext.deserialize(a4, new TypeToken<List<UnAvailableFood>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.CrossOrderResponse.Deserializer.2
                                    }.getType());
                                }
                                crossOrderResponse.f = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
                                JsonArray a5 = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "availableFoodList", new JsonArray());
                                if (a5 != null) {
                                    crossOrderResponse.o = (List) jsonDeserializationContext.deserialize(a5, new TypeToken<List<OrderFoodOutput>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.request.CrossOrderResponse.Deserializer.3
                                    }.getType());
                                }
                            }
                        }
                    } else {
                        crossOrderResponse.i = com.sankuai.waimai.bussiness.order.crossconfirm.utils.c.a(a2, "min_price", 0.0d);
                    }
                    return crossOrderResponse;
                }
                return null;
            } catch (Exception e) {
                Object[] objArr2 = {e};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56ecb471ec66c32589f65469b1a58625", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56ecb471ec66c32589f65469b1a58625");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
                throw e;
            }
        }
    }
}
