package com.sankuai.titans.jsbridges.base.Interactions;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.utils.PublishCenter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PublishJsHandler extends DeprecatedJsBridge<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Void r12) {
        Object[] objArr = {r12};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "431cf44ccaffc7e211303a8f80b5a407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "431cf44ccaffc7e211303a8f80b5a407");
        } else if (this.argsJson == null) {
        } else {
            String optString = this.argsJson.optString("action");
            String optString2 = this.argsJson.optString("data");
            int optInt = this.argsJson.optInt("level", 0);
            RespResult.Builder builder = new RespResult.Builder();
            try {
                Context context = jsHost().getContext();
                Intent intent = new Intent(optString);
                intent.setPackage(context.getPackageName());
                intent.putExtra("data", optString2);
                if (optInt == 1) {
                    LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                } else {
                    b.a(context, intent);
                }
                PublishCenter.getInstance().publish(optString, this.argsJson);
            } catch (Exception unused) {
                builder.setStatus("fail");
            }
            jsCallback(builder.create());
        }
    }
}
