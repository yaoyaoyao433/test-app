package com.dianping.titans.js.jshandler;

import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetNetworkTimeJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8c9a5807cdc15d7658dc93bdbb87cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8c9a5807cdc15d7658dc93bdbb87cdd");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DeviceInfo.TM, c.b());
        } catch (Exception unused) {
        }
        jsCallback(jSONObject);
    }
}
