package com.meituan.android.turbo.converter;

import android.util.SparseBooleanArray;
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
public final class p extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new p();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "710023d1f16c7e0aeb7f0e05b2031cc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "710023d1f16c7e0aeb7f0e05b2031cc9");
            return;
        }
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) t;
        if (sparseBooleanArray == null) {
            jsonWriter.nullValue();
            return;
        }
        int size = sparseBooleanArray.size();
        jsonWriter.beginObject();
        jsonWriter.name("mSize");
        jsonWriter.value(size);
        jsonWriter.name("mKeys");
        jsonWriter.beginArray();
        for (int i = 0; i < size; i++) {
            jsonWriter.value(sparseBooleanArray.keyAt(i));
        }
        jsonWriter.endArray();
        jsonWriter.name("mValues");
        jsonWriter.beginArray();
        for (int i2 = 0; i2 < size; i2++) {
            jsonWriter.value(sparseBooleanArray.valueAt(i2));
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [android.util.SparseBooleanArray, T] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f00b0d3afb96dc370ca58f22e1ac44", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f00b0d3afb96dc370ca58f22e1ac44");
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
                    arrayList2.add(Boolean.valueOf(jsonReader.nextBoolean()));
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        ?? r12 = (T) new SparseBooleanArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            r12.put(((Integer) arrayList.get(i2)).intValue(), ((Boolean) arrayList2.get(i2)).booleanValue());
        }
        return r12;
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [android.util.SparseBooleanArray, T] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0adb945c09bae8339c2a55c6e682af76", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0adb945c09bae8339c2a55c6e682af76");
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
            arrayList2.add(Boolean.valueOf(asJsonArray2.get(i2).getAsBoolean()));
        }
        ?? r11 = (T) new SparseBooleanArray(asInt);
        for (int i3 = 0; i3 < asInt; i3++) {
            r11.put(((Integer) arrayList.get(i3)).intValue(), ((Boolean) arrayList2.get(i3)).booleanValue());
        }
        return r11;
    }
}
