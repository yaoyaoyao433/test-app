package com.meituan.mmp.lib.router;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.mmp.lib.AppBrandHeraActivity;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.engine.MMPHornPreloadConfig;
import com.meituan.mmp.lib.mp.GlobalEngineMonitor;
import com.meituan.mmp.lib.mp.a;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.mmp.lib.router.AppBrandMonitor;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.h;
import com.meituan.mmp.lib.utils.z;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AppBrandRouterCenter {
    @Keep
    public static AppBrandRouterCenter INSTANCE = new AppBrandRouterCenter();
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(@Nullable com.meituan.mmp.lib.router.a aVar);
    }

    public static com.meituan.mmp.lib.router.a a(Activity activity) {
        ComponentName component;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47a706116440bf9c099e8a86bdf8151b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.router.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47a706116440bf9c099e8a86bdf8151b");
        }
        ActivityManager activityManager = (ActivityManager) MMPEnvHelper.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (Build.VERSION.SDK_INT >= 21) {
            for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                if (taskInfo.id == activity.getTaskId() && (component = taskInfo.baseIntent.getComponent()) != null) {
                    com.meituan.mmp.lib.router.a a2 = com.meituan.mmp.lib.router.a.a(component.getClassName());
                    return a2 != null ? a2 : com.meituan.mmp.lib.router.a.OTHER;
                }
            }
        }
        com.meituan.mmp.lib.trace.b.e("findTaskForActivity: task not found, for " + activity.getClass());
        return com.meituan.mmp.lib.router.a.OTHER;
    }

    public static void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cad3def52eac64a39ee254ffa170b637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cad3def52eac64a39ee254ffa170b637");
            return;
        }
        List<com.meituan.mmp.lib.router.a> a2 = AppBrandMonitor.e.a();
        a(a2.isEmpty() ? null : a2.get(a2.size() - 1));
    }

    public static void a(@Nullable com.meituan.mmp.lib.router.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb5810e0ad73573caa1a61f2f4c911bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb5810e0ad73573caa1a61f2f4c911bf");
            return;
        }
        StringBuilder sb = new StringBuilder("killAllAppBrand");
        sb.append(aVar == null ? "" : " except " + aVar.name());
        com.meituan.mmp.lib.trace.b.c(sb.toString());
        synchronized (AppBrandMonitor.e.b) {
            for (AppBrandMonitor.ActivityRecord activityRecord : AppBrandMonitor.e.b) {
                if (aVar == null || activityRecord.e != aVar) {
                    HeraActivity heraActivity = activityRecord.h.get();
                    if ((heraActivity instanceof AppBrandHeraActivity) && !heraActivity.isFinishing()) {
                        heraActivity.finish();
                        com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "killAllAppBrandExcept exit");
                    }
                }
            }
        }
        if (com.meituan.mmp.lib.mp.a.f()) {
            for (com.meituan.mmp.lib.mp.a aVar2 : com.meituan.mmp.lib.mp.b.a()) {
                if (aVar2 != com.meituan.mmp.lib.mp.a.MAIN) {
                    ((a) IPCInvoke.a(b.class, aVar2)).a(aVar);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.lib.router.AppBrandRouterCenter.a
        public final void a(@Nullable com.meituan.mmp.lib.router.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73579d2af7c9ad1aff340d0a9bab167", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73579d2af7c9ad1aff340d0a9bab167");
            } else {
                AppBrandRouterCenter.a(aVar);
            }
        }
    }

    public static void a(String str, Class<? extends HeraActivity> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c0028e725ad8c75af4bf4c361e17b0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c0028e725ad8c75af4bf4c361e17b0e");
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                ab.a("getAppTasks");
                List<ActivityManager.AppTask> appTasks = ((ActivityManager) MMPEnvHelper.getEnvInfo().getApplicationContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getAppTasks();
                ab.a();
                for (ActivityManager.AppTask appTask : appTasks) {
                    ab.a("getTaskInfo");
                    ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                    ab.a();
                    com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", taskInfo.baseActivity + ", " + taskInfo.baseIntent);
                    if (TextUtils.equals(str, z.b(taskInfo.baseIntent, "appId")) && (taskInfo.baseActivity == null || com.meituan.mmp.lib.a.class.isAssignableFrom(Class.forName(taskInfo.baseActivity.getClassName())))) {
                        ComponentName component = taskInfo.baseIntent.getComponent();
                        if (!cls.getName().equals(component != null ? component.getClassName() : null)) {
                            b.a.a("AppBrandRouterCenter", "finishing same app id task: " + taskInfo);
                            appTask.finishAndRemoveTask();
                        }
                    }
                }
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a(e);
            }
        }
    }

    public static void a(Class<? extends d> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe65a7d29b3b14517029765395ec0a26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe65a7d29b3b14517029765395ec0a26");
            return;
        }
        com.meituan.mmp.lib.router.b appBrandTaskSwitcher = MMPEnvHelper.getAppBrandTaskSwitcher();
        if (appBrandTaskSwitcher != null) {
            appBrandTaskSwitcher.a(AppBrandMonitor.e.a(cls));
        }
    }

    public static Class<? extends HeraActivity> a(String str, boolean z, boolean z2, boolean z3) {
        boolean c;
        boolean z4;
        com.meituan.mmp.lib.mp.a aVar;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4eeebbdc8f7e3f3b6a2a5dbc4cfc7af", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4eeebbdc8f7e3f3b6a2a5dbc4cfc7af");
        }
        if (MMPHornPreloadConfig.j()) {
            c = (z3 || com.meituan.mmp.lib.config.b.d(str)) ? com.meituan.mmp.lib.config.b.c(str) : false;
        } else {
            c = com.meituan.mmp.lib.config.b.c(str);
        }
        if (z && z2) {
            com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "multiAppBrand override by fusionMode");
            z4 = false;
        } else {
            z4 = z2 ? 1 : 0;
        }
        if (AppBrandMonitor.e.c(str) == null) {
            AppBrandMonitor.ActivityRecord b2 = AppBrandMonitor.e.b(str);
            if (b2 != null) {
                com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "chooseActivity: found living activity instance: " + b2.d.getSimpleName());
                return b2.d;
            }
        } else {
            com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "chooseActivity: found living widget instance");
        }
        GlobalEngineMonitor.AppEngineRecord b3 = GlobalEngineMonitor.a().b(str);
        if (b3 != null) {
            com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "chooseActivity: found living engine in process " + b3.d);
            aVar = b3.d;
        } else {
            aVar = null;
        }
        com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "chooseActivity: preferFusionMode: " + z);
        if (aVar != null) {
            c = aVar != com.meituan.mmp.lib.mp.a.MAIN;
        } else {
            com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "chooseActivity: isMultiProcess by config: " + c);
            if (z || !z4) {
                StringBuilder sb = new StringBuilder("chooseActivity: standard mode");
                sb.append(z ? ", fusion mode" : "");
                sb.append(c ? ", multiProcess" : "");
                com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", sb.toString());
                if (c) {
                    aVar = com.meituan.mmp.lib.mp.a.STANDARD;
                } else {
                    aVar = com.meituan.mmp.lib.mp.a.MAIN;
                }
            } else if (!c) {
                aVar = com.meituan.mmp.lib.mp.a.MAIN;
            }
        }
        if (aVar != null) {
            switch (aVar) {
                case STANDARD:
                    return com.meituan.mmp.lib.router.a.OTHER.a(true);
                case TASK_1:
                case TASK_2:
                case TASK_3:
                    return com.meituan.mmp.lib.router.a.a(aVar);
                default:
                    if (!z4) {
                        return com.meituan.mmp.lib.router.a.OTHER.a(false);
                    }
                    break;
            }
        }
        List<com.meituan.mmp.lib.router.a> c2 = AppBrandMonitor.e.c();
        if (c2.size() == 0) {
            com.meituan.mmp.lib.router.a b4 = AppBrandMonitor.e.b();
            if (b4 != null) {
                StringBuilder sb2 = new StringBuilder("chooseActivity: choose by lru task ");
                sb2.append(b4);
                sb2.append(c ? ", multi process" : "");
                com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", sb2.toString());
                return b4.a(c);
            }
        } else if (c2.size() == 1) {
            com.meituan.mmp.lib.router.a aVar2 = c2.get(0);
            StringBuilder sb3 = new StringBuilder("chooseActivity: choose by only one not used task ");
            sb3.append(aVar2);
            sb3.append(c ? ", multi process" : "");
            com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", sb3.toString());
            return aVar2.a(c);
        }
        if (!c) {
            com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "chooseActivity: main process, multiple not used task: " + c2);
            return c2.get(0).a(false);
        }
        com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "chooseActivity: multi-process, multiple not used task: " + c2);
        HashSet hashSet = new HashSet();
        for (com.meituan.mmp.lib.router.a aVar3 : c2) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.router.a.a;
            hashSet.add(PatchProxy.isSupport(objArr2, aVar3, changeQuickRedirect2, false, "09d034a3d4e9410e58839b4fa521c29d", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.mp.a) PatchProxy.accessDispatch(objArr2, aVar3, changeQuickRedirect2, false, "09d034a3d4e9410e58839b4fa521c29d") : com.meituan.mmp.lib.router.a.a(aVar3.a(true)));
        }
        Map<a.EnumC0420a, Set<com.meituan.mmp.lib.mp.a>> a2 = com.meituan.mmp.lib.mp.a.a(hashSet);
        for (a.EnumC0420a enumC0420a : h.a(a.EnumC0420a.EMPTY, a.EnumC0420a.NOT_RUNNING, a.EnumC0420a.ENGINE_ONLY, a.EnumC0420a.ACTIVITY_RUNNING)) {
            Set<com.meituan.mmp.lib.mp.a> set = a2.get(enumC0420a);
            if (!set.isEmpty()) {
                com.meituan.mmp.lib.mp.a aVar4 = com.meituan.mmp.lib.router.a.a(set).get(0);
                com.meituan.mmp.lib.trace.b.b("AppBrandRouterCenter", "chooseActivity: choose process " + aVar4 + " by state " + enumC0420a);
                return com.meituan.mmp.lib.router.a.a(aVar4);
            }
        }
        return null;
    }
}
