package com.sankuai.waimai.business.knb.handlers;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetUnplHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "aHKnI2sSK51CAhNlwWq6uIItA1Jtn8w4YfqFedu0ONplpm2i2Tg7rRANujn6PvFVKLEW9RgPv8ppt4jRLXRjqw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ef6e5c397a768761f8d90233d265a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ef6e5c397a768761f8d90233d265a14");
        } else if (validateArgs()) {
            try {
                String optString = jsBean().argsJson.optString("unpl");
                if (TextUtils.isEmpty(optString) || optString.length() >= 256) {
                    return;
                }
                q.a(jsHost().getContext(), "waimai_takeout").a("unpl", optString);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0df9b72485eb3f047a447494fb87c0f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0df9b72485eb3f047a447494fb87c0f8")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
