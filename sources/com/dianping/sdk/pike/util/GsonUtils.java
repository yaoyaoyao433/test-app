package com.dianping.sdk.pike.util;

import android.util.Base64;
import com.dianping.sdk.pike.packet.j;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class GsonUtils {
    public static ChangeQuickRedirect a;
    private static final Gson b = new GsonBuilder().registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter()).excludeFieldsWithoutExposeAnnotation().create();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class ByteArrayToBase64TypeAdapter implements JsonDeserializer<byte[]>, JsonSerializer<byte[]> {
        public static ChangeQuickRedirect a;

        public ByteArrayToBase64TypeAdapter() {
        }

        @Override // com.google.gson.JsonDeserializer
        public /* synthetic */ byte[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90f2bb801f0b80fe808ad4210d0ecab", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90f2bb801f0b80fe808ad4210d0ecab") : Base64.decode(jsonElement.getAsString(), 3);
        }

        @Override // com.google.gson.JsonSerializer
        public /* synthetic */ JsonElement serialize(byte[] bArr, Type type, JsonSerializationContext jsonSerializationContext) {
            byte[] bArr2 = bArr;
            Object[] objArr = {bArr2, type, jsonSerializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "770545e6db7a9196cd2a0f59bbba3224", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "770545e6db7a9196cd2a0f59bbba3224") : new JsonPrimitive(Base64.encodeToString(bArr2, 3));
        }
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ba0faf7ff5c309e924cdb0b0c48ac29", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ba0faf7ff5c309e924cdb0b0c48ac29");
        }
        String json = b.toJson(obj);
        if (obj instanceof j) {
            ((j) obj).k = json;
        }
        return json;
    }

    public static <T> T a(String str, Class<T> cls) throws JsonSyntaxException {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fdc8b3f4d99cfaa5d5c997bc52c10aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fdc8b3f4d99cfaa5d5c997bc52c10aa");
        }
        T t = (T) b.fromJson(str, (Class<Object>) cls);
        if (t instanceof j) {
            ((j) t).k = str;
        }
        return t;
    }
}
