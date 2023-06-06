package com.meituan.android.ptcommonim.protocol.rollback;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.ptcommonim.protocol.rollback.bean.FallbackTypeList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.JsonHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    public static Context b;
    private static volatile a c;
    private static boolean d;
    private static boolean e;
    private static final Map<String, Object> f = new HashMap();
    private static final Map<String, Object> g = new HashMap();
    private static final Map<String, List<Integer>> h = new HashMap();

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "306c86191308978b545ef3fecfd88bcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "306c86191308978b545ef3fecfd88bcf");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public static /* synthetic */ void a(a aVar, boolean z, String str) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ad20ae74ad51bdd1906f7ebdbec0fea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ad20ae74ad51bdd1906f7ebdbec0fea");
        } else if (!z || TextUtils.isEmpty(str)) {
        } else {
            aVar.a(str);
        }
    }

    private void a(@NonNull String str) {
        JsonArray asJsonArray;
        JsonArray asJsonArray2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c4d271de4d4ccb49c92c260e7a35ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c4d271de4d4ccb49c92c260e7a35ee");
            return;
        }
        JsonObject jsonObject = JsonHelper.toJsonObject(str);
        if (jsonObject == null) {
            return;
        }
        JsonObject jsonObject2 = null;
        JsonObject asJsonObject = (jsonObject == null || !jsonObject.has("protocol_sdk_config")) ? null : jsonObject.getAsJsonObject("protocol_sdk_config");
        if (asJsonObject != null && asJsonObject.has("enable")) {
            d = asJsonObject.get("enable").getAsBoolean();
        }
        if (asJsonObject != null && asJsonObject.has("channelConfig") && (asJsonArray2 = asJsonObject.getAsJsonArray("channelConfig")) != null && asJsonArray2.size() > 0) {
            for (int i = 0; i < asJsonArray2.size(); i++) {
                JsonObject asJsonObject2 = asJsonArray2.get(i).getAsJsonObject();
                f.put(asJsonObject2.get("channel").getAsString(), Boolean.valueOf(asJsonObject2.get("enable").getAsBoolean()));
            }
        }
        if (jsonObject != null && jsonObject.has("card_sdk_config")) {
            jsonObject2 = jsonObject.getAsJsonObject("card_sdk_config");
        }
        if (jsonObject2 != null && jsonObject2.has("enable")) {
            e = jsonObject2.get("enable").getAsBoolean();
        }
        if (jsonObject2 != null && jsonObject2.has("channelConfig") && (asJsonArray = jsonObject2.getAsJsonArray("channelConfig")) != null && asJsonArray.size() > 0) {
            for (int i2 = 0; i2 < asJsonArray.size(); i2++) {
                JsonObject asJsonObject3 = asJsonArray.get(i2).getAsJsonObject();
                g.put(asJsonObject3.get("channel").getAsString(), Boolean.valueOf(asJsonObject3.get("enable").getAsBoolean()));
            }
        }
        FallbackTypeList fallbackTypeList = (FallbackTypeList) JsonHelper.fromJson((JsonElement) jsonObject, (Class<Object>) FallbackTypeList.class);
        if (fallbackTypeList == null || CollectionUtils.isEmpty(fallbackTypeList.configList)) {
            return;
        }
        for (FallbackTypeList.FallbackTypeConfig fallbackTypeConfig : fallbackTypeList.configList) {
            if (fallbackTypeConfig != null && !TextUtils.isEmpty(fallbackTypeConfig.channel)) {
                h.put(fallbackTypeConfig.channel, fallbackTypeConfig.fallbackTypes);
            }
        }
    }
}
