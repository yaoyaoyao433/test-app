package com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.model.PreviewSubmitModel;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.UnAvailableFood;
import com.sankuai.waimai.bussiness.order.crossconfirm.utils.c;
import com.sankuai.waimai.platform.domain.core.order.a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CrossOrderSubmitResponse {
    public int a;
    public String b;
    public MultiPoiOrderSubmitResult c;
    @SerializedName("missingfoods")
    public List<a> f;
    public long g;
    public int i;
    public double j;
    public String m;
    public PreviewSubmitModel n;
    public List<UnAvailableFood> o;
    public List<OrderFoodOutput> p;
    public JsonObject q;
    public int d = 0;
    public int e = 1;
    public String h = "";
    public int k = 0;
    public int l = 1;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<CrossOrderSubmitResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public CrossOrderSubmitResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6703ad777d970c0b2007975c38f73f30", RobustBitConfig.DEFAULT_VALUE)) {
                return (CrossOrderSubmitResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6703ad777d970c0b2007975c38f73f30");
            }
            try {
                if (jsonElement.isJsonObject()) {
                    CrossOrderSubmitResponse crossOrderSubmitResponse = new CrossOrderSubmitResponse();
                    JsonObject jsonObject = (JsonObject) jsonElement;
                    crossOrderSubmitResponse.a = c.a(jsonObject, "code", 0);
                    crossOrderSubmitResponse.b = c.a(jsonObject, "msg", "");
                    JsonObject a2 = c.a(jsonObject, "data", new JsonObject());
                    switch (crossOrderSubmitResponse.a) {
                        case 0:
                            crossOrderSubmitResponse.c = (MultiPoiOrderSubmitResult) jsonDeserializationContext.deserialize(a2, MultiPoiOrderSubmitResult.class);
                            break;
                        case 3:
                        case 18:
                            crossOrderSubmitResponse.f = new ArrayList();
                            JsonArray a3 = c.a(a2, "missingfoods", new JsonArray());
                            crossOrderSubmitResponse.g = c.a(a2, "wm_poi_id", 0L);
                            crossOrderSubmitResponse.h = c.a(a2, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
                            crossOrderSubmitResponse.i = c.a(a2, "biz_type", 1) == 2 ? 14 : 15;
                            for (int i = 0; i < a3.size(); i++) {
                                JsonObject jsonObject2 = (JsonObject) a3.get(i);
                                if (jsonObject2 != null) {
                                    crossOrderSubmitResponse.f.add((a) jsonDeserializationContext.deserialize(jsonObject2, a.class));
                                }
                            }
                            break;
                        case 4:
                        case 14:
                        case 19:
                            break;
                        case 8:
                            crossOrderSubmitResponse.j = c.a(a2, "min_price", 0.0d);
                            break;
                        case 11:
                            crossOrderSubmitResponse.d = c.a(a2, "subcode", 0);
                            crossOrderSubmitResponse.e = c.a(a2, "refresh", 1);
                            break;
                        case 13:
                            crossOrderSubmitResponse.k = c.a(a2, "left_btn", 0);
                            crossOrderSubmitResponse.l = c.a(a2, "right_btn", 0);
                            break;
                        case 16:
                            crossOrderSubmitResponse.e = c.a(a2, "refresh", 1);
                            break;
                        case 44:
                        case 51:
                            crossOrderSubmitResponse.n = (PreviewSubmitModel) new Gson().fromJson((JsonElement) a2, (Class<Object>) PreviewSubmitModel.class);
                            break;
                        case 66:
                            crossOrderSubmitResponse.m = c.a(a2, "schema", (String) null);
                            crossOrderSubmitResponse.g = c.a(a2, "wm_poi_id", 0L);
                            crossOrderSubmitResponse.h = c.a(a2, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
                            crossOrderSubmitResponse.f = (List) jsonDeserializationContext.deserialize(c.a(a2, "missingfoods", new JsonArray()), new TypeToken<List<a>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.CrossOrderSubmitResponse.Deserializer.1
                            }.getType());
                            break;
                        case 71:
                            crossOrderSubmitResponse.q = a2;
                            JsonArray a4 = c.a(a2, "unAvailableFoodList", new JsonArray());
                            if (a4 != null) {
                                crossOrderSubmitResponse.o = (List) jsonDeserializationContext.deserialize(a4, new TypeToken<List<UnAvailableFood>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.CrossOrderSubmitResponse.Deserializer.2
                                }.getType());
                            }
                            crossOrderSubmitResponse.h = c.a(a2, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
                            JsonArray a5 = c.a(a2, "availableFoodList", new JsonArray());
                            if (a5 != null) {
                                crossOrderSubmitResponse.p = (List) jsonDeserializationContext.deserialize(a5, new TypeToken<List<OrderFoodOutput>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result.CrossOrderSubmitResponse.Deserializer.3
                                }.getType());
                                break;
                            }
                            break;
                    }
                    return crossOrderSubmitResponse;
                }
                return null;
            } catch (Exception e) {
                Object[] objArr2 = {e};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "213fb8685d542fe69de46270871c5dae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "213fb8685d542fe69de46270871c5dae");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
                throw e;
            }
        }
    }
}
