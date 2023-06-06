package com.sankuai.ehcore.debug;

import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.ehcore.horn.e;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.f;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends RelativeLayout {
    public static ChangeQuickRedirect a;

    public static void a(final JSONObject jSONObject, final BaseJsHandler baseJsHandler) {
        Object[] objArr = {jSONObject, baseJsHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de048f79d92ebbcd889865e7a5f8791b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de048f79d92ebbcd889865e7a5f8791b");
            return;
        }
        String optString = jSONObject.optString("cmd");
        char c = 65535;
        if (optString.hashCode() == 3647 && optString.equals("rq")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        Object[] objArr2 = {jSONObject, baseJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7412c71554132c9ac29b89422abd64a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7412c71554132c9ac29b89422abd64a2");
        } else {
            com.sankuai.eh.component.service.network.a.a(false).callDynamic(jSONObject.optString("url"), com.sankuai.eh.component.service.network.a.b()).a(new f<ap>() { // from class: com.sankuai.ehcore.debug.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ap> call, Response<ap> response) {
                    Object[] objArr3 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5dd74ef5d0639a738a7d5052dc1212ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5dd74ef5d0639a738a7d5052dc1212ce");
                        return;
                    }
                    String string = response.e().string();
                    if (!TextUtils.isEmpty(string)) {
                        if ("skt".equals(jSONObject.optString("key"))) {
                            e.b(string, jSONObject.optString(JsBridgeResult.ARG_KEY_LOCATION_MODE));
                        } else {
                            e.a(string, jSONObject.optString(JsBridgeResult.ARG_KEY_LOCATION_MODE));
                        }
                        baseJsHandler.jsCallback();
                    }
                    baseJsHandler.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "no response");
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ap> call, Throwable th) {
                    Object[] objArr3 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b98544fc6f956823f24ab28e3e6a5131", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b98544fc6f956823f24ab28e3e6a5131");
                        return;
                    }
                    d.a(th);
                    baseJsHandler.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "request exception");
                }
            });
        }
    }
}
