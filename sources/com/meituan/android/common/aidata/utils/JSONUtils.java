package com.meituan.android.common.aidata.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSONUtils {
    private static final String TAG = "JSONUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    @NonNull
    public static JSONObject parseToJSONObject(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1946b101b85d493e2a13227f9de3993c", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1946b101b85d493e2a13227f9de3993c") : parseToJSONObject(str, new JSONObject());
    }

    @Nullable
    public static JSONObject parseToJSONObject(@Nullable String str, @Nullable JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab78c3f2ed6d1acba7c0b88487c3bbe6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab78c3f2ed6d1acba7c0b88487c3bbe6");
        }
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("parse string ");
            sb.append(str);
            sb.append(" failed: ");
            sb.append(e);
            return jSONObject;
        }
    }

    @NonNull
    public static Map<String, List<String>> convertJSONObjectToMap(@Nullable JSONObject jSONObject) {
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d69ce3a1e71c386abcddcdf641283e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d69ce3a1e71c386abcddcdf641283e1");
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && (optJSONArray = jSONObject.optJSONArray(next)) != null) {
                    int length = optJSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        arrayList.add(optJSONArray.optString(i));
                    }
                    if (!arrayList.isEmpty()) {
                        hashMap.put(next, arrayList);
                    }
                }
            }
        }
        return hashMap;
    }
}
