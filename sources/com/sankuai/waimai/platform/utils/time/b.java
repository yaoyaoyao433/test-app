package com.sankuai.waimai.platform.utils.time;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);

    public static String a(long j) {
        String sb;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ee993b3b707a610a76a2cbc210a0789", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ee993b3b707a610a76a2cbc210a0789");
        }
        if (j <= 0) {
            return "00:00";
        }
        int i = (int) (j / 3600);
        long j2 = j % 3600;
        int i2 = (int) (j2 / 60);
        int i3 = (int) (j2 % 60);
        if (i == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = i / 10 > 0 ? new StringBuilder() : new StringBuilder("0");
            sb2.append(i);
            sb = sb2.toString();
        }
        StringBuilder sb3 = i2 / 10 > 0 ? new StringBuilder() : new StringBuilder("0");
        sb3.append(i2);
        String sb4 = sb3.toString();
        StringBuilder sb5 = i3 / 10 > 0 ? new StringBuilder() : new StringBuilder("0");
        sb5.append(i3);
        String sb6 = sb5.toString();
        if (TextUtils.isEmpty(sb)) {
            return sb4 + CommonConstant.Symbol.COLON + sb6;
        }
        return sb + CommonConstant.Symbol.COLON + sb4 + CommonConstant.Symbol.COLON + sb6;
    }

    public static String[] b(long j) {
        String sb;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76094f008624524e07d3be4ee3af07c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76094f008624524e07d3be4ee3af07c2");
        }
        if (j <= 0) {
            return null;
        }
        int i = (int) (j / 3600);
        long j2 = j % 3600;
        int i2 = (int) (j2 / 60);
        int i3 = (int) (j2 % 60);
        String[] strArr = new String[3];
        if (i == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = i / 10 > 0 ? new StringBuilder() : new StringBuilder("0");
            sb2.append(i);
            sb = sb2.toString();
        }
        strArr[0] = sb;
        StringBuilder sb3 = i2 / 10 > 0 ? new StringBuilder() : new StringBuilder("0");
        sb3.append(i2);
        strArr[1] = sb3.toString();
        StringBuilder sb4 = i3 / 10 > 0 ? new StringBuilder() : new StringBuilder("0");
        sb4.append(i3);
        strArr[2] = sb4.toString();
        return strArr;
    }

    public static String c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a47c8f41a3c24fe36f5ddc1589ab8106", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a47c8f41a3c24fe36f5ddc1589ab8106") : b.format(Long.valueOf(j));
    }

    public static String a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0df81d7ad3d96992d7584ec6daf4179f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0df81d7ad3d96992d7584ec6daf4179f") : new SimpleDateFormat(str).format(new Date(j));
    }
}
