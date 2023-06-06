package com.meituan.android.privacy.aop;

import android.bluetooth.BluetoothAdapter;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile MtBluetoothAdapter b;

    public static String a(BluetoothAdapter bluetoothAdapter) {
        Object[] objArr = {bluetoothAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7cfd400b4d508620918bfb516fbb540", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7cfd400b4d508620918bfb516fbb540") : a() == null ? "" : a().getAddress();
    }

    private static MtBluetoothAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b62051c8341f808b3a233b2de508af1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtBluetoothAdapter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b62051c8341f808b3a233b2de508af1d");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = Privacy.createBluetoothAdapter("privacy-hook");
                }
            }
        }
        return b;
    }
}
