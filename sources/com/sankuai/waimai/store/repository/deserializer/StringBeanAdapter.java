package com.sankuai.waimai.store.repository.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.log.a;
import com.sankuai.waimai.store.repository.model.j;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StringBeanAdapter implements JsonDeserializer<j> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public j deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String jsonElement2;
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2334f4057a311e0a2ce441ac37a6abfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2334f4057a311e0a2ce441ac37a6abfb");
        }
        try {
            if (jsonElement instanceof JsonPrimitive) {
                jsonElement2 = jsonElement.getAsString();
            } else {
                jsonElement2 = jsonElement.toString();
            }
            return new j(jsonElement2);
        } catch (Exception e) {
            a.a(e);
            return null;
        }
    }
}
