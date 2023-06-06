package com.meituan.android.turbo.converter;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new e();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec09da1a57ecddb470bde60f17ce499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec09da1a57ecddb470bde60f17ce499");
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.beginArray();
            for (Object obj : (Collection) t) {
                if (obj == null) {
                    jsonWriter.nullValue();
                } else {
                    com.meituan.android.turbo.a.a((Class) obj.getClass()).a((f) obj, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.Collection] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e31415fca37f2a753390353e114a389", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e31415fca37f2a753390353e114a389");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Class a2 = com.meituan.android.turbo.b.a(type);
        Type type2 = com.meituan.android.turbo.b.b(type)[0];
        f a3 = com.meituan.android.turbo.a.a(type2);
        ?? r0 = (T) a(a2);
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            r0.add(a3.a(type2, jsonReader));
        }
        jsonReader.endArray();
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.Collection] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "015d4cc94cea6a8d572672d646eec767", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "015d4cc94cea6a8d572672d646eec767");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        Class a2 = com.meituan.android.turbo.b.a(type);
        Type type2 = com.meituan.android.turbo.b.b(type)[0];
        f a3 = com.meituan.android.turbo.a.a(type2);
        ?? r0 = (T) a(a2);
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        for (int i = 0; i < asJsonArray.size(); i++) {
            r0.add(a3.a(type2, asJsonArray.get(i)));
        }
        return r0;
    }

    private Collection a(Class cls) throws com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9387220e66c5d09b53cc69a326108a56", 6917529027641081856L)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9387220e66c5d09b53cc69a326108a56");
        }
        if (cls == List.class || cls == ArrayList.class || cls == Collection.class) {
            return new ArrayList();
        }
        if (cls == Set.class || cls == HashSet.class) {
            return new HashSet();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        if (cls == LinkedHashSet.class) {
            return new LinkedHashSet();
        }
        if (cls == Queue.class) {
            return new ArrayDeque();
        }
        if (cls == SortedSet.class) {
            return new TreeSet();
        }
        if (cls.isInterface()) {
            throw new com.meituan.android.turbo.exceptions.a("Can't create instance for: " + cls.getSimpleName());
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception e) {
            throw new com.meituan.android.turbo.exceptions.a(e);
        }
    }
}
