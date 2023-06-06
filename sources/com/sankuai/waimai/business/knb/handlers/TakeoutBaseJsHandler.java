package com.sankuai.waimai.business.knb.handlers;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class TakeoutBaseJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fff9002ed8da8e6c25fe0c5504ba322d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fff9002ed8da8e6c25fe0c5504ba322d")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
