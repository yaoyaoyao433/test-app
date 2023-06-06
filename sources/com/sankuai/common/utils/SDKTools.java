package com.sankuai.common.utils;

import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SDKTools {
    private static final int SDK_VERSION = Build.VERSION.SDK_INT;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int neighboringCellInfoGetLac(CellInfo cellInfo) {
        int i = 0;
        Object[] objArr = {cellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "280fdc1b3bd7fb11a18f39e380ec3e04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "280fdc1b3bd7fb11a18f39e380ec3e04")).intValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                if (cellInfo instanceof CellInfoGsm) {
                    return ((CellInfoGsm) cellInfo).getCellIdentity().getLac();
                }
                if (cellInfo instanceof CellInfoLte) {
                    return ((CellInfoLte) cellInfo).getCellIdentity().getTac();
                }
                if (Build.VERSION.SDK_INT >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                    return ((CellInfoWcdma) cellInfo).getCellIdentity().getLac();
                }
                if (cellInfo instanceof CellInfoCdma) {
                    i = ((CellInfoCdma) cellInfo).getCellIdentity().getNetworkId();
                }
            }
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int neighboringCellInfoGetCid(CellInfo cellInfo) {
        int i = 0;
        Object[] objArr = {cellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60029ef1c1ba1568148b39576bfb1f98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60029ef1c1ba1568148b39576bfb1f98")).intValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                if (cellInfo instanceof CellInfoGsm) {
                    return ((CellInfoGsm) cellInfo).getCellIdentity().getCid();
                }
                if (cellInfo instanceof CellInfoLte) {
                    return ((CellInfoLte) cellInfo).getCellIdentity().getCi();
                }
                if (Build.VERSION.SDK_INT >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                    return ((CellInfoWcdma) cellInfo).getCellIdentity().getCid();
                }
                if (cellInfo instanceof CellInfoCdma) {
                    i = ((CellInfoCdma) cellInfo).getCellIdentity().getBasestationId();
                }
            }
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int neighboringCellInfoGetRssi(CellInfo cellInfo) {
        int i = 0;
        Object[] objArr = {cellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d7891e35ef181faaf42cf6204632e9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d7891e35ef181faaf42cf6204632e9a")).intValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                if (cellInfo instanceof CellInfoGsm) {
                    return ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
                }
                if (cellInfo instanceof CellInfoLte) {
                    return ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
                }
                if (Build.VERSION.SDK_INT >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                    return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
                }
                if (cellInfo instanceof CellInfoCdma) {
                    i = ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
                }
            }
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getSDKVersion() {
        return SDK_VERSION;
    }
}
