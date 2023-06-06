package com.meituan.ai.speech.base.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\t"}, d2 = {"getPackageName", "", "context", "Landroid/content/Context;", "getUuid", "getVersionName", "isApkInDebug", "", "isAppForeground", "speech-base_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class AppUtilsKt {
    public static ChangeQuickRedirect a;

    @Keep
    public static final boolean isAppForeground(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e5bcd507737ecf7149aa55829174083", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e5bcd507737ecf7149aa55829174083")).booleanValue();
        }
        h.b(context, "context");
        if (Build.VERSION.SDK_INT >= 22) {
            Object systemService = context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (systemService == null) {
                throw new o("null cannot be cast to non-null type android.app.ActivityManager");
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (h.a((Object) runningAppProcessInfo.processName, (Object) context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                    return true;
                }
            }
            return false;
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo2);
        return runningAppProcessInfo2.importance == 100;
    }

    @Keep
    @NotNull
    public static final String getUuid(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57d74ac89441fe4b120e8fc87a2cfafb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57d74ac89441fe4b120e8fc87a2cfafb");
        }
        h.b(context, "context");
        String uuid = GetUUID.getInstance().getUUID(context.getApplicationContext());
        if (TextUtils.isEmpty(uuid)) {
            uuid = UUID.randomUUID().toString();
        }
        h.a((Object) uuid, "uuid");
        return uuid;
    }

    @Keep
    @NotNull
    public static final String getVersionName(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2c04f8362633d6ae259bb5deea312b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2c04f8362633d6ae259bb5deea312b1");
        }
        h.b(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            h.a((Object) packageManager, "context.packageManager");
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            h.a((Object) packageInfo, "packageManager.getPackag…  context.packageName, 0)");
            String str = packageInfo.versionName;
            h.a((Object) str, "packageInfo.versionName");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    @Keep
    @NotNull
    public static final String getPackageName(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b68caebe4c45801d757e9f421f4fc2e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b68caebe4c45801d757e9f421f4fc2e3");
        }
        h.b(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            h.a((Object) packageManager, "context.packageManager");
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            h.a((Object) packageInfo, "packageManager.getPackag…  context.packageName, 0)");
            String str = packageInfo.packageName;
            h.a((Object) str, "packageInfo.packageName");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    @Keep
    public static final boolean isApkInDebug(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da69dd76f977b2ea8252e7069965ac39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da69dd76f977b2ea8252e7069965ac39")).booleanValue();
        }
        h.b(context, "context");
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
