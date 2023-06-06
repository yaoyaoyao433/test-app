package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.LinkedTreeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.response.ServerExpResponse;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderBaseRocksResponse<D> extends ServerExpResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public D data;
    public String msg;

    public OrderBaseRocksResponse() {
    }

    public OrderBaseRocksResponse(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31338e9489b590dc6a28eaa1741db5e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31338e9489b590dc6a28eaa1741db5e7");
            return;
        }
        this.code = i;
        this.msg = str;
    }

    public boolean isSuccess() {
        return this.data != null && this.code == 0;
    }

    public boolean isForbiddenLimited() {
        return this.data != null && this.code == 100;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<OrderBaseRocksResponse> {
        public static ChangeQuickRedirect a;

        private Object a(JsonElement jsonElement) {
            Object[] objArr = {jsonElement};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bbda02537ef55e8c42547e08d58d95f", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bbda02537ef55e8c42547e08d58d95f");
            }
            if (jsonElement.isJsonArray()) {
                ArrayList arrayList = new ArrayList();
                Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next()));
                }
                return arrayList;
            } else if (jsonElement.isJsonObject()) {
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                    linkedTreeMap.put(entry.getKey(), a(entry.getValue()));
                }
                return linkedTreeMap;
            } else if (jsonElement.isJsonPrimitive()) {
                JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (asJsonPrimitive.isBoolean()) {
                    return Boolean.valueOf(asJsonPrimitive.getAsBoolean());
                }
                if (asJsonPrimitive.isString()) {
                    return asJsonPrimitive.getAsString();
                }
                if (asJsonPrimitive.isNumber()) {
                    Number asNumber = asJsonPrimitive.getAsNumber();
                    if (Math.ceil(asNumber.doubleValue()) == asNumber.intValue()) {
                        return Integer.valueOf(asNumber.intValue());
                    }
                    if (Math.ceil(asNumber.doubleValue()) == asNumber.longValue()) {
                        return Long.valueOf(asNumber.longValue());
                    }
                    return Double.valueOf(asNumber.doubleValue());
                }
                return null;
            } else {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public OrderBaseRocksResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c03261cd1dd327c1296da6eebd620ee", RobustBitConfig.DEFAULT_VALUE)) {
                return (OrderBaseRocksResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c03261cd1dd327c1296da6eebd620ee");
            }
            try {
                if (jsonElement.isJsonObject()) {
                    OrderBaseRocksResponse orderBaseRocksResponse = new OrderBaseRocksResponse();
                    JsonObject jsonObject = (JsonObject) jsonElement;
                    if (jsonObject.has("code") && jsonObject.get("code").isJsonPrimitive()) {
                        orderBaseRocksResponse.code = jsonObject.get("code").getAsInt();
                    }
                    if (jsonObject.has("msg") && jsonObject.get("msg").isJsonPrimitive()) {
                        orderBaseRocksResponse.msg = jsonObject.get("msg").getAsString();
                    }
                    if (jsonObject.has("data")) {
                        JsonElement jsonElement2 = jsonObject.get("data");
                        if (jsonElement2.isJsonNull()) {
                            return orderBaseRocksResponse;
                        }
                        orderBaseRocksResponse.data = (D) a(jsonElement2);
                    }
                    return orderBaseRocksResponse;
                }
                return null;
            } catch (Exception e) {
                Object[] objArr2 = {e};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5482cdaa680aa67bae5d7e8d3c13236e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5482cdaa680aa67bae5d7e8d3c13236e");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
                throw e;
            }
        }
    }
}
