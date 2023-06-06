package com.meituan.android.recce.shark;

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
/* loaded from: classes3.dex */
public class WasaiJSONObjectTypeAdapter implements JsonDeserializer<JSONObject>, JsonSerializer<JSONObject> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public JSONObject deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9118a1c814a5fd4921f11794fda97c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9118a1c814a5fd4921f11794fda97c");
        }
        try {
            return new JSONObject(g.a().toJson(jsonElement));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonSerializer
    /* renamed from: a */
    public JsonElement serialize(JSONObject jSONObject, Type type, JsonSerializationContext jsonSerializationContext) {
        Object[] objArr = {jSONObject, type, jsonSerializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9db2966480af26fc31bcc63ac34fc73", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9db2966480af26fc31bcc63ac34fc73");
        }
        try {
            return (JsonElement) g.a().fromJson(jSONObject.toString(), (Class<Object>) JsonElement.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
