package com.sankuai.meituan.ipredownload;

import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.turbo.annotations.JsonTool;
import com.meituan.android.turbo.b;
import com.meituan.android.turbo.converter.e;
import com.meituan.android.turbo.converter.f;
import com.meituan.android.turbo.converter.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@JsonTool("com.sankuai.meituan.ipredownload.ResEntity")
/* loaded from: classes4.dex */
public final class a extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new a();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b730f01b2a3d4b0d49e9069d6f91ce53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b730f01b2a3d4b0d49e9069d6f91ce53");
            return;
        }
        ResEntity resEntity = (ResEntity) t;
        jsonWriter.beginObject();
        Object[] objArr2 = {resEntity, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e816c7c5f831bc60a32ce6176bf8d2ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e816c7c5f831bc60a32ce6176bf8d2ef");
        } else {
            jsonWriter.name("channel");
            jsonWriter.value(resEntity.channel);
            jsonWriter.name("isDDD");
            jsonWriter.value(resEntity.isDDD);
            jsonWriter.name("bundleNameList");
            e.b.a((f) resEntity.bundleNameList, jsonWriter);
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.sankuai.meituan.ipredownload.ResEntity] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        boolean z;
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "278ea4771fe4c0b6ca3e9b4e1cd1dd4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "278ea4771fe4c0b6ca3e9b4e1cd1dd4b");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ?? r4 = (T) new ResEntity();
        Object[] objArr2 = {type, r4, jsonReader};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "34646723c21cd9f36b006013da204342", RobustBitConfig.DEFAULT_VALUE)) {
            ResEntity resEntity = (ResEntity) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "34646723c21cd9f36b006013da204342");
        } else {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                Object[] objArr3 = {type, r4, nextName, jsonReader};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "345d13fce3b5b1c5c6e182c25c6fcb58", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "345d13fce3b5b1c5c6e182c25c6fcb58")).booleanValue();
                } else {
                    if ("channel".equals(nextName)) {
                        r4.channel = (String) s.b.a(String.class, jsonReader);
                    } else if ("isDDD".equals(nextName)) {
                        r4.isDDD = jsonReader.nextBoolean();
                    } else if ("bundleNameList".equals(nextName)) {
                        r4.bundleNameList = (List) e.b.a(b.a(List.class, String.class), jsonReader);
                    } else {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.sankuai.meituan.ipredownload.ResEntity] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a797b9dc34a7b2ca7b1faaa75897902", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a797b9dc34a7b2ca7b1faaa75897902");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        ?? r4 = (T) new ResEntity();
        Object[] objArr2 = {type, r4, jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3f8b27036c332a53a64ab4db1761ae08", RobustBitConfig.DEFAULT_VALUE)) {
            ResEntity resEntity = (ResEntity) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3f8b27036c332a53a64ab4db1761ae08");
        } else if (!jsonElement.isJsonNull()) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                String key = entry.getKey();
                JsonElement value = entry.getValue();
                Object[] objArr3 = {type, r4, key, value};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9317695fc5cf375f95c149a9c0f86dd2", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9317695fc5cf375f95c149a9c0f86dd2")).booleanValue();
                } else if ("channel".equals(key)) {
                    r4.channel = (String) s.b.a(String.class, value);
                } else if ("isDDD".equals(key)) {
                    r4.isDDD = value.getAsBoolean();
                } else if ("bundleNameList".equals(key)) {
                    r4.bundleNameList = (List) e.b.a(b.a(List.class, String.class), value);
                }
            }
        }
        return r4;
    }
}
