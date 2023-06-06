package com.meituan.robust.resource;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.ResourceConstant;
import com.meituan.robust.resource.apply.RobustLibraryApply;
import com.meituan.robust.resource.apply.RobustResourceApply;
import com.meituan.robust.resource.recover.ApkRecover;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustResources {
    private RobustResources() {
    }

    public static boolean resFix(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (RobustResourcesSwitch.getResourcesSwitch(applicationContext)) {
            if (getRobustAssetsResource(applicationContext)) {
                return true;
            }
            File file = new File(ApkRecover.getRobustResourcesApkPath(applicationContext, str, str2));
            if (file.exists()) {
                if (getRobustAssetsResource(applicationContext)) {
                    return true;
                }
                try {
                    return RobustResourceApply.patchExistingResourcesOnUiThread(applicationContext, file.getAbsolutePath());
                } catch (Throwable th) {
                    th.printStackTrace();
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean libFix(Context context, String str, String str2) {
        File robustResourcesMergeDirLibFile;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (RobustResourcesSwitch.getResourcesSwitch(applicationContext) && (robustResourcesMergeDirLibFile = ApkRecover.getRobustResourcesMergeDirLibFile(applicationContext, str, str2)) != null && robustResourcesMergeDirLibFile.exists() && robustResourcesMergeDirLibFile.isDirectory()) {
            boolean z = false;
            for (String str3 : robustResourcesMergeDirLibFile.list()) {
                if (str3.endsWith(".so")) {
                    z = true;
                }
            }
            if (z) {
                try {
                    return RobustLibraryApply.addNativeLibraryDirectories(null, robustResourcesMergeDirLibFile);
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean getRobustAssetsResource(Context context) {
        try {
            context.getAssets().open(ResourceConstant.ROBUST_RESOURCES_DIFF);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
