package com.sankuai.meituan.model.datarequest.topic;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.datarequest.a;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TopicDeserializer implements JsonDeserializer<Topic> {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.JsonDeserializer
    public /* synthetic */ Topic deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        boolean z = false;
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ff1ed3f12885c86728a59a833838cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Topic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ff1ed3f12885c86728a59a833838cf");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String str = null;
        if (asJsonObject.has("imagurl")) {
            JsonElement jsonElement2 = asJsonObject.get("imagurl");
            str = jsonElement2.isJsonPrimitive() ? jsonElement2.getAsString() : jsonElement2.toString();
            asJsonObject.remove("imagurl");
            z = true;
        }
        Topic topic = (Topic) a.a.fromJson(jsonElement, type);
        if (z) {
            topic.imageurl = str;
        }
        return topic;
    }
}
