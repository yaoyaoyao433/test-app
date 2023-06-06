package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import com.sankuai.titans.protocol.utils.PublishCenter;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PublishJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40c49d17bc3a36b4e4787e87fb1942e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40c49d17bc3a36b4e4787e87fb1942e4");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                String optString = jsBean().argsJson.optString("action");
                String optString2 = jsBean().argsJson.optString("data");
                int optInt = jsBean().argsJson.optInt("level", 0);
                Context context = jsHost().getContext();
                Intent intent = new Intent(optString);
                intent.setPackage(context.getPackageName());
                intent.putExtra("data", optString2);
                if (optInt == 1) {
                    LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                } else {
                    b.a(context, intent);
                }
                PublishCenter.getInstance().publish(optString, jsBean().argsJson);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            jSONObject.put("status", "fail");
        }
        jsCallback(jSONObject);
    }
}
