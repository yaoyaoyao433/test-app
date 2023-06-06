package com.meituan.android.uptodate.model;

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
/* compiled from: ProGuard */
@JsonTool("com.meituan.android.uptodate.model.VersionInfo.PeakPeriod")
/* loaded from: classes3.dex */
public final class b extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new b();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d24f5c66aebed45d22b7cd2983b2926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d24f5c66aebed45d22b7cd2983b2926");
            return;
        }
        VersionInfo.PeakPeriod peakPeriod = (VersionInfo.PeakPeriod) t;
        jsonWriter.beginObject();
        jsonWriter.name("startTime");
        jsonWriter.value(peakPeriod.startTime);
        jsonWriter.name("endTime");
        jsonWriter.value(peakPeriod.endTime);
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [T, com.meituan.android.uptodate.model.VersionInfo$PeakPeriod] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf7cb9fa47348021f719851a47ebd09", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf7cb9fa47348021f719851a47ebd09");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ?? r11 = (T) new VersionInfo.PeakPeriod();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("startTime".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.startTime = null;
                } else {
                    r11.startTime = jsonReader.nextString();
                }
            } else if ("endTime".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.endTime = null;
                } else {
                    r11.endTime = jsonReader.nextString();
                }
            }
        }
        jsonReader.endObject();
        return r11;
    }
}
