package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.response.ServerExpResponse;
import java.io.Serializable;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RestMenuBaseResponse extends ServerExpResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public JsonObject data;
    public String msg;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<RestMenuBaseResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public RestMenuBaseResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703118dd950106512524b62aaca70324", RobustBitConfig.DEFAULT_VALUE)) {
                return (RestMenuBaseResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703118dd950106512524b62aaca70324");
            }
            if (jsonElement != null) {
                try {
                    if (jsonElement.isJsonObject()) {
                        RestMenuBaseResponse restMenuBaseResponse = new RestMenuBaseResponse();
                        JsonObject jsonObject = (JsonObject) jsonElement;
                        restMenuBaseResponse.code = com.sankuai.waimai.business.restaurant.base.util.a.a(jsonObject, "code", 0);
                        restMenuBaseResponse.msg = com.sankuai.waimai.business.restaurant.base.util.a.a(jsonObject, "msg", "");
                        JsonObject a2 = com.sankuai.waimai.business.restaurant.base.util.a.a(jsonObject, "data", new JsonObject());
                        restMenuBaseResponse.setWaitTime(com.sankuai.waimai.business.restaurant.base.util.a.a(a2, "wait_time", -1));
                        if (restMenuBaseResponse.code == 0) {
                            restMenuBaseResponse.data = a2;
                        }
                        return restMenuBaseResponse;
                    }
                    return null;
                } catch (Exception e) {
                    throw e;
                }
            }
            return null;
        }
    }

    public boolean isSuccess() {
        return this.data != null && this.code == 0;
    }
}
