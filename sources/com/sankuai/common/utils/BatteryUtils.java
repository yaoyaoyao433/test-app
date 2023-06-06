package com.sankuai.common.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BatteryUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static float getBatteryPct(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "497e391f4d44e85e35c729ef7cd8f3e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "497e391f4d44e85e35c729ef7cd8f3e3")).floatValue();
        }
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            return f.a(registerReceiver, "level", -1) / f.a(registerReceiver, "scale", -1);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1.0f;
        }
    }
}
