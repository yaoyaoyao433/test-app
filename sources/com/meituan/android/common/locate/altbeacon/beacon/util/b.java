package com.meituan.android.common.locate.altbeacon.beacon.util;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.locate.altbeacon.beacon.a;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b518c22350c89a28c1add6b38227eaa3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b518c22350c89a28c1add6b38227eaa3")).intValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return 1;
        }
        if (context.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            if (Privacy.createBluetoothAdapter("pt-c140c5921e4d3392").getBluetoothLeAdvertiser() == null) {
                return !((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isMultipleAdvertisementSupported() ? 5 : 4;
            }
            return 0;
        }
        return 2;
    }

    public static com.meituan.android.common.locate.altbeacon.beacon.a a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6633b069ffdc012ed764b76136d73a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.common.locate.altbeacon.beacon.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6633b069ffdc012ed764b76136d73a2");
        }
        if (obj instanceof com.meituan.android.common.locate.altbeacon.beacon.bean.a) {
            com.meituan.android.common.locate.altbeacon.beacon.bean.a aVar = (com.meituan.android.common.locate.altbeacon.beacon.bean.a) obj;
            if (TextUtils.isEmpty(aVar.a) || aVar.b > 65535 || aVar.c > 65535 || aVar.b < 0 || aVar.c < 0) {
                return null;
            }
            return new a.C0206a().a(aVar.a).b(String.valueOf(aVar.b)).c(String.valueOf(aVar.c)).b(76).a(-65).a(Arrays.asList(0L)).a();
        }
        return null;
    }

    @TargetApi(21)
    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a3fa37c991d3cd588651e3fdd30c28d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a3fa37c991d3cd588651e3fdd30c28d")).booleanValue();
        }
        MtBluetoothAdapter createBluetoothAdapter = Privacy.createBluetoothAdapter("pt-c140c5921e4d3392");
        return createBluetoothAdapter != null && createBluetoothAdapter.isEnabled();
    }
}
