package com.dianping.richtext;

import com.google.gson.Gson;
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
/* loaded from: classes.dex */
public class RichTextDeserializer implements JsonDeserializer<com.dianping.richtext.model.a> {
    public static ChangeQuickRedirect a;
    private static Gson b = new Gson();

    @Override // com.google.gson.JsonDeserializer
    public /* synthetic */ com.dianping.richtext.model.a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int i = 0;
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90654267274b4c0c745cfa9005669939", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.richtext.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90654267274b4c0c745cfa9005669939");
        }
        if (!(jsonElement instanceof JsonObject)) {
            return new com.dianping.richtext.model.c();
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has(d.s)) {
            i = asJsonObject.get(d.s).getAsInt();
        } else if (asJsonObject.has(d.I.get(d.s))) {
            i = asJsonObject.get(d.I.get(d.s)).getAsInt();
        }
        if (i == 1) {
            return (com.dianping.richtext.model.a) b.fromJson((JsonElement) asJsonObject, (Class<Object>) com.dianping.richtext.model.b.class);
        }
        return (com.dianping.richtext.model.a) b.fromJson((JsonElement) asJsonObject, (Class<Object>) com.dianping.richtext.model.c.class);
    }
}
