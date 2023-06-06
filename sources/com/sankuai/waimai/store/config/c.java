package com.sankuai.waimai.store.config;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements g {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.config.g
    public final <T> T a(String str, Type type, JsonObject jsonObject, T t) {
        Object[] objArr = {str, type, jsonObject, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a5de2fe2ca4ee4ea0589dfbb5bcb8a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a5de2fe2ca4ee4ea0589dfbb5bcb8a5");
        }
        if (jsonObject == null) {
            return t;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        String[] strArr = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cf662a51ac6aa125d3bfb77354d1a251", RobustBitConfig.DEFAULT_VALUE)) {
            strArr = (String[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cf662a51ac6aa125d3bfb77354d1a251");
        } else if (!TextUtils.isEmpty(str)) {
            strArr = str.split("/");
        }
        if (strArr != null) {
            JsonElement jsonElement = jsonObject;
            for (String str2 : strArr) {
                if (!(jsonElement instanceof JsonObject)) {
                    break;
                }
                jsonElement = ((JsonObject) jsonElement).get(str2);
            }
            T t2 = (T) com.sankuai.waimai.store.util.i.a(jsonElement, type);
            if (t2 != null) {
                return t2;
            }
        }
        return t;
    }
}
