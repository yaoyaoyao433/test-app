package com.meituan.android.common.aidata.jsengine.utils;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.resources.config.IJSFrameworkUpdateResultCallback;
import com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSCallbackWithFrameworkUpdateChecking implements IJSCallback {
    private static final String TAG = "JSCallbackWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IJSFrameworkUpdateResultCallback mFrameworkUpdateResultCallback;
    private final IJSCallback mJSCallback;

    public JSCallbackWithFrameworkUpdateChecking(IJSCallback iJSCallback, IJSFrameworkUpdateResultCallback iJSFrameworkUpdateResultCallback) {
        Object[] objArr = {iJSCallback, iJSFrameworkUpdateResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ad0aa8a2d5b06be1ea7a52fcc929efd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ad0aa8a2d5b06be1ea7a52fcc929efd");
            return;
        }
        this.mJSCallback = iJSCallback;
        this.mFrameworkUpdateResultCallback = iJSFrameworkUpdateResultCallback;
    }

    @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
    public void onSuccess(String str, String str2, JSValueWrapper jSValueWrapper) {
        Object[] objArr = {str, str2, jSValueWrapper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe699f90515369755c9770860feff84e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe699f90515369755c9770860feff84e");
        } else if (this.mJSCallback != null) {
            this.mJSCallback.onSuccess(str, str2, jSValueWrapper);
        }
    }

    @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
    public void onFailed(final String str, final BlueException blueException) {
        boolean z = false;
        Object[] objArr = {str, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7e290e296aa88624dbff3ad3ef66cfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7e290e296aa88624dbff3ad3ef66cfb");
            return;
        }
        if (this.mFrameworkUpdateResultCallback != null) {
            if (BaseRaptorUploader.ERROR_LOAD_FAILED.equals(blueException != null ? blueException.getErrorCode() : "")) {
                JSFrameworkResourceManager.getInstance().startUpdateFramework(new IJSFrameworkUpdateResultCallback() { // from class: com.meituan.android.common.aidata.jsengine.utils.JSCallbackWithFrameworkUpdateChecking.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.resources.config.IJSFrameworkUpdateResultCallback
                    public void onUpdateFinish(boolean z2, boolean z3, @Nullable BlueException blueException2) {
                        Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), blueException2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "04a731ee6a3213b34bdfb5169ada4720", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "04a731ee6a3213b34bdfb5169ada4720");
                            return;
                        }
                        JSCallbackWithFrameworkUpdateChecking.this.mFrameworkUpdateResultCallback.onUpdateFinish(z2, z3, blueException2);
                        if (z3 || JSCallbackWithFrameworkUpdateChecking.this.mJSCallback == null) {
                            return;
                        }
                        JSCallbackWithFrameworkUpdateChecking.this.mJSCallback.onFailed(str, blueException);
                    }
                });
                z = true;
            }
        }
        if (z || this.mJSCallback == null) {
            return;
        }
        this.mJSCallback.onFailed(str, blueException);
    }
}
