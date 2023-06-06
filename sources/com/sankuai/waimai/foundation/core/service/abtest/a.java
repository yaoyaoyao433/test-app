package com.sankuai.waimai.foundation.core.service.abtest;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.turbo.annotations.JsonTool;
import com.meituan.android.turbo.converter.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@JsonTool("com.sankuai.waimai.foundation.core.service.abtest.ABStrategy")
/* loaded from: classes4.dex */
public final class a extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new a();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ae8dcb3726c890bbd3e9267eeae851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ae8dcb3726c890bbd3e9267eeae851");
            return;
        }
        ABStrategy aBStrategy = (ABStrategy) t;
        jsonWriter.beginObject();
        jsonWriter.name("scene_name");
        jsonWriter.value(aBStrategy.sceneName);
        jsonWriter.name("model_name");
        jsonWriter.value(aBStrategy.modelName);
        jsonWriter.name("exp_group_name");
        jsonWriter.value(aBStrategy.groupName);
        jsonWriter.name("exp_name");
        jsonWriter.value(aBStrategy.expName);
        jsonWriter.name("exp_config_name");
        jsonWriter.value(aBStrategy.configName);
        jsonWriter.name("exp_config_info");
        jsonWriter.value(aBStrategy.configInfo);
        jsonWriter.name("is_last");
        jsonWriter.value(aBStrategy.isLast);
        jsonWriter.name("params_info");
        if (aBStrategy.paramsInfo == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.beginObject();
            for (Map.Entry<String, String> entry : aBStrategy.paramsInfo.entrySet()) {
                jsonWriter.name(String.valueOf(entry.getKey()));
                jsonWriter.value(entry.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [com.sankuai.waimai.foundation.core.service.abtest.ABStrategy, T] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        String nextString;
        String nextString2;
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1493957eeb2134189998c76fb0ef2acd", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1493957eeb2134189998c76fb0ef2acd");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ?? r11 = (T) new ABStrategy();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("scene_name".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.sceneName = null;
                } else {
                    r11.sceneName = jsonReader.nextString();
                }
            } else if ("model_name".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.modelName = null;
                } else {
                    r11.modelName = jsonReader.nextString();
                }
            } else if ("exp_group_name".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.groupName = null;
                } else {
                    r11.groupName = jsonReader.nextString();
                }
            } else if ("exp_name".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.expName = null;
                } else {
                    r11.expName = jsonReader.nextString();
                }
            } else if ("exp_config_name".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.configName = null;
                } else {
                    r11.configName = jsonReader.nextString();
                }
            } else if ("exp_config_info".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.configInfo = null;
                } else {
                    r11.configInfo = jsonReader.nextString();
                }
            } else if ("is_last".equals(nextName)) {
                r11.isLast = jsonReader.nextBoolean();
            } else if ("params_info".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.paramsInfo = null;
                } else {
                    r11.paramsInfo = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                            nextString = null;
                        } else {
                            nextString = jsonReader.nextString();
                        }
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                            nextString2 = null;
                        } else {
                            nextString2 = jsonReader.nextString();
                        }
                        r11.paramsInfo.put(nextString, nextString2);
                    }
                    jsonReader.endObject();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return r11;
    }
}
