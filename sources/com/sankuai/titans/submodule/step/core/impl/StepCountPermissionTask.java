package com.sankuai.titans.submodule.step.core.impl;

import android.app.Activity;
import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.submodule.step.core.AbsStepCountTask;
import com.sankuai.titans.submodule.step.core.IStepPermissionCallback;
import com.sankuai.titans.submodule.step.core.params.RequestPermissionParam;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StepCountPermissionTask extends AbsStepCountTask<RequestPermissionParam, IStepPermissionCallback> {
    private static final int PERMISSION_DENIED = 544;
    private static final int PERMISSION_GRANTED = 1;
    public static String TAG = "KNB_StepCountJsHandler_permission";
    public static ChangeQuickRedirect changeQuickRedirect;
    private WeakReference<Activity> activityWeakReference;
    private IStepPermissionCallback callback;

    @Override // com.sankuai.titans.submodule.step.core.AbsStepCountTask
    public void exec(Activity activity, RequestPermissionParam requestPermissionParam, IStepPermissionCallback iStepPermissionCallback) {
        Object[] objArr = {activity, requestPermissionParam, iStepPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50fe8df8abfbbb0e53f8bcd157f4d92b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50fe8df8abfbbb0e53f8bcd157f4d92b");
        } else if (activity == null || requestPermissionParam == null) {
            jsCallbackErrorMsg("activity or args is null");
        } else {
            this.callback = iStepPermissionCallback;
            try {
                this.activityWeakReference = new WeakReference<>(activity);
                checkPermission(activity, requestPermissionParam.readOnly, requestPermissionParam.sceneToken);
            } catch (Exception e) {
                jsCallbackErrorMsg(Log.getStackTraceString(e));
            }
        }
    }

    public void checkPermission(Activity activity, final boolean z, final String str) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aff0f3088a8c6d6b82994c488401910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aff0f3088a8c6d6b82994c488401910");
        } else {
            TitansPermissionUtil.checkSelfPermission(activity, PermissionGuard.PERMISSION_MOTION, str, new IRequestPermissionCallback() { // from class: com.sankuai.titans.submodule.step.core.impl.StepCountPermissionTask.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z2, int i) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34ac23fda35d7b56c78f9dfe4661a96b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34ac23fda35d7b56c78f9dfe4661a96b");
                    } else if (z2) {
                        StepCountPermissionTask.this.callback(true, 1);
                    } else {
                        c.a("ACTIVITY_RECOGNITION 权限不被授予, readOnly: " + z, 3, new String[]{StepCountPermissionTask.TAG});
                        if (z) {
                            StepCountPermissionTask.this.callback(false, 544);
                            return;
                        }
                        Activity activity2 = (Activity) StepCountPermissionTask.this.activityWeakReference.get();
                        if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                            return;
                        }
                        TitansPermissionUtil.requestPermission(activity2, PermissionGuard.PERMISSION_MOTION, str, new IRequestPermissionCallback() { // from class: com.sankuai.titans.submodule.step.core.impl.StepCountPermissionTask.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.sankuai.titans.result.IRequestPermissionCallback
                            public void onResult(boolean z3, int i2) {
                                Object[] objArr3 = {Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f00e351fe7872ca2ee7faed02814c231", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f00e351fe7872ca2ee7faed02814c231");
                                } else if (z3) {
                                    StepCountPermissionTask.this.callback(true, 1);
                                } else {
                                    StepCountPermissionTask.this.callback(false, 544);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callback(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "766bb5ed94a8634819927a30c8461610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "766bb5ed94a8634819927a30c8461610");
        } else if (z) {
            jsCallback();
        } else {
            jsCallbackError(i, "not enabled");
        }
    }

    private void jsCallbackErrorMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dab85fbd525c1e21acf29c3cd3ac075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dab85fbd525c1e21acf29c3cd3ac075");
        } else {
            jsCallbackError(0, str);
        }
    }

    private void jsCallbackError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c469ee8226426f6c69a5906bfb3bf225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c469ee8226426f6c69a5906bfb3bf225");
        } else if (this.callback == null) {
        } else {
            this.callback.onFail(i, str);
        }
    }

    private void jsCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcf647ade45f49ced330aa34cc773acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcf647ade45f49ced330aa34cc773acf");
        } else if (this.callback == null) {
        } else {
            this.callback.onSuccess();
        }
    }
}
