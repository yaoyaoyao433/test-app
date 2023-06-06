package com.meituan.android.common.fingerprint.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.meituan.android.common.fingerprint.info.FingerprintInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FingerItemSerializer<T> implements JsonSerializer<FingerprintInfo.FingerItem<T>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.google.gson.JsonSerializer
    public /* bridge */ /* synthetic */ JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        return serialize((FingerprintInfo.FingerItem) ((FingerprintInfo.FingerItem) obj), type, jsonSerializationContext);
    }

    public JsonElement serialize(FingerprintInfo.FingerItem<T> fingerItem, Type type, JsonSerializationContext jsonSerializationContext) {
        Object[] objArr = {fingerItem, type, jsonSerializationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "273b104e1a65d7058640ba1e208004fc", 6917529027641081856L)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "273b104e1a65d7058640ba1e208004fc");
        }
        if (fingerItem.success) {
            return jsonSerializationContext.serialize(fingerItem.data);
        }
        return jsonSerializationContext.serialize(fingerItem.reason);
    }
}
