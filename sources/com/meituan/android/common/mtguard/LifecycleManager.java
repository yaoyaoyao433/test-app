package com.meituan.android.common.mtguard;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Window;
import com.meituan.android.common.dfingerprint.collection.workers.AppInfoWorker;
import com.meituan.android.common.dfingerprint.store.BioSharedPref;
import com.meituan.android.common.mtguard.collect.d;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class LifecycleManager implements Application.ActivityLifecycleCallbacks {
    private static final int STATE_BACK = 1;
    private static final int STATE_FORE = 2;
    private static final int STATE_UNKNOWN = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static volatile long firstProcessBootTime = 0;
    private static volatile boolean isInit = false;
    private static Context mContext;
    private static volatile int sAppState;
    private static volatile int sCount;
    private static List<com.meituan.android.common.mtguard.wtscore.plugin.a> sListeners = new ArrayList();

    public static void addAppStateListener(com.meituan.android.common.mtguard.wtscore.plugin.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4365c7eb35722256e4b1716b9ec3e86d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4365c7eb35722256e4b1716b9ec3e86d");
        } else {
            sListeners.add(aVar);
        }
    }

    public static int getAppState() {
        return sAppState;
    }

    public static boolean isFirstProcess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd3943bc3f71533df24313e6b09061be", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd3943bc3f71533df24313e6b09061be")).booleanValue();
        }
        if (MTGuard.loadInitSuccess) {
            Object[] main3 = NBridge.main3(64, new Object[0]);
            boolean booleanValue = main3 != null ? ((Boolean) main3[0]).booleanValue() : false;
            MTGuardLog.setLogan("get file lock isFirstProcess:".concat(String.valueOf(booleanValue)));
            return booleanValue;
        }
        return false;
    }

    public static boolean isInForeground() {
        return sAppState == 0 || sAppState == 2;
    }

    private static boolean isInForegroundByProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b251f21d8b16323d85505be97a7d0f01", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b251f21d8b16323d85505be97a7d0f01")).booleanValue();
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
                MTGuardLog.setLogan(sb.toString());
                if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.importance == 100 && runningAppProcessInfo.importanceReasonCode == 0) {
                    return true;
                }
            } else {
                List<ActivityManager.RunningAppProcessInfo> a = Privacy.createActivityManager(context, AppInfoWorker.getBid()).a();
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
                        MTGuardLog.setLogan(sb2.toString());
                        if (Process.myPid() == runningAppProcessInfo2.pid && runningAppProcessInfo2.importance == 100 && runningAppProcessInfo2.importanceReasonCode == 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
        return false;
    }

    private static void notifyChange() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "231c023d9032a3b18f7904e68c1587c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "231c023d9032a3b18f7904e68c1587c4");
            return;
        }
        for (com.meituan.android.common.mtguard.wtscore.plugin.a aVar : sListeners) {
            if (aVar != null) {
                if (isInForeground()) {
                    aVar.a();
                    str = "Notify in foreground";
                } else {
                    aVar.b();
                    str = "Notify in background";
                }
                MTGuardLog.setLogan(str);
            }
        }
    }

    public static void register(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18d6eba6d038f759774b8615e0d7b40a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18d6eba6d038f759774b8615e0d7b40a");
            return;
        }
        try {
            if (isInit) {
                return;
            }
            mContext = context;
            if (isFirstProcess()) {
                saveFirstProcessInfo();
            }
            sAppState = isInForegroundByProcess(context) ? 2 : 1;
            MTGuardLog.setLogan("onActivity callback register: " + sCount + ", state " + sAppState);
            notifyChange();
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new LifecycleManager());
            isInit = true;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    private static void saveFirstProcessInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "710ace89317ff2a59aa7036d90a6e33c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "710ace89317ff2a59aa7036d90a6e33c");
            return;
        }
        try {
            BioSharedPref bioSharedPref = BioSharedPref.getInstance(mContext);
            bioSharedPref.writeString(BioSharedPref.BIO_COLLECT_MTX_KEY, "");
            bioSharedPref.writeInt(BioSharedPref.BIO_COLLECT_INDEX, 1);
            bioSharedPref.writeLong(BioSharedPref.BIO_COLLECT_CURRENTTIMEMILLIS, -1L);
            long processStartElapsedTimeMillis = TimeUtil.processStartElapsedTimeMillis();
            bioSharedPref.writeLong(BioSharedPref.FIRST_PROCESS_BOOT_TIME_KEY, Long.valueOf(processStartElapsedTimeMillis));
            firstProcessBootTime = processStartElapsedTimeMillis;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull final Activity activity, @Nullable Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "693c9c45e3d0b4284d51b8a5f1b7435f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "693c9c45e3d0b4284d51b8a5f1b7435f");
        } else if (d.a(mContext).a()) {
            new Handler().post(new Runnable() { // from class: com.meituan.android.common.mtguard.LifecycleManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6ca8a9879e104a47b2d4388618ffd10e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6ca8a9879e104a47b2d4388618ffd10e");
                        return;
                    }
                    try {
                        MTGuardLog.setLogan("start collect click in: " + activity.getClass().getName());
                        Window window = activity.getWindow();
                        window.setCallback(new c(window.getCallback(), LifecycleManager.mContext));
                    } catch (Throwable th) {
                        MTGuardLog.setErrorLogan(th);
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61420502f4930a3528850ac85dded19b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61420502f4930a3528850ac85dded19b");
            return;
        }
        if (sAppState != 2) {
            sCount = 1;
            sAppState = 2;
            MTGuardLog.setLogan("onActivityPaused: sync state");
            notifyChange();
        }
        MTGuardLog.setLogan("onActivityPaused: " + activity.getClass().getName() + ", " + sCount + ", state " + sAppState);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cbb84d770386b2f6026f19008070bb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cbb84d770386b2f6026f19008070bb9");
            return;
        }
        if (sAppState != 2) {
            sCount = 1;
            sAppState = 2;
            MTGuardLog.setLogan("onActivityResumed: sync state");
            notifyChange();
        }
        MTGuardLog.setLogan("onActivityResumed: " + activity.getClass().getName() + ", " + sCount + ", state " + sAppState);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66953fa4ae6d8552bacdb15263e3f0ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66953fa4ae6d8552bacdb15263e3f0ef");
            return;
        }
        if (sCount <= 0) {
            sCount = 1;
        } else {
            sCount++;
        }
        if (sCount == 1) {
            sAppState = 2;
            notifyChange();
        }
        MTGuardLog.setLogan("onActivityStarted: " + activity.getClass().getName() + ", " + sCount + ", state " + sAppState);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03eebc950770a7da660f6ba9eb1df844", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03eebc950770a7da660f6ba9eb1df844");
            return;
        }
        if (sCount <= 0) {
            sCount = 0;
        } else {
            sCount--;
        }
        if (sCount == 0) {
            sAppState = 1;
            notifyChange();
        }
        MTGuardLog.setLogan("onActivityStopped: " + activity.getClass().getName() + ", " + sCount + ", state " + sAppState);
    }
}
