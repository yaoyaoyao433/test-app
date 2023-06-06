package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetStorageJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b3aa6c182f8fa1cec4951fb71421198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b3aa6c182f8fa1cec4951fb71421198");
            return;
        }
        String optString = jsBean().argsJson.optString("key");
        if (TextUtils.isEmpty(optString)) {
            jsCallbackErrorMsg("empty key");
            return;
        }
        try {
            StorageUtil.putSharedValue(jsHost().getContext(), optString, jsBean().argsJson.optString("value"), jsBean().argsJson.optInt("level"));
        } catch (Throwable unused) {
        }
        jsCallback();
    }
}
