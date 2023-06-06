package com.sankuai.waimai.business.restaurant.poicontainer.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static Object a(Object obj) {
        Object aVar;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40475183e431b3d4f7b367d81faba5b7", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40475183e431b3d4f7b367d81faba5b7");
        }
        if (obj == null || obj == JsonNull.INSTANCE) {
            return null;
        }
        if (obj instanceof JsonElement) {
            if (obj instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
                if (jsonPrimitive.isBoolean()) {
                    return Boolean.valueOf(jsonPrimitive.getAsBoolean());
                }
                if (jsonPrimitive.isNumber()) {
                    return jsonPrimitive.getAsNumber();
                }
                if (jsonPrimitive.isString()) {
                    return jsonPrimitive.getAsString();
                }
                com.sankuai.waimai.foundation.utils.log.a.e("JSONObjectDelegateUtil", StringUtil.SPACE, new Object[0]);
                return obj;
            }
            if (obj instanceof JsonObject) {
                aVar = new c((JsonObject) obj);
            } else if (!(obj instanceof JsonArray)) {
                return obj;
            } else {
                aVar = new a((JsonArray) obj);
            }
            return aVar;
        }
        return obj;
    }
}
