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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@JsonTool("com.meituan.android.uptodate.model.VersionInfo")
/* loaded from: classes3.dex */
public final class c extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new c();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c81b8769cbe7903d3775aab1fdde83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c81b8769cbe7903d3775aab1fdde83");
            return;
        }
        VersionInfo versionInfo = (VersionInfo) t;
        jsonWriter.beginObject();
        jsonWriter.name("isUpdated");
        jsonWriter.value(versionInfo.isUpdated);
        jsonWriter.name("currentVersion");
        jsonWriter.value(versionInfo.currentVersion);
        jsonWriter.name("changeLog");
        jsonWriter.value(versionInfo.changeLog);
        jsonWriter.name("versionname");
        jsonWriter.value(versionInfo.versionname);
        jsonWriter.name("appurl");
        jsonWriter.value(versionInfo.appurl);
        jsonWriter.name("appHttpsUrl");
        jsonWriter.value(versionInfo.appHttpsUrl);
        jsonWriter.name("md5");
        jsonWriter.value(versionInfo.md5);
        jsonWriter.name("forceupdate");
        jsonWriter.value(versionInfo.forceupdate);
        jsonWriter.name("diffInfo");
        if (versionInfo.diffInfo == null) {
            jsonWriter.nullValue();
        } else {
            a.b.a((f) versionInfo.diffInfo, jsonWriter);
        }
        jsonWriter.name("versionUpgradeControl");
        jsonWriter.value(versionInfo.versionUpgradeControl);
        jsonWriter.name("installAlertFrequency");
        jsonWriter.value(versionInfo.installAlertFrequency);
        jsonWriter.name("marketUri");
        jsonWriter.value(versionInfo.marketUri);
        jsonWriter.name("marketPackage");
        jsonWriter.value(versionInfo.marketPackage);
        jsonWriter.name("publishType");
        jsonWriter.value(versionInfo.publishType);
        jsonWriter.name("publishId");
        jsonWriter.value(versionInfo.publishId);
        jsonWriter.name("updateTitle");
        jsonWriter.value(versionInfo.updateTitle);
        jsonWriter.name("notifyFree");
        jsonWriter.value(versionInfo.notifyFree);
        jsonWriter.name("notifyInterval");
        jsonWriter.value(versionInfo.notifyInterval);
        jsonWriter.name("notifyTimes");
        jsonWriter.value(versionInfo.notifyTimes);
        jsonWriter.name("netLimit");
        jsonWriter.value(versionInfo.netLimit);
        jsonWriter.name("isManual");
        jsonWriter.value(versionInfo.isManual);
        jsonWriter.name("peakPeriodList");
        if (versionInfo.peakPeriodList == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.beginArray();
            for (VersionInfo.PeakPeriod peakPeriod : versionInfo.peakPeriodList) {
                if (peakPeriod == null) {
                    jsonWriter.nullValue();
                } else {
                    b.b.a((f) peakPeriod, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.name("configJson");
        if (versionInfo.configJson == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.beginObject();
            for (Map.Entry<String, String> entry : versionInfo.configJson.entrySet()) {
                jsonWriter.name(String.valueOf(entry.getKey()));
                jsonWriter.value(entry.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [T, com.meituan.android.uptodate.model.VersionInfo] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        String nextString;
        String nextString2;
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "babbad32d6e75246797a8453cecb734a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "babbad32d6e75246797a8453cecb734a");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ?? r11 = (T) new VersionInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("isUpdated".equals(nextName)) {
                r11.isUpdated = jsonReader.nextBoolean();
            } else if ("currentVersion".equals(nextName)) {
                r11.currentVersion = jsonReader.nextInt();
            } else if ("changeLog".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.changeLog = null;
                } else {
                    r11.changeLog = jsonReader.nextString();
                }
            } else if ("versionname".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.versionname = null;
                } else {
                    r11.versionname = jsonReader.nextString();
                }
            } else if ("appurl".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.appurl = null;
                } else {
                    r11.appurl = jsonReader.nextString();
                }
            } else if ("appHttpsUrl".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.appHttpsUrl = null;
                } else {
                    r11.appHttpsUrl = jsonReader.nextString();
                }
            } else if ("md5".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.md5 = null;
                } else {
                    r11.md5 = jsonReader.nextString();
                }
            } else if ("forceupdate".equals(nextName)) {
                r11.forceupdate = jsonReader.nextInt();
            } else if ("diffInfo".equals(nextName)) {
                r11.diffInfo = (VersionInfo.DiffInfo) a.b.a((Type) null, jsonReader);
            } else if ("versionUpgradeControl".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.versionUpgradeControl = null;
                } else {
                    r11.versionUpgradeControl = jsonReader.nextString();
                }
            } else if ("installAlertFrequency".equals(nextName)) {
                r11.installAlertFrequency = jsonReader.nextInt();
            } else if ("marketUri".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.marketUri = null;
                } else {
                    r11.marketUri = jsonReader.nextString();
                }
            } else if ("marketPackage".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.marketPackage = null;
                } else {
                    r11.marketPackage = jsonReader.nextString();
                }
            } else if ("publishType".equals(nextName)) {
                r11.publishType = jsonReader.nextInt();
            } else if ("publishId".equals(nextName)) {
                r11.publishId = jsonReader.nextLong();
            } else if ("updateTitle".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.updateTitle = null;
                } else {
                    r11.updateTitle = jsonReader.nextString();
                }
            } else if ("notifyFree".equals(nextName)) {
                r11.notifyFree = jsonReader.nextInt();
            } else if ("notifyInterval".equals(nextName)) {
                r11.notifyInterval = jsonReader.nextInt();
            } else if ("notifyTimes".equals(nextName)) {
                r11.notifyTimes = jsonReader.nextInt();
            } else if ("netLimit".equals(nextName)) {
                r11.netLimit = jsonReader.nextInt();
            } else if ("isManual".equals(nextName)) {
                r11.isManual = jsonReader.nextBoolean();
            } else if ("peakPeriodList".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.peakPeriodList = null;
                } else {
                    r11.peakPeriodList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        r11.peakPeriodList.add((VersionInfo.PeakPeriod) b.b.a((Type) null, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if ("configJson".equals(nextName)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    r11.configJson = null;
                } else {
                    r11.configJson = new HashMap();
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
                        r11.configJson.put(nextString, nextString2);
                    }
                    jsonReader.endObject();
                }
            }
        }
        jsonReader.endObject();
        return r11;
    }
}
