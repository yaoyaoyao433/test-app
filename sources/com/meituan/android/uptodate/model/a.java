package com.meituan.android.uptodate.model;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.turbo.annotations.JsonTool;
import com.meituan.android.turbo.converter.f;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@JsonTool("com.meituan.android.uptodate.model.VersionInfo.DiffInfo")
/* loaded from: classes3.dex */
public final class a extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new a();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd938105212ecaf8d1f076d378980d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd938105212ecaf8d1f076d378980d1c");
            return;
        }
        VersionInfo.DiffInfo diffInfo = (VersionInfo.DiffInfo) t;
        jsonWriter.beginObject();
        jsonWriter.name("diffUrl");
        jsonWriter.value(diffInfo.diffUrl);
        jsonWriter.name("diffHttpsUrl");
        jsonWriter.value(diffInfo.diffHttpsUrl);
        jsonWriter.name("md5New");
        jsonWriter.value(diffInfo.md5New);
        jsonWriter.name("md5Diff");
        jsonWriter.value(diffInfo.md5Diff);
        jsonWriter.name("channel");
        jsonWriter.value(diffInfo.channel);
        jsonWriter.name("md5Final");
        jsonWriter.value(diffInfo.md5Final);
        jsonWriter.name("extraInfo");
        if (diffInfo.extraInfo == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.beginObject();
            for (Map.Entry<String, String> entry : diffInfo.extraInfo.entrySet()) {
                jsonWriter.name(String.valueOf(entry.getKey()));
                jsonWriter.value(entry.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [T, com.meituan.android.uptodate.model.VersionInfo$DiffInfo] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        String nextString;
        String nextString2;
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1499f93cb9953823ccf7443c00cff15", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1499f93cb9953823ccf7443c00cff15");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ?? r11 = (T) new VersionInfo.DiffInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("diffUrl".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.diffUrl = null;
                } else {
                    r11.diffUrl = jsonReader.nextString();
                }
            } else if ("diffHttpsUrl".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.diffHttpsUrl = null;
                } else {
                    r11.diffHttpsUrl = jsonReader.nextString();
                }
            } else if ("md5New".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.md5New = null;
                } else {
                    r11.md5New = jsonReader.nextString();
                }
            } else if ("md5Diff".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.md5Diff = null;
                } else {
                    r11.md5Diff = jsonReader.nextString();
                }
            } else if ("channel".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.channel = null;
                } else {
                    r11.channel = jsonReader.nextString();
                }
            } else if ("md5Final".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.md5Final = null;
                } else {
                    r11.md5Final = jsonReader.nextString();
                }
            } else if ("extraInfo".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.extraInfo = null;
                } else {
                    r11.extraInfo = new HashMap();
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
                        r11.extraInfo.put(nextString, nextString2);
                    }
                    jsonReader.endObject();
                }
            }
        }
        jsonReader.endObject();
        return r11;
    }
}
