package com.sankuai.ehcore.bridge.knb;

import android.app.Activity;
import com.dianping.titans.js.jshandler.JsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.ehcore.module.core.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static com.sankuai.ehcore.module.core.a a(JsHandler jsHandler) {
        Object[] objArr = {jsHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3270762883c50ece475264f6b391a4cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.ehcore.module.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3270762883c50ece475264f6b391a4cd");
        }
        Activity activity = jsHandler.jsHost().getActivity();
        if (f.a(activity) != null) {
            return f.a(activity);
        }
        return f.a(jsHandler.jsHost().getWebView());
    }
}
