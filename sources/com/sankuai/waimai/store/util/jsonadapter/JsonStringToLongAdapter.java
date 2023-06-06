package com.sankuai.waimai.store.util.jsonadapter;

import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.log.a;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class JsonStringToLongAdapter implements JsonDeserializer<Long> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public Long deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String asString;
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c16f93d47e1eacbcd5ec461f35bbe26", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c16f93d47e1eacbcd5ec461f35bbe26");
        }
        long j = 0;
        try {
            asString = jsonElement.getAsString();
        } catch (Exception e) {
            a.a(e);
        }
        if (TextUtils.equals(asString, Constants.UNDEFINED)) {
            return 0L;
        }
        j = Long.parseLong(asString);
        return Long.valueOf(j);
    }
}
