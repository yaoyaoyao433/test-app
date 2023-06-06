package com.sankuai.titans.submodule.step.core.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.submodule.step.core.AbsStepCountTask;
import com.sankuai.titans.submodule.step.core.IStepCountCallback;
import com.sankuai.titans.submodule.step.core.StepService;
import com.sankuai.titans.submodule.step.core.params.GetStepCountParam;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StepCountTask extends AbsStepCountTask<GetStepCountParam, IStepCountCallback> {
    public static String TAG = "KNB_StepCountJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private WeakReference<Activity> activityWeakReference;
    private IStepCountCallback callback;
    public ServiceConnection conn;
    private boolean isBind;
    private IBinder mBinder;

    public StepCountTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "370f9d19b702a97fa0d2e5b4af03831c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "370f9d19b702a97fa0d2e5b4af03831c");
            return;
        }
        this.isBind = false;
        this.conn = new ServiceConnection() { // from class: com.sankuai.titans.submodule.step.core.impl.StepCountTask.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Object[] objArr2 = {componentName, iBinder};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a9093c28308c7192f5045bb5eedaa6b7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a9093c28308c7192f5045bb5eedaa6b7");
                    return;
                }
                StepCountTask.this.mBinder = iBinder;
                c.a("getCurrentStep", new Runnable() { // from class: com.sankuai.titans.submodule.step.core.impl.StepCountTask.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7829bc00c1e4f7be064aa2263cdf8080", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7829bc00c1e4f7be064aa2263cdf8080");
                            return;
                        }
                        try {
                            int currentStep = ((StepService.StepBinder) StepCountTask.this.mBinder).getService().getCurrentStep();
                            com.dianping.networklog.c.a("当前返回的用户步数为：" + currentStep, 3, new String[]{StepCountTask.TAG});
                            StepCountTask.this.jsCallback(currentStep);
                        } catch (Throwable th) {
                            com.dianping.networklog.c.a(Log.getStackTraceString(th), 35, new String[]{Constants.SPEED_METER_STEP});
                            StepCountTask.this.jsCallbackErrorMsg(Log.getStackTraceString(th));
                        }
                    }
                }).start();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Object[] objArr2 = {componentName};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "77c6823e6c616b9b203a3b0964d420aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "77c6823e6c616b9b203a3b0964d420aa");
                    return;
                }
                StepCountTask.this.mBinder = null;
                com.dianping.networklog.c.a(" ServiceConnection onServiceDisconnected ", 3, new String[]{StepCountTask.TAG});
            }
        };
    }

    @Override // com.sankuai.titans.submodule.step.core.AbsStepCountTask
    public void exec(Activity activity, GetStepCountParam getStepCountParam, IStepCountCallback iStepCountCallback) {
        Object[] objArr = {activity, getStepCountParam, iStepCountCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e60ced52fde53ab7a20444e60e2688ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e60ced52fde53ab7a20444e60e2688ca");
            return;
        }
        this.callback = iStepCountCallback;
        try {
            this.activityWeakReference = new WeakReference<>(activity);
            TitansPermissionUtil.checkSelfPermission(activity, PermissionGuard.PERMISSION_MOTION, getStepCountParam.sceneToken, new IRequestPermissionCallback() { // from class: com.sankuai.titans.submodule.step.core.impl.StepCountTask.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e339987b3fa0ae21e4edc276535977b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e339987b3fa0ae21e4edc276535977b1");
                    } else if (!z) {
                        StepCountTask.this.jsCallbackError(i, "设备授权失败");
                    } else {
                        StepCountTask.this.startService((Activity) StepCountTask.this.activityWeakReference.get());
                    }
                }
            });
        } catch (Exception e) {
            jsCallbackErrorMsg(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallback(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e27d151c1bd6a66bd48a729c0e2952da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e27d151c1bd6a66bd48a729c0e2952da");
        } else if (this.callback == null) {
        } else {
            this.callback.onSuccess(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallbackErrorMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5d600ef83eba55ee752bddab0cde434", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5d600ef83eba55ee752bddab0cde434");
        } else {
            jsCallbackError(0, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallbackError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f0d53bed373032096dcb5c12ea64fe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f0d53bed373032096dcb5c12ea64fe6");
        } else if (this.callback == null) {
        } else {
            this.callback.onFail(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startService(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "859d1c6b0dda9c91f80a6093d35f91c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "859d1c6b0dda9c91f80a6093d35f91c0");
        } else if (this.mBinder != null && this.mBinder.isBinderAlive()) {
            jsCallback(((StepService.StepBinder) this.mBinder).getService().getCurrentStep());
        } else {
            try {
                Intent intent = new Intent(activity, StepService.class);
                activity.startService(intent);
                this.isBind = activity.bindService(intent, this.conn, 1);
                com.dianping.networklog.c.a(" startService ，当前bindService状态为：" + this.isBind, 3, new String[]{TAG});
            } catch (Exception unused) {
                com.dianping.networklog.c.a("步数获取，开启StepService异常", 3, new String[]{TAG});
                jsCallbackErrorMsg("获取失败");
            }
        }
    }

    @Override // com.sankuai.titans.submodule.step.core.AbsStepCountTask
    public void onDestroy() {
        Activity activity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01e20235c538a0ea145a8a4987ff48a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01e20235c538a0ea145a8a4987ff48a9");
        } else if (!this.isBind || this.activityWeakReference == null || (activity = this.activityWeakReference.get()) == null) {
        } else {
            try {
                activity.unbindService(this.conn);
                this.isBind = false;
            } catch (Exception unused) {
            }
        }
    }
}
