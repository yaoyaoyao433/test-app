package com.meituan.mmp.lib.api.route;

import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RouteApi extends ActivityApi {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fc3bc4c2a8c49af87b7d8511d259a65", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fc3bc4c2a8c49af87b7d8511d259a65") : new String[]{"getCurrentRoute"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352f23d8ce084b525e4c6935831ee6d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352f23d8ce084b525e4c6935831ee6d7");
        } else if (str.equals("getCurrentRoute")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                ab pageManager = getPageManager();
                jSONObject2.put(TencentExtraKeys.LOCATION_KEY_ROUTE, pageManager == null ? null : pageManager.e().getPagePath());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            iApiCallback.onSuccess(jSONObject2);
        }
    }
}
