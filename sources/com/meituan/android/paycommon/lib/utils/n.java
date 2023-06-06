package com.meituan.android.paycommon.lib.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.common.utils.CollectionUtils;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private boolean b;
    private a c;
    private ActivityManager d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9619ec513f64c7b93f2e40d229738ebc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9619ec513f64c7b93f2e40d229738ebc");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public n(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d8c2dcf6f2eff0df985ab0d0bfcd13a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d8c2dcf6f2eff0df985ab0d0bfcd13a");
            return;
        }
        this.b = true;
        this.d = null;
        this.c = aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e433f61233ba19f53ccacbd7fd987ef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e433f61233ba19f53ccacbd7fd987ef8");
        } else if (this.b || this.c == null || !a(activity.getApplicationContext())) {
        } else {
            this.c.a();
            this.b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16cc49cdbe2169b8505253cc9e71cfee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16cc49cdbe2169b8505253cc9e71cfee");
        } else if (!this.b || this.c == null || a(activity.getApplicationContext())) {
        } else {
            this.b = false;
        }
    }

    private boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f15a2d6afc16a6e615ef0ff9b077be7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f15a2d6afc16a6e615ef0ff9b077be7")).booleanValue();
        }
        if (this.d == null) {
            this.d = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                List<ActivityManager.RunningAppProcessInfo> a2 = Privacy.createActivityManager(context, "com.meituan.android.wallet").a();
                if (CollectionUtils.isEmpty(a2)) {
                    return false;
                }
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a2) {
                    if (TextUtils.equals(runningAppProcessInfo.processName, context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            } else {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo2);
                if (TextUtils.equals(runningAppProcessInfo2.processName, context.getPackageName()) && runningAppProcessInfo2.importance == 100) {
                    return true;
                }
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_bho5wdv1_mc", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.a.a(e, "PayAppStateCallback_isRunningForeground", new a.c().a("sdk_version", Integer.valueOf(Build.VERSION.SDK_INT)).b);
        }
        return false;
    }
}
