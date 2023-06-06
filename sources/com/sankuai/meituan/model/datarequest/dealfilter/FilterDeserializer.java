package com.sankuai.meituan.model.datarequest.dealfilter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FilterDeserializer implements JsonDeserializer<Filter> {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.JsonDeserializer
    public /* synthetic */ Filter deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11a958eacd3491d412bed2701e1258c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Filter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11a958eacd3491d412bed2701e1258c");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Filter filter = new Filter();
        filter.name = asJsonObject.get("name").getAsString();
        filter.selectkey = asJsonObject.get("selectkey").getAsString();
        filter.showtype = asJsonObject.get("showtype").getAsString();
        filter.type = asJsonObject.get("type").getAsString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonElement jsonElement2 = asJsonObject.get("values");
        if (jsonElement2.isJsonArray()) {
            Iterator<JsonElement> it = asJsonObject.get("values").getAsJsonArray().iterator();
            while (it.hasNext()) {
                for (Map.Entry<String, JsonElement> entry : it.next().getAsJsonObject().entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().getAsString());
                }
            }
        } else {
            for (Map.Entry<String, JsonElement> entry2 : jsonElement2.getAsJsonObject().entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue().getAsString());
            }
        }
        filter.values = linkedHashMap;
        return filter;
    }
}
