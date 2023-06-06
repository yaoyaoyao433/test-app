package com.sankuai.titans.live.video.util;

import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GsonUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Gson mGson;

    public GsonUtil() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a947516736ead1c2b5aceb1185a676d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a947516736ead1c2b5aceb1185a676d");
        } else {
            this.mGson = new GsonBuilder().create();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class SingletonHolder {
        private static final GsonUtil INSTANCE = new GsonUtil();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static GsonUtil getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "81fd95132fa84e83c147b4b6bc864bc7", RobustBitConfig.DEFAULT_VALUE) ? (GsonUtil) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "81fd95132fa84e83c147b4b6bc864bc7") : SingletonHolder.INSTANCE;
    }

    public <T> String toJsonString(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "322bcb4e813c087c0a849f8e8a9af15b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "322bcb4e813c087c0a849f8e8a9af15b");
        }
        try {
            return this.mGson.toJson(t);
        } catch (Exception unused) {
            return "";
        }
    }

    public <T> T fromJson(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a15485968cb78bb39cda1b8b6324d72", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a15485968cb78bb39cda1b8b6324d72");
        }
        try {
            return (T) this.mGson.fromJson(str, (Class<Object>) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public <T> T fromJson(String str, Type type) {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d915eb1d45c687032eea9de8b0578c80", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d915eb1d45c687032eea9de8b0578c80");
        }
        try {
            return (T) this.mGson.fromJson(str, type);
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject parseBundle(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8a85e5a75cee63e675f208e1adb1a68", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8a85e5a75cee63e675f208e1adb1a68");
        }
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }
}
