package com.sankuai.waimai.platform.machpro.module;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.util.b;
import com.sankuai.waimai.platform.capacity.immersed.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPStatusBarModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @JSMethod(methodName = "setHidden")
    public void setHidden(Boolean bool) {
    }

    public MPStatusBarModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6740ecae309d717edf552bad52c866c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6740ecae309d717edf552bad52c866c6");
        }
    }

    @JSMethod(methodName = "statusBarHeight")
    public float statusBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70962cc347c45a310607d166c8d27127", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70962cc347c45a310607d166c8d27127")).floatValue();
        }
        if (Build.VERSION.SDK_INT < 23 || getMachContext() == null || getMachContext().getContext() == null) {
            return 0.0f;
        }
        Context context = getMachContext().getContext();
        return b.a(context, g.e(context));
    }

    @JSMethod(methodName = "setStatusBarStyle")
    public void setStatusBarStyle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07af75d92f04823aebba6d57ccea258c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07af75d92f04823aebba6d57ccea258c");
        } else if (Build.VERSION.SDK_INT < 23 || getMachContext() == null || !(getMachContext().getContext() instanceof Activity)) {
        } else {
            Activity activity = (Activity) getMachContext().getContext();
            a.b(activity, !TextUtils.equals(str, "light"));
            a.a(activity, true);
        }
    }
}
