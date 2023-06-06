package com.sankuai.android.share.common.util;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static String b;
    private static JsonObject c;

    public static JsonArray a(String str) {
        String str2;
        JsonObject jsonObject;
        JsonElement jsonElement;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "342fa5f9a39cea7d1f672d37fb665cfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "342fa5f9a39cea7d1f672d37fb665cfe");
        }
        com.sankuai.android.share.common.plugins.a a2 = com.sankuai.android.share.common.plugins.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.share.common.plugins.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "11b5ea5a38fd0464950b5b40f6011572", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "11b5ea5a38fd0464950b5b40f6011572");
        } else {
            if (a2.b == null) {
                a2.b = Horn.accessCache("share_user_defined");
            }
            str2 = a2.b;
        }
        if (str2 == null) {
            return null;
        }
        try {
            jsonObject = new JsonParser().parse(str2).getAsJsonObject();
        } catch (Exception unused) {
            jsonObject = null;
        }
        if (jsonObject == null) {
            return null;
        }
        Iterator<Map.Entry<String, JsonElement>> it = jsonObject.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                jsonElement = null;
                break;
            }
            Map.Entry<String, JsonElement> next = it.next();
            if (!TextUtils.isEmpty(str) && str.startsWith(next.getKey())) {
                jsonElement = next.getValue();
                break;
            }
        }
        if (jsonElement != null) {
            try {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject == null) {
                    return null;
                }
                return asJsonObject.getAsJsonArray("channel");
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    public static ArrayList<String> a() {
        JsonArray jsonArray;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55c70218c6d3181099489efed0345cf5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55c70218c6d3181099489efed0345cf5");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        JsonObject f = f();
        if (f == null) {
            return arrayList;
        }
        if (f.get("enable") != null) {
            try {
                if (!f.get("enable").getAsBoolean()) {
                    return arrayList;
                }
            } catch (Exception unused) {
            }
        }
        if (f.get("android_share_redirect_whitelist") != null) {
            try {
                jsonArray = f.get("android_share_redirect_whitelist").getAsJsonArray();
            } catch (Exception unused2) {
                jsonArray = null;
            }
            if (jsonArray != null) {
                Iterator<JsonElement> it = jsonArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getAsString());
                }
            }
        }
        return arrayList;
    }

    public static boolean b() {
        JsonObject jsonObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e282b5930a6a6de2f96fe04baa4dd92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e282b5930a6a6de2f96fe04baa4dd92")).booleanValue();
        }
        String accessCache = Horn.accessCache("android_share_short_url");
        if (!TextUtils.isEmpty(accessCache)) {
            try {
                jsonObject = new JsonParser().parse(accessCache).getAsJsonObject();
            } catch (Exception unused) {
                jsonObject = null;
            }
            if (jsonObject != null && jsonObject.get("share_short_url_enable") != null) {
                return jsonObject.get("share_short_url_enable").getAsBoolean();
            }
        }
        return true;
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b983a535de5fa0f0c36d52c5cba4d9eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b983a535de5fa0f0c36d52c5cba4d9eb")).booleanValue() : com.sankuai.android.share.util.b.a(d(), "share_lch_transform_enable", true);
    }

    public static JsonObject d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc914225d8733e86b495f8a90df1b4d0", RobustBitConfig.DEFAULT_VALUE) ? (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc914225d8733e86b495f8a90df1b4d0") : com.sankuai.android.share.util.b.a(Horn.accessCache("android_share_lch_transform"));
    }

    public static ArrayList<String> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c06fae461557d499b55736df13f7e725", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c06fae461557d499b55736df13f7e725");
        }
        JsonObject d = d();
        JsonArray c2 = d != null ? com.sankuai.android.share.util.b.c(d, "appshare_pageCid_blackList") : null;
        ArrayList<String> arrayList = new ArrayList<>();
        if (c2 != null) {
            Iterator<JsonElement> it = c2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAsString());
            }
        }
        return arrayList;
    }

    public static JsonObject f() {
        JsonObject jsonObject;
        JsonObject asJsonObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9247250c8f41cf1657232a1f91adc85", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9247250c8f41cf1657232a1f91adc85");
        }
        if (c != null) {
            return c;
        }
        if (b == null) {
            b = Horn.accessCache("android_share_redirect_list");
        }
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            jsonObject = new JsonParser().parse(b).getAsJsonObject();
        } catch (Exception unused) {
            jsonObject = null;
        }
        if (jsonObject == null) {
            return null;
        }
        if (jsonObject.get("android_share_redirect_list") != null) {
            try {
                asJsonObject = jsonObject.get("android_share_redirect_list").getAsJsonObject();
            } catch (Exception unused2) {
            }
            c = asJsonObject;
            return asJsonObject;
        }
        asJsonObject = null;
        c = asJsonObject;
        return asJsonObject;
    }
}
