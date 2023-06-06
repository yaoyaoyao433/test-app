package com.sankuai.android.share.keymodule.shortURL.request;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShareShortUrlDeserializer implements JsonDeserializer<ShareShortUrlBean> {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.JsonDeserializer
    public /* synthetic */ ShareShortUrlBean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc131d6df4d4f9b92b53090ba2815ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareShortUrlBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc131d6df4d4f9b92b53090ba2815ea");
        }
        ShareShortUrlBean shareShortUrlBean = new ShareShortUrlBean();
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("code") && asJsonObject.get("code").getAsInt() == 0 && asJsonObject.has("data")) {
            shareShortUrlBean.shortUrl = asJsonObject.get("data").getAsString();
        }
        return shareShortUrlBean;
    }
}
