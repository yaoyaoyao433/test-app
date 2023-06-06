package com.meituan.mmp.lib.api.report;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class LxModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class LxLog extends ApiFunction<JSONObject, JSONObject> {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f569c5a614626ce7d14abf970619b8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f569c5a614626ce7d14abf970619b8c");
                return;
            }
            try {
                iApiCallback.onSuccess(Statistics.mmpToNative(jSONObject2));
            } catch (Throwable unused) {
                iApiCallback.onFail(null);
            }
        }
    }
}
