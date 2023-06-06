package com.sankuai.waimai.platform.capacity.abtest;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ABTestExpStrategyResponse {
    public static ChangeQuickRedirect a;
    public ArrayList<ABStrategy> b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.JsonDeserializer
        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05cb78ba217beb6db90404f9893aca03", RobustBitConfig.DEFAULT_VALUE) ? (ABTestExpStrategyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05cb78ba217beb6db90404f9893aca03") : ABTestExpStrategyResponse.a(jsonElement.toString());
        }
    }

    public static ABTestExpStrategyResponse a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd7cf603d87f99c0478852f81f521335", RobustBitConfig.DEFAULT_VALUE)) {
            return (ABTestExpStrategyResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd7cf603d87f99c0478852f81f521335");
        }
        ABTestExpStrategyResponse aBTestExpStrategyResponse = new ABTestExpStrategyResponse();
        try {
            aBTestExpStrategyResponse.b = (ArrayList) com.meituan.android.turbo.a.a(new TypeToken<ArrayList<ABStrategy>>() { // from class: com.sankuai.waimai.platform.capacity.abtest.ABTestExpStrategyResponse.1
            }.getType(), str);
        } catch (Exception unused) {
        }
        return aBTestExpStrategyResponse;
    }
}
