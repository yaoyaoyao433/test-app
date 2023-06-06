package com.sankuai.waimai.bussiness.order.confirm.request;

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
import com.sankuai.waimai.bussiness.order.confirm.model.PreviewSubmitModel;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.m;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.UnAvailableFood;
import com.sankuai.waimai.bussiness.order.crossconfirm.utils.c;
import com.sankuai.waimai.platform.domain.core.response.ServerExpResponse;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderResponse extends ServerExpResponse implements Serializable {
    public static ChangeQuickRedirect a;
    public double b;
    public b.C0904b c;
    public boolean d;
    public int e;
    public String f;
    public String g;
    public m h;
    public List<com.sankuai.waimai.platform.domain.core.order.a> i;
    public GetVerifyCodeResponse j;
    public double k;
    @SerializedName("spu_tag_id")
    public String l;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String m;
    @SerializedName("popup_text")
    public String n;
    public List<UnAvailableFood> o;
    public List<OrderFoodOutput> p;
    public JsonObject q;
    public PreviewSubmitModel r;

    public OrderResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20df2c1bae9ee4ef37a8010ef1e8bae7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20df2c1bae9ee4ef37a8010ef1e8bae7");
        } else {
            this.b = -1.0d;
        }
    }

    public final boolean a() {
        if (this.c != null) {
            return this.c.w;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<OrderResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public OrderResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfda0a92564aff00a8fb978deff52f9f", RobustBitConfig.DEFAULT_VALUE)) {
                return (OrderResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfda0a92564aff00a8fb978deff52f9f");
            }
            if (jsonElement != null) {
                try {
                    if (jsonElement.isJsonObject()) {
                        OrderResponse orderResponse = new OrderResponse();
                        JsonObject jsonObject = (JsonObject) jsonElement;
                        orderResponse.e = c.a(jsonObject, "code", 0);
                        orderResponse.f = c.a(jsonObject, "msg", "");
                        JsonObject a2 = c.a(jsonObject, "data", new JsonObject());
                        orderResponse.setWaitTime(c.a(a2, "wait_time", -1));
                        int i = orderResponse.e;
                        if (i == 0) {
                            orderResponse.h = m.a(a2);
                        } else if (i == 8) {
                            orderResponse.k = c.a(a2, "min_price", 0.0d);
                        } else if (i != 14) {
                            if (i == 19) {
                                orderResponse.l = c.a(a2, "spu_tag_id", (String) null);
                                orderResponse.m = c.a(a2, NetLogConstants.Details.SCHEME, (String) null);
                                orderResponse.n = c.a(a2, "popup_text", (String) null);
                            } else if (i == 44) {
                                orderResponse.g = a2.toString();
                                orderResponse.r = (PreviewSubmitModel) new Gson().fromJson((JsonElement) a2, (Class<Object>) PreviewSubmitModel.class);
                            } else if (i == 51) {
                                orderResponse.r = (PreviewSubmitModel) new Gson().fromJson((JsonElement) a2, (Class<Object>) PreviewSubmitModel.class);
                            } else if (i != 66) {
                                switch (i) {
                                    case 3:
                                        orderResponse.i = (List) jsonDeserializationContext.deserialize(c.a(a2, "missingfoods", new JsonArray()), new TypeToken<List<com.sankuai.waimai.platform.domain.core.order.a>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse.Deserializer.1
                                        }.getType());
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        orderResponse.j = (GetVerifyCodeResponse) jsonDeserializationContext.deserialize(a2, GetVerifyCodeResponse.class);
                                        break;
                                    default:
                                        switch (i) {
                                            case 70:
                                                orderResponse.r = (PreviewSubmitModel) new Gson().fromJson((JsonElement) a2, (Class<Object>) PreviewSubmitModel.class);
                                                break;
                                            case 71:
                                                orderResponse.q = a2;
                                                JsonArray a3 = c.a(a2, "unAvailableFoodList", new JsonArray());
                                                if (a3 != null) {
                                                    orderResponse.o = (List) jsonDeserializationContext.deserialize(a3, new TypeToken<List<UnAvailableFood>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse.Deserializer.3
                                                    }.getType());
                                                }
                                                JsonArray a4 = c.a(a2, "availableFoodList", new JsonArray());
                                                if (a4 != null) {
                                                    orderResponse.p = (List) jsonDeserializationContext.deserialize(a4, new TypeToken<List<OrderFoodOutput>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse.Deserializer.4
                                                    }.getType());
                                                    break;
                                                }
                                                break;
                                        }
                                }
                            } else {
                                orderResponse.m = c.a(a2, "schema", (String) null);
                                orderResponse.i = (List) jsonDeserializationContext.deserialize(c.a(a2, "missingfoods", new JsonArray()), new TypeToken<List<com.sankuai.waimai.platform.domain.core.order.a>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse.Deserializer.2
                                }.getType());
                            }
                        }
                        return orderResponse;
                    }
                } catch (Exception e) {
                    Object[] objArr2 = {e};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8aeddcbdd43bbb573c2ddec23223bfe3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8aeddcbdd43bbb573c2ddec23223bfe3");
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.b(e);
                    }
                    throw e;
                }
            }
            return null;
        }
    }
}
