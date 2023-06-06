package com.sankuai.waimai.alita.modules;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.jsexecutor.modules.m;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.alita.core.jsexecutor.modules.a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return a.b;
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0293ead8d3578a2c58cdf34b69bb226e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0293ead8d3578a2c58cdf34b69bb226e");
            return;
        }
        com.sankuai.waimai.alita.platform.debug.b.a("JsBridge " + a.b + ": taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        JSONObject a = a(TextUtils.isEmpty(str2) ? null : ABTestManager.getInstance().getStrategy(str2, null));
        com.sankuai.waimai.alita.platform.debug.b.a("JsBridge " + a.b + ".success: taskKey = " + str + ", callbackId = " + str3 + ", result  = " + a.toString());
        a(mVar, str3, a);
    }

    @NonNull
    private JSONObject a(@Nullable ABStrategy aBStrategy) {
        Object[] objArr = {aBStrategy};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1723849c680c5be9e9637e7c97229e5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1723849c680c5be9e9637e7c97229e5e");
        }
        JSONObject jSONObject = new JSONObject();
        if (aBStrategy == null) {
            aBStrategy = new ABStrategy();
        }
        try {
            jSONObject.putOpt("expGroupName", aBStrategy.groupName);
            jSONObject.putOpt("expName", aBStrategy.expName);
            jSONObject.putOpt("sceneName", aBStrategy.sceneName);
            jSONObject.putOpt("modelName", aBStrategy.modelName);
            jSONObject.putOpt("expConfigName", aBStrategy.configName);
            jSONObject.putOpt("expConfigInfo", aBStrategy.configInfo);
            if (aBStrategy.paramsInfo != null) {
                jSONObject.putOpt("paramsInfo", new JSONObject(aBStrategy.paramsInfo));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
