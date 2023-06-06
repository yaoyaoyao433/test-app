package com.meituan.android.turbo.converter;

import android.util.SparseIntArray;
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
public final class q extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new q();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12a71b91cf3a0bf8b5aefa95b280431", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12a71b91cf3a0bf8b5aefa95b280431");
            return;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) t;
        if (sparseIntArray == null) {
            jsonWriter.nullValue();
            return;
        }
        int size = sparseIntArray.size();
        jsonWriter.beginObject();
        jsonWriter.name("mSize");
        jsonWriter.value(size);
        jsonWriter.name("mKeys");
        jsonWriter.beginArray();
        for (int i = 0; i < size; i++) {
            jsonWriter.value(sparseIntArray.keyAt(i));
        }
        jsonWriter.endArray();
        jsonWriter.name("mValues");
        jsonWriter.beginArray();
        for (int i2 = 0; i2 < size; i2++) {
            jsonWriter.value(sparseIntArray.valueAt(i2));
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [android.util.SparseIntArray, T] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e1d59c4e8090734ecd0b1917187a8b", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e1d59c4e8090734ecd0b1917187a8b");
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
                    arrayList2.add(Integer.valueOf(jsonReader.nextInt()));
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        ?? r12 = (T) new SparseIntArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            r12.put(((Integer) arrayList.get(i2)).intValue(), ((Integer) arrayList2.get(i2)).intValue());
        }
        return r12;
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [android.util.SparseIntArray, T] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9e25bec3c19c066b72482964691879d", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9e25bec3c19c066b72482964691879d");
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
            arrayList2.add(Integer.valueOf(asJsonArray2.get(i2).getAsInt()));
        }
        ?? r11 = (T) new SparseIntArray(asInt);
        for (int i3 = 0; i3 < asInt; i3++) {
            r11.put(((Integer) arrayList.get(i3)).intValue(), ((Integer) arrayList2.get(i3)).intValue());
        }
        return r11;
    }
}
