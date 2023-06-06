package com.sankuai.waimai.platform.dynamic.gson;

import android.text.TextUtils;
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
/* loaded from: classes5.dex */
public class IntegerDefaultAdapter implements JsonDeserializer<Integer>, JsonSerializer<Integer> {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.JsonSerializer
    public /* synthetic */ JsonElement serialize(Integer num, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer num2 = num;
        Object[] objArr = {num2, type, jsonSerializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d6242eea322b4a793e5d2fb7e3deeb", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d6242eea322b4a793e5d2fb7e3deeb") : new JsonPrimitive((Number) num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bee2911dc895edfe8b631afa9fb74bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bee2911dc895edfe8b631afa9fb74bb");
        }
        try {
            String asString = jsonElement.getAsString();
            if (TextUtils.isEmpty(asString) || !TextUtils.isDigitsOnly(asString)) {
                return 0;
            }
        } catch (Exception unused) {
        }
        try {
            return Integer.valueOf(jsonElement.getAsInt());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
