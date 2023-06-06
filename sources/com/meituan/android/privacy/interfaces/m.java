package com.meituan.android.privacy.interfaces;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface m {
    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    void a(String str, ScanCallback scanCallback);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, "Locate.once"})
    void a(String str, List<ScanFilter> list, ScanSettings scanSettings, ScanCallback scanCallback);
}
