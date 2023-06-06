package com.meituan.android.privacy.interfaces;

import android.app.ActivityManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface i {
    List<ActivityManager.RunningAppProcessInfo> a();

    @RequiresPermission(PermissionGuard.PERMISSION_AL)
    List<ActivityManager.RunningTaskInfo> a(int i);

    List<ActivityManager.RunningServiceInfo> b(int i);
}
