package com.meituan.mmp.lib.api.report;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class LoganModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Logan extends ApiFunction<JSONObject, JSONObject> {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public boolean isActivityApi() {
            return false;
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
            JSONObject jSONObject2 = jSONObject;
            Object[] objArr = {str, jSONObject2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56bbc9b346c3f85ed3a71dfcb2fe8256", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56bbc9b346c3f85ed3a71dfcb2fe8256");
                return;
            }
            try {
                JSONObject a = com.dianping.networklog.mmp.a.a(jSONObject2);
                boolean optBoolean = a.optBoolean("ret", false);
                JSONObject optJSONObject = a.optJSONObject("data");
                if (optBoolean) {
                    a(optJSONObject, iApiCallback);
                } else {
                    iApiCallback.onFail(optJSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
