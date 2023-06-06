package com.meituan.android.turbo.converter;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new r();

    @Override // com.meituan.android.turbo.converter.f
    @SuppressLint({"NewApi"})
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "415800ab4afce920b3db86c17f3a5a6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "415800ab4afce920b3db86c17f3a5a6f");
            return;
        }
        SparseLongArray sparseLongArray = (SparseLongArray) t;
        if (sparseLongArray == null) {
            jsonWriter.nullValue();
            return;
        }
        int size = sparseLongArray.size();
        jsonWriter.beginObject();
        jsonWriter.name("mSize");
        jsonWriter.value(size);
        jsonWriter.name("mKeys");
        jsonWriter.beginArray();
        for (int i = 0; i < size; i++) {
            jsonWriter.value(sparseLongArray.keyAt(i));
        }
        jsonWriter.endArray();
        jsonWriter.name("mValues");
        jsonWriter.beginArray();
        for (int i2 = 0; i2 < size; i2++) {
            jsonWriter.value(sparseLongArray.valueAt(i2));
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, android.util.SparseLongArray] */
    @Override // com.meituan.android.turbo.converter.f
    @SuppressLint({"NewApi"})
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b67e217138dba10b1187d6fe210b230", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b67e217138dba10b1187d6fe210b230");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("mSize".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("mKeys".equals(nextName)) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                }
                jsonReader.endArray();
            } else if ("mValues".equals(nextName)) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList2.add(Long.valueOf(jsonReader.nextLong()));
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        ?? r12 = (T) new SparseLongArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            r12.put(((Integer) arrayList.get(i2)).intValue(), ((Long) arrayList2.get(i2)).longValue());
        }
        return r12;
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [T, android.util.SparseLongArray] */
    @Override // com.meituan.android.turbo.converter.f
    @SuppressLint({"NewApi"})
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d9301492edc98d46e0c803016e2f09", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d9301492edc98d46e0c803016e2f09");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        int asInt = asJsonObject.get("mSize").getAsInt();
        JsonArray asJsonArray = asJsonObject.get("mKeys").getAsJsonArray();
        JsonArray asJsonArray2 = asJsonObject.get("mValues").getAsJsonArray();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < asJsonArray.size(); i++) {
            arrayList.add(Integer.valueOf(asJsonArray.get(i).getAsInt()));
        }
        for (int i2 = 0; i2 < asJsonArray2.size(); i2++) {
            arrayList2.add(Long.valueOf(asJsonArray2.get(i2).getAsLong()));
        }
        ?? r11 = (T) new SparseLongArray(asInt);
        for (int i3 = 0; i3 < asInt; i3++) {
            r11.put(((Integer) arrayList.get(i3)).intValue(), ((Long) arrayList2.get(i3)).longValue());
        }
        return r11;
    }
}
