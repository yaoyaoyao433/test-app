package com.meituan.android.common.fingerprint.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LifecycleManager implements Application.ActivityLifecycleCallbacks {
    private static final int STATE_BACK = 1;
    private static final int STATE_FORE = 2;
    private static final int STATE_UNKNOWN = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile int sAppState;
    private static volatile int sCount;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0da98f54bfa429572fe4d16b743ee8ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0da98f54bfa429572fe4d16b743ee8ea");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    public static boolean isInForeground() {
        return sAppState == 0 || sAppState == 2;
    }

    public static int getAppState() {
        return sAppState;
    }

    public static void register(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5298ad29125fb00d4017c064c937b11a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5298ad29125fb00d4017c064c937b11a");
            return;
        }
        try {
            sAppState = isInForegroundByProcess(context) ? 2 : 1;
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new LifecycleManager());
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67142135f00646e44ced06d70eace8a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67142135f00646e44ced06d70eace8a3");
            return;
        }
        if (sCount <= 0) {
            sCount = 1;
        } else {
            sCount++;
        }
        if (sCount == 1) {
            sAppState = 2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        if (sAppState != 2) {
            sCount = 1;
            sAppState = 2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        if (sAppState != 2) {
            sCount = 1;
            sAppState = 2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d3c79b9280cfd68c8cb2f7a59dd450c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d3c79b9280cfd68c8cb2f7a59dd450c");
            return;
        }
        if (sCount <= 0) {
            sCount = 0;
        } else {
            sCount--;
        }
        if (sCount == 0) {
            sAppState = 1;
        }
    }

    private static boolean isInForegroundByProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7e1afd3aa4044cc297cff123e120eed", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7e1afd3aa4044cc297cff123e120eed")).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT <= 21) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                StringBuilder sb = new StringBuilder("onActivity is in foreground: ");
                sb.append(Process.myPid());
                sb.append(", ");
                sb.append(runningAppProcessInfo.pid);
                sb.append(", ");
                sb.append(runningAppProcessInfo.importance);
                sb.append(", ");
                sb.append(runningAppProcessInfo.importanceReasonPid);
                sb.append(", ");
                sb.append(runningAppProcessInfo.importanceReasonCode);
                sb.append(", ");
                sb.append(runningAppProcessInfo.importanceReasonComponent == null ? StringUtil.NULL : runningAppProcessInfo.importanceReasonComponent.toShortString());
                StringUtils.setLogan(sb.toString());
                if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.importance == 100 && runningAppProcessInfo.importanceReasonCode == 0) {
                    return true;
                }
            } else {
                List<ActivityManager.RunningAppProcessInfo> a = Privacy.createActivityManager(context, FingerprintManager.getOwlToken()).a();
                if (a != null && !a.isEmpty()) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : a) {
                        StringBuilder sb2 = new StringBuilder("onActivity is in foreground: ");
                        sb2.append(Process.myPid());
                        sb2.append(", ");
                        sb2.append(runningAppProcessInfo2.pid);
                        sb2.append(", ");
                        sb2.append(runningAppProcessInfo2.importance);
                        sb2.append(", ");
                        sb2.append(runningAppProcessInfo2.importanceReasonPid);
                        sb2.append(", ");
                        sb2.append(runningAppProcessInfo2.importanceReasonCode);
                        sb2.append(", ");
                        sb2.append(runningAppProcessInfo2.importanceReasonComponent == null ? StringUtil.NULL : runningAppProcessInfo2.importanceReasonComponent.toShortString());
                        StringUtils.setLogan(sb2.toString());
                        if (Process.myPid() == runningAppProcessInfo2.pid && runningAppProcessInfo2.importance == 100 && runningAppProcessInfo2.importanceReasonCode == 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
        }
        return false;
    }
}
