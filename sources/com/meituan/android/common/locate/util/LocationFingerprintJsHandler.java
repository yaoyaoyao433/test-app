package com.meituan.android.common.locate.util;

import android.os.Build;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class LocationFingerprintJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        JSONObject jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5fbce1c325777403cec133cfd3ec96f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5fbce1c325777403cec133cfd3ec96f");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = Build.VERSION.SDK_INT >= 17 ? new JSONObject(LocationUtils.getLocationFingerprint(0)) : new JSONObject("the the not support");
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = jSONObject2;
        }
        jsCallback(jSONObject);
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "RsQaylZu4v4m1QExAiv91tA1Nrkc30f4K8PcsgxZmRqwYkobXAj685BuT9VNj2PFEDoO5jpu491pLCA4rqyM1A==";
    }
}
