package com.sankuai.meituan.model.dao;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.turbo.annotations.JsonTool;
import com.meituan.android.turbo.converter.f;
import com.meituan.android.turbo.exceptions.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
@JsonTool("com.sankuai.meituan.model.dao.City")
/* loaded from: classes4.dex */
public final class City_TurboTool extends f {
    public static final f INSTANCE = new City_TurboTool();
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44cff6f3219e6a66a1e2b63073e88d99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44cff6f3219e6a66a1e2b63073e88d99");
            return;
        }
        City city = (City) t;
        jsonWriter.beginObject();
        jsonWriter.name("id");
        jsonWriter.value(city.id);
        jsonWriter.name("rank");
        jsonWriter.value(city.rank);
        jsonWriter.name("name");
        jsonWriter.value(city.name);
        jsonWriter.name("extraName");
        jsonWriter.value(city.extraName);
        jsonWriter.name("lat");
        jsonWriter.value(city.lat);
        jsonWriter.name("lng");
        jsonWriter.value(city.lng);
        jsonWriter.name("pinyin");
        jsonWriter.value(city.pinyin);
        jsonWriter.name("isOpen");
        jsonWriter.value(city.isOpen);
        jsonWriter.name("divisionStr");
        jsonWriter.value(city.divisionStr);
        jsonWriter.name("isForeign");
        jsonWriter.value(city.isForeign);
        jsonWriter.name("isDomestic");
        jsonWriter.value(city.isDomestic);
        jsonWriter.name("rawOffset");
        jsonWriter.value(city.rawOffset);
        jsonWriter.name("dstOffset");
        jsonWriter.value(city.dstOffset);
        jsonWriter.name("stdOffset");
        jsonWriter.value(city.stdOffset);
        jsonWriter.name("weather");
        jsonWriter.value(city.weather);
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [com.sankuai.meituan.model.dao.City, T] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1f56fc5621a5e3a3312bb7ac1eaa5aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1f56fc5621a5e3a3312bb7ac1eaa5aa");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ?? r11 = (T) new City();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("id".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.id = null;
                } else {
                    r11.id = Long.valueOf(jsonReader.nextLong());
                }
            } else if ("rank".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.rank = null;
                } else {
                    r11.rank = jsonReader.nextString();
                }
            } else if ("name".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.name = null;
                } else {
                    r11.name = jsonReader.nextString();
                }
            } else if ("extraName".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.extraName = null;
                } else {
                    r11.extraName = jsonReader.nextString();
                }
            } else if ("lat".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.lat = null;
                } else {
                    r11.lat = Double.valueOf(jsonReader.nextDouble());
                }
            } else if ("lng".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.lng = null;
                } else {
                    r11.lng = Double.valueOf(jsonReader.nextDouble());
                }
            } else if ("pinyin".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.pinyin = null;
                } else {
                    r11.pinyin = jsonReader.nextString();
                }
            } else if ("isOpen".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.isOpen = null;
                } else {
                    r11.isOpen = Boolean.valueOf(jsonReader.nextBoolean());
                }
            } else if ("divisionStr".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.divisionStr = null;
                } else {
                    r11.divisionStr = jsonReader.nextString();
                }
            } else if ("isForeign".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.isForeign = null;
                } else {
                    r11.isForeign = Boolean.valueOf(jsonReader.nextBoolean());
                }
            } else if ("isDomestic".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.isDomestic = null;
                } else {
                    r11.isDomestic = Boolean.valueOf(jsonReader.nextBoolean());
                }
            } else if ("rawOffset".equals(nextName)) {
                r11.rawOffset = jsonReader.nextInt();
            } else if ("dstOffset".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.dstOffset = null;
                } else {
                    r11.dstOffset = jsonReader.nextString();
                }
            } else if ("stdOffset".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.stdOffset = null;
                } else {
                    r11.stdOffset = jsonReader.nextString();
                }
            } else if ("weather".equals(nextName)) {
                r11.weather = jsonReader.nextBoolean();
            }
        }
        jsonReader.endObject();
        return r11;
    }
}
