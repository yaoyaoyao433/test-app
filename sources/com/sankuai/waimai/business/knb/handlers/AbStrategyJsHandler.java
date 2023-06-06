package com.sankuai.waimai.business.knb.handlers;

import android.text.TextUtils;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AbStrategyJsHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9318a8a738077719c0af371afcdb6f6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9318a8a738077719c0af371afcdb6f6b");
        } else if (!validateArgs()) {
            jsCallbackErrorMsg("Illegal Params");
        } else {
            String optString = jsBean().argsJson.optString("group");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("Illegal Params");
                return;
            }
            ABStrategy strategy = ABTestManager.getInstance(b.a).getStrategy(optString, null);
            String aBStrategy = strategy != null ? strategy.toString() : null;
            if (!TextUtils.isEmpty(aBStrategy)) {
                jsCallback(aBStrategy);
            } else {
                jsCallback();
            }
        }
    }
}
