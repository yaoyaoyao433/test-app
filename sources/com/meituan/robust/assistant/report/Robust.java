package com.meituan.robust.assistant.report;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.meituan.robust.assistant.OkHttpUtils;
import com.meituan.robust.resource.util.ProcessUtil;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Robust {
    private static final int ACTIVITY_LIFE_CYCLE_CALL_BACKS_REGISTER_TIMES_LIMIT = 1;
    private static final String LAST_HOTFIX_FROM_APPLICATION_TIME = "last_hotfix_from_application_time";
    private static final String ROBUST_SP = "robust_sp";
    private static RobustParamsProvider robustParamsProvider;
    private static AtomicInteger activityLifecycleCallbacksRegisterTimes = new AtomicInteger(0);
    private static long lastHotfixFromNetTime = 0;
    private static long HOTFIX_FROM_NET_TIME_INTERVAL = 600000;
    private static long HOTFIX_FROM_APPLICATION_NET_TIME_INTERVAL = 120000;

    private Robust() {
    }

    public static void init(Context context, RobustParamsProvider robustParamsProvider2) {
        robustParamsProvider = robustParamsProvider2;
        OkHttpUtils.initHttpDns(context);
        initHotfixFromLocal(context);
        initHotfixFromNet(context);
    }

    public static void retry(Context context) {
        initHotfixFromLocal(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RobustParamsProvider getRobustParamsProvider() {
        return robustParamsProvider;
    }

    private static void initHotfixFromLocal(Context context) {
        if (context == null) {
            return;
        }
        try {
            PatchUtils.applyPatchInLocal(context.getApplicationContext(), "", "", "", 0L, "");
        } catch (Throwable unused) {
        }
    }

    private static synchronized boolean isNeedRegisterActivityLifecycleCallbacks() {
        synchronized (Robust.class) {
            return activityLifecycleCallbacksRegisterTimes.addAndGet(1) <= 1;
        }
    }

    private static void initHotfixFromNet(Context context) {
        if (context != null && ProcessUtil.isMainProcess(context)) {
            if (isNeedRegisterActivityLifecycleCallbacks()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    if (isNeedHotfixFromApplication(context)) {
                        doHotfixFromNet(context);
                    }
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(new HotifxActivityLifecycleCallbacks(context));
                }
            }
            Interact.initInteract(context.getApplicationContext());
        }
    }

    private static synchronized boolean isNeedHotfixFromNet() {
        synchronized (Robust.class) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - lastHotfixFromNetTime >= HOTFIX_FROM_NET_TIME_INTERVAL) {
                lastHotfixFromNetTime = currentTimeMillis;
                return true;
            }
            return false;
        }
    }

    private static synchronized boolean isNeedHotfixFromApplication(Context context) {
        synchronized (Robust.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(ROBUST_SP, 4);
            long j = sharedPreferences.getLong(LAST_HOTFIX_FROM_APPLICATION_TIME, 0L);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j >= HOTFIX_FROM_APPLICATION_NET_TIME_INTERVAL) {
                sharedPreferences.edit().putLong(LAST_HOTFIX_FROM_APPLICATION_TIME, currentTimeMillis).apply();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doHotfixFromNet(final Context context) {
        if (isNeedHotfixFromNet()) {
            new Thread(new Runnable() { // from class: com.meituan.robust.assistant.report.Robust.1
                /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: Throwable -> 0x005e, TryCatch #2 {Throwable -> 0x005e, blocks: (B:3:0x0002, B:14:0x0042, B:16:0x004c, B:17:0x0055), top: B:29:0x0002 }] */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[Catch: Throwable -> 0x005e, TRY_LEAVE, TryCatch #2 {Throwable -> 0x005e, blocks: (B:3:0x0002, B:14:0x0042, B:16:0x004c, B:17:0x0055), top: B:29:0x0002 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r14 = this;
                        r0 = 0
                        java.lang.String r2 = ""
                        java.lang.String r3 = ""
                        java.lang.String r4 = ""
                        com.meituan.robust.assistant.report.RobustParamsProvider r5 = com.meituan.robust.assistant.report.Robust.access$000()     // Catch: java.lang.Throwable -> L5e
                        if (r5 == 0) goto L3e
                        com.meituan.robust.assistant.report.RobustParamsProvider r5 = com.meituan.robust.assistant.report.Robust.access$000()     // Catch: java.lang.Throwable -> L19
                        android.content.Context r6 = r1     // Catch: java.lang.Throwable -> L19
                        long r5 = r5.getUserID(r6)     // Catch: java.lang.Throwable -> L19
                        r0 = r5
                    L19:
                        com.meituan.robust.assistant.report.RobustParamsProvider r5 = com.meituan.robust.assistant.report.Robust.access$000()     // Catch: java.lang.Throwable -> L24
                        android.content.Context r6 = r1     // Catch: java.lang.Throwable -> L24
                        java.lang.String r5 = r5.getVersionName(r6)     // Catch: java.lang.Throwable -> L24
                        r2 = r5
                    L24:
                        com.meituan.robust.assistant.report.RobustParamsProvider r5 = com.meituan.robust.assistant.report.Robust.access$000()     // Catch: java.lang.Throwable -> L2f
                        android.content.Context r6 = r1     // Catch: java.lang.Throwable -> L2f
                        java.lang.String r5 = r5.getChannel(r6)     // Catch: java.lang.Throwable -> L2f
                        r3 = r5
                    L2f:
                        com.meituan.robust.assistant.report.RobustParamsProvider r5 = com.meituan.robust.assistant.report.Robust.access$000()     // Catch: java.lang.Throwable -> L3e
                        android.content.Context r6 = r1     // Catch: java.lang.Throwable -> L3e
                        java.lang.String r5 = r5.getUUID(r6)     // Catch: java.lang.Throwable -> L3e
                        r10 = r0
                        r8 = r2
                        r9 = r3
                        r12 = r5
                        goto L42
                    L3e:
                        r10 = r0
                        r8 = r2
                        r9 = r3
                        r12 = r4
                    L42:
                        com.meituan.robust.assistant.report.RobustParamsProvider r0 = com.meituan.robust.assistant.report.Robust.access$000()     // Catch: java.lang.Throwable -> L5e
                        com.meituan.robust.RobustCallBack r13 = r0.getRobustCallBack()     // Catch: java.lang.Throwable -> L5e
                        if (r13 != 0) goto L55
                        android.content.Context r6 = r1     // Catch: java.lang.Throwable -> L5e
                        java.lang.String r7 = "group"
                        com.meituan.robust.assistant.report.PatchUtils.applyPatch(r6, r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L5e
                        goto L5e
                    L55:
                        android.content.Context r6 = r1     // Catch: java.lang.Throwable -> L5e
                        java.lang.String r7 = "group"
                        com.meituan.robust.assistant.PatchUtils.applyPatch(r6, r7, r8, r9, r10, r12, r13)     // Catch: java.lang.Throwable -> L5e
                        return
                    L5e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.robust.assistant.report.Robust.AnonymousClass1.run():void");
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class HotifxActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private Context context;

        public HotifxActivityLifecycleCallbacks(Context context) {
            this.context = context.getApplicationContext();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Robust.doHotfixFromNet(this.context);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Robust.doHotfixFromNet(this.context);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Robust.doHotfixFromNet(this.context);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Robust.doHotfixFromNet(this.context);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Robust.doHotfixFromNet(this.context);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Robust.doHotfixFromNet(this.context);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Robust.doHotfixFromNet(this.context);
        }
    }
}
