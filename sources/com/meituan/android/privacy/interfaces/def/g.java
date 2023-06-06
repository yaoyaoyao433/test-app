package com.meituan.android.privacy.interfaces.def;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements com.meituan.android.privacy.interfaces.m {
    public static ChangeQuickRedirect a;
    private BluetoothLeScanner b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25dabb1e76490d376c41df5a1cc1ddcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25dabb1e76490d376c41df5a1cc1ddcc");
            return;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (Build.VERSION.SDK_INT >= 21) {
                this.b = defaultAdapter.getBluetoothLeScanner();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.meituan.android.privacy.interfaces.m
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    public final void a(String str, List<ScanFilter> list, ScanSettings scanSettings, ScanCallback scanCallback) {
        Object[] objArr = {str, list, scanSettings, scanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bfe77274302f5265975240ca6df1c6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bfe77274302f5265975240ca6df1c6d");
        } else if (this.b != null) {
            this.b.startScan(list, scanSettings, scanCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.m
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    public final void a(String str, ScanCallback scanCallback) {
        Object[] objArr = {str, scanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1062dc7c763dd09c97d7100fa05e3fe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1062dc7c763dd09c97d7100fa05e3fe8");
        } else if (this.b != null) {
            this.b.stopScan(scanCallback);
        }
    }
}
