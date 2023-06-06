package com.meituan.android.privacy.proxy;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@RequiresApi(api = 21)
/* loaded from: classes3.dex */
public final class f implements com.meituan.android.privacy.interfaces.m {
    public static ChangeQuickRedirect a;
    BluetoothLeScanner b;
    private final u c;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22599987825040c8a20d57edd637cd8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22599987825040c8a20d57edd637cd8d");
            return;
        }
        this.c = new u();
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (Build.VERSION.SDK_INT >= 21) {
                this.b = defaultAdapter.getBluetoothLeScanner();
            }
        } catch (Exception e) {
            Log.e("MtBluetoothLeScrImpl2", e.toString());
        }
    }

    @Override // com.meituan.android.privacy.interfaces.m
    @SuppressLint({"MissingPermission"})
    public final void a(String str, final List<ScanFilter> list, final ScanSettings scanSettings, final ScanCallback scanCallback) {
        Object[] objArr = {str, list, scanSettings, scanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c0ae7866d529be9c48229ceed3325e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c0ae7866d529be9c48229ceed3325e");
        } else if (this.b != null) {
            this.c.a("bluetoothlescanner.startScan_LSS", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, PermissionGuard.PERMISSION_BLUETOOTH, "Locate.once"}, new u.a<Object>() { // from class: com.meituan.android.privacy.proxy.f.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final Object a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24af4614e0a6cc6d9e6f9b5e577d9917", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24af4614e0a6cc6d9e6f9b5e577d9917");
                    }
                    f.this.b.startScan(list, scanSettings, scanCallback);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.m
    @SuppressLint({"MissingPermission"})
    public final void a(String str, final ScanCallback scanCallback) {
        Object[] objArr = {str, scanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1bd0f350a2914640f359b6a32bf7828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1bd0f350a2914640f359b6a32bf7828");
        } else if (this.b != null) {
            this.c.a("bluetoothlescanner.stopScan_S", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN}, new u.a<Object>() { // from class: com.meituan.android.privacy.proxy.f.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final Object a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50baceb4ee7db723b1e521ce28fb86e8", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50baceb4ee7db723b1e521ce28fb86e8");
                    }
                    f.this.b.stopScan(scanCallback);
                    return null;
                }
            }, false);
        }
    }
}
