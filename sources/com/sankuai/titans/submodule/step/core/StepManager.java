package com.sankuai.titans.submodule.step.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.submodule.step.core.impl.StepCountPermissionTask;
import com.sankuai.titans.submodule.step.core.impl.StepCountTask;
import com.sankuai.titans.submodule.step.core.params.GetStepCountParam;
import com.sankuai.titans.submodule.step.core.params.RequestPermissionParam;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StepManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile StepManager sInstance;

    public AbsStepCountTask<GetStepCountParam, IStepCountCallback> getStepCountTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09a41d203903ee2b82b0434e36015c57", RobustBitConfig.DEFAULT_VALUE) ? (AbsStepCountTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09a41d203903ee2b82b0434e36015c57") : new StepCountTask();
    }

    public AbsStepCountTask<RequestPermissionParam, IStepPermissionCallback> getStepCountPermissionTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "284d179fca4246a6c79401dd47ea71ba", RobustBitConfig.DEFAULT_VALUE) ? (AbsStepCountTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "284d179fca4246a6c79401dd47ea71ba") : new StepCountPermissionTask();
    }

    public static StepManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c09fcf338a129c9db67af924b3c7bd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (StepManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c09fcf338a129c9db67af924b3c7bd0");
        }
        if (sInstance == null) {
            synchronized (StepManager.class) {
                if (sInstance == null) {
                    sInstance = new StepManager();
                }
            }
        }
        return sInstance;
    }
}
