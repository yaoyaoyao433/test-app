package com.meituan.android.nom.lyingkit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.nom.lyingkit.horn.model.LyingkitSwitchHornModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Gson b = new Gson();
    private static LyingkitSwitchHornModel c;

    public static void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8ec198f69442e6dbaf72aa2c2cefb58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8ec198f69442e6dbaf72aa2c2cefb58");
            return;
        }
        Horn.register("new_lyingkit_product_android", new HornCallback() { // from class: com.meituan.android.nom.lyingkit.a.1
            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
            }
        });
        Horn.register("new_lyingkit_switch_android", new HornCallback() { // from class: com.meituan.android.nom.lyingkit.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                LyingkitSwitchHornModel lyingkitSwitchHornModel;
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8e224dda74e84c50bb999537d1009da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8e224dda74e84c50bb999537d1009da");
                } else if (!z || TextUtils.isEmpty(str)) {
                } else {
                    try {
                        lyingkitSwitchHornModel = (LyingkitSwitchHornModel) a.b.fromJson(str, (Class<Object>) LyingkitSwitchHornModel.class);
                    } catch (Throwable unused) {
                        lyingkitSwitchHornModel = null;
                    }
                    if (lyingkitSwitchHornModel != null) {
                        LyingkitSwitchHornModel unused2 = a.c = lyingkitSwitchHornModel;
                    }
                }
            }
        });
        try {
            c = (LyingkitSwitchHornModel) b.fromJson(Horn.accessCache("new_lyingkit_switch_android"), (Class<Object>) LyingkitSwitchHornModel.class);
        } catch (Throwable unused) {
            c = null;
        }
    }

    public static boolean a(String str, String str2) {
        JsonObject jsonObject;
        JsonObject asJsonObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9001941cb54f793b43555576a6a40fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9001941cb54f793b43555576a6a40fe")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jsonObject = ((JsonObject) b.fromJson(Horn.accessCache("new_lyingkit_product_android"), (Class<Object>) JsonObject.class)).getAsJsonObject("data");
        } catch (Throwable unused) {
            jsonObject = null;
        }
        if (jsonObject == null || jsonObject.isJsonNull() || (asJsonObject = jsonObject.getAsJsonObject(str)) == null || asJsonObject.isJsonNull()) {
            return false;
        }
        JsonElement jsonElement = asJsonObject.get("enabled");
        JsonElement jsonElement2 = asJsonObject.get("versionsControl");
        if (jsonElement2 != null && !jsonElement2.isJsonNull()) {
            JsonElement jsonElement3 = jsonElement2.getAsJsonObject().get(str2);
            if (jsonElement3 != null && !jsonElement3.isJsonNull()) {
                return jsonElement3.getAsBoolean();
            }
            return a(jsonElement);
        }
        return a(jsonElement);
    }

    private static boolean a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97222057940c739960c053bcc4824561", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97222057940c739960c053bcc4824561")).booleanValue();
        }
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return true;
        }
        return jsonElement.getAsBoolean();
    }

    @NonNull
    public static Pair<Boolean, String> a(String str, String str2, String str3) {
        LyingkitSwitchHornModel.SpanIdModel switchBySpanid;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebe770c87375ec093f5e5b37fb9c7fcb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebe770c87375ec093f5e5b37fb9c7fcb");
        }
        if (TextUtils.isEmpty(str)) {
            return new Pair<>(Boolean.FALSE, "");
        }
        LyingkitSwitchHornModel lyingkitSwitchHornModel = c;
        if (lyingkitSwitchHornModel == null) {
            try {
                lyingkitSwitchHornModel = (LyingkitSwitchHornModel) b.fromJson(Horn.accessCache("new_lyingkit_switch_android"), (Class<Object>) LyingkitSwitchHornModel.class);
            } catch (Throwable unused) {
                lyingkitSwitchHornModel = null;
            }
        }
        if (lyingkitSwitchHornModel != null && (switchBySpanid = lyingkitSwitchHornModel.getSwitchBySpanid(str, str3)) != null && switchBySpanid.versions != null && switchBySpanid.versions.contains(str2)) {
            return new Pair<>(Boolean.valueOf(switchBySpanid.enabled), switchBySpanid.alert);
        }
        return new Pair<>(Boolean.TRUE, "");
    }
}
