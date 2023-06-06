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
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: ProGuard */
@JsonTool("com.sankuai.meituan.abtestv2.mode.ABTestDevBean")
/* loaded from: classes2.dex */
public final class b extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new b();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ddfbd4db91a2af0971b925f50f77c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ddfbd4db91a2af0971b925f50f77c0");
            return;
        }
        a aVar = (a) t;
        jsonWriter.beginObject();
        jsonWriter.name("key");
        jsonWriter.value(aVar.a);
        jsonWriter.name("title");
        jsonWriter.value(aVar.b);
        jsonWriter.name("values");
        if (aVar.c == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.beginArray();
            int length = Array.getLength(aVar.c);
            for (int i = 0; i < length; i++) {
                jsonWriter.value((String) Array.get(aVar.c, i));
            }
            jsonWriter.endArray();
        }
        jsonWriter.name("defaultValue");
        jsonWriter.value(aVar.d);
        jsonWriter.name("serverValue");
        jsonWriter.value(aVar.e);
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [T, com.sankuai.meituan.abtestv2.mode.a] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        String nextString;
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faf8c1d6940edc9afc2ae9dfc574d2b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faf8c1d6940edc9afc2ae9dfc574d2b9");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ?? r11 = (T) new a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("key".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.a = null;
                } else {
                    r11.a = jsonReader.nextString();
                }
            } else if ("title".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.b = null;
                } else {
                    r11.b = jsonReader.nextString();
                }
            } else if ("values".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.c = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                            nextString = null;
                        } else {
                            nextString = jsonReader.nextString();
                        }
                        arrayList.add(nextString);
                    }
                    jsonReader.endArray();
                    int size = arrayList.size();
                    r11.c = (String[]) Array.newInstance(String.class, size);
                    for (int i = 0; i < size; i++) {
                        Array.set(r11.c, i, (String) arrayList.get(i));
                    }
                }
            } else if ("defaultValue".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.d = null;
                } else {
                    r11.d = jsonReader.nextString();
                }
            } else if ("serverValue".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.e = null;
                } else {
                    r11.e = jsonReader.nextString();
                }
            }
        }
        jsonReader.endObject();
        return r11;
    }
}
