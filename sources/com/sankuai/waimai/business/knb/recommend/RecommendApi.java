package com.sankuai.waimai.business.knb.recommend;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import java.lang.reflect.Type;
import java.util.HashMap;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface RecommendApi {
    @POST("{path}")
    @FormUrlEncoded
    d<a> poiRecommend(@Path(encoded = true, value = "path") String str, @FieldMap HashMap<String, Object> hashMap);

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public JsonObject a;

        public a(JsonObject jsonObject) {
            this.a = jsonObject;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class RecommendResponseDeserializer implements JsonDeserializer<a> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.JsonDeserializer
        public /* synthetic */ a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "253a45738add574ec35839de1832c167", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "253a45738add574ec35839de1832c167");
            }
            if (jsonElement == null || !jsonElement.isJsonObject()) {
                return null;
            }
            return new a((JsonObject) jsonElement);
        }
    }
}
