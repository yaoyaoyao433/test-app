package com.sankuai.meituan.location.collector.utils;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* loaded from: classes4.dex */
public final class m {
    public static ChangeQuickRedirect a;

    public static String a(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bbb027e301658a285ff26ebe68b9e6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bbb027e301658a285ff26ebe68b9e6e");
        }
        try {
            Object a2 = i.a(wifiInfo, "getWifiSsid", new Object[0]);
            if (a2 != null) {
                return a(a2);
            }
        } catch (Exception unused) {
        }
        return wifiInfo.getSSID();
    }

    private static String a(Object obj) throws Exception {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe783530228e2ca43a8e4f9bae2c33db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe783530228e2ca43a8e4f9bae2c33db");
        }
        if (obj != null) {
            byte[] bArr = (byte[]) i.a(obj, "getOctets", new Object[0]);
            return new String(bArr, b.a(bArr, bArr.length));
        }
        throw new Exception();
    }

    public static String a(ScanResult scanResult) {
        Object obj;
        Object[] objArr = {scanResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87cd83be497651dca04355ab666713f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87cd83be497651dca04355ab666713f0");
        }
        try {
            Object[] objArr2 = {scanResult, "wifiSsid"};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5b5a35e36f1bc03ba1c0cdd68486445e", RobustBitConfig.DEFAULT_VALUE)) {
                obj = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5b5a35e36f1bc03ba1c0cdd68486445e");
            } else {
                Field declaredField = scanResult.getClass().getDeclaredField("wifiSsid");
                declaredField.setAccessible(true);
                obj = declaredField.get(scanResult);
            }
            if (obj != null) {
                return a(obj);
            }
        } catch (Exception unused) {
        }
        return scanResult.SSID;
    }
}
