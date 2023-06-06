package com.meituan.mmp.lib.config;

import com.meituan.mmp.lib.utils.h;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Set<String> b = h.b("gh_84b9766b95bc", "mmp_87dffc23944d", "bike_mmp");

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc74c2e3f7d0ea098b248db92e95f297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc74c2e3f7d0ea098b248db92e95f297");
        } else if (!MMPEnvHelper.isInited()) {
            com.meituan.mmp.lib.trace.b.d("UseMTWebViewConfig", "mmp not inited");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str : b) {
                    jSONObject.put(str, b.d(str));
                }
            } catch (JSONException e) {
                com.meituan.mmp.lib.trace.b.a(e);
            }
            MMPEnvHelper.getDefaultSharedPreferences().edit().putString("MTWebViewEnabledApps", jSONObject.toString()).apply();
        }
    }
}
