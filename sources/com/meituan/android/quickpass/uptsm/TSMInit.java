package com.meituan.android.quickpass.uptsm;

import android.content.Context;
import android.support.annotation.Keep;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.quickpass.uptsm.common.utils.d;
import com.meituan.android.quickpass.uptsm.constant.b;
import com.meituan.android.quickpass.uptsm.web.AddCardToPayJsHandler;
import com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class TSMInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void init(Context context, String str, d.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa0b6972dba0266508175deedbf8edf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa0b6972dba0266508175deedbf8edf4");
            return;
        }
        b.a = str;
        b.b = context.getApplicationContext();
        if (aVar == null) {
            throw new RuntimeException("CatService不能为空");
        }
        Babel.initSDK(context, "quickpass_TSM", "5ad0a1df230dd64e60e7f11a");
        d.b = aVar;
        JsHandlerFactory.registerJsHandler("pay.isInAppProvisioningAvailable", IsSupportTSMJsHandler.class);
        JsHandlerFactory.registerJsHandler("pay.startInAppProvisioning", AddCardToPayJsHandler.class);
    }
}
