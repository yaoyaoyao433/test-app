package com.meituan.android.screenshot.utils;

import android.support.annotation.RestrictTo;
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
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static String b;
    private static JsonObject c;

    private static JsonObject d() {
        JsonObject jsonObject;
        JsonObject asJsonObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0010d966d643d675b2579cf2a9f1423d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0010d966d643d675b2579cf2a9f1423d");
        }
        if (c != null) {
            return c;
        }
        if (b == null) {
            b = Horn.accessCache("android_screen_shot_share");
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
        if (jsonObject.get("android_screen_shot_share") != null) {
            try {
                asJsonObject = jsonObject.get("android_screen_shot_share").getAsJsonObject();
            } catch (Exception unused2) {
            }
            c = asJsonObject;
            return asJsonObject;
        }
        asJsonObject = null;
        c = asJsonObject;
        return asJsonObject;
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90e61c6809ea2023661b7f9f4cef5c16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90e61c6809ea2023661b7f9f4cef5c16")).booleanValue();
        }
        JsonObject d = d();
        if (d != null && d.get("enable") != null) {
            try {
                return d.get("enable").getAsBoolean();
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static ArrayList<String> b() {
        JsonArray jsonArray;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f794c6e94df45c26847f3d7ddd70cb45", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f794c6e94df45c26847f3d7ddd70cb45");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        JsonObject d = d();
        if (d != null && d.get("screen_shot_share_blacklist") != null) {
            try {
                jsonArray = d.get("screen_shot_share_blacklist").getAsJsonArray();
            } catch (Exception unused) {
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

    public static ArrayList<String> c() {
        JsonArray jsonArray;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52a26d4564233a3e693fbc220e3a70c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52a26d4564233a3e693fbc220e3a70c4");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        JsonObject d = d();
        if (d != null && d.get("screen_shot_share_whitelist") != null) {
            try {
                jsonArray = d.get("screen_shot_share_whitelist").getAsJsonArray();
            } catch (Exception unused) {
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
}
