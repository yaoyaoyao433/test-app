package com.sankuai.meituan.mapsdk.mapcore.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    private static String a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d06a4126d269caa4e0acf641c9973b06", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d06a4126d269caa4e0acf641c9973b06");
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String valueOf = String.valueOf((int) (d * Math.pow(10.0d, 6.0d)));
        if (valueOf.startsWith(CommonConstant.Symbol.MINUS)) {
            sb.append(CommonConstant.Symbol.MINUS);
            valueOf = valueOf.substring(1);
        }
        char[] charArray = valueOf.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < (length + 1) / 2; i++) {
            int i2 = i * 2;
            if (i2 < length) {
                sb.append((char) (Integer.parseInt(String.valueOf(charArray[i2])) + 97));
            }
            int i3 = i2 + 1;
            if (i3 < length) {
                sb2.append((char) (Integer.parseInt(String.valueOf(charArray[i3])) + 104));
            }
        }
        sb.append((CharSequence) sb2);
        return sb.toString();
    }

    public static String a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fe63c8f4c16a562b5a7106c5a179a92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fe63c8f4c16a562b5a7106c5a179a92");
        }
        if (latLng == null) {
            return "";
        }
        return a(latLng.latitude) + ", " + a(latLng.longitude);
    }
}
