package com.sankuai.waimai.bussiness.order.confirm.helper;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderGsonTypeAdapter extends TypeAdapter<Object> {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader) throws IOException {
        Object[] objArr = {jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5c39c69bde008982fe83c87ef3d1c25", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5c39c69bde008982fe83c87ef3d1c25");
        }
        switch (jsonReader.peek()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(read(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case BEGIN_OBJECT:
                HashMap hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), read(jsonReader));
                }
                jsonReader.endObject();
                return hashMap;
            case STRING:
                return jsonReader.nextString();
            case NUMBER:
                String nextString = jsonReader.nextString();
                if (!nextString.contains(CommonConstant.Symbol.DOT) && !nextString.contains("e") && !nextString.contains("E")) {
                    if (a(nextString)) {
                        return Integer.valueOf(Integer.parseInt(nextString));
                    }
                    return Long.valueOf(Long.parseLong(nextString));
                }
                return Double.valueOf(Double.parseDouble(nextString));
            case BOOLEAN:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case NULL:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "777205bde6905c482e5ff595529fcc35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "777205bde6905c482e5ff595529fcc35")).booleanValue();
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class StringJsonDeserializer implements JsonDeserializer<String>, JsonSerializer<String> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.JsonDeserializer
        public /* synthetic */ String deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53030f1e78c79040a55dff9a4b23cac1", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53030f1e78c79040a55dff9a4b23cac1");
            }
            if (jsonElement.isJsonPrimitive()) {
                return jsonElement.getAsString();
            }
            if (jsonElement.isJsonObject() || jsonElement.isJsonArray()) {
                return new Gson().toJson(jsonElement);
            }
            jsonElement.isJsonNull();
            return "";
        }

        @Override // com.google.gson.JsonSerializer
        public /* synthetic */ JsonElement serialize(String str, Type type, JsonSerializationContext jsonSerializationContext) {
            String str2 = str;
            Object[] objArr = {str2, type, jsonSerializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9eadc39b98f01dda749e99b3b4f8855", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9eadc39b98f01dda749e99b3b4f8855") : new JsonPrimitive(str2);
        }
    }
}
