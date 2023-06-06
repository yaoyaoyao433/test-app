package com.dianping.titans.js.jshandler;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OpenAppSettingHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34f92b04a3a93b10090ee54f333fd747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34f92b04a3a93b10090ee54f333fd747");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
            jsCallbackError(520, "no host");
        } else {
            try {
                Activity activity = jsHost().getActivity();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent);
                jsCallback();
            } catch (Exception e) {
                jsCallbackError(-1, Log.getStackTraceString(e));
            }
        }
    }
}
