package com.meituan.msc.modules.page.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static JSONArray a(@NonNull String str) {
        JSONObject jSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5db73574208fdcf3956469fadc8b2ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5db73574208fdcf3956469fadc8b2ea");
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            g.a("HotRegionDataHelper", "getHotRegionDataArray error" + e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONArray("data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static a a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee0a397d517e3916ed6482a5160b2b30", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee0a397d517e3916ed6482a5160b2b30");
        }
        try {
            return new a(jSONObject.optBoolean("fixed", false), (float) jSONObject.optDouble("left", 0.0d), (float) jSONObject.optDouble("top", 0.0d), (float) jSONObject.optDouble("width", 0.0d), (float) jSONObject.optDouble("height", 0.0d));
        } catch (Throwable th) {
            g.a("HotRegionDataHelper", "createHotRegionData error:" + th);
            return null;
        }
    }
}
