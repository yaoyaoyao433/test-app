package com.meituan.android.privacy.interfaces.def;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f implements com.meituan.android.privacy.interfaces.l {
    public static ChangeQuickRedirect a;
    private BluetoothLeScanner b;

    @RequiresApi(api = 21)
    public f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a602193b57696fea2c5f69c854014296", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a602193b57696fea2c5f69c854014296");
            return;
        }
        try {
            this.b = BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();
        } catch (Exception unused) {
        }
    }

    @Override // com.meituan.android.privacy.interfaces.l
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    public final void a(List<ScanFilter> list, ScanSettings scanSettings, ScanCallback scanCallback) {
        Object[] objArr = {list, scanSettings, scanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8700b5e2980f682589765dfa7a51d6ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8700b5e2980f682589765dfa7a51d6ac");
        } else if (this.b != null) {
            this.b.startScan(list, scanSettings, scanCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.l
    @RequiresApi(api = 21)
    @SuppressLint({"MissingPermission"})
    public final void a(ScanCallback scanCallback) {
        Object[] objArr = {scanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a95f2be6a9d7ffbc61c3d5b40c4bdfdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a95f2be6a9d7ffbc61c3d5b40c4bdfdb");
        } else if (this.b != null) {
            this.b.stopScan(scanCallback);
        }
    }
}
