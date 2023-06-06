package com.meituan.android.mrn.component.list.turbo;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    private static WritableMap a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7d8b82cf57a5a0995570b30f07ebbbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7d8b82cf57a5a0995570b30f07ebbbf");
        }
        if (jSONObject == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    javaOnlyMap.putInt(next, ((Integer) obj).intValue());
                } else {
                    javaOnlyMap.putDouble(next, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof String) {
                javaOnlyMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                javaOnlyMap.putMap(next, a(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                javaOnlyMap.putArray(next, a(jSONObject.getJSONArray(next)));
            } else if (obj instanceof Boolean) {
                javaOnlyMap.putBoolean(next, jSONObject.getBoolean(next));
            } else if (obj == JSONObject.NULL) {
                javaOnlyMap.putNull(next);
            }
        }
        return javaOnlyMap;
    }

    public static WritableArray a(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b626be1a3a5874582b2483ebe0bdc276", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b626be1a3a5874582b2483ebe0bdc276");
        }
        if (jSONArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    javaOnlyArray.pushInt(((Integer) obj).intValue());
                } else {
                    javaOnlyArray.pushDouble(((Number) obj).doubleValue());
                }
            } else if (obj instanceof String) {
                javaOnlyArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                javaOnlyArray.pushMap(a(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                javaOnlyArray.pushArray(a(jSONArray.getJSONArray(i)));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(jSONArray.getBoolean(i));
            } else if (obj == JSONObject.NULL) {
                javaOnlyArray.pushNull();
            }
        }
        return javaOnlyArray;
    }
}
