package com.sankuai.waimai.business.restaurant.base.util;

import android.support.annotation.NonNull;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static JsonObject a(@NonNull JsonObject jsonObject, String str, JsonObject jsonObject2) {
        Object[] objArr = {jsonObject, str, jsonObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d52cc08326e6847e99e88bbadf0fb6d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d52cc08326e6847e99e88bbadf0fb6d3");
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsJsonObject();
            } catch (Exception unused) {
            }
        }
        return jsonObject2;
    }

    public static int a(@NonNull JsonObject jsonObject, String str, int i) {
        Object[] objArr = {jsonObject, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98be538a92220098aca5e0a23c363402", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98be538a92220098aca5e0a23c363402")).intValue();
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsInt();
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static String a(@NonNull JsonObject jsonObject, String str, String str2) {
        Object[] objArr = {jsonObject, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cd56e30232b9333ea0002f81119c1ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cd56e30232b9333ea0002f81119c1ca");
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsString();
            } catch (Exception unused) {
            }
        }
        return str2;
    }
}
