package com.meituan.msc.modules.api.route;

import com.meituan.msc.extern.IApiCallback;
import com.meituan.msc.modules.api.ActivityApi;
import com.meituan.msc.modules.page.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RouteApi extends ActivityApi {
    public static ChangeQuickRedirect e;

    @Override // com.meituan.msc.modules.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423417a5e1ea1f3f68a5424f85d1a345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423417a5e1ea1f3f68a5424f85d1a345");
        } else if (str.equals("getCurrentRoute")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                m pageManager = getPageManager();
                jSONObject2.put(TencentExtraKeys.LOCATION_KEY_ROUTE, pageManager == null ? null : pageManager.h().getPagePath());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            iApiCallback.onSuccess(jSONObject2);
        }
    }
}
