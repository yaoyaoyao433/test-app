package com.sankuai.waimai.bussiness.order.crossconfirm.utils;

import android.support.annotation.NonNull;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static JsonObject a(@NonNull JsonObject jsonObject, String str, JsonObject jsonObject2) {
        Object[] objArr = {jsonObject, str, jsonObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fe31af9a20106562e95fca833dab3e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fe31af9a20106562e95fca833dab3e0");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6970f70a8c3ba3a2bff6ea99dc4b66e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6970f70a8c3ba3a2bff6ea99dc4b66e8")).intValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c26a6e489509f6a4858a9e00849152e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c26a6e489509f6a4858a9e00849152e5");
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsString();
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public static JsonArray a(@NonNull JsonObject jsonObject, String str, JsonArray jsonArray) {
        Object[] objArr = {jsonObject, str, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74b34df428a94c9337e40b85336a0d8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74b34df428a94c9337e40b85336a0d8b");
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsJsonArray();
            } catch (Exception unused) {
            }
        }
        return jsonArray;
    }

    public static long a(@NonNull JsonObject jsonObject, String str, long j) {
        Object[] objArr = {jsonObject, str, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc8b609e6cca30f97d4dada571863f13", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc8b609e6cca30f97d4dada571863f13")).longValue();
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsLong();
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public static double a(@NonNull JsonObject jsonObject, String str, double d) {
        Object[] objArr = {jsonObject, str, Double.valueOf(0.0d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5606fc9e52a0803d78cd471c88febbc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5606fc9e52a0803d78cd471c88febbc")).doubleValue();
        }
        if (jsonObject.get(str) != null) {
            try {
                return jsonObject.get(str).getAsDouble();
            } catch (Exception unused) {
            }
        }
        return 0.0d;
    }
}
