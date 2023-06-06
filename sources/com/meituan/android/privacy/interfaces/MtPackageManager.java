package com.meituan.android.privacy.interfaces;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MtPackageManager {
    @RequiresPermission(PermissionGuard.PERMISSION_AL)
    @NonNull
    List<ApplicationInfo> getInstalledApplications(int i);

    @RequiresPermission(PermissionGuard.PERMISSION_AL)
    @NonNull
    List<PackageInfo> getInstalledPackages(int i);

    @RequiresPermission(PermissionGuard.PERMISSION_AL)
    @Nullable
    Intent getLaunchIntentForPackage(@NonNull String str);

    @RequiresPermission(PermissionGuard.PERMISSION_AL)
    @NonNull
    List<ResolveInfo> queryIntentActivities(@NonNull Intent intent, int i);

    @RequiresPermission(PermissionGuard.PERMISSION_AL)
    @NonNull
    List<ResolveInfo> queryIntentActivityOptions(@Nullable ComponentName componentName, @Nullable Intent[] intentArr, @NonNull Intent intent, int i);
}
