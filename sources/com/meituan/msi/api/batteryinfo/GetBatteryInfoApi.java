package com.meituan.msi.api.batteryinfo;

import android.content.Intent;
import android.content.IntentFilter;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class GetBatteryInfoApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "getBatteryInfo", response = BatteryInfoResponse.class)
    public void getBatteryInfoAsync(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e8278bc481a4279eb7752afc2ef279", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e8278bc481a4279eb7752afc2ef279");
        } else {
            a(msiContext);
        }
    }

    @MsiApiMethod(name = "getBatteryInfoSync", response = BatteryInfoResponse.class)
    public BatteryInfoResponse getBatteryInfoSync(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4ed4f2392eaf38047a9f0bacbe8bc2", RobustBitConfig.DEFAULT_VALUE) ? (BatteryInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4ed4f2392eaf38047a9f0bacbe8bc2") : a(msiContext);
    }

    private BatteryInfoResponse a(MsiContext msiContext) {
        boolean z = true;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4bca9f3d1a4259e448eb9c98f36b96b", RobustBitConfig.DEFAULT_VALUE)) {
            return (BatteryInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4bca9f3d1a4259e448eb9c98f36b96b");
        }
        Intent registerReceiver = a.f().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            msiContext.onError("batteryStatus is null");
            return new BatteryInfoResponse();
        }
        int a2 = f.a(registerReceiver, "status", -1);
        if (a2 != 2 && a2 != 5) {
            z = false;
        }
        int a3 = (int) ((f.a(registerReceiver, "level", -1) / f.a(registerReceiver, "scale", -1)) * 100.0f);
        if (a3 > 100) {
            msiContext.onError("batteryLevel > 100");
            return new BatteryInfoResponse();
        }
        BatteryInfoResponse batteryInfoResponse = new BatteryInfoResponse();
        batteryInfoResponse.level = a3;
        batteryInfoResponse.isCharging = z;
        msiContext.onSuccess(batteryInfoResponse);
        return batteryInfoResponse;
    }
}
