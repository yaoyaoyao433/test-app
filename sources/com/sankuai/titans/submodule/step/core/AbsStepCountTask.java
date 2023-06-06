package com.sankuai.titans.submodule.step.core;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbsStepCountTask<ParamT, CallbackT> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void exec(Activity activity, ParamT paramt, CallbackT callbackt);

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23a4a696eb6b1336a22858770193c3fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23a4a696eb6b1336a22858770193c3fd");
        }
    }
}
