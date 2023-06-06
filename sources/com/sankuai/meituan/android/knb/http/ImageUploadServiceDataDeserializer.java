package com.sankuai.meituan.android.knb.http;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.image.ImageUploadServiceData;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ImageUploadServiceDataDeserializer implements JsonDeserializer<ImageUploadServiceData> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public ImageUploadServiceData deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ca6ba43948f568b6273b53c880d9c4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageUploadServiceData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ca6ba43948f568b6273b53c880d9c4d");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("data")) {
            try {
                return (ImageUploadServiceData) new Gson().fromJson(asJsonObject.get("data"), (Class<Object>) ImageUploadServiceData.class);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
