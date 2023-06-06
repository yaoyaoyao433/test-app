package com.meituan.android.privacy.aop;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile MtTelephonyManager b;

    public static String a(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1f91ce75d39e556c9b71d26db6bca01", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1f91ce75d39e556c9b71d26db6bca01") : b() == null ? "" : b().getDeviceId();
    }

    @RequiresApi(api = 23)
    public static String a(TelephonyManager telephonyManager, int i) {
        Object[] objArr = {telephonyManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c36d40dd10f0f9edbf8e7206c61f46ad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c36d40dd10f0f9edbf8e7206c61f46ad") : b() == null ? "" : b().getDeviceId(i);
    }

    @RequiresApi(api = 26)
    public static String b(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "538c200204b46e57e0b128be31065e95", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "538c200204b46e57e0b128be31065e95") : b() == null ? "" : b().getImei();
    }

    @RequiresApi(api = 26)
    public static String c(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08e64b7602e15f14517559295df411dd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08e64b7602e15f14517559295df411dd") : b() == null ? "" : b().getMeid();
    }

    public static String d(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5f50ccf6c65d24a52cc07db31abe95f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5f50ccf6c65d24a52cc07db31abe95f") : b() == null ? "" : b().getSimSerialNumber();
    }

    public static String e(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fc4cc604dc59b9c1e711281e2f46b24", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fc4cc604dc59b9c1e711281e2f46b24") : b() == null ? "" : b().getSubscriberId();
    }

    public static String f(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f3efb6e9174dfb86f3eb6fbaf2c1f7b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f3efb6e9174dfb86f3eb6fbaf2c1f7b") : b() == null ? "" : b().getSimOperator();
    }

    public static String g(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0adbdfc6f4900445b59242662f0b1b05", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0adbdfc6f4900445b59242662f0b1b05") : b() == null ? "" : b().getLine1Number();
    }

    @RequiresApi(api = 26)
    public static ServiceState h(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "561c1d6476fceb8acfb035047ae8a208", RobustBitConfig.DEFAULT_VALUE)) {
            return (ServiceState) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "561c1d6476fceb8acfb035047ae8a208");
        }
        if (b() == null) {
            return null;
        }
        return b().getServiceState();
    }

    public static List<CellInfo> i(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7f7888c7af8a98a75ef276dccb408d0", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7f7888c7af8a98a75ef276dccb408d0") : b() == null ? new ArrayList() : b().getAllCellInfo();
    }

    public static CellLocation j(TelephonyManager telephonyManager) {
        Object[] objArr = {telephonyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbe53600dc5949120be79b2df5db71ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbe53600dc5949120be79b2df5db71ca");
        }
        if (b() == null) {
            return null;
        }
        return b().getCellLocation();
    }

    @RequiresApi(api = 29)
    public static void a(TelephonyManager telephonyManager, @NonNull Executor executor, @NonNull TelephonyManager.CellInfoCallback cellInfoCallback) {
        Object[] objArr = {telephonyManager, executor, cellInfoCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57a0395f88e1e507459a6da22b2a9c7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57a0395f88e1e507459a6da22b2a9c7a");
        } else if (b() != null) {
            b().requestCellInfoUpdate(executor, cellInfoCallback);
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40676a31c95ee3876882c2afedad70c4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40676a31c95ee3876882c2afedad70c4") : b() == null ? "" : b().getSerial();
    }

    private static MtTelephonyManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18254e2d1babb9b4d152e3cb436581c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtTelephonyManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18254e2d1babb9b4d152e3cb436581c5");
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    if (com.meituan.android.privacy.impl.d.a() == null) {
                        return null;
                    }
                    b = Privacy.createTelephonyManager(com.meituan.android.privacy.impl.d.a(), "privacy-hook");
                }
            }
        }
        return b;
    }
}
