package com.dianping.titans.ble;

import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.LocationManagerProvider;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BlueToothProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isLocationServiceEnable(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "46fc3cf0dc28900441b0d1d13b950ce3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "46fc3cf0dc28900441b0d1d13b950ce3")).booleanValue() : LocationManagerProvider.isLocationServiceEnable(context, str, false);
    }

    public static boolean hasBLESystemFeature(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97dd84176494ed48a522408bdf9107b9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97dd84176494ed48a522408bdf9107b9")).booleanValue() : context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static boolean isBluetoothServiceEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85c703d24f59dd80fab04abdbaba4667", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85c703d24f59dd80fab04abdbaba4667")).booleanValue();
        }
        MtBluetoothAdapter createBluetoothAdapter = Privacy.createBluetoothAdapter(str);
        return createBluetoothAdapter != null && createBluetoothAdapter.isEnabled();
    }

    public static boolean isSupportBleAdvertising(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30bc196e0321bffdbfc5c37d9701b2f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30bc196e0321bffdbfc5c37d9701b2f2")).booleanValue();
        }
        MtBluetoothAdapter createBluetoothAdapter = Privacy.createBluetoothAdapter(str);
        return (createBluetoothAdapter == null || createBluetoothAdapter.getBluetoothLeAdvertiser() == null) ? false : true;
    }

    public static boolean isSupportBleScan(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72249537c593f509900cc726e234daf0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72249537c593f509900cc726e234daf0")).booleanValue();
        }
        return (Privacy.createBluetoothAdapter(str) == null || Privacy.createBluetoothLeScanner(str) == null) ? false : true;
    }

    public static void stopScan(ScanCallback scanCallback, String str) {
        Object[] objArr = {scanCallback, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e14fae697aedeabc7fb06dec6bb3c16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e14fae697aedeabc7fb06dec6bb3c16");
            return;
        }
        l createBluetoothLeScanner = Privacy.createBluetoothLeScanner(str);
        if (createBluetoothLeScanner != null) {
            createBluetoothLeScanner.a(scanCallback);
        }
    }

    @RequiresApi(api = 21)
    public static void startScan(ScanCallback scanCallback, String str) {
        Object[] objArr = {scanCallback, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b0ddab34b34158280d1cb8bfca6b94f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b0ddab34b34158280d1cb8bfca6b94f");
            return;
        }
        l createBluetoothLeScanner = Privacy.createBluetoothLeScanner(str);
        ScanSettings.Builder builder = new ScanSettings.Builder();
        builder.setScanMode(2);
        if (Build.VERSION.SDK_INT >= 23) {
            builder.setMatchMode(1);
            builder.setCallbackType(1);
        }
        createBluetoothLeScanner.a(new ArrayList(), builder.build(), scanCallback);
    }

    @RequiresApi(api = 21)
    public static synchronized BluetoothLeAdvertiser getBluetoothLeAdvertiser(Context context, String str) {
        MtBluetoothAdapter createBluetoothAdapter;
        synchronized (BlueToothProvider.class) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89735e8b74c3cc1bb63def899f3f127d", RobustBitConfig.DEFAULT_VALUE)) {
                return (BluetoothLeAdvertiser) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89735e8b74c3cc1bb63def899f3f127d");
            }
            MtBluetoothAdapter createBluetoothAdapter2 = Privacy.createBluetoothAdapter(str);
            BluetoothLeAdvertiser bluetoothLeAdvertiser = createBluetoothAdapter2 != null ? createBluetoothAdapter2.getBluetoothLeAdvertiser() : null;
            if (bluetoothLeAdvertiser == null && (createBluetoothAdapter = Privacy.createBluetoothAdapter(str)) != null) {
                bluetoothLeAdvertiser = createBluetoothAdapter.getBluetoothLeAdvertiser();
            }
            return bluetoothLeAdvertiser;
        }
    }
}
