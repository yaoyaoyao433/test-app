package com.meituan.android.neohybrid.util.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSONObjectTypeAdapter implements JsonDeserializer<JSONObject>, JsonSerializer<JSONObject> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public JSONObject deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3b9ffe3c98bf1db2b7ec6da720facf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3b9ffe3c98bf1db2b7ec6da720facf9");
        }
        try {
            return new JSONObject(b.a().toJson(jsonElement));
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e, "JSONObjectTypeAdapter_deserialize");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonSerializer
    /* renamed from: a */
    public JsonElement serialize(JSONObject jSONObject, Type type, JsonSerializationContext jsonSerializationContext) {
        Object[] objArr = {jSONObject, type, jsonSerializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c88755a1cce02ae9e9519519d02df785", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c88755a1cce02ae9e9519519d02df785");
        }
        try {
            return (JsonElement) b.a().fromJson(jSONObject.toString(), (Class<Object>) JsonElement.class);
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e, "JSONObjectTypeAdapter_serialize");
            return null;
        }
    }
}
