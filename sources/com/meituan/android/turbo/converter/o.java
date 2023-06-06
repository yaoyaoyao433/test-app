package com.meituan.android.turbo.converter;

import android.util.SparseArray;
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
public final class o extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new o();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c625f3049de5ade4fee765216f126fb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c625f3049de5ade4fee765216f126fb2");
            return;
        }
        SparseArray sparseArray = (SparseArray) t;
        if (sparseArray == null) {
            jsonWriter.nullValue();
            return;
        }
        int size = sparseArray.size();
        jsonWriter.beginObject();
        jsonWriter.name("mSize");
        jsonWriter.value(size);
        jsonWriter.name("mKeys");
        jsonWriter.beginArray();
        for (int i = 0; i < size; i++) {
            jsonWriter.value(sparseArray.keyAt(i));
        }
        jsonWriter.endArray();
        jsonWriter.name("mValues");
        jsonWriter.beginArray();
        for (int i2 = 0; i2 < size; i2++) {
            Object valueAt = sparseArray.valueAt(i2);
            if (valueAt == null) {
                jsonWriter.nullValue();
            } else {
                com.meituan.android.turbo.a.a((Class) valueAt.getClass()).a((f) valueAt, jsonWriter);
            }
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [android.util.SparseArray, T] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1424719d9ca85c7902e24f6555b166c1", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1424719d9ca85c7902e24f6555b166c1");
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
                Type type2 = com.meituan.android.turbo.b.b(type)[0];
                f a2 = com.meituan.android.turbo.a.a(type2);
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList2.add(a2.a(type2, jsonReader));
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        ?? r12 = (T) new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            r12.put(((Integer) arrayList.get(i2)).intValue(), arrayList2.get(i2));
        }
        return r12;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [android.util.SparseArray, T] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a2bbe215c4f78356e9abf9e9a6f4f7a", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a2bbe215c4f78356e9abf9e9a6f4f7a");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        Type type2 = com.meituan.android.turbo.b.b(type)[0];
        f a2 = com.meituan.android.turbo.a.a(type2);
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
            arrayList2.add(a2.a(type2, asJsonArray2.get(i2)));
        }
        ?? r12 = (T) new SparseArray(asInt);
        for (int i3 = 0; i3 < asInt; i3++) {
            r12.put(((Integer) arrayList.get(i3)).intValue(), arrayList2.get(i3));
        }
        return r12;
    }
}
