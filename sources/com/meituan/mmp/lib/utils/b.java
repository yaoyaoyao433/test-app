package com.meituan.mmp.lib.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a26df3aade9b9d34f95d180c7dee128c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a26df3aade9b9d34f95d180c7dee128c")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(com.tencent.mapsdk.internal.y.a);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a(e);
            return false;
        }
    }

    @Nullable
    public static Class<? extends Activity> a(Activity activity) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47fc1e753279f63a52d3c812378ad068", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47fc1e753279f63a52d3c812378ad068");
        }
        if (activity == null) {
            return null;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "868f4d27103c43c91b276b537ff51064", RobustBitConfig.DEFAULT_VALUE)) {
            runningTaskInfo = (ActivityManager.RunningTaskInfo) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "868f4d27103c43c91b276b537ff51064");
        } else {
            if (activity != null) {
                int taskId = activity.getTaskId();
                for (ActivityManager.RunningTaskInfo runningTaskInfo2 : Privacy.createActivityManager(MMPEnvHelper.getEnvInfo().getApplicationContext(), ContainerInfo.ENV_MMP).a(10)) {
                    if (runningTaskInfo2.id == taskId) {
                        runningTaskInfo = runningTaskInfo2;
                        break;
                    }
                }
            }
            runningTaskInfo = null;
        }
        if (runningTaskInfo == null) {
            return null;
        }
        try {
            return Class.forName(runningTaskInfo.baseActivity.getClassName());
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a(e);
            return null;
        }
    }

    public static boolean b(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5eb824b012f0355faae3c1ac5608cea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5eb824b012f0355faae3c1ac5608cea")).booleanValue();
        }
        if (activity.getTaskId() == -1) {
            com.meituan.mmp.lib.trace.b.d(activity.getClass().getName(), "illegal task id, quit to avoid crash");
            com.sankuai.meituan.takeoutnew.util.aop.k.b(Process.myPid());
            return true;
        }
        return false;
    }

    public static IBinder c(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acbb05e87cc66fdb7c2a4b86f8b22ea2", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBinder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acbb05e87cc66fdb7c2a4b86f8b22ea2");
        }
        try {
            return activity.getWindow().getDecorView().getWindowToken();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(PackageManager packageManager, Intent intent) {
        ResolveInfo resolveActivity;
        Object[] objArr = {packageManager, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2726e60b9b8bbcd9db8b4cac9136b058", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2726e60b9b8bbcd9db8b4cac9136b058")).booleanValue() : (packageManager == null || (resolveActivity = packageManager.resolveActivity(intent, 65536)) == null || resolveActivity.activityInfo == null) ? false : true;
    }
}
