package com.meituan.android.quickpass.uptsm.common.utils;

import android.os.Build;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.CrashInfo;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bacbb6f6f90f63aca32d403971fd4e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bacbb6f6f90f63aca32d403971fd4e8");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Babel.logRT("quickpass_TSM", str, a(map));
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cc3b2ffb4563ebaf94bf40a8808e3da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cc3b2ffb4563ebaf94bf40a8808e3da");
        } else {
            a(str, (Map<String, Object>) null);
        }
    }

    public static void b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d2eeb9bfcb647b20e66857cf02e0366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d2eeb9bfcb647b20e66857cf02e0366");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Babel.log("quickpass_TSM", str, a(map));
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bad02af55e0a1999ecd9932bbad3050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bad02af55e0a1999ecd9932bbad3050");
        } else {
            b(str, null);
        }
    }

    public static void a(Throwable th, String str) {
        Object[] objArr = {th, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c322d44267e795db7a7b1b98fb6484ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c322d44267e795db7a7b1b98fb6484ee");
        } else {
            Babel.log(th, CrashInfo.newCrashInfo(str, ""));
        }
    }

    private static Map a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c43c6f51c956b48c6f351b34035aadb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c43c6f51c956b48c6f351b34035aadb");
        }
        map.put(DeviceInfo.USER_ID, Long.valueOf(com.dianping.mainboard.a.b().e));
        map.put("unionID", com.dianping.mainboard.a.b().a());
        map.put("dpID", com.dianping.mainboard.a.b().j);
        map.put("app", com.meituan.android.quickpass.uptsm.constant.b.b == null ? "" : com.meituan.android.quickpass.uptsm.constant.b.b.getPackageName());
        map.put("appVersion", com.meituan.android.quickpass.uptsm.constant.b.a);
        map.put(NetLogConstants.Environment.DEVICE_PROVIDER, Build.MODEL);
        map.put("WalletVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.huawei.wallet"));
        map.put("TSMVersion", j.a(com.meituan.android.quickpass.uptsm.constant.b.b, "com.unionpay.tsmservice"));
        return map;
    }
}
