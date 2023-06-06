package com.sankuai.meituan.abtestv2.mode;

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
/* compiled from: ProGuard */
@JsonTool("com.sankuai.meituan.abtestv2.mode.ABTestStrategyBean")
/* loaded from: classes2.dex */
public final class c extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new c();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78b34095c045b973e81437ad613bb349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78b34095c045b973e81437ad613bb349");
            return;
        }
        ABTestStrategyBean aBTestStrategyBean = (ABTestStrategyBean) t;
        jsonWriter.beginObject();
        jsonWriter.name("app");
        jsonWriter.value(aBTestStrategyBean.app);
        jsonWriter.name("bucket");
        jsonWriter.value(aBTestStrategyBean.bucket);
        jsonWriter.name("strategyKey");
        jsonWriter.value(aBTestStrategyBean.strategyKey);
        jsonWriter.name("layerKey");
        jsonWriter.value(aBTestStrategyBean.layerKey);
        jsonWriter.name("testKey");
        jsonWriter.value(aBTestStrategyBean.testKey);
        jsonWriter.name("flowKey");
        jsonWriter.value(aBTestStrategyBean.flowKey);
        jsonWriter.name("platform");
        jsonWriter.value(aBTestStrategyBean.platform);
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [T, com.sankuai.meituan.abtestv2.mode.ABTestStrategyBean] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae141d90d93457922a58529a5b7d579", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae141d90d93457922a58529a5b7d579");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ?? r11 = (T) new ABTestStrategyBean();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("app".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.app = null;
                } else {
                    r11.app = jsonReader.nextString();
                }
            } else if ("bucket".equals(nextName)) {
                r11.bucket = jsonReader.nextInt();
            } else if ("strategyKey".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.strategyKey = null;
                } else {
                    r11.strategyKey = jsonReader.nextString();
                }
            } else if ("layerKey".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.layerKey = null;
                } else {
                    r11.layerKey = jsonReader.nextString();
                }
            } else if ("testKey".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.testKey = null;
                } else {
                    r11.testKey = jsonReader.nextString();
                }
            } else if ("flowKey".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.flowKey = null;
                } else {
                    r11.flowKey = jsonReader.nextString();
                }
            } else if ("platform".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.platform = null;
                } else {
                    r11.platform = jsonReader.nextString();
                }
            }
        }
        jsonReader.endObject();
        return r11;
    }
}
